public class MahasiswaBerprestasi18 {
    Mahasiswa18 listMhs[];
    int idx;

    MahasiswaBerprestasi18(int kuota) {
        listMhs = new Mahasiswa18[kuota];
    }

    void tambah(Mahasiswa18 mhs) {
        if (idx < listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Mahasiswa18 m : listMhs) {
            if (m != null) {
                m.tampilInformasi();
                System.out.println("---------------------------");
            }
        }
    }

    // Sequential Search
    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break; // [cite: 29]
            }
        }
        return posisi;
    }

    // Binary Search
    int findBinarySearch(double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].ipk) {
                return (mid);
            } else if (listMhs[mid].ipk > cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    // 
    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("data mahasiswa18 dengan IPK : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    //
    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("nim\t : " + listMhs[pos].nim);
            System.out.println("nama\t : " + listMhs[pos].nama);
            System.out.println("kelas\t : " + listMhs[pos].kelas);
            System.out.println("ipk\t : " + x);
        } else {
            System.out.println("Data mahasiswa18 dengan IPK " + x + " tidak ditemukan");
        }
    }
}