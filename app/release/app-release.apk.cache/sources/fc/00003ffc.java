package com.p7700g.p99005;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShareData.java */
/* loaded from: classes.dex */
public final class e7 {
    public static final String a = "androidx.browser.trusted.sharing.KEY_TITLE";
    public static final String b = "androidx.browser.trusted.sharing.KEY_TEXT";
    public static final String c = "androidx.browser.trusted.sharing.KEY_URIS";
    @z1
    public final String d;
    @z1
    public final String e;
    @z1
    public final List<Uri> f;

    public e7(@z1 String str, @z1 String str2, @z1 List<Uri> list) {
        this.d = str;
        this.e = str2;
        this.f = list;
    }

    @x1
    public static e7 a(@x1 Bundle bundle) {
        return new e7(bundle.getString("androidx.browser.trusted.sharing.KEY_TITLE"), bundle.getString("androidx.browser.trusted.sharing.KEY_TEXT"), bundle.getParcelableArrayList(c));
    }

    @x1
    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString("androidx.browser.trusted.sharing.KEY_TITLE", this.d);
        bundle.putString("androidx.browser.trusted.sharing.KEY_TEXT", this.e);
        if (this.f != null) {
            bundle.putParcelableArrayList(c, new ArrayList<>(this.f));
        }
        return bundle;
    }
}