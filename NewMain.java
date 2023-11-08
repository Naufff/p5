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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.print("NPM : ");
        String npm = input.nextLine();

        System.out.print("Nama Mahasiswa : ");
        String namaMahasiswa = input.nextLine();

        System.out.print("Nilai Kehadiran : ");
        double nilaiKehadiran = input.nextDouble();

        System.out.print("Nilai Tugas : ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Nilai UTS : ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Nilai UAS : ");
        double nilaiUAS = input.nextDouble();

        Mahasiswa mahasiswa = new Mahasiswa(npm, namaMahasiswa, nilaiKehadiran, nilaiTugas, nilaiUTS, nilaiUAS);
        double nilaiAkhir = mahasiswa.hitungNilaiAkhir();
        String grade = nilai.tentukanGrade(nilaiAkhir);
        String keterangan = nilai.tentukanKeterangan(nilaiAkhir);

        System.out.println();
        System.out.println("NPM Mahasiswa : " + mahasiswa.getNPM());
        System.out.println("Nama Mahasiswa : " + mahasiswa.getNamaMahasiswa());
        System.out.println("Nilai Rata-rata : " + nilaiAkhir);
        System.out.println("Grade : " + grade);
        System.out.println("Keterangan : " + keterangan);
    }
    }