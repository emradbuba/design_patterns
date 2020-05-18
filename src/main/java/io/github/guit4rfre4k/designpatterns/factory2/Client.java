/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.guit4rfre4k.designpatterns.factory2;

/**
 *
 * @author guit4rfre4k
 */
public class Client {

    private IComponentFactory componentFactory;

    public Client() {
    }

    public void setComponentFactory(IComponentFactory componentFactory) {
        this.componentFactory = componentFactory;
    }

    public void businnessAction(String type) {
        if (componentFactory != null) {
            IComponent comp = componentFactory.createComponent(type);
            comp.action();
            return;
        }
        System.out.println("No action");
    }

}
