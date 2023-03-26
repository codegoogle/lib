package com.p7700g.p99005;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.net.URL;

/* compiled from: ModelTypes.java */
/* loaded from: classes2.dex */
public interface ep1<T> {
    @x1
    @u0
    T a(@z1 String str);

    @u0
    @Deprecated
    T d(@z1 URL url);

    @x1
    @u0
    T e(@z1 Uri uri);

    @x1
    @u0
    T f(@z1 byte[] bArr);

    @x1
    @u0
    T g(@z1 File file);

    @x1
    @u0
    T h(@z1 Drawable drawable);

    @x1
    @u0
    T i(@z1 Bitmap bitmap);

    @x1
    @u0
    T n(@z1 Object obj);

    @x1
    @u0
    T o(@f1 @z1 @d2 Integer num);
}