package com.p7700g.p99005;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* compiled from: FirstFrameAndAfterTrimMemoryWaiter.java */
@e2(26)
/* loaded from: classes2.dex */
public final class sx1 implements ux1, ComponentCallbacks2 {
    @Override // com.p7700g.p99005.ux1
    public void a(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@x1 Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(20);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
    }
}