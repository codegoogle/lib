package com.anythink.basead.ui.a;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class a {
    public static void a(View view, boolean z, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (z) {
            layoutParams.width = 0;
        }
        if (z2) {
            layoutParams.height = 0;
        }
        view.setLayoutParams(layoutParams);
    }
}