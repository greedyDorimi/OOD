package designpatterns.builder;

public class Student {
    private String name;
    private int rollNo;
    private String emailId;
    private String phoneNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public static class Builder {
        private String name;
        private int rollNo;
        private String emailId;
        private String phoneNo;
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder rollNo(int rollNo) {
            this.rollNo = rollNo;
            return this;
        }
        public Builder emailId(String emailId) {
            this.emailId = emailId;
            return this;
        }
        public Builder phoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }
        public Student build() {
            Student student = new Student();
            student.name = this.name;
            student.rollNo = this.rollNo;
            student.emailId = this.emailId;
            student.phoneNo = this.phoneNo;
            return student;
        }
    }
}
