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
public interface IComponentFactory {

    public static final String BASIC = "basic";
    public static final String SECOND = "second";

    public IComponent createComponent(String type);

}
