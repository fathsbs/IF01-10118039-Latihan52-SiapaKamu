/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program berisi program yang menampilkan suatu identitas    
 */

/**
 *
 * @author Fatahillah Seno
 */
public class Dosen extends Manusia {

    private String nip;
    private String matakuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(String matakuliah) {
        this.matakuliah = matakuliah;
    }

    public void mengajarApa() {
        System.out.printf("Saya %s umur %d tahun sedang mengajar matakuliah %s", nama, umur, matakuliah);
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }

}
