package com.onesignal.shortcutbadger.impl;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.p7700g.p99005.fp3;
import com.p7700g.p99005.gp3;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class HuaweiHomeBadger implements fp3 {
    @Override // com.p7700g.p99005.fp3
    public List<String> a() {
        return Arrays.asList("com.huawei.android.launcher");
    }

    @Override // com.p7700g.p99005.fp3
    @SuppressLint({"NewApi"})
    public void b(Context context, ComponentName componentName, int i) throws gp3 {
        Bundle bundle = new Bundle();
        bundle.putString("package", context.getPackageName());
        bundle.putString("class", componentName.getClassName());
        bundle.putInt("badgenumber", i);
        context.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, bundle);
    }
}