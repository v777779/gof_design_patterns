package com.example.gofp.head_first.sol.behavioral.chain_of_responsibility.classes;

public abstract class Handler {
    protected Handler successor;

    public abstract void handleRequest(Request request);

    public Handler() {
    }

    public Handler(Handler successor) {
        this.successor = successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
