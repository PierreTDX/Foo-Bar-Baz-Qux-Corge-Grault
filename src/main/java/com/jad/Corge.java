package com.jad;

public class Corge {
    private Foo foo;

    public Corge(final Foo foo) {
        setFoo(foo);
    }

    public Foo getFoo() {
        return foo;
    }

    public void setFoo(Foo foo) {
        if (this.foo != foo) {
            // Détacher l'ancien Foo
            if (this.foo != null) {
                Foo old = this.foo;
                this.foo = null;
                old.setCorge(null);
            }

            // Attacher le nouveau Foo
            this.foo = foo;
            if (foo != null && foo.getCorge() != this) {
                foo.setCorge(this);
            }
        }
    }

    public void clearFoo() {
        this.foo = null;
    }
}