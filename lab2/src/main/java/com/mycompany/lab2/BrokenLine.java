/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab2;

import java.util.LinkedList;
import java.util.Objects;


public class BrokenLine {

    protected class Point {

        public double x;
        public double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Point other = (Point) obj;
            if (!(x == other.x && y == other.y)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "X= " + x + " Y= " + y;
        }

    }

    protected LinkedList<Point> pointList = new LinkedList<>();

    public BrokenLine() {
        pointList.add(new Point(1.0, 2.0));
        pointList.add(new Point(3.0, 4.0));
    }

    public BrokenLine(Point a, Point b) {
        pointList.add(a);
        pointList.add(b);
    }

    public BrokenLine(LinkedList<Point> points) {
        this.pointList = points;
    }

    public BrokenLine(BrokenLine brokenLine) {
        this(brokenLine.getPoints());
    }

    public void addNewPoint(double x, double y) {
        pointList.add(new Point(x, y));
    }

    public void removePoint(double x, double y) {
        pointList.remove(new Point(x, y));
    }

    public double getLength() {
        double res = 0;
        for (int i = 0; i < pointList.size() - 1; i++) {
            res += Math.sqrt(Math.pow((pointList.get(i + 1).x - pointList.get(i).x), 2) + Math.pow((pointList.get(i + 1).y - pointList.get(i).y), 2));
        }
        return res;
    }

    public String getAllPointsString() {
        String res = "";
        for (Point p : pointList) {
            res += " Point " + pointList.indexOf(p) + "(" + p + ") ";
        }
        return res;
    }

    public String callAllMethodsAndGetClassName() {
        String res = this.getClass().getName() + "\n ______________\n";
        res += "Method getLenght: " + getLength() + "\n";
        res += "Method getAllPointsString: " + getAllPointsString() + "\n";
        res += "Method toString: " + toString() + "\n";
        res += "Method hashCode: " + hashCode() + "\n";
        res += "___________________\n";
        return res;
    }

    @Override
    public String toString() {
        return "line from "
                + "point x1 = " + pointList.get(0).x + " y1 = " + pointList.get(0).y
                + " to point x" + pointList.size() + " = " + pointList.getLast().x
                + " y" + pointList.size() + " = " + pointList.getLast().y;
    }

    @Override
    public int hashCode() {
        return ((int) getLength() * 7 * pointList.size()) % 178;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BrokenLine other = (BrokenLine) obj;
        if (!Objects.equals(this.pointList, other.pointList)) {
            return false;
        }
        return true;
    }

    public LinkedList<Point> getPoints() {
        return pointList;
    }

    public static double getLengthBetween(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
