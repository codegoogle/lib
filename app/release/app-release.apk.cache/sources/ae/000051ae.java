package com.p7700g.p99005;

import android.text.TextUtils;
import com.anchorfree.sdk.RemoteConfigLoader;
import java.io.File;
import java.util.concurrent.Executor;

/* compiled from: RemoteFileHandler.java */
/* loaded from: classes.dex */
public final class n41 {
    @x1
    private static final kj1 a = kj1.b("RemoteFileHandler");
    @x1
    private final p41 b;
    @x1
    private final j31 c;
    @x1
    private final Executor d;
    @x1
    private final u41 e;

    public n41(@x1 p41 p41Var, @x1 j31 j31Var, @x1 Executor executor, @x1 u41 u41Var) {
        this.b = p41Var;
        this.c = j31Var;
        this.d = executor;
        this.e = u41Var;
    }

    private void a(@x1 Throwable th) {
        this.b.l(th);
        a.f(th);
    }

    @x1
    private String b(@x1 RemoteConfigLoader.FilesObject filesObject, @x1 ft0 ft0Var) {
        return String.format("https://api-%s.northghost.com/storage/project/%s/files/%s/%s", ft0Var.r().get(0).e(), this.b.h(), this.b.i(), this.b.g(filesObject));
    }

    private void d(@x1 File file, @x1 RemoteConfigLoader.FilesObject filesObject) {
        try {
            this.b.m(file, filesObject);
        } catch (Throwable th) {
            a.f(th);
            a(th);
        }
    }

    private /* synthetic */ Void e(RemoteConfigLoader.FilesObject filesObject, dq0 dq0Var) throws Exception {
        if (dq0Var.J()) {
            a.c("Got response for: %s error: %s", this.b.i(), dq0Var.E());
            a(dq0Var.E());
            return null;
        }
        File file = (File) r81.f((File) dq0Var.F());
        a.c("Got response for: %s length: %d", this.b.i(), Long.valueOf(file.length()));
        d(file, filesObject);
        return null;
    }

    private boolean h(@x1 String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String a2 = this.b.a();
        String d = this.b.d();
        return (str.equals(a2) && !TextUtils.isEmpty(d) && new File(d).exists()) ? false : true;
    }

    @x1
    public dq0<Void> c(@z1 final RemoteConfigLoader.FilesObject filesObject, @x1 ft0 ft0Var) {
        if (filesObject != null && h(this.b.g(filesObject))) {
            return this.c.b(b(filesObject, ft0Var)).s(new aq0() { // from class: com.p7700g.p99005.sy0
                @Override // com.p7700g.p99005.aq0
                public final Object a(dq0 dq0Var) {
                    n41.this.f(filesObject, dq0Var);
                    return null;
                }
            }, this.d);
        }
        return dq0.D(null);
    }

    public /* synthetic */ Void f(RemoteConfigLoader.FilesObject filesObject, dq0 dq0Var) {
        e(filesObject, dq0Var);
        return null;
    }

    public void g() {
        this.b.k();
    }
}