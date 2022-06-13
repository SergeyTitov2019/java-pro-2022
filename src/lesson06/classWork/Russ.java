package lesson06.classWork;

public class Russ implements Say{
    @Override
    public void sayHello() {
        System.out.println(" Привет .............");
    }

    @Override
    public void sayGoodBye() {
//        Say.super.sayGoodBye();
        System.out.println(" Пока ............");
    }
}
