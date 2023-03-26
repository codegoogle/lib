package com.ironsource.a;

import android.net.Uri;
import com.ironsource.d.b;
import com.p7700g.p99005.wo1;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class b {
    private c a;
    public com.ironsource.a.a b;
    private d c;
    private ExecutorService d;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        private /* synthetic */ String s;

        public a(String str) {
            this.s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                com.ironsource.d.c cVar = new com.ironsource.d.c();
                ArrayList arrayList = new ArrayList(b.this.b.f);
                if ("POST".equals(b.this.b.c)) {
                    cVar = com.ironsource.d.b.a(b.this.b.a, this.s, arrayList);
                } else if ("GET".equals(b.this.b.c)) {
                    String str = b.this.b.a;
                    String str2 = this.s;
                    Uri build = Uri.parse(str).buildUpon().encodedQuery(str2).build();
                    b.a.C0110a c0110a = new b.a.C0110a();
                    c0110a.b = build.toString();
                    c0110a.d = str2;
                    c0110a.c = "GET";
                    c0110a.a(arrayList);
                    cVar = com.ironsource.d.b.a(c0110a.a());
                }
                b bVar = b.this;
                bVar.a("response status code: " + cVar.a);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public b(com.ironsource.a.a aVar, c cVar) {
        if (aVar == null) {
            throw new InvalidParameterException("Null configuration not supported ");
        }
        d dVar = aVar.d;
        if (dVar == null) {
            throw new InvalidParameterException("Null formatter not supported ");
        }
        this.b = aVar;
        this.a = cVar;
        this.c = dVar;
        this.d = Executors.newSingleThreadExecutor();
    }

    private static void b(Map<String, Object> map, Map<String, Object> map2) {
        try {
            map.putAll(map2);
        } catch (Exception unused) {
        }
    }

    public void a(String str) {
        boolean z = this.b.e;
    }

    public final void a(String str, Map<String, Object> map) {
        a(String.format(Locale.ENGLISH, "%s %s", str, map.toString()));
        if (this.b.b && !str.isEmpty()) {
            HashMap R = wo1.R("eventname", str);
            b(R, this.a.a());
            b(R, map);
            this.d.submit(new a(this.c.a(R)));
        }
    }
}