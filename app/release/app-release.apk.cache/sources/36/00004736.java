package com.p7700g.p99005;

import android.view.View;
import android.widget.ListPopupWindow;

/* compiled from: ListPopupWindowCompat.java */
/* loaded from: classes.dex */
public final class ht {

    /* compiled from: ListPopupWindowCompat.java */
    @e2(19)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static View.OnTouchListener a(ListPopupWindow listPopupWindow, View view) {
            return listPopupWindow.createDragToOpenListener(view);
        }
    }

    private ht() {
    }

    @z1
    public static View.OnTouchListener a(@x1 ListPopupWindow listPopupWindow, @x1 View view) {
        return a.a(listPopupWindow, view);
    }

    @Deprecated
    public static View.OnTouchListener b(Object obj, View view) {
        return a((ListPopupWindow) obj, view);
    }
}