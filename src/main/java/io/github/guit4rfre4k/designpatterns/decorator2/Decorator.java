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
class Decorator implements IComponent {

    private final IComponent component;
    private final String name;

    public Decorator(IComponent component, String name) {
        this.component = component;
        this.name = name;
    }

    @Override
    public void bussinessLogic() {
        System.out.println("Decorator's action (" + name + ")");
        component.bussinessLogic();
    }

}
