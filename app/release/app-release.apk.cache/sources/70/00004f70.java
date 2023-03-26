package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: DrawableDecoderCompat.java */
/* loaded from: classes2.dex */
public final class lw1 {
    private static volatile boolean a = true;

    private lw1() {
    }

    public static Drawable a(Context context, @f1 int i, @z1 Resources.Theme theme) {
        return c(context, context, i, theme);
    }

    public static Drawable b(Context context, Context context2, @f1 int i) {
        return c(context, context2, i, null);
    }

    private static Drawable c(Context context, Context context2, @f1 int i, @z1 Resources.Theme theme) {
        try {
            if (a) {
                return e(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return gh.i(context2, i);
            }
            throw e;
        } catch (NoClassDefFoundError unused2) {
            a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return d(context2, i, theme);
    }

    private static Drawable d(Context context, @f1 int i, @z1 Resources.Theme theme) {
        return oi.g(context.getResources(), i, theme);
    }

    private static Drawable e(Context context, @f1 int i, @z1 Resources.Theme theme) {
        if (theme != null) {
            context = new d4(context, theme);
        }
        return r3.b(context, i);
    }
}