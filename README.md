Pertanyaan percobaan 1
1. Jika pada perulangan for, inisialisasi i=1 diubah menjadi i=0, apa yang akibatnya? Mengapa bisa demikian?
Jawab: kalau kita ubah nilai awal i dari 1 menjadi 0, maka jumlah bintang yang muncul akan bertambah satu. Misalnya, kalau N = 5, seharusnya muncul 5 bintang, tapi karena perulangan dimulai dari 0, maka akan muncul 6 bintang . Ini terjadi karena loop sekarang berjalan sebanyak 6 kali 0,1,2,3,4,5.jadi intinya, perulangan di Java menghitung dari nilai awal sampai nilai akhir yang memenuhi syarat kondisi i <= N. Jadi, kalau kita mulai dari 0, maka program menghitung satu kali lebih banyak dari yang kita harapkan.
2. Jika pada perulangan for,kondisi i<=N diubah menjadi i>N, apa akibatnya? Mengapa bisa demikian?
Jawab: kalau kondisi diubah jadi i > N, maka program tidak akan mencetak apa pun.karena, ketika program mulai dijalankan, nilai awal i adalah 1, dan kondisi 1 > N pasti salah (false). Karena syarat perulangan tidak terpenuhi sejak awal, maka loop tidak pernah dijalankan.Jadi, logikanya adalah — perulangan hanya akan berjalan kalau kondisi yang diberikan bernilai benar (true).
3. Jika pada perulangan for, kondisi step i++ diubah menjadi i-- apa akibatnya?Mengapa demikian?
Jawab: Kalau bagian i++ diubah jadi i--, maka nilai i akan terus berkurang setiap perulangan, bukan bertambah. Karena kondisi loop adalah i <= N, maka program tidak akan pernah berhenti (infinite loop).Hal ini disebabkan karena nilai i justru menjauh dari batas N setiap kali diulang. Jadi, selama kondisi selalu benar, program akan terus mencetak bintang tanpa henti.

Pertanyaan Percobaan 2
1. Perhatikkan perulangan luar.Jika pada sintaks for, inisialisasi iOuter=1 diubah menjadi iOuter=0 apa yang akibatnya?Mengapa bisa demikian?
Jawab: kalau inisialisasi iOuter diubah dari 1 menjadi 0, maka hasilnya akan menambah satu baris bintang lagi di awal. Misalnya, kalau N = 5, seharusnya muncul 5 baris, tapi dengan iOuter=0 maka akan muncul 6 baris.
Hal ini karena perulangan dimulai dari angka 0 dan berhenti saat iOuter melebihi N. Jadi totalnya bukan 5 kali, tapi 6 kali. Perubahan nilai awal ini langsung berpengaruh ke jumlah baris yang dicetak.
2. Kembalikan program semula dimana inisialisasi iOuter=1. Kemudian perhatikan perulangan dalam,Jika pada sintaks for, inisialisasi i=1 diubah menjadi i=0, apa yang akibatnya?Mengapa bisa demikian?
Jawab: efeknya mirip seperti sebelumnya, tapi kali ini yang bertambah bukan barisnya, melainkan kolomnya. Setiap baris akan berisi satu bintang lebih banyak.Misalnya N=4, maka hasilnya jadi 5 bintang per baris. Karena loop dalam (inner loop) mencetak dari 0 sampai 4, jadi jumlahnya jadi N+1.Kesimpulannya, setiap perulangan yang dimulai dari 0 akan menambah satu kali 
3. Jadi,apakah perbedaan kegunaan antara perulangan luar dengan perulangan yang berada didalamnya?
Jawab: jadi perbedaan nya adalah perulangan luar berfungsi untuk mengatur baris, sedangkan perulangan dalam berfungsi untuk mengatur kolom atau isi dari baris tersebut.
