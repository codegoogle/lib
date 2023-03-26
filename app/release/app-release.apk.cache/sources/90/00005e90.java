package com.p7700g.p99005;

import com.p7700g.p99005.an3;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.un3;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UserStateSecondaryChannelSynchronizer.java */
/* loaded from: classes3.dex */
public abstract class tn3 extends un3 {
    public tn3(an3.d dVar) {
        super(dVar);
    }

    @Override // com.p7700g.p99005.un3
    @z1
    public String C(boolean z) {
        return null;
    }

    @Override // com.p7700g.p99005.un3
    public abstract String D();

    @Override // com.p7700g.p99005.un3
    public jm3.u0 E() {
        return jm3.u0.INFO;
    }

    @Override // com.p7700g.p99005.un3
    public boolean H() {
        return false;
    }

    @Override // com.p7700g.p99005.un3
    public un3.e J(boolean z) {
        return null;
    }

    @Override // com.p7700g.p99005.un3
    public boolean M() {
        return false;
    }

    @Override // com.p7700g.p99005.un3
    public abstract void T();

    @Override // com.p7700g.p99005.un3
    public abstract mn3 V(String str, boolean z);

    @Override // com.p7700g.p99005.un3
    public void W(JSONObject jSONObject) {
        if (jSONObject.has(un3.f)) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(v0(), jSONObject.get(un3.f));
                if (jSONObject.has(u0())) {
                    jSONObject2.put(u0(), jSONObject.get(u0()));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            t0(jSONObject2);
        }
    }

    @Override // com.p7700g.p99005.un3
    public void c0() {
        if ((D() == null && G() == null) || jm3.c1() == null) {
            return;
        }
        F(0).c();
    }

    @Override // com.p7700g.p99005.un3
    public void j0(boolean z) {
    }

    @Override // com.p7700g.p99005.un3
    public void k0(boolean z) {
    }

    @Override // com.p7700g.p99005.un3
    public void n(JSONObject jSONObject) {
        try {
            jSONObject.put("device_type", w0());
            jSONObject.putOpt(un3.h, jm3.c1());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p7700g.p99005.un3
    public abstract void p0(String str);

    @Override // com.p7700g.p99005.un3
    public void r0(JSONObject jSONObject) {
    }

    public abstract void s0();

    public abstract void t0(JSONObject jSONObject);

    public abstract String u0();

    public abstract String v0();

    @Override // com.p7700g.p99005.un3
    public void w(JSONObject jSONObject) {
        if (jSONObject.has(un3.f)) {
            s0();
        }
    }

    public abstract int w0();

    public void x0() {
        c0();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void y0(String str, String str2) {
        boolean z;
        mn3 L = L();
        aj3 m = L.m();
        if (str.equals(m.j(un3.f))) {
            if (m.j(u0()).equals(str2 == null ? "" : str2)) {
                z = true;
                if (!z) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(v0(), str);
                        jSONObject.put(u0(), str2);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    t0(jSONObject);
                    return;
                }
                String k = m.k(un3.f, null);
                if (k == null) {
                    i0();
                }
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(un3.f, str);
                    if (str2 != null) {
                        jSONObject2.put(u0(), str2);
                    }
                    if (str2 == null && k != null && !k.equals(str)) {
                        b0("");
                        Z();
                        i0();
                    }
                    L.h(jSONObject2, null);
                    c0();
                    return;
                } catch (JSONException e2) {
                    e2.printStackTrace();
                    return;
                }
            }
        }
        z = false;
        if (!z) {
        }
    }
}