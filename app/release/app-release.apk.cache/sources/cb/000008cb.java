package com.anythink.expressad.out;

/* loaded from: classes2.dex */
public final class i {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;
    private int f;
    private int g;

    public i(int i, int i2) {
        if (i == 1) {
            this.f = 90;
            this.g = 320;
        } else if (i == 2) {
            this.f = 250;
            this.g = 300;
        } else if (i == 3) {
            if (com.anythink.expressad.foundation.h.j.f(com.anythink.core.common.b.m.a().e()) < 720) {
                this.f = 50;
                this.g = 320;
                return;
            }
            this.f = 90;
            this.g = 728;
        } else if (i == 4) {
            this.f = 50;
            this.g = 320;
        } else if (i != 5) {
        } else {
            this.f = i2;
            this.g = 0;
        }
    }

    private void c() {
        if (com.anythink.expressad.foundation.h.j.f(com.anythink.core.common.b.m.a().e()) < 720) {
            this.f = 50;
            this.g = 320;
            return;
        }
        this.f = 90;
        this.g = 728;
    }

    public final int a() {
        return this.f;
    }

    public final int b() {
        return this.g;
    }
}