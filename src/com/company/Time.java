package com.company;

public class Time {
    private int hour;
    private int second;
    private int minute;

    public void setTime(int hour, int minute, int second){
        if(hour < 0 || hour >= 24 || second < 0 || second >= 60 || minute < 0 || minute >= 60 ){
            throw new IllegalArgumentException("hour, minute or second is not appropriate");
        }
        this.hour = hour;
        this.second = second;
        this.minute = minute;
    }
    public String toUnıversalString(){
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }

    public String toString(){
        return String.format("%02d:%02d:%02d %s",((hour == 0 || hour == 12) ? 12 : hour % 12 ), minute,second,(hour <12 ? "AM" : "PM"));
    }
}
