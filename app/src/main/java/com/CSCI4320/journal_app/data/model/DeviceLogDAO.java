package com.CSCI4320.journal_app.data.model;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DeviceLogDAO {

    @Query("SELECT * FROM DeviceLog")
    List<DeviceLog> getAll();

    @Query("SELECT * FROM DeviceLog WHERE deviceId LIKE :deviceId AND userId LIKE :userId")
    List<DeviceLog> getDeviceLog(int deviceId, int userId);

    @Query("SELECT * FROM DeviceLog WHERE id LIKE :id AND deviceId LIKE :deviceId AND userId LIKE :userId")
    DeviceLog getDeviceLog(int id, int deviceId, int userId);

    @Insert
    void insert(DeviceLog deviceLog);

    @Delete
    void delete(DeviceLog deviceLog);

}
