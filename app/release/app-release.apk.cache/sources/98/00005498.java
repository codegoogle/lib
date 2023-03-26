package com.p7700g.p99005;

import android.content.ComponentName;
import android.net.Uri;
import com.p7700g.p99005.a6;

/* compiled from: OneSignalChromeTab.java */
/* loaded from: classes3.dex */
public class om3 {

    /* compiled from: OneSignalChromeTab.java */
    /* loaded from: classes3.dex */
    public static class a extends c6 {
        private String s;
        private boolean t;

        public a(@x1 String str, boolean z) {
            this.s = str;
            this.t = z;
        }

        @Override // com.p7700g.p99005.c6
        public void onCustomTabsServiceConnected(@x1 ComponentName componentName, @x1 z5 z5Var) {
            z5Var.n(0L);
            d6 k = z5Var.k(null);
            if (k == null) {
                return;
            }
            Uri parse = Uri.parse(this.s);
            k.g(parse, null, null);
            if (this.t) {
                a6 d = new a6.a(k).d();
                d.P.setData(parse);
                d.P.addFlags(268435456);
                jm3.g.startActivity(d.P, d.Q);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    private static boolean a() {
        return true;
    }

    public static boolean b(String str, boolean z) {
        if (a()) {
            return z5.b(jm3.g, "com.android.chrome", new a(str, z));
        }
        return false;
    }
}