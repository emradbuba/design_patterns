/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.guit4rfre4k.designpatterns.strategy;

import java.util.Iterator;

/**
 *
 * @author ezmuzra
 */
class Context {

    public static void main(String[] args) {
        Client client = new Client();
        DocumentGeneratoingStrategy strategy;
        //
        strategy = new PDFStrategy();
        client.setGeneratingStrategy(strategy);
        client.generateDocument();
        //
        strategy = new DocStrategy();
        client.setGeneratingStrategy(strategy);
        client.generateDocument();
        Iterator<String> it;
    }

}
