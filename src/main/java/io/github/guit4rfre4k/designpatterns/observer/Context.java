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
class Context {

    public static void main(String[] args) {

        ISubject subject = new Subject("Basic subject");
        IObserver observer1 = new Observer("First Observer");
        IObserver observer2 = new Observer("Second Observer");
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.performSomeAction();

    }

}
