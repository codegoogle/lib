package com.anythink.expressad.foundation.d;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class m implements Serializable {
    private String a;
    private String b;
    private int c;

    private m(String str, String str2, int i) {
        this.b = str;
        this.a = str2;
        this.c = i;
    }

    private String a() {
        return this.a;
    }

    private String b() {
        return this.b;
    }

    private void a(String str) {
        this.a = str;
    }

    private void b(String str) {
        this.b = str;
    }
}