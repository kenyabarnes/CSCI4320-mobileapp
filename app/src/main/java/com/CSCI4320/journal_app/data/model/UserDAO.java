package com.CSCI4320.journal_app.data.model;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDAO {

    @Query("SELECT * FROM User")
    List<User> getAll();

    @Query("SELECT * FROM User WHERE id LIKE :userId")
    User getUser(int userId);

    @Insert
    void insert(User user);

    @Delete
    void delete(User user);

}
