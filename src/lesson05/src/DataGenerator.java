package lesson05.src;

public class DataGenerator {
    public static Student[] getStudentArr() {

        Student[] stArray = new Student[10];

        stArray[0] = new Student(1,"Михаил", "Иванович", "Петров", 1995, "Киев", "050 333 33 22", "Учетный", "5", "у52");
        stArray[1] = new Student(2,"Александр", "Петрович", "Захаров" ,1996, "Киев", "067 222 11 11", "Кредитный", "4", "к42");
        stArray[2] = new Student(3,"Савелий", "Олегович",  "Тихонов",1997, "Киев", "050 222 11 77", "Учетный", "3", "у32");
        stArray[3] = new Student(4,"Анна", "Ивановна",  "Пельц",1999, "Киев", "067 123 44 55", "Учетный", "5", "у52");
        stArray[4] = new Student(5,"Светлана", "Николаевна",  "Зеленая",1999, "Киев", "050 124 55 77", "Маркетинг", "1", "м12");
        stArray[5] = new Student(6,"Игорь", "Николаевич",  "Светлов",1996, "Киев", "050 124 55 77", "Маркетинг", "4", "м42");
        stArray[6] = new Student(7,"Наталья", "Юрьевна",  "Загорная",1995, "Киев", "050 124 55 77", "Учетный", "5", "у52");
        stArray[7] = new Student(8,"Петр", "Семенович",  "Тихонов",1995, "Киев", "050 124 55 77", "Маркетинг", "5", "м52");
        stArray[8] = new Student(9,"Сергей", "Николаевич",  "Чехов",1997, "Киев", "050 124 55 77", "Учетный", "3", "у32");
        stArray[9] = new Student(10,"Семен", "Ильич",  "Веселый",1996, "Киев", "050 124 55 77", "Маркетинг", "5", "м52");


        return stArray;
    }


}
