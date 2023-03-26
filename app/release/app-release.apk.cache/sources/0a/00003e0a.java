package com.p7700g.p99005;

import com.anchorfree.partner.api.ClientInfo;
import com.anchorfree.sdk.SessionConfig;

/* compiled from: SessionInfo.java */
/* loaded from: classes.dex */
public class d51 {
    @x1
    private final en1 a;
    @x1
    private final SessionConfig b;
    @x1
    private final String c;
    @z1
    private final ft0 d;
    @z1
    private final String e;
    @x1
    private final String f;
    @x1
    private final lm1 g;
    @x1
    private final ClientInfo h;

    /* compiled from: SessionInfo.java */
    /* loaded from: classes.dex */
    public static class a {
        @z1
        private ft0 f;
        @x1
        public String a = "";
        @x1
        public String b = "";
        @x1
        private lm1 c = lm1.g();
        @x1
        private en1 d = en1.IDLE;
        @x1
        private SessionConfig e = SessionConfig.empty();
        @x1
        private String g = "";
        @x1
        private ClientInfo h = ClientInfo.newBuilder().g(" ").e(" ").f();

        @x1
        public d51 g() {
            return new d51(this);
        }

        @x1
        public a h(@x1 String str) {
            this.b = str;
            return this;
        }

        @x1
        public a i(@x1 ClientInfo clientInfo) {
            this.h = clientInfo;
            return this;
        }

        @x1
        public a j(@x1 String str) {
            this.a = str;
            return this;
        }

        @x1
        public a k(@z1 ft0 ft0Var) {
            this.f = ft0Var;
            return this;
        }

        @x1
        public a l(@x1 SessionConfig sessionConfig) {
            this.e = sessionConfig;
            return this;
        }

        @x1
        public a m(@x1 en1 en1Var) {
            this.d = en1Var;
            return this;
        }

        @x1
        public a n(@x1 lm1 lm1Var) {
            this.c = lm1Var;
            return this;
        }

        @x1
        public a o(@x1 String str) {
            this.g = str;
            return this;
        }
    }

    public d51(@x1 a aVar) {
        this.g = aVar.c;
        this.a = aVar.d;
        this.b = aVar.e;
        this.c = aVar.a;
        this.d = aVar.f;
        this.e = aVar.b;
        this.f = aVar.g;
        this.h = aVar.h;
    }

    @x1
    public static d51 a(@x1 en1 en1Var) {
        return new a().m(en1Var).j("").h("").o("").n(lm1.g()).l(SessionConfig.empty()).g();
    }

    @z1
    public String b() {
        return this.e;
    }

    @x1
    public ClientInfo c() {
        return this.h;
    }

    @x1
    public String d() {
        return this.c;
    }

    @x1
    public lm1 e() {
        return this.g;
    }

    @z1
    public ft0 f() {
        return this.d;
    }

    @x1
    public SessionConfig g() {
        return this.b;
    }

    @x1
    public String h() {
        return this.f;
    }

    @x1
    public en1 i() {
        return this.a;
    }

    public String toString() {
        StringBuilder K = wo1.K("SessionInfo{", "vpnState=");
        K.append(this.a);
        K.append(", sessionConfig=");
        K.append(this.b);
        K.append(", config='");
        wo1.d0(K, this.c, '\'', ", credentials=");
        K.append(this.d);
        K.append(", carrier='");
        wo1.d0(K, this.e, '\'', ", transport='");
        wo1.d0(K, this.f, '\'', ", connectionStatus=");
        K.append(this.g);
        K.append(", clientInfo=");
        K.append(this.g);
        K.append('}');
        return K.toString();
    }
}