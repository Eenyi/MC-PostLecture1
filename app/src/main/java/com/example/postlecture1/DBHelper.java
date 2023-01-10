package com.example.postlecture1;
import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class DBHelper extends SQLiteOpenHelper {

//    public DBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
//        super(context, name, factory, version);
//    }
//
//    public DBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version, @Nullable DatabaseErrorHandler errorHandler) {
//        super(context, name, factory, version, errorHandler);
//    }

    public DBHelper(@Nullable Context context) {
        super(context, "Dumy.DB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable =
                "CREATE TABLE Student ( sid Integer PRIMARY KEY AUTOINCREMENT, name Text, rollno Text, degree Text);";
        db.execSQL(createTable);
        String insertTable =
                "INSERT INTO Student (name,  rollno,  degree ) values ('HASSAN RAZA','BITF19A023','BSIT')";
        db.execSQL(insertTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        String createTable =
//                "INSERT INTO Student (name,  rollno,  degree ) values ('HASSAN RAZA','BITF19A023','BSIT')";
//        db.execSQL(createTable);
    }

//    public boolean addStudent(Students std) {
//        SQLiteDatabase db = this.getWritableDatabase();
//        ContentValues cv = new ContentValues();
//
//        cv.put(Name, st);
//        cv.put();
//        cv.put();
//    }
}
