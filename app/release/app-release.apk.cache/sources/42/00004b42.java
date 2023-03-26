package com.p7700g.p99005;

import android.widget.ListView;

/* compiled from: ListViewCompat.java */
/* loaded from: classes.dex */
public final class jt {

    /* compiled from: ListViewCompat.java */
    @e2(19)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static boolean a(ListView listView, int i) {
            return listView.canScrollList(i);
        }

        @e1
        public static void b(ListView listView, int i) {
            listView.scrollListBy(i);
        }
    }

    private jt() {
    }

    public static boolean a(@x1 ListView listView, int i) {
        return a.a(listView, i);
    }

    public static void b(@x1 ListView listView, int i) {
        a.b(listView, i);
    }
}