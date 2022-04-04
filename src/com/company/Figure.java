package com.company;

public abstract class Figure {

    public static String unit = "cm";
    private double perimeter;
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public abstract String info();

    public Figure() {}

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }



}
