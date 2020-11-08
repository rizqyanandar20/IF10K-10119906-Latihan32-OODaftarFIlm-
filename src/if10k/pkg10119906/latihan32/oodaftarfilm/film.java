/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan32.oodaftarfilm;

/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda Rusmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 */
public class film {
    String filmName;
    String filmGenre;
    double filmRating;
    int filmDuration;
    
    public void nowPlaying(String parJudul, String parGenre, double parRating, int parDuration) {
        System.out.println("Judul Film : " +parJudul);
        System.out.println("Genre Film : " +parGenre);
        System.out.println("Rating Film : " +parRating);
        System.out.println("Duration Film : " +parDuration+ " Menit");
        System.out.println();      
    }
    
}
