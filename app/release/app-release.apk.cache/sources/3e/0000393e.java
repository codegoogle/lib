package com.p7700g.p99005;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes3.dex */
public interface an2 {

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface a {
        public static final int m0 = 0;
        public static final int n0 = 1;
        public static final int o0 = 2;
        public static final int p0 = 3;
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
    /* loaded from: classes3.dex */
    public interface b {
        void a(@RecentlyNonNull cn2 cn2Var);
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
    /* loaded from: classes3.dex */
    public interface c {
        void a();
    }

    int getConsentStatus();

    boolean isConsentFormAvailable();

    void requestConsentInfoUpdate(@RecentlyNonNull Activity activity, @RecentlyNonNull bn2 bn2Var, @RecentlyNonNull c cVar, @RecentlyNonNull b bVar);

    void reset();
}