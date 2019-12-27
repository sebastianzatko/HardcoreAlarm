package com.example.alarm.Components.Deactivation;

public class StepDeactivator extends Deactivation {

    //Cada metodo de desactivacion deberia tener una pantalla propia
    //private screnn Display
    private int stepCountCurrent;
    private int stepCountRequired;

    @Override
    void deactivateAlarm() {

    }
    @Override
    void showDisplay(){

    }

    public void resetStepCountCurrent(){
        this.stepCountCurrent=0;
    }
    public void addStep(){
        this.stepCountCurrent=this.stepCountCurrent+1;
        if(this.stepCountCurrent>=this.stepCountRequired){
            this.deactivateAlarm();
        }
    }

    //Getters
    public int getStepCountCurrent() {
        return stepCountCurrent;
    }

    public int getStepCountRequired() {
        return stepCountRequired;
    }

    //Setters

    public void setStepCountCurrent(int count){
        this.stepCountCurrent=count;
    }

    public void setStepCountRequired(int required){
        this.stepCountRequired=required;
    }

}
