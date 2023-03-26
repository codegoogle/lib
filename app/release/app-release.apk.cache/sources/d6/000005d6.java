package com.anythink.core.common.b;

import com.anythink.core.api.ATAdSourceStatusListener;
import com.anythink.core.api.AdError;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class b {
    public WeakReference<ATAdSourceStatusListener> a;

    public final void a(ATAdSourceStatusListener aTAdSourceStatusListener) {
        if (aTAdSourceStatusListener == null) {
            return;
        }
        this.a = new WeakReference<>(aTAdSourceStatusListener);
    }

    public final void b(com.anythink.core.common.e.e eVar) {
        final j a = j.a(eVar, (d) null);
        m.a().a(new Runnable() { // from class: com.anythink.core.common.b.b.2
            @Override // java.lang.Runnable
            public final void run() {
                ATAdSourceStatusListener a2 = b.a(b.this);
                if (a2 != null) {
                    a2.onAdSourceBiddingFilled(a);
                }
            }
        });
    }

    public final void c(com.anythink.core.common.e.e eVar) {
        final j a = j.a(eVar, (d) null);
        m.a().a(new Runnable() { // from class: com.anythink.core.common.b.b.4
            @Override // java.lang.Runnable
            public final void run() {
                ATAdSourceStatusListener a2 = b.a(b.this);
                if (a2 != null) {
                    a2.onAdSourceAttempt(a);
                }
            }
        });
    }

    public final void d(com.anythink.core.common.e.e eVar) {
        final j a = j.a(eVar, (d) null);
        m.a().a(new Runnable() { // from class: com.anythink.core.common.b.b.5
            @Override // java.lang.Runnable
            public final void run() {
                ATAdSourceStatusListener a2 = b.a(b.this);
                if (a2 != null) {
                    a2.onAdSourceLoadFilled(a);
                }
            }
        });
    }

    private ATAdSourceStatusListener a() {
        WeakReference<ATAdSourceStatusListener> weakReference = this.a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void b(com.anythink.core.common.e.e eVar, final AdError adError) {
        final j a = j.a(eVar, (d) null);
        m.a().a(new Runnable() { // from class: com.anythink.core.common.b.b.6
            @Override // java.lang.Runnable
            public final void run() {
                ATAdSourceStatusListener a2 = b.a(b.this);
                if (a2 != null) {
                    a2.onAdSourceLoadFail(a, adError);
                }
            }
        });
    }

    public final void a(com.anythink.core.common.e.e eVar) {
        final j a = j.a(eVar, (d) null);
        m.a().a(new Runnable() { // from class: com.anythink.core.common.b.b.1
            @Override // java.lang.Runnable
            public final void run() {
                ATAdSourceStatusListener a2 = b.a(b.this);
                if (a2 != null) {
                    a2.onAdSourceBiddingAttempt(a);
                }
            }
        });
    }

    public final void a(com.anythink.core.common.e.e eVar, final AdError adError) {
        final j a = j.a(eVar, (d) null);
        m.a().a(new Runnable() { // from class: com.anythink.core.common.b.b.3
            @Override // java.lang.Runnable
            public final void run() {
                ATAdSourceStatusListener a2 = b.a(b.this);
                if (a2 != null) {
                    a2.onAdSourceBiddingFail(a, adError);
                }
            }
        });
    }

    public static /* synthetic */ ATAdSourceStatusListener a(b bVar) {
        WeakReference<ATAdSourceStatusListener> weakReference = bVar.a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}