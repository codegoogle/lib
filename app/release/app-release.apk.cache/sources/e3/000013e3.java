package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: assets/audience_network.dex */
public class SH extends C2Y {
    public static String[] A01;
    public final /* synthetic */ AnonymousClass38 A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"qdMAGnvFuVn0ea0M3RnyzUUMgxm0S2Dt", "2PeyHnmE0bX58Ffgk0gx7OXrgxltyZLW", "2int", "nVrienaBQfkWnV6qIsNJmuY2fGTgVaBy", "EIAfoPo9YRxYx4hqHxVbjlkHHJjThpFm", "", "SPMlRY4DBSEQqdOiv1Q7wDslDeTbAa0F", "kfFOHzhabps7JVIWzUifit9US33gkwJk"};
    }

    public SH(AnonymousClass38 anonymousClass38) {
        this.A00 = anonymousClass38;
    }

    private boolean A01() {
        return this.A00.A01 != null && this.A00.A01.A05() > 1;
    }

    @Override // com.facebook.ads.redexgen.X.C2Y
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(AnonymousClass38.class.getName());
        accessibilityEvent.setScrollable(A01());
        if (accessibilityEvent.getEventType() == 4096 && this.A00.A01 != null) {
            accessibilityEvent.setItemCount(this.A00.A01.A05());
            accessibilityEvent.setFromIndex(this.A00.A00);
            accessibilityEvent.setToIndex(this.A00.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C2Y
    public final void A08(View view, C3J c3j) {
        super.A08(view, c3j);
        c3j.A0P(AnonymousClass38.class.getName());
        c3j.A0S(A01());
        if (this.A00.canScrollHorizontally(1)) {
            c3j.A0O(4096);
        }
        if (this.A00.canScrollHorizontally(-1)) {
            c3j.A0O(8192);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C2Y
    public final boolean A09(View view, int i, Bundle bundle) {
        if (super.A09(view, i, bundle)) {
            return true;
        }
        if (i != 4096) {
            if (i == 8192 && this.A00.canScrollHorizontally(-1)) {
                AnonymousClass38 anonymousClass38 = this.A00;
                anonymousClass38.setCurrentItem(anonymousClass38.A00 - 1);
                return true;
            }
            return false;
        }
        AnonymousClass38 anonymousClass382 = this.A00;
        String[] strArr = A01;
        if (strArr[3].charAt(13) != strArr[7].charAt(13)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[4] = "Vr8sNFSEZwclN9wLDYuYxTMloU2ohTqa";
        strArr2[4] = "Vr8sNFSEZwclN9wLDYuYxTMloU2ohTqa";
        if (anonymousClass382.canScrollHorizontally(1)) {
            AnonymousClass38 anonymousClass383 = this.A00;
            anonymousClass383.setCurrentItem(anonymousClass383.A00 + 1);
            return true;
        }
        return false;
    }
}