package lesson02;

public class MoneyCalc  {

    public void calculate(int sum, int years, double percent) {
        double amount = 0;
        double interest = 0;
        int yearNumber =1;
        for (int i = 0; i < years; i++) {
            yearNumber = i+1;
            amount += sum * percent;
            interest = sum + amount;
            double totalForYear = amount + interest;
            System.out.println("Total amount for " + yearNumber + " year: "+ interest  + " hrn ");
            System.out.println("Compound Interest for " + yearNumber + " year: "+ amount+ " hrn ");
//            System.out.println("Total " + yearNumber + " year: "+ totalForYear+ " hrn ");
        }
//        System.out.println("Deposit: " + sum + " hrn ");
//        System.out.println("Percent: " + percent*100 + "%");
//        System.out.println("Years: " + years);
//        System.out.println("Compound Interest after " + years + " years: "+ interest + " hrn ");
//        System.out.println("Total amount after " + years + " years: "+amount + " hrn ");
    }
    public static void main(String args[]) {
        MoneyCalc  obj = new MoneyCalc ();
        obj.calculate(1000, 3, .10);
    }
}