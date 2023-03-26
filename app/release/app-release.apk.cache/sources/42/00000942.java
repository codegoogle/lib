package com.anythink.expressad.splash.c;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.anythink.core.common.b.m;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.splash.c.e;
import com.anythink.expressad.splash.view.ATSplashView;
import com.anythink.expressad.videocommon.b.g;
import com.p7700g.p99005.wo1;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class b {
    private static String a = "ResManager";
    private static int b = 1;
    private static ConcurrentHashMap<String, Boolean> c = new ConcurrentHashMap<>();

    private static com.anythink.expressad.foundation.d.c a(com.anythink.expressad.foundation.d.c cVar) {
        if (TextUtils.isEmpty(cVar.c()) && (TextUtils.isEmpty(cVar.d()) || !cVar.d().contains("<MBTPLMARK>"))) {
            cVar.a(false);
            cVar.b(true);
        } else {
            cVar.a(true);
            cVar.b(false);
        }
        return cVar;
    }

    private static String b(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return "file:///" + file.getAbsolutePath();
            }
            return "";
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Exception e) {
                e.getMessage();
                return "";
            }
        }
    }

    private static boolean a(com.anythink.expressad.foundation.d.c cVar, String str) {
        if (cVar != null) {
            boolean a2 = !TextUtils.isEmpty(cVar.R()) ? com.anythink.expressad.videocommon.b.c.a().a(com.anythink.expressad.foundation.g.a.aV, str, cVar.y()) : true;
            if (!TextUtils.isEmpty(cVar.c()) && TextUtils.isEmpty(g.a().c(cVar.c()))) {
                a2 = false;
            }
            if (TextUtils.isEmpty(cVar.c()) && !TextUtils.isEmpty(cVar.d()) && TextUtils.isEmpty(b(cVar.d()))) {
                return false;
            }
            return a2;
        }
        return false;
    }

    private static void a(final ATSplashView aTSplashView, com.anythink.expressad.foundation.d.c cVar, String str) {
        com.anythink.expressad.videocommon.d.b bVar = new com.anythink.expressad.videocommon.d.b() { // from class: com.anythink.expressad.splash.c.b.1
            @Override // com.anythink.expressad.videocommon.d.b
            public final void a(String str2) {
                ATSplashView.this.setVideoReady(true);
                n.a(b.a, "========VIDEO SUC");
            }

            @Override // com.anythink.expressad.videocommon.d.b
            public final void a(String str2, String str3) {
                ATSplashView.this.setVideoReady(false);
                n.a(b.a, "========VIDEO FAILED");
            }
        };
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        com.anythink.expressad.videocommon.b.c a2 = com.anythink.expressad.videocommon.b.c.a();
        m.a();
        a2.a(str, arrayList, com.anythink.expressad.foundation.g.a.aV, bVar);
        if (!com.anythink.expressad.videocommon.b.c.a().a(com.anythink.expressad.foundation.g.a.aV, str, cVar.y())) {
            com.anythink.expressad.videocommon.b.c.a().d(str);
        } else {
            aTSplashView.setVideoReady(true);
        }
    }

    public static void a(final ATSplashView aTSplashView, final com.anythink.expressad.foundation.d.c cVar, final com.anythink.expressad.splash.view.a aVar) {
        wo1.m0().a(cVar.be(), new com.anythink.expressad.foundation.g.d.c() { // from class: com.anythink.expressad.splash.c.b.2
            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(Bitmap bitmap, String str) {
                b.c.put(com.anythink.expressad.foundation.d.c.this.be(), Boolean.TRUE);
                com.anythink.expressad.splash.view.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a();
                }
                ATSplashView aTSplashView2 = aTSplashView;
                if (aTSplashView2 != null) {
                    aTSplashView2.setImageReady(true);
                }
            }

            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(String str, String str2) {
                b.c.put(com.anythink.expressad.foundation.d.c.this.be(), Boolean.FALSE);
                com.anythink.expressad.splash.view.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.b();
                }
                ATSplashView aTSplashView2 = aTSplashView;
                if (aTSplashView2 != null) {
                    aTSplashView2.setImageReady(false);
                }
            }
        });
        if (TextUtils.isEmpty(cVar.bd())) {
            return;
        }
        wo1.m0().a(cVar.bd(), new com.anythink.expressad.foundation.g.d.c() { // from class: com.anythink.expressad.splash.c.b.3
            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(Bitmap bitmap, String str) {
            }

            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(String str, String str2) {
            }
        });
    }

    private static void a(ATSplashView aTSplashView, String str, com.anythink.expressad.foundation.d.c cVar, String str2, String str3, boolean z, int i, boolean z2) {
        e.c cVar2 = new e.c();
        cVar2.c(str3);
        cVar2.b(str2);
        cVar2.a(cVar);
        cVar2.a(str);
        cVar2.b(z);
        cVar2.a(i);
        cVar2.a(z2);
        e.a.a().a(aTSplashView, cVar2, null);
    }

    public static boolean a(ATSplashView aTSplashView, com.anythink.expressad.foundation.d.c cVar) {
        if (aTSplashView == null) {
            n.d(a, "mbSplashView  is null");
            return false;
        }
        boolean z = true;
        if (!TextUtils.isEmpty(cVar.R())) {
            z = aTSplashView.isVideoReady();
            n.d(a, "======isReady isVideoReady:".concat(String.valueOf(z)));
        }
        if (z && !TextUtils.isEmpty(cVar.c())) {
            z = aTSplashView.isH5Ready();
            n.d(a, "======isReady getAdZip:".concat(String.valueOf(z)));
        }
        if (z && TextUtils.isEmpty(cVar.c()) && !TextUtils.isEmpty(cVar.d())) {
            z = aTSplashView.isH5Ready();
            n.d(a, "======isReady getAdHtml:".concat(String.valueOf(z)));
        }
        if (TextUtils.isEmpty(cVar.c()) && TextUtils.isEmpty(cVar.d())) {
            n.d(a, "======isReady getAdHtml  getAdZip all are empty");
            z = false;
        }
        if (cVar.j()) {
            boolean isImageReady = TextUtils.isEmpty(cVar.be()) ? false : aTSplashView.isImageReady();
            n.d(a, "======isReady DYNAMIC VIEW and image state is : ".concat(String.valueOf(isImageReady)));
            return isImageReady;
        }
        return z;
    }

    public static void a(String str) {
        c.remove(str);
    }
}