package lesson06.classWork;

public interface Say {
    static String str = "test";
    void sayHello();

    default void sayGoodBye(){
        System.out.println("Goodbye default ... ");
    }
    static void hello(){
        System.out.println("static ..........");
    }
}
