package com.anythink.expressad.video.bt.module.b;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class e extends c {
    private static final String a = "ProxyShowRewardListener";
    private h b;
    private com.anythink.expressad.videocommon.e.d c;
    private String d;
    private String e;
    private boolean f;
    private Context g;
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c A[Catch: Exception -> 0x0070, TryCatch #0 {Exception -> 0x0070, blocks: (B:3:0x0016, B:5:0x0026, B:7:0x002f, B:9:0x0038, B:11:0x0042, B:13:0x004c, B:15:0x0052, B:17:0x0058, B:19:0x0062, B:21:0x0066, B:23:0x006a), top: B:26:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[Catch: Exception -> 0x0070, TryCatch #0 {Exception -> 0x0070, blocks: (B:3:0x0016, B:5:0x0026, B:7:0x002f, B:9:0x0038, B:11:0x0042, B:13:0x004c, B:15:0x0052, B:17:0x0058, B:19:0x0062, B:21:0x0066, B:23:0x006a), top: B:26:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(Context context, boolean z, com.anythink.expressad.videocommon.e.d dVar, com.anythink.expressad.foundation.d.c cVar, h hVar, String str, String str2) {
        long j;
        this.b = hVar;
        this.c = dVar;
        this.d = str2;
        this.e = str;
        this.f = z;
        this.g = context;
        try {
            if (!TextUtils.isEmpty(com.anythink.expressad.foundation.b.a.b().e())) {
                com.anythink.expressad.d.b.a();
                com.anythink.expressad.d.a b = com.anythink.expressad.d.b.b();
                if (b == null) {
                    com.anythink.expressad.d.b.a();
                    b = com.anythink.expressad.d.b.c();
                }
                if (b != null) {
                    j = b.m() * 1000;
                    com.anythink.expressad.videocommon.e.a b2 = com.anythink.expressad.videocommon.e.c.a().b();
                    long c = b2 != null ? b2.c() : 0L;
                    if (cVar == null) {
                        if (cVar.a(c, j)) {
                            cVar.d(1);
                            if (dVar.L() == 1) {
                                cVar.l(1);
                                return;
                            } else {
                                cVar.l(0);
                                return;
                            }
                        }
                        cVar.d(0);
                        cVar.l(0);
                        return;
                    }
                    return;
                }
            }
            j = 0;
            com.anythink.expressad.videocommon.e.a b22 = com.anythink.expressad.videocommon.e.c.a().b();
            if (b22 != null) {
            }
            if (cVar == null) {
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036 A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:2:0x0000, B:4:0x0010, B:6:0x0019, B:8:0x0022, B:10:0x002c, B:12:0x0036, B:14:0x003c, B:16:0x0043, B:18:0x004d, B:20:0x0051, B:22:0x0055), top: B:25:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:2:0x0000, B:4:0x0010, B:6:0x0019, B:8:0x0022, B:10:0x002c, B:12:0x0036, B:14:0x003c, B:16:0x0043, B:18:0x004d, B:20:0x0051, B:22:0x0055), top: B:25:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(com.anythink.expressad.videocommon.e.d dVar, com.anythink.expressad.foundation.d.c cVar) {
        long j;
        try {
            if (!TextUtils.isEmpty(com.anythink.expressad.foundation.b.a.b().e())) {
                com.anythink.expressad.d.b.a();
                com.anythink.expressad.d.a b = com.anythink.expressad.d.b.b();
                if (b == null) {
                    com.anythink.expressad.d.b.a();
                    b = com.anythink.expressad.d.b.c();
                }
                if (b != null) {
                    j = b.m() * 1000;
                    com.anythink.expressad.videocommon.e.a b2 = com.anythink.expressad.videocommon.e.c.a().b();
                    long c = b2 != null ? b2.c() : 0L;
                    if (cVar == null) {
                        if (cVar.a(c, j)) {
                            cVar.d(1);
                            if (dVar.L() == 1) {
                                cVar.l(1);
                                return;
                            } else {
                                cVar.l(0);
                                return;
                            }
                        }
                        cVar.d(0);
                        cVar.l(0);
                        return;
                    }
                    return;
                }
            }
            j = 0;
            com.anythink.expressad.videocommon.e.a b22 = com.anythink.expressad.videocommon.e.c.a().b();
            if (b22 != null) {
            }
            if (cVar == null) {
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
    public final void b() {
        super.b();
        h hVar = this.b;
        if (hVar != null) {
            hVar.b();
        }
    }

    @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
    public final void c() {
        super.c();
        h hVar = this.b;
        if (hVar != null) {
            hVar.c();
        }
    }

    @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
    public final void a() {
        super.a();
        h hVar = this.b;
        if (hVar == null || this.h) {
            return;
        }
        this.h = true;
        hVar.a();
    }

    @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
    public final void a(boolean z, com.anythink.expressad.videocommon.c.c cVar) {
        super.a(z, cVar);
        h hVar = this.b;
        if (hVar == null || this.j) {
            return;
        }
        this.j = true;
        hVar.a(z, cVar);
    }

    @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
    public final void a(boolean z, int i) {
        super.a(z, i);
        h hVar = this.b;
        if (hVar == null || this.j) {
            return;
        }
        hVar.a(z, i);
    }

    @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
    public final void a(String str) {
        super.a(str);
        h hVar = this.b;
        if (hVar == null || this.i) {
            return;
        }
        this.i = true;
        hVar.a(str);
    }

    @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
    public final void a(com.anythink.expressad.foundation.d.c cVar) {
        super.a(cVar);
        h hVar = this.b;
        if (hVar != null) {
            hVar.a(cVar);
        }
    }
}