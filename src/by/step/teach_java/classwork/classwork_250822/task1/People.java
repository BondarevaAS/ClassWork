package by.step.teach_java.classwork.classwork_250822.task1;

import java.util.Scanner;

public class People {
    private Scanner sc = new Scanner(System.in);
    private String fio;
    private String dateOfBird;
    private String phone;
    private String city;
    private String country;
    private String address;

    public String getFio() {
        return fio;
    }

    public void setFio() {
        System.out.print("Введите ФИО");
        this.fio = sc.nextLine();
    }

    public String getDateOfBird() {
        return dateOfBird;
    }

    public void setDateOfBird() {
        System.out.print("Введите дату рождения");
        this.dateOfBird = sc.nextLine();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone() {
        System.out.print("Введите контактный телефон");
        this.phone = sc.nextLine();
    }

    public String getCity() {
        return city;
    }

    public void setCity() {
        System.out.print("Введите город");
        this.city = sc.nextLine();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry() {
        System.out.print("Введите страну");
        this.country = sc.nextLine();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress() {
        System.out.print("Введите дом. адрес");
        this.address = sc.nextLine();
    }
}
