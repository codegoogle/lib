package com.facebook.ads.redexgen.X;

import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.ads.AdSize;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Ju  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0762Ju {
    public static String[] A00;
    public static final Map<EnumC0759Jr, EnumC0760Js> A01;

    public static void A03() {
        A00 = new String[]{"aUzGFJWT9JUej7dfFIRBXB2Am5SKhp0L", "Lg", "z6uS01sVSQZKuOHXwfbCrotAFRq98Mhk", "s6upF4yW2rVlVN4uyEeLi2N0Ec6ZN78T", "eH22UAfKgSlQJvnKnPkmgNwQr7bKVvHo", "ohZIQy", "XInXF4zeGGrmw79hhTd", "dMAEap8Em2lp2DdLAyvSKUklRkWZ0JXT"};
    }

    static {
        A03();
        A01 = new HashMap();
        A01.put(EnumC0759Jr.A09, EnumC0760Js.A09);
        A01.put(EnumC0759Jr.A07, EnumC0760Js.A0B);
        A01.put(EnumC0759Jr.A06, EnumC0760Js.A0A);
    }

    public static AdSize A00(EnumC0760Js enumC0760Js) {
        for (Map.Entry<EnumC0759Jr, EnumC0760Js> entry : A01.entrySet()) {
            if (entry.getValue() == enumC0760Js) {
                EnumC0759Jr key = entry.getKey();
                if (A00[5].length() != 27) {
                    String[] strArr = A00;
                    strArr[2] = "sySRfG1wiaC9q3S7uTxa3ZVw3iXf1vjk";
                    strArr[2] = "sySRfG1wiaC9q3S7uTxa3ZVw3iXf1vjk";
                    return key.A06();
                }
                throw new RuntimeException();
            }
        }
        return AdSize.BANNER_320_50;
    }

    public static EnumC0760Js A01(DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.widthPixels / displayMetrics.density);
        int i2 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (LA.A04(i, i2)) {
            return EnumC0760Js.A0E;
        }
        if (i2 > i) {
            return EnumC0760Js.A0G;
        }
        return EnumC0760Js.A0D;
    }

    public static EnumC0760Js A02(EnumC0759Jr enumC0759Jr) {
        EnumC0760Js enumC0760Js = A01.get(enumC0759Jr);
        if (enumC0760Js == null) {
            return EnumC0760Js.A0C;
        }
        return enumC0760Js;
    }

    public static void A04(DisplayMetrics displayMetrics, View view, EnumC0759Jr enumC0759Jr) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(((int) (((float) displayMetrics.widthPixels) / displayMetrics.density)) >= enumC0759Jr.getWidth() ? displayMetrics.widthPixels : (int) Math.ceil(enumC0759Jr.getWidth() * displayMetrics.density), (int) Math.ceil(enumC0759Jr.getHeight() * displayMetrics.density));
        layoutParams.addRule(14, -1);
        view.setLayoutParams(layoutParams);
    }
}