package com.mycompany.praktikum3;

public class Tabungan extends AkunRekening implements TransaksiATM {

    public Tabungan(int saldoAwal, String nama, String no_rek) {
        super(saldoAwal, nama, no_rek);
    }

    // Implementasi method dari Interface TransaksiATM
    @Override
    public void tarikTunai(int nominal) throws SaldoTidakCukup {
        if (nominal > saldo) {
            // Jika saldo kurang, lempar exception
            throw new SaldoTidakCukup("Gagal Menarik! Saldo anda hanya: Rp. " + saldo);
        } else {
            // Jika saldo cukup, lakukan transaksi
            saldo -= nominal;
            System.out.println("Berhasil menarik tunai: Rp. " + nominal);
            System.out.println("Sisa saldo: Rp. " + saldo);
        }
    }

    @Override
    public void cetakBukti() {
        System.out.println("=== BUKTI TRANSAKSI TABUNGAN ===");
        System.out.println("Nama Pelanggan : " + nama);
        System.out.println("Nomor Rekening : " + getSecretNoRek()); 
        System.out.println("Saldo Terakhir : Rp. " + saldo);
        System.out.println("--------------------------------");
    }
}