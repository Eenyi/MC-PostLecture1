package com.example.postlecture1;

import android.database.sqlite.SQLiteDatabase;

public class Students {
    String Name;
    String RollNumber;
    String Degree;

    Students(String n, String r, String d) {
        this.Name = n;
        this.RollNumber = r;
        this.Degree = d;
    }
    Students() {
        this.Name = "Syed Inshal";
        this.RollNumber = "BITF19A004";
        this.Degree = "BSIT";
    }

    public String getName() {
        return Name;
    }

    public String getRollNumber() {
        return RollNumber;
    }

    public String getDegree() {
        return Degree;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setRollNumber(String rollNumber) {
        RollNumber = rollNumber;
    }

    public void setDegree(String degree) {
        Degree = degree;
    }


}

