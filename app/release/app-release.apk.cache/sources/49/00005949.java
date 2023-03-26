package com.p7700g.p99005;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.microsoft.appcenter.ingestion.models.AbstractLog;
import java.io.IOException;

/* compiled from: AutoBatchedLogRequestEncoder.java */
/* loaded from: classes2.dex */
public final class r32 implements aq2 {
    public static final int a = 2;
    public static final aq2 b = new r32();

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes2.dex */
    public static final class a implements up2<q32> {
        public static final a a = new a();
        private static final tp2 b = tp2.d("sdkVersion");
        private static final tp2 c = tp2.d("model");
        private static final tp2 d = tp2.d("hardware");
        private static final tp2 e = tp2.d(AbstractLog.DEVICE);
        private static final tp2 f = tp2.d("product");
        private static final tp2 g = tp2.d("osBuild");
        private static final tp2 h = tp2.d("manufacturer");
        private static final tp2 i = tp2.d("fingerprint");
        private static final tp2 j = tp2.d("locale");
        private static final tp2 k = tp2.d(ImpressionData.IMPRESSION_DATA_KEY_COUNTRY);
        private static final tp2 l = tp2.d("mccMnc");
        private static final tp2 m = tp2.d("applicationBuild");

        private a() {
        }

        @Override // com.p7700g.p99005.rp2
        /* renamed from: a */
        public void encode(q32 q32Var, vp2 vp2Var) throws IOException {
            vp2Var.add(b, q32Var.m());
            vp2Var.add(c, q32Var.j());
            vp2Var.add(d, q32Var.f());
            vp2Var.add(e, q32Var.d());
            vp2Var.add(f, q32Var.l());
            vp2Var.add(g, q32Var.k());
            vp2Var.add(h, q32Var.h());
            vp2Var.add(i, q32Var.e());
            vp2Var.add(j, q32Var.g());
            vp2Var.add(k, q32Var.c());
            vp2Var.add(l, q32Var.i());
            vp2Var.add(m, q32Var.b());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes2.dex */
    public static final class b implements up2<z32> {
        public static final b a = new b();
        private static final tp2 b = tp2.d("logRequest");

        private b() {
        }

        @Override // com.p7700g.p99005.rp2
        /* renamed from: a */
        public void encode(z32 z32Var, vp2 vp2Var) throws IOException {
            vp2Var.add(b, z32Var.c());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes2.dex */
    public static final class c implements up2<a42> {
        public static final c a = new c();
        private static final tp2 b = tp2.d("clientType");
        private static final tp2 c = tp2.d("androidClientInfo");

        private c() {
        }

        @Override // com.p7700g.p99005.rp2
        /* renamed from: a */
        public void encode(a42 a42Var, vp2 vp2Var) throws IOException {
            vp2Var.add(b, a42Var.c());
            vp2Var.add(c, a42Var.b());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes2.dex */
    public static final class d implements up2<b42> {
        public static final d a = new d();
        private static final tp2 b = tp2.d("eventTimeMs");
        private static final tp2 c = tp2.d("eventCode");
        private static final tp2 d = tp2.d("eventUptimeMs");
        private static final tp2 e = tp2.d("sourceExtension");
        private static final tp2 f = tp2.d("sourceExtensionJsonProto3");
        private static final tp2 g = tp2.d("timezoneOffsetSeconds");
        private static final tp2 h = tp2.d("networkConnectionInfo");

        private d() {
        }

        @Override // com.p7700g.p99005.rp2
        /* renamed from: a */
        public void encode(b42 b42Var, vp2 vp2Var) throws IOException {
            vp2Var.add(b, b42Var.c());
            vp2Var.add(c, b42Var.b());
            vp2Var.add(d, b42Var.d());
            vp2Var.add(e, b42Var.f());
            vp2Var.add(f, b42Var.g());
            vp2Var.add(g, b42Var.h());
            vp2Var.add(h, b42Var.e());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes2.dex */
    public static final class e implements up2<c42> {
        public static final e a = new e();
        private static final tp2 b = tp2.d("requestTimeMs");
        private static final tp2 c = tp2.d("requestUptimeMs");
        private static final tp2 d = tp2.d("clientInfo");
        private static final tp2 e = tp2.d("logSource");
        private static final tp2 f = tp2.d("logSourceName");
        private static final tp2 g = tp2.d("logEvent");
        private static final tp2 h = tp2.d("qosTier");

        private e() {
        }

        @Override // com.p7700g.p99005.rp2
        /* renamed from: a */
        public void encode(c42 c42Var, vp2 vp2Var) throws IOException {
            vp2Var.add(b, c42Var.g());
            vp2Var.add(c, c42Var.h());
            vp2Var.add(d, c42Var.b());
            vp2Var.add(e, c42Var.d());
            vp2Var.add(f, c42Var.e());
            vp2Var.add(g, c42Var.c());
            vp2Var.add(h, c42Var.f());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes2.dex */
    public static final class f implements up2<e42> {
        public static final f a = new f();
        private static final tp2 b = tp2.d("networkType");
        private static final tp2 c = tp2.d("mobileSubtype");

        private f() {
        }

        @Override // com.p7700g.p99005.rp2
        /* renamed from: a */
        public void encode(e42 e42Var, vp2 vp2Var) throws IOException {
            vp2Var.add(b, e42Var.c());
            vp2Var.add(c, e42Var.b());
        }
    }

    private r32() {
    }

    @Override // com.p7700g.p99005.aq2
    public void configure(bq2<?> bq2Var) {
        b bVar = b.a;
        bq2Var.registerEncoder(z32.class, bVar);
        bq2Var.registerEncoder(t32.class, bVar);
        e eVar = e.a;
        bq2Var.registerEncoder(c42.class, eVar);
        bq2Var.registerEncoder(w32.class, eVar);
        c cVar = c.a;
        bq2Var.registerEncoder(a42.class, cVar);
        bq2Var.registerEncoder(u32.class, cVar);
        a aVar = a.a;
        bq2Var.registerEncoder(q32.class, aVar);
        bq2Var.registerEncoder(s32.class, aVar);
        d dVar = d.a;
        bq2Var.registerEncoder(b42.class, dVar);
        bq2Var.registerEncoder(v32.class, dVar);
        f fVar = f.a;
        bq2Var.registerEncoder(e42.class, fVar);
        bq2Var.registerEncoder(y32.class, fVar);
    }
}