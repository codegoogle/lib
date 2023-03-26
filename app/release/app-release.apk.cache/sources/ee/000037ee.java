package com.onesignal.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.p7700g.p99005.fp3;
import com.p7700g.p99005.gp3;
import com.p7700g.p99005.ip3;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class OPPOHomeBader implements fp3 {
    private static final String a = "content://com.android.badge/badge";
    private static final String b = "com.oppo.unsettledevent";
    private static final String c = "pakeageName";
    private static final String d = "number";
    private static final String e = "upgradeNumber";
    private static final String f = "app_badge_count";
    private int g = -1;

    private void c(Context context, ComponentName componentName, int i) throws gp3 {
        if (i == 0) {
            i = -1;
        }
        Intent intent = new Intent(b);
        intent.putExtra(c, componentName.getPackageName());
        intent.putExtra(d, i);
        intent.putExtra(e, i);
        ip3.c(context, intent);
    }

    @TargetApi(11)
    private void d(Context context, int i) throws gp3 {
        Bundle bundle = new Bundle();
        bundle.putInt(f, i);
        context.getContentResolver().call(Uri.parse(a), "setAppBadgeCount", (String) null, bundle);
    }

    @Override // com.p7700g.p99005.fp3
    public List<String> a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    @Override // com.p7700g.p99005.fp3
    public void b(Context context, ComponentName componentName, int i) throws gp3 {
        if (this.g == i) {
            return;
        }
        this.g = i;
        d(context, i);
    }
}