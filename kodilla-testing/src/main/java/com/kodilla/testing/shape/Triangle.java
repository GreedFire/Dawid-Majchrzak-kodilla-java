package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private double sideLength;
    private double height;
    private double field;

    public Triangle(double sideLength, double height){
        this.sideLength = sideLength;
        this.height = height;
        this.field = (sideLength * height)/2;
    }

    public String getShapeName(){
        return "triangle";
    }

    public double getField(){
        return this.field;
    }

    public double getSideLength() {
        return sideLength;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.getSideLength(), getSideLength()) == 0 &&
                Double.compare(triangle.getHeight(), getHeight()) == 0 &&
                Double.compare(triangle.getField(), getField()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSideLength(), getHeight(), getField());
    }

    @Override
    public String toString() {
        return getShapeName() +
                " sideLength=" + sideLength +
                ", height=" + height +
                ", field=" + field;
    }
}
