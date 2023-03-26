package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi(19)
/* renamed from: com.facebook.ads.redexgen.X.3R  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3R {
    public static Object A00(final C3Q c3q) {
        return new AccessibilityNodeProvider() { // from class: com.facebook.ads.redexgen.X.3P
            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
                return (AccessibilityNodeInfo) C3Q.this.A4C(i);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
                return C3Q.this.A55(str, i);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final AccessibilityNodeInfo findFocus(int i) {
                return (AccessibilityNodeInfo) C3Q.this.A56(i);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final boolean performAction(int i, int i2, Bundle bundle) {
                return C3Q.this.ABb(i, i2, bundle);
            }
        };
    }
}