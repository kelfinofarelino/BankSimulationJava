package com.mycompany.praktikum3;

public class SimulasiBank {

    public static void main(String[] args) throws SaldoTidakCukup {
        // 1. Membuat objek-objek
        Tabungan tabungan1 = new Tabungan(10000000, "Novrido", "234502034");
        Deposito deposito1 = new Deposito(100000000, "Awang", "123240205");
        KartuKredit kartu1 = new KartuKredit(); // WAJIB DITAMBAH AGAR TIDAK ERROR

        // 2. Eksekusi Cek Saldo Tabungan
        System.out.println("=== Cek Saldo Tabungan ===");
        tabungan1.cekSaldo();
        tabungan1.cetakBukti();
        
        System.out.println(""); 
        
        // 3. Eksekusi Cek Saldo Deposito
        System.out.println("=== Cek Saldo Deposito ===");
        deposito1.cekSaldo();
        deposito1.cetakBukti();
        
        System.out.println("");

        // 4. Transaksi ATM Tabungan
        System.out.println("=== Simulasi ATM Tabungan ===");
        tabungan1.tarikTunai(200000);
        tabungan1.cetakBukti();

        System.out.println("");

        // 5. Transaksi Kartu Kredit
        // Pastikan bagian ini berada SEBELUM tutup kurung main
        System.out.println("=== Transaksi Kartu Kredit ===");
        kartu1.tarikTunai(100000); 
        kartu1.tarikTunai(50000);
        
        // 6. Coba tarik tunai melebihi saldo (misal 1 juta) 
        System.out.println("=== Simulasi ATM dengan Exception ===");
    
        try {
        tabungan1.tarikTunai(100000000); 
        } catch (SaldoTidakCukup e) {
        // Ini akan berjalan jika exception dilempar
        System.err.println("Pesan Error: " + e.getMessage());
        }

        System.out.println("\nProgram tetap berjalan setelah exception ditangani...");
        
    } // Tutup method main (PINDAH KE SINI)
} // Tutup class SimulasiBank