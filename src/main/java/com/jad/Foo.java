package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo {
    private final Bar bar;
    private final Qux qux;
    private final List<Baz> bazs = new ArrayList<>();
    private final List<Grault> graults = new ArrayList<>();

    public Foo(final Bar bar) {
        this.bar = bar;
        this.qux = new Qux();
    }

    public Bar getBar() {
        return bar;
    }

    public Qux getQux() {
        return qux;
    }

    public List<Baz> getBazs() {
        return new ArrayList<>(bazs); // retourne une copie
    }

    public void addBaz(final Baz baz) {
        this.bazs.add(baz);
    }

    public List<Grault> getGraults() {
        return new ArrayList<>(graults);
    }

    public void addGrault() {
        Grault g = new Grault(this);
        graults.add(g);
    }

    // public Corge getCorge() {
    // throw new UnsupportedOperationException("Not implemented yet");
    // }

    // public void setCorge(final Corge firstCorge) {
    // throw new UnsupportedOperationException("Not implemented yet");
    // }
}
