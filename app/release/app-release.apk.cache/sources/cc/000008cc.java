package com.anythink.expressad.out;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.p7700g.p99005.wo1;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class j implements com.anythink.expressad.e.b, com.anythink.expressad.foundation.g.d.c, Serializable {
    private static final long a = 1;
    public static final int cP = 1;
    public static final int cQ = 2;
    public static final int cR = 3;
    public String cS;
    private double j;
    private Object l;
    private String n;
    private Drawable o;
    private Drawable p;
    private q q;
    private String b = "";
    private String c = "";
    private String d = "";
    private String e = "";
    private String f = "";
    private String g = "";
    private String h = "";
    private long i = 0;
    private int k = 33333;
    private int m = 1;
    private int r = 0;
    private int s = 0;
    private int t = 0;

    private Drawable a() {
        return this.o;
    }

    private Drawable b() {
        return this.p;
    }

    private void c(q qVar) {
        this.q = qVar;
    }

    private String d() {
        return this.cS;
    }

    private int e() {
        return this.r;
    }

    private int f() {
        return this.s;
    }

    private String g() {
        return this.n;
    }

    @Override // com.anythink.expressad.foundation.g.d.c
    public final void a(String str, String str2) {
    }

    public final double aX() {
        return this.j;
    }

    public final int aY() {
        return this.k;
    }

    public final String aZ() {
        return this.b;
    }

    public final String ba() {
        return this.c;
    }

    public final String bb() {
        return this.d;
    }

    public final String bc() {
        return this.e;
    }

    public final String bd() {
        return this.g;
    }

    public final String be() {
        return this.h;
    }

    public final int bf() {
        return this.m;
    }

    public final long bg() {
        return this.i;
    }

    public final String bh() {
        return this.f;
    }

    public final int bi() {
        return this.t;
    }

    public final void m(int i) {
        this.k = i;
    }

    public final void n(int i) {
        this.m = i;
    }

    public final void o(int i) {
        this.t = i;
    }

    public final void s(String str) {
        this.b = str;
    }

    public final void t(String str) {
        this.c = str;
    }

    public final void u(String str) {
        this.d = str;
    }

    public final void v(String str) {
        this.e = str;
    }

    public final void w(String str) {
        this.g = str;
    }

    public final void x(String str) {
        this.h = str;
    }

    public final void y(String str) {
        this.f = str;
    }

    private void a(q qVar) {
        this.q = qVar;
        if (TextUtils.isEmpty(this.g)) {
            return;
        }
        wo1.m0().a(this.g, this);
    }

    private void b(q qVar) {
        this.q = qVar;
        if (TextUtils.isEmpty(this.h)) {
            return;
        }
        wo1.m0().a(this.h, this);
    }

    private Object c() {
        return this.l;
    }

    public void m(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.cS = str;
    }

    private void b(int i) {
        this.s = i;
    }

    public final void a(double d) {
        this.j = d;
    }

    private void a(Object obj) {
        this.l = obj;
    }

    private void b(Drawable drawable) {
        this.p = drawable;
    }

    public final void a(long j) {
        this.i = j;
    }

    private void a(int i) {
        this.r = i;
    }

    private void a(String str) {
        this.n = str;
    }

    private static Drawable a(Bitmap bitmap) {
        return new BitmapDrawable(bitmap);
    }

    private void a(Drawable drawable) {
        this.o = drawable;
    }

    @Override // com.anythink.expressad.foundation.g.d.c
    public final void a(Bitmap bitmap, String str) {
        String str2;
        if (!TextUtils.isEmpty(this.h) && this.h.equals(str) && bitmap != null) {
            this.p = a(bitmap);
            if (this.q != null) {
                a(bitmap);
            }
        }
        if (TextUtils.isEmpty(this.g) || (str2 = this.g) == null || !str2.equals(str) || bitmap == null) {
            return;
        }
        this.o = a(bitmap);
        if (this.q != null) {
            a(bitmap);
        }
    }
}