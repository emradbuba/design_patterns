/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.guit4rfre4k.designpatterns.composite;

/**
 *
 * @author guit4rfre4k
 */
class Context {

    public static void main(String[] args) {
        Composite root = new Composite();
        Composite nextComposite = new Composite();
        nextComposite.addComponent(new Composite());
        root.addComponent(nextComposite);

        Client c = new Client(root);
        c.bussinessAction();
    }

}
