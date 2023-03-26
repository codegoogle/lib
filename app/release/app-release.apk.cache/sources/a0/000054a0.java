package com.p7700g.p99005;

import com.p7700g.p99005.an3;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: UserStateEmailSynchronizer.java */
/* loaded from: classes3.dex */
public class on3 extends tn3 {
    public on3() {
        super(an3.d.EMAIL);
    }

    @Override // com.p7700g.p99005.tn3, com.p7700g.p99005.un3
    public String D() {
        return jm3.p0();
    }

    @Override // com.p7700g.p99005.tn3, com.p7700g.p99005.un3
    public void T() {
        jm3.v2("");
        Z();
        K().z(un3.f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(un3.t);
        arrayList.add(un3.h);
        arrayList.add(un3.o);
        K().A(arrayList);
        K().s();
        jm3.q0().a();
    }

    @Override // com.p7700g.p99005.tn3, com.p7700g.p99005.un3
    public mn3 V(String str, boolean z) {
        return new nn3(str, z);
    }

    @Override // com.p7700g.p99005.un3
    public void b0(String str) {
        jm3.v2(str);
    }

    @Override // com.p7700g.p99005.tn3, com.p7700g.p99005.un3
    public void p0(String str) {
        jm3.z3(str);
    }

    @Override // com.p7700g.p99005.tn3
    public void s0() {
        jm3.W();
    }

    @Override // com.p7700g.p99005.tn3
    public void t0(JSONObject jSONObject) {
        jm3.X();
    }

    @Override // com.p7700g.p99005.tn3
    public String u0() {
        return un3.t;
    }

    @Override // com.p7700g.p99005.tn3
    public String v0() {
        return "email";
    }

    @Override // com.p7700g.p99005.tn3
    public int w0() {
        return 11;
    }
}