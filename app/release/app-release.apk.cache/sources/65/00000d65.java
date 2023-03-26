package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* renamed from: com.facebook.ads.redexgen.X.0b  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C02820b extends AnonymousClass18 {
    @Override // com.facebook.ads.redexgen.X.C03522t
    public final C3B A09(View view, C3B c3b) {
        WindowInsets windowInsets = (WindowInsets) C3B.A01(c3b);
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
        if (dispatchApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(dispatchApplyWindowInsets);
        }
        return C3B.A00(windowInsets);
    }

    @Override // com.facebook.ads.redexgen.X.C03522t
    public final C3B A0A(View view, C3B c3b) {
        WindowInsets windowInsets = (WindowInsets) C3B.A01(c3b);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (onApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(onApplyWindowInsets);
        }
        return C3B.A00(windowInsets);
    }

    @Override // com.facebook.ads.redexgen.X.C03522t
    public final void A0C(View view) {
        view.stopNestedScroll();
    }

    @Override // com.facebook.ads.redexgen.X.C03522t
    public final void A0F(View view, final InterfaceC03372e interfaceC03372e) {
        if (interfaceC03372e == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.ads.redexgen.X.2s
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    return (WindowInsets) C3B.A01(interfaceC03372e.A8s(view2, C3B.A00(windowInsets)));
                }
            });
        }
    }
}