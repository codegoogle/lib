package com.p7700g.p99005;

/* compiled from: CLNumber.java */
/* loaded from: classes.dex */
public class pa extends na {
    public float z;

    public pa(char[] cArr) {
        super(cArr);
        this.z = Float.NaN;
    }

    public static na C(char[] cArr) {
        return new pa(cArr);
    }

    @Override // com.p7700g.p99005.na
    public String A(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        a(sb, i);
        float f = f();
        int i3 = (int) f;
        if (i3 == f) {
            sb.append(i3);
        } else {
            sb.append(f);
        }
        return sb.toString();
    }

    @Override // com.p7700g.p99005.na
    public String B() {
        float f = f();
        int i = (int) f;
        if (i == f) {
            return wo1.l("", i);
        }
        return "" + f;
    }

    public boolean D() {
        float f = f();
        return ((float) ((int) f)) == f;
    }

    public void E(float f) {
        this.z = f;
    }

    @Override // com.p7700g.p99005.na
    public float f() {
        if (Float.isNaN(this.z)) {
            this.z = Float.parseFloat(b());
        }
        return this.z;
    }

    @Override // com.p7700g.p99005.na
    public int g() {
        if (Float.isNaN(this.z)) {
            this.z = Integer.parseInt(b());
        }
        return (int) this.z;
    }

    public pa(float f) {
        super(null);
        this.z = Float.NaN;
        this.z = f;
    }
}