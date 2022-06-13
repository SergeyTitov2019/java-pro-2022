package lesson06;

public class DataGenerator {
    public static Subscriber[] getSubscriberArr() {

        Subscriber[] subscribersArray = new Subscriber[10];
        subscribersArray[0] = new Subscriber("01","Сергей", "Николаевич",  "Чехов","Киев", "(050) 124 55 77", "123445", 150, 300, 0, 10);
        subscribersArray[1] = new Subscriber("02","Иван", "Петрович",  "Альтов","Киев", "(050) 333 22 44", "123001", 250, 300, 0, 10);
        subscribersArray[2] = new Subscriber("03","Семен", "Иванович",  "Попов","Львов", "(050) 122 55 41", "123115", 350, 10, 0, 10);
        subscribersArray[3] = new Subscriber("04","Олег", "Петрович",  "Иванов","Киев", "(050) 124 55 12", "123402", 150, 300, 30, 10);
        subscribersArray[4] = new Subscriber("05","Дмитрий", "Николаевич",  "Саратов","Полтава", "(050) 333 11 77", "120045", -50, 300, 300, 10);
        subscribersArray[5] = new Subscriber("06","Никита", "Павлович",  "Ильин","Одесса", "(050) 124 55 11", "123441", 20, 20, 300, 10);
        subscribersArray[6] = new Subscriber("07","Михаил", "Николаевич",  "Орлов","Киев", "(050) 124 55 00", "123442", 110, 300, 70, 10);
        subscribersArray[7] = new Subscriber("08","Анатолий", "Олегович",  "Петров","Киев", "(050) 111 55 22", "123415", -150, 300, 0, 10);
        subscribersArray[8] = new Subscriber("09","Сергей", "Антонович",  "Смехов","Одесса", "(050) 144 53 27", "123401", 50, 300, 10,50);
        subscribersArray[9] = new Subscriber("10","Семен", "Николаевич",  "Петренко","Киев", "(050) 424 50 70", "123999", -250, 300, 150, 1110);

        return subscribersArray;
    }


}
