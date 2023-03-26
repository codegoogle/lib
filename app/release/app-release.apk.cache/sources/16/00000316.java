package com.anchorfree.sdk;

import android.os.Bundle;
import com.p7700g.p99005.b21;
import com.p7700g.p99005.c81;
import com.p7700g.p99005.k81;
import com.p7700g.p99005.o51;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import com.p7700g.p99005.z11;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class HydraTransportInitProvider extends z11 {
    public static final String s = "transport:hydra";

    @Override // android.content.ContentProvider
    @z1
    public Bundle call(@x1 String str, @z1 String str2, @z1 Bundle bundle) {
        new o51(Executors.newSingleThreadExecutor(), new c81(getContext())).y0(s, k81.d(b21.class, new Object[0]));
        return super.call(str, str2, bundle);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }
}