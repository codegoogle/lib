package com.p7700g.p99005;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p7700g.p99005.fb0;
import java.util.Locale;

/* compiled from: PageTransformerAdapter.java */
/* loaded from: classes.dex */
public final class db0 extends fb0.j {
    private final LinearLayoutManager a;
    private fb0.m b;

    public db0(LinearLayoutManager linearLayoutManager) {
        this.a = linearLayoutManager;
    }

    @Override // com.p7700g.p99005.fb0.j
    public void a(int i) {
    }

    @Override // com.p7700g.p99005.fb0.j
    public void b(int i, float f, int i2) {
        if (this.b == null) {
            return;
        }
        float f2 = -f;
        for (int i3 = 0; i3 < this.a.Q(); i3++) {
            View P = this.a.P(i3);
            if (P != null) {
                this.b.a(P, (this.a.s0(P) - i) + f2);
            } else {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i3), Integer.valueOf(this.a.Q())));
            }
        }
    }

    @Override // com.p7700g.p99005.fb0.j
    public void c(int i) {
    }

    public fb0.m d() {
        return this.b;
    }

    public void e(@z1 fb0.m mVar) {
        this.b = mVar;
    }
}