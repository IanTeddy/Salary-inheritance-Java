//Hourly Employee class 
public class HourlyEmployee extends Employee {
    
    // instance variables
    private double wage;
    private double hours;

    // constructor
    public HourlyEmployee(String firstName, String lastName, String SSN, double wage, double hours){

        super(firstName, lastName, SSN);
        if(wage < 0.0 ){
            throw new IllegalArgumentException("Wage must be greater than 0.0");
        } 
         if(hours < 0.0 || hours > 168.0){
            throw new IllegalArgumentException("Working hour must be greater than 0 and less than 168 hours.");
         }
            this.wage = wage;
            this.hours = hours;
    }

    // Getters
    public double getWage() {
        return wage;
    }

    public double getHours() {
        return hours;
    }
    
    // inherited earnings method
    public double earnings(){
        if(hours < 40){
            return wage * hours;
        } else {
            return wage * 40 + (wage * 1.5) * (hours - 40);
        }
    }

    // toString()
    public String toString(){
        return String.format("<<Hourly Employee>>%nFirst Name: %s%nLast Name: %s%nSocial Security Number: %s%nWage: %.2f%nHours: %.2f", getFirstName(), getLastName(), getSSN(), getWage(), getHours());
    }

    public static void main(String[] args) {
        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Ian", "Paioletti", "1994-29-10", 10, 50.0);

        System.out.println(hourlyEmployee1.toString());
        System.out.printf("Earnings: %.2f%n", hourlyEmployee1.earnings());

    }
}




