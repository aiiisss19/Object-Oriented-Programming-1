public class Mahasiswa {
    // field/ atribut/ properties/ variabel

    String nim;
    String nama;
    String kelas; // 3 atribut kelas


    public Mahasiswa() {
        nama = "ais";
        nim = "107";
        kelas = "4D";

    }
    

    // method / fungsi / prosedur 
    public String info() {
        return nim + ":" + nama + ":" + kelas;    
    }
    

}