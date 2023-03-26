package com.p7700g.p99005;

import android.content.Context;
import android.net.LocalServerSocket;
import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import android.os.ParcelFileDescriptor;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.microsoft.appcenter.AppCenter;
import com.p7700g.p99005.vy3;
import com.p7700g.p99005.wy3;
import com.p7700g.p99005.zy3;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

/* compiled from: OpenVpnManagementThread.java */
/* loaded from: classes3.dex */
public class yy3 implements Runnable, vy3 {
    private static final String t = "\n";
    private static final String u = "\"";
    private static final String v = "\\";
    private static final String w = " ";
    private static final String x = ":";
    private final String A;
    private final String B;
    private LocalSocket C;
    private ty3 D;
    private LocalServerSocket F;
    private boolean G;
    private final wy3.a z;
    private static final kj1 s = kj1.b("OpenVpnManagementThread");
    @x1
    private static Vector<yy3> y = new Vector<>();
    @x1
    private LinkedList<FileDescriptor> E = new LinkedList<>();
    private boolean H = false;
    private long I = 0;
    private vy3.a J = vy3.a.noNetwork;

    public yy3(Context context, String str, String str2, ty3 ty3Var, wy3.a aVar) {
        this.G = true;
        this.A = str;
        this.B = str2;
        this.D = ty3Var;
        this.z = aVar;
        this.G = false;
        g(context);
    }

    private void f() {
        if (this.G) {
            v();
            return;
        }
        this.H = true;
        zy3.b(this.J);
    }

    private void g(Context context) {
        hu0.b(context, "opvpnutil");
    }

    @z1
    public static String j(@z1 String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace(v, "\\\\").replace(u, "\\\"").replace(t, "\\n");
        if (!replace.equals(str) || replace.contains(w) || replace.contains("#") || replace.contains(AppCenter.PAIR_DELIMITER)) {
            return h95.b + replace + h95.b;
        }
        return str;
    }

    private void k(String str, String str2) {
        zy3.c("AUTH_FAILED", wo1.t(str, str2), zy3.b.LEVEL_AUTH_FAILED);
    }

