package com.p7700g.p99005;

import com.p7700g.p99005.aa;
import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* compiled from: Response.java */
/* loaded from: classes3.dex */
public abstract class ym4 {

    /* compiled from: Response.java */
    /* loaded from: classes3.dex */
    public static abstract class a {
        public static a m() {
            return mn4.g().c();
        }

        public abstract ym4 a();

        public abstract a b(nm4 nm4Var);

        @Override // 
        /* renamed from: c */
        public abstract a clone();

        public abstract a d(URI uri);

        public abstract a e(vm4... vm4VarArr);

        public abstract a f(Object obj);

        public abstract a g(Date date);

        public abstract a h(String str, Object obj);

        public abstract a i(String str);

        public abstract a j(Locale locale);

        public abstract a k(Date date);

        public abstract a l(URI uri);

        public abstract a n(int i);

        public a o(b bVar) {
            return p(bVar);
        }

        public a p(c cVar) {
            if (cVar != null) {
                return n(cVar.f());
            }
            throw new IllegalArgumentException();
        }

        public abstract a q(String str);

        public abstract a r(qm4 qm4Var);

        public abstract a s(String str);

        public abstract a t(tm4 tm4Var);

        public abstract a u(en4 en4Var);

        public abstract a v(List<en4> list);
    }

    /* compiled from: Response.java */
    /* loaded from: classes3.dex */
    public enum b implements c {
        OK(200, it0.a),
        CREATED(201, "Created"),
        ACCEPTED(com.anythink.expressad.video.dynview.a.a.n, "Accepted"),
        NO_CONTENT(204, "No Content"),
        MOVED_PERMANENTLY(301, "Moved Permanently"),
        SEE_OTHER(303, "See Other"),
        NOT_MODIFIED(304, "Not Modified"),
        TEMPORARY_REDIRECT(307, "Temporary Redirect"),
        BAD_REQUEST(400, "Bad Request"),
        UNAUTHORIZED(401, "Unauthorized"),
        FORBIDDEN(aa.c.d, "Forbidden"),
        NOT_FOUND(com.anythink.expressad.video.dynview.a.a.t, "Not Found"),
        NOT_ACCEPTABLE(406, "Not Acceptable"),
        CONFLICT(409, "Conflict"),
        GONE(410, "Gone"),
        PRECONDITION_FAILED(412, "Precondition Failed"),
        UNSUPPORTED_MEDIA_TYPE(415, "Unsupported Media Type"),
        INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
        SERVICE_UNAVAILABLE(aa.g.k, "Service Unavailable");
        
        private final int M;
        private final String N;
        private a O;

        /* compiled from: Response.java */
        /* loaded from: classes3.dex */
        public enum a {
            INFORMATIONAL,
            SUCCESSFUL,
            REDIRECTION,
            CLIENT_ERROR,
            SERVER_ERROR,
            OTHER
        }

        b(int i, String str) {
            this.M = i;
            this.N = str;
            int i2 = i / 100;
            if (i2 == 1) {
                this.O = a.INFORMATIONAL;
            } else if (i2 == 2) {
                this.O = a.SUCCESSFUL;
            } else if (i2 == 3) {
                this.O = a.REDIRECTION;
            } else if (i2 == 4) {
                this.O = a.CLIENT_ERROR;
            } else if (i2 != 5) {
                this.O = a.OTHER;
            } else {
                this.O = a.SERVER_ERROR;
            }
        }

        public static b b(int i) {
            b[] values = values();
            for (int i2 = 0; i2 < 19; i2++) {
                b bVar = values[i2];
                if (bVar.M == i) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // com.p7700g.p99005.ym4.c
        public int f() {
            return this.M;
        }

        @Override // com.p7700g.p99005.ym4.c
        public String g() {
            return toString();
        }

        @Override // com.p7700g.p99005.ym4.c
        public a h() {
            return this.O;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.N;
        }
    }

    /* compiled from: Response.java */
    /* loaded from: classes3.dex */
    public interface c {
        int f();

        String g();

        b.a h();
    }

    public static a a(URI uri) {
        return s(b.CREATED).l(uri);
    }

    public static a b(ym4 ym4Var) {
        a r = r(ym4Var.e());
        r.f(ym4Var.c());
        for (String str : ym4Var.d().keySet()) {
            for (Object obj : (List) ym4Var.d().get(str)) {
                r.h(str, obj);
            }
        }
        return r;
    }

    public static a f() {
        return s(b.NO_CONTENT);
    }

    public static a g(List<en4> list) {
        return s(b.NOT_ACCEPTABLE).v(list);
    }

    public static a h() {
        return s(b.NOT_MODIFIED);
    }

    public static a i(String str) {
        a h = h();
        h.q(str);
        return h;
    }

    public static a j(qm4 qm4Var) {
        a h = h();
        h.r(qm4Var);
        return h;
    }

    public static a k() {
        return s(b.OK);
    }

    public static a l(Object obj) {
        a k = k();
        k.f(obj);
        return k;
    }

    public static a m(Object obj, String str) {
        a k = k();
        k.f(obj);
        k.s(str);
        return k;
    }

    public static a n(Object obj, tm4 tm4Var) {
        a k = k();
        k.f(obj);
        k.t(tm4Var);
        return k;
    }

    public static a o(Object obj, en4 en4Var) {
        a k = k();
        k.f(obj);
        k.u(en4Var);
        return k;
    }

    public static a p(URI uri) {
        return s(b.SEE_OTHER).l(uri);
    }

    public static a q() {
        return s(b.INTERNAL_SERVER_ERROR);
    }

    public static a r(int i) {
        a m = a.m();
        m.n(i);
        return m;
    }

    public static a s(b bVar) {
        return t(bVar);
    }

    public static a t(c cVar) {
        a m = a.m();
        m.p(cVar);
        return m;
    }

    public static a u(URI uri) {
        return s(b.TEMPORARY_REDIRECT).l(uri);
    }

    public abstract Object c();

    public abstract um4<String, Object> d();

    public abstract int e();
}