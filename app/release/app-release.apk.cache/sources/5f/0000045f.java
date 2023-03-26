package com.anythink.basead.d;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.a.c;
import com.anythink.basead.d.a.a;
import com.anythink.basead.d.b.a;
import com.anythink.core.common.b.m;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.k;
import com.anythink.core.common.e.w;
import com.anythink.core.common.e.x;
import com.anythink.core.common.e.y;
import com.anythink.core.common.j.n;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class b {
    public Context a;
    public j b;
    public c c;
    public x d;
    public com.anythink.core.common.a.g e;
    public com.anythink.basead.a.c f;
    public com.anythink.basead.e.a g;
    public ConcurrentHashMap<String, com.anythink.basead.a.c> h;
    private int i;

    /* renamed from: com.anythink.basead.d.b$4  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.a().length];
            a = iArr;
            try {
                iArr[a.a - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[a.b - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final int a = 1;
        public static final int b = 2;
        private static final /* synthetic */ int[] c = {1, 2};

        private a(String str, int i) {
        }

        public static int[] a() {
            return (int[]) c.clone();
        }
    }

    public b(Context context, int i, j jVar) {
        this.a = context.getApplicationContext();
        this.i = i;
        this.b = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        r4.onAdLoadFailed(com.anythink.basead.c.f.a(com.anythink.basead.c.f.i, com.anythink.basead.c.f.t));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void b(com.anythink.basead.e.c cVar) {
        try {
            j jVar = this.b;
            if (jVar != null && !TextUtils.isEmpty(jVar.b) && !TextUtils.isEmpty(this.b.a)) {
                com.anythink.basead.d.a.a.a(this.a).a(this.b, new AnonymousClass1(cVar));
            }
        } catch (Throwable th) {
            th.printStackTrace();
            if (cVar != null) {
                cVar.onAdLoadFailed(com.anythink.basead.c.f.a("-9999", th.getMessage()));
            }
        }
    }

    public final void a(c cVar) {
        y yVar;
        this.c = cVar;
        k kVar = this.b.m;
        if (!(kVar instanceof y) || (yVar = (y) kVar) == null || cVar == null) {
            return;
        }
        yVar.s(cVar.a());
        yVar.t(cVar.b());
        yVar.a(cVar.d());
        yVar.n(cVar.c());
        yVar.m(cVar.e());
        yVar.b(cVar.f());
        yVar.l(cVar.g());
        yVar.a(cVar.h());
        yVar.b(cVar.i());
        if (cVar instanceof d) {
            yVar.b(((d) cVar).j());
        }
    }

    public final boolean c() {
        int i = AnonymousClass4.a[this.i - 1];
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            if (this.d == null) {
                this.d = com.anythink.basead.d.b.a.a(this.a).a(this.b);
            }
            x xVar = this.d;
            return xVar != null && (xVar instanceof w) && !((w) xVar).c() && com.anythink.basead.a.a.b.a(this.d, this.b.m);
        }
        if (this.d == null) {
            this.d = com.anythink.basead.d.a.a.a(this.a).a(this.b);
        }
        com.anythink.core.common.a.g gVar = this.e;
        if (gVar != null) {
            return gVar.isReady();
        }
        x xVar2 = this.d;
        return xVar2 != null && com.anythink.basead.a.a.b.a(xVar2, this.b.m);
    }

    public final com.anythink.core.common.e.i d() {
        return this.d;
    }

    /* renamed from: com.anythink.basead.d.b$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements a.InterfaceC0025a {
        public final /* synthetic */ com.anythink.basead.e.c a;

        public AnonymousClass2(com.anythink.basead.e.c cVar) {
            this.a = cVar;
        }

        @Override // com.anythink.basead.d.b.a.InterfaceC0025a
        public final void a() {
            com.anythink.basead.e.c cVar = this.a;
            if (cVar != null) {
                cVar.onAdDataLoaded();
            }
        }

        @Override // com.anythink.basead.d.b.a.InterfaceC0025a
        public final void a(w wVar) {
            b bVar = b.this;
            bVar.d = wVar;
            com.anythink.basead.a.b.a(33, b.this.d, new com.anythink.basead.c.i(bVar.b.d, ""));
            com.anythink.basead.e.c cVar = this.a;
            if (cVar != null) {
                cVar.onAdCacheLoaded();
            }
        }

        @Override // com.anythink.basead.d.b.a.InterfaceC0025a
        public final void a(w wVar, com.anythink.basead.c.e eVar) {
            b.a(b.this, wVar, eVar, this.a);
        }
    }

    /* renamed from: com.anythink.basead.d.b$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements a.InterfaceC0022a {
        public final /* synthetic */ com.anythink.basead.e.c a;

        public AnonymousClass1(com.anythink.basead.e.c cVar) {
            this.a = cVar;
        }

        @Override // com.anythink.basead.d.a.a.InterfaceC0022a
        public final void a(com.anythink.core.common.e.g gVar) {
            b.this.a(gVar);
            com.anythink.basead.e.c cVar = this.a;
            if (cVar != null) {
                cVar.onAdDataLoaded();
            }
        }

        @Override // com.anythink.basead.d.a.a.InterfaceC0022a
        public final void a(com.anythink.core.common.e.g gVar, com.anythink.core.common.a.g gVar2) {
            b bVar = b.this;
            bVar.d = gVar;
            bVar.e = gVar2;
            bVar.f = new com.anythink.basead.a.c(bVar.a, bVar.b, gVar);
            b.this.f.a(new c.a() { // from class: com.anythink.basead.d.b.1.1
                @Override // com.anythink.basead.a.c.a
                public final void a() {
                    com.anythink.basead.e.a aVar = b.this.g;
                    if (aVar != null) {
                        aVar.onAdClick(1);
                    }
                }

                @Override // com.anythink.basead.a.c.a
                public final void b() {
                }

                @Override // com.anythink.basead.a.c.a
                public final void a(boolean z) {
                    com.anythink.basead.e.a aVar = b.this.g;
                    if (aVar != null) {
                        aVar.onDeeplinkCallback(z);
                    }
                }
            });
            com.anythink.basead.a.b.a(33, gVar, new com.anythink.basead.c.i(b.this.b.d, ""));
            com.anythink.basead.e.c cVar = this.a;
            if (cVar != null) {
                cVar.onAdCacheLoaded();
            }
        }

        @Override // com.anythink.basead.d.a.a.InterfaceC0022a
        public final void a(com.anythink.core.common.e.g gVar, com.anythink.basead.c.e eVar) {
            b.a(b.this, gVar, eVar, this.a);
        }
    }

    public void b() {
        this.d = null;
    }

    private void c(com.anythink.basead.e.c cVar) {
        try {
            com.anythink.basead.d.b.a.a(this.a).a(this.b, new AnonymousClass2(cVar));
        } catch (Throwable th) {
            th.printStackTrace();
            if (cVar != null) {
                cVar.onAdLoadFailed(com.anythink.basead.c.f.a("-9999", th.getMessage()));
            }
        }
    }

    public final void a(com.anythink.basead.e.a aVar) {
        this.g = aVar;
    }

    public final void a(com.anythink.basead.e.c cVar) {
        int i = AnonymousClass4.a[this.i - 1];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            try {
                com.anythink.basead.d.b.a.a(this.a).a(this.b, new AnonymousClass2(cVar));
                return;
            } catch (Throwable th) {
                th.printStackTrace();
                cVar.onAdLoadFailed(com.anythink.basead.c.f.a("-9999", th.getMessage()));
                return;
            }
        }
        try {
            j jVar = this.b;
            if (jVar != null && !TextUtils.isEmpty(jVar.b) && !TextUtils.isEmpty(this.b.a)) {
                com.anythink.basead.d.a.a.a(this.a).a(this.b, new AnonymousClass1(cVar));
                return;
            }
            cVar.onAdLoadFailed(com.anythink.basead.c.f.a(com.anythink.basead.c.f.i, com.anythink.basead.c.f.t));
        } catch (Throwable th2) {
            th2.printStackTrace();
            cVar.onAdLoadFailed(com.anythink.basead.c.f.a("-9999", th2.getMessage()));
        }
    }

    public final String a(x xVar) {
        return this.b.b + this.b.c + this.b.f + xVar.k() + System.currentTimeMillis();
    }

    private void a(com.anythink.core.common.e.i iVar, com.anythink.basead.c.e eVar, com.anythink.basead.e.c cVar) {
        if (iVar != null) {
            com.anythink.basead.a.b.a(34, iVar, new com.anythink.basead.c.i(this.b.d, ""));
        }
        if (iVar instanceof w) {
            com.anythink.core.basead.b.a();
            Context e = m.a().e();
            com.anythink.core.basead.b.a();
            n.a(e, com.anythink.core.common.b.g.w, com.anythink.core.basead.b.a(this.b));
        }
        if (iVar instanceof com.anythink.core.common.e.g) {
            try {
                com.anythink.core.b.f.a().a(this.b.c);
                com.anythink.core.b.f.a().b(this.b.c);
                com.anythink.core.common.a.a.a().b(m.a().e(), this.b.a);
            } catch (Throwable unused) {
            }
        }
        if (cVar != null) {
            cVar.onAdLoadFailed(eVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0086 A[Catch: all -> 0x00e4, TryCatch #0 {all -> 0x00e4, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x000c, B:10:0x0013, B:12:0x0021, B:14:0x003d, B:38:0x00be, B:15:0x0046, B:34:0x0080, B:36:0x0086, B:37:0x00a9, B:30:0x0072, B:32:0x0079, B:31:0x0076, B:33:0x007d, B:39:0x00c7), top: B:49:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(com.anythink.expressad.foundation.d.c cVar, String str) {
        com.anythink.expressad.foundation.d.a aG;
        try {
            if (this.f == null) {
                return;
            }
            if (this.h == null) {
                this.h = new ConcurrentHashMap<>(2);
            }
            com.anythink.basead.a.c cVar2 = this.h.get(cVar.aZ());
            if (cVar2 == null) {
                cVar2 = this.f;
                k g = cVar2.a().g();
                if (cVar2.a().k().equals(cVar.aZ())) {
                    com.anythink.basead.d.a.b.a(cVar2.a(), cVar);
                } else {
                    com.anythink.core.common.e.g gVar = new com.anythink.core.common.e.g();
                    com.anythink.basead.d.a.b.a(gVar, cVar);
                    gVar.f(cVar.aZ());
                    int P = cVar.P();
                    if (P != 0) {
                        if (P == 1 || P == 2) {
                            gVar.d(1);
                        } else if (P != 3) {
                            if (P != 4) {
                                if (P != 5) {
                                    if (P != 8) {
                                        if (P != 9) {
                                            aG = cVar.aG();
                                            if (aG != null) {
                                                gVar.H(aG.b());
                                                gVar.u(aG.f());
                                                gVar.v(aG.e());
                                                gVar.w(aG.c());
                                                gVar.x(aG.a());
                                            }
                                            com.anythink.basead.a.c cVar3 = new com.anythink.basead.a.c(m.a().e(), cVar2.b(), gVar);
                                            gVar.a(g);
                                            cVar2 = cVar3;
                                        }
                                    }
                                }
                            }
                            gVar.d(3);
                            aG = cVar.aG();
                            if (aG != null) {
                            }
                            com.anythink.basead.a.c cVar32 = new com.anythink.basead.a.c(m.a().e(), cVar2.b(), gVar);
                            gVar.a(g);
                            cVar2 = cVar32;
                        }
                        gVar.d(4);
                        aG = cVar.aG();
                        if (aG != null) {
                        }
                        com.anythink.basead.a.c cVar322 = new com.anythink.basead.a.c(m.a().e(), cVar2.b(), gVar);
                        gVar.a(g);
                        cVar2 = cVar322;
                    }
                    gVar.d(2);
                    aG = cVar.aG();
                    if (aG != null) {
                    }
                    com.anythink.basead.a.c cVar3222 = new com.anythink.basead.a.c(m.a().e(), cVar2.b(), gVar);
                    gVar.a(g);
                    cVar2 = cVar3222;
                }
                this.h.put(cVar.aZ(), cVar2);
            }
            com.anythink.basead.c.i iVar = new com.anythink.basead.c.i(this.b.d, str);
            iVar.g = new com.anythink.basead.c.a();
            cVar2.a(new c.a() { // from class: com.anythink.basead.d.b.3
                @Override // com.anythink.basead.a.c.a
                public final void a() {
                    com.anythink.basead.e.a aVar = b.this.g;
                    if (aVar != null) {
                        aVar.onAdClick(1);
                    }
                }

                @Override // com.anythink.basead.a.c.a
                public final void b() {
                }

                @Override // com.anythink.basead.a.c.a
                public final void a(boolean z) {
                    com.anythink.basead.e.a aVar = b.this.g;
                    if (aVar != null) {
                        aVar.onDeeplinkCallback(z);
                    }
                }
            });
            cVar2.a(iVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void a(com.anythink.core.common.e.g gVar) {
        if (gVar.c() == 1) {
            com.anythink.core.common.a.b.a().b();
            if (com.anythink.core.common.j.h.a(this.a, gVar.w())) {
                com.anythink.core.common.j.e.a("DspInfoLog", "check offer installed(onAdDataLoaded):ture,dsp offerid:" + gVar.N() + ",packagename:" + gVar.w());
                com.anythink.core.common.a.b.a().c(gVar);
                return;
            }
            com.anythink.core.common.j.e.a("DspInfoLog", "check offer installed(onAdDataLoaded):false,need record show,dsp offerid:" + gVar.N() + ",packagename:" + gVar.w());
            com.anythink.core.common.a.b.a().a(gVar);
        }
    }

    public static /* synthetic */ void a(b bVar, com.anythink.core.common.e.i iVar, com.anythink.basead.c.e eVar, com.anythink.basead.e.c cVar) {
        if (iVar != null) {
            com.anythink.basead.a.b.a(34, iVar, new com.anythink.basead.c.i(bVar.b.d, ""));
        }
        if (iVar instanceof w) {
            com.anythink.core.basead.b.a();
            Context e = m.a().e();
            com.anythink.core.basead.b.a();
            n.a(e, com.anythink.core.common.b.g.w, com.anythink.core.basead.b.a(bVar.b));
        }
        if (iVar instanceof com.anythink.core.common.e.g) {
            try {
                com.anythink.core.b.f.a().a(bVar.b.c);
                com.anythink.core.b.f.a().b(bVar.b.c);
                com.anythink.core.common.a.a.a().b(m.a().e(), bVar.b.a);
            } catch (Throwable unused) {
            }
        }
        if (cVar != null) {
            cVar.onAdLoadFailed(eVar);
        }
    }
}