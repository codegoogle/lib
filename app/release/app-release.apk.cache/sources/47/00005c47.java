package com.p7700g.p99005;

import com.p7700g.p99005.an3;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: UserStateSMSSynchronizer.java */
/* loaded from: classes3.dex */
public class sn3 extends tn3 {
    public sn3() {
        super(an3.d.SMS);
    }

    @Override // com.p7700g.p99005.tn3, com.p7700g.p99005.un3
    public String D() {
        return jm3.J0();
    }

    @Override // com.p7700g.p99005.tn3, com.p7700g.p99005.un3
    public void T() {
        b0("");
        Z();
        K().z(un3.f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(un3.u);
        arrayList.add(un3.h);
        arrayList.add(un3.o);
        K().A(arrayList);
        K().s();
        jm3.K0().a();
    }

    @Override // com.p7700g.p99005.tn3, com.p7700g.p99005.un3
    public mn3 V(String str, boolean z) {
        return new rn3(str, z);
    }

    @Override // com.p7700g.p99005.un3
    public void b0(String str) {
        jm3.w2(str);
    }

    @Override // com.p7700g.p99005.tn3, com.p7700g.p99005.un3
    public void p0(String str) {
        jm3.A3(str);
    }

    @Override // com.p7700g.p99005.tn3
    public void s0() {
        jm3.a0();
    }

    @Override // com.p7700g.p99005.tn3
    public void t0(JSONObject jSONObject) {
        jm3.b0(jSONObject);
    }

    @Override // com.p7700g.p99005.tn3
    public String u0() {
        return un3.u;
    }

    @Override // com.p7700g.p99005.tn3
    public String v0() {
        return un3.r;
    }

    @Override // com.p7700g.p99005.tn3
    public int w0() {
        return 14;
    }
}