import java.util.Scanner;

public class soal2 {
    public static double luasPermukaan(double jari){
        double pi = 3.14;
        return 4 * pi *jari * jari;
    }

    public static void main(String[] args) {
        double luas;

        Scanner s = new Scanner(System.in);

        System.out.println("Masukkan Jari - jari: ");
        double jari = s.nextDouble();
        
        luas = luasPermukaan(jari);

        System.out.println("Luas permukaan bola adalah: " + luas);
    }
}
