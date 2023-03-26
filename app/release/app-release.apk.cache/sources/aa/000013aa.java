package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xbill.DNS.WKSRecord;

/* loaded from: assets/audience_network.dex */
public final class RL extends AbstractC02960p {
    public static byte[] A0E;
    public static String[] A0F;
    public View A00;
    @Nullable
    public View A01;
    public EnumC03060z A02;
    public AnonymousClass10 A03;
    public EnumC0746Jc A04;
    @Nullable
    public String A05;
    public List<View> A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final RG A0D;

    static {
        A06();
        A05();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 15);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A0E = new byte[]{-57, -16, -20, -21, -99, -30, -11, -32, -30, -19, -15, -26, -20, -21, -30, -11, -12, -12, -17, -18, -27, -18, -29, -11, -11, -53, -44, -47, -53, -45, -55, -54, -44, -51, -42, -23, -27, -29, -46, -48, bx.l7, -38, -33, -27, -28, -53, -58, -80, -76, -88, -82, -84, -35, -38, -28, -27, -21, -29, -30, -25, -33, -12, -25, -29, -11, -97, -110, -98, -103, -86, -99, -87, -77, -44, -57, -40, -57, -40, -23, -35, -14, -28, -15, -36, -42, bx.j7, -26, bx.j7, -18, -19, -20, -11, -86, -87, -78, -99, -84, -10, -4, -15, -18, -15, -24, -26, -24, -19, -96, -94, -107, -109, -111, -109, -104, -107, -113, -99, -107, -108, -103, -111, -120, 126, -113, 122, -38, -43, -56, -41, -38, -49, -42, -37, -2, -17, 2, -2, -114, -109, -118, g15.c, -44, -62, -43, -47, -36, -43, -46, -43, -42, -34, -43, -103, -116, -120, -102, -114, -127, 125, -113, g15.c, -118, -121, -115, -120, -77, -96, 114, 93, -100, 100, 88, -81, 114, 93, -100, -75, -2, -5, -67, -88, -25, -81, -93, -4, -67, -88, -25, 0};
    }

    public static void A06() {
        A0F = new String[]{"AssHqLhhTyxVt8qn53NKh99glOkg76Zu", "x1ztYNG5B8Yh1fFD9IH28HNLftAJV3DA", "znnjTlsCkULP275jnLAB9UeCHu0mwbQ7", "ZnygQwUKP9vcdRc0ZykdXWpZHZyK4mhg", "TpC7jOiqrQiocH3FafzZC3NFqv5kOY4I", "3gx5dg94KuTf2YQxiOsayTUTecU9lJlq", "0JsvRjae8Zudzo37ubyWjxcMew8uJTBn", "UifaSDkpcUGfPYHJ0LY2wgaMbKOuGMMh"};
    }

    public RL(C1080Wh c1080Wh, AbstractC02970q abstractC02970q, C0901Ph c0901Ph, RG rg) {
        super(c1080Wh, abstractC02970q, c0901Ph);
        this.A02 = EnumC03060z.A03;
        this.A03 = null;
        this.A0D = rg;
    }

    private String A02(View view) {
        try {
            return A04(view).toString();
        } catch (JSONException unused) {
            return A01(0, 14, 110);
        }
    }

    private String A03(View view) {
        int width = view.getWidth();
        String A01 = A01(0, 0, 124);
        if (width <= 0 || view.getHeight() <= 0) {
            return A01;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            createBitmap.setDensity(view.getResources().getDisplayMetrics().densityDpi);
            view.draw(new Canvas(createBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.JPEG, this.A0D.A0E(), byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            return Base64.encodeToString(byteArray, 0);
        } catch (Exception unused) {
            return A01;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0158, code lost:
        if (r5 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x015a, code lost:
        r4 = A01(47, 5, 56);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0165, code lost:
        if (r5 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x016a, code lost:
        if ((r10 instanceof com.facebook.ads.MediaView) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x016c, code lost:
        r4 = A01(56, 9, 111);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x017a, code lost:
        if ((r10 instanceof android.view.ViewGroup) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x017c, code lost:
        r4 = A01(155, 9, 9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private JSONObject A04(View view) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(A01(45, 2, 83), Integer.valueOf(view.getId()));
        jSONObject.putOpt(A01(20, 5, 115), view.getClass());
        boolean z = false;
        jSONObject.putOpt(A01(100, 6, 112), String.format(Locale.US, A01(176, 12, 116), Integer.valueOf(view.getTop()), Integer.valueOf(view.getLeft())));
        jSONObject.putOpt(A01(120, 4, 6), String.format(Locale.US, A01(164, 12, 41), Integer.valueOf(view.getHeight()), Integer.valueOf(view.getWidth())));
        List<View> list = this.A06;
        if (list != null && list.contains(view)) {
            z = true;
        }
        jSONObject.putOpt(A01(25, 9, 89), Boolean.valueOf(z));
        String A01 = A01(144, 7, 88);
        if (view instanceof Button) {
            A01 = A01(14, 6, 113);
        } else {
            boolean z2 = view instanceof TextView;
            String[] strArr = A0F;
            if (strArr[7].charAt(8) != strArr[1].charAt(8)) {
                String[] strArr2 = A0F;
                strArr2[4] = "a1U0qc751PlbEJJxfXyB6O6M8jnkJmpE";
                strArr2[4] = "a1U0qc751PlbEJJxfXyB6O6M8jnkJmpE";
                if (!z2) {
                    boolean z3 = view instanceof ImageView;
                    String[] strArr3 = A0F;
                    if (strArr3[3].charAt(11) != strArr3[2].charAt(11)) {
                        String[] strArr4 = A0F;
                        strArr4[7] = "4Gk3naybi5dFEHdfNJUEACWbr8WBlccD";
                        strArr4[1] = "aD4fSpDvJi0UhN8txhrN3IJ83C3CHKuE";
                    }
                } else if (A0F[0].charAt(27) != 'G') {
                    String[] strArr5 = A0F;
                    strArr5[4] = "nZrAcFVvb29oE4Mlbld53maAIoqkDe3s";
                    strArr5[4] = "nZrAcFVvb29oE4Mlbld53maAIoqkDe3s";
                    A01 = A01(WKSRecord.Service.CISCO_SYS, 4, 123);
                }
            }
            throw new RuntimeException();
        }
        jSONObject.putOpt(A01(WKSRecord.Service.PROFILE, 4, 11), A01);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            JSONArray list2 = new JSONArray();
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                list2.put(A04(viewGroup.getChildAt(i)));
            }
            jSONObject.putOpt(A01(52, 4, 98), list2);
        }
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02960p
    public final void A07(Map<String, String> map) {
        if (this.A0D == null) {
            return;
        }
        EnumC0746Jc enumC0746Jc = this.A04;
        if (enumC0746Jc != null) {
            map.put(A01(97, 3, 121), String.valueOf(enumC0746Jc.A04()));
        }
        if (this.A07) {
            map.put(A01(83, 3, 95), Boolean.TRUE.toString());
        }
        if (this.A0B) {
            map.put(A01(89, 3, 112), Boolean.TRUE.toString());
        }
        if (this.A08) {
            map.put(A01(92, 5, 45), Boolean.TRUE.toString());
        }
        if (this.A00 != null && this.A0D.A0i()) {
            map.put(A01(151, 4, 20), A02(this.A00));
        }
        if (this.A00 != null && this.A0D.A0j()) {
            map.put(A01(124, 8, 88), A03(this.A00));
        }
        if (this.A0A) {
            map.put(A01(86, 3, 105), Boolean.TRUE.toString());
        }
        EnumC03060z enumC03060z = this.A02;
        if (enumC03060z != null) {
            map.put(A01(106, 14, 33), enumC03060z.toString());
        }
        if (this.A09) {
            map.put(A01(140, 4, 80), Boolean.TRUE.toString());
        }
        View view = this.A01;
        if (A0F[0].charAt(27) == 'G') {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[0] = "P6MGDEoKncCrYirOOQ1jmq4l0Ss52l96";
        strArr[0] = "P6MGDEoKncCrYirOOQ1jmq4l0Ss52l96";
        if (view != null) {
            map.put(A01(69, 4, 45), String.valueOf((int) (view.getWidth() / C0795Le.A01)));
            map.put(A01(65, 4, 34), String.valueOf((int) (this.A01.getHeight() / C0795Le.A01)));
        }
        AnonymousClass10 anonymousClass10 = this.A03;
        if (anonymousClass10 != null) {
            map.put(A01(73, 5, 87), anonymousClass10.toString());
        }
        String str = this.A05;
        if (str != null) {
            map.put(A01(34, 11, 98), str);
        }
        if (this.A0C) {
            map.put(A01(78, 5, 108), Boolean.TRUE.toString());
        }
        this.A0D.A0b(map);
    }

    public final void A08(@Nullable View view) {
        this.A01 = view;
    }

    public final void A09(View view) {
        this.A00 = view;
    }

    public final void A0A(EnumC03060z enumC03060z) {
        this.A02 = enumC03060z;
    }

    public final void A0B(AnonymousClass10 anonymousClass10) {
        this.A03 = anonymousClass10;
    }

    public final void A0C(EnumC0746Jc enumC0746Jc) {
        this.A04 = enumC0746Jc;
    }

    public final void A0D(@Nullable String str) {
        this.A05 = str;
    }

    public final void A0E(List<View> clickableViews) {
        this.A06 = clickableViews;
    }

    public final void A0F(boolean z) {
        this.A07 = z;
    }

    public final void A0G(boolean z) {
        this.A08 = z;
    }

    public final void A0H(boolean z) {
        this.A09 = z;
    }

    public final void A0I(boolean z) {
        this.A0A = z;
    }

    public final void A0J(boolean z) {
        this.A0B = z;
    }

    public final void A0K(boolean z) {
        this.A0C = z;
    }
}