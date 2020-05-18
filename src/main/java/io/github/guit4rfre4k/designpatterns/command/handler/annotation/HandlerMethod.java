package io.github.guit4rfre4k.designpatterns.command.handler.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface HandlerMethod {

    // TODO (rmu) | Add a parameter indication if annotation is active or not (default true) and
    // TODO (rmu) | to exclude the hadler method for particular Command classes.

}
