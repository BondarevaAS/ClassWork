package by.step.teach_java.tack3;

import java.util.Scanner;

public class Country {
    private Scanner sc =  new Scanner (System.in);
    private String nameCountry;
    private String nameContinent;
    private  String kolichestvoZhiteley;
    private String telephoneKod;
    private String nameCapital;
    private String nameCities;

    public String getNameCountry() { return nameCountry;
    }

    public void setnameCountry() {
        System.out.print("Название страны");
        this.nameCountry = sc.nextLine();
    }

    public String getNameContinent() { return nameContinent;
    }

    public void setNameContinent() {
        System.out.print("Название континента");
        this.nameContinent = sc.nextLine();
    }

    public String getKolichestvoZhiteley() { return kolichestvoZhiteley;
    }

    public void setKolichestvoZhiteley() {
        System.out.print("Количество жителей");
        this.kolichestvoZhiteley = sc.nextLine();
    }

    public String getTelephoneKod() { return telephoneKod;
    }

    public void setTelephoneKod() {
        System.out.print("Телефонный код");
        this.telephoneKod = sc.nextLine();
    }

    public String getNameCapital() { return nameCapital;
    }

    public void setNameCapital() {
        System.out.print("Название столицы");
        this.nameCapital = sc.nextLine();
    }

    public String getNameCities() { return nameCities;
    }

    public void setNameCities() {
        System.out.print("Название городов");
        this.nameCities = sc.nextLine();
    }
}
