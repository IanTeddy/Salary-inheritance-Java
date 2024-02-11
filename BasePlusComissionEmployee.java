public class BasePlusComissionEmployee extends Employee {
    
    //instance variable
    private double baseSalary;  // new variable
    private double grossSales;
    private double commissionRate;


    // constructor
    public BasePlusComissionEmployee(String firstName, String lastName, String SSN, double grossSales, double commissionRate, double baseSalary){

        super(firstName, lastName, SSN);
        // check base salary condition before saving
        if(baseSalary < 0){
            throw new IllegalArgumentException("Invalid base salary value.");
        }
        this.baseSalary = baseSalary;

        // check commision rate and gross sales conditions before saving
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
    public double getBaseSalary() {
        return baseSalary;
    }
    
    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }


    // modify earnings method
    public double earnings(){
        return getCommissionRate() * getGrossSales() + getBaseSalary();
    }
        
    // toString method
    public String toString(){
        return String.format("<<Base salary + Commission Employee>>%nFirst Name: %s%nLast Name: %s%nSocial Security Number: %s%nGross Sales: %.2f%nCommission Rate: %.2f%nBase Salary: %.2f", getFirstName(),getLastName(), getSSN(), getGrossSales(),getCommissionRate(),getBaseSalary());
    }

    /***  TRY OUT ***/
    public static void main(String[] args) {
        BasePlusComissionEmployee baseEmp = new BasePlusComissionEmployee("Jake", "Peralta","DD-777-8899" , 700.50, 0.32, 3500.0);

        System.out.println(baseEmp.toString());
        System.out.printf("Earnings: %.2f%n", baseEmp.earnings());

    }
}
