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
class NilaiAkhir {
    private double quiz,uts,uas;

    public NilaiAkhir(double quiz, double uts, double uas) {
        this.quiz = quiz;
        this.uts = uts;
        this.uas = uas;
    }

   
    public double getQuiz() {
        return quiz;
    }

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }
    
    public double hasilNilai(){
        return(double) ((0.20*quiz)+(0.30*uts)+(0.50*uas))  ;
        
    }
    
    public String index(){
        
        String index;
        if(hasilNilai()>=80 && hasilNilai()<=100){
            index="A";
        }else if(hasilNilai()>=68 && hasilNilai()<=80){
            index="B";
        }else if(hasilNilai()>=56 && hasilNilai()<=68){
            index="C";
        }else if(hasilNilai()>=45 && hasilNilai()<=56){
            index="D";
        }else{
            index="E";
        } 
        
        
        return index;
    
    }
    
        public String keterangan(){
        
        String Ket=null;
        if(hasilNilai()>=80 && hasilNilai()<=100){
            Ket = "Sangat Baik";
        }else if(hasilNilai()>68 && hasilNilai()<=80){
           Ket = "Baik";
        }else if(hasilNilai()>56 && hasilNilai()<=68){
            Ket = "Cukup";
        }else if(hasilNilai()>45 && hasilNilai()<=56){
            Ket = "Kurang";
        }else{
            Ket = "Sangat Kurang";
        } 
        
        
        return Ket;
    
    }
}
