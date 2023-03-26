package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.8H  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C8H extends ContextWrapper {
    public final C8J A00;
    public final AtomicReference<String> A01;

    public C8H(Context context, C8J c8j) {
        super(context.getApplicationContext());
        this.A01 = new AtomicReference<>();
        this.A00 = c8j;
    }

    public final C1081Wi A00() {
        C1081Wi A00 = C8G.A00();
        if (A00 == null) {
            C1081Wi c1081Wi = new C1081Wi(this, this.A00);
            C8G.A01(c1081Wi);
            return c1081Wi;
        }
        return A00;
    }

    public final C8I A01() {
        return this.A00.A5V(this);
    }

    public final C8K A02() {
        return this.A00.A68(this);
    }

    public final C8L A03() {
        return this.A00.A6r(this);
    }

    public final InterfaceC04838h A04() {
        return this.A00.A5z(this);
    }

    public final AnonymousClass97 A05() {
        return this.A00.A6x();
    }

    public final JE A06() {
        return this.A00.A5H(A00());
    }

    @Nullable
    public final String A07() {
        return this.A01.get();
    }

    public final void A08(@Nullable String str) {
        this.A01.set(str);
    }
}