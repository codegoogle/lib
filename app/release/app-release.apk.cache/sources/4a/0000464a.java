package com.p7700g.p99005;

import android.content.Context;
import com.p7700g.p99005.hr5;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/* compiled from: CaptivePortalProbe.java */
/* loaded from: classes2.dex */
public class hd1 implements ld1 {
    @x1
    private final Context c;
    @x1
    private final td1 d;
    @x1
    private final kj1 a = kj1.b("CaptivePortalProbe");
    @x1
    private final List<String> b = Arrays.asList("https://google.com/generate_204", "https://gstatic.com/generate_204", "https://maps.google.com/generate_204", "https://www.google.com/generate_204", "https://clients3.google.com/generate_204");
    @x1
    private final Random e = new Random();

    /* compiled from: CaptivePortalProbe.java */
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
            hd1.this.a.c("Captive response %s", jr5Var);
            if (jr5Var.s1() && jr5Var.E() == 204) {
                this.b.d(new nd1(nd1.c, nd1.e, this.a, true));
            } else {
                this.b.d(new nd1(nd1.c, "wall", this.a, false));
            }
            try {
                jr5Var.close();
            } catch (Throwable th) {
                hd1.this.a.f(th);
            }
        }

        @Override // com.p7700g.p99005.iq5
        public void b(@x1 hq5 hq5Var, @x1 IOException iOException) {
            hd1.this.a.c("Complete diagnostic for captive portal with url %s", this.a);
            hd1.this.a.f(iOException);
            if (iOException instanceof SocketTimeoutException) {
                this.b.d(new nd1(nd1.c, "timeout", this.a, false));
                return;
            }
            eq0 eq0Var = this.b;
            eq0Var.d(new nd1(nd1.c, iOException.getClass().getSimpleName() + " " + iOException.getMessage(), this.a, false));
        }
    }

    public hd1(@x1 Context context, @x1 td1 td1Var) {
        this.c = context;
        this.d = td1Var;
    }

    @x1
    private String c() {
        List<String> list = this.b;
        return list.get(this.e.nextInt(list.size()));
    }

    @Override // com.p7700g.p99005.ld1
    @x1
    public dq0<nd1> a() {
        String c = c();
        this.a.c("Start diagnostic for captive portal with url %s", c);
        eq0 eq0Var = new eq0();
        try {
            od1.c(this.c, this.d, false, true).f().a(new hr5.a().B(c).b()).D1(new a(c, eq0Var));
        } catch (Throwable th) {
            this.a.f(th);
        }
        return eq0Var.a();
    }
}