package lesson05.src;

public class StudentService {

    public static void print(Student[] students) {
        for(Student s: students){
            System.out.println(s);
        }
    }
    public static void checkDepartment(Student[] students,String department) {
        System.out.println(department +" факультет : ");
        int count = 1;
        for(Student s: students){
            if(s.department == department){
                System.out.println(count + ". " + s.lastName +" " + s.firstName +" " +s.middleName);
                count++;
            }
        }
    }

    public static void checkDepartmentGroup(Student[] students,String department, String group) {
        System.out.println(department +" факультет: ");
        System.out.println( "Группа: " + group);
        int count = 1;
        for(Student s: students){
            if(s.department == department && s.group == group){
                System.out.println(count + ". " + s.lastName +" " + s.firstName +" " +s.middleName);
                count++;
            }
        }
    }

    public static void checkAge(Student[] students,int yearOfBirth) {
        System.out.println("список студентов старше " +yearOfBirth+" года :");
        int count = 1;
        for(Student s: students){
            if(s.yearOfBirth > yearOfBirth){
                System.out.println(count + ". " + s.lastName +" " + s.firstName +" " +s.middleName);
                count++;
            }
        }
    }

    public static void checkGroup(Student[] students,String group) {
        System.out.println("Список студентов  группы № " +group+" :");
        int count = 1;
        for(Student s: students){
            if(s.group == group){
                System.out.println(count + ". " + s.lastName +" " + s.firstName +" " +s.middleName);
                count++;
            }
        }
    }
}
