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
public class Client {

    private IComponent component;

    Client(IComponent component) {
        this.component = component;
    }

    void businnessLogic() {
        component.bussinessLogic();
        System.out.println("Client's action");
    }

}
