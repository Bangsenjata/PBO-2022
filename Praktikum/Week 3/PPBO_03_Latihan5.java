// Nama : Gita Bangun Prakoso
// NIM  : M0521024

import java.util.concurrent.TimeUnit;

public class PPBO_03_Latihan5 {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if((i % 3 == 0) & i> 0 & i < 301){
            System.out.println("Hello ke-" + i);
            i++;
            }
            else{
                i++;
            }
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (Exception x) {
                x.printStackTrace();
            }
        }
    }
}

// Source code berikut ini akan menampilkan tulisan "Hello ke-" yang diulang-ulang sampai
// program diterminate secara manual oleh user.

// Ubahlah source code tersebut agar :
// - hanya menampilkan indeks bilangan kelipatan 3
// - berhenti setelah menampilkan output "Hello ke-300"

// ==> Output yang diharapkan:
// Hello ke-3
// Hello ke-6
// Hello ke-9
// ...
// ...
// Hello ke-300

// HINT: 
// - tekan ctrl + c (vscode) pada terminal untuk menghentikan paksa jalannya program
// - statemen TimeUnit.SECONDS.sleep(2) membuat jalannya program memiliki delay 2 detik,
//   kalian bisa memodifikasinya sementara untuk keperluan debugging