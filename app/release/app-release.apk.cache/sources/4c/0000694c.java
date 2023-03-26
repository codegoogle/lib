package com.p7700g.p99005;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.p7700g.p99005.uy3;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

/* compiled from: OpenVpnServiceDelegate.java */
/* loaded from: classes3.dex */
public class zh3 implements ty3 {
    @x1
    private static final kj1 b = kj1.b("OpenVpnServiceDelegate");
    private static final String c = "255.255.255.255";
    @x1
    private final Context d;
    @x1
    private final td1 e;
    @x1
    private final ln1 f;
    @x1
    private final mn1 g;
    @x1
    private final Vector<String> h = new Vector<>();
    private final uy3 i = new uy3();
    private final uy3 j = new uy3();
    @z1
    private sy3 k;
    @z1
    private String l;
    @z1
    private String m;
    private int n;
    @z1
    private String o;

    public zh3(@x1 Context context, @x1 td1 td1Var, @x1 ln1 ln1Var, @x1 mn1 mn1Var) {
        this.d = context;
        this.e = td1Var;
        this.f = ln1Var;
        this.g = mn1Var;
    }

    @z1
    private String p() {
        String str = "TUNCFG UNQIUE STRING ips:";
        if (this.k != null) {
            StringBuilder G = wo1.G("TUNCFG UNQIUE STRING ips:");
            G.append(this.k.toString());
            str = G.toString();
        }
        if (this.o != null) {
            StringBuilder G2 = wo1.G(str);
            G2.append(this.o);
            str = G2.toString();
        }
        StringBuilder L = wo1.L(str, "routes: ");
        L.append(TextUtils.join(com.anythink.expressad.foundation.g.a.bQ, this.i.e(true)));
        L.append(TextUtils.join(com.anythink.expressad.foundation.g.a.bQ, this.j.e(true)));
        StringBuilder L2 = wo1.L(L.toString(), "excl. routes:");
        L2.append(TextUtils.join(com.anythink.expressad.foundation.g.a.bQ, this.i.e(false)));
        L2.append(TextUtils.join(com.anythink.expressad.foundation.g.a.bQ, this.j.e(false)));
        StringBuilder L3 = wo1.L(L2.toString(), "dns: ");
        L3.append(TextUtils.join(com.anythink.expressad.foundation.g.a.bQ, this.h));
        StringBuilder L4 = wo1.L(L3.toString(), "domain: ");
        L4.append(this.m);
        StringBuilder L5 = wo1.L(L4.toString(), "mtu: ");
        L5.append(this.n);
        return L5.toString();
    }

    public static boolean q(@z1 String str) {
        return str != null && (str.startsWith("tun") || "(null)".equals(str) || ty3.a.equals(str));
    }

    @Override // com.p7700g.p99005.ty3
    public void a(String str) {
        this.o = str;
    }

    @Override // com.p7700g.p99005.ty3
    @x1
    public String b() {
        return "NOACTION";
    }

    @Override // com.p7700g.p99005.ty3
    public void c(@x1 String str, @x1 String str2, int i, String str3) {
        sy3 sy3Var = new sy3(str, str2);
        this.k = sy3Var;
        this.n = i;
        this.l = null;
        if (sy3Var.b != 32 || c.equals(str2)) {
            return;
        }
        long c2 = sy3.c(str2);
        int i2 = "net30".equals(str3) ? 30 : 31;
        sy3 sy3Var2 = this.k;
        long j = ~(1 << (32 - (sy3Var2.b + 1)));
        if ((c2 & j) == (sy3Var2.b() & j)) {
            this.k.b = i2;
            return;
        }
        if (!"p2p".equals(str3)) {
            b.i("Route no CIDR %s %s %s", str, str2, str3);
        }
        this.l = str2;
    }

    @Override // com.p7700g.p99005.ty3
    public boolean d(ParcelFileDescriptor parcelFileDescriptor) {
        return this.e.k(parcelFileDescriptor);
    }

    @Override // com.p7700g.p99005.ty3
    public void e() {
        b.c("openvpnStopped", new Object[0]);
    }

    @Override // com.p7700g.p99005.ty3
    public void f() {
        b.c("processDied", new Object[0]);
    }

