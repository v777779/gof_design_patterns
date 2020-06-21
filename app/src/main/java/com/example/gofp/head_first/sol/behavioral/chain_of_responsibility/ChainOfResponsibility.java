package com.example.gofp.head_first.sol.behavioral.chain_of_responsibility;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.sol.behavioral.chain_of_responsibility.classes.ComplaintHandler;
import com.example.gofp.head_first.sol.behavioral.chain_of_responsibility.classes.FanHandler;
import com.example.gofp.head_first.sol.behavioral.chain_of_responsibility.classes.Handler;
import com.example.gofp.head_first.sol.behavioral.chain_of_responsibility.classes.NewLocHandler;
import com.example.gofp.head_first.sol.behavioral.chain_of_responsibility.classes.Request;
import com.example.gofp.head_first.sol.behavioral.chain_of_responsibility.classes.SpamHandler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChainOfResponsibility extends BasePattern {
    @Override
    public void main() {
        Handler spam = new SpamHandler();
        Handler fan = new FanHandler();
        Handler complaint = new ComplaintHandler();
        Handler newLoc = new NewLocHandler();

        spam.setSuccessor(fan);             // spam -> fan -> complaint -> newloc
        fan.setSuccessor(complaint);
        complaint.setSuccessor(newLoc);

        List<Request> requests = new ArrayList<>();
        requests.add(new Request("SPAM request", 100));
        requests.add(new Request("FAN request", 200));
        requests.add(new Request("COMPLAINT request", 300));
        requests.add(new Request("NEWLOC request", 400));
        requests.add(new Request("UNKNOWN request", 500));
        Collections.shuffle(requests);

        for (Request request : requests) {
            Systems.out.println("Start processing: " + request.getMessage());
            spam.handleRequest(request);
            Systems.out.println("End of Processing");
            Systems.out.println();
        }

    }
}
