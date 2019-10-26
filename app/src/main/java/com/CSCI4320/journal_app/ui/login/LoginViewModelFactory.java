package com.example.login.ui.login;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.annotation.NonNull;

import com.example.login.data.LoginDataSource;
import com.example.login.data.LoginRepository;
import com.example.login.data.Result;
import com.example.login.data.model.LoggedInUser;
import com.example.login.data.model.User;

/**
 * ViewModel provider factory to instantiate LoginViewModel.
 * Required given LoginViewModel has a non-empty constructor
 */
public class LoginViewModelFactory implements ViewModelProvider.Factory {

    @NonNull
    @Override
    @SuppressWarnings("unchecked")
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(LoginViewModel.class)) {
            return (T) new LoginViewModel(LoginRepository.getInstance(new LoginDataSource() {
                @Override
                public Result<LoggedInUser> login(String password) {
                    return null;
                }

                @Override
                public User getUsername() {
                    return null;
                }

                @Override
                public User getPassword() {
                    return null;
                }

                @Override
                public User getUser(int userId) {
                    return null;
                }

                @Override
                public void insert(User user) {

                }

                @Override
                public void delete(User user) {

                }
            }));
        } else {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
    }
}
