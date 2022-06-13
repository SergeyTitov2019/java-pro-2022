package lesson06.classWork;

public interface Logger {
    void printLogger(String msg);
    String xxx();

    default void print(){
        System.out.println("print from interface");
    }
}
