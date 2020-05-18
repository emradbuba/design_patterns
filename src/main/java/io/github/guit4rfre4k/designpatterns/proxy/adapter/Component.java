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
public class Component implements TargetInterface {

    @Override
    public void targetMethod1() {
        System.out.println("Target method 1 from TargetInterface");
    }

    @Override
    public void targetMethod2() {
        System.out.println("Target method 2 from TargetInterface");
    }

    @Override
    public void targetMethod3() {
        System.out.println("Target method 3 from TargetInterface");
    }

}
