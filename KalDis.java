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
public class KalDis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double totalPembelian, jumlahDiskon = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah pembelian Rp.: ");
        totalPembelian = scan.nextDouble();

        if (totalPembelian >= 0) {
            if (totalPembelian >= 50000) {
                jumlahDiskon = totalPembelian * 0.2;
            } else {
                jumlahDiskon = totalPembelian * 0.05;
            }

            System.out.println("Besarnya potongan Rp." + jumlahDiskon);
            System.out.println("Jumlah yang harus dibayarkan Rp." + (totalPembelian - jumlahDiskon));
        } else {
            System.out.println("Total pembelian tidak boleh 0 atau dibawahnya");
        }
    }
    
}
