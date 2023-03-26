package com.anchorfree.sdk;

import android.annotation.SuppressLint;
import androidx.annotation.Keep;
import com.anchorfree.sdk.RemoteConfigLoader;
import com.anchorfree.sdk.RemoteConfigRepository;
import com.google.gson.Gson;
import com.p7700g.p99005.dq0;
import com.p7700g.p99005.i41;
import com.p7700g.p99005.k41;
import com.p7700g.p99005.kj1;
import com.p7700g.p99005.mr0;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class RemoteConfigRepository {
    @x1
    private static final kj1 a = kj1.b("RemoteConfigProvider");
    public static final long b = TimeUnit.HOURS.toMillis(24);
    @x1
    private final Gson c;
    @x1
    private String d;
    @x1
    private final i41 e;
    @x1
    private final Executor f;

    public RemoteConfigRepository(@x1 Gson gson, @x1 i41 i41Var, @x1 String str) {
        this(gson, i41Var, str, Executors.newSingleThreadExecutor());
    }

    private /* synthetic */ Object d() throws Exception {
        this.e.a(this.d);
        return null;
    }

    @x1
    @Keep
    private JSONObject getStored() {
        mr0 g = g();
        if (g == null) {
            return new JSONObject();
        }
        try {
            JSONObject jSONObject = new JSONObject(g.f());
            JSONObject optJSONObject = jSONObject.optJSONObject("application");
            if (optJSONObject == null) {
                JSONObject jSONObject2 = new JSONObject();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!"application".equals(next) && !"files".equals(next)) {
                        jSONObject2.put(next, jSONObject.get(next));
                    }
                }
                return jSONObject2;
            }
            Iterator<String> keys2 = jSONObject.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                if (!"application".equals(next2) && !"files".equals(next2)) {
                    optJSONObject.put(next2, jSONObject.get(next2));
                }
            }
            return optJSONObject;
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    @x1
    @Keep
    private JSONObject getStoredRoot() {
        mr0 g = g();
        if (g == null) {
            return new JSONObject();
        }
        try {
            return new JSONObject(g.f());
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public void a() {
        a.c("Clear carrier: %s config data", this.d);
        dq0.e(new Callable() { // from class: com.p7700g.p99005.ry0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                RemoteConfigRepository.this.e();
                return null;
            }
        }, this.f);
    }

    public boolean b(@x1 String str, boolean z) {
        Object obj = get(str, null);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z;
    }

    @x1
    @SuppressLint({"KotlinPropertyAccess"})
    public JSONObject c() {
        try {
            return new JSONObject(this.e.c(this.d));
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public /* synthetic */ Object e() {
        d();
        return null;
    }

    public long f() {
        return this.e.d(this.d);
    }

    @z1
    public mr0 g() {
        try {
            return (mr0) this.c.n(this.e.e(this.d), mr0.class);
        } catch (Throwable th) {
            a.f(th);
            return null;
        }
    }

    @Keep
    @z1
    public Object get(@x1 String str, @z1 Object obj) {
        Object opt = getStored().opt(str);
        if (opt != null) {
            return opt;
        }
        Object opt2 = c().opt(str);
        return opt2 != null ? opt2 : obj;
    }

    @x1
    @Keep
    public RemoteConfigLoader.FilesObject getFiles() {
        return new k41(g()).a();
    }

    @Keep
    @z1
    public Object getRoot(@x1 String str, @z1 Object obj) {
        Object opt = getStoredRoot().opt(str);
        if (opt != null) {
            return opt;
        }
        Object opt2 = c().opt(str);
        return opt2 != null ? opt2 : obj;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void h(@x1 Map<String, Object> map) {
        try {
            this.e.f(this.d, this.c.z(map));
        } catch (Throwable unused) {
        }
    }

    public void i(@x1 mr0 mr0Var) {
        a.c("Store carrier: %s config data: ", this.d, mr0Var.toString());
        this.e.g(this.d, this.c.z(mr0Var));
    }

    public RemoteConfigRepository(@x1 Gson gson, @x1 i41 i41Var, @x1 String str, @x1 Executor executor) {
        this.c = gson;
        this.d = str;
        this.e = i41Var;
        this.f = executor;
    }
}