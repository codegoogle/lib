package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.p7700g.p99005.fp3;
import com.p7700g.p99005.gp3;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class EverythingMeHomeBadger implements fp3 {
    private static final String a = "content://me.everything.badger/apps";
    private static final String b = "package_name";
    private static final String c = "activity_name";
    private static final String d = "count";

    @Override // com.p7700g.p99005.fp3
    public List<String> a() {
        return Arrays.asList("me.everything.launcher");
    }

    @Override // com.p7700g.p99005.fp3
    public void b(Context context, ComponentName componentName, int i) throws gp3 {
        ContentValues contentValues = new ContentValues();
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put(c, componentName.getClassName());
        contentValues.put("count", Integer.valueOf(i));
        context.getContentResolver().insert(Uri.parse(a), contentValues);
    }
}