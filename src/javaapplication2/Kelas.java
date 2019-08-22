package javaapplication2;
import java.io.*;
import java.io.NotSerializableException;
/**
 *
 * @author Praktikan
 */
public class Kelas implements Serializable {
    private Mahasiswa mhs;
    private Dosen dsn;
    private String nama;
    private int Kapasitas;

    public Kelas(String nama) {
        this.nama = nama;
    }

    public Kelas(Mahasiswa mhs, Dosen dsn, String nama, int Kapasitas) {
        this.mhs = mhs;
        this.dsn = dsn;
        this.nama = nama;
        this.Kapasitas = Kapasitas;
    }

    
    
    public int kapasitas(int kapasitas){
        if(kapasitas>45){
            System.out.println("melewati kapasitas kelas");
        }
        return kapasitas;
    }

 

    public Dosen getDsn() {
        return dsn;
    }

    public void setDsn(Dosen dsn) {
        this.dsn = dsn;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void tampil(){
        System.out.println("======== Data Ruangan Kelas D3IF-39-05=========");
        System.out.println("dosen\t\t\t:"+dsn.nama);
        System.out.println("Kode Dosen\t\t:"+dsn.nip);
        System.out.println("Kode Mata Kuliah\t:"+dsn.kode_matkul);
        System.out.println("Nama Mata Kuliah\t:"+dsn.matkul);
        System.out.println("======== Data Nilai Kelas D3 If-39-05==========");
        System.out.println("nama Mahasiswa\t:"+mhs.nama);
        System.out.println("nim mahasiswa\t:"+mhs.nim);
        System.out.println("nilai Mahasiswa\t:"+mhs.nilai);  
        
      
    }
    public void simpanObject(Kelas k){
        try{
            FileOutputStream fos =new FileOutputStream("E:\\PBO_MOD7_JURNAL_6706174063_PRAM\\DataKelas.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(k);
            oos.flush();
        }
        catch(IOException ioe){
            System.err.println("error"+ioe);
        }
    }
    public void bacaObject(Kelas k){
        try {
         FileInputStream fis  = new FileInputStream("E:\\PBO_MOD7_JURNAL_6706174063_PRAM\\DataKelas.txt");
        ObjectInputStream ois= new ObjectInputStream(fis);
        while((k=(Kelas)ois.readObject())!=null)k.tampil();
        }
        catch(IOException ioe){
            System.exit(1);
        }
        catch(Exception e){
            System.exit(1);
        }
    }
}
