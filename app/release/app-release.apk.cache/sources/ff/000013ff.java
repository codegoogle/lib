package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Sl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0980Sl extends C4B {
    public static String[] A01;
    public boolean A00 = true;

    static {
        A08();
    }

    public static void A08() {
        A01 = new String[]{"ufm8s7LRmOM7", "sIBwdoM05ajejE", "0NxvrnR7UZDHrBy4xVhLU5lsqzWJ5R3x", "FsILnIqpIa8iE3wffvJrO4tNlZdDmpUd", "wKnqjXSh8f61FKWyknAGi8xlXXoDdiLA", "lpMPMGmveEx5YZPPZgDkriuB4nzdouJK", "fQPzW90JHWOApVaaQbndX59CGXgCnXlm", "Pp9SKBa6RS3IfLIGXA9e4oeVKGHa5CsE"};
    }

    public abstract boolean A0U(C4X c4x);

    public abstract boolean A0V(C4X c4x);

    public abstract boolean A0W(C4X c4x, int i, int i2, int i3, int i4);

    public abstract boolean A0X(C4X c4x, C4X c4x2, int i, int i2, int i3, int i4);

    @Override // com.facebook.ads.redexgen.X.C4B
    public final boolean A0H(@NonNull C4X c4x) {
        return !this.A00 || c4x.A0c();
    }

    @Override // com.facebook.ads.redexgen.X.C4B
    public final boolean A0I(@NonNull C4X c4x, @Nullable C4A c4a, @NonNull C4A c4a2) {
        if (c4a != null && (c4a.A01 != c4a2.A01 || c4a.A03 != c4a2.A03)) {
            return A0W(c4x, c4a.A01, c4a.A03, c4a2.A01, c4a2.A03);
        }
        return A0U(c4x);
    }

    @Override // com.facebook.ads.redexgen.X.C4B
    public final boolean A0J(@NonNull C4X c4x, @NonNull C4A c4a, @Nullable C4A c4a2) {
        int i = c4a.A01;
        int i2 = c4a.A03;
        View view = c4x.A0H;
        int left = c4a2 == null ? view.getLeft() : c4a2.A01;
        int newLeft = c4a2 == null ? view.getTop() : c4a2.A03;
        if (!c4x.A0d() && (i != left || i2 != newLeft)) {
            view.layout(left, newLeft, view.getWidth() + left, view.getHeight() + newLeft);
            return A0W(c4x, i, i2, left, newLeft);
        }
        return A0V(c4x);
    }

    @Override // com.facebook.ads.redexgen.X.C4B
    public final boolean A0K(@NonNull C4X c4x, @NonNull C4A c4a, @NonNull C4A c4a2) {
        if (c4a.A01 != c4a2.A01 || c4a.A03 != c4a2.A03) {
            return A0W(c4x, c4a.A01, c4a.A03, c4a2.A01, c4a2.A03);
        }
        A0O(c4x);
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C4B
    public final boolean A0L(@NonNull C4X c4x, @NonNull C4X c4x2, @NonNull C4A c4a, @NonNull C4A c4a2) {
        int fromTop;
        int toLeft;
        int i = c4a.A01;
        int i2 = c4a.A03;
        if (c4x2.A0i()) {
            fromTop = c4a.A01;
            toLeft = c4a.A03;
        } else {
            fromTop = c4a2.A01;
            toLeft = c4a2.A03;
        }
        if (A01[1].length() != 14) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[1] = "7F8ns227Orjao7";
        strArr[1] = "7F8ns227Orjao7";
        return A0X(c4x, c4x2, i, i2, fromTop, toLeft);
    }

    public final void A0M(C4X c4x) {
        A0B(c4x);
    }

    public final void A0N(C4X c4x) {
    }

    public final void A0O(C4X c4x) {
        A0B(c4x);
    }

    public final void A0P(C4X c4x) {
    }

    public final void A0Q(C4X c4x) {
        A0B(c4x);
    }

    public final void A0R(C4X c4x) {
    }

    public final void A0S(C4X c4x, boolean z) {
        A0B(c4x);
    }

    public final void A0T(C4X c4x, boolean z) {
    }
}