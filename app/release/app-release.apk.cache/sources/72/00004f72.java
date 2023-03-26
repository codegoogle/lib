package com.p7700g.p99005;

import com.p7700g.p99005.ym4;
import java.lang.reflect.Type;

/* compiled from: ResponseImpl.java */
/* loaded from: classes3.dex */
public class lw3 extends ym4 {
    private final ym4.c a;
    private final um4<String, Object> b;
    private final Object c;
    private final Type d;

    /* compiled from: ResponseImpl.java */
    /* loaded from: classes3.dex */
    public static class a implements ym4.c {
        public final /* synthetic */ int s;

        public a(int i) {
            this.s = i;
        }

        @Override // com.p7700g.p99005.ym4.c
        public int f() {
            return this.s;
        }

        @Override // com.p7700g.p99005.ym4.c
        public String g() {
            return "";
        }

        @Override // com.p7700g.p99005.ym4.c
        public ym4.b.a h() {
            return lw3.x(this.s);
        }
    }

    public lw3(ym4.c cVar, dt3 dt3Var, Object obj, Type type) {
        this.a = cVar;
        this.b = dt3Var;
        this.c = obj;
        this.d = type;
    }

    public static ym4.b.a x(int i) {
        int i2 = i / 100;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return ym4.b.a.OTHER;
                        }
                        return ym4.b.a.SERVER_ERROR;
                    }
                    return ym4.b.a.CLIENT_ERROR;
                }
                return ym4.b.a.REDIRECTION;
            }
            return ym4.b.a.SUCCESSFUL;
        }
        return ym4.b.a.INFORMATIONAL;
    }

    public static ym4.c y(int i) {
        if (i != 204) {
            if (i != 301) {
                if (i != 307) {
                    if (i != 406) {
                        if (i != 412) {
                            if (i != 415) {
                                if (i != 500) {
                                    if (i != 503) {
                                        if (i != 303) {
                                            if (i != 304) {
                                                if (i != 400) {
                                                    if (i != 401) {
                                                        if (i != 403) {
                                                            if (i != 404) {
                                                                if (i != 409) {
                                                                    if (i != 410) {
                                                                        switch (i) {
                                                                            case 200:
                                                                                return ym4.b.OK;
                                                                            case 201:
                                                                                return ym4.b.CREATED;
                                                                            case com.anythink.expressad.video.dynview.a.a.n /* 202 */:
                                                                                return ym4.b.ACCEPTED;
                                                                            default:
                                                                                return new a(i);
                                                                        }
                                                                    }
                                                                    return ym4.b.GONE;
                                                                }
                                                                return ym4.b.CONFLICT;
                                                            }
                                                            return ym4.b.NOT_FOUND;
                                                        }
                                                        return ym4.b.FORBIDDEN;
                                                    }
                                                    return ym4.b.UNAUTHORIZED;
                                                }
                                                return ym4.b.BAD_REQUEST;
                                            }
                                            return ym4.b.NOT_MODIFIED;
                                        }
                                        return ym4.b.SEE_OTHER;
                                    }
                                    return ym4.b.SERVICE_UNAVAILABLE;
                                }
                                return ym4.b.INTERNAL_SERVER_ERROR;
                            }
                            return ym4.b.UNSUPPORTED_MEDIA_TYPE;
                        }
                        return ym4.b.PRECONDITION_FAILED;
                    }
                    return ym4.b.NOT_ACCEPTABLE;
                }
                return ym4.b.TEMPORARY_REDIRECT;
            }
            return ym4.b.MOVED_PERMANENTLY;
        }
        return ym4.b.NO_CONTENT;
    }

    @Override // com.p7700g.p99005.ym4
    public Object c() {
        return this.c;
    }

    @Override // com.p7700g.p99005.ym4
    public um4<String, Object> d() {
        return this.b;
    }

    @Override // com.p7700g.p99005.ym4
    public int e() {
        return this.a.f();
    }

    public Type v() {
        return this.d;
    }

    public ym4.c w() {
        return this.a;
    }

    public lw3(int i, dt3 dt3Var, Object obj, Type type) {
        this.a = y(i);
        this.b = dt3Var;
        this.c = obj;
        this.d = type;
    }
}