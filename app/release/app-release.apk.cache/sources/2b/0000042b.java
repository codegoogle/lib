package com.anythink.basead.a;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class e {
    public static int a(Context context, com.anythink.core.common.e.i iVar) {
        int y = iVar.y();
        if (y != 1 && y != 4) {
            return com.anythink.core.common.j.h.a(context, "myoffer_cta_learn_more", "string");
        }
        return com.anythink.core.common.j.h.a(context, "myoffer_cta_install_now", "string");
    }

    private static boolean a(com.anythink.core.common.e.i iVar) {
        return (TextUtils.isEmpty(iVar.o()) && TextUtils.isEmpty(iVar.m()) && TextUtils.isEmpty(iVar.n())) ? false : true;
    }
}