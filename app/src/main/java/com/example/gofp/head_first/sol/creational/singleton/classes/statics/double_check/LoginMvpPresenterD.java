package com.example.gofp.head_first.sol.creational.singleton.classes.statics.double_check;

public class LoginMvpPresenterD {
    private static volatile LoginMvpPresenterD instance;

    private LoginMvpPresenterD() {
        if (instance != null) {
            throw new RuntimeException();  // сюда заходим только 1 раз
        }
    }

    public static LoginMvpPresenterD getInstance() {
        LoginMvpPresenterD localRef = instance;
        if (localRef == null) {
            synchronized (LoginMvpPresenterD.class) {
                localRef = instance;
                if (localRef == null)
                    instance = localRef = new LoginMvpPresenterD();
            }
        }
        return localRef;
    }

    protected Object readResolve() {
        return getInstance();
    }
}
