package javaapplication2;

import java.io.Serializable;

/**
 *
 * @author Praktikan
 */
public class Dosen implements Serializable {
   String nama;
   String nip;
   String matkul;
   String kode_matkul;

    public Dosen(String nama, String nip, String matkul, String kode_matkul) {
        this.nama = nama;
        this.nip = nip;
        this.matkul = matkul;
        this.kode_matkul = kode_matkul;
    }

    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }

    public String getMatkul() {
        return matkul;
    }

    public String getKode_matkul() {
        return kode_matkul;
    }
   
}
