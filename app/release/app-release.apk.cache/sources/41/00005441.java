package com.p7700g.p99005;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;

/* compiled from: AccessibilityServiceInfoCompat.java */
/* loaded from: classes.dex */
public final class of {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 4;
    public static final int d = 8;
    public static final int e = 32;
    public static final int f = -1;
    public static final int g = 2;
    public static final int h = 4;
    public static final int i = 8;
    public static final int j = 16;
    public static final int k = 32;

    private of() {
    }

    @x1
    public static String a(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? "UNKNOWN" : "CAPABILITY_CAN_FILTER_KEY_EVENTS" : "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY" : "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION" : "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
    }

    @x1
    public static String b(int i2) {
        StringBuilder G = wo1.G("[");
        while (i2 > 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(i2);
            i2 &= ~numberOfTrailingZeros;
            if (G.length() > 1) {
                G.append(", ");
            }
            if (numberOfTrailingZeros == 1) {
                G.append("FEEDBACK_SPOKEN");
            } else if (numberOfTrailingZeros == 2) {
                G.append("FEEDBACK_HAPTIC");
            } else if (numberOfTrailingZeros == 4) {
                G.append("FEEDBACK_AUDIBLE");
            } else if (numberOfTrailingZeros == 8) {
                G.append("FEEDBACK_VISUAL");
            } else if (numberOfTrailingZeros == 16) {
                G.append("FEEDBACK_GENERIC");
            }
        }
        G.append("]");
        return G.toString();
    }

    @z1
    public static String c(int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 4) {
                    if (i2 != 8) {
                        if (i2 != 16) {
                            if (i2 != 32) {
                                return null;
                            }
                            return "FLAG_REQUEST_FILTER_KEY_EVENTS";
                        }
                        return "FLAG_REPORT_VIEW_IDS";
                    }
                    return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
                }
                return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
            }
            return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
        }
        return "DEFAULT";
    }

    public static int d(@x1 AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getCapabilities();
    }

    @z1
    public static String e(@x1 AccessibilityServiceInfo accessibilityServiceInfo, @x1 PackageManager packageManager) {
        return accessibilityServiceInfo.loadDescription(packageManager);
    }
}