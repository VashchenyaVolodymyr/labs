/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab2;

import java.util.HashMap;
import java.util.LinkedList;


public class Main {

    public static void main(String[] args) {
        System.out.println("Length between A(1;2) and B(3;4) = " + BrokenLine.getLengthBetween(1, 2, 3, 4));

        BrokenLine brokenLine = new BrokenLine();
        System.out.println("Default BrokenLine class string: " + brokenLine);

        brokenLine.addNewPoint(5, 7);
        System.out.println("Broken line with new (5;7) point to string: " + brokenLine);

        System.out.println("Broken line all points: " + brokenLine.getAllPointsString());

        System.out.println("Broken line length: " + brokenLine.getLength());

        brokenLine.removePoint(5, 7);
        System.out.println("Broken line with removing (5;7) point to string: " + brokenLine);
        System.out.println("Broken line length without (5;7): " + brokenLine.getLength());

        System.out.println("_______________________________________");

        BrokenLineChild brokenLineChild = new BrokenLineChild();
        System.out.println("Default BrokenLineChild class string: " + brokenLineChild);

        brokenLineChild.addNewPoint(5, 7);
        System.out.println("BrokenLineChild with new (5;7) point to string: " + brokenLineChild);

        brokenLineChild.removePoint(5, 7);
        System.out.println("BrokenLineChild with removing (5;7) point to string: " + brokenLineChild);

        brokenLineChild.addNewPoint(1, 2);
        System.out.println("BrokenLineChild check same points : " + brokenLineChild.checkUniquePoints());

        System.out.println("______________________________________________");

        LinkedList<BrokenLine> brokenLines = new LinkedList<>();
        brokenLines.add(brokenLine);
        brokenLines.add(brokenLineChild);
        brokenLines.forEach((b) -> {
            System.out.println(b.callAllMethodsAndGetClassName());
        });

        brokenLines.add(new BrokenLine());
        System.out.println("Broken lines length list: ");
        brokenLines.forEach((b) -> {
            System.out.println(b.getLength());
        });

        brokenLines = LinesManager.sortLines(brokenLines);

        System.out.println("Broken lines length sorted list: ");
        brokenLines.forEach((b) -> {
            System.out.println(b.getLength());
        });

        LinkedList<BrokenLine> newBrokenLines = new LinkedList<>();
        newBrokenLines.add(brokenLine);
        newBrokenLines.add(brokenLineChild);
        newBrokenLines.add(new BrokenLine());

        System.out.println("Broken lines lengths list: ");
        newBrokenLines.forEach((b) -> {
            System.out.println(b.getLength());
        });

        newBrokenLines = LinesManager.sortLinesCustom(newBrokenLines);

        System.out.println("Broken lines lengths custom sorted list: ");
        newBrokenLines.forEach((b) -> {
            System.out.println(b.getLength());
        });
        System.out.println("______________________________________________");
        HashMap<String, BrokenLine> h1 = new HashMap<>();
        HashMap<String, BrokenLine> h2 = new HashMap<>();
        newBrokenLines.forEach((b) -> {
            h1.put(b.toString(), b);
        });
        BrokenLine blForHash = new BrokenLine();
        h2.put(blForHash.toString(), blForHash);

        System.out.println("h1 key set before getUniqueKeys method: ");
        System.out.println(h1.keySet().toString());

        System.out.println("h1 key set after getUniqueKeys method: ");
        System.out.println(LinesMapManager.getUniqueKeys(h1, h2).keySet().toString());
        
        System.out.println("Get value by key method: ");
        System.out.println(LinesMapManager.getByKey(blForHash.toString(), h2));
        
        System.out.println("Get key by value method: ");
        System.out.println(LinesMapManager.getByValue(blForHash, h2));
    }
}
