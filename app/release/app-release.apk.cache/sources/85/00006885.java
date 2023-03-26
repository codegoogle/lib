package com.p7700g.p99005;

import com.p7700g.p99005.hr5;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* compiled from: SdkConnectionProbe.java */
/* loaded from: classes.dex */
public class z41 {
    private static final kj1 a = kj1.b("ConnectionTest");
    @x1
    private final bt0 b;
    private final List<String> c;

    /* compiled from: SdkConnectionProbe.java */
    /* loaded from: classes.dex */
    public class a implements iq5 {
        public final /* synthetic */ eq0 a;

        public a(eq0 eq0Var) {
            this.a = eq0Var;
        }

        @Override // com.p7700g.p99005.iq5
        public void a(@x1 hq5 hq5Var, @x1 jr5 jr5Var) throws IOException {
            String str;
            z41.a.c("Request success", new Object[0]);
            if (jr5Var.s1()) {
                str = null;
            } else {
                StringBuilder G = wo1.G("code:");
                G.append(jr5Var.E());
                str = G.toString();
            }
            this.a.g(new y21(str));
        }

        @Override // com.p7700g.p99005.iq5
        public void b(@x1 hq5 hq5Var, @x1 IOException iOException) {
            String simpleName;
            z41.a.e("Request failed", iOException);
            if (iOException instanceof UnknownHostException) {
                simpleName = "UnknownHostException";
            } else {
                simpleName = iOException instanceof SocketTimeoutException ? "SocketTimeoutException" : iOException.getClass().getSimpleName();
            }
            this.a.g(new y21(simpleName));
        }
    }

    public z41(@x1 bt0 bt0Var) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.b = bt0Var;
        arrayList.add("https://file-examples-com.github.io/uploads/2017/02/file_example_JSON_1kb.json");
    }

    @x1
    private String c() {
        return this.c.get(new Random().nextInt(this.c.size()));
    }

    @x1
    public dq0<y21> b(@x1 wp0 wp0Var) {
        eq0 eq0Var = new eq0();
        wp0Var.b(new u11(eq0Var));
        this.b.i().a(new hr5.a().B(c()).b()).D1(new a(eq0Var));
        return eq0Var.a();
    }
}