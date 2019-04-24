package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {

    private double radius;
    private double field;

    public Circle(double radius){
        this.radius = radius;
        this.field = Math.PI * radius * radius;
    }

    public String getShapeName(){
        return "circle";
    }

    public double getField(){
        return this.field;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.getRadius(), getRadius()) == 0 &&
                Double.compare(circle.getField(), getField()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius(), getField());
    }

    @Override
    public String toString() {
        return getShapeName() +
                " radius=" + radius +
                ", field=" + field;
    }
}
