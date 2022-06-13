package lesson06.classWork;

public interface SayHello extends Say{
    @Override
    default void sayHello(){
        System.out.println("from default sayHello ...........");
    };
}
