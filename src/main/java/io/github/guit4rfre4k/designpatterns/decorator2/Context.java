/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.guit4rfre4k.designpatterns.decorator2;

/**
 *
 * @author ezmuzra
 */
class Context {

    public static void main(String[] args) {

        Component comp = new Component();
        Decorator decoratorA = new Decorator(comp, "decoratorA");
        Decorator decoratorB = new Decorator(decoratorA, "decoratorB");
        /*
        Other option:
        component.addDecorator();
        component.addDecorator();   
        --> but we have stronger correlation between component->decorator (depends on arvhitectural decision
         */
        Client client = new Client(decoratorB);
        client.businnessLogic();

    }

}
