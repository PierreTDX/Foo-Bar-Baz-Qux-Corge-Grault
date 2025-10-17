package com.jad;

// import java.util.List;

public class Foo {
    private final Bar bar;
    private final Qux qux;

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

    // public List<Baz> getBazs() {
    // throw new UnsupportedOperationException("Not implemented yet");
    // }

    // public void addBaz(final Baz baz) {
    // throw new UnsupportedOperationException("Not implemented yet");
    // }

    // public List<Grault> getGraults() {
    // throw new UnsupportedOperationException("Not implemented yet");
    // }

    // public void addGrault() {
    // throw new UnsupportedOperationException("Not implemented yet");
    // }

    // public Corge getCorge() {
    // throw new UnsupportedOperationException("Not implemented yet");
    // }

    // public void setCorge(final Corge firstCorge) {
    // throw new UnsupportedOperationException("Not implemented yet");
    // }
}
