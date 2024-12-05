
import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Masukkan Jumlah elemen: ");
        int jumlah = s.nextInt();

        int[] bilangan = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan angka ke " + (i + 1) + ": ");
            bilangan[i] = s.nextInt();
        }
        
        deteksiNegative(bilangan);

        s.close();
    }

    public static void deteksiNegative(int[] bilangan) {
        boolean negative = false;
        String bilanganNegativ = "";

        // for each menampilkan isi dari array
        for (int elemen : bilangan) {
             if (elemen < 0) {
                negative = true;
                bilanganNegativ += (elemen) + (", ");
            }
             }
             if(negative){
                System.out.println("Array mengandung elemen negatif: " + bilanganNegativ); 
            } else {
                 System.out.println("Array tidak mengandung elemen negatif"); }
             }
    }

