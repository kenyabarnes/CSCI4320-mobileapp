package com.CSCI4320.journal_app.data.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "Device", foreignKeys = @ForeignKey(entity = User.class, parentColumns = "id", childColumns = "userId"))
public class Device {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    public int deviceId;

    @ColumnInfo(name = "userId")
    public int userId;

    @ColumnInfo(name = "device_name")
    public String deviceName;

    @ColumnInfo(name = "mac_address")
    public String macAddress;
}
