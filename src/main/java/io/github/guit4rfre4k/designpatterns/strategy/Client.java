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
public class Client {

    private DocumentGeneratoingStrategy strategy;

    public void setGeneratingStrategy(DocumentGeneratoingStrategy strategy) {
        this.strategy = strategy;
    }

    void generateDocument() {
        strategy.generateDoument();
    }

}
