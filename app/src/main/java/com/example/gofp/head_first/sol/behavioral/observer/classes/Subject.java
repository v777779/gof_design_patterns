package com.example.gofp.head_first.sol.behavioral.observer.classes;

public interface Subject {
    void registerObserver(WObserver observer);
    void removeObserver(WObserver observer);
    void notifyObservers();
}
