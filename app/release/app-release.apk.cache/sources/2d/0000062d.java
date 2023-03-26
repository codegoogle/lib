package com.anythink.core.common.d;

import android.content.Context;

/* loaded from: classes2.dex */
public final class b extends a {
    public static a c;

    private b(Context context) {
        super(context);
        this.b = 2;
    }

    public static synchronized a a(Context context) {
        a aVar;
        synchronized (b.class) {
            if (c == null) {
                c = new b(context);
            }
            aVar = c;
        }
        return aVar;
    }
}