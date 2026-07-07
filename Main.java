// Below is a single-file legacy Java program for a Smart Transportation Management System. It intentionally contains:

// Poor variable names
// Poor method names
// Long methods
// Duplicate code
// Mixed responsibilities
// Temporary variables
// Unclear naming
// Methods that should be extracted
// Methods and variables that should be renamed
// Logic that should be moved to separate classes

// The students' task is to apply Extract Method, Move Method, Rename Variable, and Rename Method refactorings

public class Main {

    public static void main(String[] args) {

        SmartTransportationSystem smartTransport = new SmartTransportationSystem();

        smartTransport.a("Ali", "BUS", 120, "CARD");
        smartTransport.a("Ahmed", "TAXI", 30, "CASH");
        smartTransport.a("Sara", "TRAIN", 250, "ONLINE");
    }

    
}