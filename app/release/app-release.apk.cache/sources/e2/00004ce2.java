package com.p7700g.p99005;

import com.onesignal.OSUtils;
import org.json.JSONObject;

/* compiled from: OSPermissionState.java */
/* loaded from: classes3.dex */
public class kl3 implements Cloneable {
    private static final String s = "areNotificationsEnabled";
    private static final String t = "changed";
    private gl3<Object, kl3> u = new gl3<>(t, false);
    private boolean v;

    public kl3(boolean z) {
        if (z) {
            this.v = vm3.b(vm3.a, vm3.o, false);
        } else {
            e();
        }
    }

    private void f(boolean z) {
        boolean z2 = this.v != z;
        this.v = z;
        if (z2) {
            this.u.c(this);
        }
    }

    public boolean a() {
        return this.v;
    }

    public boolean b(kl3 kl3Var) {
        return this.v != kl3Var.v;
    }

    public gl3<Object, kl3> c() {
        return this.u;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (Throwable unused) {
            return null;
        }
    }

    public void d() {
        vm3.k(vm3.a, vm3.o, this.v);
    }

    public void e() {
        f(OSUtils.a(jm3.g));
    }

    public JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(s, this.v);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return g().toString();
    }
}