package sef.module9.sample;

@SuppressWarnings("rawtypes")
public class Car implements Comparable {

	private String make;
    private int year;
    private int mileage;
    
    public Car(String make, int year, int mileage) {
        
        this.make = make;
        this.year = year;
        this.mileage = mileage;
    }
    
    //Mandatory method when implementing the
    //Comparable interface. In this method we
    //compare the mileage of the two car objects.
    public int compareTo(Object obj) {
        
        if (obj instanceof Car) {
            
            Car car = (Car) obj;
            if (this.mileage > car.getMileage())
                return 1;
            else if (this.mileage < car.getMileage())
                return -1;
        }
        return 0;
    }
    
    public void setMake(String make) {
        this.make = make;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    
    public String getMake() {
        return make;
    }
    
    public int getYear() {
        return year;
    }
    
    public int getMileage() {
        return mileage;
    }
    
    public String toString() {
        
        StringBuffer buffer = new StringBuffer();
        buffer.append("Make: " + make + "\n");
        buffer.append("Year: " + year + "\n");
        buffer.append("Mileage: " + mileage + "\n");
        
        return buffer.toString();
    }
}

