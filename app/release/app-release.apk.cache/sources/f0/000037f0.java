package com.onesignal.shortcutbadger.impl;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import com.p7700g.p99005.fp3;
import com.p7700g.p99005.gp3;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class SonyHomeBadger implements fp3 {
    private static final String a = "com.sonyericsson.home.action.UPDATE_BADGE";
    private static final String b = "com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME";
    private static final String c = "com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME";
    private static final String d = "com.sonyericsson.home.intent.extra.badge.MESSAGE";
    private static final String e = "com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE";
    private static final String f = "content://com.sonymobile.home.resourceprovider/badge";
    private static final String g = "badge_count";
    private static final String h = "package_name";
    private static final String i = "activity_name";
    private static final String j = "com.sonymobile.home.resourceprovider";
    private final Uri k = Uri.parse(f);
    private AsyncQueryHandler l;

    /* loaded from: classes3.dex */
    public class a extends AsyncQueryHandler {
        public a(ContentResolver contentResolver) {
            super(contentResolver);
        }
    }

    private ContentValues c(int i2, ComponentName componentName) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(g, Integer.valueOf(i2));
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put(i, componentName.getClassName());
        return contentValues;
    }

    private static void d(Context context, ComponentName componentName, int i2) {
        Intent intent = new Intent(a);
        intent.putExtra(b, componentName.getPackageName());
        intent.putExtra(c, componentName.getClassName());
        intent.putExtra(d, String.valueOf(i2));
        intent.putExtra(e, i2 > 0);
        context.sendBroadcast(intent);
    }

    private void e(Context context, ComponentName componentName, int i2) {
        if (i2 < 0) {
            return;
        }
        ContentValues c2 = c(i2, componentName);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.l == null) {
                this.l = new a(context.getApplicationContext().getContentResolver());
            }
            f(c2);
            return;
        }
        g(context, c2);
    }

    private void f(ContentValues contentValues) {
        this.l.startInsert(0, null, this.k, contentValues);
    }

    private void g(Context context, ContentValues contentValues) {
        context.getApplicationContext().getContentResolver().insert(this.k, contentValues);
    }

    private static boolean h(Context context) {
        return context.getPackageManager().resolveContentProvider(j, 0) != null;
    }

    @Override // com.p7700g.p99005.fp3
    public List<String> a() {
        return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
    }

    @Override // com.p7700g.p99005.fp3
    public void b(Context context, ComponentName componentName, int i2) throws gp3 {
        if (h(context)) {
            e(context, componentName, i2);
        } else {
            d(context, componentName, i2);
        }
    }
}