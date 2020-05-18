/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.guit4rfre4k.designpatterns.proxy.adapter;

/**
 *
 * @author guit4rfre4k
 */
public class Client {

    private InitialInterface interfaceInitial;

    public Client(InitialInterface interfaceInitial) {
        this.interfaceInitial = interfaceInitial;
    }

    public void businnessAction() {
        interfaceInitial.initMethod1();
        interfaceInitial.initMethod2();
        interfaceInitial.initMethod3();
    }

}
