package lesson04;

import static lesson04.Car.*;

public class Main {
    static String KrivoeOzero = "KRIVOE OZERO";
    static String Zhashov = "ZHASHKOV";
    static String Odessa = "ODESSA";
    static String Kiev = "KIEV";
    static double firstPortion = 178.5; // distance from Odessa to Krivoe Ozero
    static double secondPortion = 149.5; // distance from Krivoe Ozero to Zhashkov
    static double thirdPortion = 148; // distance from Zhashkov to Kiev
    public static void main(String[] args) {
        System.out.println("Trip from " + Odessa + " to " + Kiev+ " is about 476 km.");

        System.out.println("-------------------------------");
        System.out.println("Distance from " + Odessa + " to " + KrivoeOzero + " is " +firstPortion+" km.");
        getFuelCalculation(firstPortion, 50);
        getFullTank(50);

        System.out.println("-------------------------------");
        System.out.println("You've reached " + KrivoeOzero);
        getConsumptionsInfo(firstPortion);
        System.out.println("-------------------------------");

        System.out.println("Distance from " + KrivoeOzero + " to "+  Zhashov +" is " +secondPortion+" km.");
        getFuelCalculation(secondPortion, 50);
        getFullTank(50);
        System.out.println("-------------------------------");

        System.out.println("You've reached " + Zhashov);
        getConsumptionsInfo(secondPortion);

        System.out.println("-------------------------------");
        System.out.println("Distance from " +Zhashov +" to " + Kiev+ " is " +thirdPortion+" km.");
        getFuelCalculation(thirdPortion, 50);
        getFullTank(50);
        System.out.println("-------------------------------" );
        System.out.println("You've reached " + Kiev);
        getConsumptionsInfo(thirdPortion);
        System.out.println("Total per Trip : "+ totalPerTrip + " hryvnas");

    }

}
