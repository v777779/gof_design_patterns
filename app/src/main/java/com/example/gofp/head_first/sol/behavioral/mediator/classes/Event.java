package com.example.gofp.head_first.sol.behavioral.mediator.classes;

public interface Event {
    void check();
    void execute(String command);
    void onEvent();
}
