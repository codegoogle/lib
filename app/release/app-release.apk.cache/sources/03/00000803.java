package com.anythink.expressad.foundation.g.c;

import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.q;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class d {
    private static final String a = "AnythinkDirManager";
    private static d e;
    private f b;
    private f c;
    private ArrayList<a> d = new ArrayList<>();

    /* loaded from: classes2.dex */
    public static final class a {
        public com.anythink.expressad.foundation.g.c.a a;
        public File b;

        public a(com.anythink.expressad.foundation.g.c.a aVar, File file) {
            this.a = aVar;
            this.b = file;
        }
    }

    private d(f fVar, f fVar2) {
        this.b = fVar;
        this.c = fVar2;
    }

    public static synchronized void a(f fVar, f fVar2) {
        synchronized (d.class) {
            if (e == null) {
                e = new d(fVar, fVar2);
            }
        }
    }

    public static String b(com.anythink.expressad.foundation.g.c.a aVar) {
        File a2 = a(aVar);
        if (a2 != null) {
            return a2.getAbsolutePath();
        }
        return null;
    }

    public final boolean b() {
        return a(this.b.b()) && a(this.c.b());
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (e == null && com.anythink.expressad.foundation.b.a.b().d() != null) {
                q.a(com.anythink.expressad.foundation.b.a.b().d());
            }
            d dVar2 = e;
            dVar = e;
        }
        return dVar;
    }

    public static File a(com.anythink.expressad.foundation.g.c.a aVar) {
        try {
            if (a() == null || a().d == null || a().d.size() <= 0) {
                return null;
            }
            Iterator<a> it = a().d.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.a.equals(aVar)) {
                    return next.b;
                }
            }
            return null;
        } catch (Throwable th) {
            n.b(a, th.getMessage(), th);
            return null;
        }
    }

    private boolean a(e eVar) {
        File a2;
        String str;
        e c = eVar.c();
        if (c == null) {
            str = eVar.b();
        } else {
            if (a(c.a()) == null) {
                return false;
            }
            str = a2.getAbsolutePath() + File.separator + eVar.b();
        }
        File file = new File(str);
        if (!file.exists() ? file.mkdirs() : true) {
            this.d.add(new a(eVar.a(), file));
            List<e> d = eVar.d();
            if (d != null) {
                for (e eVar2 : d) {
                    if (!a(eVar2)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
}