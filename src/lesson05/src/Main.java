package lesson05.src;

public class Main {
    public static void main(String[] args) {
        StudentService ss = new StudentService();
        Student arr[] = DataGenerator.getStudentArr();

//        ss.print(arr);
        ss.checkDepartment(arr, "Учетный");
//        ss.checkDepartmentGroup(arr, "Учетный", "52");
//        ss.checkAge(arr, 1997);
//        ss.checkAge(arr, 1997);
//        ss.checkGroup(arr, "у52");
    }
}
