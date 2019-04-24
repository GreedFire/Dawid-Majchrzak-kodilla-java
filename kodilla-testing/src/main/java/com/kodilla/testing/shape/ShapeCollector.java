package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapeList;

    public ShapeCollector(){
        shapeList = new ArrayList<Shape>();
    }

    public ArrayList<Shape> getShapeList() {
        return shapeList;
    }

    public void addFigure(Shape shape){
        shapeList.add(shape);
    }

    public void removeFigure(Shape shape){
        shapeList.remove(shape);
    }

    public Shape getFigure(int n){
        if(n >= shapeList.size() || n < 0)
            return null;
        else
            return shapeList.get(n);
    }

    public void showFigures(){
        for(Shape x : shapeList){
            System.out.println(x);
        }
    }
}
