package com.p7700g.p99005;

import com.p7700g.p99005.fr5;
import com.p7700g.p99005.hr5;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: FileDownloader.java */
/* loaded from: classes.dex */
public class j31 {
    @x1
    private static final kj1 a = kj1.b("FileDownloader");
    private static final long b = 10;
    @x1
    private final fr5 c;

    /* compiled from: FileDownloader.java */
    /* loaded from: classes.dex */
    public class a implements iq5 {
        public final /* synthetic */ eq0 a;

        public a(eq0 eq0Var) {
            this.a = eq0Var;
        }

        @Override // com.p7700g.p99005.iq5
        public void a(@x1 hq5 hq5Var, @x1 jr5 jr5Var) {
            if (jr5Var.s1()) {
                this.a.g(jr5Var);
            } else {
                this.a.f(new g31());
            }
        }

        @Override // com.p7700g.p99005.iq5
        public void b(@x1 hq5 hq5Var, @x1 IOException iOException) {
            this.a.f(iOException);
        }
    }

    public j31() {
        fr5.a l0 = new fr5.a().l0(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.c = l0.k(10L, timeUnit).j0(10L, timeUnit).f();
    }

    private /* synthetic */ dq0 c(String str, dq0 dq0Var) throws Exception {
        return a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ File f(dq0 dq0Var) throws Exception {
        if (!dq0Var.J()) {
            return j(File.createTempFile("remote", o31.b), ((jr5) r81.f((jr5) dq0Var.F())).v().a());
        }
        throw dq0Var.E();
    }

    private /* synthetic */ Void g() throws Exception {
        this.c.Z().b();
        return null;
    }

    @x1
    private dq0<Void> i() {
        return dq0.g(new Callable() { // from class: com.p7700g.p99005.ox0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                j31.this.h();
                return null;
            }
        });
    }

    @x1
    private File j(@x1 File file, @x1 InputStream inputStream) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        StringBuilder sb = new StringBuilder();
        byte[] bArr = new byte[kb0.c];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                sb.append(new String(bArr, 0, read, Charset.defaultCharset()));
                fileOutputStream.write(bArr, 0, read);
            } else {
                fileOutputStream.close();
                return file;
            }
        }
    }

    @x1
    public dq0<jr5> a(@x1 String str) {
        eq0 eq0Var = new eq0();
        a.c(wo1.t("Download from ", str), new Object[0]);
        this.c.a(new hr5.a().B(str).b()).D1(new a(eq0Var));
        return eq0Var.a();
    }

    @x1
    public dq0<File> b(@x1 final String str) {
        return i().u(new aq0() { // from class: com.p7700g.p99005.qx0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return j31.this.a(str);
            }
        }).q(new aq0() { // from class: com.p7700g.p99005.px0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return j31.this.f(dq0Var);
            }
        });
    }

    public /* synthetic */ dq0 d(String str, dq0 dq0Var) {
        return a(str);
    }

    public /* synthetic */ Void h() {
        g();
        return null;
    }
}