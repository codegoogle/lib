package com.p7700g.p99005;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* compiled from: LazilyParsedNumber.java */
/* loaded from: classes3.dex */
public final class ww2 extends Number {
    private final String s;

    public ww2(String str) {
        this.s = str;
    }

    private void a(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object f() throws ObjectStreamException {
        return new BigDecimal(this.s);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.s);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ww2) {
            String str = this.s;
            String str2 = ((ww2) obj).s;
            return str == str2 || str.equals(str2);
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.s);
    }

    public int hashCode() {
        return this.s.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.s);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.s).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.s);
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.s);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.s).longValue();
        }
    }

    public String toString() {
        return this.s;
    }
}