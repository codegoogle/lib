package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p7700g.p99005.bx;
import java.util.Arrays;
import java.util.List;
import org.xbill.DNS.Flags;

@TargetApi(19)
/* loaded from: assets/audience_network.dex */
public final class N9 extends LinearLayout {
    public static byte[] A05;
    public static String[] A06;
    public static final int A07;
    public static final int A08;
    public static final Uri A09;
    public static final View.OnTouchListener A0A;
    public ImageView A00;
    public ImageView A01;
    public N8 A02;
    public NF A03;
    public String A04;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 39);
            String[] strArr = A06;
            if (strArr[3].charAt(13) == strArr[1].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[6] = "2vQcPj1ELj1bu";
            strArr2[0] = "7aOELiI6quiDs";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{81, 126, 125, 97, 119, 23, 40, 61, 54, 120, 54, 57, 44, 49, 46, 61, 120, 58, bx.W5, 55, 47, 43, 61, bx.W5, 0, 3, 14, 20, 21, 91, 3, 13, 0, 15, 10, 32, 47, 37, 51, 46, 40, 37, 111, 40, 47, 53, 36, 47, 53, 111, 32, 34, 53, 40, 46, 47, 111, 23, 8, 4, 22, 7, Flags.CD, 9, 74, 5, 10, 0, 22, Flags.CD, 13, 0, 74, 7, 12, 22, Flags.CD, 9, 1, 27, 7, 7, 3, 73, 92, 92, 4, 4, 4, 93, 21, 18, 16, 22, 17, 28, 28, 24, 93, 16, 28, 30};
    }

    public static void A05() {
        A06 = new String[]{"knq4crm7fvqQP", "POuWJNR6FFtqsTvB6KeDXgsqVDDrfXB5", "10LYd3PkBnL3JTlwXO74lkb8laVhyfxM", "yGvyB2PsIdOlgSHN7xWAdIyeKrkcUuSJ", "30OsfDGqNeLBXhmKwxFpv8WuoKRgKdOB", "v4mwmIuaROl", "LuFvPWZsJ2RrZ", "py7QobRXpH9AZVstdVJJOkEIejHuBaN9"};
    }

    static {
        A05();
        A04();
        A07 = Color.rgb(224, 224, 224);
        A09 = Uri.parse(A02(79, 23, 84));
        A0A = new N5();
        A08 = Color.argb(34, 0, 0, 0);
    }

    public N9(C1080Wh c1080Wh) {
        super(c1080Wh);
        A06(c1080Wh);
    }

    private void A06(C1080Wh c1080Wh) {
        float f = getResources().getDisplayMetrics().density;
        int i = (int) (50.0f * f);
        int i2 = (int) (4.0f * f);
        C0795Le.A0P(this, -1);
        setGravity(16);
        this.A00 = new ImageView(c1080Wh);
        this.A00.setContentDescription(A02(0, 5, 53));
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        this.A00.setScaleType(ImageView.ScaleType.CENTER);
        this.A00.setImageBitmap(C0804Ln.A00(EnumC0803Lm.BROWSER_CLOSE));
        this.A00.setOnTouchListener(A0A);
        this.A00.setOnClickListener(new N6(this));
        addView(this.A00, layoutParams);
        this.A03 = new NF(c1080Wh);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        this.A03.setPadding(0, i2, 0, i2);
        addView(this.A03, layoutParams2);
        this.A01 = new ImageView(c1080Wh);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i, i);
        this.A01.setContentDescription(A02(5, 19, 127));
        this.A01.setScaleType(ImageView.ScaleType.CENTER);
        this.A01.setOnTouchListener(A0A);
        this.A01.setOnClickListener(new N7(this, c1080Wh));
        addView(this.A01, layoutParams3);
        setupDefaultNativeBrowser(c1080Wh);
    }

    public void setListener(N8 n8) {
        this.A02 = n8;
    }

    public void setTitle(String str) {
        this.A03.setTitle(str);
    }

    public void setUrl(String str) {
        this.A04 = str;
        if (TextUtils.isEmpty(str) || A02(24, 11, 70).equals(str)) {
            this.A03.setSubtitle(null);
            this.A01.setEnabled(false);
            this.A01.setColorFilter(new PorterDuffColorFilter(A07, PorterDuff.Mode.SRC_IN));
            return;
        }
        this.A03.setSubtitle(str);
        this.A01.setEnabled(true);
        this.A01.setColorFilter((ColorFilter) null);
    }

    private void setupDefaultNativeBrowser(C1080Wh c1080Wh) {
        Bitmap A00;
        List<ResolveInfo> queryIntentActivities = c1080Wh.getPackageManager().queryIntentActivities(new Intent(A02(35, 26, 102), A09), 65536);
        if (queryIntentActivities.size() == 0) {
            this.A01.setVisibility(8);
            A00 = null;
        } else {
            if (queryIntentActivities.size() == 1) {
                if (A02(61, 18, 67).equals(queryIntentActivities.get(0).activityInfo.packageName)) {
                    EnumC0803Lm enumC0803Lm = EnumC0803Lm.BROWSER_LAUNCH_CHROME;
                    if (A06[5].length() == 31) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A06;
                    strArr[6] = "ER9o4D5KfsgKq";
                    strArr[0] = "PVCMoHz4n3Ffn";
                    A00 = C0804Ln.A00(enumC0803Lm);
                }
            }
            A00 = C0804Ln.A00(EnumC0803Lm.BROWSER_LAUNCH_NATIVE);
        }
        this.A01.setImageBitmap(A00);
    }
}