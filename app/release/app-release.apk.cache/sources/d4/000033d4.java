package com.ironsource.environment.c;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.environment.a;
import com.ironsource.environment.e.c;
import com.ironsource.environment.h;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a {
    public ConcurrentHashMap<String, Object> a;
    public AtomicBoolean b;
    public AtomicBoolean c;

    /* renamed from: com.ironsource.environment.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0112a {
        public static volatile a a = new a((byte) 0);
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        private /* synthetic */ Context s;

        public b(Context context) {
            this.s = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String[] C;
            try {
                a aVar = a.this;
                Context context = this.s;
                if (context != null && (C = h.C(context)) != null && C.length == 2) {
                    String str = C[0];
                    Boolean valueOf = Boolean.valueOf(C[1]);
                    if (!TextUtils.isEmpty(str)) {
                        aVar.a("gaid", str);
                        aVar.a("lat", valueOf);
                    }
                }
            } catch (Exception unused) {
            }
            a.this.b.set(false);
        }
    }

    private a() {
        this.b = new AtomicBoolean(false);
        this.c = new AtomicBoolean(false);
        this.a = new ConcurrentHashMap<>();
    }

    public /* synthetic */ a(byte b2) {
        this();
    }

    private void b(String str) {
        try {
            this.a.remove(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean c(String str) {
        try {
            return this.a.containsKey(str);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private void d(Context context) {
        if (this.b.get()) {
            return;
        }
        try {
            this.b.set(true);
            c.a.c(new b(context));
        } catch (Exception unused) {
            this.b.set(false);
        }
    }

    public final JSONObject a(Context context) {
        b(context);
        return new JSONObject(com.ironsource.environment.c.b.a(this.a));
    }

    public void a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            if (obj instanceof Boolean) {
                obj = Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
            }
            this.a.put(str, obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void b(Context context) {
        if (context == null) {
            return;
        }
        d(context);
        String B = h.B(context);
        if (!TextUtils.isEmpty(B)) {
            a("asid", B);
        } else if (c("asid")) {
            b("asid");
        }
        String language = context.getResources().getConfiguration().locale.getLanguage();
        if (!TextUtils.isEmpty(language)) {
            a("lang", language.toUpperCase());
        }
        String c = h.c();
        if (!TextUtils.isEmpty(c)) {
            a(com.anythink.expressad.foundation.g.a.V, c);
        }
        String a = com.ironsource.d.a.a(context);
        if (!TextUtils.isEmpty(a) && !a.equals("none")) {
            a("connt", a);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            a("vpn", Boolean.valueOf(com.ironsource.d.a.c(context)));
        }
        String j = h.j(context);
        if (!TextUtils.isEmpty(j)) {
            a("icc", j);
        }
        a("vol", Float.valueOf(h.l(context)));
        a("dfs", String.valueOf(h.p()));
        a("scrnw", Integer.valueOf(h.k()));
        a("scrnh", Integer.valueOf(h.l()));
        a("ltime", String.valueOf(h.a()));
        a("tzoff", String.valueOf(h.b()));
        a("mcc", Integer.valueOf(a.AnonymousClass1.c(context)));
        a("mnc", Integer.valueOf(a.AnonymousClass1.d(context)));
        a("sdcrd", Boolean.valueOf(h.d()));
        a("chrg", Boolean.valueOf(h.e(context)));
        a("chrgt", Integer.valueOf(h.f(context)));
        a("apm", Boolean.valueOf(h.g(context)));
        a("owp", Boolean.valueOf(h.h(context)));
        a("rt", Boolean.valueOf(h.j()));
        a("sscl", String.valueOf(h.o()));
        a("bat", Integer.valueOf(h.v(context)));
        a("lpm", Boolean.valueOf(h.w(context)));
        a("apor", h.n(context));
        a("ua", h.r());
        int D = h.D(context);
        if (D >= 0) {
            a("tca", Integer.valueOf(D));
        }
        Object E = h.E(context);
        if (E != null) {
            a("tcs", E);
        }
    }
}