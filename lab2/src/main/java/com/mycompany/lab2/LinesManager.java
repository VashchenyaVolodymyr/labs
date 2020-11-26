/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab2;

import java.util.Collections;
import java.util.LinkedList;

public class LinesManager {

    public static LinkedList<BrokenLine> sortLines(LinkedList<BrokenLine> brokenLines) {
        Collections.sort(brokenLines, (BrokenLine bl, BrokenLine bl2) -> {
            if (bl.getLength() < bl2.getLength()) {
                return 1;
            } else if (bl.getLength() == bl2.getLength()) {
                return 0;
            } else {
                return -1;
            }
        });

        return brokenLines;
    }

    public static LinkedList<BrokenLine> sortLinesCustom(LinkedList<BrokenLine> brokenLines) {
        boolean isSorted = false;
        BrokenLine buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < brokenLines.size() - 1; i++) {
                if (brokenLines.get(i).getLength() < brokenLines.get(i + 1).getLength()) {
                    isSorted = false;
                    buf = brokenLines.get(i);
                    brokenLines.set(i, brokenLines.get(i + 1));
                    brokenLines.set(i + 1, buf);

                }
            }
        }

        return brokenLines;
    }
}
