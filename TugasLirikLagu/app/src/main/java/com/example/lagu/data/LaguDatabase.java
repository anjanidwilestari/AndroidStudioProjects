package com.example.lagu.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Lagu.class}, version = 1)
public abstract class LaguDatabase extends RoomDatabase {
    public abstract LaguDao laguDao();
}
