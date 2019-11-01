/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program berisi program yang menampilkan suatu identitas  
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Dosen dosen = new Dosen();
        Mahasiswa mhs = new Mahasiswa();

        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setNip("41227829930");
        dosen.setMatakuliah("PBO");

        mhs.setNama("Fatahillah Satria Bima Seno");
        mhs.setUmur(20);
        mhs.setNim("10118039");
        mhs.setKelas("PBO1");

        System.out.printf("NIP DOSEN\t: %s%n", dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();

        System.out.printf("%n%n");

        System.out.printf("NIM MAHASISWA\t: %s%n", mhs.getNim());
        mhs.siapaKamu();
        mhs.kelasApa();
        System.out.println();
    }

}
