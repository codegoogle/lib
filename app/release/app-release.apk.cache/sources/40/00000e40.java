package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.anythink.expressad.d.a.b;
import com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.4B  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C4B {
    public static String[] A06;
    public AnonymousClass49 A04 = null;
    public ArrayList<RecyclerView.ItemAnimator.ItemAnimatorFinishedListener> A05 = new ArrayList<>();
    public long A00 = 120;
    public long A03 = 120;
    public long A02 = 250;
    public long A01 = 250;

    static {
        A02();
    }

    public static void A02() {
        A06 = new String[]{"wCFFy4v0UHolBGzubHhtaTK0KlaK5TU8", "WXL", "veTi", b.Y, "rW28yUWMMTgiQlEcIz6smwE3e87Fn5Ax", "QU5acghFPGL2KQJts4swUt9W5A9MK8iM", "qIZlYUWuFA6tmX766BSANKSPkXlWbMWT", "RhPzJuizv3JTUr3AZhw4zLdz5ZpO"};
    }

    public abstract void A0C();

    public abstract void A0D();

    public abstract void A0E(C4X c4x);

    public abstract boolean A0F();

    public abstract boolean A0I(@NonNull C4X c4x, @Nullable C4A c4a, @NonNull C4A c4a2);

    public abstract boolean A0J(@NonNull C4X c4x, @NonNull C4A c4a, @Nullable C4A c4a2);

    public abstract boolean A0K(@NonNull C4X c4x, @NonNull C4A c4a, @NonNull C4A c4a2);

    public abstract boolean A0L(@NonNull C4X c4x, @NonNull C4X c4x2, @NonNull C4A c4a, @NonNull C4A c4a2);

    public static int A00(C4X c4x) {
        int i;
        i = c4x.A0C;
        int pos = i & 14;
        if (c4x.A0c()) {
            return 4;
        }
        if ((pos & 4) == 0) {
            int A0K = c4x.A0K();
            int A0H = c4x.A0H();
            String[] strArr = A06;
            String str = strArr[3];
            String str2 = strArr[1];
            int length = str.length();
            int oldPos = str2.length();
            if (length != oldPos) {
                String[] strArr2 = A06;
                strArr2[0] = "z6mPnscAmNwlAliMzxZ9cFQDVALsWjfG";
                strArr2[0] = "z6mPnscAmNwlAliMzxZ9cFQDVALsWjfG";
                if (A0K != -1 && A0H != -1 && A0K != A0H) {
                    return pos | 2048;
                }
                return pos;
            }
            throw new RuntimeException();
        }
        return pos;
    }

    private final C4A A01() {
        return new C4A();
    }

    public final long A03() {
        return this.A00;
    }

    public final long A04() {
        return this.A01;
    }

    public final long A05() {
        return this.A02;
    }

    public final long A06() {
        return this.A03;
    }

    @NonNull
    public final C4A A07(@NonNull C4U c4u, @NonNull C4X c4x) {
        return A01().A01(c4x);
    }

    @NonNull
    public final C4A A08(@NonNull C4U c4u, @NonNull C4X c4x, int i, @NonNull List<Object> list) {
        return A01().A01(c4x);
    }

    public final void A09() {
        int i = this.A05.size();
        if (0 < i) {
            this.A05.get(0);
            throw null;
        } else {
            this.A05.clear();
        }
    }

    public final void A0A(AnonymousClass49 anonymousClass49) {
        this.A04 = anonymousClass49;
    }

    public final void A0B(C4X c4x) {
        AnonymousClass49 anonymousClass49 = this.A04;
        if (anonymousClass49 != null) {
            anonymousClass49.A8r(c4x);
        }
    }

    public boolean A0G(@NonNull C4X c4x, @NonNull List<Object> list) {
        return A0H(c4x);
    }

    public boolean A0H(@NonNull C4X c4x) {
        return true;
    }
}