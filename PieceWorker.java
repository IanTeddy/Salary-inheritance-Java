public class PieceWorker extends Employee {

    // instance variables
    private double wage;
    private int pieces;

    // constructor
    public PieceWorker(String firstName, String lastName, String SSN, double wage, int pieces){
        super(firstName, lastName, SSN);
        if (wage < 0.0){
            throw new IllegalArgumentException("Invalid wage value.");
        }
        if(pieces < 0){
            throw new IllegalArgumentException("The number of pieces produced is invalid.");
        }
        this.wage = wage;
        this.pieces = pieces;
    }

    // getters
    public double getWage() {
        return this.wage;
    }

    public int getPieces() {
        return this.pieces;
    }

    // modify earnings() method
    public double earnings(){
        return getPieces() * getWage();
    }

    // toString()
    public String toString(){
        return String.format("<<Piece Worker>>%nFirst Name: %s%nLast Name: %s%nSocial Security Number: %s%nWage: %.2f%nProduced Pieces: %d", getFirstName(), getLastName(), getSSN(), getWage(), getPieces());
    }
    
}
