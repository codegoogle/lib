package com.p7700g.p99005;

import com.p7700g.p99005.cr5;
import com.p7700g.p99005.hr5;
import com.p7700g.p99005.wq5;
import com.p7700g.p99005.yq5;
import com.p7700g.p99005.zq5;
import java.io.IOException;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* compiled from: RequestBuilder.java */
/* loaded from: classes4.dex */
public final class vz5 {
    private static final String b = " \"<>^`{}|\\?#";
    private final String d;
    private final zq5 e;
    @Nullable
    private String f;
    @Nullable
    private zq5.a g;
    private final hr5.a h = new hr5.a();
    private final yq5.a i;
    @Nullable
    private br5 j;
    private final boolean k;
    @Nullable
    private cr5.a l;
    @Nullable
    private wq5.a m;
    @Nullable
    private ir5 n;
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final Pattern c = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* compiled from: RequestBuilder.java */
    /* loaded from: classes4.dex */
    public static class a extends ir5 {
        private final ir5 b;
        private final br5 c;

        public a(ir5 ir5Var, br5 br5Var) {
            this.b = ir5Var;
            this.c = br5Var;
        }

        @Override // com.p7700g.p99005.ir5
        public long a() throws IOException {
            return this.b.a();
        }

        @Override // com.p7700g.p99005.ir5
        public br5 b() {
            return this.c;
        }

        @Override // com.p7700g.p99005.ir5
        public void r(tv5 tv5Var) throws IOException {
            this.b.r(tv5Var);
        }
    }

    public vz5(String str, zq5 zq5Var, @Nullable String str2, @Nullable yq5 yq5Var, @Nullable br5 br5Var, boolean z, boolean z2, boolean z3) {
        this.d = str;
        this.e = zq5Var;
        this.f = str2;
        this.j = br5Var;
        this.k = z;
        if (yq5Var != null) {
            this.i = yq5Var.m();
        } else {
            this.i = new yq5.a();
        }
        if (z2) {
            this.m = new wq5.a();
        } else if (z3) {
            cr5.a aVar = new cr5.a();
            this.l = aVar;
            aVar.g(cr5.f);
        }
    }

    private static String i(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt >= 32 && codePointAt < 127 && b.indexOf(codePointAt) == -1 && (z || (codePointAt != 47 && codePointAt != 37))) {
                i += Character.charCount(codePointAt);
            } else {
                sv5 sv5Var = new sv5();
                sv5Var.a1(str, 0, i);
                j(sv5Var, str, i, length, z);
                return sv5Var.u1();
            }
        }
        return str;
    }

    private static void j(sv5 sv5Var, String str, int i, int i2, boolean z) {
        sv5 sv5Var2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt >= 32 && codePointAt < 127 && b.indexOf(codePointAt) == -1 && (z || (codePointAt != 47 && codePointAt != 37))) {
                    sv5Var.O(codePointAt);
                } else {
                    if (sv5Var2 == null) {
                        sv5Var2 = new sv5();
                    }
                    sv5Var2.O(codePointAt);
                    while (!sv5Var2.f0()) {
                        int readByte = sv5Var2.readByte() & 255;
                        sv5Var.g0(37);
                        char[] cArr = a;
                        sv5Var.g0(cArr[(readByte >> 4) & 15]);
                        sv5Var.g0(cArr[readByte & 15]);
                    }
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    public void a(String str, String str2, boolean z) {
        if (z) {
            this.m.b(str, str2);
        } else {
            this.m.a(str, str2);
        }
    }

    public void b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.j = br5.h(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(wo1.t("Malformed content type: ", str2), e);
            }
        }
        this.i.b(str, str2);
    }

    public void c(yq5 yq5Var) {
        this.i.e(yq5Var);
    }

    public void d(yq5 yq5Var, ir5 ir5Var) {
        this.l.c(yq5Var, ir5Var);
    }

    public void e(cr5.c cVar) {
        this.l.d(cVar);
    }

    public void f(String str, String str2, boolean z) {
        if (this.f != null) {
            String i = i(str2, z);
            String str3 = this.f;
            String replace = str3.replace("{" + str + "}", i);
            if (!c.matcher(replace).matches()) {
                this.f = replace;
                return;
            }
            throw new IllegalArgumentException(wo1.t("@Path parameters shouldn't perform path traversal ('.' or '..'): ", str2));
        }
        throw new AssertionError();
    }

    public void g(String str, @Nullable String str2, boolean z) {
        String str3 = this.f;
        if (str3 != null) {
            zq5.a I = this.e.I(str3);
            this.g = I;
            if (I != null) {
                this.f = null;
            } else {
                StringBuilder G = wo1.G("Malformed URL. Base: ");
                G.append(this.e);
                G.append(", Relative: ");
                G.append(this.f);
                throw new IllegalArgumentException(G.toString());
            }
        }
        if (z) {
            this.g.c(str, str2);
        } else {
            this.g.g(str, str2);
        }
    }

    public <T> void h(Class<T> cls, @Nullable T t) {
        this.h.z(cls, t);
    }

    public hr5.a k() {
        zq5 W;
        zq5.a aVar = this.g;
        if (aVar != null) {
            W = aVar.h();
        } else {
            W = this.e.W(this.f);
            if (W == null) {
                StringBuilder G = wo1.G("Malformed URL. Base: ");
                G.append(this.e);
                G.append(", Relative: ");
                G.append(this.f);
                throw new IllegalArgumentException(G.toString());
            }
        }
        a aVar2 = this.n;
        if (aVar2 == null) {
            wq5.a aVar3 = this.m;
            if (aVar3 != null) {
                aVar2 = aVar3.c();
            } else {
                cr5.a aVar4 = this.l;
                if (aVar4 != null) {
                    aVar2 = aVar4.f();
                } else if (this.k) {
                    aVar2 = ir5.h(null, new byte[0]);
                }
            }
        }
        br5 br5Var = this.j;
        if (br5Var != null) {
            if (aVar2 != null) {
                aVar2 = new a(aVar2, br5Var);
            } else {
                this.i.b("Content-Type", br5Var.toString());
            }
        }
        return this.h.D(W).o(this.i.i()).p(this.d, aVar2);
    }

    public void l(ir5 ir5Var) {
        this.n = ir5Var;
    }

    public void m(Object obj) {
        this.f = obj.toString();
    }
}