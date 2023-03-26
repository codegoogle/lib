package com.anythink.expressad.e;

import android.app.Application;
import android.content.Context;
import com.anythink.expressad.b;
import com.anythink.expressad.foundation.g.f.m;
import com.anythink.expressad.out.r;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a implements com.anythink.expressad.b {
    public static Map<String, String> a;
    private Context c;
    private r d;
    private volatile int b = b.a.a;
    private boolean e = false;

    private void d() {
        this.e = false;
        try {
            m.a(this.c);
            com.anythink.expressad.foundation.b.b.a().a(a, this.c);
            this.b = b.a.c;
            if (this.d == null || this.e) {
                return;
            }
            this.e = true;
        } catch (Exception e) {
            e.printStackTrace();
            if (this.d == null || this.e) {
                return;
            }
            this.e = true;
        }
    }

    @Override // com.anythink.expressad.b
    public final int a() {
        return this.b;
    }

    @Override // com.anythink.expressad.b
    public final Map<String, String> b() {
        return new HashMap();
    }

    @Override // com.anythink.expressad.b
    public final void c() {
        if (this.b == b.a.c) {
            com.anythink.expressad.foundation.b.b.a().b();
        }
    }

    private void a(Application application) {
        this.c = application.getApplicationContext();
        d();
    }

    @Override // com.anythink.expressad.b
    public final void a(Map<String, String> map, Application application) {
        this.c = application.getApplicationContext();
        a = map;
        d();
    }

    @Override // com.anythink.expressad.b
    public final void a(Map<String, String> map, Context context) {
        this.c = context.getApplicationContext();
        a = map;
        d();
    }

    @Override // com.anythink.expressad.b
    public final void a(Map<String, String> map, Application application, r rVar) {
        this.c = application;
        this.d = rVar;
        a = map;
        d();
    }

    private static void a(Context context) {
        if (com.anythink.expressad.foundation.b.a.b().d() != null || context == null) {
            return;
        }
        com.anythink.expressad.foundation.b.a.b().a(context);
    }
}