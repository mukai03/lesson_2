package com.company;

public class Rectangle extends Figure{
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        this.setPerimeter(calculatePerimeter());

    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return (length + width) * 2;
    }

    @Override
    public String info() {
        return "Rectangle length: " + length + unit +
                "\n width: " + width + unit +
                "\n perimeter: " + getPerimeter() + unit +
                "\n area: " + calculateArea();
    }
}
