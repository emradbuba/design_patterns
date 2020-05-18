/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.guit4rfre4k.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guit4rfre4k
 */
class Composite implements InterfaceComponent {

    private static int index = 1;
    private final List<InterfaceComponent> components = new ArrayList<>();
    private final String name;

    public Composite() {
        this.name = "Composite " + (index++);
    }

    @Override
    public void action() {
        System.out.println("Action from composite " + name);
        components.forEach(comp -> comp.action());
    }

    public void addComponent(InterfaceComponent comp) {
        this.components.add(comp);
    }

}
