package io.github.guit4rfre4k.designpatterns.command.handler;

import io.github.guit4rfre4k.designpatterns.command.cmds.Command;
import io.github.guit4rfre4k.designpatterns.command.handler.annotation.HandlerMethod;
import io.github.guit4rfre4k.designpatterns.command.handler.annotation.MethodsForHadlingCommnads;
import lombok.extern.slf4j.Slf4j;
import org.reflections.Reflections;
import org.reflections.scanners.MethodAnnotationsScanner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

@Slf4j
public class HandlerReflection implements CommandHandler {

    public static final String PACKAGE_PREFIX = "io.github.guit4rfre4k.designpatterns";

    @Override
    public void handleCommand(Command cmd) {
        log.info("-------------------------");
        log.info("Looking for a method handling the command " + cmd.getName());
        Set<Method> methods = new Reflections(PACKAGE_PREFIX, new MethodAnnotationsScanner())
                .getMethodsAnnotatedWith(HandlerMethod.class);
        log.info("Number of methods found: " + methods.size());
        for (Method method : methods) {
            if(method.getParameterCount() == 1) {
                Class commandType = cmd.getClass();
                Class paramType = method.getParameterTypes()[0];
                if(paramType.equals(commandType)){
                    log.info("Found a method for command " + cmd.getName() + " ==> " + method.getName());
                    try {
                        log.info("Executing...");
                        method.invoke(MethodsForHadlingCommnads.class.newInstance(), cmd);
                        log.info("Execution finished...");
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        log.error("Problem while invoking the method " + method.getName(), e);
                    } catch (InstantiationException e) {
                        log.error("Problem while invoking the method (InstantiationException) " + method.getName(), e);
                    }
                }
            }
        }
    }
}
