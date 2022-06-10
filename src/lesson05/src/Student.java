package lesson05.src;

import java.util.Objects;

public class Student {
    int id;
    String firstName;
    String lastName;
    String middleName;
    int yearOfBirth;
    int age;
    String address;
    String telephone;
    String department;
    String course;
    String group;

    public Student(int id,
                   String firstName,
                   String middleName,
                   String lastName,
                   int yearOfBirth,
                   String address,
                   String telephone,
                   String department,
                   String course,
                   String group
    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.yearOfBirth = yearOfBirth;
        this.address =  address;
        this.telephone = telephone;
        this.department = department;
        this.course  = course;
        this.group = group;
    }
//    id, Фамилия, Имя, Отчество, Год рождения, Адрес, Телефон, Факультет, Курс, Группа.
    public int getAge() {return age;}
    public int getId() {return id;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && age == student.age && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, age);
    }

    @Override
    public String toString() {
        return "Student {" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                ", department='" + department + '\'' +
                ", course='" + course + '\'' +
                ", group='" + group + '\'' +
                '}';

    }
}
