package lesson06.classWork;

public class Transport implements Logger {
    private String timetable;

    @Override
    public void printLogger(String msg) {
        System.out.println("Transport:" + timetable + "..." + msg);
    }

    @Override
    public String xxx() {
        return null;
    }

    @Override
    public void print() {
//        Logger.super.print();
        System.out.println(" smth other");
    }
}
