package com.anythink.splashad.a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.basead.ui.ThirdPartySplashAdView;
import com.anythink.core.api.ATEventInterface;
import com.anythink.core.api.ATMediationRequestInfo;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.api.IExHandler;
import com.anythink.core.common.b.l;
import com.anythink.core.common.b.m;
import com.anythink.core.common.h;
import com.anythink.core.common.j.p;
import com.anythink.core.common.t;
import com.anythink.splashad.api.ATSplashSkipAdListener;
import com.anythink.splashad.api.ATSplashSkipInfo;
import com.anythink.splashad.unitgroup.api.CustomSplashAdapter;

/* loaded from: classes2.dex */
public final class c extends com.anythink.core.common.f<g> {
    public d a;

    /* renamed from: com.anythink.splashad.a.c$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements l {
        public final /* synthetic */ boolean[] a;
        public final /* synthetic */ f b;

        public AnonymousClass2(boolean[] zArr, f fVar) {
            this.a = zArr;
            this.b = fVar;
        }

        @Override // com.anythink.core.common.b.l
        public final void onAdClicked(View view) {
            this.b.onSplashAdClicked();
        }

        @Override // com.anythink.core.common.b.l
        public final void onAdDislikeButtonClick() {
        }

        @Override // com.anythink.core.common.b.l
        public final void onAdImpressed() {
            boolean[] zArr = this.a;
            if (zArr[0]) {
                return;
            }
            zArr[0] = true;
            this.b.onSplashAdShow();
        }

        @Override // com.anythink.core.common.b.l
        public final void onAdVideoEnd() {
        }

        @Override // com.anythink.core.common.b.l
        public final void onAdVideoProgress(int i) {
        }

        @Override // com.anythink.core.common.b.l
        public final void onAdVideoStart() {
        }

        @Override // com.anythink.core.common.b.l
        public final void onDeeplinkCallback(boolean z) {
            this.b.onDeeplinkCallback(z);
        }

