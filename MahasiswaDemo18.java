import java.util.Scanner;

public class MahasiswaDemo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // [cite: 54] Modifikasi jumlah mahasiswa sesuai input keyboard
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine(); 

        MahasiswaBerprestasi18 list = new MahasiswaBerprestasi18(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            System.out.println("---------------------------");
            list.tambah(new Mahasiswa18(nim, nama, kelas, ipk));
        }

        System.out.println("Data Keseluruhan Mahasiswa:");
        list.tampil();

        System.out.println("---------------------------");
        System.out.println("Pencarian data");
        System.out.println("---------------------------");
        System.out.print("Masukkan IPK mahasiswa yang dicari: ");
        double cari = sc.nextDouble();

        System.out.println("Menggunakan sequential searching");
        int posisi = list.sequentialSearching(cari);
        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);

        System.out.println("===========================");
        System.out.println("Menggunakan binary search");
        posisi = list.findBinarySearch(cari, 0, jumMhs - 1);
        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);

        sc.close();
    }
}