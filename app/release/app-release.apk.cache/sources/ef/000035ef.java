package com.ironsource.sdk.controller;

import android.media.AudioManager;
import com.ironsource.mediationsdk.model.e;
import com.ironsource.sdk.g.d;

/* loaded from: classes3.dex */
public class u {
    private e a;
    private com.ironsource.mediationsdk.model.q b;
    private com.ironsource.mediationsdk.utils.p c;
    private boolean d;
    private d e;
    private com.ironsource.mediationsdk.utils.b f;
    private com.ironsource.mediationsdk.model.d g;
    private com.ironsource.mediationsdk.utils.j h;
    private com.ironsource.mediationsdk.model.b i;

    /* loaded from: classes3.dex */
    public static class a implements Runnable {
        private /* synthetic */ AudioManager s;

        public a(AudioManager audioManager) {
            this.s = audioManager;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.s.abandonAudioFocus(null);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class b implements Runnable {
        private /* synthetic */ AudioManager s;

        public b(AudioManager audioManager) {
            this.s = audioManager;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.s.requestAudioFocus(null, 3, 2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public u() {
        this.a = new e();
    }

    public u(e eVar, com.ironsource.mediationsdk.model.q qVar, com.ironsource.mediationsdk.utils.p pVar, boolean z, d dVar, com.ironsource.mediationsdk.utils.b bVar, com.ironsource.mediationsdk.model.d dVar2, com.ironsource.mediationsdk.utils.j jVar, com.ironsource.mediationsdk.model.b bVar2) {
        this.a = eVar;
        this.b = qVar;
        this.c = pVar;
        this.d = z;
        this.e = dVar;
        this.f = bVar;
        this.g = dVar2;
        this.h = jVar;
        this.i = bVar2;
    }

    public e a() {
        return this.a;
    }

    public com.ironsource.mediationsdk.model.q b() {
        return this.b;
    }

    public com.ironsource.mediationsdk.utils.p c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public d e() {
        return this.e;
    }

    public com.ironsource.mediationsdk.utils.b f() {
        return this.f;
    }

    public com.ironsource.mediationsdk.model.d g() {
        return this.g;
    }

    public com.ironsource.mediationsdk.utils.j h() {
        return this.h;
    }

    public com.ironsource.mediationsdk.model.b i() {
        return this.i;
    }
}