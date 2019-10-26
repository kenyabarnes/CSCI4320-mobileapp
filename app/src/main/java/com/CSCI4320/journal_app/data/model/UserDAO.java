package com.example.login.data.model;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDAO {

    @Query("SELECT * FROM User")
    User getUsername();

    @Query("SELECT * FROM User")
    User getPassword();

    @Query("SELECT * FROM User WHERE id LIKE :userId")
    User getUser(int userId);

    @Insert
    void insert(User user);

    @Delete
    void delete(User user);

}
