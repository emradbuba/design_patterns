/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.guit4rfre4k.designpatterns.strategy;

/**
 *
 * @author ezmuzra
 */
public class DocStrategy implements DocumentGeneratoingStrategy {

    @Override
    public void generateDoument() {
        System.out.println("Generating DOC document");
    }

}
