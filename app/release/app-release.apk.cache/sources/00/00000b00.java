package com.anythink.expressad.videocommon.b;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.u;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.videocommon.b.f;
import com.anythink.expressad.videocommon.b.h;
import com.p7700g.p99005.j20;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class g {
    public static final String a = "ending_page_source";
    public static final String b = "ending_page_save_time";
    private static final String c = "H5DownLoadManager";
    private static g f;
    private CopyOnWriteArrayList<String> d;
    private ConcurrentMap<String, com.anythink.expressad.videocommon.b.b> e;
    private k g;
    private h h;
    private boolean i = false;

    /* loaded from: classes2.dex */
    public interface a {
        void a(String str);

        void a(String str, String str2);
    }

    /* loaded from: classes2.dex */
    public interface b extends a {
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a();

        void a(String str);

        void a(byte[] bArr, String str);
    }

    /* loaded from: classes2.dex */
    public interface d extends a {
    }

    private g() {
        try {
            this.g = k.a();
            this.h = h.a.a;
            this.d = new CopyOnWriteArrayList<>();
            this.e = new ConcurrentHashMap();
        } catch (Throwable th) {
            n.b(c, th.getMessage(), th);
        }
    }

    private void c(final String str, final a aVar) {
        try {
            n.d(c, "download url:".concat(String.valueOf(str)));
            if (this.d.contains(str)) {
                return;
            }
            this.d.add(str);
            f.a.a.a(new com.anythink.expressad.foundation.g.g.a() { // from class: com.anythink.expressad.videocommon.b.g.1
                @Override // com.anythink.expressad.foundation.g.g.a
                public final void a() {
                    if (!TextUtils.isEmpty(g.this.h.b(str))) {
                        g.this.d.remove(str);
                        a aVar2 = aVar;
                        if (aVar2 != null) {
                            aVar2.a(str);
                            return;
                        }
                        return;
                    }
                    e.a(str, new c() { // from class: com.anythink.expressad.videocommon.b.g.1.1
                        @Override // com.anythink.expressad.videocommon.b.g.c
                        public final void a() {
                        }

                        @Override // com.anythink.expressad.videocommon.b.g.c
                        public final void a(byte[] bArr, String str2) {
                            try {
                                g.this.d.remove(str2);
                                if (bArr == null || bArr.length <= 0) {
                                    return;
                                }
                                if (g.this.h.a(str2, bArr)) {
                                    a aVar3 = aVar;
                                    if (aVar3 != null) {
                                        aVar3.a(str2);
                                        return;
                                    }
                                    return;
                                }
                                a aVar4 = aVar;
                                if (aVar4 != null) {
                                    aVar4.a(str2, "save file failed");
                                }
                            } catch (Exception e) {
                                if (com.anythink.expressad.a.a) {
                                    e.printStackTrace();
                                }
                                a aVar5 = aVar;
                                if (aVar5 != null) {
                                    aVar5.a(str2, e.getMessage());
                                }
                            }
                        }

                        @Override // com.anythink.expressad.videocommon.b.g.c
                        public final void a(String str2) {
                            try {
                                g.this.d.remove(str);
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                a aVar3 = aVar;
                                if (aVar3 != null) {
                                    aVar3.a(str, str2);
                                }
                            } catch (Exception e) {
                                if (com.anythink.expressad.a.a) {
                                    e.printStackTrace();
                                }
                                AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                                a aVar4 = aVar;
                                if (aVar4 != null) {
                                    aVar4.a(str, str2);
                                }
                            }
                        }
                    });
                }

                @Override // com.anythink.expressad.foundation.g.g.a
                public final void b() {
                }

                @Override // com.anythink.expressad.foundation.g.g.a
                public final void c() {
                }
            });
        } catch (Throwable th) {
            if (com.anythink.expressad.a.a) {
                th.printStackTrace();
            }
        }
    }

    private String d(String str) {
        h hVar = this.h;
        return hVar != null ? hVar.a(str) : str;
    }

    private static String e(String str) {
        try {
            Object b2 = u.b(com.anythink.expressad.foundation.b.a.b().d(), a.concat(String.valueOf(str)), "");
            if (b2 == null || !(b2 instanceof String)) {
                return null;
            }
            String str2 = (String) b2;
            if (v.b(str2)) {
                return str2;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static long f(String str) {
        try {
            Object b2 = u.b(com.anythink.expressad.foundation.b.a.b().d(), b.concat(String.valueOf(str)), 0L);
            if (b2 != null && (b2 instanceof Long)) {
                return ((Long) b2).longValue();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0L;
    }

    private static void g(String str) {
        try {
            u.a(com.anythink.expressad.foundation.b.a.b().d(), b.concat(String.valueOf(str)), Long.valueOf(System.currentTimeMillis()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void h(String str) {
        b(str, (a) null);
    }

    public static synchronized g a() {
        g gVar;
        synchronized (g.class) {
            if (f == null) {
                f = new g();
            }
            gVar = f;
        }
        return gVar;
    }

    private void b(String str, d dVar) {
        try {
            if (!TextUtils.isEmpty(this.g.a(str))) {
                if (dVar != null) {
                    dVar.a(str);
                }
            } else if (this.e.containsKey(str)) {
                com.anythink.expressad.videocommon.b.b bVar = this.e.get(str);
                if (bVar != null) {
                    bVar.a(dVar);
                }
            } else {
                com.anythink.expressad.videocommon.b.b bVar2 = new com.anythink.expressad.videocommon.b.b(this.e, this.g, dVar, str);
                this.e.put(str, bVar2);
                e.a(str, bVar2);
            }
        } catch (Exception e) {
            if (dVar != null) {
                dVar.a(str, "downloadzip failed");
            }
            if (com.anythink.expressad.a.a) {
                e.printStackTrace();
            }
        }
    }

    public final String a(String str) {
        k kVar = this.g;
        if (kVar != null) {
            return kVar.a(str);
        }
        return null;
    }

    public final void a(String str, a aVar) {
        c(str, aVar);
    }

    private static void a(String str, String str2) {
        try {
            n.b(c, "sourceContent:".concat(String.valueOf(str)));
            u.a(com.anythink.expressad.foundation.b.a.b().d(), a.concat(String.valueOf(str2)), str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final String c(String str) {
        try {
            if (Patterns.WEB_URL.matcher(str).matches() || URLUtil.isValidUrl(str)) {
                Uri parse = Uri.parse(str);
                String path = parse.getPath();
                if (TextUtils.isEmpty(path) || !TextUtils.isEmpty(parse.getQueryParameter("urlDebug"))) {
                    return str;
                }
                if (path.toLowerCase().endsWith(j20.w)) {
                    return a(str);
                }
                h hVar = this.h;
                return hVar != null ? hVar.a(str) : str;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    private void a(String str, d dVar) {
        try {
            if (!TextUtils.isEmpty(this.g.a(str))) {
                if (dVar != null) {
                    dVar.a(str);
                }
            } else if (this.e.containsKey(str)) {
                com.anythink.expressad.videocommon.b.b bVar = this.e.get(str);
                if (bVar != null) {
                    bVar.a(dVar);
                }
            } else {
                com.anythink.expressad.videocommon.b.b bVar2 = new com.anythink.expressad.videocommon.b.b(this.e, this.g, dVar, str);
                this.e.put(str, bVar2);
                e.a(str, bVar2);
            }
        } catch (Exception e) {
            if (dVar != null) {
                dVar.a(str, "downloadzip failed");
            }
            if (com.anythink.expressad.a.a) {
                e.printStackTrace();
            }
        }
    }

    public final void b(String str, a aVar) {
        try {
            if (Patterns.WEB_URL.matcher(str).matches() || URLUtil.isValidUrl(str)) {
                String path = Uri.parse(str).getPath();
                if (!TextUtils.isEmpty(path)) {
                    if (path.toLowerCase().endsWith(j20.w)) {
                        a(str, (d) aVar);
                        return;
                    } else {
                        c(str, aVar);
                        return;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (aVar != null) {
            aVar.a(str, "The URL does not contain a path ");
        }
    }

    public final void b(String str) {
        c(str, null);
    }
}