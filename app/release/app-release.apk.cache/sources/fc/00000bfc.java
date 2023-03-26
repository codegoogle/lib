package com.anythink.rewardvideo.a;

import android.app.Activity;
import android.content.Context;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATEventInterface;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.api.IExHandler;
import com.anythink.core.common.b.j;
import com.anythink.core.common.b.m;
import com.anythink.core.common.h;
import com.anythink.core.common.j.g;
import com.anythink.core.common.j.p;
import com.anythink.core.common.t;
import com.anythink.rewardvideo.api.ATRewardVideoListener;
import com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;

/* loaded from: classes2.dex */
public class a extends com.anythink.core.common.f<f> {
    public static final String a = "a";
    public Runnable n;

    private a(Context context, String str) {
        super(context, str);
        this.n = new Runnable() { // from class: com.anythink.rewardvideo.a.a.2
            @Override // java.lang.Runnable
            public final void run() {
                if (a.this.i()) {
                    a.this.a(m.a().E(), 4, (com.anythink.core.common.b.a) null, (com.anythink.core.common.b.b) null);
                }
            }
        };
    }

    @Override // com.anythink.core.common.f
    public final /* synthetic */ h a(f fVar) {
        f fVar2 = fVar;
        b bVar = new b(fVar2.a());
        bVar.a(fVar2.d);
        return bVar;
    }

    @Override // com.anythink.core.common.f
    public final boolean i() {
        return t.a().f(this.c);
    }

    @Override // com.anythink.core.common.f
    public final void j() {
        m.a().b(this.n);
    }

    public final void k() {
        m.a().a(this.n, ((long) Math.pow(2.0d, this.h)) * 1000);
    }

    public static a a(Context context, String str) {
        com.anythink.core.common.f b = t.a().b(str);
        if (b == null || !(b instanceof a)) {
            b = new a(context, str);
            t.a().a(str, b);
        }
        return (a) b;
    }

    public final synchronized void a(final Activity activity, final String str, final ATRewardVideoListener aTRewardVideoListener, final ATEventInterface aTEventInterface) {
        final com.anythink.core.common.e.b a2 = a((Context) activity, false, true);
        if (a2 != null && (a2.e() instanceof CustomRewardVideoAdapter)) {
            a(a2);
            e();
            a2.a(a2.d() + 1);
            com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.rewardvideo.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    com.anythink.core.common.e.e trackingInfo = a2.e().getTrackingInfo();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (trackingInfo != null) {
                        trackingInfo.v = a.this.g;
                        trackingInfo.C = str;
                        trackingInfo.h(g.a(trackingInfo.T(), trackingInfo.w(), currentTimeMillis));
                        p.a(a.this.b, trackingInfo);
                    }
                    com.anythink.core.common.a.a().a(a.this.b, a2);
                    com.anythink.core.common.i.a.a(a.this.b).a(13, trackingInfo, a2.e().getUnitGroupInfo(), currentTimeMillis);
                    final CustomRewardVideoAdapter customRewardVideoAdapter = (CustomRewardVideoAdapter) a2.e();
                    Activity activity2 = activity;
                    if (activity2 != null) {
                        customRewardVideoAdapter.refreshActivityContext(activity2);
                    }
                    m.a().a(new Runnable() { // from class: com.anythink.rewardvideo.a.a.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            customRewardVideoAdapter.setScenario(str);
                            IExHandler b = m.a().b();
                            if (b != null) {
                                CustomRewardVideoAdapter customRewardVideoAdapter2 = customRewardVideoAdapter;
                                customRewardVideoAdapter2.setAdDownloadListener(b.createDownloadListener(customRewardVideoAdapter2, null, aTEventInterface));
                            }
                            CustomRewardVideoAdapter customRewardVideoAdapter3 = customRewardVideoAdapter;
                            customRewardVideoAdapter3.internalShow(activity, new e(customRewardVideoAdapter3, m.a().z(), aTRewardVideoListener));
                        }
                    });
                }
            });
            return;
        }
        if (i()) {
            a(m.a().E(), 7, (com.anythink.core.common.b.a) null, (com.anythink.core.common.b.b) null);
        }
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.noADError, "", "No Cache.");
        if (aTRewardVideoListener != null) {
            aTRewardVideoListener.onRewardedVideoAdPlayFailed(errorCode, j.a((com.anythink.core.common.b.d) null));
        }
    }

    public final void a(Context context, int i, com.anythink.core.common.b.a aVar, com.anythink.core.common.b.b bVar) {
        f fVar = new f();
        fVar.a(context);
        fVar.d = i;
        fVar.e = bVar;
        super.a(this.b, "1", this.c, (String) fVar, aVar);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static h a2(f fVar) {
        b bVar = new b(fVar.a());
        bVar.a(fVar.d);
        return bVar;
    }

    @Override // com.anythink.core.common.f
    public final ATAdStatusInfo a(Context context) {
        ATAdStatusInfo a2 = super.a(context);
        if (!b() && a(a2)) {
            a(context, 5, (com.anythink.core.common.b.a) null, (com.anythink.core.common.b.b) null);
        }
        return a2;
    }
}