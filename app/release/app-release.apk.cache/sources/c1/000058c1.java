package com.p7700g.p99005;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import java.util.HashMap;
import java.util.Map;

/* compiled from: CredentialsRequest.java */
/* loaded from: classes.dex */
public class qr0 {
    @x1
    @mw2(ImpressionData.IMPRESSION_DATA_KEY_COUNTRY)
    private final String a;
    @x1
    @mw2(ik3.b)
    private final String b;
    @x1
    @mw2("connectionType")
    private final nr0 c;
    @x1
    @mw2("connectionType")
    private final String d;
    @x1
    private Map<String, String> e;

    /* compiled from: CredentialsRequest.java */
    /* loaded from: classes.dex */
    public static class a {
        @x1
        private String a = "";
        @x1
        private String b = "";
        @x1
        private nr0 c = nr0.HYDRA_TCP;
        @x1
        private String d = "";
        @x1
        private Map<String, String> e = new HashMap();

        @x1
        public qr0 f() {
            return new qr0(this);
        }

        @x1
        public a g(@x1 nr0 nr0Var) {
            this.c = nr0Var;
            return this;
        }

        @x1
        public a h(@x1 String str) {
            this.a = str;
            return this;
        }

        @x1
        public a i(@x1 Map<String, String> map) {
            this.e.putAll(map);
            return this;
        }

        @x1
        public a j(@x1 String str) {
            this.b = str;
            return this;
        }

        @x1
        public a k(@x1 String str) {
            this.d = str;
            return this;
        }
    }

    public qr0(@x1 a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
    }

    @x1
    public nr0 a() {
        return this.c;
    }

    @x1
    public String b() {
        return this.a;
    }

    @x1
    public Map<String, String> c() {
        return this.e;
    }

    @x1
    public String d() {
        return this.b;
    }

    @x1
    public String e() {
        return this.d;
    }

    public String toString() {
        StringBuilder G = wo1.G("CredentialsRequest{country='");
        wo1.d0(G, this.a, '\'', "location='");
        wo1.d0(G, this.b, '\'', ", connectionType=");
        G.append(this.c);
        G.append(", privateGroup='");
        wo1.d0(G, this.d, '\'', ", extras=");
        G.append(this.e);
        G.append('}');
        return G.toString();
    }
}