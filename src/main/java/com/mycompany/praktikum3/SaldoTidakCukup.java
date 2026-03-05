package com.mycompany.praktikum3;

public class SaldoTidakCukup extends Exception {

    /**
     * Creates a new instance of <code>SaldoTidakCukup</code> without detail
     * message.
     */

    /**
     * Constructs an instance of <code>SaldoTidakCukup</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public SaldoTidakCukup(String msg) {
        super(msg);
    }
}
