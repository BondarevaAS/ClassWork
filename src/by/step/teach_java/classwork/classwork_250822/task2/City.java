package by.step.teach_java.classwork.classwork_250822.task2;


import javax.xml.namespace.QName;
import java.util.Scanner;

public class City {
    private Scanner sc = new Scanner(System.in);
    private String cityName;
    private String regionName;
    private String nameCity;
    private String kolichestvoZhiteley;
    private String pochtovyyIndeks;
    private String telephoneKod;

    public String getFio() {
        return cityName;
    }

    public void setFio() {
        System.out.print("Название города");
        this.cityName = sc.nextLine();
    }

    public String getDateOfBird() {
        return regionName;
    }

    public void setDateOfBird() {
        System.out.print("Название страны");
        this.nameCity = sc.nextLine();
    }

    public String getkolichestvoZhiteley() { return kolichestvoZhiteley; }

    public void setkolichestvoZhiteley() {
        System.out.print("Количество жителей");
        this.kolichestvoZhiteley = sc.nextLine();
    }

    public String getpochtovyyIndeks() { return pochtovyyIndeks;}


    public void setpochtovyyIndeks() {
        System.out.print("Почтовый индекс");
        this.pochtovyyIndeks = sc.nextLine();
    }

    public String getTelephoneKod() {
        return telephoneKod;
    }

    public void setTelephoneKod() {
        System.out.print("Телефонный код");
        this.telephoneKod = sc.nextLine();
    }


    }






