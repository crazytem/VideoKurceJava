package lesson8.domashka;

public class OneTask {

    static double Proizv(double a, double b, double c) {
        return a * b * c;

    }

    static void Delenie(int a, int b) {
        System.out.println("Chastnoe " + a / b + " Ostatok " + a % b);
    }

    public static void main(String[] args) {
        System.out.println(OneTask.Proizv(3, 3, 3));
        OneTask.Delenie(8, 5);
        
        System.out.println(OneTask.Proizv(5.5, 5.6, 5.7));
        OneTask.Delenie(30, 20);
    }

}
