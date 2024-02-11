// subclass for salaried employee
public class SalariedEmployee extends Employee {
    // instance variables
    private double weeklySalary;

    // constructor
    public SalariedEmployee(String firstName, String lastName, String SSN, double weeklySalary){

        super(firstName, lastName, SSN);
        // check the weekly salary is greater than 0.0
        if(weeklySalary < 0.0){
            throw new IllegalArgumentException("Invalid weekly salary");
        } 
        this.weeklySalary = weeklySalary;
    }

    // method to return weekly salary
    public double getWeeklySalary(){
        return weeklySalary;
    }

    // use earnings method
    public double earnings(){
        return getWeeklySalary() - 500.0;
    }

    // toString method
    public String toString(){
        return String.format("<<Salaried Employee>>%nFirst Name: %s%nLast Name: %s%nSocial Security Number: %s%nWeekly Salary: %.2f", getFirstName(),getLastName(), getSSN(), getWeeklySalary());
    }

    
    /*** try out ***/
    public static void main(String[] args) {
        SalariedEmployee emp1 = new SalariedEmployee("Mei","Hirata", "M-1221-1997", 1030.50);

        System.out.println(emp1.toString());
        System.out.printf("Earnings: %.2f%n", emp1.earnings());
    }
}
