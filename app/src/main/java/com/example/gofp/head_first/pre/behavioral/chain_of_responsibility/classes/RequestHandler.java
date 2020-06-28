package com.example.gofp.head_first.pre.behavioral.chain_of_responsibility.classes;

import androidx.annotation.RequiresApi;

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
                spamHandler(request);
                break;
            case FAN_CODE:
                fanHandler(request);
                break;
            case COMPLAINT_CODE:
                complaintHandler(request);
                break;
            case NEWLOC_CODE:
                newLocHandler(request);
                break;
        }
    }

    private void spamHandler(Request request) {
        Systems.out.println(request.getMessage() + " processed by: Spam handler");
    }

    private void fanHandler(Request request) {
        Systems.out.println(request.getMessage() + " processed by: Fan handler");
    }

    private void complaintHandler(Request request) {
        Systems.out.println(request.getMessage() + " processed by: Complaint handler");
    }

    private void newLocHandler(Request request) {
        Systems.out.println(request.getMessage() + " processed by: NewLoc handler");
    }
}
