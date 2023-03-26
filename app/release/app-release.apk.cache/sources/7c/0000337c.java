package com.iab.omid.library.ironsrc.b;

import android.annotation.SuppressLint;
import android.content.Context;
import com.p7700g.p99005.x1;

/* loaded from: classes3.dex */
public class b {
    @SuppressLint({"StaticFieldLeak"})
    private static b a = new b();
    private Context b;
    private boolean c;
    private boolean d;
    private a e;

    /* loaded from: classes3.dex */
    public interface a {
    }

    private b() {
    }

    public static b a() {
        return a;
    }

    private void e() {
        boolean z = !this.d;
        for (com.iab.omid.library.ironsrc.adsession.a aVar : com.iab.omid.library.ironsrc.b.a.a().b()) {
            aVar.getAdSessionStatePublisher().a(z);
        }
    }

    public void a(@x1 Context context) {
        this.b = context.getApplicationContext();
    }

    public void a(a aVar) {
        this.e = aVar;
    }

    public void b() {
        this.c = true;
        e();
    }

    public void c() {
        this.c = false;
        this.d = false;
        this.e = null;
    }

    public boolean d() {
        return !this.d;
    }
}