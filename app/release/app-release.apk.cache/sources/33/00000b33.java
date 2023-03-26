package com.anythink.interstitial.a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATEventInterface;
import com.anythink.core.api.IExHandler;
import com.anythink.core.common.b.m;
import com.anythink.core.common.h;
import com.anythink.core.common.j.g;
import com.anythink.core.common.j.p;
import com.anythink.core.common.res.b;
import com.anythink.core.common.t;
import com.anythink.interstitial.api.ATInterstitialListener;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter;
import com.p7700g.p99005.wo1;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class a extends com.anythink.core.common.f<e> {
    public static final String a = "a";
    public Runnable n;
    private View o;
    private AtomicBoolean p;

    /* renamed from: com.anythink.interstitial.a.a$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements View.OnTouchListener {
        public AnonymousClass2() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.anythink.interstitial.a.a$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 implements b.a {
        public final /* synthetic */ WeakReference a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;

        public AnonymousClass3(WeakReference weakReference, String str, int i) {
            this.a = weakReference;
            this.b = str;
            this.c = i;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
            String str3 = a.a;
            "load: image load fail:".concat(String.valueOf(str2));
            ImageView imageView = (ImageView) this.a.get();
            if (!TextUtils.equals(this.b, str) || imageView == null) {
                return;
            }
            imageView.setImageResource(this.c);
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            ImageView imageView = (ImageView) this.a.get();
            if (!TextUtils.equals(this.b, str) || imageView == null) {
                return;
            }
            imageView.setImageBitmap(bitmap);
        }
    }

    private a(Context context, String str) {
        super(context, str);
        this.p = new AtomicBoolean(false);
        this.n = new Runnable() { // from class: com.anythink.interstitial.a.a.4
            @Override // java.lang.Runnable
            public final void run() {
                if (a.this.i()) {
                    a.this.a(m.a().E(), 4, (com.anythink.core.common.b.a) null, (com.anythink.core.common.b.b) null);
                }
            }
        };
    }

    private static void l() {
    }

    private static void m() {
    }

    private static void n() {
    }

    @Override // com.anythink.core.common.f
    public final /* synthetic */ h a(e eVar) {
        e eVar2 = eVar;
        f fVar = new f(eVar2.a());
        fVar.a(eVar2.d);
        return fVar;
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

    public final synchronized void a(final Activity activity, final String str, final ATInterstitialListener aTInterstitialListener, final ATEventInterface aTEventInterface) {
        if (this.p.get()) {
            String str2 = a;
            com.anythink.core.common.j.e.b(str2, "The placementId(" + this.c + ") is already in the process of being delayed.");
            return;
        }
        final com.anythink.core.common.e.b a2 = a((Context) activity, false, true);
        if (a2 == null || !(a2.e() instanceof CustomInterstitialAdapter)) {
            if (i()) {
                a(m.a().E(), 7, (com.anythink.core.common.b.a) null, (com.anythink.core.common.b.b) null);
            }
            return;
        }
        a(a2);
        e();
        a2.a(a2.d() + 1);
        final int ae = a2.e().getUnitGroupInfo().ae();
        com.anythink.core.common.j.e.b(a, "show delay time: ".concat(String.valueOf(ae)));
        if (ae > 0) {
            this.p.set(true);
        }
        com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.interstitial.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                final CustomInterstitialAdapter customInterstitialAdapter = (CustomInterstitialAdapter) a2.e();
                Activity activity2 = activity;
                if (activity2 != null) {
                    customInterstitialAdapter.refreshActivityContext(activity2);
                }
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
                if (ae > 0) {
                    m.a().a(new Runnable() { // from class: com.anythink.interstitial.a.a.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            a.a(a.this, activity);
                        }
                    });
                }
                m.a().a(new Runnable() { // from class: com.anythink.interstitial.a.a.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        customInterstitialAdapter.setScenario(str);
                        IExHandler b = m.a().b();
                        if (b != null) {
                            CustomInterstitialAdapter customInterstitialAdapter2 = customInterstitialAdapter;
                            customInterstitialAdapter2.setAdDownloadListener(b.createDownloadListener(customInterstitialAdapter2, null, aTEventInterface));
                        }
                        CustomInterstitialAdapter customInterstitialAdapter3 = customInterstitialAdapter;
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        customInterstitialAdapter3.internalShow(activity, new d(customInterstitialAdapter3, aTInterstitialListener));
                        AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                        if (ae <= 0 || !a.this.p.get()) {
                            return;
                        }
                        if (a.this.o != null) {
                            ((ViewGroup) a.this.o.getParent()).removeView(a.this.o);
                        }
                        a.this.p.set(false);
                    }
                }, ae);
            }
        });
    }

    private void a(Activity activity) {
        if (activity == null) {
            return;
        }
        com.anythink.core.c.a l0 = wo1.l0(com.anythink.core.c.b.a(this.b));
        String d = l0.d();
        String c = l0.c();
        if (this.o == null) {
            this.o = LayoutInflater.from(activity.getApplicationContext()).inflate(com.anythink.core.common.j.h.a(activity, "interstitial_loading_layout", "layout"), (ViewGroup) null);
        }
        this.o.setOnTouchListener(new AnonymousClass2());
        ImageView imageView = (ImageView) this.o.findViewById(com.anythink.core.common.j.h.a(activity, "interstitial_iv_loading", "id"));
        TextView textView = (TextView) this.o.findViewById(com.anythink.core.common.j.h.a(activity, "interstitial_tv_loading", "id"));
        int a2 = com.anythink.core.common.j.h.a(activity, 30.0f);
        imageView.setMinimumWidth(a2);
        imageView.setMinimumHeight(a2);
        int a3 = com.anythink.core.common.j.h.a(activity, 90.0f);
        imageView.setMaxWidth(a3);
        imageView.setMaxHeight(a3);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        int a4 = com.anythink.core.common.j.h.a(activity, "interstitial_loading_default", com.anythink.expressad.foundation.h.h.c);
        if (TextUtils.isEmpty(d)) {
            imageView.setImageResource(a4);
        } else {
            com.anythink.core.common.res.b.a(activity.getApplicationContext()).a(new com.anythink.core.common.res.e(3, d), new AnonymousClass3(new WeakReference(imageView), d, a4));
        }
        if (!TextUtils.isEmpty(c)) {
            textView.setText(c);
        } else {
            textView.setText(com.anythink.core.common.j.h.a(activity, "interstitial_text_loading_default", "string"));
        }
        View view = this.o;
        if (view != null && view.getParent() != null) {
            ((ViewGroup) this.o.getParent()).removeView(this.o);
        }
        ((ViewGroup) activity.getWindow().getDecorView()).addView(this.o, new FrameLayout.LayoutParams(-1, -1));
    }

    public final void a(Context context, int i, com.anythink.core.common.b.a aVar, com.anythink.core.common.b.b bVar) {
        e eVar = new e();
        eVar.a(context);
        eVar.d = i;
        eVar.e = bVar;
        super.a(this.b, "3", this.c, (String) eVar, aVar);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static h a2(e eVar) {
        f fVar = new f(eVar.a());
        fVar.a(eVar.d);
        return fVar;
    }

    @Override // com.anythink.core.common.f
    public final ATAdStatusInfo a(Context context) {
        ATAdStatusInfo a2 = super.a(context);
        if (!b() && a(a2)) {
            a(context, 5, (com.anythink.core.common.b.a) null, (com.anythink.core.common.b.b) null);
        }
        return a2;
    }

    public static /* synthetic */ void a(a aVar, Activity activity) {
        if (activity != null) {
            com.anythink.core.c.a l0 = wo1.l0(com.anythink.core.c.b.a(aVar.b));
            String d = l0.d();
            String c = l0.c();
            if (aVar.o == null) {
                aVar.o = LayoutInflater.from(activity.getApplicationContext()).inflate(com.anythink.core.common.j.h.a(activity, "interstitial_loading_layout", "layout"), (ViewGroup) null);
            }
            aVar.o.setOnTouchListener(new AnonymousClass2());
            ImageView imageView = (ImageView) aVar.o.findViewById(com.anythink.core.common.j.h.a(activity, "interstitial_iv_loading", "id"));
            TextView textView = (TextView) aVar.o.findViewById(com.anythink.core.common.j.h.a(activity, "interstitial_tv_loading", "id"));
            int a2 = com.anythink.core.common.j.h.a(activity, 30.0f);
            imageView.setMinimumWidth(a2);
            imageView.setMinimumHeight(a2);
            int a3 = com.anythink.core.common.j.h.a(activity, 90.0f);
            imageView.setMaxWidth(a3);
            imageView.setMaxHeight(a3);
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int a4 = com.anythink.core.common.j.h.a(activity, "interstitial_loading_default", com.anythink.expressad.foundation.h.h.c);
            if (TextUtils.isEmpty(d)) {
                imageView.setImageResource(a4);
            } else {
                com.anythink.core.common.res.b.a(activity.getApplicationContext()).a(new com.anythink.core.common.res.e(3, d), new AnonymousClass3(new WeakReference(imageView), d, a4));
            }
            if (!TextUtils.isEmpty(c)) {
                textView.setText(c);
            } else {
                textView.setText(com.anythink.core.common.j.h.a(activity, "interstitial_text_loading_default", "string"));
            }
            View view = aVar.o;
            if (view != null && view.getParent() != null) {
                ((ViewGroup) aVar.o.getParent()).removeView(aVar.o);
            }
            ((ViewGroup) activity.getWindow().getDecorView()).addView(aVar.o, new FrameLayout.LayoutParams(-1, -1));
        }
    }
}