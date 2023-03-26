package com.p7700g.p99005;

import android.view.View;
import android.widget.PopupMenu;

/* compiled from: PopupMenuCompat.java */
/* loaded from: classes.dex */
public final class kt {

    /* compiled from: PopupMenuCompat.java */
    @e2(19)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static View.OnTouchListener a(PopupMenu popupMenu) {
            return popupMenu.getDragToOpenListener();
        }
    }

    private kt() {
    }

    @z1
    public static View.OnTouchListener a(@x1 Object obj) {
        return a.a((PopupMenu) obj);
    }
}