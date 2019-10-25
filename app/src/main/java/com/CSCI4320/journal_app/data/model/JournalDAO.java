package com.CSCI4320.journal_app.data.model;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface JournalDAO {

    @Query("SELECT * FROM Journal")
    List<Journal> getAll();

    @Query("SELECT * FROM Journal WHERE userId LIKE :userId")
    List<Journal> getAllByUserId(int userId);

    @Query("SELECT * FROM Journal WHERE id LIKE :journalId AND userId LIKE :userId")
    Journal getJournal(int journalId, int userId);

    @Insert
    void insert(Journal journal);

    @Delete
    void delete(Journal journal);
}
