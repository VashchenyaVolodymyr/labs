/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Customer extends Thread {

    private final Tmp tmp;

    Customer(Tmp tmp) {
        this.tmp = tmp;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            tmp.get();
            try {
                sleep((int) (Math.random() * 1000));
            } catch (InterruptedException ex) {
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
