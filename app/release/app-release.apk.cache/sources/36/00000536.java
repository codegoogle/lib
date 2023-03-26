package com.anythink.core.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.c.d;
import com.anythink.core.common.c.j;
import com.anythink.core.common.e.ab;
import com.anythink.core.common.e.af;
import com.anythink.core.common.t;
import com.p7700g.p99005.wo1;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a {
    private static a e;
    public j a;
    public SimpleDateFormat b = new SimpleDateFormat("yyyyMMdd");
    public SimpleDateFormat c = new SimpleDateFormat("yyyyMMddHH");
    public Context d;

    private a(Context context) {
        this.a = j.a(com.anythink.core.common.c.c.a(context));
        this.d = context;
    }

    public static a a(Context context) {
        if (e == null) {
            e = new a(context);
        }
        return e;
    }

    public final void a() {
        com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                aVar.a.a(aVar.b.format(new Date(System.currentTimeMillis())));
            }
        });
    }

    public final boolean a(d dVar, String str) {
        if (dVar.W() == -1 && dVar.X() == -1) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ab a = this.a.a(str, wo1.j(currentTimeMillis, this.b), wo1.j(currentTimeMillis, this.c));
        int i = a != null ? a.c : 0;
        int i2 = a != null ? a.d : 0;
        if (dVar.W() == -1 || i < dVar.W()) {
            return dVar.X() != -1 && ((long) i2) >= dVar.X();
        }
        return true;
    }

    public final boolean a(String str, af afVar) {
        if (afVar.f() == -1 && afVar.e() == -1) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ab.a a = this.a.a(str, afVar.t(), wo1.j(currentTimeMillis, this.b), wo1.j(currentTimeMillis, this.c));
        if (a == null) {
            a = new ab.a();
        }
        if (afVar.f() == -1 || a.e < afVar.f()) {
            return afVar.e() != -1 && a.d >= afVar.e();
        }
        return true;
    }

    public final ab a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        return this.a.a(str, wo1.j(currentTimeMillis, this.b), wo1.j(currentTimeMillis, this.c));
    }

    public final ab.a a(String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        return this.a.a(str, str2, wo1.j(currentTimeMillis, this.b), wo1.j(currentTimeMillis, this.c));
    }

    public final Map<String, ab> a(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        return this.a.a(i, wo1.j(currentTimeMillis, this.b), wo1.j(currentTimeMillis, this.c));
    }

    public final void a(String str, String str2, String str3) {
        synchronized (t.a().a(str2)) {
            long currentTimeMillis = System.currentTimeMillis();
            String format = this.b.format(new Date(currentTimeMillis));
            String format2 = this.c.format(new Date(currentTimeMillis));
            int parseInt = Integer.parseInt(str);
            ab.a a = a(str2, str3);
            if (a == null) {
                a = new ab.a();
                a.a = str3;
            }
            if (!TextUtils.equals(format, a.c)) {
                a.d = 1;
                a.c = format;
            } else {
                a.d++;
            }
            if (!TextUtils.equals(format2, a.b)) {
                a.e = 1;
                a.b = format2;
            } else {
                a.e++;
            }
            a.f = currentTimeMillis;
            this.a.a(parseInt, str2, a);
        }
    }
}