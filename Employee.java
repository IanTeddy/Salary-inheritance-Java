// abstract class
abstract class Employee {
    
    // instace varaibles
    public final String firstName;
    public final String lastName;
    public final String SSN;

    // constructor 
    public Employee(String firstName, String lastName, String SSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }

    // getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getSSN() {
        return SSN;
    }

    // toString method
    public String toString(){
        return String.format("First Name: %s%nLast Name: %s%nSocial Security Number: %s%n", getFirstName(), getLastName(), getSSN());
    }

    //abstract method called earnings
    public abstract double earnings();

}




