package lesson06.classWork;

public class Eng implements Say{
    @Override
    public void sayHello() {
        System.out.println("Say Hello - eng");
    }

    @Override
    public void sayGoodBye() {
//        Say.super.sayGoodBye();
        System.out.println("Say Goodbye - eng");
    }
}
