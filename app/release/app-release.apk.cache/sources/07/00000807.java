package com.anythink.expressad.foundation.g.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.anythink.expressad.foundation.h.l;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class a {
    @SuppressLint({"NewApi"})
    private static Drawable a(Resources resources, Bitmap bitmap) {
        return new BitmapDrawable(resources, bitmap);
    }

    private static Bitmap b(Bitmap bitmap) {
        float f;
        float f2;
        float f3;
        float f4;
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= height) {
            f4 = width / 2;
            f3 = width;
            f = 0.0f;
            f2 = f3;
        } else {
            f = (width - height) / 2;
            f2 = height;
            f3 = width - f;
            width = height;
            f4 = height / 2;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            int i = (int) f2;
            Rect rect = new Rect((int) f, 0, (int) f3, i);
            Rect rect2 = new Rect(0, 0, i, i);
            RectF rectF = new RectF(rect2);
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-12434878);
            canvas.drawRoundRect(rectF, f4, f4, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, rect, rect2, paint);
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Bitmap a(String str) {
        Bitmap bitmap = null;
        if (l.a(str)) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            try {
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                options.inJustDecodeBounds = false;
                options.inPurgeable = true;
                options.inInputShareable = true;
                options.inDither = true;
                return BitmapFactory.decodeFile(str, options);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            } catch (OutOfMemoryError e2) {
                e2.printStackTrace();
                System.gc();
                b.a();
                try {
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                    bitmap = BitmapFactory.decodeFile(str, options);
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    return bitmap;
                } catch (OutOfMemoryError e3) {
                    e3.printStackTrace();
                    return bitmap;
                }
            }
        }
        return null;
    }

    private static int a(BitmapFactory.Options options, int i, int i2) {
        int min;
        double d = options.outWidth;
        double d2 = options.outHeight;
        int ceil = i2 == -1 ? 1 : (int) Math.ceil(Math.sqrt((d * d2) / i2));
        if (i == -1) {
            min = 128;
        } else {
            double d3 = i;
            min = (int) Math.min(Math.floor(d / d3), Math.floor(d2 / d3));
        }
        if (min < ceil) {
            return ceil;
        }
        if (i2 == -1 && i == -1) {
            return 1;
        }
        return i == -1 ? ceil : min;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Bitmap a(Context context, int i) {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeResource(context.getResources(), i);
        } catch (Exception unused) {
            bitmap = null;
            if (bitmap == null) {
            }
        } catch (OutOfMemoryError unused2) {
            System.gc();
            bitmap = null;
            if (bitmap == null) {
            }
        }
        return bitmap == null ? Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8) : bitmap;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0041: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:30:0x0041 */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InputStream a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        ByteArrayOutputStream byteArrayOutputStream3 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Exception e) {
                e = e;
                byteArrayOutputStream = null;
            } catch (Throwable th) {
                th = th;
                if (byteArrayOutputStream3 != null) {
                }
                throw th;
            }
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                try {
                    byteArrayOutputStream.close();
                } catch (Exception e2) {
                    if (com.anythink.expressad.a.a) {
                        e2.printStackTrace();
                    }
                }
                return byteArrayInputStream;
            } catch (Exception e3) {
                e = e3;
                if (com.anythink.expressad.a.a) {
                    e.printStackTrace();
                }
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                        return null;
                    } catch (Exception e4) {
                        if (com.anythink.expressad.a.a) {
                            e4.printStackTrace();
                            return null;
                        }
                        return null;
                    }
                }
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream3 = byteArrayOutputStream2;
            if (byteArrayOutputStream3 != null) {
                try {
                    byteArrayOutputStream3.close();
                } catch (Exception e5) {
                    if (com.anythink.expressad.a.a) {
                        e5.printStackTrace();
                    }
                }
            }
            throw th;
        }
    }
}