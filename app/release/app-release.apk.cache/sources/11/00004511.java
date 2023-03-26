package com.p7700g.p99005;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: JsonDataEncoderBuilder.java */
/* loaded from: classes3.dex */
public final class gq2 implements bq2<gq2> {
    private static final up2<Object> a = cq2.a;
    private static final wp2<String> b = dq2.a;
    private static final wp2<Boolean> c = eq2.a;
    private static final b d = new b(null);
    private final Map<Class<?>, up2<?>> e = new HashMap();
    private final Map<Class<?>, wp2<?>> f = new HashMap();
    private up2<Object> g = a;
    private boolean h = false;

    /* compiled from: JsonDataEncoderBuilder.java */
    /* loaded from: classes3.dex */
    public class a implements qp2 {
        public a() {
        }

        @Override // com.p7700g.p99005.qp2
        public void a(@x1 Object obj, @x1 Writer writer) throws IOException {
            hq2 hq2Var = new hq2(writer, gq2.this.e, gq2.this.f, gq2.this.g, gq2.this.h);
            hq2Var.e(obj, false);
            hq2Var.o();
        }

        @Override // com.p7700g.p99005.qp2
        public String b(@x1 Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* compiled from: JsonDataEncoderBuilder.java */
    /* loaded from: classes3.dex */
    public static final class b implements wp2<Date> {
        private static final DateFormat a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(md2.a));
        }

        private b() {
        }

        @Override // com.p7700g.p99005.rp2
        /* renamed from: a */
        public void encode(@x1 Date date, @x1 xp2 xp2Var) throws IOException {
            xp2Var.add(a.format(date));
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public gq2() {
        registerEncoder(String.class, b);
        registerEncoder(Boolean.class, c);
        registerEncoder(Date.class, d);
    }

    public static /* synthetic */ void h(Object obj, vp2 vp2Var) throws IOException {
        StringBuilder G = wo1.G("Couldn't find encoder for type ");
        G.append(obj.getClass().getCanonicalName());
        throw new sp2(G.toString());
    }

    @x1
    public qp2 e() {
        return new a();
    }

    @x1
    public gq2 f(@x1 aq2 aq2Var) {
        aq2Var.configure(this);
        return this;
    }

    @x1
    public gq2 g(boolean z) {
        this.h = z;
        return this;
    }

    @Override // com.p7700g.p99005.bq2
    @x1
    /* renamed from: k */
    public <T> gq2 registerEncoder(@x1 Class<T> cls, @x1 up2<? super T> up2Var) {
        this.e.put(cls, up2Var);
        this.f.remove(cls);
        return this;
    }

    @Override // com.p7700g.p99005.bq2
    @x1
    /* renamed from: l */
    public <T> gq2 registerEncoder(@x1 Class<T> cls, @x1 wp2<? super T> wp2Var) {
        this.f.put(cls, wp2Var);
        this.e.remove(cls);
        return this;
    }

    @x1
    public gq2 m(@x1 up2<Object> up2Var) {
        this.g = up2Var;
        return this;
    }
}