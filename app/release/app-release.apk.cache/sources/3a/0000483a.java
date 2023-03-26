package com.p7700g.p99005;

import android.content.Context;
import com.p7700g.p99005.hr5;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.net.ssl.SSLHandshakeException;

/* compiled from: CertificateNetworkProbe.java */
/* loaded from: classes2.dex */
public class id1 implements ld1 {
    @x1
    private final Context c;
    @x1
    private final td1 d;
    @x1
    private final kj1 a = kj1.b("CertificateNetworkProbe");
    @x1
    private final Random b = new Random();
    @x1
    private final List<String> e = Arrays.asList("https://google.com/", "https://apple.com", "https://microsoft.com", "https://yahoo.com", "https://baidu.com", "https://amazon.com", "https://instagram.com", "https://linkedin.com", "https://ebay.com", "https://bing.com", "https://goo.gl", "https://outlook.live.com", "https://wikipedia.org", "https://office.com");
    private boolean f = false;

    /* compiled from: CertificateNetworkProbe.java */
    /* loaded from: classes2.dex */
    public class a implements iq5 {
        public final /* synthetic */ String a;
        public final /* synthetic */ eq0 b;

        public a(String str, eq0 eq0Var) {
            this.a = str;
            this.b = eq0Var;
        }

        @Override // com.p7700g.p99005.iq5
        public void a(@x1 hq5 hq5Var, @x1 jr5 jr5Var) {
            id1.this.a.c("Complete diagnostic for certificate with url %s", this.a);
            id1.this.a.c(jr5Var.toString(), new Object[0]);
            this.b.d(new nd1(nd1.b, nd1.e, this.a, true));
            try {
                jr5Var.close();
            } catch (Throwable th) {
                id1.this.a.f(th);
            }
        }

        @Override // com.p7700g.p99005.iq5
        public void b(@x1 hq5 hq5Var, @x1 IOException iOException) {
            id1.this.a.c("Complete diagnostic for certificate with url %s", this.a);
            if (!id1.this.f) {
                id1.this.a.f(iOException);
            }
            if (this.b.a().I()) {
                id1.this.a.c("Task is completed. Exit", new Object[0]);
            } else if (iOException instanceof SocketTimeoutException) {
                this.b.d(new nd1(nd1.b, "timeout", this.a, false));
            } else if (iOException instanceof SSLHandshakeException) {
                this.b.d(new nd1(nd1.b, "invalid", this.a, false));
            } else {
                eq0 eq0Var = this.b;
                eq0Var.d(new nd1(nd1.b, iOException.getClass().getSimpleName() + " " + iOException.getMessage(), this.a, false));
            }
        }
    }

    public id1(@x1 Context context, @x1 td1 td1Var) {
        this.c = context;
        this.d = td1Var;
    }

    @x1
    private String d() {
        List<String> list = this.e;
        return list.get(this.b.nextInt(list.size()));
    }

    @Override // com.p7700g.p99005.ld1
    @x1
    public dq0<nd1> a() {
        String d = d();
        this.a.c("Start diagnostic for certificate with url %s", d);
        eq0 eq0Var = new eq0();
        try {
            od1.b(this.c, this.d).f().a(new hr5.a().B(d).b()).D1(new a(d, eq0Var));
        } catch (Throwable th) {
            this.a.f(th);
        }
        return eq0Var.a();
    }
}