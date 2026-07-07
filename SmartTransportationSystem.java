public class SmartTransportationSystem{
    private String name;
    private String type;
    private double distance;

    private static final double TAX_RATE_1 = 0.10;
    private static final double TAX_RATE_2 = 0.05;
    private static final double SPECIAL_DISCOUNT = 0.15;


    public SmartTransportationSystem(String name, String type, double distance){
        this.name = name;
        this.type = type;
        this.distance = distance;
       
    }
    public void a(String name, String type, double distance) {

        System.out.println("================================");
        System.out.println("Passenger Name: " + name);
        System.out.println("Vehicle Type: " + type);
        System.out.println("Distance: " + distance);

        

        



        

        

        
    }
    public void baseFare(double distance){
        double fare = 0;

        if (type.equals("BUS")) {
            fare = distance * 2;
        }
        else if (type.equals("TAXI")) {
            fare = distance * 8;
        }
        else if (type.equals("TRAIN")) {
            fare = distance * 4;
        }
        else {
            System.out.println("Invalid Vehicle");
            return;
        }

        System.out.println("Base Fare: " + fare);
    }
    public void taxCalculation(double distance){
        double taxCalculation = 0;

        if (distance > 100) {
            taxCalculation = fare * 0.10;
        }
        else {
            taxCalculation = fare * 0.05;
        }

        System.out.println("Tax: " + taxCalculation);
    }
    public void fareCalculation(){
        double finalFare = fare + taxCalculation;

        if (name.equalsIgnoreCase("Ali")) {
            finalFare = finalFare - (finalFare * SPECIAL_DISCOUNT);
            System.out.println("Special Discount Applied");
        }

        System.out.println("Final Fare: " + finalFare);
    }
}