    @Override // com.p7700g.p99005.ty3
    public void g(@x1 String str, @x1 String str2, @x1 String str3, String str4) {
        boolean q = q(str4);
        uy3.a aVar = new uy3.a(new sy3(str3, 32), false);
        sy3 sy3Var = this.k;
        if (sy3Var == null) {
            b.e("Local IP address unset but adding route?! This is broken! Please contact author with log", new Object[0]);
            return;
        }
        if (new uy3.a(sy3Var, true).c(aVar)) {
            q = true;
        }
        q = (c.equals(str3) || str3.equals(this.l)) ? true : true;
        sy3 sy3Var2 = new sy3(str, str2);
        if (sy3Var2.b == 32 && !c.equals(str2)) {
            b.i("Route no CIDR %s %s", str, str2);
        }
        if (sy3Var2.d()) {
            b.i("Route not netip, %s %d %s", str, Integer.valueOf(sy3Var2.b), sy3Var2.a);
        }
        this.i.a(sy3Var2, q);
    }

    @Override // com.p7700g.p99005.ty3
    public Context getContext() {
        return this.d;
    }

    @Override // com.p7700g.p99005.ty3
    public void h(sy3 sy3Var, boolean z) {
        this.i.a(sy3Var, z);
    }

    @Override // com.p7700g.p99005.ty3
    public void i(sy3 sy3Var) {
        this.k = sy3Var;
    }

    @Override // com.p7700g.p99005.ty3
    public void j(String str) {
        if (this.m == null) {
            this.m = str;
        }
    }

    @Override // com.p7700g.p99005.ty3
    public void k(int i) {
        this.n = i;
    }

    @Override // com.p7700g.p99005.ty3
    public void l(String str) {
        this.h.add(str);
    }

    @Override // com.p7700g.p99005.ty3
    public void m(@x1 String str, String str2) {
        String[] split = str.split("/");
        boolean q = q(str2);
        try {
            int parseInt = Integer.parseInt(split[1]);
            this.j.b((Inet6Address) InetAddress.getAllByName(split[0])[0], parseInt, q);
        } catch (UnknownHostException e) {
            b.f(e);
        }
    }

    @Override // com.p7700g.p99005.ty3
    @z1
    public ParcelFileDescriptor n() {
        try {
            kj1 kj1Var = b;
            kj1Var.e("openTun", new Object[0]);
            sy3 sy3Var = this.k;
            if (sy3Var == null && this.o == null) {
                kj1Var.e("Refusing to open tun device without IP information", new Object[0]);
                return null;
            }
            if (sy3Var != null) {
                try {
                    this.g.a(sy3Var.a, sy3Var.b);
                } catch (IllegalArgumentException e) {
                    b.e("Add address failed %s, %s", this.k, e.getLocalizedMessage());
                    return null;
                }
            }
            String str = this.o;
            if (str != null) {
                String[] split = str.split("/");
                try {
                    this.g.a(split[0], Integer.parseInt(split[1]));
                } catch (IllegalArgumentException e2) {
                    b.e("Add ipv6 address failed %s, %s", this.o, e2.getLocalizedMessage());
                    return null;
                }
            }
            Iterator<String> it = this.h.iterator();
            while (it.hasNext()) {
                String next = it.next();
                try {
                    this.g.c(next);
                } catch (IllegalArgumentException e3) {
                    b.e("Add dns failed %s, %s", next, e3.getLocalizedMessage());
                }
            }
            this.g.j(this.n);
            Collection<uy3.a> f = this.i.f();
            Collection<uy3.a> f2 = this.j.f();
            for (uy3.a aVar : f) {
                try {
                    this.g.e(aVar.e(), aVar.s);
                } catch (IllegalArgumentException e4) {
                    kj1 kj1Var2 = b;
                    kj1Var2.e("Route rejected by Android " + aVar + " " + e4.getLocalizedMessage(), new Object[0]);
                }
            }
            for (uy3.a aVar2 : f2) {
                try {
                    this.g.e(aVar2.f(), aVar2.s);
                } catch (IllegalArgumentException e5) {
                    kj1 kj1Var3 = b;
                    kj1Var3.e("Route rejected by Android " + aVar2 + " " + e5.getLocalizedMessage(), new Object[0]);
                }
            }
            String str2 = this.m;
            if (str2 != null) {
                this.g.g(str2);
            }
            this.g.l(null);
            if (this.h.size() == 0) {
                b.e("Warn no DNS", new Object[0]);
            }
            this.h.clear();
            this.i.c();
            this.j.c();
            this.k = null;
            this.o = null;
            this.m = null;
            return this.f.g(this.g);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.p7700g.p99005.ty3
    public void o(String str) {
        b.c("triggerSso %s", str);
    }

    @Override // com.p7700g.p99005.ty3
    public boolean protect(int i) {
        try {
            return this.e.l(i);
        } catch (Throwable th) {
            b.f(th);
            return false;
        }
    }
}