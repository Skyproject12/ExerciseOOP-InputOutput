package javaapplication2;

import java.io.Serializable;

/**
 *
 * @author Praktikan
 */
public class Mahasiswa implements Serializable {
     String nama;
     String nim;
     String nilai;

    public Mahasiswa(String nama, String nim, String nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getNilai() {
        return nilai;
    }
    
    
}
