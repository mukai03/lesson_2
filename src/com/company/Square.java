package com.company;

public class Square extends Figure{
    private double sideLength;

    public Square(double sideLength){
        this.sideLength = sideLength;
        this.setPerimeter(calculatePerimeter());
    }

    @Override
    public double calculateArea() {
        return sideLength * 2;
    }

    @Override
    public double calculatePerimeter() {
        return sideLength * 4;
    }

    @Override
    public String info() {
        return "Square side length: " + sideLength + unit +
                "\n Perimeter: " + getPerimeter() + unit +
                "\n Area: " + calculateArea() + unit;
    }


}
