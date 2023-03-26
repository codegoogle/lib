package com.p7700g.p99005;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FontAssetManager.java */
/* loaded from: classes.dex */
public class mk0 {
    private final AssetManager d;
    @z1
    private ai0 e;
    private final xk0<String> a = new xk0<>();
    private final Map<xk0<String>, Typeface> b = new HashMap();
    private final Map<String, Typeface> c = new HashMap();
    private String f = ".ttf";

    public mk0(Drawable.Callback callback, @z1 ai0 ai0Var) {
        this.e = ai0Var;
        if (!(callback instanceof View)) {
            yo0.e("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
            return;
        }
        this.d = ((View) callback).getContext().getAssets();
    }

    private Typeface a(String str) {
        String b;
        Typeface typeface = this.c.get(str);
        if (typeface != null) {
            return typeface;
        }
        ai0 ai0Var = this.e;
        Typeface a = ai0Var != null ? ai0Var.a(str) : null;
        ai0 ai0Var2 = this.e;
        if (ai0Var2 != null && a == null && (b = ai0Var2.b(str)) != null) {
            a = Typeface.createFromAsset(this.d, b);
        }
        if (a == null) {
            StringBuilder L = wo1.L("fonts/", str);
            L.append(this.f);
            a = Typeface.createFromAsset(this.d, L.toString());
        }
        this.c.put(str, a);
        return a;
    }

    private Typeface e(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }

    public Typeface b(String str, String str2) {
        this.a.b(str, str2);
        Typeface typeface = this.b.get(this.a);
        if (typeface != null) {
            return typeface;
        }
        Typeface e = e(a(str), str2);
        this.b.put(this.a, e);
        return e;
    }

    public void c(String str) {
        this.f = str;
    }

    public void d(@z1 ai0 ai0Var) {
        this.e = ai0Var;
    }
}