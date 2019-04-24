package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {

    private double sideLength;
    private double field ;

    public Square(double sideLength){
        this.sideLength = sideLength;
        this.field = sideLength * sideLength;
    }

    public String getShapeName(){
        return "square";
    }

    public double getField(){
        return this.field;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return Double.compare(square.getSideLength(), getSideLength()) == 0 &&
                Double.compare(square.getField(), getField()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSideLength(), getField());
    }

    @Override
    public String toString() {
        return  getShapeName() +
                " sideLength=" + sideLength +
                ", field=" + field;
    }
}