    private void l(String str) {
        int indexOf = str.indexOf(44);
        this.z.d(Long.parseLong(str.substring(0, indexOf)), Long.parseLong(str.substring(indexOf + 1)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0093, code lost:
        if (r4.equals("HOLD") == false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m(String str) {
        if (str.startsWith("SUCCESS:")) {
            return;
        }
        char c = 2;
        if (str.startsWith(HttpFunctions.ERROR_PREFIX)) {
            this.z.c(str.split(":", 2)[1]);
        }
        kj1 kj1Var = s;
        kj1Var.c("Process command: %s", str);
        this.z.f(str);
        if (str.startsWith(">") && str.contains(":")) {
            String[] split = str.split(":", 2);
            String substring = split[0].substring(1);
            String str2 = split[1];
            substring.hashCode();
            switch (substring.hashCode()) {
                case -1747950989:
                    if (substring.equals("NEED-OK")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 75556:
                    if (substring.equals("LOG")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 2223295:
                    break;
                case 2251950:
                    if (substring.equals("INFO")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 76403278:
                    if (substring.equals("PROXY")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 79219825:
                    if (substring.equals("STATE")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 739009767:
                    if (substring.equals("BYTECOUNT")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1999612571:
                    if (substring.equals("PASSWORD")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    p(str2);
                    return;
                case 1:
                    o(str2);
                    return;
                case 2:
                    f();
                    return;
                case 3:
                    return;
                case 4:
                    r();
                    return;
                case 5:
                    s(str2);
                    return;
                case 6:
                    l(str2);
                    return;
                case 7:
                    q(str2);
                    return;
                default:
                    kj1Var.i(wo1.t("MGMT: Got unrecognized command", str), new Object[0]);
                    return;
            }
        } else if (str.startsWith("PROTECTFD: ")) {
            FileDescriptor pollFirst = this.E.pollFirst();
            if (pollFirst != null) {
                t(pollFirst);
            }
        } else {
            kj1Var.i(wo1.t("MGMT: Got unrecognized line from management:", str), new Object[0]);
        }
    }

    @x1
    private String n(@x1 String str) {
        while (str.contains(t)) {
            String[] split = str.split("\\r?\\n", 2);
            m(split[0]);
            str = split.length == 1 ? "" : split[1];
        }
        return str;
    }

    private void o(String str) {
        s.c(str.split(",", 4)[3], new Object[0]);
    }

    private void p(String str) {
        String str2;
        int indexOf = str.indexOf(39) + 1;
        String substring = str.substring(indexOf, str.indexOf(39, indexOf));
        String str3 = str.split(":", 2)[1];
        substring.hashCode();
        char c = 65535;
        switch (substring.hashCode()) {
            case -2116912211:
                if (substring.equals("PROTECTFD")) {
                    c = 0;
                    break;
                }
                break;
            case -1929611617:
                if (substring.equals("IFCONFIG")) {
                    c = 1;
                    break;
                }
                break;
            case -1871803603:
                if (substring.equals("ROUTE6")) {
                    c = 2;
                    break;
                }
                break;
            case -1477105907:
                if (substring.equals("DNSDOMAIN")) {
                    c = 3;
                    break;
                }
                break;
            case -1056734836:
                if (substring.equals("DNSSERVER")) {
                    c = 4;
                    break;
                }
                break;
            case -545191069:
                if (substring.equals("OPENTUN")) {
                    c = 5;
                    break;
                }
                break;
            case 78166569:
                if (substring.equals("ROUTE")) {
                    c = 6;
                    break;
                }
                break;
            case 311582071:
                if (substring.equals("IFCONFIG6")) {
                    c = 7;
                    break;
                }
                break;
            case 801000499:
                if (substring.equals("PERSIST_TUN_ACTION")) {
                    c = '\b';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                t(this.E.pollFirst());
                str2 = nd1.e;
                break;
            case 1:
                String[] split = str3.split(w);
                this.D.c(split[0], split[1], Integer.parseInt(split[2]), split[3]);
                str2 = nd1.e;
                break;
            case 2:
                String[] split2 = str3.split(w);
                this.D.m(split2[0], split2[1]);
                str2 = nd1.e;
                break;
            case 3:
                this.D.j(str3);
                str2 = nd1.e;
                break;
            case 4:
                this.D.l(str3);
                str2 = nd1.e;
                break;
            case 5:
                if (!w(substring, str3)) {
                    str2 = com.anythink.expressad.d.a.b.dO;
                    break;
                } else {
                    return;
                }
            case 6:
                String[] split3 = str3.split(w);
                if (split3.length == 5) {
                    this.D.g(split3[0], split3[1], split3[2], split3[4]);
                } else if (split3.length >= 3) {
                    this.D.g(split3[0], split3[1], split3[2], null);
                } else {
                    s.e(wo1.D(wo1.G("Unrecognized ROUTE cmd:"), Arrays.toString(split3), " | ", str), new Object[0]);
                }
                str2 = nd1.e;
                break;
            case 7:
                this.D.a(str3);
                str2 = nd1.e;
                break;
            case '\b':
                str2 = this.D.b();
                break;
            default:
                return;
        }
        h(String.format("needok '%s' %s\n", substring, str2));
    }

    private void q(String str) {
        try {
            int indexOf = str.indexOf(39) + 1;
            int indexOf2 = str.indexOf(39, indexOf);
            String substring = str.substring(indexOf, indexOf2);
            if (str.startsWith("Verification Failed")) {
                k(substring, str.substring(indexOf2 + 1));
                return;
            }
            String str2 = null;
            if ("Auth".equals(substring)) {
                h(String.format("username '%s' %s\n", substring, j(this.A)));
                str2 = this.B;
            }
            if (str2 != null) {
                h(String.format("password '%s' %s\n", substring, j(str2)));
            } else {
                s.e("Openvpn requires Authentication type '%s' but no password/key information available", substring);
            }
        } catch (StringIndexOutOfBoundsException unused) {
            s.e(wo1.t("Could not parse management Password command: ", str), new Object[0]);
        }
    }

    private void r() {
        h("proxy NONE\n");
    }

    private void s(String str) {
        String[] split = str.split(",", 3);
        String str2 = split[1];
        if (split[2].equals(",,")) {
            this.z.g(str2, "");
        } else {
            this.z.g(str2, split[2]);
        }
    }

    private void t(@x1 FileDescriptor fileDescriptor) {
        try {
            if (this.D.d(ParcelFileDescriptor.dup(fileDescriptor))) {
                return;
            }
            s.i("Could not protect VPN socket", new Object[0]);
        } catch (Throwable th) {
            kj1 kj1Var = s;
            kj1Var.f(th);
            kj1Var.c("Failed to retrieve fd from socket (" + fileDescriptor + ")", new Object[0]);
        }
    }

    private void v() {
        if (System.currentTimeMillis() - this.I < 5000) {
            try {
                Thread.sleep(com.anythink.expressad.video.module.a.a.m.af);
            } catch (InterruptedException unused) {
            }
        }
        this.H = false;
        this.I = System.currentTimeMillis();
        h("hold release\n");
        h("bytecount 2\n");
        h("state on\n");
    }

    private boolean w(String str, String str2) {
        if (!"tun".equals(str2)) {
            this.z.e(String.format("Device type %s requested, but only tun is possible with the Android API, sorry!", str2));
            return false;
        }
        ParcelFileDescriptor n = this.D.n();
        if (n == null) {
            this.z.e("openTun return null");
            return false;
        }
        this.C.setFileDescriptorsForSend(new FileDescriptor[]{n.getFileDescriptor()});
        h(String.format("needok '%s' %s\n", str, nd1.e));
        this.C.setFileDescriptorsForSend(null);
        return true;
    }

    private static boolean y() {
        Iterator<yy3> it = y.iterator();
        boolean z = false;
        while (it.hasNext()) {
            yy3 next = it.next();
            next.h("signal SIGINT\n");
            try {
                LocalSocket localSocket = next.C;
                if (localSocket != null) {
                    localSocket.close();
                }
            } catch (IOException unused) {
            }
            z = true;
        }
        return z;
    }

    @Override // com.p7700g.p99005.vy3
    public void a(vy3.a aVar) {
        kj1 kj1Var = s;
        kj1Var.i("Pause reason " + aVar, new Object[0]);
        this.J = aVar;
        x();
    }

    @Override // com.p7700g.p99005.vy3
    public void b() {
        u();
        this.J = vy3.a.noNetwork;
    }

    @Override // com.p7700g.p99005.vy3
    public void c() {
        if (this.H) {
            return;
        }
        h("network-change\n");
    }

    @Override // com.p7700g.p99005.vy3
    public boolean d() {
        return y();
    }

    @Override // com.p7700g.p99005.vy3
    public void e() {
        x();
        u();
    }

    public void h(@x1 String str) {
        try {
            LocalSocket localSocket = this.C;
            if (localSocket == null || localSocket.getOutputStream() == null) {
                return;
            }
            this.C.getOutputStream().write(str.getBytes());
            this.C.getOutputStream().flush();
        } catch (IOException unused) {
        }
    }

    public boolean i(@x1 Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getCacheDir().getAbsolutePath());
        String C = wo1.C(sb, File.separator, "mgmtsocket");
        LocalSocket localSocket = new LocalSocket();
        for (int i = 8; i > 0 && !localSocket.isConnected(); i--) {
            try {
                localSocket.bind(new LocalSocketAddress(C, LocalSocketAddress.Namespace.FILESYSTEM));
            } catch (IOException unused) {
                try {
                    Thread.sleep(300L);
                } catch (InterruptedException unused2) {
                }
            }
        }
        try {
            this.F = new LocalServerSocket(localSocket.getFileDescriptor());
            return true;
        } catch (IOException e) {
            s.f(e);
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] bArr = new byte[2048];
        y.add(this);
        try {
            LocalSocket accept = this.F.accept();
            this.C = accept;
            InputStream inputStream = accept.getInputStream();
            this.F.close();
            String str = "";
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return;
                }
                FileDescriptor[] fileDescriptorArr = null;
                try {
                    fileDescriptorArr = this.C.getAncillaryFileDescriptors();
                } catch (IOException e) {
                    s.f(e);
                }
                if (fileDescriptorArr != null) {
                    Collections.addAll(this.E, fileDescriptorArr);
                }
                String str2 = new String(bArr, 0, read, "UTF-8");
                str = n(str + str2);
            }
        } catch (IOException e2) {
            if (!e2.getMessage().equals("socket closed")) {
                s.f(e2);
            }
            y.remove(this);
        }
    }

    public void u() {
        this.G = true;
        if (this.H) {
            v();
        }
    }

    public void x() {
        this.G = false;
        if (this.H) {
            zy3.b(this.J);
        } else {
            h("signal SIGUSR1\n");
        }
    }
}