package com.anythink.core.common.j;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.p7700g.p99005.b30;
import com.p7700g.p99005.sr;
import java.io.FileDescriptor;
import java.lang.reflect.Array;

/* loaded from: classes2.dex */
public final class b {
    public static int[] a(String str) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            return new int[]{options.outWidth, options.outHeight};
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    private static Bitmap a(String str, int i, int i2) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inSampleSize = a(options.outWidth, options.outHeight, i, i2);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(str, options);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public static Bitmap a(FileDescriptor fileDescriptor, int i, int i2) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
            options.inSampleSize = a(options.outWidth, options.outHeight, i, i2);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static int a(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i3 > 0 || i4 > 0) {
            while (i / i5 > i3 && i2 / i5 > i4) {
                i5 *= 2;
            }
            return i5;
        }
        return 1;
    }

    public static Bitmap a(Context context, Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            com.anythink.core.common.i.c.a("Error", "Error, cannot access an invalid/free'd bitmap here!", com.anythink.core.common.b.m.a().p());
            return null;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth() / 3, bitmap.getHeight() / 3, Bitmap.Config.ARGB_8888);
            RenderScript create = RenderScript.create(context);
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(25.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            new Canvas(createBitmap).drawColor(855638016);
            create.destroy();
            return createBitmap;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static Bitmap a(Bitmap bitmap) {
        int i;
        int[] iArr;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i2 = width * height;
        int[] iArr2 = new int[i2];
        bitmap.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i3 = width - 1;
        int i4 = height - 1;
        int[] iArr3 = new int[i2];
        int[] iArr4 = new int[i2];
        int[] iArr5 = new int[i2];
        int[] iArr6 = new int[Math.max(width, height)];
        int[] iArr7 = new int[173056];
        for (int i5 = 0; i5 < 173056; i5++) {
            iArr7[i5] = i5 / 676;
        }
        int[][] iArr8 = (int[][]) Array.newInstance(int.class, 51, 3);
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i6 >= height) {
                break;
            }
            int i9 = -25;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 25; i9 <= i19; i19 = 25) {
                int i20 = height;
                int i21 = iArr2[Math.min(i3, Math.max(i9, 0)) + i7];
                int[] iArr9 = iArr8[i9 + 25];
                iArr9[0] = (i21 & b30.s) >> 16;
                iArr9[1] = (i21 & 65280) >> 8;
                iArr9[2] = i21 & 255;
                int abs = 26 - Math.abs(i9);
                i10 = (iArr9[0] * abs) + i10;
                i11 = (iArr9[1] * abs) + i11;
                i12 = (iArr9[2] * abs) + i12;
                if (i9 > 0) {
                    i16 += iArr9[0];
                    i17 += iArr9[1];
                    i18 += iArr9[2];
                } else {
                    i13 += iArr9[0];
                    i14 += iArr9[1];
                    i15 += iArr9[2];
                }
                i9++;
                height = i20;
            }
            int i22 = height;
            int i23 = 25;
            int i24 = 0;
            while (i24 < width) {
                iArr3[i7] = iArr7[i10];
                iArr4[i7] = iArr7[i11];
                iArr5[i7] = iArr7[i12];
                int i25 = i10 - i13;
                int i26 = i11 - i14;
                int i27 = i12 - i15;
                int[] iArr10 = iArr8[((i23 - 25) + 51) % 51];
                int i28 = i13 - iArr10[0];
                int i29 = i14 - iArr10[1];
                int i30 = i15 - iArr10[2];
                if (i6 == 0) {
                    iArr = iArr7;
                    iArr6[i24] = Math.min(i24 + 25 + 1, i3);
                } else {
                    iArr = iArr7;
                }
                int i31 = iArr2[iArr6[i24] + i8];
                iArr10[0] = (i31 & b30.s) >> 16;
                iArr10[1] = (i31 & 65280) >> 8;
                iArr10[2] = i31 & 255;
                int i32 = i16 + iArr10[0];
                int i33 = i17 + iArr10[1];
                int i34 = i18 + iArr10[2];
                i10 = i25 + i32;
                i11 = i26 + i33;
                i12 = i27 + i34;
                i23 = (i23 + 1) % 51;
                int[] iArr11 = iArr8[i23 % 51];
                i13 = i28 + iArr11[0];
                i14 = i29 + iArr11[1];
                i15 = i30 + iArr11[2];
                i16 = i32 - iArr11[0];
                i17 = i33 - iArr11[1];
                i18 = i34 - iArr11[2];
                i7++;
                i24++;
                iArr7 = iArr;
            }
            i8 += width;
            i6++;
            height = i22;
        }
        int[] iArr12 = iArr7;
        int i35 = height;
        int i36 = 0;
        while (i36 < width) {
            int i37 = width * (-25);
            int[] iArr13 = iArr6;
            int[] iArr14 = iArr2;
            int i38 = -25;
            int i39 = 0;
            int i40 = 0;
            int i41 = 0;
            int i42 = 0;
            int i43 = 0;
            int i44 = 0;
            int i45 = 0;
            int i46 = 0;
            int i47 = 0;
            for (int i48 = 25; i38 <= i48; i48 = 25) {
                int max = Math.max(0, i37) + i36;
                int[] iArr15 = iArr8[i38 + 25];
                iArr15[0] = iArr3[max];
                iArr15[1] = iArr4[max];
                iArr15[2] = iArr5[max];
                int abs2 = 26 - Math.abs(i38);
                i39 = (iArr3[max] * abs2) + i39;
                i40 = (iArr4[max] * abs2) + i40;
                i41 = (iArr5[max] * abs2) + i41;
                if (i38 > 0) {
                    i45 += iArr15[0];
                    i46 += iArr15[1];
                    i47 += iArr15[2];
                } else {
                    i42 += iArr15[0];
                    i43 += iArr15[1];
                    i44 += iArr15[2];
                }
                if (i38 < i4) {
                    i37 += width;
                }
                i38++;
            }
            int i49 = i36;
            int i50 = i35;
            int i51 = 0;
            int i52 = 25;
            while (i51 < i50) {
                iArr14[i49] = (iArr14[i49] & sr.t) | (iArr12[i39] << 16) | (iArr12[i40] << 8) | iArr12[i41];
                int i53 = i39 - i42;
                int i54 = i40 - i43;
                int i55 = i41 - i44;
                int[] iArr16 = iArr8[((i52 - 25) + 51) % 51];
                int i56 = i42 - iArr16[0];
                int i57 = i43 - iArr16[1];
                int i58 = i44 - iArr16[2];
                if (i36 == 0) {
                    i = i50;
                    iArr13[i51] = Math.min(i51 + 26, i4) * width;
                } else {
                    i = i50;
                }
                int i59 = iArr13[i51] + i36;
                iArr16[0] = iArr3[i59];
                iArr16[1] = iArr4[i59];
                iArr16[2] = iArr5[i59];
                int i60 = i45 + iArr16[0];
                int i61 = i46 + iArr16[1];
                int i62 = i47 + iArr16[2];
                i39 = i53 + i60;
                i40 = i54 + i61;
                i41 = i55 + i62;
                i52 = (i52 + 1) % 51;
                int[] iArr17 = iArr8[i52];
                i42 = i56 + iArr17[0];
                i43 = i57 + iArr17[1];
                i44 = i58 + iArr17[2];
                i45 = i60 - iArr17[0];
                i46 = i61 - iArr17[1];
                i47 = i62 - iArr17[2];
                i49 += width;
                i51++;
                i50 = i;
            }
            i35 = i50;
            i36++;
            iArr6 = iArr13;
            iArr2 = iArr14;
        }
        bitmap.setPixels(iArr2, 0, width, 0, 0, width, i35);
        return bitmap;
    }
}