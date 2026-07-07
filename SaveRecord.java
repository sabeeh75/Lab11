public class SaveRecord{
    private String name;
    private String type;
    private double distance;
    private double finalFare;

    public SaveRecord(String name, String type, String distance, double finalFare){
        this.name = name;
        this.type = type;
        this.distance = distance;
        this.finalFare = finalFare;
    }

    public void savingRecord(){
        System.out.println("Saving Booking Record...");
        System.out.println("Passenger: " + name);
        System.out.println("Vehicle: " + type);
        System.out.println("Distance: " + distance);
        System.out.println("Amount Paid: " + finalFare);

        System.out.println("================================");
    }
}