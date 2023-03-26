package com.p7700g.p99005;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.consent_sdk.zzbx;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes3.dex */
public class ym2 {
    private final boolean a;
    private final int b;

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
    /* loaded from: classes3.dex */
    public static class a {
        private final Context b;
        private boolean d;
        private final List<String> a = new ArrayList();
        private int c = 0;

        public a(@RecentlyNonNull Context context) {
            this.b = context.getApplicationContext();
        }

        @RecentlyNonNull
        public a a(@RecentlyNonNull String str) {
            this.a.add(str);
            return this;
        }

        @RecentlyNonNull
        public ym2 b() {
            Context context = this.b;
            List<String> list = this.a;
            boolean z = true;
            if (!zzbx.zzb() && !list.contains(zzbx.zza(context)) && !this.d) {
                z = false;
            }
            return new ym2(z, this, null);
        }

        @RecentlyNonNull
        public a c(int i) {
            this.c = i;
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        public a d(boolean z) {
            this.d = z;
            return this;
        }
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface b {
        public static final int j0 = 0;
        public static final int k0 = 1;
        public static final int l0 = 2;
    }

    public /* synthetic */ ym2(boolean z, a aVar, en2 en2Var) {
        this.a = z;
        this.b = aVar.c;
    }

    public int a() {
        return this.b;
    }

    public boolean b() {
        return this.a;
    }
}