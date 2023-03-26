package com.anythink.network.myoffer;

import android.content.Context;
import com.anythink.basead.f.a.a;
import com.anythink.basead.f.a.b;
import com.anythink.core.common.e.r;
import com.anythink.core.common.e.s;

/* loaded from: classes2.dex */
public class MyOfferAPI {
    public static boolean checkOffersOutOfCap(Context context, String str) {
        return b.a(context).a(str);
    }

    public static String getCacheOfferIds(Context context, String str, s sVar) {
        return a.a(context).a(str, sVar);
    }

    public static String getDefaultOfferId(Context context, String str) {
        return a.a(context).b(str);
    }

    public static String getOutOfCapOfferIds(Context context) {
        return b.a(context).a();
    }

    public static void preloadTopOnOffer(Context context, r rVar) {
        a.a(context).a(rVar.a);
    }
}