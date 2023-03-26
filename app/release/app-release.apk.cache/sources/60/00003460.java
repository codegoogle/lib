package com.ironsource.mediationsdk.a;

import com.ironsource.mediationsdk.a.b;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.o;

/* loaded from: classes3.dex */
public final class d extends b {
    private static d O;
    private String P;

    private d() {
        this.I = "ironbeast";
        this.H = 2;
        this.J = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.P = "";
    }

    public static synchronized d d() {
        d dVar;
        synchronized (d.class) {
            if (O == null) {
                d dVar2 = new d();
                O = dVar2;
                dVar2.e();
            }
            dVar = O;
        }
        return dVar;
    }

    @Override // com.ironsource.mediationsdk.a.b
    public final void n() {
        this.K.add(2001);
        this.K.add(2002);
        this.K.add(2003);
        this.K.add(2004);
        this.K.add(Integer.valueOf((int) IronSourceConstants.IS_INSTANCE_LOAD_FAILED));
        this.K.add(Integer.valueOf((int) IronSourceConstants.IS_INSTANCE_LOAD_NO_FILL));
        this.K.add(Integer.valueOf((int) IronSourceConstants.IS_INSTANCE_READY_TRUE));
        this.K.add(Integer.valueOf((int) IronSourceConstants.IS_INSTANCE_READY_FALSE));
        this.K.add(3001);
        this.K.add(Integer.valueOf((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR));
        this.K.add(Integer.valueOf((int) IronSourceConstants.BN_RELOAD));
        this.K.add(Integer.valueOf((int) IronSourceConstants.BN_RELOAD_FAILED));
        this.K.add(Integer.valueOf((int) IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS));
        this.K.add(Integer.valueOf((int) IronSourceConstants.BN_INSTANCE_LOAD));
        this.K.add(Integer.valueOf((int) IronSourceConstants.BN_INSTANCE_RELOAD));
        this.K.add(Integer.valueOf((int) IronSourceConstants.BN_INSTANCE_LOAD_SUCCESS));
        this.K.add(Integer.valueOf((int) IronSourceConstants.BN_INSTANCE_LOAD_ERROR));
        this.K.add(Integer.valueOf((int) IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS));
        this.K.add(Integer.valueOf((int) IronSourceConstants.BN_INSTANCE_RELOAD_ERROR));
        this.K.add(Integer.valueOf((int) IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS));
        this.K.add(Integer.valueOf((int) IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS));
        this.K.add(Integer.valueOf((int) IronSourceConstants.BN_INSTANCE_SHOW));
    }

    @Override // com.ironsource.mediationsdk.a.b
    public final boolean p(c cVar) {
        return false;
    }

    @Override // com.ironsource.mediationsdk.a.b
    public final String q(int i) {
        return this.P;
    }

    @Override // com.ironsource.mediationsdk.a.b
    public final boolean s(c cVar) {
        int a = cVar.a();
        return a == 2204 || a == 2004 || a == 2005 || a == 2301 || a == 2300 || a == 3009;
    }

    @Override // com.ironsource.mediationsdk.a.b
    public final int u(c cVar) {
        return o.a().b(b.t(cVar.a()) == b.a.BANNER.t ? 3 : 2);
    }
}