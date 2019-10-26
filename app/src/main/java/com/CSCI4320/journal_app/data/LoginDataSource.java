package com.example.login.data;

import com.example.login.data.model.LoggedInUser;
import com.example.login.data.model.User;
import com.example.login.data.model.UserDAO;

import java.io.IOException;


/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public abstract class LoginDataSource extends User implements UserDAO{
    public abstract Result<LoggedInUser> login(String password);

    public Result.Error login(User password, User username) {

        try {
            if(username == getUsername() && password == getPassword()) {
                 System.out.print("Success");
             }

        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
        return null;
    }

    public void logout() {
        // TODO: revoke authentication
    }

}
