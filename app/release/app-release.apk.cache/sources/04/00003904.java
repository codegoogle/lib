package com.p7700g.p99005;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import com.p7700g.p99005.cj;

/* compiled from: BlendModeColorFilterCompat.java */
/* loaded from: classes.dex */
public class aj {

    /* compiled from: BlendModeColorFilterCompat.java */
    @e2(29)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static ColorFilter a(int i, Object obj) {
            return new BlendModeColorFilter(i, (BlendMode) obj);
        }
    }

    private aj() {
    }

    @z1
    public static ColorFilter a(int i, @x1 bj bjVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object a2 = cj.b.a(bjVar);
            if (a2 != null) {
                return a.a(i, a2);
            }
            return null;
        }
        PorterDuff.Mode a3 = cj.a(bjVar);
        if (a3 != null) {
            return new PorterDuffColorFilter(i, a3);
        }
        return null;
    }
}