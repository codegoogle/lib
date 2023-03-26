package com.p7700g.p99005;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: PreJava9DateFormatProvider.java */
/* loaded from: classes3.dex */
public class zw2 {
    private static String a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return "M/d/yy";
                    }
                    throw new IllegalArgumentException(wo1.l("Unknown DateFormat style: ", i));
                }
                return "MMM d, y";
            }
            return "MMMM d, y";
        }
        return "EEEE, MMMM d, y";
    }

    private static String b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return "M/d/yy";
                    }
                    throw new IllegalArgumentException(wo1.l("Unknown DateFormat style: ", i));
                }
                return "MMM d, yyyy";
            }
            return "MMMM d, yyyy";
        }
        return "EEEE, MMMM d, yyyy";
    }

    private static String c(int i) {
        if (i == 0 || i == 1) {
            return "h:mm:ss a z";
        }
        if (i != 2) {
            if (i == 3) {
                return "h:mm a";
            }
            throw new IllegalArgumentException(wo1.l("Unknown DateFormat style: ", i));
        }
        return "h:mm:ss a";
    }

    public static DateFormat d(int i) {
        return new SimpleDateFormat(a(i), Locale.US);
    }

    public static DateFormat e(int i, int i2) {
        return new SimpleDateFormat(b(i) + " " + c(i2), Locale.US);
    }
}