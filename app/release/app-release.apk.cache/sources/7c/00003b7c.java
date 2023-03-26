package com.p7700g.p99005;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-iid-interop@@17.1.0 */
@KeepForSdk
/* loaded from: classes3.dex */
public interface br2 {

    /* compiled from: com.google.firebase:firebase-iid-interop@@17.1.0 */
    @KeepForSdk
    /* loaded from: classes3.dex */
    public interface a {
        @KeepForSdk
        void a(String str);
    }

    @KeepForSdk
    void a(@x1 String str, @x1 String str2) throws IOException;

    @x1
    @KeepForSdk
    Task<String> b();

    @KeepForSdk
    void c(a aVar);

    @KeepForSdk
    @z1
    String d();

    @KeepForSdk
    String getId();
}