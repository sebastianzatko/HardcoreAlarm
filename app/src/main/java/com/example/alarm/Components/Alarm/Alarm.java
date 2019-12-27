package com.example.alarm.Components.Alarm;

import com.example.alarm.Components.Deactivation.Deactivation;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

public class Alarm {

    //Identifier
    private UUID identifier;

    //Date properties
    private Calendar hourAndMinute;
    private ArrayList<Calendar> repeatDays;
    private int snozzeTime;

    //Properties
    private boolean snozze;
    private boolean active;
    private Deactivation deactivationMethod;

    //Tone
    private String toneDirectory;
    private boolean vibration;
    private int volume;

    //Opcional
    private String name;



    public Alarm(){

    }


    public void activate(){

    }



    //Getters
    public String getName(){
        return this.name;
    }
    public String getToneDirectory(){
        return this.toneDirectory;
    }

    public boolean getVibration(){
        return this.vibration;
    }

    public int getVolume(){
        return this.volume;
    }

    public boolean getSnozze(){
        return this.snozze;
    }

    public Calendar getHourAndMinute() {
        return this.hourAndMinute;
    }
    public ArrayList<Calendar> getRepeatDays(){
        return this.repeatDays;
    }
    public boolean isActive(){
        return this.active;
    }
    public Deactivation getDeactivationMethod(){
        return this.deactivationMethod;
    }
    public UUID getIdentifier(){
        return this.identifier;
    }
    public int getSnozzeTime(){
        return this.snozzeTime;
    }

    //Setters

    public void setName(String name){
        this.name=name;
    }
    public void setVolume(int volume){
        this.volume=volume;
    }
    public void setVibration(boolean vibration){
        this.vibration=vibration;
    }
    public void setSnozze(boolean snozze){
        this.snozze=snozze;
    }
    public void setToneDirectory(String toneDirectory){
        this.toneDirectory=toneDirectory;
    }
    public void setHourAndMinute(Calendar hourAndMinute){
        this.hourAndMinute=hourAndMinute;
    }
    public void setRepeatDays(ArrayList<Calendar> repeatDays){
        this.repeatDays=repeatDays;
    }
    public void setActive(boolean active){
        this.active=active;
    }
    public void setDeactivationMethod(Deactivation deactivationMethod){
        this.deactivationMethod=deactivationMethod;
    }
    public void setIdentifier(UUID identifier){
        this.identifier=identifier;
    }
    public void setSnozzeTime(int time){
        this.snozzeTime=time;
    }


}
