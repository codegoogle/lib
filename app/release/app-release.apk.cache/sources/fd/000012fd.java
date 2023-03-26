package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.p7700g.p99005.ax5;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import org.xbill.DNS.Flags;
import org.xbill.DNS.WKSRecord;

@SuppressLint({"ViewConstructor"})
/* loaded from: assets/audience_network.dex */
public final class OY extends FrameLayout {
    public static byte[] A0C;
    public static String[] A0D;
    public static final float A0E;
    public static final RelativeLayout.LayoutParams A0F;
    public int A00;
    public long A01;
    public Map<String, String> A02;
    public final AnonymousClass16 A03;
    public final C1S A04;
    public final C1080Wh A05;
    public final JE A06;
    public final NN A07;
    public final C1098Wz A08;
    public final OW A09;
    public final AtomicBoolean A0A;
    public final AtomicBoolean A0B;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] ^ i3;
            if (A0D[5].length() != 25) {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[4] = "2xsSJQdmJTzWNKbVkLPVv70adF3crTtp";
            strArr[4] = "2xsSJQdmJTzWNKbVkLPVv70adF3crTtp";
            copyOfRange[i4] = (byte) (i5 ^ 37);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A0C = new byte[]{Flags.CD, 47, 29, 33, 44, 52, 44, 47, 33, 40, 12, 41, 52, 5, 22, 23, 13, 10, 3, 68, 1, 22, 22, Flags.CD, 22, 52, 8, 5, 29, 5, 6, 8, 1, 68, 0, Flags.CD, 39, 16, 5, 39, 8, 13, 7, 15, 68, 16, 22, 13, 3, 3, 1, 22, 1, 0, 68, 19, 13, 16, 12, 68, 20, 22, 1, 73, 1, 18, 1, 10, 16, 68, 7, 8, 13, 7, 15, 23, 68, 7, Flags.CD, 17, 10, 16, 68, 5, 10, 0, 68, 32, 1, 8, 5, 29, 106, 86, 91, 67, 91, 88, 86, 95, 123, 94, 73, 108, 83, 95, 77, 103, 104, 109, 103, 111, 119, 58, 59, 50, ax5.a, 39, 100, 120, 117, 109, 117, 118, 120, 113, 89, 66, 70, 72, 67, 48, 34, 37, 24, 49, 46, 34, 48};
    }

    public static void A0A() {
        A0D = new String[]{"2LrpfYyae0azpeRldXrTpIs5j5WolZYJ", "aTWFoH17M5HvBaS06GyoTMgY8LK09kB1", "ZT9jJV1ne", "vwbwskwEgIVHj6V8wHV", "a8UIfMhCahgZVDol7QIaAFMNjSR7v8Rm", "pauq9xVSe1TSbn6Nh8iDWIypG", "tig0s2h3zWgeN1kA13N6tuAlrnUP1dby", "gu60Pcp0oAdbO9RcUpkXMIBgrMh0CW0V"};
    }

    static {
        A0A();
        A09();
        A0E = (int) (C0795Le.A01 * 4.0f);
        A0F = new RelativeLayout.LayoutParams(-1, -1);
    }

    public OY(C1080Wh c1080Wh, AnonymousClass16 anonymousClass16, C1S c1s, JE je, OW ow, Map<String, String> map) {
        super(c1080Wh);
        this.A0A = new AtomicBoolean(false);
        this.A0B = new AtomicBoolean(false);
        this.A01 = -1L;
        this.A00 = 0;
        this.A07 = new XQ() { // from class: com.facebook.ads.redexgen.X.82
            @Override // com.facebook.ads.redexgen.X.NN
            public final void A8t() {
            }

            @Override // com.facebook.ads.redexgen.X.XQ, com.facebook.ads.redexgen.X.NN
            public final void A9b(int i, @Nullable String str) {
                OY.A07(OY.this).set(true);
                OY.A05(OY.this).AA2();
            }

            @Override // com.facebook.ads.redexgen.X.XQ, com.facebook.ads.redexgen.X.NN
            public final void A9i() {
                if (!OY.A07(OY.this).get() && OY.A08(OY.this).compareAndSet(false, true)) {
                    OY.A05(OY.this).A9i();
                }
            }
        };
        this.A05 = c1080Wh;
        this.A03 = anonymousClass16;
        this.A04 = c1s;
        this.A06 = je;
        this.A09 = ow;
        this.A02 = map;
        this.A08 = A04();
        addView(this.A08, A0F);
    }

    public static /* synthetic */ int A00(OY oy) {
        int i = oy.A00;
        oy.A00 = i + 1;
        return i;
    }

    @SuppressLint({"AddJavascriptInterface", "ClickableViewAccessibility"})
    private C1098Wz A04() {
        C1098Wz c1098Wz = new C1098Wz(this.A05, new WeakReference(this.A07), 10);
        c1098Wz.setCornerRadius(A0E);
        c1098Wz.setLogMultipleImpressions(false);
        c1098Wz.setCheckAssetsByJavascriptBridge(false);
        c1098Wz.setWebViewTimeoutInMillis(this.A04.A09());
        c1098Wz.setRequestId(this.A03.A0U());
        c1098Wz.setOnTouchListener(new OX(this));
        WebSettings settings = c1098Wz.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        if (Build.VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(true);
        }
        if (Build.VERSION.SDK_INT > 16) {
            c1098Wz.addJavascriptInterface(new OZ(this.A05, this, this.A06, this.A02, this.A03.A0Q()), A06(0, 12, 104));
        }
        return c1098Wz;
    }

    public static /* synthetic */ OW A05(OY oy) {
        return oy.A09;
    }

    public static /* synthetic */ AtomicBoolean A07(OY oy) {
        return oy.A0B;
    }

    public static /* synthetic */ AtomicBoolean A08(OY oy) {
        return oy.A0A;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b4, code lost:
        if (r3 <= com.facebook.ads.redexgen.X.J8.A0F(r7)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b6, code lost:
        r3 = r9.A09;
        r2 = com.facebook.ads.redexgen.X.OY.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ca, code lost:
        if (r2[0].charAt(14) == r2[7].charAt(14)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cc, code lost:
        r3.A9G();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cf, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d0, code lost:
        r2 = com.facebook.ads.redexgen.X.OY.A0D;
        r2[0] = "1qrV4xG42mjJ5wR1PYF4mguO0xYm8sMw";
        r2[7] = "To2gWJFbGkwQ4PRGYAw3BZd3UXo54AHv";
        r3.A9G();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f3, code lost:
        if (r3 <= com.facebook.ads.redexgen.X.J8.A0F(r7)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f6, code lost:
        r9.A05.A04().A82(r5, com.facebook.ads.redexgen.X.C04848i.A1s, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0B() {
        long currentTimeMillis = System.currentTimeMillis() - this.A01;
        C04858j c04858j = new C04858j(A06(25, 67, 65));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A06(107, 6, 33), this.A00);
            jSONObject.put(A06(113, 5, 123), currentTimeMillis);
            jSONObject.put(A06(126, 5, 8), this.A03.A0Q());
        } catch (JSONException e) {
            Log.e(A06(92, 15, 31), A06(12, 13, 65), e);
        }
        c04858j.A05(jSONObject);
        InterfaceC04838h A04 = this.A05.A04();
        int i = C04848i.A1r;
        if (A0D[2].length() == 31) {
            throw new RuntimeException();
        }
        String[] strArr = A0D;
        strArr[0] = "lhJ8s2Q4sCds7IROMAxOWHrUi0xft2U2";
        strArr[7] = "JiEJ4GJfM63VUjRSw5kXmgHmRai0omG0";
        String A06 = A06(118, 8, 49);
        A04.A83(A06, i, c04858j);
        this.A00 = 0;
        if (J8.A14(this.A05)) {
            C1080Wh c1080Wh = this.A05;
            if (A0D[6].charAt(9) == 'W') {
                String[] strArr2 = A0D;
                strArr2[3] = "";
                strArr2[3] = "";
            }
        } else {
            this.A09.A9G();
        }
    }

    public final void A0C() {
        String A0F2;
        try {
            C1098Wz c1098Wz = this.A08;
            if (!TextUtils.isEmpty(this.A04.A0C())) {
                A0F2 = this.A04.A0C();
            } else {
                A0F2 = this.A04.A0F();
            }
            c1098Wz.loadUrl(A0F2);
        } catch (Exception e) {
            this.A05.A04().A82(A06(WKSRecord.Service.CISCO_TNA, 8, 98), C04848i.A2D, new C04858j(e));
        }
    }

    public final void A0D() {
        this.A08.removeJavascriptInterface(A06(0, 12, 104));
        this.A08.destroy();
    }

    public LX getTouchDataRecorder() {
        return this.A08.getTouchDataRecorder();
    }

    @Nullable
    public C0901Ph getViewabilityChecker() {
        return this.A08.getViewabilityChecker();
    }
}