        @Override // com.anythink.core.common.b.l
        public final void onDownloadConfirmCallback(Context context, View view, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
            this.b.onDownloadConfirm(context, aTNetworkConfirmInfo);
        }
    }

    /* renamed from: com.anythink.splashad.a.c$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 implements com.anythink.basead.e.a {
        public final /* synthetic */ f a;

        public AnonymousClass3(f fVar) {
            this.a = fVar;
        }

        @Override // com.anythink.basead.e.a
        public final void onAdClick(int i) {
        }

        @Override // com.anythink.basead.e.a
        public final void onAdClosed() {
            this.a.onSplashAdDismiss();
        }

        @Override // com.anythink.basead.e.a
        public final void onAdShow() {
        }

        @Override // com.anythink.basead.e.a
        public final void onDeeplinkCallback(boolean z) {
        }
    }

    private c(Context context, String str) {
        super(context, str);
    }

    private void e(String str) {
        d dVar = this.a;
        if (dVar != null) {
            com.anythink.core.common.e.e eVar = new com.anythink.core.common.e.e();
            eVar.v(dVar.f);
            eVar.w(dVar.e);
            eVar.x("4");
            eVar.u("0");
            eVar.a(true);
            com.anythink.core.common.i.c.a(eVar, ErrorCode.getErrorCode(ErrorCode.timeOutError, "", "Splash FetchAd Timeout."));
            this.a.b = null;
            this.a = null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        h hVar = this.d.get(str);
        this.d.remove(str);
        if (hVar != null) {
            if (hVar instanceof e) {
                ((e) hVar).j();
                return;
            }
            return;
        }
        com.anythink.core.common.e.e eVar2 = new com.anythink.core.common.e.e();
        eVar2.v(this.c);
        eVar2.w(str);
        eVar2.x("4");
        eVar2.u("0");
        eVar2.a(true);
        com.anythink.core.common.i.c.a(eVar2, ErrorCode.getErrorCode(ErrorCode.timeOutError, "", "Splash FetchAd Timeout."));
    }

    @Override // com.anythink.core.common.f
    public final /* synthetic */ h a(g gVar) {
        g gVar2 = gVar;
        e eVar = new e(gVar2.a());
        eVar.T = gVar2.g;
        eVar.a(gVar2.d);
        return eVar;
    }

    @Override // com.anythink.core.common.f
    public final boolean f() {
        d dVar = this.a;
        return dVar != null && dVar.a();
    }

    @Override // com.anythink.core.common.f
    public final boolean h() {
        d dVar = this.a;
        if (dVar != null) {
            return !TextUtils.isEmpty(dVar.e);
        }
        return super.h();
    }

    @Override // com.anythink.core.common.f
    public final /* synthetic */ boolean a(String str, String str2, g gVar, com.anythink.core.common.b.a aVar) {
        g gVar2 = gVar;
        if (aVar == null || !(aVar instanceof b)) {
            return false;
        }
        d dVar = new d(this.b);
        this.a = dVar;
        dVar.a(gVar2.a(), str, str2, gVar2.b, gVar2.c, (b) aVar, gVar2.g);
        return true;
    }

    public static c a(Context context, String str) {
        com.anythink.core.common.f b = t.a().b(str);
        if (b == null || !(b instanceof c)) {
            b = new c(context, str);
            t.a().a(str, b);
        }
        return (c) b;
    }

    public final void a(Context context, ATMediationRequestInfo aTMediationRequestInfo, String str, b bVar, int i, int i2, com.anythink.core.common.b.b bVar2) {
        g gVar = new g();
        gVar.a(context);
        gVar.b = aTMediationRequestInfo;
        gVar.c = str;
        gVar.g = i;
        gVar.d = i2;
        gVar.e = bVar2;
        super.a(this.b, "4", this.c, (String) gVar, (com.anythink.core.common.b.a) bVar);
    }

    @Override // com.anythink.core.common.f
    public final void a(String str, com.anythink.core.common.b.a aVar) {
        if (aVar == null || !(aVar instanceof b)) {
            return;
        }
        ((b) aVar).setRequestId(str);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static h a2(g gVar) {
        e eVar = new e(gVar.a());
        eVar.T = gVar.g;
        eVar.a(gVar.d);
        return eVar;
    }

    @Override // com.anythink.core.common.f
    public final com.anythink.core.common.e.b a(Context context, boolean z, boolean z2) {
        com.anythink.core.common.e.b bVar;
        d dVar = this.a;
        com.anythink.core.common.e.b bVar2 = null;
        if (dVar != null && (bVar = dVar.d) != null && bVar.d() <= 0) {
            bVar2 = dVar.d;
        }
        if (bVar2 != null) {
            com.anythink.core.common.e.e h = bVar2.h();
            if (z) {
                com.anythink.core.common.i.c.a(h, true, -1, 0, h.w(), h.G(), h.u, "", h.T(), h.q == 3, "");
            }
            return bVar2;
        }
        return super.a(context, z, z2);
    }

    public final synchronized void a(final Activity activity, final ViewGroup viewGroup, final a aVar, final ATEventInterface aTEventInterface, final ATSplashSkipInfo aTSplashSkipInfo, final String str) {
        final com.anythink.core.common.e.b a = a((Context) activity, false, true);
        if (a == null) {
            return;
        }
        if (a.e() instanceof CustomSplashAdapter) {
            a(a);
            e();
            a.a(a.d() + 1);
            d dVar = this.a;
            if (dVar != null && dVar.d == a) {
                dVar.d = null;
            }
            com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.splashad.a.c.1
                @Override // java.lang.Runnable
                public final void run() {
                    final CustomSplashAdapter customSplashAdapter = (CustomSplashAdapter) a.e();
                    Activity activity2 = activity;
                    if (activity2 != null) {
                        customSplashAdapter.refreshActivityContext(activity2);
                    }
                    final com.anythink.core.common.e.e trackingInfo = a.e().getTrackingInfo();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (trackingInfo != null) {
                        trackingInfo.v = c.this.g;
                        trackingInfo.C = str;
                        trackingInfo.h(com.anythink.core.common.j.g.a(trackingInfo.T(), trackingInfo.w(), currentTimeMillis));
                        p.a(c.this.b, trackingInfo);
                    }
                    com.anythink.core.common.a.a().a(c.this.b, a);
                    com.anythink.core.common.i.a.a(c.this.b).a(13, trackingInfo, customSplashAdapter.getUnitGroupInfo(), currentTimeMillis);
                    m.a().a(new Runnable() { // from class: com.anythink.splashad.a.c.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewGroup viewGroup2;
                            IExHandler b = m.a().b();
                            if (b != null) {
                                CustomSplashAdapter customSplashAdapter2 = customSplashAdapter;
                                customSplashAdapter2.setAdDownloadListener(b.createDownloadListener(customSplashAdapter2, null, aTEventInterface));
                            }
                            ATSplashSkipInfo aTSplashSkipInfo2 = aTSplashSkipInfo;
                            boolean z = aTSplashSkipInfo2 != null && aTSplashSkipInfo2.canUseCustomSkipView();
                            boolean isSupportCustomSkipView = customSplashAdapter.isSupportCustomSkipView();
                            if (z && isSupportCustomSkipView) {
                                customSplashAdapter.setSplashSkipInfo(aTSplashSkipInfo);
                            }
                            final f fVar = new f(customSplashAdapter, aVar);
                            if (customSplashAdapter.getMixedFormatAdType() == 0) {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                c cVar = c.this;
                                Activity activity3 = activity;
                                ViewGroup viewGroup3 = viewGroup;
                                BaseAd f = a.f();
                                com.anythink.core.common.e.e eVar = trackingInfo;
                                if (f != null && (f instanceof com.anythink.core.common.e.a.e)) {
                                    f.setNativeEventListener(new AnonymousClass2(new boolean[]{false}, fVar));
                                    ThirdPartySplashAdView thirdPartySplashAdView = new ThirdPartySplashAdView(activity3.getApplicationContext(), new com.anythink.core.common.e.a.c((com.anythink.core.common.e.a.a) f, eVar, Integer.parseInt("4")), new com.anythink.core.common.e.a.b((com.anythink.core.common.e.a.e) f), new AnonymousClass3(fVar));
                                    thirdPartySplashAdView.setDontCountDown(z);
                                    if (f.getCustomAdContainer() != null) {
                                        viewGroup2 = f.getCustomAdContainer();
                                        viewGroup2.addView(thirdPartySplashAdView);
                                    } else {
                                        viewGroup2 = thirdPartySplashAdView;
                                    }
                                    thirdPartySplashAdView.registerNativeClickListener(viewGroup3);
                                    viewGroup3.addView(viewGroup2);
                                } else {
                                    fVar.a(99);
                                    fVar.onSplashAdDismiss();
                                }
                            } else {
                                CustomSplashAdapter customSplashAdapter3 = customSplashAdapter;
                                AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                                customSplashAdapter3.internalShow(activity, viewGroup, fVar);
                            }
                            if (z) {
                                ATSplashSkipAdListener aTSplashSkipAdListener = aTSplashSkipInfo.getATSplashSkipAdListener();
                                if (aTSplashSkipAdListener != null) {
                                    aTSplashSkipAdListener.isSupportCustomSkipView(isSupportCustomSkipView);
                                }
                                if (isSupportCustomSkipView) {
                                    aTSplashSkipInfo.getSkipView().setOnClickListener(new View.OnClickListener() { // from class: com.anythink.splashad.a.c.1.1.1
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            f fVar2 = fVar;
                                            if (fVar2 != null) {
                                                fVar2.a(2);
                                                fVar.onSplashAdDismiss();
                                            }
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            ATSplashSkipInfo aTSplashSkipInfo3 = aTSplashSkipInfo;
                        }
                    });
                }
            });
        }
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private boolean a2(String str, String str2, g gVar, com.anythink.core.common.b.a aVar) {
        if (aVar == null || !(aVar instanceof b)) {
            return false;
        }
        d dVar = new d(this.b);
        this.a = dVar;
        dVar.a(gVar.a(), str, str2, gVar.b, gVar.c, (b) aVar, gVar.g);
        return true;
    }

    private void a(Activity activity, ViewGroup viewGroup, f fVar, boolean z, BaseAd baseAd, com.anythink.core.common.e.e eVar) {
        ViewGroup viewGroup2;
        if (baseAd == null || !(baseAd instanceof com.anythink.core.common.e.a.e)) {
            if (fVar != null) {
                fVar.a(99);
                fVar.onSplashAdDismiss();
                return;
            }
            return;
        }
        baseAd.setNativeEventListener(new AnonymousClass2(new boolean[]{false}, fVar));
        ThirdPartySplashAdView thirdPartySplashAdView = new ThirdPartySplashAdView(activity.getApplicationContext(), new com.anythink.core.common.e.a.c((com.anythink.core.common.e.a.a) baseAd, eVar, Integer.parseInt("4")), new com.anythink.core.common.e.a.b((com.anythink.core.common.e.a.e) baseAd), new AnonymousClass3(fVar));
        thirdPartySplashAdView.setDontCountDown(z);
        if (baseAd.getCustomAdContainer() != null) {
            viewGroup2 = baseAd.getCustomAdContainer();
            viewGroup2.addView(thirdPartySplashAdView);
        } else {
            viewGroup2 = thirdPartySplashAdView;
        }
        thirdPartySplashAdView.registerNativeClickListener(viewGroup);
        viewGroup.addView(viewGroup2);
    }

    private static /* synthetic */ void a(c cVar, Activity activity, ViewGroup viewGroup, f fVar, boolean z, BaseAd baseAd, com.anythink.core.common.e.e eVar) {
        ViewGroup viewGroup2;
        if (baseAd != null && (baseAd instanceof com.anythink.core.common.e.a.e)) {
            baseAd.setNativeEventListener(new AnonymousClass2(new boolean[]{false}, fVar));
            ThirdPartySplashAdView thirdPartySplashAdView = new ThirdPartySplashAdView(activity.getApplicationContext(), new com.anythink.core.common.e.a.c((com.anythink.core.common.e.a.a) baseAd, eVar, Integer.parseInt("4")), new com.anythink.core.common.e.a.b((com.anythink.core.common.e.a.e) baseAd), new AnonymousClass3(fVar));
            thirdPartySplashAdView.setDontCountDown(z);
            if (baseAd.getCustomAdContainer() != null) {
                viewGroup2 = baseAd.getCustomAdContainer();
                viewGroup2.addView(thirdPartySplashAdView);
            } else {
                viewGroup2 = thirdPartySplashAdView;
            }
            thirdPartySplashAdView.registerNativeClickListener(viewGroup);
            viewGroup.addView(viewGroup2);
            return;
        }
        fVar.a(99);
        fVar.onSplashAdDismiss();
    }
}