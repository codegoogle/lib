package com.p7700g.p99005;

import android.text.TextUtils;
import com.anchorfree.sdk.RemoteConfigRepository;
import com.google.gson.Gson;
import com.p7700g.p99005.kq0;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: UrlRotatorImpl.java */
/* loaded from: classes2.dex */
public class sa1 implements br0 {
    @x1
    public static final String a = "backend_urls";
    @x1
    private static final kj1 b = kj1.b("UrlRotatorImpl");
    @x1
    private final List<String> c;
    private final List<String> d;
    @x1
    private final s41 e;
    @x1
    private final RemoteConfigRepository f;
    @z1
    private String g;

    /* compiled from: UrlRotatorImpl.java */
    /* loaded from: classes2.dex */
    public static class a {
        @mw2("legacy")
        @z1
        public final List<String> a;
        @mw2("primary")
        @z1
        public final List<String> b;

        private a(@x1 List<String> list, @x1 List<String> list2) {
            this.a = list;
            this.b = list2;
        }

        @x1
        public List<String> a() {
            List<String> list = this.a;
            return list == null ? new ArrayList() : list;
        }

        @x1
        public List<String> b() {
            List<String> list = this.b;
            return list == null ? new ArrayList() : list;
        }
    }

    public sa1(@x1 Gson gson, @x1 List<String> list, @x1 s41 s41Var, @x1 RemoteConfigRepository remoteConfigRepository, @x1 c81 c81Var) {
        this.e = s41Var;
        this.f = remoteConfigRepository;
        LinkedList linkedList = new LinkedList();
        this.c = linkedList;
        linkedList.addAll(list);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        try {
            a aVar = (a) gson.n(c81Var.b(kq0.j.f), a.class);
            if (aVar != null) {
                arrayList.addAll(aVar.b());
            }
        } catch (Throwable th) {
            b.f(th);
            this.d.add("https://api.pango-paas.co");
            this.d.add("https://android.stable-vpn.com");
            this.d.add("https://d1pijg9qb98hxx.cloudfront.net");
        }
    }

    @x1
    private List<String> c() {
        LinkedList linkedList = new LinkedList();
        try {
            JSONArray jSONArray = (JSONArray) this.f.get(a, new JSONArray());
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("url");
                        if (!TextUtils.isEmpty(optString)) {
                            linkedList.add(optString);
                        }
                    } else {
                        String optString2 = jSONArray.optString(i);
                        if (!TextUtils.isEmpty(optString2)) {
                            linkedList.add(optString2);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            b.f(th);
        }
        linkedList.addAll(this.c);
        linkedList.addAll(this.d);
        return linkedList;
    }

    private boolean d(@x1 au0 au0Var) {
        return au0Var instanceof zt0;
    }

    @Override // com.p7700g.p99005.br0
    public synchronized void a(@x1 String str, @x1 au0 au0Var) {
        if (!d(au0Var)) {
            this.e.b(str, au0Var);
            this.g = null;
            b.g(au0Var, "Mark url %s failure", str);
        } else {
            b(str);
        }
    }

    @Override // com.p7700g.p99005.br0
    public synchronized void b(@x1 String str) {
        this.e.c(str);
        this.g = str;
        b.c("Mark url %s success", str);
    }

    @Override // com.p7700g.p99005.br0
    @x1
    public synchronized String provide() {
        List<String> c = c();
        if (c.size() == 1) {
            return c.get(0);
        }
        String str = "";
        long j = Long.MAX_VALUE;
        for (String str2 : c) {
            long a2 = this.e.a(str2);
            if (a2 < j) {
                str = str2;
                j = a2;
            }
        }
        b.c("Provide url %s", str);
        return str;
    }

    @Override // com.p7700g.p99005.br0
    public synchronized int size() {
        return c().size();
    }
}