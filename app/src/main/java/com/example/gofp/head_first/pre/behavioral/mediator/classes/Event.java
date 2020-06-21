package com.example.gofp.head_first.pre.behavioral.mediator.classes;

public interface Event {
    void check();
    void onEvent();
    void execute(String command);
}
