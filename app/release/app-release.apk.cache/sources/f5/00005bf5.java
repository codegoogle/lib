package com.p7700g.p99005;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: OpenVpnConfigProvider.java */
/* loaded from: classes3.dex */
public abstract class sh3 {
    @x1
    private final Gson a;

    public sh3(@x1 Gson gson) {
        this.a = gson;
    }

    public void a(@x1 List<String> list, @x1 String str) {
        list.add(String.format(Locale.ENGLISH, "remote %s", str));
    }

    public void b(@x1 List<String> list, @x1 String str) {
        list.add("<ca>");
        list.add(str);
        list.add("</ca>");
    }

    public abstract void c(@x1 List<String> list, @x1 Bundle bundle);

    public void d(@x1 List<String> list) {
        list.add(m31.a);
        list.add("verb 4");
        list.add("connect-retry-max 1");
        list.add("connect-retry 1");
        list.add("resolv-retry 30");
        list.add("dev tun");
        list.add("ping 30");
        list.add("ping-restart 30");
        list.add("auth-user-pass");
        list.add("nobind");
        list.add("route 0.0.0.0 0.0.0.0 vpn_gateway");
        list.add("route-ipv6 ::/0");
    }

    public void e(@x1 List<String> list, @x1 List<String> list2) {
        for (String str : list2) {
            a(list, str);
        }
    }

    @x1
    public abstract String f(@x1 Bundle bundle);

    @x1
    public abstract List<gt0> g(@x1 ft0 ft0Var, @x1 Bundle bundle);

    @x1
    public String h(@x1 ft0 ft0Var, @x1 Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        for (gt0 gt0Var : g(ft0Var, bundle)) {
            arrayList.add(gt0Var.c());
        }
        return i((String) r81.f(ft0Var.u()), (String) r81.f(ft0Var.o()), arrayList, ft0Var.n(), bundle);
    }

    @x1
    public String i(@x1 String str, @x1 String str2, @x1 List<String> list, @x1 String str3, @x1 Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        d(arrayList);
        e(arrayList, list);
        b(arrayList, str3);
        c(arrayList, bundle);
        return this.a.z(new th3(TextUtils.join("\n", arrayList), str, str2, "", f(bundle)));
    }
}