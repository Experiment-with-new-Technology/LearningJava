package com.extremecoder.annotationExample;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class AnnotationExample {
    public static void main(String[] args) {
    }

    @Override
    @Student(name = "Hasan", age = 27, revision = 1, skinTone = "Black")
    public String toString() {
        return "Overriden toString method";
    }

    @Deprecated
    @Student(name = "Habib", age = 26, revision = 2, skinTone = "White")
    public static void oldMethod() {
        System.out.println("old method, don't use it.");
    }

    @SuppressWarnings({ "unchecked", "deprecation" })
    @Student(name = "Mamun", age = 25, revision = 3, skinTone = "Brown")
    public static void genericsTest() throws FileNotFoundException {
        List l = new ArrayList();
        l.add("abc");
        oldMethod();
    }
}
