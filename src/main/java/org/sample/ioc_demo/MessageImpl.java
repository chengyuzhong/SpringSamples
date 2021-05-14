package org.sample.ioc_demo;

public class MessageImpl implements IMessageService{

    @Override
    public String get() {
        return "get success";
    }

}
