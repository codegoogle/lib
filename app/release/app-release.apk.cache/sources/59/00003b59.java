package com.p7700g.p99005;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes3.dex */
public class bn2 {
    private final boolean a;
    @z1
    private final String b;
    @z1
    private final ym2 c;

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
    /* loaded from: classes3.dex */
    public static final class a {
        private boolean a;
        @z1
        private String b;
        @z1
        private ym2 c;

        @RecentlyNonNull
        public bn2 a() {
            return new bn2(this, null);
        }

        @RecentlyNonNull
        @KeepForSdk
        public a b(@z1 String str) {
            this.b = str;
            return this;
        }

        @RecentlyNonNull
        public a c(@z1 ym2 ym2Var) {
            this.c = ym2Var;
            return this;
        }

        @RecentlyNonNull
        public a d(boolean z) {
            this.a = z;
            return this;
        }
    }

    public /* synthetic */ bn2(a aVar, fn2 fn2Var) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
    }

    @RecentlyNullable
    public ym2 a() {
        return this.c;
    }

    public boolean b() {
        return this.a;
    }

    @RecentlyNullable
    public final String c() {
        return this.b;
    }
}