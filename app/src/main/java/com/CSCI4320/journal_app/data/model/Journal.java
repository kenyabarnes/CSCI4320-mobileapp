package com.CSCI4320.journal_app.data.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "Journal",
        foreignKeys = @ForeignKey(entity = User.class, parentColumns = "id", childColumns = "userId"))
public class Journal {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    public int journalId;

    @ColumnInfo(name = "userId")
    public int userId;

}
