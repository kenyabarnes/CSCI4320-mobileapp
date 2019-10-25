package com.CSCI4320.journal_app.data.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "DeviceLog",
        foreignKeys = { @ForeignKey(entity = Device.class, parentColumns = "id", childColumns = "deviceId"),
                        @ForeignKey(entity = User.class, parentColumns = "id", childColumns = "userId")})
public class DeviceLog {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    public int logId;

    @ColumnInfo(name = "deviceId")
    public int deviceId;

    @ColumnInfo(name = "userId")
    public int userId;

    @ColumnInfo(name = "date")
    public String date;

    @ColumnInfo(name = "message")
    public String message;
}
