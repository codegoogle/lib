package com.p7700g.p99005;

import android.os.Bundle;

/* compiled from: TrustedWebActivityDisplayMode.java */
/* loaded from: classes.dex */
public interface y6 {
    public static final String a = "androidx.browser.trusted.displaymode.KEY_ID";

    /* compiled from: TrustedWebActivityDisplayMode.java */
    /* loaded from: classes.dex */
    public static class a implements y6 {
        private static final int b = 0;

        @Override // com.p7700g.p99005.y6
        @x1
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(y6.a, 0);
            return bundle;
        }
    }

    /* compiled from: TrustedWebActivityDisplayMode.java */
    /* loaded from: classes.dex */
    public static class b implements y6 {
        private static final int b = 1;
        public static final String c = "androidx.browser.trusted.displaymode.KEY_STICKY";
        public static final String d = "androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE";
        private final boolean e;
        private final int f;

        public b(boolean z, int i) {
            this.e = z;
            this.f = i;
        }

        @x1
        public static y6 a(@x1 Bundle bundle) {
            return new b(bundle.getBoolean(c), bundle.getInt(d));
        }

        public boolean b() {
            return this.e;
        }

        public int c() {
            return this.f;
        }

        @Override // com.p7700g.p99005.y6
        @x1
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(y6.a, 1);
            bundle.putBoolean(c, this.e);
            bundle.putInt(d, this.f);
            return bundle;
        }
    }

    @x1
    Bundle toBundle();
}