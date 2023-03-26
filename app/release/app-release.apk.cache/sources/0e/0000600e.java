package com.p7700g.p99005;

import com.airbnb.lottie.LottieAnimationView;
import com.p7700g.p99005.i2;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TextDelegate.java */
/* loaded from: classes.dex */
public class ui0 {
    private final Map<String, String> a;
    @z1
    private final LottieAnimationView b;
    @z1
    private final hi0 c;
    private boolean d;

    @r2
    public ui0() {
        this.a = new HashMap();
        this.d = true;
        this.b = null;
        this.c = null;
    }

    private void d() {
        LottieAnimationView lottieAnimationView = this.b;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        hi0 hi0Var = this.c;
        if (hi0Var != null) {
            hi0Var.invalidateSelf();
        }
    }

    public String a(String str) {
        return str;
    }

    public String b(String str, String str2) {
        return a(str2);
    }

    @i2({i2.a.LIBRARY})
    public final String c(String str, String str2) {
        if (this.d && this.a.containsKey(str2)) {
            return this.a.get(str2);
        }
        String b = b(str, str2);
        if (this.d) {
            this.a.put(str2, b);
        }
        return b;
    }

    public void e() {
        this.a.clear();
        d();
    }

    public void f(String str) {
        this.a.remove(str);
        d();
    }

    public void g(boolean z) {
        this.d = z;
    }

    public void h(String str, String str2) {
        this.a.put(str, str2);
        d();
    }

    public ui0(LottieAnimationView lottieAnimationView) {
        this.a = new HashMap();
        this.d = true;
        this.b = lottieAnimationView;
        this.c = null;
    }

    public ui0(hi0 hi0Var) {
        this.a = new HashMap();
        this.d = true;
        this.c = hi0Var;
        this.b = null;
    }
}