package models;

import models.enums.Payment;
import models.enums.Pl;

public class Student extends Persone{
    public Payment payment;

    public Student(String fio, int age, String gender, Pl pl, Payment payment) {
        super(fio, age, gender, pl);
        this.payment = payment;
    }


}
