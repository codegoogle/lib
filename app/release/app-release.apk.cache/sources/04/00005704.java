package com.p7700g.p99005;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.List;

/* compiled from: ResourceDrawableDecoder.java */
/* loaded from: classes2.dex */
public class pw1 implements lq1<Uri, Drawable> {
    private static final String a = "android";
    private static final int b = 0;
    private static final int c = 2;
    private static final int d = 0;
    private static final int e = 1;
    private static final int f = 1;
    private static final int g = 0;
    private final Context h;

    public pw1(Context context) {
        this.h = context.getApplicationContext();
    }

    @x1
    private Context d(Uri uri, String str) {
        if (str.equals(this.h.getPackageName())) {
            return this.h;
        }
        try {
            return this.h.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            if (str.contains(this.h.getPackageName())) {
                return this.h;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e2);
        }
    }

    @f1
    private int e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e2) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e2);
        }
    }

    @f1
    private int f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    @f1
    private int g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // com.p7700g.p99005.lq1
    @z1
    /* renamed from: c */
    public cs1<Drawable> b(@x1 Uri uri, int i, int i2, @x1 jq1 jq1Var) {
        Context d2 = d(uri, uri.getAuthority());
        return ow1.e(lw1.b(this.h, d2, g(d2, uri)));
    }

    @Override // com.p7700g.p99005.lq1
    /* renamed from: h */
    public boolean a(@x1 Uri uri, @x1 jq1 jq1Var) {
        return uri.getScheme().equals("android.resource");
    }
}