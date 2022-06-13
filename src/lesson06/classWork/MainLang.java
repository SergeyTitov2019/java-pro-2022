package lesson06.classWork;

public class MainLang {
    public static void main(String[] args) {
        Say say;
        if(args.length != 0 && args[0].equals("rus")){
            say = new Russ();
        } else{
            say = new Eng();
        }

        say.sayHello();
        say.sayGoodBye();
        Say.hello();

    }
}
