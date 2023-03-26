package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.p7700g.p99005.fp3;
import com.p7700g.p99005.gp3;
import com.p7700g.p99005.jp3;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class SamsungHomeBadger implements fp3 {
    private static final String a = "content://com.sec.badge/apps?notify=true";
    private static final String[] b = {"_id", "class"};
    private DefaultBadger c = new DefaultBadger();

    private ContentValues c(ComponentName componentName, int i, boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i));
        return contentValues;
    }

    @Override // com.p7700g.p99005.fp3
    public List<String> a() {
        return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher");
    }

    @Override // com.p7700g.p99005.fp3
    public void b(Context context, ComponentName componentName, int i) throws gp3 {
        DefaultBadger defaultBadger = this.c;
        if (defaultBadger != null && defaultBadger.c(context)) {
            this.c.b(context, componentName, i);
            return;
        }
        Uri parse = Uri.parse(a);
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(parse, b, "package=?", new String[]{componentName.getPackageName()}, null);
            if (cursor != null) {
                String className = componentName.getClassName();
                boolean z = false;
                while (cursor.moveToNext()) {
                    contentResolver.update(parse, c(componentName, i, false), "_id=?", new String[]{String.valueOf(cursor.getInt(0))});
                    if (className.equals(cursor.getString(cursor.getColumnIndex("class")))) {
                        z = true;
                    }
                }
                if (!z) {
                    contentResolver.insert(parse, c(componentName, i, true));
                }
            }
        } finally {
            jp3.a(cursor);
        }
    }
}