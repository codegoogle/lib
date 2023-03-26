package com.p7700g.p99005;

import android.content.SharedPreferences;

/* compiled from: SharedPreferencesCompat.java */
@Deprecated
/* loaded from: classes.dex */
public final class qh {

    /* compiled from: SharedPreferencesCompat.java */
    @Deprecated
    /* loaded from: classes.dex */
    public static final class a {
        private static a a;
        private final C0232a b = new C0232a();

        /* compiled from: SharedPreferencesCompat.java */
        /* renamed from: com.p7700g.p99005.qh$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0232a {
            public void a(@x1 SharedPreferences.Editor editor) {
                try {
                    editor.apply();
                } catch (AbstractMethodError unused) {
                    editor.commit();
                }
            }
        }

        private a() {
        }

        @Deprecated
        public static a b() {
            if (a == null) {
                a = new a();
            }
            return a;
        }

        @Deprecated
        public void a(@x1 SharedPreferences.Editor editor) {
            this.b.a(editor);
        }
    }

    private qh() {
    }
}