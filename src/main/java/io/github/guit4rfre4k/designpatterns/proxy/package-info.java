/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.guit4rfre4k.designpatterns.proxy;
/**
 * Proxy:
 * - modify behavior
 * - modify some input, do sth etc... and return (for example modifies request and response)
 * - decide which object should perform the action
 * - example with authentication filter in Proxy (responsible for checking credentials in terms of allowed actions); Proxy implements basic interface.
 * -- modify this approach to a gateway (so proxy contains a collection on components and not only the one)
 */
