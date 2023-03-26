package com.anythink.expressad.foundation.g.i;

import android.media.MediaPlayer;

/* loaded from: classes2.dex */
public final class b {
    private String b;
    private MediaPlayer c;
    private volatile boolean d;
    private volatile MediaPlayer.OnPreparedListener f;
    public Object a = new Object();
    private volatile boolean e = false;

    private boolean c() {
        boolean z;
        synchronized (this.a) {
            z = this.d;
        }
        return z;
    }

    private String d() {
        return this.b;
    }

    public final void a(MediaPlayer mediaPlayer, String str) {
        this.c = mediaPlayer;
        this.b = str;
        this.d = true;
        this.c.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.anythink.expressad.foundation.g.i.b.1
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                synchronized (b.this.a) {
                    b.this.e = true;
                    if (b.this.f != null) {
                        b.this.f.onPrepared(mediaPlayer2);
                    }
                }
            }
        });
        try {
            this.c.prepareAsync();
        } catch (Throwable unused) {
        }
    }

    public final MediaPlayer b() {
        return this.c;
    }

    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            z = this.e;
        }
        return z;
    }

    public final void a(MediaPlayer.OnPreparedListener onPreparedListener) {
        synchronized (this.a) {
            this.f = onPreparedListener;
        }
    }
}