package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.environment.a;
import com.ironsource.sdk.service.d;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class v {
    public static final String a = "v";
    public d c;
    public Context e;
    private final String b = "oneToken";
    public com.ironsource.sdk.service.c d = new com.ironsource.sdk.service.c();
    private com.ironsource.environment.f.b f = new com.ironsource.environment.f.b();

    /* loaded from: classes3.dex */
    public static class a {
        public String a;
        public JSONObject b;
        public String c;
        public String d;

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public v(Context context, d dVar) {
        this.c = dVar;
        this.e = context;
    }

    public JSONObject a() {
        JSONObject a2 = this.f.a();
        Iterator<String> keys = a2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = a2.get(next);
            if (obj instanceof String) {
                a2.put(next, a.AnonymousClass1.a((String) obj));
            }
        }
        return a2;
    }
}