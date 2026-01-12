package com.nbratti;

public class Process {
    //base variables
    private State state;
    private String name;
    private int timeSurge;
    private int timeIO;
    private int estimatedTotalProcessingTime;
    private int order;
    private int priority;
    private int credit;

    //auxiliary variables
    private int runTime;
    private int timeIOExecuted;

    //constructor
    public Process(String name, int estimatedTotalProcessingTime, int order, int priority) {
        this.state = State.READY;
        this.name = name;
        this.estimatedTotalProcessingTime = estimatedTotalProcessingTime;
        this.order = order;
        this.priority = priority;

        this.runTime = 0;

        this.credit = priority;
    }

    //getters and setters
    public State getState() {
        return state;
    }

    public void setStateReady() {
        this.state = State.READY;
    }

    public void setStateRunning() {
        this.state = State.RUNNING;
    }

    public void setStateBlocked() {
        this.state = State.BLOCKED;
    }

    public void setStateExit() {
        this.state = State.EXIT;
    }

    public String getName() {
        return name;
    }

    public int getTimeSurge() {
        return timeSurge;
    }

    public int getTimeIO() {
        return timeIO;
    }

    public int getEstimatedTotalProcessingTime() {
        return estimatedTotalProcessingTime;
    }

    public int getPriority() {
        return priority;
    }

    public int getOrder() {
        return order;
    }

    public int getCredit() {
        return credit;
    }

    public void run() {
        this.credit = credit - 1;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    public int getTimeIOExecuted() {
        return timeIOExecuted;
    }

    public void setTimeIOExecuted(int timeIOExecuted) {
        this.timeIOExecuted = timeIOExecuted;
    }


}
