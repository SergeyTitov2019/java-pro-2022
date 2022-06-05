package lesson04;

public class Car {
    static int tankCapacity = 54;
    static int tankBalance = 5;
    static int fuelConsumption = 15;
    static int totalPerTrip = 0;
    static int cost = 0;

    public static void main(String[] args) {
        getFullTank(50);
        getConsumptionsInfo(200);
        getFuelCalculation(450, 55);
    }

    public static double getFullTank(int fuelPrice){
        int fuelAmount = tankCapacity - tankBalance;
        int previousTankBalance = tankBalance;
        tankBalance = tankCapacity;
        System.out.println("To fill up whole tank you need: " + (tankCapacity - previousTankBalance)*fuelPrice + " hrn." );
        System.out.println("You just added " + fuelAmount + " liters to fill the tank. You tank is full ("+tankBalance+ " l). Have a save trip.");
        return tankBalance;
    }

    public static double getConsumptionsInfo(double km) {
        tankBalance = (int) (tankBalance - km / fuelConsumption);
        System.out.println("After " + km +" km trip you have " + tankBalance + " liters in you fuel tank");
        return tankBalance;
    }

    public static void getFuelCalculation(double km, int fuelPrice) {
        int amountToAdd = (int) (km / fuelConsumption);
        cost = (tankCapacity - tankBalance)*fuelPrice;
        totalPerTrip += cost;
        System.out.println("Your tank balance is " + tankBalance+". For " + km + " km trip you will need " + amountToAdd + " liters more.");
        if(tankBalance >= amountToAdd){
            System.out.println("Your tank balance is " + tankBalance+" litters, which is enough for the trip. You don't need additional fuel.");
            System.out.println("If still want to fill up your tank you will need " + (tankCapacity - tankBalance)*fuelPrice + " hryvnas.");

        } else {
            System.out.println("Your tank balance is " + tankBalance+". For this trip you will need at least " + (amountToAdd - tankBalance)+ " liters more.");
            System.out.println("It will cost you " + (amountToAdd - tankBalance)*fuelPrice + " hryvnas.");
        }
    }
//    public static void getTotalValue(){
//
//        totalPerTrip += totalPerTrip;
//        System.out.println("Total per Trip : "+ totalPerTrip + " hryvnas");
//
//
//
//    }

    public static void getTotalValue(String[] args) {
        int arr[] = new int[] {12,34,45,21,33,4};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("Array Sum = "+sum);

    }

}
