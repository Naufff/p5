/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author naufa
 */
import java.util.Scanner;
public class imt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan berat badan (kg): ");

        int beratBadan = input.nextInt();
        System.out.print("Masukkan tinggi badan (m): ");

        float tinggiBadan = input.nextFloat();
        float imt = beratBadan / (tinggiBadan * tinggiBadan);

        String kriteria;
        if (imt < 18.5) {
            kriteria = "Berat badan kurang";
        } else if (imt <= 24.9) {
            kriteria = "Berat badan ideal";
        } else if (imt <= 29.9) {
            kriteria = "Berat badan lebih";
        } else if (imt <= 39.9) {
            kriteria = "Gemuk";
        } else {
            kriteria = "Sangat gemuk";
        }

        System.out.println("IMT: " + imt);
        System.out.println("Kriteria: " + kriteria);
    }
    
}
