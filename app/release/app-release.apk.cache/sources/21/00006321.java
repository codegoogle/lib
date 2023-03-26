package com.p7700g.p99005;

import android.net.Uri;
import com.google.gson.Gson;
import com.p7700g.p99005.j41;
import java.util.List;

/* compiled from: BaseUrlProvider.java */
/* loaded from: classes.dex */
public class w71 {
    @x1
    public static final kj1 a = kj1.b("TelemetryUrlProvider");
    @x1
    public final s41 b;
    @x1
    public final Gson c;
    @x1
    public final h31 d;
    @x1
    public final o51 e;
    @x1
    private volatile en1 f = en1.UNKNOWN;

    public w71(@x1 Gson gson, @x1 o51 o51Var, @x1 s41 s41Var, @x1 h31 h31Var) {
        this.c = gson;
        this.b = s41Var;
        this.d = h31Var;
        this.e = o51Var;
        h31Var.f(new c21() { // from class: com.p7700g.p99005.t71
            @Override // com.p7700g.p99005.c21
            public final void a(Object obj) {
                w71.this.e(obj);
            }
        });
    }

    @x1
    private Uri a(@x1 String str, @x1 String str2) {
        return new Uri.Builder().scheme("https").authority(str).appendEncodedPath("api/report/").appendEncodedPath(str2).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void e(Object obj) {
        if (obj instanceof w51) {
            this.f = ((w51) obj).c();
        }
    }

    @x1
    public en1 b() {
        return this.f;
    }

    @z1
    public String c(@x1 j41.b bVar, @x1 List<String> list) {
        long currentTimeMillis = System.currentTimeMillis();
        String str = null;
        for (String str2 : list) {
            Uri a2 = a(str2, bVar.c());
            String authority = a2.getAuthority();
            long a3 = authority != null ? this.b.a(authority) : 0L;
            if (a3 < currentTimeMillis) {
                str = a2.toString();
                currentTimeMillis = a3;
            }
        }
        return str;
    }

    @z1
    public String f() {
        return null;
    }

    public void g(@x1 String str, boolean z, @z1 Exception exc) {
        a.c("Mark url: %s as success: %s with exception %s", str, Boolean.valueOf(z), exc);
        String authority = Uri.parse(str).getAuthority();
        if (authority != null) {
            if (z) {
                this.b.c(authority);
            } else {
                this.b.b(authority, exc);
            }
        }
    }
}