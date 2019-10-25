package com.CSCI4320.journal_app.data.db;

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import com.CSCI4320.journal_app.data.model.User;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;

import static androidx.test.InstrumentationRegistry.getContext;

@RunWith(AndroidJUnit4ClassRunner.class)
public class AppDatabaseIT {

    AppDatabase db;

    @Before
    public void setup() {
        db = AppDatabase.getAppDatabase(getContext());
    }

    @Test
    public void insertUser() {
        User user = new User();
        user.userId = 1;
        user.firstName = "kenya";
        user.lastName = "barnes";

        db.userDAO().insert(user);

        User returnedUser = db.userDAO().getUser(1);
        Assert.assertEquals(user.userId, returnedUser.userId);
        Assert.assertEquals(user.firstName, returnedUser.firstName);
        Assert.assertEquals(user.lastName, returnedUser.lastName);
    }
}
