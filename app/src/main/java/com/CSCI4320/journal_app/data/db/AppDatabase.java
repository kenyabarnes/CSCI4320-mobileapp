package com.CSCI4320.journal_app.data.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.CSCI4320.journal_app.data.model.Device;
import com.CSCI4320.journal_app.data.model.DeviceDAO;
import com.CSCI4320.journal_app.data.model.DeviceLog;
import com.CSCI4320.journal_app.data.model.Journal;
import com.CSCI4320.journal_app.data.model.JournalDAO;
import com.CSCI4320.journal_app.data.model.JournalEntry;
import com.CSCI4320.journal_app.data.model.JournalEntryDAO;
import com.CSCI4320.journal_app.data.model.User;
import com.CSCI4320.journal_app.data.model.UserDAO;


@Database(  entities = {Device.class, DeviceLog.class, Journal.class, JournalEntry.class, User.class},
            version = 1,
            exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDAO userDAO();
    public abstract DeviceDAO deviceDAO();
    public abstract JournalDAO journalDAO();
    public abstract JournalEntryDAO journalEntryDAO();

}
