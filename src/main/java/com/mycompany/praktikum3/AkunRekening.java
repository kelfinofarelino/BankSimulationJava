package com.mycompany.praktikum3;

public abstract class AkunRekening  {
    public String nama;
    protected String no_rek; // Diubah ke protected agar anak class bisa akses
    protected int saldo;
    
    public AkunRekening(int saldoAwal, String nama, String no_rek){
        this.saldo = saldoAwal;
        this.no_rek = no_rek;
        this.nama = nama;
    }
    
    public String getSecretNoRek() {
        return no_rek.substring (0, 3) + "****";
    }
    
    public void cekSaldo(){
        System.out.println("Saldo anda: Rp. " + saldo);
    }
    
    // Method ini wajib dibuat isinya di class anak
    public abstract void cetakBukti();
}