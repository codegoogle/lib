package com.p7700g.p99005;

import android.content.Context;
import android.os.Build;
import android.telephony.mbms.ServiceInfo;
import java.util.Locale;
import java.util.Set;

/* compiled from: MbmsHelper.java */
/* loaded from: classes.dex */
public final class yn {

    /* compiled from: MbmsHelper.java */
    @e2(28)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        public static CharSequence a(Context context, ServiceInfo serviceInfo) {
            Set<Locale> namedContentLocales = serviceInfo.getNamedContentLocales();
            if (namedContentLocales.isEmpty()) {
                return null;
            }
            String[] strArr = new String[namedContentLocales.size()];
            int i = 0;
            for (Locale locale : serviceInfo.getNamedContentLocales()) {
                strArr[i] = locale.toLanguageTag();
                i++;
            }
            Locale firstMatch = context.getResources().getConfiguration().getLocales().getFirstMatch(strArr);
            if (firstMatch == null) {
                return null;
            }
            return serviceInfo.getNameForLocale(firstMatch);
        }
    }

    private yn() {
    }

    @z1
    public static CharSequence a(@x1 Context context, @x1 ServiceInfo serviceInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.a(context, serviceInfo);
        }
        return null;
    }
}