/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.guit4rfre4k.designpatterns.observer;

/**
 *
 * @author ezmuzra
 */
public class Observer implements IObserver {

    private final String name;

    public Observer(String name) {
        this.name = name;
    }

    @Override
    public void reactOnChange(ISubject subject) {
        System.out.println(String.format("Observer \"%s\" reacts on change in subject \"%s\"", name, subject.getName()));
    }

}
