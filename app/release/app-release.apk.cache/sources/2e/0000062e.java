package com.anythink.core.common.d;

import android.content.Context;

/* loaded from: classes2.dex */
public final class c extends a {
    public static a c;

    private c(Context context) {
        super(context);
        this.b = 1;
    }

    public static synchronized a a(Context context) {
        a aVar;
        synchronized (c.class) {
            if (c == null) {
                c = new c(context);
            }
            aVar = c;
        }
        return aVar;
    }
}