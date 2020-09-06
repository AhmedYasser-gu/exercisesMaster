import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("How many kilometers?");
        int kilometers = Integer.parseInt(input.nextLine());

        System.out.print("Has charging been done? (True/False)");
        boolean charge = Boolean.parseBoolean(input.nextLine());

        System.out.print("What membership type do you have? (None/Silver/Gold/Platinum)");
        String membership = input.nextLine();

        System.out.print("The cost for this ride is: ");
        System.out.println(fare(kilometers, charge, membership));
    }

    public static double fare(int kilometers, boolean charge, String membership){
        //Distance Calc
        double chargeDone;
        double membershipFare;
        double kmPrice;
        if(kilometers<5){
            kmPrice = kilometers * 20;
        } else if (kilometers <= 15){
            kmPrice = kilometers * 15;
        } else {
            kmPrice = kilometers * 8;
        }
        //Charging done
        if(charge){
            chargeDone = 0.75;
        } else {
            chargeDone = 1;
        }
        //Membership
        membershipFare = switch (membership) {
            case "Silver" -> 0.9;
            case "Gold" -> 0.8;
            case "Platinum" -> 0.65;
            default -> 1;
        };

        return kmPrice * chargeDone * membershipFare;
    }
}
/*
calculateRide: Think of the Voi scooters available around you, which provide fun rides at reasonable prices.
You have to calculate the fare of one ride given 3 parameters: Distance travelled in kilometers, charging done or not, and membership type.
For distance, the calculation goes like this:

Distance
<5 Km – 20 Sek per Km
5 Km -15 Km – 15 Sek per Km
>15 Km – 8 Sek per Km

Charging done
False → No discount
True → Fare = Fare – 25% Fare

Membership
None – Fare
Silver – 90% Fare
Gold –  80% Fare
Platinum – 65 % Fare


calculateRide(10,true,gold)
10 * 15 = 150 Sek
Charging done →  150 – 38.5 = 111.5
Gold Membership = 89.2 Sek
Output = 89.2

 */
