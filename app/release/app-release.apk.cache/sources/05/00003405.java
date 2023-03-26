package com.ironsource.mediationsdk;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* loaded from: classes3.dex */
public class AdapterUtils {
    public static final int MIN_TABLET_DP_SIZE = 600;

    public static int dpToPixels(Activity activity, int i) {
        if (activity == null) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "AdapterUtils dpToPixels - activity is null, returning dpSize", 3);
            return i;
        }
        return (int) TypedValue.applyDimension(1, i, activity.getResources().getDisplayMetrics());
    }

    public static String getScreenSizeParams(Activity activity) {
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        float min = Math.min(displayMetrics.widthPixels / f, displayMetrics.heightPixels / f);
        float f2 = displayMetrics.xdpi;
        float f3 = displayMetrics.ydpi;
        float f4 = displayMetrics.widthPixels / f2;
        float f5 = displayMetrics.heightPixels / f3;
        double sqrt = Math.sqrt((f5 * f5) + (f4 * f4));
        int i = activity.getResources().getConfiguration().smallestScreenWidthDp;
        return "smallestWidth = " + min + " diagonalInches = " + sqrt + " smallScreenDpApi =  " + i;
    }

    public static boolean isLargeScreen(Activity activity) {
        if (activity != null) {
            return activity.getResources().getConfiguration().smallestScreenWidthDp >= 600;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "AdapterUtils isLargeScreen - activity is null", 3);
        return false;
    }
}