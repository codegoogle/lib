package com.p7700g.p99005;

import android.app.Dialog;
import android.os.Build;
import android.view.View;

/* compiled from: DialogCompat.java */
/* loaded from: classes.dex */
public class cg {

    /* compiled from: DialogCompat.java */
    @e2(28)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static <T> T a(Dialog dialog, int i) {
            return (T) dialog.requireViewById(i);
        }
    }

    private cg() {
    }

    @x1
    public static View a(@x1 Dialog dialog, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) a.a(dialog, i);
        }
        View findViewById = dialog.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Dialog");
    }
}