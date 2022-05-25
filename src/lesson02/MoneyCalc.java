package lesson02;

public class MoneyCalc  {

    public void calculate(int sum, int years, double percent) {
        double amount = sum * Math.pow(1 + (percent / 12), 12 * years);
        double interest = amount - sum;
        System.out.println("Deposit: " + sum + " hrn ");
        System.out.println("Percent: " + percent*100 + "%");
        System.out.println("Years: " + years);
        System.out.println("Compound Interest after " + years + " years: "+ interest + " hrn ");
        System.out.println("Total amount after " + years + " years: "+amount + " hrn ");
    }
    public static void main(String args[]) {
        MoneyCalc  obj = new MoneyCalc ();
        obj.calculate(3500, 3, .095);
    }
}