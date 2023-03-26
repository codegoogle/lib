package com.p7700g.p99005;

import android.content.Context;
import android.os.ParcelFileDescriptor;

/* compiled from: IOpenVpnServiceDelegate.java */
/* loaded from: classes3.dex */
public interface ty3 {
    public static final String a = "vpnservice-tun";

    void a(String str);

    @x1
    String b();

    void c(String str, String str2, int i, String str3);

    boolean d(ParcelFileDescriptor parcelFileDescriptor);

    void e();

    void f();

    void g(String str, String str2, String str3, String str4);

    Context getContext();

    void h(sy3 sy3Var, boolean z);

    void i(sy3 sy3Var);

    void j(String str);

    void k(int i);

    void l(String str);

    void m(String str, String str2);

    ParcelFileDescriptor n();

    void o(String str);

    boolean protect(int i);
}