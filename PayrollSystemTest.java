// test all class
public class PayrollSystemTest {
    
    public static void main(String[] args) {
        
        // create an array of Employee variables
        Employee[] employees = new Employee[5];
        employees[0] = new SalariedEmployee("Mei", "Hirata", "MH-1221-1997", 750.00);
        employees[1] = new HourlyEmployee("Amy", "Santiago", "MK-1234-5678", 42, 35);
        employees[2] = new CommissionEmployee("Jake", "Peralta", "JP-8887-2223", 1200, 0.3);
        employees[3] = new BasePlusComissionEmployee("Rosa", "Diaz", "RD-4455-6677", 8900, 0.45, 2800);
        employees[4] = new PieceWorker("Troy", "Bolton", "TB-1414-2000", 5, 230);

        // For each Employee, display its String representation and earnings.
        for(int i = 0;  i < employees.length; i++){
            System.out.printf("%s%nEarnings: %.2f%n",employees[i].toString(),employees[i].earnings());
            System.out.println("-----------------------------------------------");
        } 
    }
}
