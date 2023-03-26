package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.p7700g.p99005.a6;
import com.p7700g.p99005.y6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: TrustedWebActivityIntentBuilder.java */
/* loaded from: classes.dex */
public class a7 {
    @SuppressLint({"ActionValue"})
    public static final String a = "androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS";
    @SuppressLint({"ActionValue"})
    public static final String b = "android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS";
    public static final String c = "androidx.browser.trusted.extra.SHARE_TARGET";
    public static final String d = "androidx.browser.trusted.extra.SHARE_DATA";
    public static final String e = "androidx.browser.trusted.extra.DISPLAY_MODE";
    public static final String f = "androidx.browser.trusted.extra.SCREEN_ORIENTATION";
    @x1
    private final Uri g;
    @z1
    private List<String> i;
    @z1
    private Bundle j;
    @z1
    private e7 k;
    @z1
    private f7 l;
    @x1
    private final a6.a h = new a6.a();
    @x1
    private y6 m = new y6.a();
    private int n = 0;

    public a7(@x1 Uri uri) {
        this.g = uri;
    }

    @x1
    public z6 a(@x1 d6 d6Var) {
        Objects.requireNonNull(d6Var, "CustomTabsSession is required for launching a TWA");
        this.h.t(d6Var);
        Intent intent = this.h.d().P;
        intent.setData(this.g);
        intent.putExtra(i6.a, true);
        if (this.i != null) {
            intent.putExtra(b, new ArrayList(this.i));
        }
        Bundle bundle = this.j;
        if (bundle != null) {
            intent.putExtra(a, bundle);
        }
        List<Uri> emptyList = Collections.emptyList();
        f7 f7Var = this.l;
        if (f7Var != null && this.k != null) {
            intent.putExtra(c, f7Var.b());
            intent.putExtra(d, this.k.b());
            List<Uri> list = this.k.f;
            if (list != null) {
                emptyList = list;
            }
        }
        intent.putExtra(e, this.m.toBundle());
        intent.putExtra(f, this.n);
        return new z6(intent, emptyList);
    }

    @x1
    public a6 b() {
        return this.h.d();
    }

    @x1
    public y6 c() {
        return this.m;
    }

    @x1
    public Uri d() {
        return this.g;
    }

    @x1
    public a7 e(@x1 List<String> list) {
        this.i = list;
        return this;
    }

    @x1
    public a7 f(int i) {
        this.h.i(i);
        return this;
    }

    @x1
    public a7 g(int i, @x1 x5 x5Var) {
        this.h.j(i, x5Var);
        return this;
    }

    @x1
    public a7 h(@x1 x5 x5Var) {
        this.h.k(x5Var);
        return this;
    }

    @x1
    public a7 i(@x1 y6 y6Var) {
        this.m = y6Var;
        return this;
    }

    @x1
    public a7 j(@w0 int i) {
        this.h.o(i);
        return this;
    }

    @x1
    public a7 k(@w0 int i) {
        this.h.p(i);
        return this;
    }

    @x1
    public a7 l(int i) {
        this.n = i;
        return this;
    }

    @x1
    public a7 m(@x1 f7 f7Var, @x1 e7 e7Var) {
        this.l = f7Var;
        this.k = e7Var;
        return this;
    }

    @x1
    public a7 n(@x1 Bundle bundle) {
        this.j = bundle;
        return this;
    }

    @x1
    public a7 o(@w0 int i) {
        this.h.y(i);
        return this;
    }
}