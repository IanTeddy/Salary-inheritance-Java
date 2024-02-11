// sub class called CommisionEmployee
public class CommissionEmployee extends Employee {
    
    // instance variables : grossSales and commissionRate of double 
    private double grossSales;
    private double commissionRate;

    // constructor
    public CommissionEmployee(String firstName, String lastName, String SSN, double grossSales, double commissionRate){

        super(firstName, lastName, SSN);
        if(commissionRate <= 0.0 || commissionRate > 1.0){
            throw new IllegalArgumentException("Invalid commission rate.");
        }
        if(grossSales < 0){
            throw new IllegalArgumentException("Gross sales must be greater than 0.");
        }
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    // getters
    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    // modify earnings method
    public double earnings(){
        return getCommissionRate() * getGrossSales();
    }

    // toString method
    public String toString(){
        return String.format("<<Commission Employee>>%nFirst Name: %s%nLast Name: %s%nSocial Security Number: %s%nGross Sales: %.2f%nCommission Rate: %.2f", getFirstName(),getLastName(), getSSN(), getGrossSales(),getCommissionRate());
    }


    /***  TRY OUT ***/
    public static void main(String[] args) {
        
        CommissionEmployee commissionEmp = new CommissionEmployee("Megumi","Kabasawa" , "KM-1234-5789", 100, 0.6);

        System.out.println(commissionEmp.toString());
        System.out.printf("Earnings: %.2f%n", commissionEmp.earnings());
    }

}
