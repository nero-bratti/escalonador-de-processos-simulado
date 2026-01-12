package com.nbratti;

import java.util.PriorityQueue;

public class Scheduler {
    private Process processRunning;
    private PriorityQueue<Process> processesReady;
    private PriorityQueue<Process> processesBlocked;


    void runScheduler(){
        while(!finishedRunning()){
            processRunning.run();
        }
        System.out.println("Todos os processos foram executados");
    }

    void addProcess(Process process){
        processesReady.add(process);
    }

    boolean finishedRunning(){
        return processesReady.isEmpty() && processesBlocked.isEmpty();
    }

    void validateProcesses(){

    }
}
