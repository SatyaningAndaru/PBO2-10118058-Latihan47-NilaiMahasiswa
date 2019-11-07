/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan47.nilaimahasiswa;

/**
 *
 * @author user
 */
public class PBO210118058Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     *  Nama:Satyaning Andaru bawalaksana
     * Nim: 10118058
     * kelas : If-2
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NilaiAkhir na = new NilaiAkhir(75,45,34);
      
        System.out.println("Quiz : " +na.getQuiz());
        System.out.println("UTS : "+na.getUts());
        System.out.println("UAS : "+na.getUas());
        
        System.out.println("Nilai Akhir : "+na.hasilNilai());
        System.out.println("Index : " + na.index());
        System.out.println("Keterangan : "+na.keterangan());
        
        System.out.println();
         NilaiAkhir na2 = new NilaiAkhir(60,80,75);
      
              System.out.println("Quiz : " +na2.getQuiz());
        System.out.println("UTS : "+na2.getUts());
        System.out.println("UAS : "+na2.getUas());
        
        System.out.println("Nilai Akhir : "+na2.hasilNilai());
        System.out.println("Index : " + na2.index());
        System.out.println("Keterangan : "+na2.keterangan());
        System.out.println();
        
         NilaiAkhir na3 = new NilaiAkhir(30,80,40);
       
              System.out.println("Quiz : " +na3.getQuiz());
        System.out.println("UTS : "+na3.getUts());
        System.out.println("UAS : "+na3.getUas());
        
        System.out.println("Nilai Akhir : "+na3.hasilNilai());
        System.out.println("Index : " + na3.index());
        System.out.println("Keterangan : "+na3.keterangan());
        
    }
    
}
