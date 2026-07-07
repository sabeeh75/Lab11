public class PaymentProcess{
    private String paymentMethod;

    public PaymentProcess(){
        this.paymentMethod = paymentMethod;
    }
    public void paymentProcessing(){
        if (paymentMethod.equals("CARD")) {

            System.out.println("Processing Card Payment...");
            System.out.println("Verifying Card...");
            System.out.println("Deducting Amount...");
            System.out.println("Payment Successful");
        }
        else if (paymentMethod.equals("CASH")) {

            System.out.println("Receiving Cash...");
            System.out.println("Generating Receipt...");
            System.out.println("Payment Successful");
        }
        else if (paymentMethod.equals("ONLINE")) {

            System.out.println("Connecting Gateway...");
            System.out.println("Verifying Transaction...");
            System.out.println("Payment Successful");
        }
        else {
            System.out.println("Invalid Payment Method");
            return;
        }
    }
}