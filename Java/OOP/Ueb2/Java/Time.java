package OOP.Ueb2.Java;

import javax.swing.JOptionPane;

public class Time {
    private int hour;
    private int minute;
    private int second;
    private int h = 0;
    private int m = 0;
    private int s = 0;

    //Konstruktoren
    public Time(){
        hour = h;
        minute = m;
        second = s;
    }

    public Time(int second){
        this.second = second;
        minute = m;
        second = s;
    }

    public Time(int second, int minute){
        this.second = second;
        this.minute = minute;
        hour = h;
    }

    public Time(int second, int minute, int hour){
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    //Methoden
    public String toString(){
        String ausgabe = hour+":"+minute+":"+second;
        return ausgabe;
    }

    //Getter
    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

    public Time add (Time Time){
       int h1 = getHour();
       int h2 = h1+Time.getHour();

       int m1 = getMinute();
       int m2 = m1+Time.getMinute();

       int s1 = getSecond();
       int s2 = s1+Time.getSecond();

       return new Time(s2, m2, h2);
    }

    public Time sub (Time Time){
        int h1 = getHour();
        int h2 = h1-Time.getHour();
 
        int m1 = getMinute();
        int m2 = m1-Time.getMinute();
 
        int s1 = getSecond();
        int s2 = s1-Time.getSecond();
 
        return new Time(s2, m2, h2);
     }

     //Main
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(45);
        Time t3 = new Time(5, 2);
        Time t4 = new Time(45, 2, 7);

        Time t5 = t2.add(t3);
        Time t6 = t4.sub(t2);

        JOptionPane.showMessageDialog(null, "Format: <h:m:s>\nTimer 1: "+t1+"\nTimer2: "+t2+"\nTimer3: "+t3+"\nTimer4: "+t4+"\nTimer5: "+t5+"\nTimer6: "+t6, "Umständlicher Stoppuhrdingergedöns - Free Version", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
