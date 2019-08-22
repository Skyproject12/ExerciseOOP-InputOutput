
package javaapplication2;
import java.io.IOException;

/**
 *
 * @author Praktikan
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException, ClassNotFoundException {
       String namaDosen="Pak Indra";
       String nip="IDR";
       String kode_matkul="PBO39";
       String matkul="Pemrograman Berbasis Object";
       String namaMahasiswa="Mirza Himami Hanif";
       namaMahasiswa="Widhiyantio Nugroho";
       namaMahasiswa="Fikri Habibie";
       String nim="6706154093";
       nim="6706154088";
       nim="6706154083";
       String nilai="90";
       nilai="95";
       nilai="85";
       String namaKelas="D3IF-39-05";
       int kapasitas=30;
       Dosen dsn = new Dosen (namaDosen, nip, matkul,kode_matkul);
       Mahasiswa mhs = new Mahasiswa (namaMahasiswa,nim, nilai);
       Kelas kls= new Kelas(mhs,dsn,namaKelas,kapasitas);
       kls.simpanObject(kls);
       kls.bacaObject(kls);
    }
    
}
