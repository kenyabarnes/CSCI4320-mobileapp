package com.CSCI4320.journal_app.data.db;

import androidx.room.Room;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4ClassRunner.class)
public class AppDatabaseIT {

    @Test
    public void createDatabase() {
        AppDatabase db = Room.databaseBuilder(null, AppDatabase.class, "test-database").build();
        Assert.assertNotNull(db);
    }
}
