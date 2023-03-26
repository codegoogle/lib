package com.p7700g.p99005;

import com.p7700g.p99005.b12;
import com.p7700g.p99005.ip;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: SafeKeyGenerator.java */
/* loaded from: classes2.dex */
public class jt1 {
    private final u02<gq1, String> a = new u02<>(1000);
    private final ip.a<b> b = b12.e(10, new a());

    /* compiled from: SafeKeyGenerator.java */
    /* loaded from: classes2.dex */
    public class a implements b12.d<b> {
        public a() {
        }

        @Override // com.p7700g.p99005.b12.d
        /* renamed from: a */
        public b create() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* compiled from: SafeKeyGenerator.java */
    /* loaded from: classes2.dex */
    public static final class b implements b12.f {
        public final MessageDigest s;
        private final d12 t = d12.a();

        public b(MessageDigest messageDigest) {
            this.s = messageDigest;
        }

        @Override // com.p7700g.p99005.b12.f
        @x1
        public d12 b() {
            return this.t;
        }
    }

    private String a(gq1 gq1Var) {
        b bVar = (b) x02.d(this.b.b());
        try {
            gq1Var.a(bVar.s);
            return z02.z(bVar.s.digest());
        } finally {
            this.b.a(bVar);
        }
    }

    public String b(gq1 gq1Var) {
        String k;
        synchronized (this.a) {
            k = this.a.k(gq1Var);
        }
        if (k == null) {
            k = a(gq1Var);
        }
        synchronized (this.a) {
            this.a.o(gq1Var, k);
        }
        return k;
    }
}