package com.extremecoder.annotationExample;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface Student {
    String name() default "Rakib";
    int age();
    int revision() default 1;
    String skinTone() default "Brown";
}
