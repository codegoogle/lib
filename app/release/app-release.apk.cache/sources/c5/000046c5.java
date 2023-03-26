package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import org.jetbrains.annotations.NotNull;

/* compiled from: Icon.kt */
@vo4(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0004H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0005H\u0087\b¨\u0006\u0006"}, d2 = {"toAdaptiveIcon", "Landroid/graphics/drawable/Icon;", "Landroid/graphics/Bitmap;", "toIcon", "Landroid/net/Uri;", "", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class hk {
    @e2(26)
    @NotNull
    public static final Icon a(@NotNull Bitmap bitmap) {
        c25.p(bitmap, "<this>");
        Icon createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
        c25.o(createWithAdaptiveBitmap, "createWithAdaptiveBitmap(this)");
        return createWithAdaptiveBitmap;
    }

    @e2(26)
    @NotNull
    public static final Icon b(@NotNull Bitmap bitmap) {
        c25.p(bitmap, "<this>");
        Icon createWithBitmap = Icon.createWithBitmap(bitmap);
        c25.o(createWithBitmap, "createWithBitmap(this)");
        return createWithBitmap;
    }

    @e2(26)
    @NotNull
    public static final Icon c(@NotNull Uri uri) {
        c25.p(uri, "<this>");
        Icon createWithContentUri = Icon.createWithContentUri(uri);
        c25.o(createWithContentUri, "createWithContentUri(this)");
        return createWithContentUri;
    }

    @e2(26)
    @NotNull
    public static final Icon d(@NotNull byte[] bArr) {
        c25.p(bArr, "<this>");
        Icon createWithData = Icon.createWithData(bArr, 0, bArr.length);
        c25.o(createWithData, "createWithData(this, 0, size)");
        return createWithData;
    }
}