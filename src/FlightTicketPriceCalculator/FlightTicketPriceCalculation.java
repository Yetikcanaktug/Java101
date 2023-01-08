package FlightTicketPriceCalculator;
import java.util.Scanner;
public class FlightTicketPriceCalculation {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double pricePerKm = 0.10;
        System.out.println("Please insert the distance as km : ");
        double km = inp.nextDouble();
        System.out.println("Please insert your age : ");
        int age = inp.nextInt();
        System.out.println("Please insert choose flight type  \n 1. One way flight ticket \n 2. Round-trip flight ticket\n ");
        double oneWayTicketPrice = pricePerKm * km;
        double discountKid = 0.5;
        double discountYoung = 0.1;
        double noDiscount = 0;
        double discountOld = 0.3;
        double roundTripDiscount = 0.2;
        int flightType = inp.nextInt();
        if (flightType == 2){
            if (age <= 12){
            double discount = (oneWayTicketPrice * discountKid);
            double price = oneWayTicketPrice - discount;
            double lastPrice = (price - (price * roundTripDiscount)) * 2;
            System.out.println("Ticket price : " + oneWayTicketPrice);
            System.out.println("Age discount : " + discount);
            System.out.println("Round-trip discount : " + price * roundTripDiscount);
            System.out.println("Latest price : " + lastPrice + "You can pay with credit or debit card.");
            }
            else if (age > 12 && age <=24){
                double discount = oneWayTicketPrice * discountYoung;
                double price = oneWayTicketPrice - discount;
                double lastPrice = (price - (price * roundTripDiscount)) * 2;
                System.out.println("Ticket price : " + oneWayTicketPrice + "TL");
                System.out.println("Age discount : " + discount + "TL");
                System.out.println("Round-trip discount : " + price * roundTripDiscount);
                System.out.println("Latest price : " + lastPrice + " TL. You can pay with credit or debit card.");
            }
            else if (age >25 && age <65){
                double discount = oneWayTicketPrice * noDiscount;
                double price = oneWayTicketPrice - discount;
                double lastPrice = (price - (price * roundTripDiscount)) * 2;
                System.out.println("Ticket price : " + oneWayTicketPrice + "TL" );
                System.out.println("Age discount : " + discount + "TL");
                System.out.println("Round-trip discount : " + price * roundTripDiscount + "TL");
                System.out.println("Latest price : " + lastPrice + " TL. You can pay with credit or debit card.");
            }
            else {
                double discount = oneWayTicketPrice * discountOld;
                double price = oneWayTicketPrice - discount;
                double lastPrice = (price - (price * roundTripDiscount)) * 2;
                System.out.println("Ticket price : " + oneWayTicketPrice + "TL" );
                System.out.println("Age discount : " + discount + "TL");
                System.out.println("Round-trip discount : " + price * roundTripDiscount + "TL");
                System.out.println("Latest price : " + lastPrice + " TL. You can pay with credit or debit card.");

            }


        }
        else if (flightType == 1){
            if (age <= 12){
                double discount = (oneWayTicketPrice * discountKid);
                double price = oneWayTicketPrice - discount;
                double lastPrice = price - (price * roundTripDiscount);
                System.out.println("Ticket price : " + oneWayTicketPrice + "TL");
                System.out.println("Age discount : " + discount + "TL");
                System.out.println("Latest price : " + price + " TL. You can pay with credit or debit card.");
            }
            else if (age > 12 && age <=24){
                double discount = oneWayTicketPrice * discountYoung;
                double price = oneWayTicketPrice - discount;
                double lastPrice = price - (price * roundTripDiscount);
                System.out.println("Ticket price : " + oneWayTicketPrice + "TL");
                System.out.println("Age discount : " + discount + "TL");
                System.out.println("Latest price : " + price + " TL. You can pay with credit or debit card.");
            }
            else if (age >25 && age <65){
                double discount = oneWayTicketPrice * noDiscount;
                double price = oneWayTicketPrice - discount;
                double lastPrice = price - (price * roundTripDiscount);
                System.out.println("Ticket price : " + oneWayTicketPrice + "TL");
                System.out.println("Age discount : " + discount + "TL");
                System.out.println("Latest price : " + price + " TL. You can pay with credit or debit card.");
            }
            else {
                double discount = oneWayTicketPrice * discountOld;
                double price = oneWayTicketPrice - discount;
                double lastPrice = price - (price * roundTripDiscount);
                System.out.println("Ticket price : " + oneWayTicketPrice + "TL");
                System.out.println("Age discount : " + discount + "TL");
                System.out.println("Latest price : " + price + "TL. You can pay with credit or debit card.");

            }

        }
        else
            System.out.println("Wrong insert. Please check your flight type insertation.");
    }

}
