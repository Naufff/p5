/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author naufa
 */
public class nilai {
    public static String tentukanGrade(double nilaiAkhir) {
        if (nilaiAkhir >= 76) {
            return "A";
        } else if (nilaiAkhir >= 66) {
            return "B";
        } else if (nilaiAkhir >= 56) {
            return "C";
        } else if (nilaiAkhir >= 46) {
            return "D";
        } else {
            return "E";
        }
    }

    public static String tentukanKeterangan(double nilaiAkhir) {
        if (nilaiAkhir >= 76) {
            return "ISTIMEWA";
        } else if (nilaiAkhir >= 66) {
            return "BAIK";
        } else if (nilaiAkhir >= 56) {
            return "CUKUP";
        } else if (nilaiAkhir >= 46) {
            return "KURANG";
        } else {
            return "KURANG SEKALI";
        }
    }
}
