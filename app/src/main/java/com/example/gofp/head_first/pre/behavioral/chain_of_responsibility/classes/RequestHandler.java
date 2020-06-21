package com.example.gofp.head_first.pre.behavioral.chain_of_responsibility.classes;

import com.example.gofp.binding.Systems;

public class RequestHandler {
    private static final int SPAM_CODE = 100;
    private static final int FAN_CODE = 200;
    private static final int COMPLAINT_CODE = 300;
    private static final int NEWLOC_CODE = 400;

    private Request request;

    public RequestHandler() {

    }

    public void handleRequest(Request request) {
        switch (request.getCode()) {
            case SPAM_CODE:
                Systems.out.println(request.getMessage() + " processed by: Spam handler");
                break;
            case FAN_CODE:
                Systems.out.println(request.getMessage() + " processed by: Fan handler");
                break;
            case COMPLAINT_CODE:
                Systems.out.println(request.getMessage() + " processed by: Complaint handler");
                break;
            case NEWLOC_CODE:
                Systems.out.println(request.getMessage() + " processed by: NewLoc handler");
                break;

        }
    }
}
