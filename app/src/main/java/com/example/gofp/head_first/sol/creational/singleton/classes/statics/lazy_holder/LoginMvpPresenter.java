package com.example.gofp.head_first.sol.creational.singleton.classes.statics.lazy_holder;

public class LoginMvpPresenter {
    private static final class LazyHolder{
        private static final LoginMvpPresenter INSTANCE = new LoginMvpPresenter();
    }

    public static LoginMvpPresenter getInstance(){
        return LoginMvpPresenter.LazyHolder.INSTANCE;
    }

    protected Object readResolve(){
        return getInstance();
    }
}
