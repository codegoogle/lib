package com.anythink.expressad.video.module.a.a;

import com.anythink.expressad.video.module.AnythinkVideoView;
import java.util.Map;

/* loaded from: classes2.dex */
public class o extends k {
    private boolean af;
    public int ag;
    private boolean ah;
    private boolean ai;
    private boolean aj;
    private boolean ak;
    private Map<Integer, String> al;
    private int am;

    public o(com.anythink.expressad.foundation.d.c cVar, com.anythink.expressad.videocommon.c.c cVar2, com.anythink.expressad.videocommon.b.a aVar, String str, String str2, com.anythink.expressad.video.module.a.a aVar2, int i, boolean z) {
        super(cVar, aVar, cVar2, str, str2, aVar2, i, z);
        this.ak = false;
        this.ag = 0;
        this.am = -1;
        if (this.W) {
            this.al = cVar.Q();
        }
        this.ag = cVar.i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0019, code lost:
        if (r8 != 16) goto L16;
     */
    @Override // com.anythink.expressad.video.module.a.a.k, com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(int i, Object obj) {
        int i2;
        com.anythink.expressad.foundation.d.c cVar;
        try {
            if (i != 2 && i != 6) {
                if (i != 7) {
                    int i3 = 0;
                    if (i == 11) {
                        com.anythink.expressad.videocommon.b.c.a().a(false);
                        b();
                    } else if (i == 12) {
                        b();
                        g();
                        com.anythink.expressad.videocommon.b.c.a().a(false);
                    } else if (i == 15) {
                        e();
                        d();
                        c();
                        if (obj == null || !(obj instanceof AnythinkVideoView.a)) {
                            i2 = 0;
                        } else {
                            int i4 = ((AnythinkVideoView.a) obj).a;
                            i3 = ((AnythinkVideoView.a) obj).b;
                            i2 = i4;
                        }
                        if (i3 == 0 && (cVar = this.X) != null) {
                            i3 = cVar.bi();
                        }
                        com.anythink.expressad.video.module.b.a.a(com.anythink.core.common.b.m.a().e(), this.X, i2, i3, this.ae);
                        com.anythink.expressad.video.module.b.a.a(this.X, this.al, this.ab, i2);
                        if (!this.aj) {
                            this.aj = true;
                            com.anythink.expressad.video.module.b.a.a(this.X, this.ab);
                        }
                        if (!this.ak) {
                            int i5 = this.ag;
                            if (i5 != 0) {
                                i3 = i5;
                            }
                            if (i2 >= i3) {
                                this.ak = true;
                                i = 17;
                            }
                        }
                        this.am = i2;
                    }
                } else if (this.W && obj != null && (obj instanceof Integer)) {
                    int intValue = ((Integer) obj).intValue();
                    if (intValue == 2) {
                        if (!this.ah) {
                            this.ah = true;
                            com.anythink.expressad.video.module.b.a.b(com.anythink.core.common.b.m.a().e(), this.X);
                        }
                    } else if (intValue == 1 && !this.af) {
                        this.af = true;
                        com.anythink.expressad.video.module.b.a.c(com.anythink.core.common.b.m.a().e(), this.X);
                    }
                }
                this.ad.a(i, obj);
            }
            if (this.W && !this.ai) {
                this.ai = true;
                b();
                com.anythink.expressad.video.module.b.a.d(com.anythink.core.common.b.m.a().e(), this.X);
            }
            this.ad.a(i, obj);
        } catch (Throwable th) {
            com.anythink.expressad.foundation.h.n.b(f.U, th.getMessage(), th);
        }
    }
}