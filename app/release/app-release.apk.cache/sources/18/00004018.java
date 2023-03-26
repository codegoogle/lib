package com.p7700g.p99005;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.gson.Gson;
import com.p7700g.p99005.bi3;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: UCRTracker.java */
/* loaded from: classes2.dex */
public class e91 {
    @x1
    private static final b a = y81.a;
    @x1
    private static Map<String, e91> b = new HashMap();
    @x1
    public static final String c = "[DEFAULT]";
    @x1
    private final p91 d;
    @x1
    private final String e;
    @x1
    private final Executor f;
    @x1
    private final Gson g;

    /* compiled from: UCRTracker.java */
    /* loaded from: classes2.dex */
    public class a extends bi3.b {
        public final /* synthetic */ b u;

        public a(b bVar) {
            this.u = bVar;
        }

        @Override // com.p7700g.p99005.bi3
        public void G(@x1 Bundle bundle) throws RemoteException {
            this.u.a(bundle);
        }
    }

    /* compiled from: UCRTracker.java */
    /* loaded from: classes2.dex */
    public interface b {
        void a(@x1 Bundle bundle);
    }

    public e91(@x1 Context context, @x1 final String str, @x1 final g91 g91Var) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f = newSingleThreadExecutor;
        Context applicationContext = context.getApplicationContext();
        this.e = str;
        this.g = new Gson();
        p91 p91Var = new p91(applicationContext);
        this.d = p91Var;
        p91Var.a().s(new aq0() { // from class: com.p7700g.p99005.x81
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                e91.this.c(str, g91Var, dq0Var);
                return null;
            }
        }, newSingleThreadExecutor);
    }

    public static synchronized e91 a(@x1 Context context, @x1 String str, @x1 g91 g91Var) {
        e91 e91Var;
        synchronized (e91.class) {
            e91Var = b.get(str);
            if (e91Var == null) {
                e91Var = new e91(context, str, g91Var);
                b.put(str, e91Var);
            }
        }
        return e91Var;
    }

    private /* synthetic */ Object b(String str, g91 g91Var, dq0 dq0Var) throws Exception {
        ci3 ci3Var = (ci3) dq0Var.F();
        if (ci3Var != null) {
            ci3Var.D0(str, this.g.z(g91Var));
            return null;
        }
        return null;
    }

    public static /* synthetic */ void d(Bundle bundle) {
    }

    private /* synthetic */ Object e(String str, Bundle bundle, String str2, b bVar, dq0 dq0Var) throws Exception {
        ci3 ci3Var = (ci3) dq0Var.F();
        if (ci3Var != null) {
            ci3Var.U0(str, bundle, this.e, str2, 0, new a(bVar));
            return null;
        }
        return null;
    }

    public /* synthetic */ Object c(String str, g91 g91Var, dq0 dq0Var) {
        b(str, g91Var, dq0Var);
        return null;
    }

    public /* synthetic */ Object f(String str, Bundle bundle, String str2, b bVar, dq0 dq0Var) {
        e(str, bundle, str2, bVar, dq0Var);
        return null;
    }

    public void g(@x1 Bundle bundle) {
    }

    public void h(@x1 String str, @x1 Bundle bundle, @x1 b bVar) {
        i(str, bundle, "default", bVar);
    }

    public void i(@x1 final String str, @x1 final Bundle bundle, @x1 final String str2, @x1 final b bVar) {
        this.d.a().s(new aq0() { // from class: com.p7700g.p99005.w81
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                e91.this.f(str, bundle, str2, bVar, dq0Var);
                return null;
            }
        }, this.f);
    }

    public void j(@x1 String str, @x1 b bVar) {
        h(str, new Bundle(), bVar);
    }

    public void k(@x1 String str, @x1 Map<String, String> map, @x1 b bVar) {
        l(str, map, "default", bVar);
    }

    public void l(@x1 String str, @x1 Map<String, String> map, @x1 String str2, @x1 b bVar) {
        Bundle bundle = new Bundle();
        for (String str3 : map.keySet()) {
            bundle.putString(str3, map.get(str3));
        }
        i(str, bundle, str2, bVar);
    }
}