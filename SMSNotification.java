public class SMSNotification{
    private String name;

    public SMSNotification(){
        this.name = name;
    }

    public void notification(){
        System.out.println("Sending SMS Notification...");
        System.out.println("Passenger " + name + ", your booking has been confirmed.");
    }
}