package com.anythink.basead.d.b;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.a.a.a;
import com.anythink.basead.c.e;
import com.anythink.basead.c.f;
import com.anythink.basead.c.i;
import com.anythink.basead.g.d;
import com.anythink.core.api.AdError;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.w;
import com.anythink.core.common.g.h;
import com.anythink.core.common.j.n;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a {
    private static a c;
    public ConcurrentHashMap<String, Boolean> a = new ConcurrentHashMap<>(3);
    private Context b;

    /* renamed from: com.anythink.basead.d.b.a$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements h {
        public final /* synthetic */ j a;
        public final /* synthetic */ InterfaceC0025a b;

        public AnonymousClass1(j jVar, InterfaceC0025a interfaceC0025a) {
            this.a = jVar;
            this.b = interfaceC0025a;
        }

        @Override // com.anythink.core.common.g.h
        public final void onLoadCanceled(int i) {
            InterfaceC0025a interfaceC0025a = this.b;
            if (interfaceC0025a != null) {
                interfaceC0025a.a(null, f.a(f.i, "Cancel Request."));
            }
        }

        @Override // com.anythink.core.common.g.h
        public final void onLoadError(int i, String str, AdError adError) {
            InterfaceC0025a interfaceC0025a = this.b;
            if (interfaceC0025a != null) {
                interfaceC0025a.a(null, f.a(f.i, str));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00e9  */
        @Override // com.anythink.core.common.g.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onLoadFinish(int i, Object obj) {
            JSONObject jSONObject;
            w wVar;
            try {
                jSONObject = new JSONObject(obj.toString());
            } catch (Exception unused) {
                jSONObject = null;
            }
            try {
                jSONObject.put(b.a, System.currentTimeMillis());
                wVar = b.a(this.a, jSONObject);
            } catch (Exception unused2) {
                wVar = null;
                if (wVar == null) {
                }
            }
            if (wVar == null) {
                if (wVar.b() == 1 && com.anythink.basead.a.b.a(a.this.b.getApplicationContext(), wVar.w())) {
                    com.anythink.basead.d.c.b a = com.anythink.basead.d.c.b.a();
                    Context context = a.this.b;
                    j jVar = this.a;
                    a.a(context, com.anythink.basead.d.c.b.a(jVar.b, jVar.c), wVar, this.a.m);
                    InterfaceC0025a interfaceC0025a = this.b;
                    if (interfaceC0025a != null) {
                        interfaceC0025a.a(null, f.a(f.i, "Application installed."));
                        return;
                    }
                    return;
                } else if (wVar.b() == 2 && !com.anythink.basead.a.b.a(a.this.b.getApplicationContext(), wVar.w())) {
                    com.anythink.basead.d.c.b a2 = com.anythink.basead.d.c.b.a();
                    Context context2 = a.this.b;
                    j jVar2 = this.a;
                    a2.a(context2, com.anythink.basead.d.c.b.a(jVar2.b, jVar2.c), wVar, this.a.m);
                    InterfaceC0025a interfaceC0025a2 = this.b;
                    if (interfaceC0025a2 != null) {
                        interfaceC0025a2.a(null, f.a(f.i, "Application not installed yet."));
                        return;
                    }
                    return;
                } else {
                    com.anythink.basead.d.c.a.a(this.a, wVar);
                    com.anythink.basead.a.b.a(10, wVar, new i(this.a.d, ""));
                    com.anythink.core.basead.b.a();
                    Context context3 = a.this.b;
                    com.anythink.core.basead.b.a();
                    n.a(context3, g.w, com.anythink.core.basead.b.a(this.a), jSONObject.toString());
                    InterfaceC0025a interfaceC0025a3 = this.b;
                    if (interfaceC0025a3 != null) {
                        interfaceC0025a3.a();
                    }
                    a.this.a(wVar, this.a, this.b);
                    return;
                }
            }
            InterfaceC0025a interfaceC0025a4 = this.b;
            if (interfaceC0025a4 != null) {
                interfaceC0025a4.a(null, f.a(f.i, obj != null ? obj.toString() : "No Ad Return."));
            }
        }

        @Override // com.anythink.core.common.g.h
        public final void onLoadStart(int i) {
        }
    }

    /* renamed from: com.anythink.basead.d.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0025a {
        void a();

        void a(w wVar);

        void a(w wVar, e eVar);
    }

    private a(Context context) {
        this.b = context.getApplicationContext();
    }

    private void b(j jVar, InterfaceC0025a interfaceC0025a) {
        w wVar;
        int i;
        int i2;
        String[] split;
        try {
            wVar = a(jVar);
        } catch (Throwable unused) {
            wVar = null;
        }
        if (wVar != null && !wVar.c()) {
            if (interfaceC0025a != null) {
                interfaceC0025a.a();
            }
            a(wVar, jVar, interfaceC0025a);
            return;
        }
        if (TextUtils.isEmpty(jVar.m.p())) {
            i2 = 0;
            i = 0;
        } else {
            try {
                split = jVar.m.p().split("x");
                i = Integer.parseInt(split[0]);
            } catch (Throwable unused2) {
                i = 0;
            }
            try {
                i2 = Integer.parseInt(split[1]);
            } catch (Throwable unused3) {
                i2 = 0;
                new d(jVar, i, i2, com.anythink.basead.d.c.b.a().a(this.b, com.anythink.basead.d.c.b.a(jVar.b, jVar.c))).a(0, (h) new AnonymousClass1(jVar, interfaceC0025a));
            }
        }
        new d(jVar, i, i2, com.anythink.basead.d.c.b.a().a(this.b, com.anythink.basead.d.c.b.a(jVar.b, jVar.c))).a(0, (h) new AnonymousClass1(jVar, interfaceC0025a));
    }

    public static synchronized a a(Context context) {
        a aVar;
        synchronized (a.class) {
            if (c == null) {
                c = new a(context);
            }
            aVar = c;
        }
        return aVar;
    }

    public final void a(j jVar, InterfaceC0025a interfaceC0025a) {
        int i;
        int i2;
        com.anythink.core.basead.b.a();
        String a = com.anythink.core.basead.b.a(jVar);
        w wVar = null;
        if (this.a.contains(a) && this.a.get(a).booleanValue()) {
            interfaceC0025a.a(null, f.a(f.g, f.o));
            return;
        }
        this.a.put(a, Boolean.TRUE);
        try {
            wVar = a(jVar);
        } catch (Throwable unused) {
        }
        if (wVar != null && !wVar.c()) {
            interfaceC0025a.a();
            a(wVar, jVar, interfaceC0025a);
            return;
        }
        if (TextUtils.isEmpty(jVar.m.p())) {
            i2 = 0;
            i = 0;
        } else {
            try {
                String[] split = jVar.m.p().split("x");
                i = Integer.parseInt(split[0]);
                try {
                    i2 = Integer.parseInt(split[1]);
                } catch (Throwable unused2) {
                    i2 = 0;
                    new d(jVar, i, i2, com.anythink.basead.d.c.b.a().a(this.b, com.anythink.basead.d.c.b.a(jVar.b, jVar.c))).a(0, (h) new AnonymousClass1(jVar, interfaceC0025a));
                }
            } catch (Throwable unused3) {
                i = 0;
            }
        }
        new d(jVar, i, i2, com.anythink.basead.d.c.b.a().a(this.b, com.anythink.basead.d.c.b.a(jVar.b, jVar.c))).a(0, (h) new AnonymousClass1(jVar, interfaceC0025a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final w wVar, final j jVar, final InterfaceC0025a interfaceC0025a) {
        com.anythink.basead.a.f.a();
        com.anythink.basead.a.f.a(jVar.b, wVar, jVar.m, new a.InterfaceC0017a() { // from class: com.anythink.basead.d.b.a.2
            @Override // com.anythink.basead.a.a.a.InterfaceC0017a
            public final void a() {
                ConcurrentHashMap<String, Boolean> concurrentHashMap = a.this.a;
                com.anythink.core.basead.b.a();
                concurrentHashMap.put(com.anythink.core.basead.b.a(jVar), Boolean.FALSE);
                InterfaceC0025a interfaceC0025a2 = interfaceC0025a;
                if (interfaceC0025a2 != null) {
                    interfaceC0025a2.a(wVar);
                }
            }

            @Override // com.anythink.basead.a.a.a.InterfaceC0017a
            public final void a(e eVar) {
                ConcurrentHashMap<String, Boolean> concurrentHashMap = a.this.a;
                com.anythink.core.basead.b.a();
                concurrentHashMap.put(com.anythink.core.basead.b.a(jVar), Boolean.FALSE);
                InterfaceC0025a interfaceC0025a2 = interfaceC0025a;
                if (interfaceC0025a2 != null) {
                    interfaceC0025a2.a(wVar, eVar);
                }
            }
        });
    }

    public final w a(j jVar) {
        com.anythink.core.basead.b.a();
        String a = com.anythink.core.basead.b.a(jVar);
        com.anythink.core.basead.b.a();
        String b = n.b(this.b, g.w, a, "");
        w wVar = null;
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        try {
            wVar = b.a(jVar, new JSONObject(b));
        } catch (Throwable unused) {
        }
        if (wVar != null) {
            com.anythink.basead.d.c.a.a(jVar, wVar);
        }
        return wVar;
    }
}