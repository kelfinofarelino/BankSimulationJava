# Bank Simulation System - Java (Praktikum PBO)

Proyek ini adalah simulasi sistem perbankan sederhana yang dibuat menggunakan bahasa pemrograman Java. Proyek ini mendemonstrasikan konsep-konsep utama **Object-Oriented Programming (OOP)** seperti *Inheritance*, *Abstraction*, *Interface*, dan *Exception Handling*.

## 🚀 Fitur Utama

- **Sistem Akun Multi-tipe**: Mendukung akun Tabungan dan Deposito.
- **Keamanan Nomor Rekening**: Fitur untuk menyembunyikan sebagian nomor rekening (`getSecretNoRek`).
- **Sistem Transaksi**: Penarikan tunai melalui ATM dan Kartu Kredit.
- **Custom Exception**: Penanganan error khusus jika saldo tidak mencukupi saat penarikan.

## 🛠️ Konsep OOP yang Digunakan

1.  **Abstraction**: Menggunakan class `AkunRekening` sebagai blueprint abstrak.
2.  **Inheritance**: Class `Tabungan` dan `Deposito` mewarisi sifat dari `AkunRekening`.
3.  **Interface**: Menggunakan `TransaksiATM` untuk mendefinisikan kontrak penarikan tunai.
4.  **Polymorphism**: Implementasi method `cetakBukti()` yang berbeda-beda di tiap class anak.
5.  **Exception Handling**: Menggunakan `try-catch` untuk menangani `SaldoTidakCukup`.

## 📂 Struktur File

* `AkunRekening.java` - Abstract class induk.
* `Tabungan.java` - Class untuk akun tabungan reguler.
* `Deposito.java` - Class untuk akun simpanan deposito.
* `KartuKredit.java` - Class untuk simulasi transaksi kartu kredit.
* `TransaksiATM.java` - Interface untuk fungsionalitas ATM.
* `SaldoTidakCukup.java` - Custom Exception class.
* `SimulasiBank.java` - Main class untuk menjalankan program.

## 💻 Cara Menjalankan

1. Clone repository ini:
   ```bash
   git clone [https://github.com/kelfinofarelino/BankSimulationJava.git](https://github.com/kelfinofarelino/BankSimulationJava.git)
