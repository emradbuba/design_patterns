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
public class AppContext {

    public static void main(String[] args) {
//        IComponent comp1 = ComponentFactory.createBasicComponent();
//        IComponent comp2 = ComponentFactory.createSecondComponent();
        Client client = new Client();
        client.businnessAction(IComponentFactory.BASIC);
        client.setComponentFactory(new ComponentFactory());
        client.businnessAction(IComponentFactory.BASIC);
        client.businnessAction(IComponentFactory.SECOND);
    }

}
