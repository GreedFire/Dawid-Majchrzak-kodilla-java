package com.kodilla.patterns2.observer.homework;

public class Teacher implements Observer {
    private String name;
    private int updateCount;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(TaskList taskList) {
        System.out.println(name + ": New tasks in tasklist:  " + taskList.getName() + " \n" +
                "total: " + taskList.getTasks().size() + " tasks");
        updateCount++;
    }
}
