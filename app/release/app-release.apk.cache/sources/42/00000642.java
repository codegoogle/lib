package com.anythink.core.common.e;

/* loaded from: classes2.dex */
public final class d {
    private String a;
    private String b;
    private int c;

    public d(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    private String b() {
        return this.a;
    }

    private int c() {
        return this.c;
    }

    public final String a() {
        return this.b;
    }

    public final boolean a(af afVar) {
        if (afVar != null) {
            int i = afVar.a;
            if (i != 2) {
                return i == 3 && afVar.c() == this.c;
            }
            return afVar.t().equals(this.a);
        }
        return false;
    }
}