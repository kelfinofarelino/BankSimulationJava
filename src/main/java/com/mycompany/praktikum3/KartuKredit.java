/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum3;

/**
 *
 * @author USER
 */
public class KartuKredit implements TransaksiATM {
    int tagihan = 0;

    @Override
    public void tarikTunai(int nominal) {
        tagihan += (nominal + 25000);
        System.out.println("Berhasil tarik tunai dari kartu kredit! Tagihan sekarang: Rp. " + tagihan);
    }
    
    
}
