package com.company;

public class Main {

    public static void main(String[] args) {
        Figure[] figures = {
                new Rectangle(5.0, 10.0),
                new Rectangle(10.0, 20.0),
                new Square(2.5),
                new Square(5.0),
                new Square(10.0)};
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].info());
        }




    }
}
