package com.p7700g.p99005;

import android.content.Context;
import android.util.Log;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import com.p7700g.p99005.hu0;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* compiled from: ReLinkerInstance.java */
/* loaded from: classes.dex */
public class iu0 {
    private static final String a = "lib";
    public final Set<String> b;
    public final hu0.b c;
    public final hu0.a d;
    public boolean e;
    public boolean f;
    public hu0.d g;

    /* compiled from: ReLinkerInstance.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ Context s;
        public final /* synthetic */ String t;
        public final /* synthetic */ String u;
        public final /* synthetic */ hu0.c v;

        public a(Context context, String str, String str2, hu0.c cVar) {
            this.s = context;
            this.t = str;
            this.u = str2;
            this.v = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                iu0.this.j(this.s, this.t, this.u);
                this.v.a();
            } catch (fu0 e) {
                this.v.b(e);
            } catch (UnsatisfiedLinkError e2) {
                this.v.b(e2);
            }
        }
    }

    /* compiled from: ReLinkerInstance.java */
    /* loaded from: classes.dex */
    public class b implements FilenameFilter {
        public final /* synthetic */ String a;

        public b(String str) {
            this.a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(this.a);
        }
    }

    public iu0() {
        this(new ju0(), new du0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(Context context, String str, String str2) {
        qu0 qu0Var;
        if (this.b.contains(str) && !this.e) {
            m("%s already loaded previously!", str);
            return;
        }
        try {
            this.c.a(str);
            this.b.add(str);
            m("%s (%s) was loaded normally!", str, str2);
        } catch (UnsatisfiedLinkError e) {
            m("Loading the library normally failed: %s", Log.getStackTraceString(e));
            m("%s (%s) was not loaded normally, re-linking...", str, str2);
            File e2 = e(context, str, str2);
            if (!e2.exists() || this.e) {
                if (this.e) {
                    m("Forcing a re-link of %s (%s)...", str, str2);
                }
                b(context, str, str2);
                this.d.a(context, this.c.d(), this.c.b(str), e2, this);
            }
            try {
                if (this.f) {
                    qu0 qu0Var2 = null;
                    try {
                        qu0Var = new qu0(e2);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        List<String> d = qu0Var.d();
                        qu0Var.close();
                        for (String str3 : d) {
                            f(context, this.c.c(str3));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        qu0Var2 = qu0Var;
                        qu0Var2.close();
                        throw th;
                    }
                }
            } catch (IOException unused) {
            }
            this.c.e(e2.getAbsolutePath());
            this.b.add(str);
            m("%s (%s) was re-linked!", str, str2);
        }
    }

    public void b(Context context, String str, String str2) {
        File d = d(context);
        File e = e(context, str, str2);
        File[] listFiles = d.listFiles(new b(this.c.b(str)));
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (this.e || !file.getAbsolutePath().equals(e.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    public iu0 c() {
        this.e = true;
        return this;
    }

    public File d(Context context) {
        return context.getDir(a, 0);
    }

    public File e(Context context, String str, String str2) {
        String b2 = this.c.b(str);
        if (ku0.a(str2)) {
            return new File(d(context), b2);
        }
        return new File(d(context), wo1.u(b2, CryptoConstants.ALIAS_SEPARATOR, str2));
    }

    public void f(Context context, String str) {
        i(context, str, null, null);
    }

    public void g(Context context, String str, hu0.c cVar) {
        i(context, str, null, cVar);
    }

    public void h(Context context, String str, String str2) {
        i(context, str, str2, null);
    }

    public void i(Context context, String str, String str2, hu0.c cVar) {
        if (context != null) {
            if (!ku0.a(str)) {
                m("Beginning load of %s...", str);
                if (cVar == null) {
                    j(context, str, str2);
                    return;
                } else {
                    new Thread(new a(context, str, str2, cVar)).start();
                    return;
                }
            }
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        throw new IllegalArgumentException("Given context is null");
    }

    public iu0 k(hu0.d dVar) {
        this.g = dVar;
        return this;
    }

    public void l(String str) {
        hu0.d dVar = this.g;
        if (dVar != null) {
            dVar.a(str);
        }
    }

    public void m(String str, Object... objArr) {
        l(String.format(Locale.US, str, objArr));
    }

    public iu0 n() {
        this.f = true;
        return this;
    }

    public iu0(hu0.b bVar, hu0.a aVar) {
        this.b = new HashSet();
        if (bVar == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        }
        if (aVar != null) {
            this.c = bVar;
            this.d = aVar;
            return;
        }
        throw new IllegalArgumentException("Cannot pass null library installer");
    }
}