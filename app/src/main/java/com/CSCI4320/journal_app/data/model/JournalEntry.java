package com.CSCI4320.journal_app.data.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "JournalEntry",
        foreignKeys = {@ForeignKey(entity = User.class, parentColumns = "id", childColumns = "userId"),
        @ForeignKey(entity = Journal.class, parentColumns = "id", childColumns = "journalId")})

public class JournalEntry {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    public int journalEntryId;

    @ColumnInfo(name = "userId")
    public int userId;

    @ColumnInfo(name = "journalId")
    public int journalId;

    @ColumnInfo(name = "content")
    public String content;
}
