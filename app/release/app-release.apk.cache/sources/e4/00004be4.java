package com.p7700g.p99005;

import android.content.Context;
import com.anchorfree.partner.api.ClientInfo;
import com.anchorfree.sdk.NotificationConfig;
import com.anchorfree.sdk.UnifiedSDKConfig;
import com.p7700g.p99005.ka1;
import com.p7700g.p99005.mg1;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: UnifiedSDK.java */
/* loaded from: classes.dex */
public final /* synthetic */ class k51 {

    /* compiled from: UnifiedSDK.java */
    /* loaded from: classes.dex */
    public class a implements ua1<en1> {
        public final /* synthetic */ db1 b;

        public a(db1 db1Var) {
            this.b = db1Var;
        }

        @Override // com.p7700g.p99005.ua1
        public void a(@x1 final gc1 gc1Var) {
            final db1 db1Var = this.b;
            dq0.e(new Callable() { // from class: com.p7700g.p99005.xz0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    db1.this.n(gc1Var);
                    return null;
                }
            }, q51.c);
        }

        @Override // com.p7700g.p99005.ua1
        /* renamed from: e */
        public void b(@x1 final en1 en1Var) {
            final db1 db1Var = this.b;
            dq0.e(new Callable() { // from class: com.p7700g.p99005.yz0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    db1.this.m(en1Var);
                    return null;
                }
            }, q51.c);
        }
    }

    public static void A(@x1 List<j51> list, @x1 va1 va1Var) {
        q51.F(list, va1Var);
    }

    public static void a(@x1 final ab1 ab1Var) {
        q51 g = q51.g();
        synchronized (g.g) {
            g.g.add(ab1Var);
        }
        g.j.g().s(new aq0() { // from class: com.p7700g.p99005.zz0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                k51.p(ab1.this, dq0Var);
                return null;
            }
        }, q51.c);
    }

    public static void b(@x1 cb1 cb1Var) {
        q51 g = q51.g();
        synchronized (g.f) {
            g.f.add(cb1Var);
        }
    }

    public static void c(@x1 db1 db1Var) {
        q51 g = q51.g();
        synchronized (g.e) {
            g.e.add(db1Var);
        }
        n(new a(db1Var));
    }

    public static void d(@x1 String str) {
        Map<String, l51> map = l51.c;
        synchronized (map) {
            l51 remove = map.remove(str);
            if (remove != null) {
                remove.clear();
            }
        }
        q51.g().B(str);
    }

    public static void e() {
        Map<String, l51> map = l51.c;
        synchronized (map) {
            for (String str : map.keySet()) {
                d(str);
            }
        }
    }

    public static void f(@x1 ua1<lm1> ua1Var) {
        q51.g().j.b().s(a21.a(ua1Var), q51.c);
    }

    @x1
    public static l51 g() {
        return j(l51.a);
    }

    @x1
    public static l51 h(@x1 ClientInfo clientInfo) {
        return k(l51.a, clientInfo, UnifiedSDKConfig.newBuilder().a());
    }

    @x1
    public static l51 i(@x1 ClientInfo clientInfo, @x1 UnifiedSDKConfig unifiedSDKConfig) {
        return k(l51.a, clientInfo, unifiedSDKConfig);
    }

    @x1
    public static l51 j(@x1 String str) {
        return (l51) r81.g(l51.c.get(str), "Cannot find initialized sdk instance with name " + str);
    }

    @x1
    public static l51 k(@x1 String str, @x1 ClientInfo clientInfo, @x1 UnifiedSDKConfig unifiedSDKConfig) {
        l51 l51Var;
        if (q51.g() != null) {
            Map<String, l51> map = l51.c;
            synchronized (map) {
                l51Var = map.get(str);
                if (l51Var == null) {
                    l51Var = new m51(clientInfo, unifiedSDKConfig);
                    q51.g().w(str, clientInfo, unifiedSDKConfig);
                    map.put(str, l51Var);
                }
            }
            return l51Var;
        }
        throw new cc1("Call UnifiedSDK.init before using SDK");
    }

    public static void l(@x1 ua1<d51> ua1Var) {
        q51.g().i(ua1Var);
    }

    public static void m(@x1 ua1<bn1> ua1Var) {
        q51.g().j.g().s(a21.a(ua1Var), q51.c);
    }

    public static void n(@x1 ua1<en1> ua1Var) {
        q51.g().j.f().s(a21.a(ua1Var), q51.c);
    }

    public static void o(@x1 Context context) {
        p51.a(context);
        x41.t = new q51(context);
    }

    public static /* synthetic */ Object p(ab1 ab1Var, dq0 dq0Var) throws Exception {
        bn1 bn1Var = (bn1) dq0Var.F();
        if (bn1Var != null) {
            ab1Var.a(bn1Var.d(), bn1Var.c());
            return null;
        }
        return null;
    }

    public static void q(@x1 ab1 ab1Var) {
        q51 g = q51.g();
        synchronized (g.g) {
            g.g.remove(ab1Var);
        }
    }

    public static void r(@x1 cb1 cb1Var) {
        q51 g = q51.g();
        synchronized (g.f) {
            g.f.remove(cb1Var);
        }
    }

    public static void s(@x1 db1 db1Var) {
        q51 g = q51.g();
        synchronized (g.e) {
            g.e.remove(db1Var);
        }
    }

    public static void t(boolean z) {
        q51.x(z);
    }

    public static void u(@x1 k81<? extends ka1.a> k81Var) {
        q51.y(k81Var);
    }

    public static void v(int i) {
        q51.z(i);
    }

    public static void w(boolean z) {
        q51.A(z);
    }

    public static void x(@x1 NotificationConfig notificationConfig) {
        q51.C(notificationConfig);
    }

    public static void y(@x1 UnifiedSDKConfig.CallbackMode callbackMode) {
        q51.D(callbackMode);
    }

    public static void z(@x1 k81<? extends mg1.a> k81Var) {
        q51.E(k81Var);
    }
}