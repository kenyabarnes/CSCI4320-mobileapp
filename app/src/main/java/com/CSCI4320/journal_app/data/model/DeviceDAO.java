package com.CSCI4320.journal_app.data.model;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DeviceDAO {

    @Query("SELECT * FROM Device")
    List<Device> getAll();

    @Query("SELECT * FROM Device WHERE userId LIKE :userId")
    List<Device> getAllByUserId(int userId);

    @Query("SELECT * FROM Device WHERE id LIKE :deviceId")
    Device getDeviceById(int deviceId);

    @Insert
    void insert(Device device);

    @Delete
    void delete(Device device);
}
