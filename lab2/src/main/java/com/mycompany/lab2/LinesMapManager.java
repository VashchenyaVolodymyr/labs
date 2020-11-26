/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab2;

import java.util.HashMap;
import java.util.Set;


public class LinesMapManager {

    public static HashMap<String, BrokenLine> getUniqueKeys(HashMap<String, BrokenLine> h1, HashMap<String, BrokenLine> h2) {
        HashMap<String, BrokenLine> res = new HashMap<>();
        Set<String> keySet1 = h1.keySet();
        Set<String> keySet2 = h2.keySet();

        for (String s : keySet1) {
            if (keySet2.contains(s)) {
                keySet1.remove(s);
            }
        }
        for (String s : keySet1) {
            res.put(s, h1.get(s));
        }
        return res;
    }

    public static BrokenLine getByKey(String key, HashMap<String, BrokenLine> h1) {
        return h1.get(key);
    }

    public static String getByValue(BrokenLine value, HashMap<String, BrokenLine> h1) {
        Set<String> keySet1 = h1.keySet();
        String res = "";
        for (String s : keySet1) {
            if (h1.get(s).equals(value)) {
                res = s;
            }
        }
        return res;
    }
}
