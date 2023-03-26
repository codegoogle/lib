package com.ironsource.mediationsdk.a;

import com.ironsource.mediationsdk.a.b;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.o;

/* loaded from: classes3.dex */
public final class h extends b {
    private static h O;
    private String P;

    private h() {
        this.I = "outcome";
        this.H = 3;
        this.J = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.P = "";
    }

    public static synchronized h d() {
        h hVar;
        synchronized (h.class) {
            if (O == null) {
                h hVar2 = new h();
                O = hVar2;
                hVar2.e();
            }
            hVar = O;
        }
        return hVar;
    }

    @Override // com.ironsource.mediationsdk.a.b
    public final void n() {
        this.K.add(1000);
        this.K.add(1001);
        this.K.add(1002);
        this.K.add(1003);
        this.K.add(Integer.valueOf((int) IronSourceConstants.RV_INSTANCE_LOAD_FAILED));
        this.K.add(Integer.valueOf((int) IronSourceConstants.RV_INSTANCE_SHOW_CHANCE));
        this.K.add(Integer.valueOf((int) IronSourceConstants.RV_INSTANCE_READY_TRUE));
        this.K.add(Integer.valueOf((int) IronSourceConstants.RV_INSTANCE_READY_FALSE));
        this.K.add(Integer.valueOf((int) IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON));
        this.K.add(Integer.valueOf((int) IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL));
        this.K.add(Integer.valueOf((int) IronSourceConstants.RV_MEDIATION_LOAD_ERROR));
    }

    @Override // com.ironsource.mediationsdk.a.b
    public final boolean p(c cVar) {
        return cVar.a() == 305;
    }

    @Override // com.ironsource.mediationsdk.a.b
    public final String q(int i) {
        return (i == 15 || (i >= 300 && i < 400)) ? this.P : "";
    }

    @Override // com.ironsource.mediationsdk.a.b
    public final boolean s(c cVar) {
        int a = cVar.a();
        return a == 14 || a == 514 || a == 305 || a == 1003 || a == 1005 || a == 1203 || a == 1010 || a == 1301 || a == 1302;
    }

    @Override // com.ironsource.mediationsdk.a.b
    public final int u(c cVar) {
        return o.a().b((b.t(cVar.a()) == b.a.OFFERWALL.t ? 1 : 0) ^ 1);
    }
}