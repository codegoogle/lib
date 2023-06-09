package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.dynamiclayout.DynamicFullScreenAdView$AdFormatType;
import com.facebook.proguard.annotations.DoNotStrip;
import com.p7700g.p99005.bx;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Qe  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0924Qe extends FrameLayout implements M7 {
    public static byte[] A0L;
    public static String[] A0M;
    public InterfaceC04074z A00;
    @Nullable
    public AnonymousClass51 A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass16 A05;
    public final C7H A06;
    public final C1080Wh A07;
    public final JE A08;
    public final JL A09;
    public final LS A0A;
    public final LX A0B;
    public final M6 A0C;
    public final InterfaceC0818Mb A0D;
    public final NK A0E;
    public final O7 A0F;
    @DoNotStrip
    public final AbstractC0900Pg A0G;
    public final C0901Ph A0H;
    public final String A0I;
    public final LinkedList<String> A0J;
    public final JSONObject A0K;

    static {
        A0D();
        A0C();
    }

    public static String A09(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0L = new byte[]{-83, 115, 108, 111, 111, 108, 110, 115, -96, -106, -92, -95, -101, -106, 123, -96, -90, -105, -92, -104, -109, -107, -105, -117, -114, 124, -113, -102, -103, -100, -98, -109, -104, -111, 112, -109, -104, -109, -99, -110, -113, -114, 82, 81, 79, -99, 81, 83, 101, -92, -89, -107, -88, -77, -78, -75, -73, -84, -79, -86, -106, -73, -92, -75, -73, -88, -89, 107, 106, 104, -74, 106, 108, 126, 19, 18, -27, 7, 24, 13, 26, 13, 24, 29, -12, 5, 25, 23, 9, 8, -52, -53, -55, 23, -53, -51, -33, -87, -88, 123, -99, -82, -93, -80, -93, -82, -77, -116, -97, -83, -81, -89, -97, -98, 98, 97, 95, -83, 97, 99, 117, 23, 9, 24, -27, 25, 24, 12, -17, 9, 29, -52, -53, -55, 23, -53, -48, -53, -55, 23, -53, -51, -33, -40, -54, bx.l7, -89, -58, -40, -54, -101, -103, -90, -40, -40, -54, bx.l7, -40, -115, -116, -118, -40, -116, -111, -116, -118, -40, -116, -114, -19, -32, -36, -18, -55, -36, -40, -37, -16, -53, -26, -54, -33, -26, -18, -97, -98, -100, -22, -98, -96, -78};
    }

    public static void A0D() {
        A0M = new String[]{"Ky6zrcoV7NYtZpO3AnBVhERgUe61TP4A", "7", "MIS71VG0t7feKobdqgnq1TwubiJ1N09z", "nEwmQOfqxRkjYDAAu8TY0n89Pulsb82", "nm6mhrtocmSPL4qM7u9wOkkvqXPHcra", "ADTrDSFqqVysA22fSklmKPGMwsWvvDiN", "oNlgPu", "28CTXOUAXLtNi6XFaROwO0buCKC9QIVi"};
    }

    public C0924Qe(C1080Wh c1080Wh, JE je, M6 m6, AnonymousClass16 anonymousClass16, InterfaceC0818Mb interfaceC0818Mb, @DynamicFullScreenAdView$AdFormatType int i) {
        super(c1080Wh);
        this.A00 = new C0929Qj(this);
        this.A0J = new LinkedList<>();
        this.A0B = new LX();
        this.A0G = new C0928Qi(this);
        this.A04 = true;
        this.A03 = false;
        this.A02 = true;
        this.A07 = c1080Wh;
        this.A08 = je;
        this.A0C = m6;
        this.A05 = anonymousClass16;
        this.A0D = interfaceC0818Mb;
        this.A0I = UUID.randomUUID().toString();
        this.A06 = new C7H(this.A07);
        this.A09 = new JL(this.A05.A0Q(), this.A08);
        this.A0F = new O7(anonymousClass16.A0U(), this.A05.A0M().A0E().A08(), i);
        this.A0K = OE.A01(this.A07, this.A05.A0Y(), this.A06, this.A09, this.A0F);
        this.A0E = new C0925Qf(this, this.A07);
        C0795Le.A0J(1003, this.A0E);
        this.A0H = new C0901Ph(this.A0E, 1, new WeakReference(this.A0G), this.A07);
        this.A0H.A0Y(this.A05.A0G());
        this.A0H.A0Z(this.A05.A0H());
        this.A0A = new LS(this);
        this.A0A.A05(LR.A03);
    }

    private void A0B() {
        OH A0B = new OF(this.A07, this.A05.A0M().A0F(), this.A05.A0O()).A08(this.A05.A0L().A01()).A0B();
        addView(A0B, new FrameLayout.LayoutParams(-1, -1));
        A0B.A04(new C0926Qg(this));
    }

    @SuppressLint({"AddJavascriptInterface"})
    private final void A0E() {
        if (Build.VERSION.SDK_INT > 16) {
            this.A0E.addJavascriptInterface(new OD(this, this.A08, this.A0F, this.A0I, this.A05.A0Q()), A09(7, 16, 9));
        }
        this.A09.A03(JK.A0O, null);
        this.A0E.loadUrl(this.A06.A0L(this.A05.A0R()));
        A0J(String.format(Locale.US, A09(121, 22, 123), this.A0I, A09(1, 6, 21)));
        A0J(String.format(Locale.US, A09(143, 26, 60), Base64.encodeToString(this.A0K.toString().getBytes(), 0).replace(A09(0, 1, 122), A09(0, 0, 58)), this.A0I));
        addView(this.A0E, new FrameLayout.LayoutParams(-1, -1));
        this.A0C.A3L(this, new RelativeLayout.LayoutParams(-1, -1));
        if (Build.VERSION.SDK_INT >= 19) {
            this.A0A.A05(LR.A04);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(21)
    public synchronized void A0F() {
        if (this.A03) {
            while (!this.A0J.isEmpty()) {
                this.A09.A03(JK.A0L, null);
                this.A0E.evaluateJavascript(this.A0J.poll(), null);
            }
        }
    }

    private void A0I(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        new C0843Nb(this.A07, this.A0D.A5i(), this.A0H, this.A0B, this.A08, this.A0C).A08(this.A05.A0Q(), str, new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A0J(String str) {
        this.A0J.offer(str);
        A0F();
    }

    public final void A0M() {
        AnonymousClass51 anonymousClass51 = this.A01;
        if (anonymousClass51 == null) {
            return;
        }
        anonymousClass51.finish(4);
    }

    public final void A0N() {
        this.A04 = true;
    }

    public final void A0O() {
        this.A04 = false;
    }

    public final void A0P() {
        A0I(this.A05.A0M().A0G().A04());
    }

    public final void A0Q() {
        this.A0C.A3s(this.A0D.A5F());
        new C0872Oe(this.A07, this.A0D, this.A05.A0V(), this.A0C).A06();
    }

    public final void A0R() {
        new Handler(Looper.getMainLooper()).post(new C0927Qh(this));
    }

    public final void A0S() {
        this.A0H.A0W();
    }

    public final void A0T(String str) {
        A0I(str);
    }

    public final void A0U(Map<String, String> map) {
        this.A08.A81(this.A05.A0Q(), new NU(map).A04(this.A0H).A06());
    }

    @Override // com.facebook.ads.redexgen.X.M7
    public final void A7r(Intent intent, @Nullable Bundle bundle, AnonymousClass51 anonymousClass51) {
        anonymousClass51.A0L(this.A00);
        this.A01 = anonymousClass51;
        A0E();
        if (this.A05.A0M().A0O()) {
            A0B();
        } else if (!TextUtils.isEmpty(this.A05.A0M().A0E().A08())) {
            A0J(String.format(Locale.US, A09(169, 22, 78), this.A0I));
        }
    }

    @Override // com.facebook.ads.redexgen.X.M7
    public final void AAO(boolean z) {
        if (z) {
            A0J(String.format(Locale.US, A09(49, 25, 26), this.A0I));
        } else {
            A0J(String.format(Locale.US, A09(74, 23, 123), this.A0I));
        }
    }

    @Override // com.facebook.ads.redexgen.X.M7
    public final void AAl(boolean z) {
        if (this.A02) {
            this.A02 = false;
        } else if (A0M[1].length() == 11) {
            throw new RuntimeException();
        } else {
            String[] strArr = A0M;
            strArr[5] = "5WCDyt3aDRAQqvSthuq2O6x8YHnGvtvN";
            strArr[5] = "5WCDyt3aDRAQqvSthuq2O6x8YHnGvtvN";
            if (z) {
                A0J(String.format(Locale.US, A09(23, 26, 1), this.A0I));
            } else {
                A0J(String.format(Locale.US, A09(97, 24, 17), this.A0I));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.M7
    public final void ACg(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.M7
    public final void onDestroy() {
        this.A0A.A03();
        this.A08.A80(this.A05.A0Q(), new NU().A03(this.A0B).A04(this.A0H).A06());
        this.A00 = null;
        this.A01 = null;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setListener(M6 m6) {
    }
}