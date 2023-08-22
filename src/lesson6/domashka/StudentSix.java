package lesson6.domashka;

public class StudentSix {

    int id;
    String name;
    String surname;
    int curse;
    double pred1;
    double pred2;
    double pred3;

    StudentSix(int id1, String name1, String surname1, int curse1, double pred11,
            double pred21, double pred31) {

        id = id1;
        name = name1;
        surname = surname1;
        curse = curse1;
        pred1 = pred11;
        pred2 = pred21;
        pred3 = pred31;
    }

    StudentSix(int id2, String name2, String surname2, int curse2) {
        this(id2, name2, surname2, curse2, 0, 0, 0);
    }

    StudentSix() {
    }

}

class StudentTest {

    double SrednArifm(StudentSix sr) {
        double sredn = (sr.pred1 + sr.pred2 + sr.pred3) / 3;
        System.out.println("Имя " + sr.name + " Фамилия " + sr.surname + " Средняя оценка " + sredn);
        return sredn;
    }

    public static void main(String[] args) {

        StudentSix s1 = new StudentSix();
        s1.id = 1234;
        s1.name = "Ivan";
        s1.surname = "Petrov";
        s1.curse = 2013;
        s1.pred1 = 4.5;
        s1.pred2 = 4.0;
        s1.pred3 = 4.8;

        StudentSix s2 = new StudentSix(2, "Stac", "Govrilov", 4);

        s2.pred1 = 4.9;
        s2.pred2 = 3.9;
        s2.pred3 = 4.5;

        StudentSix s3 = new StudentSix(3, "Julia", "Ivanova", 5, 4.9, 5.0, 8);

        StudentTest sTest = new StudentTest();

        sTest.SrednArifm(s1);
        sTest.SrednArifm(s2);
        sTest.SrednArifm(s3);

    }

}
