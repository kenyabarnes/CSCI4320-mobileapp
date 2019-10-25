package com.CSCI4320.journal_app.data.model;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface JournalEntryDAO {

    @Query("SELECT * FROM JournalEntry")
    List<JournalEntry> getAll();

    @Query("SELECT * FROM JournalEntry WHERE journalId LIKE :journalId AND userId LIKE :userId")
    List<JournalEntry> getAllByJournalId(int journalId,  int userId);

    @Query("SELECT * FROM JournalEntry WHERE id LIKE :journalEntryId AND journalId LIKE :journalId AND userId LIKE :userId")
    JournalEntry getJournalEntry(int journalEntryId, int journalId, int userId);

    @Insert
    void insert(JournalEntry journalEntry);

    @Delete
    void delete(JournalEntry journalEntry);
}
