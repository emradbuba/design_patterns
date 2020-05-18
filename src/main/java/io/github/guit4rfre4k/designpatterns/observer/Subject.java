/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.guit4rfre4k.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ezmuzra
 */
public class Subject implements ISubject {

    private final List<IObserver> observers = new ArrayList<>();
    private final String name;

    public Subject(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void addObserver(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void performSomeAction() {
        System.out.println("Subject " + name + " performs it's action");
        notifyObservers();
    }

    private void notifyObservers() {
        for (IObserver observer : observers) {
            observer.reactOnChange(this);
        }
    }

}
