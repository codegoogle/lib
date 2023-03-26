package com.p7700g.p99005;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;

/* compiled from: ThemeUtils.java */
/* loaded from: classes3.dex */
public final class mc2 {
    private mc2() {
    }

    public static void a(@x1 Context context, @m2 int i) {
        Resources.Theme b;
        context.getTheme().applyStyle(i, true);
        if (!(context instanceof Activity) || (b = b((Activity) context)) == null) {
            return;
        }
        b.applyStyle(i, true);
    }

    @z1
    private static Resources.Theme b(@x1 Activity activity) {
        View peekDecorView;
        Context context;
        Window window = activity.getWindow();
        if (window == null || (peekDecorView = window.peekDecorView()) == null || (context = peekDecorView.getContext()) == null) {
            return null;
        }
        return context.getTheme();
    }
}