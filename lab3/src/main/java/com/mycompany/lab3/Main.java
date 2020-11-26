/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab3;

public class Main {

    public static void main(String[] args) {
        Tmp tmp = new Tmp();
        Author author = new Author(tmp);
        Customer customer = new Customer(tmp);
        new Thread(author).start();
        new Thread(customer).start();
    }
}
