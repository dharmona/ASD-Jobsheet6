1. Proses Divide: Terletak pada baris mid = (left + right) / 2; di mana rentang pencarian dibagi menjadi dua bagian.

2. Proses Conquer: Terletak pada pemanggilan rekursif findBinarySearch(cari, left, mid - 1) atau findBinarySearch(cari, mid + 1, right) yang fokus mencari pada salah satu bagian yang relevan.

3. Fungsi left, right, mid:
left: Batas bawah/indeks pertama dari rentang pencarian.
right: Batas atas/indeks terakhir dari rentang pencarian.
mid: Nilai tengah dari rentang pencarian untuk dibandingkan dengan data yang dicari.

4. Jika data tidak urut? Program tetap berjalan namun hasil pencarian kemungkinan besar salah/tidak ditemukan. Binary Search secara algoritma mewajibkan data dalam keadaan terurut agar pembagian rentang mid bisa berfungsi secara logis.

5. Binary Search data Descending: Hasilnya tidak akan sesuai karena logika pembandingnya (>) saat ini dibuat untuk data Ascending.
Perbaikan kode: Ubah baris else if (listMhs[mid].ipk > cari) menjadi else if (listMhs[mid].ipk < cari) agar bisa bekerja pada data Descending.

6. Menentukan data tidak ditemukan: Binary search menentukan data tidak ada jika kondisi right >= left sudah tidak terpenuhi (rentang pencarian sudah habis/kosong) dan program mencapai baris return -1