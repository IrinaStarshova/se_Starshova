package sef.module18.activity;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

import java.sql.*;
import java.util.List;

public class ProjectRepositoryImplTest extends TestCase {
    private Connection conn;

    protected void setUp() throws Exception {
        super.setUp();
        String username = "sa";
        String password = "";
        Class.forName("org.h2.Driver");
        String url = "jdbc:h2:~/test";
        conn = DriverManager.getConnection(url, username, password);
        conn.setAutoCommit(false);
        System.out.println("Connection successfully established!");

    }
    protected void tearDown() throws Exception {
        try{
            super.tearDown();
            conn.close();
            System.out.println("Connection closed!");
        } catch (AssertionFailedError e) {
            e.printStackTrace();
        }
    }

    public void testFindProjectByID(){
        ProjectRepository projectRepository=new ProjectRepositoryImpl(conn);
        try {
            Project result = projectRepository.findProjectByID(1);

            assertEquals(result.getProjectID(), 1);
            assertEquals(result.getProjectName(),
                    "Online Insurance System");
            assertEquals(result.getProjectDescription(),
                    "A web application that automates insurance transactions.");

            assertNull(projectRepository.findProjectByID(-1));
        }
        catch (HRSSystemException e) {
            fail();
        }
    }

    public void testFindProjectByName(){
        ProjectRepository projectRepository=new ProjectRepositoryImpl(conn);
        try {
            List<Project> results=projectRepository.findProjectByName("Online");
            assertEquals(2, results.size());

            assertEquals(results.get(0).getProjectID(), 1);
            assertEquals(results.get(0).getProjectName(),
                    "Online Insurance System");
            assertEquals(results.get(0).getProjectDescription(),
                    "A web application that automates insurance transactions.");

            assertEquals(results.get(1).getProjectID(), 4);
            assertEquals(results.get(1).getProjectName(),
                    "Online Shopping System");
            assertEquals(results.get(1).getProjectDescription(),
                    "A web application that handles shopping transactions online.");

            assertTrue(projectRepository.findProjectByName("Some").isEmpty());
        }
        catch (HRSSystemException e) {
            fail();
        }
    }

    public void testFindProjectByEmployee(){
        ProjectRepository projectRepository=new ProjectRepositoryImpl(conn);
        try {
            List<Project> results=projectRepository.findProjectByEmployee(1);
            assertEquals(1, results.size());

            assertEquals(results.get(0).getProjectID(), 1);
            assertEquals(results.get(0).getProjectName(),
                    "Online Insurance System");
            assertEquals(results.get(0).getProjectDescription(),
                    "A web application that automates insurance transactions.");

            assertTrue(projectRepository.findProjectByEmployee(-1).isEmpty());
        }
        catch (HRSSystemException e) {
            e.printStackTrace();
            fail();
        }
    }

    public void testInsertProject(){
        ProjectRepository projectRepository=new ProjectRepositoryImpl(conn);
        try {
            int result=projectRepository.insertProject(new ProjectImpl(1,"Some","Some"));
            PreparedStatement pStmt = conn
                    .prepareStatement("select * from Project where ID = ?");
            pStmt.setInt(1, result);
            ResultSet rs = pStmt.executeQuery();
            if (rs.next()){
                assertEquals(result,rs.getInt(1));
                assertEquals("Some",rs.getString(2));
                assertEquals("Some",rs.getString(3));
            }
            rs.close();
            pStmt.close();

        }
        catch (HRSSystemException | SQLException e) {
            e.printStackTrace();
            fail();
        }
    }

    public void testUpdateProject(){
        ProjectRepository projectRepository=new ProjectRepositoryImpl(conn);
        try {
            boolean result=projectRepository.updateProject(new ProjectImpl(4,
                    "Online Shopping System",
                    "A web application that handles shopping transactions online."));
            PreparedStatement pStmt = conn
                    .prepareStatement("select * from Project where ID = ?");
            pStmt.setInt(1, 4);
            ResultSet rs = pStmt.executeQuery();
            assertTrue(result);
            if (rs.next()){
                assertEquals(4,rs.getInt(1));
                assertEquals("Online Shopping System",rs.getString(2));
                assertEquals("A web application that handles shopping transactions online.",
                        rs.getString(3));
            }
            rs.close();
            pStmt.close();

        }
        catch (HRSSystemException | SQLException e) {
            e.printStackTrace();
            fail();
        }
    }
}
