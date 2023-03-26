package com.p7700g.p99005;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;

/* compiled from: ConfigurationCompat.java */
/* loaded from: classes.dex */
public final class om {

    /* compiled from: ConfigurationCompat.java */
    @e2(24)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    private om() {
    }

    @x1
    public static um a(@x1 Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? um.n(a.a(configuration)) : um.a(configuration.locale);
    }
}