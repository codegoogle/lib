package com.anythink.core.common;

import android.content.Context;
import android.os.CountDownTimer;
import android.os.SystemClock;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.AdError;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.af;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class g extends CountDownTimer {
    public af a;
    public com.anythink.core.common.e.e b;
    public com.anythink.core.c.d c;
    public boolean d;
    private final String e;

    /* loaded from: classes2.dex */
    public class a implements ATCustomLoadListener {
        public ATBaseAdAdapter a;
        public long b;

        public /* synthetic */ a(g gVar, long j, ATBaseAdAdapter aTBaseAdAdapter, byte b) {
            this(j, aTBaseAdAdapter);
        }

        @Override // com.anythink.core.api.ATCustomLoadListener
        public final void onAdCacheLoaded(BaseAd... baseAdArr) {
            g.this.a(this.b, this.a, baseAdArr != null ? Arrays.asList(baseAdArr) : null);
            ATBaseAdAdapter aTBaseAdAdapter = this.a;
            if (aTBaseAdAdapter != null) {
                aTBaseAdAdapter.releaseLoadResource();
            }
        }

        @Override // com.anythink.core.api.ATCustomLoadListener
        public final void onAdDataLoaded() {
            g.a(this.b, this.a);
        }

        @Override // com.anythink.core.api.ATCustomLoadListener
        public final void onAdLoadError(String str, String str2) {
            g gVar = g.this;
            long j = this.b;
            ATBaseAdAdapter aTBaseAdAdapter = this.a;
            AdError errorCode = ErrorCode.getErrorCode(ErrorCode.noADError, str, str2);
            com.anythink.core.common.e.e trackingInfo = aTBaseAdAdapter.getTrackingInfo();
            if (!gVar.d) {
                gVar.d = true;
                com.anythink.core.common.i.c.a(trackingInfo, 0, errorCode, SystemClock.elapsedRealtime() - j);
                com.anythink.core.common.j.g.a(trackingInfo, g.i.b, g.i.g, errorCode.printStackTrace());
            }
            ATBaseAdAdapter aTBaseAdAdapter2 = this.a;
            if (aTBaseAdAdapter2 != null) {
                aTBaseAdAdapter2.releaseLoadResource();
            }
        }

        private a(long j, ATBaseAdAdapter aTBaseAdAdapter) {
            this.b = j;
            this.a = aTBaseAdAdapter;
        }
    }

    public g(long j, long j2, af afVar, com.anythink.core.common.e.e eVar) {
        super(j, j2);
        this.e = g.class.getSimpleName();
        this.d = false;
        this.a = afVar;
        this.b = eVar;
    }

    private void a(Context context) {
        ATBaseAdAdapter a2 = com.anythink.core.common.j.i.a(this.a);
        if (a2 == null) {
            return;
        }
        com.anythink.core.common.e.e eVar = this.b;
        eVar.q = 1;
        eVar.r = 0;
        eVar.s = 0;
        a2.setTrackingInfo(eVar);
        a2.setUnitGroupInfo(this.a);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        com.anythink.core.common.i.a.a(context).a(1, this.b);
        com.anythink.core.common.j.e.b(this.e, "start to refresh Ad---");
        com.anythink.core.common.j.g.a(this.b, g.i.a, g.i.h, "");
        this.c = com.anythink.core.c.e.a(com.anythink.core.common.b.m.a().e()).a(this.b.S());
        com.anythink.core.common.a.a().a(this.b.S(), this.b.w());
        this.d = false;
        a2.internalLoad(context, this.c.a(this.b.S(), this.b.T(), a2.getUnitGroupInfo()), t.a().c(this.b.S()), new a(this, elapsedRealtime, a2, (byte) 0));
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        Context e;
        ATBaseAdAdapter a2;
        if (this.a == null || this.b == null || (e = com.anythink.core.common.b.m.a().e()) == null || (a2 = com.anythink.core.common.j.i.a(this.a)) == null) {
            return;
        }
        com.anythink.core.common.e.e eVar = this.b;
        eVar.q = 1;
        eVar.r = 0;
        eVar.s = 0;
        a2.setTrackingInfo(eVar);
        a2.setUnitGroupInfo(this.a);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        com.anythink.core.common.i.a.a(e).a(1, this.b);
        com.anythink.core.common.j.e.b(this.e, "start to refresh Ad---");
        com.anythink.core.common.j.g.a(this.b, g.i.a, g.i.h, "");
        this.c = com.anythink.core.c.e.a(com.anythink.core.common.b.m.a().e()).a(this.b.S());
        com.anythink.core.common.a.a().a(this.b.S(), this.b.w());
        this.d = false;
        a2.internalLoad(e, this.c.a(this.b.S(), this.b.T(), a2.getUnitGroupInfo()), t.a().c(this.b.S()), new a(this, elapsedRealtime, a2, (byte) 0));
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }

    public static void a(long j, com.anythink.core.common.b.d dVar) {
        dVar.getTrackingInfo().c(SystemClock.elapsedRealtime() - j);
    }

    public final void a(long j, ATBaseAdAdapter aTBaseAdAdapter, List<? extends BaseAd> list) {
        com.anythink.core.common.e.e trackingInfo = aTBaseAdAdapter.getTrackingInfo();
        if (!this.d) {
            this.d = true;
            trackingInfo.d(SystemClock.elapsedRealtime() - j);
            com.anythink.core.common.i.a.a(com.anythink.core.common.b.m.a().e()).a(2, trackingInfo);
            com.anythink.core.common.j.g.a(trackingInfo, g.i.b, g.i.f, "");
        }
        com.anythink.core.common.a.a().a(trackingInfo.S(), trackingInfo.y(), aTBaseAdAdapter, list, this.a.p());
    }

    private void a(long j, com.anythink.core.common.b.d dVar, AdError adError) {
        com.anythink.core.common.e.e trackingInfo = dVar.getTrackingInfo();
        if (this.d) {
            return;
        }
        this.d = true;
        com.anythink.core.common.i.c.a(trackingInfo, 0, adError, SystemClock.elapsedRealtime() - j);
        com.anythink.core.common.j.g.a(trackingInfo, g.i.b, g.i.g, adError.printStackTrace());
    }
}