public class Aplikasi { //deklarasi kelas harus sama dengan nama file

    public static void main(String args[]) { 
        Mahasiswa mhs = new Mahasiswa(); //pemanggilan kelas Mahasiswa dan membuat mhs = nama object. dengan konstruktor()
        mhs.nama = "Aisatul Mutoharoh";
        mhs.nim = "18090107";
        mhs.kelas = "4D";
        System.out.println(mhs.info()); // mencetak nama mahasiswa dengan pemanggilan object.
    }
}