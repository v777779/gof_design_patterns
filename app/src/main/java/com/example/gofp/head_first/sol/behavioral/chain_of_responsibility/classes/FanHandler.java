package com.example.gofp.head_first.sol.behavioral.chain_of_responsibility.classes;

import com.example.gofp.binding.Systems;

public class FanHandler extends Handler {
    private static final int COMPLAINT_CODE = 200;

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
