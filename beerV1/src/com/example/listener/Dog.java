package com.example.listener;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class Dog implements HttpSessionBindingListener {
    private String breed;

    public Dog(String breed) {
	this.breed = breed;
    }

    public String getBreed() {
	return breed;
    }

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
	//System.out.println("Dog: I'm being added to a session");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
	//System.out.println("Dog: I'm removed from a session");
    }

}
