package com.p7700g.p99005;

import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: JsonPrimitive.java */
/* loaded from: classes3.dex */
public final class aw2 extends uv2 {
    private final Object a;

    public aw2(Boolean bool) {
        this.a = qw2.b(bool);
    }

    private static boolean H(aw2 aw2Var) {
        Object obj = aw2Var.a;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }
        return false;
    }

    @Override // com.p7700g.p99005.uv2
    /* renamed from: E */
    public aw2 a() {
        return this;
    }

    public boolean G() {
        return this.a instanceof Boolean;
    }

    public boolean I() {
        return this.a instanceof Number;
    }

    public boolean J() {
        return this.a instanceof String;
    }

    @Override // com.p7700g.p99005.uv2
    public BigDecimal b() {
        Object obj = this.a;
        return obj instanceof BigDecimal ? (BigDecimal) obj : new BigDecimal(this.a.toString());
    }

    @Override // com.p7700g.p99005.uv2
    public BigInteger c() {
        Object obj = this.a;
        return obj instanceof BigInteger ? (BigInteger) obj : new BigInteger(this.a.toString());
    }

    @Override // com.p7700g.p99005.uv2
    public boolean d() {
        if (G()) {
            return ((Boolean) this.a).booleanValue();
        }
        return Boolean.parseBoolean(y());
    }

    @Override // com.p7700g.p99005.uv2
    public byte e() {
        return I() ? u().byteValue() : Byte.parseByte(y());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || aw2.class != obj.getClass()) {
            return false;
        }
        aw2 aw2Var = (aw2) obj;
        if (this.a == null) {
            return aw2Var.a == null;
        } else if (H(this) && H(aw2Var)) {
            return u().longValue() == aw2Var.u().longValue();
        } else {
            Object obj2 = this.a;
            if ((obj2 instanceof Number) && (aw2Var.a instanceof Number)) {
                double doubleValue = u().doubleValue();
                double doubleValue2 = aw2Var.u().doubleValue();
                if (doubleValue != doubleValue2) {
                    return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
                }
                return true;
            }
            return obj2.equals(aw2Var.a);
        }
    }

    @Override // com.p7700g.p99005.uv2
    public char f() {
        return y().charAt(0);
    }

    @Override // com.p7700g.p99005.uv2
    public double g() {
        return I() ? u().doubleValue() : Double.parseDouble(y());
    }

    @Override // com.p7700g.p99005.uv2
    public float h() {
        return I() ? u().floatValue() : Float.parseFloat(y());
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.a == null) {
            return 31;
        }
        if (H(this)) {
            doubleToLongBits = u().longValue();
        } else {
            Object obj = this.a;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(u().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    @Override // com.p7700g.p99005.uv2
    public int i() {
        return I() ? u().intValue() : Integer.parseInt(y());
    }

    @Override // com.p7700g.p99005.uv2
    public long t() {
        return I() ? u().longValue() : Long.parseLong(y());
    }

    @Override // com.p7700g.p99005.uv2
    public Number u() {
        Object obj = this.a;
        return obj instanceof String ? new ww2((String) this.a) : (Number) obj;
    }

    @Override // com.p7700g.p99005.uv2
    public short x() {
        return I() ? u().shortValue() : Short.parseShort(y());
    }

    @Override // com.p7700g.p99005.uv2
    public String y() {
        if (I()) {
            return u().toString();
        }
        if (G()) {
            return ((Boolean) this.a).toString();
        }
        return (String) this.a;
    }

    public aw2(Number number) {
        this.a = qw2.b(number);
    }

    public aw2(String str) {
        this.a = qw2.b(str);
    }

    public aw2(Character ch) {
        this.a = ((Character) qw2.b(ch)).toString();
    }
}