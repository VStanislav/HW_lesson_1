package com.company.HwLesson5;

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    private int age;

    public Employee (String fullName, String position, int age){
        this.fullName=fullName;
        this.position=position;
        this.age=age;

    }
    public void fullInfoEmployee(){
        System.out.println("\nСотрудник : " +fullName+". Возраст : "+age+". На должности : "+position+
                ". E-mail "+email+". Телефон "+phoneNumber+". Зарплата "+salary);
    }
}
