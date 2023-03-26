package com.p7700g.p99005;

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: JsonElement.java */
/* loaded from: classes3.dex */
public abstract class uv2 {
    public boolean A() {
        return this instanceof rv2;
    }

    public boolean B() {
        return this instanceof wv2;
    }

    public boolean C() {
        return this instanceof xv2;
    }

    public boolean D() {
        return this instanceof aw2;
    }

    public abstract uv2 a();

    public BigDecimal b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public BigInteger c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public byte e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    @Deprecated
    public char f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double g() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public float h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int i() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public rv2 m() {
        if (A()) {
            return (rv2) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public wv2 n() {
        if (B()) {
            return (wv2) this;
        }
        throw new IllegalStateException("Not a JSON Null: " + this);
    }

    public xv2 o() {
        if (C()) {
            return (xv2) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public aw2 p() {
        if (D()) {
            return (aw2) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public long t() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            qx2 qx2Var = new qx2(stringWriter);
            qx2Var.U(true);
            cx2.b(this, qx2Var);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public Number u() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public short x() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String y() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }
}