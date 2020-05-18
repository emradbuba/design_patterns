/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.guit4rfre4k.designpatterns.composite;

/**
 * @author guit4rfre4k
 */
public class Client {

    private InterfaceComponent component;

    public Client(InterfaceComponent component) {
        this.component = component;
    }

    void bussinessAction() {
        component.action();
    }

}
