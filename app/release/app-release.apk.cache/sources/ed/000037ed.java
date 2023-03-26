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
public class NovaHomeBadger implements fp3 {
    private static final String a = "content://com.teslacoilsw.notifier/unread_count";
    private static final String b = "count";
    private static final String c = "tag";

    @Override // com.p7700g.p99005.fp3
    public List<String> a() {
        return Arrays.asList("com.teslacoilsw.launcher");
    }

    @Override // com.p7700g.p99005.fp3
    public void b(Context context, ComponentName componentName, int i) throws gp3 {
        ContentValues contentValues = new ContentValues();
        contentValues.put(c, componentName.getPackageName() + "/" + componentName.getClassName());
        contentValues.put("count", Integer.valueOf(i));
        context.getContentResolver().insert(Uri.parse(a), contentValues);
    }
}