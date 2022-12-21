package models;

import models.enums.Degree;
import models.enums.Pl;


public class Mentor extends Persone{
    public Degree degree;

    public Mentor(String fio, int age, String gender, Pl pl, Degree degree) {
        super(fio, age, gender, pl);
        this.degree = degree;
    }
}
