package com.anchorfree.sdk;

import android.annotation.SuppressLint;
import androidx.annotation.Keep;
import com.anchorfree.sdk.RemoteConfigLoader;
import com.p7700g.p99005.aq0;
import com.p7700g.p99005.dq0;
import com.p7700g.p99005.h31;
import com.p7700g.p99005.kj1;
import com.p7700g.p99005.m41;
import com.p7700g.p99005.mr0;
import com.p7700g.p99005.mw2;
import com.p7700g.p99005.ny0;
import com.p7700g.p99005.o41;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.x31;
import com.p7700g.p99005.y11;
import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class RemoteConfigLoader {
    @x1
    private static final kj1 a = kj1.b("RemoteConfigProvider");
    private static final List<a> b = new ArrayList();
    @x1
    private final x31 c;
    @x1
    private final y11 d;
    @x1
    private final String e;
    @x1
    private final RemoteConfigRepository f;
    @x1
    private final h31 g;
    @x1
    private final Executor h;

    /* loaded from: classes.dex */
    public interface a {
        void onUpdate();
    }

    public RemoteConfigLoader(@x1 x31 x31Var, @x1 y11 y11Var, @x1 String str, @x1 RemoteConfigRepository remoteConfigRepository, @x1 h31 h31Var, @x1 Executor executor) {
        this.c = x31Var;
        this.d = y11Var;
        this.e = str;
        this.f = remoteConfigRepository;
        this.g = h31Var;
        this.h = executor;
    }

    public static void a(@x1 a aVar) {
        synchronized (RemoteConfigLoader.class) {
            b.add(aVar);
        }
    }

    @x1
    private mr0 b() {
        return new mr0("", 200);
    }

    @x1
    private dq0<Boolean> e() {
        return this.d.d();
    }

    private /* synthetic */ Void f() throws Exception {
        this.f.a();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ mr0 i(long j) throws Exception {
        mr0 c = c();
        long f = this.f.f();
        if (c == null || Math.abs(System.currentTimeMillis() - f) >= j) {
            return null;
        }
        a.c("loadConfig carrier: %s got from cache: %s", this.e, c.toString());
        return c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ dq0 k(dq0 dq0Var) throws Exception {
        if (dq0Var.F() != null && ((Boolean) dq0Var.F()).booleanValue()) {
            return s();
        }
        return dq0.D(b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ dq0 m(dq0 dq0Var) throws Exception {
        if (dq0Var.F() == null) {
            return e().w(new aq0() { // from class: com.p7700g.p99005.my0
                @Override // com.p7700g.p99005.aq0
                public final Object a(dq0 dq0Var2) {
                    return RemoteConfigLoader.this.k(dq0Var2);
                }
            }, this.h);
        }
        return dq0.D((mr0) dq0Var.F());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ mr0 p(dq0 dq0Var) throws Exception {
        mr0 mr0Var = (mr0) dq0Var.F();
        if (mr0Var != null && mr0Var.g() == 200) {
            a.c("loadConfig carrier: %s got config: %s", this.e, mr0Var.toString());
            this.f.i(mr0Var);
            this.g.e(new m41());
            return mr0Var;
        }
        a.d(dq0Var.E(), "loadConfig carrier: %s got config error %s", this.e);
        mr0 c = c();
        return c != null ? c : b();
    }

    @x1
    private dq0<mr0> q(final long j) {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.ly0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return RemoteConfigLoader.this.i(j);
            }
        }, this.h);
    }

    @x1
    private dq0<mr0> s() {
        return this.d.j().s(new aq0() { // from class: com.p7700g.p99005.py0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return RemoteConfigLoader.this.p(dq0Var);
            }
        }, this.h);
    }

    public static void t() {
        synchronized (RemoteConfigLoader.class) {
            for (a aVar : b) {
                aVar.onUpdate();
            }
        }
    }

    public static void u(@x1 a aVar) {
        synchronized (RemoteConfigLoader.class) {
            b.remove(aVar);
        }
    }

    @z1
    public mr0 c() {
        return this.f.g();
    }

    @x1
    @Keep
    public dq0<Void> clearCache() {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.oy0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                RemoteConfigLoader.this.g();
                return null;
            }
        }, this.h);
    }

    @x1
    @SuppressLint({"KotlinPropertyAccess"})
    public JSONObject d() {
        return this.f.c();
    }

    public /* synthetic */ Void g() {
        f();
        return null;
    }

    @Keep
    public long lastFetchTime() {
        return this.f.f();
    }

    @x1
    public dq0<mr0> r(long j) {
        return q(j).u(new aq0() { // from class: com.p7700g.p99005.qy0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return RemoteConfigLoader.this.m(dq0Var);
            }
        }).s(ny0.a, this.h);
    }

    @Keep
    @SuppressLint({"KotlinPropertyAccess"})
    public void setDefault(@x1 Map<String, Object> map) {
        this.f.h(map);
    }

    @Keep
    /* loaded from: classes.dex */
    public static class FilesObject {
        @x1
        @mw2(o41.b)
        public final String bpl;
        @x1
        @mw2(o41.c)
        public final String cnl;

        public FilesObject(@x1 String str, @x1 String str2) {
            this.bpl = str;
            this.cnl = str2;
        }

        @x1
        public String getBpl() {
            return this.bpl;
        }

        @x1
        public String getCnl() {
            return this.cnl;
        }

        @x1
        public String getValueForKey(@x1 String str) {
            if (o41.c.equals(str)) {
                return this.cnl;
            }
            return o41.b.equals(str) ? this.bpl : "";
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer("FilesObject{");
            stringBuffer.append("bpl='");
            stringBuffer.append(this.bpl);
            stringBuffer.append('\'');
            stringBuffer.append("cnl='");
            stringBuffer.append(this.cnl);
            stringBuffer.append('\'');
            stringBuffer.append('}');
            return stringBuffer.toString();
        }

        public FilesObject() {
            this.bpl = "";
            this.cnl = "";
        }
    }

    public RemoteConfigLoader(@x1 x31 x31Var, @x1 y11 y11Var, @x1 String str, @x1 RemoteConfigRepository remoteConfigRepository, @x1 h31 h31Var) {
        this(x31Var, y11Var, str, remoteConfigRepository, h31Var, Executors.newSingleThreadExecutor());
    }
}