package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.content.res.loader.ResourcesLoader;
import android.os.Build;
import android.view.ContextThemeWrapper;
import com.p7700g.p99005.ga2;
import java.util.HashMap;
import java.util.Map;

/* compiled from: HarmonizedColors.java */
/* loaded from: classes3.dex */
public class hc2 {
    private static final String a = "hc2";

    private hc2() {
    }

    @e2(api = 21)
    private static void a(@x1 Map<Integer, Integer> map, @x1 TypedArray typedArray, @z1 TypedArray typedArray2, @w0 int i) {
        if (typedArray2 == null) {
            typedArray2 = typedArray;
        }
        for (int i2 = 0; i2 < typedArray.getIndexCount(); i2++) {
            int resourceId = typedArray2.getResourceId(i2, 0);
            if (resourceId != 0 && typedArray.hasValue(i2) && e(typedArray.getType(i2))) {
                map.put(Integer.valueOf(resourceId), Integer.valueOf(kc2.i(typedArray.getColor(i2, 0), i)));
            }
        }
    }

    @e2(api = 30)
    private static boolean b(Context context, Map<Integer, Integer> map) {
        ResourcesLoader a2 = ac2.a(context, map);
        if (a2 != null) {
            context.getResources().addLoaders(a2);
            return true;
        }
        return false;
    }

    @x1
    public static void c(@x1 Context context, @x1 ic2 ic2Var) {
        if (f()) {
            Map<Integer, Integer> d = d(context, ic2Var);
            int e = ic2Var.e(0);
            if (!b(context, d) || e == 0) {
                return;
            }
            mc2.a(context, e);
        }
    }

    @e2(api = 21)
    private static Map<Integer, Integer> d(Context context, ic2 ic2Var) {
        int[] d;
        HashMap hashMap = new HashMap();
        int c = kc2.c(context, ic2Var.b(), a);
        for (int i : ic2Var.d()) {
            hashMap.put(Integer.valueOf(i), Integer.valueOf(kc2.i(gh.f(context, i), c)));
        }
        gc2 c2 = ic2Var.c();
        if (c2 != null) {
            int[] d2 = c2.d();
            if (d2.length > 0) {
                int e = c2.e();
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(d2);
                TypedArray obtainStyledAttributes2 = e != 0 ? new ContextThemeWrapper(context, e).obtainStyledAttributes(d2) : null;
                a(hashMap, obtainStyledAttributes, obtainStyledAttributes2, c);
                obtainStyledAttributes.recycle();
                if (obtainStyledAttributes2 != null) {
                    obtainStyledAttributes2.recycle();
                }
            }
        }
        return hashMap;
    }

    private static boolean e(int i) {
        return 28 <= i && i <= 31;
    }

    @v0(api = 30)
    public static boolean f() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @x1
    public static Context g(@x1 Context context, @x1 ic2 ic2Var) {
        if (f()) {
            Map<Integer, Integer> d = d(context, ic2Var);
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, ic2Var.e(ga2.n.z9));
            contextThemeWrapper.applyOverrideConfiguration(new Configuration());
            return b(contextThemeWrapper, d) ? contextThemeWrapper : context;
        }
        return context;
    }
}