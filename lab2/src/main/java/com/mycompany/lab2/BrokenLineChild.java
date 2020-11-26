/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab2;

import java.util.LinkedList;

public class BrokenLineChild extends BrokenLine {

    public BrokenLineChild() {
        super();
    }

    public BrokenLineChild(Point a, Point b) {
        super(a, b);
    }

    public BrokenLineChild(LinkedList<Point> points) {
        super(points);
    }

    public BrokenLineChild(BrokenLineChild brokenLineChild) {
        this(brokenLineChild.getPoints());
    }

    public String checkUniquePoints() {
        String res = "";
        for (Point p : pointList) {
            int counter = 0;
            for (int i = 0; i < pointList.size(); i++) {
                if (p.equals(pointList.get(i))) {
                    counter++;
                }
            }
            if (counter > 1) {
                res += "Point " + p + "\n";
            }
        }
        if (res.equals("")) {
            return "No same points";
        }
        return res;
    }

    @Override
    public String callAllMethodsAndGetClassName() {
        String res = this.getClass().getName() + "\n ______________\n";
        res += "Method getLenght: " + getLength() + "\n";
        res += "Method getAllPointsString: " + getAllPointsString() + "\n";
        res += "Method toString: " + toString() + "\n";
        res += "Method hashCode: " + hashCode() + "\n";
        res+= "Method checkUniquePoints: " + checkUniquePoints()+ "\n";
        res += "___________________\n";
        return res;
    }
    
    
    @Override
    public String toString() {
        return "line with length " + getLength()
                + " from point x1 = " + pointList.get(0).x + " y1 = " + pointList.get(0).y
                + " to point x" + pointList.size() + " = " + pointList.getLast().x
                + " y" + pointList.size() + " = " + pointList.getLast().y;
    }
}
