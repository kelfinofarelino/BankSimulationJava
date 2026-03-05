package com.mycompany.praktikum3;

public interface TransaksiATM {
    // Method tanpa isi (kontrak)
    void tarikTunai(int nominal) throws SaldoTidakCukup;
}