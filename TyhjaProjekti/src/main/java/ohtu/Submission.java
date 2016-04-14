package ohtu;

import java.util.*;

public class Submission {

    private String student_number;
    private String week;
    private int hours;
    private boolean a1;
    private boolean a2;
    private boolean a3;
    private boolean a4;
    private boolean a5;
    private boolean a6;
    private boolean a7;
    private boolean a8;
    private boolean a9;
    private boolean a10;
    private boolean a11;
    private boolean a12;
    private boolean a13;
    private boolean a14;
    private boolean a15;
    private boolean a16;
    private boolean a17;
    private boolean a18;
    private boolean a19;
    private boolean a20;
    private boolean a21;

    private int count;

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    public int getCount() {
        return this.count;
    }
    
    public int getHours() {
        return this.hours;
    }
    
    @Override
    public String toString() {
        String doneAssignemnts = done();
        return " viikko " + this.week + ": tehtyjä tehtäviä yhteensä: " + this.count + ", aikaa kului " + hours + " tuntia, tehdyt tehävät:" + doneAssignemnts;
    }

    private String done() {
        this.count = 0;
        String done = "";
        if (a1) {
            done += " 1";
            this.count++;
        }
        if (a2) {
            done += " 2";
            this.count++;
        }
        if (a3) {
            done += " 3";
            this.count++;
        }
        if (a4) {
            done += " 4";
            this.count++;
        }
        if (a5) {
            done += " 5";
            this.count++;
        }
        if (a6) {
            done += " 6";
            this.count++;
        }
        if (a7) {
            done += " 7";
            this.count++;
        }
        if (a8) {
            done += " 8";
            this.count++;
        }
        if (a9) {
            done += " 9";
            this.count++;
        }
        if (a10) {
            done += " 10";
            this.count++;
        }
        if (a11) {
            done += " 11";
            this.count++;
        }
        if (a12) {
            done += " 12";
            this.count++;
        }
        if (a13) {
            done += " 13";
            this.count++;
        }
        if (a14) {
            done += " 14";
            this.count++;
        }
        if (a15) {
            done += " 15";
            this.count++;
        }
        if (a16) {
            done += " 16";
            this.count++;
        }
        if (a17) {
            done += " 17";
            this.count++;
        }
        if (a18) {
            done += " 18";
            this.count++;
        }
        if (a19) {
            done += " 19";
            this.count++;
        }
        if (a20) {
            done += " 20";
            this.count++;
        }
        if (a21) {
            done += " 21";
            this.count++;
        }
        return done;
    }
}
