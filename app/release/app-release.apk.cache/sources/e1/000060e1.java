package com.p7700g.p99005;

/* compiled from: GifOptions.java */
/* loaded from: classes4.dex */
public class ux5 {
    public char a;
    public boolean b;

    public ux5() {
        a();
    }

    private void a() {
        this.a = (char) 1;
        this.b = false;
    }

    public void b(@z1 ux5 ux5Var) {
        if (ux5Var == null) {
            a();
            return;
        }
        this.b = ux5Var.b;
        this.a = ux5Var.a;
    }

    public void c(boolean z) {
        this.b = z;
    }

    public void d(@p1(from = 1, to = 65535) int i) {
        if (i >= 1 && i <= 65535) {
            this.a = (char) i;
        } else {
            this.a = (char) 1;
        }
    }
}