package com.p7700g.p99005;

import android.app.PendingIntent;
import android.net.Network;
import android.net.VpnService;
import android.os.Build;
import java.net.InetAddress;

/* compiled from: VpnTunParams.java */
/* loaded from: classes2.dex */
public class mn1 {
    @x1
    private final VpnService.Builder a;

    public mn1(@x1 VpnService.Builder builder) {
        this.a = builder;
    }

    @x1
    public mn1 a(@x1 String str, int i) {
        this.a.addAddress(str, i);
        return this;
    }

    @x1
    public mn1 b(@x1 InetAddress inetAddress, int i) {
        this.a.addAddress(inetAddress, i);
        return this;
    }

    @x1
    public mn1 c(@x1 String str) {
        this.a.addDnsServer(str);
        return this;
    }

    @x1
    public mn1 d(@x1 InetAddress inetAddress) {
        this.a.addDnsServer(inetAddress);
        return this;
    }

    @x1
    public mn1 e(@x1 String str, int i) {
        this.a.addRoute(str, i);
        return this;
    }

    @x1
    public mn1 f(@x1 InetAddress inetAddress, int i) {
        this.a.addRoute(inetAddress, i);
        return this;
    }

    @x1
    public mn1 g(@x1 String str) {
        this.a.addSearchDomain(str);
        return this;
    }

    @x1
    public VpnService.Builder h() {
        return this.a;
    }

    @x1
    public mn1 i(@z1 PendingIntent pendingIntent) {
        this.a.setConfigureIntent(pendingIntent);
        return this;
    }

    @x1
    public mn1 j(int i) {
        this.a.setMtu(i);
        return this;
    }

    @x1
    public mn1 k(@x1 String str) {
        this.a.setSession(str);
        return this;
    }

    @x1
    public mn1 l(@z1 Network[] networkArr) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.a.setUnderlyingNetworks(networkArr);
        }
        return this;
    }
}