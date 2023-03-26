package com.p7700g.p99005;

import android.content.ContentProvider;
import android.content.Context;

/* compiled from: ContentProviderCompat.java */
/* loaded from: classes.dex */
public final class dh {
    private dh() {
    }

    @x1
    public static Context a(@x1 ContentProvider contentProvider) {
        Context context = contentProvider.getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Cannot find context from the provider.");
    }
}