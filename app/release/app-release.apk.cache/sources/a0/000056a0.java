package com.p7700g.p99005;

import android.net.Network;
import android.os.Build;
import com.p7700g.p99005.oo1;

/* compiled from: SocketProtector.java */
/* loaded from: classes2.dex */
public class po1 {
    private static final int a = -1;
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 3;
    @x1
    private final kj1 f = kj1.b("SocketProtector");
    @x1
    private final td1 g;
    @x1
    private final ko1 h;

    public po1(@x1 td1 td1Var, @x1 ko1 ko1Var) {
        this.g = td1Var;
        this.h = ko1Var;
    }

    private boolean a(@x1 Network network, int i) {
        try {
            new oo1.c(i);
            if (Build.VERSION.SDK_INT >= 23) {
                network.bindSocket(oo1.c.a);
                return true;
            }
            network.bindSocket(new oo1.a(oo1.c.a));
            return true;
        } catch (Exception e2) {
            this.f.f(e2);
            return false;
        }
    }

    private boolean e(int i, int i2, @x1 Network network) {
        if (i2 == 2 || i2 == 1) {
            return a(network, i);
        }
        return false;
    }

    public void b(int i, @z1 int[] iArr) {
        if (iArr != null) {
            for (int i2 = 0; i2 < iArr.length; i2++) {
                if (!d(i, iArr[i2])) {
                    iArr[i2] = -1;
                }
            }
        }
    }

    public boolean c(int i) {
        return d(0, i);
    }

    public boolean d(int i, int i2) {
        boolean l;
        Network m0 = this.h.m0();
        if (i == 0) {
            l = this.g.l(i2);
            this.f.c("Protected with default way %s", Boolean.valueOf(l));
        } else if (m0 != null) {
            l = e(i2, i, m0);
            this.f.c("Protected with network %s", Boolean.valueOf(l));
        } else {
            this.f.c("Protected with network %s", Boolean.FALSE);
            return false;
        }
        return l;
    }
}