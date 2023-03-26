package com.p7700g.p99005;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.TypedValue;
import com.p7700g.p99005.ry2;
import java.io.FileDescriptor;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;

/* compiled from: GlideBitmapFactory.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b8\u00109J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010!\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J=\u0010#\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b%\u0010&J%\u0010'\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b'\u0010(J\u001d\u0010*\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u001f¢\u0006\u0004\b*\u0010+J-\u0010,\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b,\u0010-J\u0015\u00100\u001a\u00020\u00042\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J%\u00102\u001a\u00020\u00042\u0006\u0010/\u001a\u00020.2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b2\u00103J\u001d\u00104\u001a\u00020\u00042\u0006\u0010/\u001a\u00020.2\u0006\u0010)\u001a\u00020\u001f¢\u0006\u0004\b4\u00105J-\u00106\u001a\u00020\u00042\u0006\u0010/\u001a\u00020.2\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b6\u00107¨\u0006:"}, d2 = {"Lcom/p7700g/p99005/qy2;", "", "", "pathName", "Landroid/graphics/Bitmap;", "c", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "", "reqWidth", "reqHeight", "d", "(Ljava/lang/String;II)Landroid/graphics/Bitmap;", "Landroid/content/res/Resources;", "res", "id", "i", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;", "j", "(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;", "", "data", "offset", "length", "a", "([BII)Landroid/graphics/Bitmap;", "b", "([BIIII)Landroid/graphics/Bitmap;", "Landroid/util/TypedValue;", "value", "Ljava/io/InputStream;", "is", "Landroid/graphics/Rect;", "pad", "k", "(Landroid/content/res/Resources;Landroid/util/TypedValue;Ljava/io/InputStream;Landroid/graphics/Rect;)Landroid/graphics/Bitmap;", "l", "(Landroid/content/res/Resources;Landroid/util/TypedValue;Ljava/io/InputStream;Landroid/graphics/Rect;II)Landroid/graphics/Bitmap;", com.anythink.expressad.d.a.b.dH, "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;", "n", "(Ljava/io/InputStream;II)Landroid/graphics/Bitmap;", "outPadding", ij3.b, "(Ljava/io/InputStream;Landroid/graphics/Rect;)Landroid/graphics/Bitmap;", "p", "(Ljava/io/InputStream;Landroid/graphics/Rect;II)Landroid/graphics/Bitmap;", "Ljava/io/FileDescriptor;", "fd", "e", "(Ljava/io/FileDescriptor;)Landroid/graphics/Bitmap;", "f", "(Ljava/io/FileDescriptor;II)Landroid/graphics/Bitmap;", com.anythink.basead.d.g.i, "(Ljava/io/FileDescriptor;Landroid/graphics/Rect;)Landroid/graphics/Bitmap;", "h", "(Ljava/io/FileDescriptor;Landroid/graphics/Rect;II)Landroid/graphics/Bitmap;", "<init>", "()V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class qy2 {
    @NotNull
    public static final qy2 a = new qy2();

    private qy2() {
    }

    @NotNull
    public final Bitmap a(@NotNull byte[] bArr, int i, int i2) {
        c25.p(bArr, "data");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, i, i2, options);
        options.inSampleSize = 1;
        options.inMutable = true;
        ry2.a aVar = ry2.a;
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        Bitmap.Config config = options.inPreferredConfig;
        c25.o(config, "options.inPreferredConfig");
        Bitmap b = aVar.b(i3, i4, config);
        if (b != null && bz2.a.c(b, options)) {
            options.inBitmap = b;
        }
        options.inJustDecodeBounds = false;
        try {
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, i, i2, options);
            c25.o(decodeByteArray, "decodeByteArray(data, offset, length, options)");
            return decodeByteArray;
        } catch (Exception unused) {
            options.inBitmap = null;
            Bitmap decodeByteArray2 = BitmapFactory.decodeByteArray(bArr, i, i2, options);
            c25.o(decodeByteArray2, "decodeByteArray(data, offset, length, options)");
            return decodeByteArray2;
        }
    }

    @NotNull
    public final Bitmap b(@NotNull byte[] bArr, int i, int i2, int i3, int i4) {
        c25.p(bArr, "data");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, i, i2, options);
        bz2 bz2Var = bz2.a;
        options.inSampleSize = bz2Var.b(options, i3, i4);
        options.inMutable = true;
        ry2.a aVar = ry2.a;
        int i5 = options.outWidth;
        int i6 = options.outHeight;
        Bitmap.Config config = options.inPreferredConfig;
        c25.o(config, "options.inPreferredConfig");
        Bitmap b = aVar.b(i5, i6, config);
        if (b != null && bz2Var.c(b, options)) {
            options.inBitmap = b;
        }
        options.inJustDecodeBounds = false;
        try {
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, i, i2, options);
            c25.o(decodeByteArray, "decodeByteArray(data, offset, length, options)");
            return decodeByteArray;
        } catch (Exception unused) {
            options.inBitmap = null;
            Bitmap decodeByteArray2 = BitmapFactory.decodeByteArray(bArr, i, i2, options);
            c25.o(decodeByteArray2, "decodeByteArray(data, offset, length, options)");
            return decodeByteArray2;
        }
    }

    @NotNull
    public final Bitmap c(@NotNull String str) {
        c25.p(str, "pathName");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = 1;
        options.inMutable = true;
        ry2.a aVar = ry2.a;
        int i = options.outWidth;
        int i2 = options.outHeight;
        Bitmap.Config config = options.inPreferredConfig;
        c25.o(config, "options.inPreferredConfig");
        Bitmap b = aVar.b(i, i2, config);
        if (b != null && bz2.a.c(b, options)) {
            options.inBitmap = b;
        }
        options.inJustDecodeBounds = false;
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            c25.o(decodeFile, "decodeFile(pathName, options)");
            return decodeFile;
        } catch (Exception unused) {
            options.inBitmap = null;
            Bitmap decodeFile2 = BitmapFactory.decodeFile(str, options);
            c25.o(decodeFile2, "decodeFile(pathName, options)");
            return decodeFile2;
        }
    }

    @NotNull
    public final Bitmap d(@NotNull String str, int i, int i2) {
        c25.p(str, "pathName");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        bz2 bz2Var = bz2.a;
        options.inSampleSize = bz2Var.b(options, i, i2);
        options.inMutable = true;
        ry2.a aVar = ry2.a;
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        Bitmap.Config config = options.inPreferredConfig;
        c25.o(config, "options.inPreferredConfig");
        Bitmap b = aVar.b(i3, i4, config);
        if (b != null && bz2Var.c(b, options)) {
            options.inBitmap = b;
        }
        options.inJustDecodeBounds = false;
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            c25.o(decodeFile, "decodeFile(pathName, options)");
            return decodeFile;
        } catch (Exception unused) {
            options.inBitmap = null;
            Bitmap decodeFile2 = BitmapFactory.decodeFile(str, options);
            c25.o(decodeFile2, "decodeFile(pathName, options)");
            return decodeFile2;
        }
    }

    @NotNull
    public final Bitmap e(@NotNull FileDescriptor fileDescriptor) {
        c25.p(fileDescriptor, "fd");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        options.inSampleSize = 1;
        options.inMutable = true;
        ry2.a aVar = ry2.a;
        int i = options.outWidth;
        int i2 = options.outHeight;
        Bitmap.Config config = options.inPreferredConfig;
        c25.o(config, "options.inPreferredConfig");
        Bitmap b = aVar.b(i, i2, config);
        if (b != null && bz2.a.c(b, options)) {
            options.inBitmap = b;
        }
        options.inJustDecodeBounds = false;
        try {
            Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
            c25.o(decodeFileDescriptor, "decodeFileDescriptor(fd, null, options)");
            return decodeFileDescriptor;
        } catch (Exception unused) {
            options.inBitmap = null;
            Bitmap decodeFileDescriptor2 = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
            c25.o(decodeFileDescriptor2, "decodeFileDescriptor(fd, null, options)");
            return decodeFileDescriptor2;
        }
    }

    @NotNull
    public final Bitmap f(@NotNull FileDescriptor fileDescriptor, int i, int i2) {
        c25.p(fileDescriptor, "fd");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        bz2 bz2Var = bz2.a;
        options.inSampleSize = bz2Var.b(options, i, i2);
        options.inMutable = true;
        ry2.a aVar = ry2.a;
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        Bitmap.Config config = options.inPreferredConfig;
        c25.o(config, "options.inPreferredConfig");
        Bitmap b = aVar.b(i3, i4, config);
        if (b != null && bz2Var.c(b, options)) {
            options.inBitmap = b;
        }
        options.inJustDecodeBounds = false;
        try {
            Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
            c25.o(decodeFileDescriptor, "decodeFileDescriptor(fd, null, options)");
            return decodeFileDescriptor;
        } catch (Exception unused) {
            options.inBitmap = null;
            Bitmap decodeFileDescriptor2 = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
            c25.o(decodeFileDescriptor2, "decodeFileDescriptor(fd, null, options)");
            return decodeFileDescriptor2;
        }
    }

    @NotNull
    public final Bitmap g(@NotNull FileDescriptor fileDescriptor, @NotNull Rect rect) {
        c25.p(fileDescriptor, "fd");
        c25.p(rect, "outPadding");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
        options.inSampleSize = 1;
        options.inMutable = true;
        ry2.a aVar = ry2.a;
        int i = options.outWidth;
        int i2 = options.outHeight;
        Bitmap.Config config = options.inPreferredConfig;
        c25.o(config, "options.inPreferredConfig");
        Bitmap b = aVar.b(i, i2, config);
        if (b != null && bz2.a.c(b, options)) {
            options.inBitmap = b;
        }
        options.inJustDecodeBounds = false;
        try {
            Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
            c25.o(decodeFileDescriptor, "decodeFileDescriptor(fd, outPadding, options)");
            return decodeFileDescriptor;
        } catch (Exception unused) {
            options.inBitmap = null;
            Bitmap decodeFileDescriptor2 = BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
            c25.o(decodeFileDescriptor2, "decodeFileDescriptor(fd, outPadding, options)");
            return decodeFileDescriptor2;
        }
    }

    @NotNull
    public final Bitmap h(@NotNull FileDescriptor fileDescriptor, @NotNull Rect rect, int i, int i2) {
        c25.p(fileDescriptor, "fd");
        c25.p(rect, "outPadding");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
        bz2 bz2Var = bz2.a;
        options.inSampleSize = bz2Var.b(options, i, i2);
        options.inMutable = true;
        ry2.a aVar = ry2.a;
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        Bitmap.Config config = options.inPreferredConfig;
        c25.o(config, "options.inPreferredConfig");
        Bitmap b = aVar.b(i3, i4, config);
        if (b != null && bz2Var.c(b, options)) {
            options.inBitmap = b;
        }
        options.inJustDecodeBounds = false;
        try {
            Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
            c25.o(decodeFileDescriptor, "decodeFileDescriptor(fd, outPadding, options)");
            return decodeFileDescriptor;
        } catch (Exception unused) {
            options.inBitmap = null;
            Bitmap decodeFileDescriptor2 = BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
            c25.o(decodeFileDescriptor2, "decodeFileDescriptor(fd, outPadding, options)");
            return decodeFileDescriptor2;
        }
    }

    @NotNull
    public final Bitmap i(@NotNull Resources resources, int i) {
        c25.p(resources, "res");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(resources, i, options);
        options.inSampleSize = 1;
        options.inMutable = true;
        ry2.a aVar = ry2.a;
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        Bitmap.Config config = options.inPreferredConfig;
        c25.o(config, "options.inPreferredConfig");
        Bitmap b = aVar.b(i2, i3, config);
        if (b != null && bz2.a.c(b, options)) {
            options.inBitmap = b;
        }
        options.inJustDecodeBounds = false;
        try {
            Bitmap decodeResource = BitmapFactory.decodeResource(resources, i, options);
            c25.o(decodeResource, "decodeResource(res, id, options)");
            return decodeResource;
        } catch (Exception unused) {
            options.inBitmap = null;
            Bitmap decodeResource2 = BitmapFactory.decodeResource(resources, i, options);
            c25.o(decodeResource2, "decodeResource(res, id, options)");
            return decodeResource2;
        }
    }

    @NotNull
    public final Bitmap j(@NotNull Resources resources, int i, int i2, int i3) {
        c25.p(resources, "res");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(resources, i, options);
        bz2 bz2Var = bz2.a;
        options.inSampleSize = bz2Var.b(options, i2, i3);
        options.inMutable = true;
        ry2.a aVar = ry2.a;
        int i4 = options.outWidth;
        int i5 = options.outHeight;
        Bitmap.Config config = options.inPreferredConfig;
        c25.o(config, "options.inPreferredConfig");
        Bitmap b = aVar.b(i4, i5, config);
        if (b != null && bz2Var.c(b, options)) {
            options.inBitmap = b;
        }
        options.inJustDecodeBounds = false;
        try {
            Bitmap decodeResource = BitmapFactory.decodeResource(resources, i, options);
            c25.o(decodeResource, "decodeResource(res, id, options)");
            return decodeResource;
        } catch (Exception unused) {
            options.inBitmap = null;
            Bitmap decodeResource2 = BitmapFactory.decodeResource(resources, i, options);
            c25.o(decodeResource2, "decodeResource(res, id, options)");
            return decodeResource2;
        }
    }

    @NotNull
    public final Bitmap k(@NotNull Resources resources, @NotNull TypedValue typedValue, @NotNull InputStream inputStream, @NotNull Rect rect) {
        c25.p(resources, "res");
        c25.p(typedValue, "value");
        c25.p(inputStream, "is");
        c25.p(rect, "pad");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
        options.inSampleSize = 1;
        options.inMutable = true;
        ry2.a aVar = ry2.a;
        int i = options.outWidth;
        int i2 = options.outHeight;
        Bitmap.Config config = options.inPreferredConfig;
        c25.o(config, "options.inPreferredConfig");
        Bitmap b = aVar.b(i, i2, config);
        if (b != null && bz2.a.c(b, options)) {
            options.inBitmap = b;
        }
        options.inJustDecodeBounds = false;
        try {
            Bitmap decodeResourceStream = BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
            c25.m(decodeResourceStream);
            c25.o(decodeResourceStream, "decodeResourceStream(res, value, `is`, pad, options)!!");
            return decodeResourceStream;
        } catch (Exception unused) {
            options.inBitmap = null;
            Bitmap decodeResourceStream2 = BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
            c25.m(decodeResourceStream2);
            c25.o(decodeResourceStream2, "decodeResourceStream(res, value, `is`, pad, options)!!");
            return decodeResourceStream2;
        }
    }

    @NotNull
    public final Bitmap l(@NotNull Resources resources, @NotNull TypedValue typedValue, @NotNull InputStream inputStream, @NotNull Rect rect, int i, int i2) {
        c25.p(resources, "res");
        c25.p(typedValue, "value");
        c25.p(inputStream, "is");
        c25.p(rect, "pad");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
        bz2 bz2Var = bz2.a;
        options.inSampleSize = bz2Var.b(options, i, i2);
        options.inMutable = true;
        ry2.a aVar = ry2.a;
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        Bitmap.Config config = options.inPreferredConfig;
        c25.o(config, "options.inPreferredConfig");
        Bitmap b = aVar.b(i3, i4, config);
        if (b != null && bz2Var.c(b, options)) {
            options.inBitmap = b;
        }
        options.inJustDecodeBounds = false;
        try {
            Bitmap decodeResourceStream = BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
            c25.m(decodeResourceStream);
            c25.o(decodeResourceStream, "decodeResourceStream(res, value, `is`, pad, options)!!");
            return decodeResourceStream;
        } catch (Exception unused) {
            options.inBitmap = null;
            Bitmap decodeResourceStream2 = BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
            c25.m(decodeResourceStream2);
            c25.o(decodeResourceStream2, "decodeResourceStream(res, value, `is`, pad, options)!!");
            return decodeResourceStream2;
        }
    }

    @NotNull
    public final Bitmap m(@NotNull InputStream inputStream) {
        c25.p(inputStream, "is");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        options.inSampleSize = 1;
        options.inMutable = true;
        ry2.a aVar = ry2.a;
        int i = options.outWidth;
        int i2 = options.outHeight;
        Bitmap.Config config = options.inPreferredConfig;
        c25.o(config, "options.inPreferredConfig");
        Bitmap b = aVar.b(i, i2, config);
        if (b != null && bz2.a.c(b, options)) {
            options.inBitmap = b;
        }
        options.inJustDecodeBounds = false;
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
            c25.m(decodeStream);
            c25.o(decodeStream, "decodeStream(`is`, null, options)!!");
            return decodeStream;
        } catch (Exception unused) {
            options.inBitmap = null;
            Bitmap decodeStream2 = BitmapFactory.decodeStream(inputStream, null, options);
            c25.m(decodeStream2);
            c25.o(decodeStream2, "decodeStream(`is`, null, options)!!");
            return decodeStream2;
        }
    }

    @NotNull
    public final Bitmap n(@NotNull InputStream inputStream, int i, int i2) {
        c25.p(inputStream, "is");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        bz2 bz2Var = bz2.a;
        options.inSampleSize = bz2Var.b(options, i, i2);
        options.inMutable = true;
        ry2.a aVar = ry2.a;
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        Bitmap.Config config = options.inPreferredConfig;
        c25.o(config, "options.inPreferredConfig");
        Bitmap b = aVar.b(i3, i4, config);
        if (b != null && bz2Var.c(b, options)) {
            options.inBitmap = b;
        }
        options.inJustDecodeBounds = false;
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
            c25.m(decodeStream);
            c25.o(decodeStream, "decodeStream(`is`, null, options)!!");
            return decodeStream;
        } catch (Exception unused) {
            options.inBitmap = null;
            Bitmap decodeStream2 = BitmapFactory.decodeStream(inputStream, null, options);
            c25.m(decodeStream2);
            c25.o(decodeStream2, "decodeStream(`is`, null, options)!!");
            return decodeStream2;
        }
    }

    @NotNull
    public final Bitmap o(@NotNull InputStream inputStream, @NotNull Rect rect) {
        c25.p(inputStream, "is");
        c25.p(rect, "outPadding");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, rect, options);
        options.inSampleSize = 1;
        options.inMutable = true;
        ry2.a aVar = ry2.a;
        int i = options.outWidth;
        int i2 = options.outHeight;
        Bitmap.Config config = options.inPreferredConfig;
        c25.o(config, "options.inPreferredConfig");
        Bitmap b = aVar.b(i, i2, config);
        if (b != null && bz2.a.c(b, options)) {
            options.inBitmap = b;
        }
        options.inJustDecodeBounds = false;
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, rect, options);
            c25.m(decodeStream);
            c25.o(decodeStream, "decodeStream(`is`, outPadding, options)!!");
            return decodeStream;
        } catch (Exception unused) {
            options.inBitmap = null;
            Bitmap decodeStream2 = BitmapFactory.decodeStream(inputStream, rect, options);
            c25.m(decodeStream2);
            c25.o(decodeStream2, "decodeStream(`is`, outPadding, options)!!");
            return decodeStream2;
        }
    }

    @NotNull
    public final Bitmap p(@NotNull InputStream inputStream, @NotNull Rect rect, int i, int i2) {
        c25.p(inputStream, "is");
        c25.p(rect, "outPadding");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, rect, options);
        bz2 bz2Var = bz2.a;
        options.inSampleSize = bz2Var.b(options, i, i2);
        options.inMutable = true;
        ry2.a aVar = ry2.a;
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        Bitmap.Config config = options.inPreferredConfig;
        c25.o(config, "options.inPreferredConfig");
        Bitmap b = aVar.b(i3, i4, config);
        if (b != null && bz2Var.c(b, options)) {
            options.inBitmap = b;
        }
        options.inJustDecodeBounds = false;
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, rect, options);
            c25.m(decodeStream);
            c25.o(decodeStream, "decodeStream(`is`, outPadding, options)!!");
            return decodeStream;
        } catch (Exception unused) {
            options.inBitmap = null;
            Bitmap decodeStream2 = BitmapFactory.decodeStream(inputStream, rect, options);
            c25.m(decodeStream2);
            c25.o(decodeStream2, "decodeStream(`is`, outPadding, options)!!");
            return decodeStream2;
        }
    }
}