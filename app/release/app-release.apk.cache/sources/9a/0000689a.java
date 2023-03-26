package com.p7700g.p99005;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.List;

/* compiled from: TrustedWebActivityIntent.java */
/* loaded from: classes.dex */
public final class z6 {
    @x1
    private final Intent a;
    @x1
    private final List<Uri> b;

    public z6(@x1 Intent intent, @x1 List<Uri> list) {
        this.a = intent;
        this.b = list;
    }

    private void b(Context context) {
        for (Uri uri : this.b) {
            context.grantUriPermission(this.a.getPackage(), uri, 1);
        }
    }

    @x1
    public Intent a() {
        return this.a;
    }

    public void c(@x1 Context context) {
        b(context);
        gh.t(context, this.a, null);
    }
}