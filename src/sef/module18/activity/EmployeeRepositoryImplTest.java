package sef.module18.activity;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

import java.sql.*;
import java.util.List;

public class EmployeeRepositoryImplTest extends TestCase{
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
public void testFindEmployeeByID(){
        EmployeeRepository employeeRepository=new EmployeeRepositoryImpl(conn);
    try {
        Employee result = employeeRepository.findEmployeeByID(2);

        assertEquals(result.getEmployeeID(), 2);
        assertEquals(result.getFirstName().toUpperCase(), "JANE");
        assertEquals(result.getLastName().toUpperCase(), "DOE");
        assertEquals(result.getProfLevel(), 2);

        assertNull(employeeRepository.findEmployeeByID(-1));
    }
    catch (HRSSystemException e) {
        fail();
    }
}

public void testFindEmployeeByName(){
    EmployeeRepository employeeRepository=new EmployeeRepositoryImpl(conn);
    try {
        List<Employee> results=employeeRepository.findEmployeeByName("J", "DO");
        assertEquals(3, results.size());

        assertEquals(results.get(0).getEmployeeID(), 1);
        assertEquals(results.get(0).getFirstName().toUpperCase(), "JOHN");
        assertEquals(results.get(0).getLastName().toUpperCase(), "DOE");
        assertEquals(results.get(0).getProfLevel(), 1);

        assertEquals(results.get(1).getEmployeeID(), 2);
        assertEquals(results.get(1).getFirstName().toUpperCase(), "JANE");
        assertEquals(results.get(1).getLastName().toUpperCase(), "DOE");
        assertEquals(results.get(1).getProfLevel(), 2);

        assertEquals(results.get(2).getEmployeeID(), 4);
        assertEquals(results.get(2).getFirstName().toUpperCase(), "JAMES");
        assertEquals(results.get(2).getLastName().toUpperCase(), "DONNELL");
        assertEquals(results.get(2).getProfLevel(), 3);

        assertTrue(employeeRepository.findEmployeeByName("J", "DA").isEmpty());
    }
    catch (HRSSystemException e) {
        fail();
    }
}
 public void testFindEmployeeByProfLevel(){
     EmployeeRepository employeeRepository=new EmployeeRepositoryImpl(conn);
     try {
         List<Employee> results=employeeRepository.findEmployeeByProfLevel(1);
         assertEquals(2, results.size());

         assertEquals(results.get(0).getEmployeeID(), 1);
         assertEquals(results.get(0).getFirstName().toUpperCase(), "JOHN");
         assertEquals(results.get(0).getLastName().toUpperCase(), "DOE");
         assertEquals(results.get(0).getProfLevel(), 1);

         assertEquals(results.get(1).getEmployeeID(), 3);
         assertEquals(results.get(1).getFirstName().toUpperCase(), "SCOTT");
         assertEquals(results.get(1).getLastName().toUpperCase(), "FEIST");
         assertEquals(results.get(1).getProfLevel(), 1);

         assertTrue(employeeRepository.findEmployeeByProfLevel(-1).isEmpty());
     }
     catch (HRSSystemException e) {
         fail();
     }
 }

 public void testFindEmployeeByProject(){
     EmployeeRepository employeeRepository=new EmployeeRepositoryImpl(conn);
     try {
         List<Employee> results=employeeRepository.findEmployeeByProject(3);
         assertEquals(2, results.size());

         assertEquals(results.get(0).getEmployeeID(), 2);
         assertEquals(results.get(0).getFirstName().toUpperCase(), "JANE");
         assertEquals(results.get(0).getLastName().toUpperCase(), "DOE");
         assertEquals(results.get(0).getProfLevel(), 2);

         assertEquals(results.get(1).getEmployeeID(), 4);
         assertEquals(results.get(1).getFirstName().toUpperCase(), "JAMES");
         assertEquals(results.get(1).getLastName().toUpperCase(), "DONNELL");
         assertEquals(results.get(1).getProfLevel(), 3);

         assertTrue(employeeRepository.findEmployeeByProject(-1).isEmpty());
     }
     catch (HRSSystemException e) {
         fail();
     }
 }

 public void testInsertEmployee(){
     EmployeeRepository employeeRepository=new EmployeeRepositoryImpl(conn);
     try {
         int result=employeeRepository.insertEmployee(new EmployeeImpl(5,"John","Snow",2));
         PreparedStatement pStmt = conn
                 .prepareStatement("select * from EMPLOYEE where ID = ?");
         pStmt.setInt(1, result);
         ResultSet rs = pStmt.executeQuery();
         if (rs.next()){
             assertEquals(result,rs.getInt(1));
             assertEquals("John",rs.getString(2));
             assertEquals("Snow",rs.getString(3));
             assertEquals(2,rs.getInt(4));
         }
         rs.close();
         pStmt.close();

     }
     catch (HRSSystemException |SQLException e) {
         e.printStackTrace();
         fail();
     }
 }
 public  void testUpdateEmployee(){
     EmployeeRepository employeeRepository=new EmployeeRepositoryImpl(conn);
     try {
         boolean result=employeeRepository.updateEmployee(new EmployeeImpl(5,"Michael","Dorn",5));
         PreparedStatement pStmt = conn
                 .prepareStatement("select * from EMPLOYEE where ID = ?");
         pStmt.setInt(1, 5);
         ResultSet rs = pStmt.executeQuery();
         assertTrue(result);
         if (rs.next()){
             assertEquals(5,rs.getInt(1));
             assertEquals("Michael",rs.getString(2));
             assertEquals("Dorn",rs.getString(3));
             assertEquals(5,rs.getInt(4));
         }
         rs.close();
         pStmt.close();
     }
     catch (HRSSystemException |SQLException e) {
         e.printStackTrace();
         fail();
     }
 }
}
