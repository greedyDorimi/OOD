package designpatterns;

import designpatterns.builder.Student;

public class Driver {
    public static void main(String[] args) {
        builder();
    }
    public static void builder() {
        Student student = new Student.Builder()
                .name("Mansi")
                .rollNo(26)
                .build();
        System.out.println(student.getName() + " " + student.getRollNo() + " " + student.getEmailId()
                + " " + student.getPhoneNo() + "\n");
    }
}
