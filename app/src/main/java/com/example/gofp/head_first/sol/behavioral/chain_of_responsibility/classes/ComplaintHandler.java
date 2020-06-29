package com.example.gofp.head_first.sol.behavioral.chain_of_responsibility.classes;

import com.example.gofp.binding.Systems;

public class ComplaintHandler extends Handler {
    private static final int COMPLAINT_CODE = 300;

    public ComplaintHandler() {
    }

    public ComplaintHandler(Handler successor) {
        super(successor);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getCode() == COMPLAINT_CODE) {
            Systems.out.println(request.getMessage() + " processed by: "
                    + getClass().getSimpleName());
        }
        if(successor == null){
            return;
        }
        successor.handleRequest(request);
    }
}
