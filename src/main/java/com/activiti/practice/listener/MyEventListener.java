package com.activiti.practice.listener;

import org.activiti.engine.delegate.event.ActivitiEvent;
import org.activiti.engine.delegate.event.ActivitiEventListener;

//3.17.1
public class MyEventListener implements ActivitiEventListener {

    @Override
    public void onEvent(ActivitiEvent event) {
        switch (event.getType()) {
            case JOB_EXECUTION_SUCCESS -> System.out.println("A job well done!");
            case JOB_EXECUTION_FAILURE -> System.out.println("A job has failed...");
            default -> System.out.println("Event received: " + event.getType());
        }
    }

    @Override
    public boolean isFailOnException() {
        // The logic in the onEvent method of this listener is not critical, exceptions
        // can be ignored if logging fails...
        return false;
    }
}
