package Zadacha2;

public class Glavna {

    public static void main(String[] args) {
        double x = 18.3;
        double y = 19.5;
        KalkulatorZaDecimalniBroevi kalkulator = new KalkulatorZaDecimalniBroevi();
        System.out.println("Odzemanje na x i y-  " + kalkulator.odzemanje(x, y));
        System.out.println("Sobiranje na x i y-  " + kalkulator.sobiranje(x, y));
        System.out.println("Mnozenje na x i y-  " + kalkulator.mnozenje(x, y));
        System.out.println("Delenjena x i y- " + kalkulator.delenje(x, y));
        System.out.println("Ostatok na x i y- " + kalkulator.ostatok(x, y));
        System.out.println("Stepenuvanje na x i y- " + kalkulator.stepenuvanje(x, y));
    }
}
