package com.anythink.expressad.f.a;

import android.os.CountDownTimer;

/* loaded from: classes2.dex */
public final class b {
    private static final long a = 1000;
    private long b = 0;
    private long c;
    private com.anythink.expressad.f.a.a d;
    private a e;

    /* loaded from: classes2.dex */
    public static class a extends CountDownTimer {
        private com.anythink.expressad.f.a.a a;

        public a(long j, long j2) {
            super(j, j2);
        }

        public final void a(com.anythink.expressad.f.a.a aVar) {
            this.a = aVar;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
        }
    }

    private b a(long j) {
        if (j < 0) {
            j = 1000;
        }
        this.c = j;
        return this;
    }

    private b b(long j) {
        this.b = j;
        return this;
    }

    private void c() {
        a aVar = this.e;
        if (aVar != null) {
            aVar.cancel();
            this.e = null;
        }
    }

    private b a(com.anythink.expressad.f.a.a aVar) {
        this.d = aVar;
        return this;
    }

    private void b() {
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

    private void a() {
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
}