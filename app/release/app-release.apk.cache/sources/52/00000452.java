package com.anythink.basead.d.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.a.a.a;
import com.anythink.basead.c.e;
import com.anythink.basead.c.f;
import com.anythink.basead.c.i;
import com.anythink.basead.d.a.b;
import com.anythink.core.api.AdError;
import com.anythink.core.common.a.c;
import com.anythink.core.common.a.g;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.j;
import com.anythink.core.common.g.h;
import com.anythink.core.common.j.n;
import com.anythink.expressad.foundation.d.d;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a {
    private static a d;
    public ConcurrentHashMap<String, Boolean> a = new ConcurrentHashMap<>(3);
    public ConcurrentHashMap<String, g> b = new ConcurrentHashMap<>(2);
    private Context c;

    /* renamed from: com.anythink.basead.d.a.a$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements h {
        public final /* synthetic */ j a;
        public final /* synthetic */ InterfaceC0022a b;

        public AnonymousClass1(j jVar, InterfaceC0022a interfaceC0022a) {
            this.a = jVar;
            this.b = interfaceC0022a;
        }

        @Override // com.anythink.core.common.g.h
        public final void onLoadCanceled(int i) {
            InterfaceC0022a interfaceC0022a = this.b;
            if (interfaceC0022a != null) {
                interfaceC0022a.a((com.anythink.core.common.e.g) null, f.a(f.i, "Cancel Request."));
            }
        }

        @Override // com.anythink.core.common.g.h
        public final void onLoadError(int i, String str, AdError adError) {
            InterfaceC0022a interfaceC0022a = this.b;
            if (interfaceC0022a != null) {
                interfaceC0022a.a((com.anythink.core.common.e.g) null, f.a(f.i, str));
            }
        }

        @Override // com.anythink.core.common.g.h
        public final void onLoadFinish(int i, Object obj) {
            com.anythink.core.common.e.g gVar;
            try {
                JSONObject jSONObject = new JSONObject(obj.toString());
                j jVar = this.a;
                gVar = c.a(jVar.a, jSONObject, jVar.f);
            } catch (Exception unused) {
                gVar = null;
            }
            if (gVar != null) {
                com.anythink.basead.d.c.a.a(this.a, gVar);
                if (this.a.f == 67) {
                    com.anythink.core.common.d.c.a(a.this.c).a(gVar.k(), gVar.e());
                    com.anythink.core.common.d.b.a(a.this.c).a(gVar.l(), gVar.e());
                }
                com.anythink.basead.a.b.a(10, gVar, new i(this.a.d, ""));
                com.anythink.core.common.a.a a = com.anythink.core.common.a.a.a();
                Context context = a.this.c;
                j jVar2 = this.a;
                a.a(context, jVar2.f, jVar2.c, jVar2.a, obj.toString());
                d a2 = a.this.a(gVar, this.a);
                InterfaceC0022a interfaceC0022a = this.b;
                if (interfaceC0022a != null) {
                    interfaceC0022a.a(gVar);
                }
                a.this.a(gVar, this.a, a2, this.b);
                return;
            }
            InterfaceC0022a interfaceC0022a2 = this.b;
            if (interfaceC0022a2 != null) {
                interfaceC0022a2.a((com.anythink.core.common.e.g) null, f.a(f.i, obj != null ? obj.toString() : "No Ad Return."));
            }
        }

        @Override // com.anythink.core.common.g.h
        public final void onLoadStart(int i) {
        }
    }

    /* renamed from: com.anythink.basead.d.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0022a {
        void a(com.anythink.core.common.e.g gVar);

        void a(com.anythink.core.common.e.g gVar, e eVar);

        void a(com.anythink.core.common.e.g gVar, g gVar2);
    }

    private a(Context context) {
        this.c = context.getApplicationContext();
    }

    private void b(j jVar, InterfaceC0022a interfaceC0022a) {
        com.anythink.core.common.e.g gVar;
        try {
            gVar = a(jVar);
        } catch (Throwable unused) {
            gVar = null;
        }
        if (gVar == null) {
            new com.anythink.basead.g.a(jVar).a(0, (h) new AnonymousClass1(jVar, interfaceC0022a));
            return;
        }
        com.anythink.core.common.a.a.a();
        Context context = this.c;
        String b = gVar.b();
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        sb.append(g.o.n);
        if (!(n.b(context, com.anythink.core.common.b.g.z, sb.toString(), 0) == 1)) {
            com.anythink.basead.a.b.a(10, gVar, new i(jVar.d, ""));
            com.anythink.core.common.a.a.a();
            Context context2 = this.c;
            String b2 = gVar.b();
            n.a(context2, com.anythink.core.common.b.g.z, b2 + g.o.n, 1);
        }
        d a = a(gVar, jVar);
        if (interfaceC0022a != null) {
            interfaceC0022a.a(gVar);
        }
        a(gVar, jVar, a, interfaceC0022a);
    }

    public static synchronized a a(Context context) {
        a aVar;
        synchronized (a.class) {
            if (d == null) {
                d = new a(context);
            }
            aVar = d;
        }
        return aVar;
    }

    public final void a(j jVar, InterfaceC0022a interfaceC0022a) {
        ConcurrentHashMap<String, Boolean> concurrentHashMap = this.a;
        boolean contains = concurrentHashMap.contains(jVar.b + jVar.a);
        com.anythink.core.common.e.g gVar = null;
        if (contains) {
            ConcurrentHashMap<String, Boolean> concurrentHashMap2 = this.a;
            if (concurrentHashMap2.get(jVar.b + jVar.a).booleanValue()) {
                interfaceC0022a.a((com.anythink.core.common.e.g) null, f.a(f.g, f.o));
                return;
            }
        }
        ConcurrentHashMap<String, Boolean> concurrentHashMap3 = this.a;
        concurrentHashMap3.put(jVar.b + jVar.a, Boolean.TRUE);
        try {
            gVar = a(jVar);
        } catch (Throwable unused) {
        }
        if (gVar == null) {
            new com.anythink.basead.g.a(jVar).a(0, (h) new AnonymousClass1(jVar, interfaceC0022a));
            return;
        }
        com.anythink.core.common.a.a.a();
        Context context = this.c;
        String b = gVar.b();
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        sb.append(g.o.n);
        if (!(n.b(context, com.anythink.core.common.b.g.z, sb.toString(), 0) == 1)) {
            com.anythink.basead.a.b.a(10, gVar, new i(jVar.d, ""));
            com.anythink.core.common.a.a.a();
            Context context2 = this.c;
            String b2 = gVar.b();
            n.a(context2, com.anythink.core.common.b.g.z, b2 + g.o.n, 1);
        }
        d a = a(gVar, jVar);
        interfaceC0022a.a(gVar);
        a(gVar, jVar, a, interfaceC0022a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized d a(com.anythink.core.common.e.g gVar, j jVar) {
        if (TextUtils.isEmpty(gVar.a())) {
            return null;
        }
        d a = d.a(gVar.a());
        com.anythink.expressad.foundation.d.c cVar = a.J.get(0);
        if (jVar.j == 1) {
            cVar.a(jVar.m.w());
        }
        b.a(gVar, cVar);
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final com.anythink.core.common.e.g gVar, final j jVar, d dVar, final InterfaceC0022a interfaceC0022a) {
        if (!TextUtils.isEmpty(gVar.a())) {
            b.a().a(gVar, jVar, dVar, new b.a() { // from class: com.anythink.basead.d.a.a.2
                @Override // com.anythink.basead.d.a.b.a
                public final void a(com.anythink.core.common.a.g gVar2) {
                    ConcurrentHashMap<String, Boolean> concurrentHashMap = a.this.a;
                    concurrentHashMap.put(jVar.b + jVar.a, Boolean.FALSE);
                    InterfaceC0022a interfaceC0022a2 = interfaceC0022a;
                    if (interfaceC0022a2 != null) {
                        interfaceC0022a2.a(gVar, gVar2);
                    }
                }

                @Override // com.anythink.basead.d.a.b.a
                public final void a(e eVar) {
                    ConcurrentHashMap<String, Boolean> concurrentHashMap = a.this.a;
                    concurrentHashMap.put(jVar.b + jVar.a, Boolean.FALSE);
                    InterfaceC0022a interfaceC0022a2 = interfaceC0022a;
                    if (interfaceC0022a2 != null) {
                        interfaceC0022a2.a(gVar, eVar);
                    }
                }
            });
            return;
        }
        com.anythink.basead.a.f.a();
        com.anythink.basead.a.f.a(jVar.b, gVar, jVar.m, new a.InterfaceC0017a() { // from class: com.anythink.basead.d.a.a.3
            @Override // com.anythink.basead.a.a.a.InterfaceC0017a
            public final void a() {
                ConcurrentHashMap<String, Boolean> concurrentHashMap = a.this.a;
                concurrentHashMap.put(jVar.b + jVar.a, Boolean.FALSE);
                InterfaceC0022a interfaceC0022a2 = interfaceC0022a;
                if (interfaceC0022a2 != null) {
                    interfaceC0022a2.a(gVar, (com.anythink.core.common.a.g) null);
                }
            }

            @Override // com.anythink.basead.a.a.a.InterfaceC0017a
            public final void a(e eVar) {
                ConcurrentHashMap<String, Boolean> concurrentHashMap = a.this.a;
                concurrentHashMap.put(jVar.b + jVar.a, Boolean.FALSE);
                InterfaceC0022a interfaceC0022a2 = interfaceC0022a;
                if (interfaceC0022a2 != null) {
                    interfaceC0022a2.a(gVar, eVar);
                }
            }
        });
    }

    public final com.anythink.core.common.e.g a(j jVar) {
        String a = com.anythink.core.common.a.a.a().a(this.c, jVar.a);
        com.anythink.core.common.e.g gVar = null;
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        try {
            gVar = c.a(jVar.a, new JSONObject(a), jVar.f);
        } catch (Throwable unused) {
        }
        if (gVar != null) {
            com.anythink.basead.d.c.a.a(jVar, gVar);
        }
        return gVar;
    }
}