package com.p7700g.p99005;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import com.p7700g.p99005.i2;

/* compiled from: MotionUtils.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class of2 {
    private static final String a = "cubic-bezier";
    private static final String b = "path";
    private static final String c = "(";
    private static final String d = ")";

    private of2() {
    }

    private static float a(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat < 0.0f || parseFloat > 1.0f) {
            throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
        }
        return parseFloat;
    }

    private static String b(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    private static boolean c(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(c);
        return str.startsWith(sb.toString()) && str.endsWith(d);
    }

    public static int d(@x1 Context context, @q0 int i, int i2) {
        return rg2.e(context, i, i2);
    }

    @x1
    public static TimeInterpolator e(@x1 Context context, @q0 int i, @x1 TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            if (typedValue.type == 3) {
                String valueOf = String.valueOf(typedValue.string);
                if (c(valueOf, a)) {
                    String[] split = b(valueOf, a).split(",");
                    if (split.length == 4) {
                        return rs.b(a(split, 0), a(split, 1), a(split, 2), a(split, 3));
                    }
                    StringBuilder G = wo1.G("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
                    G.append(split.length);
                    throw new IllegalArgumentException(G.toString());
                } else if (c(valueOf, "path")) {
                    return rs.c(mj.e(b(valueOf, "path")));
                } else {
                    throw new IllegalArgumentException(wo1.t("Invalid motion easing type: ", valueOf));
                }
            }
            throw new IllegalArgumentException("Motion easing theme attribute must be a string");
        }
        return timeInterpolator;
    }
}