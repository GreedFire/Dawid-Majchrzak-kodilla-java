package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public final static String SHOPPINGTASK = "Shopping Task";
    public final static String PAINTINGTASK = "Painting Task";
    public final static String DRIVINGTASK = "Driving Task";

    public final Task makeTask(final String kindOfTask){
        switch(kindOfTask){
            case SHOPPINGTASK:
                return new ShoppingTask("Milk buy task", "milk", 3);
            case PAINTINGTASK:
                return new PaintingTask("Paint Car", "red", "ferrari");
            case DRIVINGTASK:
                return new DrivingTask("Taxi", "Warsaw", "Fiat");
            default: return null;
        }
    }
}
