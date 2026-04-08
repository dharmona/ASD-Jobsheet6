public class Mahasiswa18 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa18(String ni, String nm, String kls, double ip) {
        nim = ni;
        nama = nm;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
    }
}