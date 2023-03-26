package com.p7700g.p99005;

import android.text.TextUtils;
import com.p7700g.p99005.t43;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class d23<T> extends g23<T> {
    @NotNull
    public static final b U = new b(null);
    @NotNull
    private static final String V = "DwnRqst";
    private static final float W = 1.0f;
    private static final int X = 30000;
    private static final int Y = 1;
    @Nullable
    private c Z;
    @NotNull
    private final t43.d u0;
    @NotNull
    private final String v0;
    private final int w0;
    private final int x0;

    /* loaded from: classes3.dex */
    public static final class a {
        @NotNull
        private final String a;
        @Nullable
        private c b;
        @Nullable
        private t43.d c;
        @Nullable
        private String d;
        private int e;
        private int f;

        public a(@NotNull String str) {
            c25.p(str, "mUrl");
            this.a = str;
            this.c = t43.d.IMMEDIATE;
            this.e = 1;
            this.f = 30000;
        }

        @Nullable
        public final d23<yq4> a() {
            if (!TextUtils.isEmpty(this.a) && this.b != null && this.c != null && !TextUtils.isEmpty(this.d)) {
                String str = this.a;
                c cVar = this.b;
                t43.d dVar = this.c;
                c25.m(dVar);
                String str2 = this.d;
                c25.m(str2);
                return new d23<>(str, cVar, dVar, str2, this.e, this.f, null);
            }
            xz2.c(d23.V, "[ERROR] Need all the objects to create the INSTANCE");
            return null;
        }

        @NotNull
        public final a b(@NotNull c cVar) {
            c25.p(cVar, "downloadListenerInterface");
            this.b = cVar;
            return this;
        }

        @NotNull
        public final a c(@NotNull String str) {
            c25.p(str, "downloadPath");
            this.d = str;
            return this;
        }

        @NotNull
        public final a d(@NotNull t43.d dVar) {
            c25.p(dVar, "priority");
            this.c = dVar;
            return this;
        }

        @NotNull
        public final a e(int i) {
            this.f = i;
            return this;
        }

        @NotNull
        public final a f(int i) {
            this.e = i;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a(@NotNull String str, @NotNull String str2);

        void b(@NotNull String str, @NotNull b53 b53Var);

        void c(@NotNull String str, @Nullable byte[] bArr, @NotNull String str2);
    }

    private d23(String str, c cVar, t43.d dVar, String str2, int i, int i2) {
        super(0, str, null, a23.s);
        this.Z = cVar;
        this.u0 = dVar;
        this.v0 = str2;
        this.w0 = i;
        this.x0 = i2;
        O(new j43(i2, i, 1.0f));
        Q(false);
    }

    public /* synthetic */ d23(String str, c cVar, t43.d dVar, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cVar, dVar, str2, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y0(b53 b53Var) {
    }

    private final void c1(byte[] bArr) {
        c cVar = this.Z;
        if (cVar != null) {
            c25.m(cVar);
            String D = D();
            c25.o(D, "url");
            cVar.c(D, bArr, this.v0);
            this.Z = null;
        }
    }

    private final void d1(String str) {
        c cVar = this.Z;
        if (cVar != null) {
            c25.m(cVar);
            String D = D();
            c25.o(D, "url");
            cVar.a(D, str);
            this.Z = null;
        }
    }

    @Override // com.p7700g.p99005.g23, com.p7700g.p99005.t43
    @NotNull
    public v43<byte[]> K(@NotNull p43 p43Var) {
        c25.p(p43Var, "response");
        v43<byte[]> c2 = v43.c(p43Var.b, k53.c(p43Var));
        c25.o(c2, "success(response.data, HttpHeaderParser.parseCacheHeaders(response))");
        return c2;
    }

    @Override // com.p7700g.p99005.g23, com.p7700g.p99005.t43
    /* renamed from: W */
    public void f(@NotNull byte[] bArr) {
        c25.p(bArr, "response");
        if (!TextUtils.isEmpty(this.v0)) {
            try {
                wz2.f(bArr, this.v0);
                c1(bArr);
                return;
            } catch (IOException e) {
                wz2.a(new File(this.v0));
                xz2.c(V, c25.C("[ERROR] Exception while saving the file: ", e.getLocalizedMessage()));
                d1(c25.C("IOException: ", e.getLocalizedMessage()));
                return;
            }
        }
        d1("No path given to download the file");
    }

    @Override // com.p7700g.p99005.t43
    public void e(@NotNull b53 b53Var) {
        c25.p(b53Var, "error");
        super.e(b53Var);
        p43 p43Var = b53Var.s;
        if (p43Var != null) {
            xz2.c(V, c25.C("[ERROR] Error in Download Request with status code: ", Integer.valueOf(p43Var.a)));
        } else {
            xz2.c(V, "[ERROR] Error in Download Request");
        }
        c cVar = this.Z;
        if (cVar != null) {
            c25.m(cVar);
            String D = D();
            c25.o(D, "url");
            cVar.b(D, b53Var);
            this.Z = null;
        }
    }

    @Override // com.p7700g.p99005.g23, com.p7700g.p99005.t43
    @NotNull
    public t43.d w() {
        return this.u0;
    }
}