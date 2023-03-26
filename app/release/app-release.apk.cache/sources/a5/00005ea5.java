package com.p7700g.p99005;

import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;

/* compiled from: MenuCompat.java */
/* loaded from: classes.dex */
public final class tq {

    /* compiled from: MenuCompat.java */
    @e2(28)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static void a(Menu menu, boolean z) {
            menu.setGroupDividerEnabled(z);
        }
    }

    private tq() {
    }

    public static void a(@x1 Menu menu, boolean z) {
        if (menu instanceof tk) {
            ((tk) menu).setGroupDividerEnabled(z);
        } else if (Build.VERSION.SDK_INT >= 28) {
            a.a(menu, z);
        }
    }

    @Deprecated
    public static void b(MenuItem menuItem, int i) {
        menuItem.setShowAsAction(i);
    }
}