package com.anythink.expressad.video.dynview.h.c;

import android.os.CountDownTimer;

/* loaded from: classes2.dex */
public final class b {
    private static final long a = 1000;
    private long b = 0;
    private long c;
    private com.anythink.expressad.video.dynview.h.c.a d;
    private a e;

    /* loaded from: classes2.dex */
    public static class a extends CountDownTimer {
        private com.anythink.expressad.video.dynview.h.c.a a;

        public a(long j, long j2) {
            super(j, j2);
        }

        public final void a(com.anythink.expressad.video.dynview.h.c.a aVar) {
            this.a = aVar;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            com.anythink.expressad.video.dynview.h.c.a aVar = this.a;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
            com.anythink.expressad.video.dynview.h.c.a aVar = this.a;
            if (aVar != null) {
                aVar.a(j);
            }
        }
    }

    private void d() {
        a aVar = this.e;
        if (aVar != null) {
            aVar.cancel();
            this.e = null;
        }
        if (this.c <= 0) {
            this.c = this.b + 1000;
        }
        a aVar2 = new a(this.b, this.c);
        this.e = aVar2;
        aVar2.a(this.d);
    }

    public final b a() {
        this.c = 1000L;
        return this;
    }

    public final void b() {
        a aVar = this.e;
        if (aVar == null) {
            if (aVar != null) {
                aVar.cancel();
                this.e = null;
            }
            if (this.c <= 0) {
                this.c = this.b + 1000;
            }
            a aVar2 = new a(this.b, this.c);
            this.e = aVar2;
            aVar2.a(this.d);
        }
        this.e.start();
    }

    public final void c() {
        a aVar = this.e;
        if (aVar != null) {
            aVar.cancel();
            this.e = null;
        }
    }

    public final b a(com.anythink.expressad.video.dynview.h.c.a aVar) {
        this.d = aVar;
        return this;
    }

    public final b a(long j) {
        this.b = j;
        return this;
    }
}