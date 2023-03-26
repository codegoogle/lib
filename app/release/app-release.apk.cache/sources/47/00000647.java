package com.anythink.core.common.e;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.anythink.core.common.e.k;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class i<T extends k> implements Serializable {
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 10;
    public static final int w = 1;
    public static final int x = 2;
    public String A;
    public int B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public Bitmap I;
    public k J;
    public String K;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public int v;
    public int y;
    public int z;

    public final int A() {
        return this.z;
    }

    public final String B() {
        return this.D;
    }

    public final String C() {
        return this.E;
    }

    public final String D() {
        return this.F;
    }

    public final String E() {
        return this.G;
    }

    public final Bitmap F() {
        return this.I;
    }

    public final boolean G() {
        return (TextUtils.isEmpty(this.E) || TextUtils.isEmpty(this.D) || TextUtils.isEmpty(this.F) || TextUtils.isEmpty(this.G)) ? false : true;
    }

    public View H() {
        return null;
    }

    public boolean I() {
        return false;
    }

    public final void a(k kVar) {
        this.J = kVar;
    }

    public abstract List<String> b(T t);

    public final void b(int i) {
        this.B = i;
    }

    public final void c(String str) {
        this.K = str;
    }

    public abstract int d();

    public final void d(String str) {
        this.H = str;
    }

    public final void e(String str) {
        this.C = str;
    }

    public final String f() {
        return this.K;
    }

    public final k g() {
        return this.J;
    }

    public final String h() {
        return this.H;
    }

    public final int i() {
        return this.B;
    }

    public final String j() {
        return this.C;
    }

    public final String k() {
        return this.h;
    }

    public final String l() {
        return this.i;
    }

    public final String m() {
        return this.j;
    }

    public final String n() {
        return this.k;
    }

    public final String o() {
        return this.l;
    }

    public final String p() {
        return this.n;
    }

    public final String q() {
        return this.o;
    }

    public final String r() {
        return this.p;
    }

    public final String s() {
        return this.q;
    }

    public final String t() {
        return this.r;
    }

    public final String u() {
        return this.s;
    }

    public final String v() {
        return this.t;
    }

    public final String w() {
        return this.u;
    }

    public final int x() {
        return this.v;
    }

    public final int y() {
        return this.y;
    }

    public final boolean z() {
        return !TextUtils.isEmpty(this.q);
    }

    private String a() {
        return this.m;
    }

    private String b() {
        return this.A;
    }

    public final void c(int i) {
        this.v = i;
    }

    public final void d(int i) {
        this.y = i;
    }

    public final void e(int i) {
        this.z = i;
    }

    public final void f(String str) {
        this.h = str;
    }

    public final void g(String str) {
        this.i = str;
    }

    public final void h(String str) {
        this.j = str;
    }

    public final void i(String str) {
        this.k = str;
    }

    public final void j(String str) {
        this.l = str;
    }

    public final void k(String str) {
        this.m = str;
    }

    public final void l(String str) {
        this.n = str;
    }

    public final void m(String str) {
        this.o = str;
    }

    public final void n(String str) {
        this.p = str;
    }

    public final void o(String str) {
        this.q = str;
    }

    public final void p(String str) {
        this.r = str;
    }

    public final void q(String str) {
        this.s = str;
    }

    public final void r(String str) {
        this.t = str;
    }

    public final void s(String str) {
        this.u = str;
    }

    public final void t(String str) {
        this.A = str;
    }

    public final void u(String str) {
        this.D = str;
    }

    public final void v(String str) {
        this.E = str;
    }

    public final void w(String str) {
        this.F = str;
    }

    public final void x(String str) {
        this.G = str;
    }

    public final void a(Bitmap bitmap) {
        this.I = bitmap;
    }
}