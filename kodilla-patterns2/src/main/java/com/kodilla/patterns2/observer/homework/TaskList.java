package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class TaskList implements Observable {
    private String name;
    private ArrayDeque<Task> tasks;
    private List<Observer> observers;

    public TaskList(String name) {
        this.name = name;
        this.tasks = new ArrayDeque<Task>();
        this.observers = new ArrayList<>();
    }

    public void addTask(Task task){
        tasks.offer(task);
        notifyObservers();
    }

    public String getName() {
        return name;
    }

    public ArrayDeque<Task> getTasks() {
        return tasks;
    }

    @Override
    public void registerOvserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
