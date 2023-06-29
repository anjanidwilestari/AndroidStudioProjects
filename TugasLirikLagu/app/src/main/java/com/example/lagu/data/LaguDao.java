package com.example.lagu.data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface LaguDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insertLagu(Lagu lagu);
    
    @Query("SELECT * FROM lagu")
    List<Lagu> selectAllLagus();

    @Query("SELECT * FROM lagu LIMIT 1")
    Lagu selectOne();

    @Delete
    void delete(Lagu lagu);
}
