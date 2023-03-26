package com.p7700g.p99005;

import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes3.dex */
public class cn2 {
    private final int a;
    private final String b;

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface a {
        public static final int q0 = 1;
        public static final int r0 = 2;
        public static final int s0 = 3;
        public static final int t0 = 4;
    }

    public cn2(int i, @RecentlyNonNull String str) {
        this.a = i;
        this.b = str;
    }

    public int a() {
        return this.a;
    }

    @RecentlyNonNull
    public String b() {
        return this.b;
    }
}