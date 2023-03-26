package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.p7700g.p99005.fp3;
import com.p7700g.p99005.gp3;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class VivoHomeBadger implements fp3 {
    @Override // com.p7700g.p99005.fp3
    public List<String> a() {
        return Arrays.asList("com.vivo.launcher");
    }

    @Override // com.p7700g.p99005.fp3
    public void b(Context context, ComponentName componentName, int i) throws gp3 {
        Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
        intent.putExtra("packageName", context.getPackageName());
        intent.putExtra("className", componentName.getClassName());
        intent.putExtra("notificationNum", i);
        context.sendBroadcast(intent);
    }
}