package com.anythink.expressad.splash.c;

import android.content.Context;
import com.anythink.core.common.b.m;
import com.anythink.expressad.splash.view.ATSplashNativeView;
import com.anythink.expressad.splash.view.ATSplashView;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: com.anythink.expressad.splash.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0074a {
        private static final a a = new a((byte) 0);

        public static /* synthetic */ a a() {
            return a;
        }
    }

    public /* synthetic */ a(byte b) {
        this();
    }

    private static a a() {
        return C0074a.a;
    }

    private a() {
    }

    public static void a(ATSplashView aTSplashView, com.anythink.expressad.splash.a.b bVar, com.anythink.expressad.splash.b.a aVar) {
        Context context = aTSplashView.getContext();
        if (context == null) {
            context = m.a().e();
        }
        try {
            aVar.a(new ATSplashNativeView(context, aTSplashView, bVar));
        } catch (Throwable unused) {
            aVar.a("View render error.");
        }
    }

    private static void a(Context context, ATSplashView aTSplashView, com.anythink.expressad.splash.a.b bVar, com.anythink.expressad.splash.b.a aVar) {
        try {
            ATSplashNativeView aTSplashNativeView = new ATSplashNativeView(context, aTSplashView, bVar);
            if (aVar != null) {
                aVar.a(aTSplashNativeView);
            }
        } catch (Throwable unused) {
            if (aVar != null) {
                aVar.a("View render error.");
            }
        }
    }
}