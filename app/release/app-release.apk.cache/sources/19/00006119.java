package com.p7700g.p99005;

import com.anchorfree.sdk.fireshield.FireshieldConfig;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: IpInfoFetcher.java */
/* loaded from: classes.dex */
public class v31 {
    @x1
    private final bt0 a;
    @z1
    public b b = null;

    /* compiled from: IpInfoFetcher.java */
    /* loaded from: classes.dex */
    public class a implements hr0<mr0> {
        public final /* synthetic */ eq0 b;

        public a(eq0 eq0Var) {
            this.b = eq0Var;
        }

        @Override // com.p7700g.p99005.hr0
        public void a(@x1 au0 au0Var) {
            this.b.f(au0Var);
        }

        @Override // com.p7700g.p99005.hr0
        /* renamed from: c */
        public void b(@x1 dr0 dr0Var, @x1 mr0 mr0Var) {
            try {
                String string = new JSONObject(mr0Var.f()).getString(FireshieldConfig.Services.IP);
                j14 R2 = new r14(string).R2();
                if (R2.J4()) {
                    this.b.d(new b(string, 4));
                } else if (R2.L4()) {
                    this.b.d(new b(string, 6));
                } else {
                    this.b.d(new b(string, 0));
                }
            } catch (Throwable th) {
                this.b.f(new IllegalArgumentException(th));
            }
        }
    }

    /* compiled from: IpInfoFetcher.java */
    /* loaded from: classes.dex */
    public static class b {
        @x1
        private final String a;
        private final int b;

        public b(@x1 String str, int i) {
            this.a = str;
            this.b = i;
        }

        public int a() {
            return this.b;
        }

        @x1
        public String b() {
            return this.a;
        }
    }

    public v31(@x1 bt0 bt0Var) {
        this.a = bt0Var;
    }

    private /* synthetic */ b b(dq0 dq0Var) throws Exception {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ b e(dq0 dq0Var) throws Exception {
        if (dq0Var.F() != null) {
            this.b = (b) dq0Var.F();
        }
        return (b) dq0Var.F();
    }

    public dq0<b> a() {
        return f().q(new aq0() { // from class: com.p7700g.p99005.iy0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return v31.this.b;
            }
        });
    }

    public /* synthetic */ b c(dq0 dq0Var) {
        return this.b;
    }

    public dq0<b> f() {
        eq0 eq0Var = new eq0();
        this.a.c("https://api64.ipify.org/?format=json", new HashMap(), new a(eq0Var));
        return eq0Var.a().q(new aq0() { // from class: com.p7700g.p99005.jy0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return v31.this.e(dq0Var);
            }
        });
    }
}