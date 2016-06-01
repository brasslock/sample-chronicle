package org.brasslock.template.common;

import java.util.Arrays;

public class StubApp {
    public static void main(final String... args) throws Exception {
        System.out.println(String.format("Args '%s'", Arrays.toString(args)));
        new Stub().getValue();
    }
}
