import models.Mentor;
import models.Student;
import models.enums.Degree;
import models.enums.Payment;
import models.enums.Pl;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student danill = new Student("Protopopov Danill", 20, "male", Pl.JAVA,  Payment.FREE);
        Student hasan = new Student("Nurubuloev Hasan", 20, "male", Pl.FLUTTER, Payment.DELETED);
        Student ivan = new Student("Ivanov Ivan", 50, "female", Pl.PYTHON, Payment.NOTPAYED);

        Mentor peter = new Mentor("Peter Petrov", 30, "male", Pl.JAVASCRIPT, Degree.INTERN);
        Mentor kozel = new Mentor("Kozel Kozlov", 25, "female", Pl.JAVA, Degree.JUNIOR);
        Mentor artem = new Mentor("Artem Belyaev", 43, "male", Pl.PYTHON, Degree.SENIOR);

        System.out.println(Arrays.toString(Pl.values()));
        System.out.println(Arrays.toString(Payment.values()));
        System.out.println(Arrays.toString(Degree.values()));

        System.out.println("----------------------------");
        System.out.println(danill.pl.name());
        System.out.println(danill.pl.ordinal());
        System.out.println(danill.payment.name());
        System.out.println(danill.payment.ordinal());
        System.out.println("----------------------------");
        System.out.println(artem.pl.name());
        System.out.println(artem.pl.ordinal());
        System.out.println(artem.degree.name());
        System.out.println(artem.degree.ordinal());




    }
}