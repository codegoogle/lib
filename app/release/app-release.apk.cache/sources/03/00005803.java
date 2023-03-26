package com.p7700g.p99005;

import android.graphics.Typeface;
import com.p7700g.p99005.i2;

/* compiled from: CancelableFontCallback.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class qg2 extends vg2 {
    private final Typeface a;
    private final a b;
    private boolean c;

    /* compiled from: CancelableFontCallback.java */
    /* loaded from: classes3.dex */
    public interface a {
        void a(Typeface typeface);
    }

    public qg2(a aVar, Typeface typeface) {
        this.a = typeface;
        this.b = aVar;
    }

    private void d(Typeface typeface) {
        if (this.c) {
            return;
        }
        this.b.a(typeface);
    }

    @Override // com.p7700g.p99005.vg2
    public void a(int i) {
        d(this.a);
    }

    @Override // com.p7700g.p99005.vg2
    public void b(Typeface typeface, boolean z) {
        d(typeface);
    }

    public void c() {
        this.c = true;
    }
}