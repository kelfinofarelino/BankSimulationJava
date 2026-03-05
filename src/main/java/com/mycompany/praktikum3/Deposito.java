package com.mycompany.praktikum3;

public class Deposito extends AkunRekening {

    public Deposito(int saldoAwal, String nama, String no_rek) {
        super(saldoAwal, nama, no_rek);
    }

    @Override
    public void cetakBukti() {
    System.out.println("=== BUKTI TRANSAKSI ===");
    System.out.println("Nama Pelanggan : " + nama);
    
    // CARA PAKAINYA DI SINI:
    System.out.println("Nomor Rekening : " + getSecretNoRek()); 
    
    System.out.println("Saldo Terakhir : " + saldo);
}
}