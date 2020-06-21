package com.example.gofp.head_first.sol.creational.singleton.classes.members.double_check;

public class DoubleCheckFactory {
    private volatile LoginMvpPresenter instance;

    public LoginMvpPresenter getInstance() {
        LoginMvpPresenter localRef = instance;
        if (localRef == null) {
            synchronized (this) {
                localRef = instance;
                if (localRef == null)
                    instance = localRef = new LoginMvpPresenter();
            }
        }
        return localRef;
    }

    public static class LoginMvpPresenter {
        private LoginMvpPresenter() {

        }

    }
}