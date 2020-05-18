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
public class ComponentFactory implements IComponentFactory {

    //TODO: Maybe store created object and return then if required
    public static IComponent createBasicComponent() {
        throw new UnsupportedOperationException("Not supported yet..."); // removed during developement
        // Let's assume that the creation process is quite complicated
    }

    public static IComponent createSecondComponent() {
        throw new UnsupportedOperationException("Not supported yet..."); // removed during developement
        // Let's assume that the creation process is quite complicated
    }

    @Override
    public IComponent createComponent(String type) {
        switch (type) {
            case IComponentFactory.BASIC:
                return new Component("Basic component");
            case IComponentFactory.SECOND:
                return new SecondComponent();
        }
        throw new IllegalArgumentException("Illegal type: " + type);
    }

}
