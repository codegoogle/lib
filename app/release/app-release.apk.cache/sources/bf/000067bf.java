package com.p7700g.p99005;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-measurement-connector@@19.0.0 */
/* loaded from: classes3.dex */
public interface yn2 {

    /* compiled from: com.google.firebase:firebase-measurement-connector@@19.0.0 */
    @KeepForSdk
    /* loaded from: classes3.dex */
    public interface a {
        @KeepForSdk
        void a();

        @KeepForSdk
        void b();

        @KeepForSdk
        void c(@x1 Set<String> set);
    }

    /* compiled from: com.google.firebase:firebase-measurement-connector@@19.0.0 */
    @KeepForSdk
    /* loaded from: classes3.dex */
    public interface b {
        @KeepForSdk
        void a(int i, @z1 Bundle bundle);
    }

    /* compiled from: com.google.firebase:firebase-measurement-connector@@19.0.0 */
    @KeepForSdk
    /* loaded from: classes3.dex */
    public static class c {
        @x1
        @KeepForSdk
        public String a;
        @x1
        @KeepForSdk
        public String b;
        @KeepForSdk
        @z1
        public Object c;
        @KeepForSdk
        @z1
        public String d;
        @KeepForSdk
        public long e;
        @KeepForSdk
        @z1
        public String f;
        @KeepForSdk
        @z1
        public Bundle g;
        @KeepForSdk
        @z1
        public String h;
        @KeepForSdk
        @z1
        public Bundle i;
        @KeepForSdk
        public long j;
        @KeepForSdk
        @z1
        public String k;
        @KeepForSdk
        @z1
        public Bundle l;
        @KeepForSdk
        public long m;
        @KeepForSdk
        public boolean n;
        @KeepForSdk
        public long o;
    }

    @x1
    @KeepForSdk
    @s2
    Map<String, Object> a(boolean z);

    @KeepForSdk
    void b(@x1 c cVar);

    @KeepForSdk
    void c(@x1 String str, @x1 String str2, @z1 Bundle bundle);

    @KeepForSdk
    void clearConditionalUserProperty(@x1 @j2(max = 24, min = 1) String str, @z1 String str2, @z1 Bundle bundle);

    @KeepForSdk
    @s2
    int d(@x1 @j2(min = 1) String str);

    @x1
    @KeepForSdk
    @s2
    List<c> e(@x1 String str, @j2(max = 23, min = 1) @z1 String str2);

    @KeepForSdk
    void f(@x1 String str, @x1 String str2, @x1 Object obj);

    @ao2
    @KeepForSdk
    @z1
    a g(@x1 String str, @x1 b bVar);
}