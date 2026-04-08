1. Perbedaan tampilDataSearch dan tampilPosisi: tampilPosisi hanya berfungsi untuk memberikan informasi apakah data ditemukan dan di indeks ke berapa, sedangkan tampilDataSearch berfungsi untuk menampilkan detail data atribut (NIM, Nama, Kelas) dari objek yang ditemukan tersebut.


2. Fungsi break: Berfungsi untuk menghentikan proses perulangan (for) seketika setelah data yang dicari ditemukan, sehingga program tidak perlu mengecek sisa elemen array lainnya demi efisiensi.

3. Fungsi variabel pos: Sebagai penanda (flag) sekaligus penyimpan indeks hasil pencarian. Jika tetap bernilai -1, berarti data tidak ditemukan.


4. Data ke berapa yang ditampilkan jika ada nilai sama? Data yang pertama kali ditemukan (indeks terkecil).

5. Penjelasan jika break dihapus: Program akan terus melakukan perulangan sampai akhir array. Jika ada lebih dari satu data yang sama, variabel pos akan menyimpan indeks dari data yang paling terakhir ditemukan.