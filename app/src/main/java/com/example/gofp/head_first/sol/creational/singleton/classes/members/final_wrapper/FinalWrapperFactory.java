package com.example.gofp.head_first.sol.creational.singleton.classes.members.final_wrapper;

import java.io.Serializable;

public class FinalWrapperFactory {
    private FinalWrapper<LoginMvpPresenter> wrapper;

    public LoginMvpPresenter getInstance() {
        FinalWrapper<LoginMvpPresenter> localRef = wrapper;
        if (localRef == null) { // check 1
            synchronized (this) {
                localRef = wrapper;
                if (localRef == null) { // check2
                    localRef = new FinalWrapper<>(new LoginMvpPresenter());
                    wrapper = localRef;
                }
            }
        }
        return localRef.instance;
    }

    private static class FinalWrapper<T> {
        public final T instance;                // singleton

        private FinalWrapper(T instance) {
            this.instance = instance;
        }
    }

    public static class LoginMvpPresenter implements Serializable {
        private LoginMvpPresenter() {

        }
    }
}	