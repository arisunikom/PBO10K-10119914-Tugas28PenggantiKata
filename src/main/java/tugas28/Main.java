/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas28;
import java.util.Scanner;

/**
 *
 * @author 
 * Aris Prabowo
 * 10119914 - IF10K
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kalimatAwal;
        String kataDiganti;
        String kataBaru;

        var keyboard = new Scanner(System.in);
        System.out.println("===== Program Mengganti Kata =====\n");
        
        System.out.println("Masukan Kalimat : ");
        kalimatAwal = keyboard.nextLine();
        
        System.out.println("Ganti Kata : ");
        kataDiganti = keyboard.nextLine();

        System.out.println("Menjadi Kata : ");
        kataBaru = keyboard.nextLine();
        
        System.out.println("\n===== Hasil Formating =====");
        System.out.printf("Kalimat Awal : %s\n", kalimatAwal);
        System.out.printf("Kalimat Baru : %s", kalimatAwal.replace(kataDiganti, kataBaru));
    }
    
}
