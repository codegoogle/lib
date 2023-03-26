package com.onesignal.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.p7700g.p99005.fp3;
import com.p7700g.p99005.gp3;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class ZukHomeBadger implements fp3 {
    private final Uri a = Uri.parse("content://com.android.badge/badge");

    @Override // com.p7700g.p99005.fp3
    public List<String> a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @Override // com.p7700g.p99005.fp3
    @TargetApi(11)
    public void b(Context context, ComponentName componentName, int i) throws gp3 {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        context.getContentResolver().call(this.a, "setAppBadgeCount", (String) null, bundle);
    }
}