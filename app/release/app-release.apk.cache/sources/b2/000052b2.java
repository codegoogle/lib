package com.p7700g.p99005;

import com.p7700g.p99005.mn4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: CacheControl.java */
/* loaded from: classes3.dex */
public class nm4 {
    private static final mn4.a<nm4> a = mn4.g().b(nm4.class);
    private List<String> c;
    private List<String> e;
    private Map<String, String> l;
    private int j = -1;
    private int k = -1;
    private boolean b = false;
    private boolean d = false;
    private boolean f = false;
    private boolean g = true;
    private boolean h = false;
    private boolean i = false;

    public static nm4 t(String str) throws IllegalArgumentException {
        return a.a(str);
    }

    public Map<String, String> a() {
        if (this.l == null) {
            this.l = new HashMap();
        }
        return this.l;
    }

    public int b() {
        return this.j;
    }

    public List<String> c() {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        return this.e;
    }

    public List<String> d() {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        return this.c;
    }

    public int e() {
        return this.k;
    }

    public boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            nm4 nm4Var = (nm4) obj;
            if (this.b != nm4Var.b) {
                return false;
            }
            List<String> list = this.c;
            List<String> list2 = nm4Var.c;
            if ((list == list2 || (list != null && list.equals(list2))) && this.d == nm4Var.d) {
                List<String> list3 = this.e;
                List<String> list4 = nm4Var.e;
                if ((list3 == list4 || (list3 != null && list3.equals(list4))) && this.f == nm4Var.f && this.g == nm4Var.g && this.h == nm4Var.h && this.i == nm4Var.i && this.j == nm4Var.j && this.k == nm4Var.k) {
                    Map<String, String> map = this.l;
                    Map<String, String> map2 = nm4Var.l;
                    if (map != map2) {
                        return map != null && map.equals(map2);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public boolean f() {
        return this.h;
    }

    public boolean g() {
        return this.d;
    }

    public boolean h() {
        return this.f;
    }

    public int hashCode() {
        int i = (com.anythink.expressad.foundation.g.a.aU + (this.b ? 1 : 0)) * 41;
        List<String> list = this.c;
        int hashCode = (((i + (list != null ? list.hashCode() : 0)) * 41) + (this.d ? 1 : 0)) * 41;
        List<String> list2 = this.e;
        int hashCode2 = (((((((((((((hashCode + (list2 != null ? list2.hashCode() : 0)) * 41) + (this.f ? 1 : 0)) * 41) + (this.g ? 1 : 0)) * 41) + (this.h ? 1 : 0)) * 41) + (this.i ? 1 : 0)) * 41) + this.j) * 41) + this.k) * 41;
        Map<String, String> map = this.l;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public boolean i() {
        return this.g;
    }

    public boolean j() {
        return this.b;
    }

    public boolean k() {
        return this.i;
    }

    public void l(int i) {
        this.j = i;
    }

    public void m(boolean z) {
        this.h = z;
    }

    public void n(boolean z) {
        this.d = z;
    }

    public void o(boolean z) {
        this.f = z;
    }

    public void p(boolean z) {
        this.g = z;
    }

    public void q(boolean z) {
        this.b = z;
    }

    public void r(boolean z) {
        this.i = z;
    }

    public void s(int i) {
        this.k = i;
    }

    public String toString() {
        return a.b(this);
    }
}