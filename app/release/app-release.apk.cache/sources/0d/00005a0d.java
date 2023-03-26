package com.p7700g.p99005;

import android.content.Context;
import android.os.Bundle;
import com.google.gson.Gson;
import java.util.List;

/* compiled from: OpenVpn2ConfigProvider.java */
/* loaded from: classes3.dex */
public class rh3 extends sh3 {
    @x1
    private final Context b;
    @x1
    private final jf1 c;

    public rh3(@x1 Context context, @x1 Gson gson, @x1 jf1 jf1Var) {
        super(gson);
        this.b = context;
        this.c = jf1Var;
    }

    @Override // com.p7700g.p99005.sh3
    public void c(@x1 List<String> list, @x1 Bundle bundle) {
        list.add("machine-readable-output");
        list.add(String.format("management %s/mgmtsocket unix", this.b.getCacheDir().getAbsolutePath()));
        list.add("management-client");
        list.add("management-query-passwords");
        list.add("management-hold");
        list.add(String.format("tmp-dir %s", this.b.getCacheDir().getAbsolutePath()));
    }

    @Override // com.p7700g.p99005.sh3
    @x1
    public String f(@x1 Bundle bundle) {
        return qh3.x;
    }

    @Override // com.p7700g.p99005.sh3
    @x1
    public List<gt0> g(@x1 ft0 ft0Var, @x1 Bundle bundle) {
        return this.c.a(ft0Var);
    }
}