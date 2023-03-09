package designpatterns;

import designpatterns.builder.Student;
import designpatterns.singleton.House;
import designpatterns.singleton.SecurityGuard;

public class Driver {
    public static void main(String[] args) {
        builder();
        singleton1(); // Use-case: https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples
        singleton2();
    }
    public static void builder() {
        Student student = new Student.Builder()
                .name("Mansi")
                .rollNo(26)
                .build();
        System.out.println(student.getName() + " " + student.getRollNo() + " " + student.getEmailId()
                + " " + student.getPhoneNo() + "\n");
    }

    public static void singleton1() {
        House house1 = new House(1);
        House house2 = new House(2);
        house1.printGuard(SecurityGuard.getInstance());
        house2.printGuard(SecurityGuard.getInstance());
    }

    public static void singleton2() {
        House house3 = new House(3);
        House house4 = new House(4);
        house3.printGuard(SecurityGuard.getInstance());
        house4.printGuard(SecurityGuard.getInstance());
    }
}
