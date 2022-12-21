package models;

import models.enums.Pl;

public abstract class Persone {
    private String fio;
    private int age;
    private String gender;
    public Pl pl;

    public Persone(String fio, int age, String gender, Pl pl) {
        this.fio = fio;
        this.age = age;
        this.gender = gender;
        this.pl = pl;
    }

    @Override
    public String toString() {
        return "Persone{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", pl=" + pl +
                '}';
    }
}
