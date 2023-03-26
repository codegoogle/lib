package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.DefaultMediaViewVideoRenderer;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.AdComponentView;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdComponentViewParentApi;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.Repairable;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import com.p7700g.p99005.yg1;
import java.util.Arrays;
import java.util.List;
import org.xbill.DNS.Flags;

/* loaded from: assets/audience_network.dex */
public final class T3 extends AnonymousClass56 implements MediaViewApi, Repairable, C8F {
    public static byte[] A0D;
    public static String[] A0E;
    public static final String A0F;
    public View A00;
    public ImageView A01;
    public MediaView A02;
    @Nullable
    public MediaViewListener A03;
    public MediaViewVideoRenderer A04;
    public ES A05;
    public AdComponentViewParentApi A06;
    public C1080Wh A07;
    public C1U A08;
    public NR A09;
    @Nullable
    public OV A0A;
    public boolean A0B;
    public boolean A0C;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 47);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A0D = new byte[]{56, 26, 9, 20, 14, 8, 30, 23, 91, 9, 30, 21, 31, 30, 9, 30, 9, 91, 22, 14, 8, 15, 91, 25, 30, 91, 8, 30, 15, 91, 25, 30, 29, 20, 9, 30, 91, 21, 26, 15, 18, 13, 30, 58, 31, 85, 26, 30, 29, 41, 56, 53, 57, 50, ax5.a, 57, 18, 57, 40, 43, 51, 46, 55, 64, 100, 104, 110, 108, 41, 123, 108, 103, 109, 108, 123, 108, 123, 41, 100, 124, 122, 125, 41, 107, 108, 41, 122, 108, 125, 41, 107, 108, 111, 102, 123, 108, 41, 103, 104, 125, 96, g15.c, 108, 72, 109, 39, 96, 68, 72, 78, 76, 9, 91, 76, 71, 77, 76, 91, 76, 91, 9, 68, 92, 90, 93, 9, 75, 76, 9, 90, 76, 93, 9, 75, 76, 79, 70, 91, 76, 9, 71, 72, 93, 64, 95, 76, 107, 72, 71, 71, 76, 91, 104, 77, 7, 18, 53, 45, 58, 55, 50, ax5.a, 123, 13, 50, 62, 44, 123, 56, 52, 53, 40, 47, 41, 46, 56, 47, 52, 41, 123, 43, 58, 41, 58, 54, 40, 123, 47, 34, 43, 62, 117, 1, 46, 59, 38, 57, bx.W5, 111, 14, 43, 111, 6, 44, 32, 33, 111, 38, 60, 111, 33, 58, 35, 35, 97, Flags.CD, 52, 57, 56, 50, 125, 47, 56, 51, 57, 56, 47, 56, 47, 125, 48, 40, 46, 41, 125, ax5.a, 56, 125, 46, 56, 41, 125, ax5.a, 56, 59, 50, 47, 56, 125, 51, 60, 41, 52, 43, 56, 28, 57, 115, 26, Flags.CD, 18, 117, 106, 103, 102, 108, 86, 113, 111, 62};
    }

    public static void A06() {
        A0E = new String[]{"5egxRyJvv3hsImr6xVPVZGZzS", "S92E58UIdGCmPOb4LYA51SRur0tU5vPU", "gB2LJBWgacco1yi3dwEv6yCRJyLib4yq", "IRYDxixZynQ1VjnPzR0JfxvjieAE", "Yx6PPUM30uHFy3rHO75LIsUaVykI", "YSQgGTlHzzB", "fqdcFq1cD4m6uZ0nLvDLKOa7nCA9CaYH", "MqJIv4BM2hfR6AMSoGkEEGT8SPZgcE8o"};
    }

    static {
        A06();
        A05();
        A0F = MediaView.class.getSimpleName();
    }

    private void A03() {
        if (!this.A0C) {
            ES es = this.A05;
            String[] strArr = A0E;
            if (strArr[4].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[5] = "HiqmuX4YAHl";
            strArr2[0] = "JtgDxExoVYEb5OmxUIRsQ7gjV";
            if (es != null) {
                C0795Le.A0M(this.A08);
            }
            float f = C0795Le.A01;
            int round = Math.round(4.0f * f);
            int round2 = Math.round(12.0f * f);
            this.A08.setChildSpacing(round);
            this.A08.setPadding(0, round2, 0, round2);
            this.A08.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A02.addView(this.A08, layoutParams);
            return;
        }
        throw new IllegalStateException(A02(0, 46, 84));
    }

    private void A04() {
        LC.A04(this.A02, LC.A0A);
        LC.A04(this.A09, LC.A0A);
        LC.A04(this.A04, LC.A0A);
        LC.A04(this.A05, LC.A0A);
    }

    private final void A07(View view, ViewGroup.LayoutParams layoutParams) {
        A02(false);
        this.A02.addView(view, layoutParams);
        A02(true);
    }

    private void A08(View view, C1267bZ c1267bZ) {
        OV ov = this.A0A;
        if (ov != null) {
            MediaView mediaView = this.A02;
            String[] strArr = A0E;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[6] = "tYahJlzELN2bWoIKGOvNb4V2q4om3tal";
            strArr2[2] = "knO8IZUpKtredd0Q2IkvjJrJQGpJW1Qq";
            mediaView.removeView(ov);
        }
        if (!c1267bZ.A1V()) {
            return;
        }
        String A16 = c1267bZ.A16();
        Context context = this.A02.getContext();
        String[] strArr3 = A0E;
        if (strArr3[5].length() != strArr3[0].length()) {
            String[] strArr4 = A0E;
            strArr4[4] = "LedcnhOkj71a4gNr9a9uwwPVwkpS";
            strArr4[3] = "bOPNktfa058vxRDYU7HJ2aiUk3a2";
            if (context == null) {
                return;
            }
        } else if (context == null) {
            return;
        }
        OV A01 = OU.A01(this.A07, A16);
        if (A0E[7].charAt(21) != 'L') {
            String[] strArr5 = A0E;
            strArr5[1] = "IBU68ioTGuVBWJ1dkmCJ7UK76Osi7EVF";
            strArr5[1] = "IBU68ioTGuVBWJ1dkmCJ7UK76Osi7EVF";
            this.A0A = A01;
            if (this.A0A == null) {
                return;
            }
        } else {
            this.A0A = A01;
            if (this.A0A == null) {
                return;
            }
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(5, view.getId());
        layoutParams.addRule(7, view.getId());
        layoutParams.addRule(6, view.getId());
        layoutParams.addRule(8, view.getId());
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.addRule(16, view.getId());
            layoutParams.addRule(17, view.getId());
        }
        A07(this.A0A, layoutParams);
        this.A06.bringChildToFront(this.A0A);
    }

    private void A09(ImageView imageView) {
        if (!this.A0C) {
            ImageView imageView2 = this.A01;
            String[] strArr = A0E;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[6] = "9onWrVOda1qlu0pAvyXYf5LKITz29A5r";
            strArr2[2] = "G6pev0JETY7bhqmEZOziJsmCoQM1bBBX";
            if (imageView2 != null) {
                C0795Le.A0M(imageView2);
            }
            imageView.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A02.addView(imageView, layoutParams);
            imageView.setId(C0795Le.A00());
            this.A01 = imageView;
            return;
        }
        throw new IllegalStateException(A02(106, 49, 6));
    }

    @TargetApi(21)
    private final void A0A(C1080Wh c1080Wh, AttributeSet attributeSet, int i, int i2, MediaView mediaView) {
        this.A02 = mediaView;
        A09(new ImageView(c1080Wh, attributeSet, i, i2));
        A0F(new NR(c1080Wh, attributeSet, i, i2));
        this.A08 = new C1U(c1080Wh, attributeSet, i);
        A03();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1080Wh, attributeSet, i, i2));
        A04();
    }

    private final void A0B(C1080Wh c1080Wh, AttributeSet attributeSet, int i, MediaView mediaView) {
        this.A02 = mediaView;
        A09(new ImageView(c1080Wh, attributeSet, i));
        A0F(new NR(c1080Wh, attributeSet, i));
        this.A08 = new C1U(c1080Wh, attributeSet, i);
        A03();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1080Wh, attributeSet, i));
        A04();
    }

    private final void A0C(C1080Wh c1080Wh, AttributeSet attributeSet, MediaView mediaView) {
        this.A02 = mediaView;
        A09(new ImageView(c1080Wh, attributeSet));
        A0F(new NR(c1080Wh, attributeSet));
        this.A08 = new C1U(c1080Wh, attributeSet);
        A03();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1080Wh, attributeSet));
        A04();
    }

    private final void A0D(C1080Wh c1080Wh, MediaView mediaView) {
        this.A02 = mediaView;
        A09(new ImageView(c1080Wh));
        A0F(new NR(c1080Wh));
        this.A08 = new C1U(c1080Wh);
        A03();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1080Wh));
        A04();
    }

    private void A0E(C1267bZ c1267bZ, boolean z, JZ jz) {
        AsyncTaskC1091Ws A05 = new AsyncTaskC1091Ws(this.A01, this.A07).A05();
        if (z) {
            A05.A07(new C0993Sy(this, c1267bZ));
        }
        A05.A08(jz.getUrl());
    }

    private void A0F(NR nr) {
        if (!this.A0C) {
            NR nr2 = this.A09;
            if (nr2 != null) {
                this.A02.removeView(nr2);
            }
            nr.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A02.addView(nr, layoutParams);
            this.A09 = nr;
            return;
        }
        throw new IllegalStateException(A02(63, 43, 38));
    }

    private boolean A0G(NativeAd nativeAd) {
        List<NativeAd> A04 = ((C5D) nativeAd.getNativeAdApi()).A04();
        if (A04 == null) {
            return false;
        }
        for (NativeAd childNativeAd : A04) {
            if (childNativeAd.getAdCoverImage() == null) {
                return false;
            }
        }
        return true;
    }

    private boolean A0H(NativeAd nativeAd) {
        return Build.VERSION.SDK_INT >= 14 && !TextUtils.isEmpty(((C5D) nativeAd.getNativeAdApi()).A03());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x010a, code lost:
        if (r7 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x010c, code lost:
        r3.A0x().A0A().AD7(com.facebook.ads.redexgen.X.EnumC02840d.A08);
        r3.A1T(r9.A0B);
        r9.A00 = r9.A04.getMediaViewVideoRendererApi().getVideoView();
        r9.A09.setVisibility(8);
        r9.A09.setImage(null, null);
        r0 = r9.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0136, code lost:
        if (r0 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0138, code lost:
        r0.setVisibility(8);
        r5 = com.facebook.ads.redexgen.X.T3.A0E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x014b, code lost:
        if (r5[5].length() == r5[0].length()) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x014d, code lost:
        r5 = com.facebook.ads.redexgen.X.T3.A0E;
        r5[4] = "yqBcm6jNekaOStoZQ6HlGjXfWvjo";
        r5[3] = "wDgm0JyWXySbfCdb16XoSedMN32V";
        r9.A05.setAdapter(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x015e, code lost:
        bringChildToFront(r9.A04);
        r9.A04.setNativeAd(r10);
        ((com.facebook.ads.redexgen.X.C5C) r9.A04.getMediaViewVideoRendererApi()).A05(r10);
        r9.A04.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x017c, code lost:
        if (r3.getAdCoverImage() == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x017e, code lost:
        new com.facebook.ads.redexgen.X.AsyncTaskC1091Ws(r9.A02, r9.A07).A06(r9.A02.getHeight(), r9.A02.getWidth()).A07(new com.facebook.ads.redexgen.X.T0(r9, r3)).A08(r3.getAdCoverImage().getUrl());
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01af, code lost:
        if (com.facebook.ads.internal.api.BuildConfigApi.isDebug() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01b1, code lost:
        r5 = com.facebook.ads.redexgen.X.T3.A0F;
        android.util.Log.i(r5, A02(261, 9, 44) + ((com.facebook.ads.redexgen.X.C5D) r10.getNativeAdApi()).A03());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01d9, code lost:
        A08(r9.A04, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01ec, code lost:
        if (r7 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01f4, code lost:
        if (r10.getAdCoverImage() == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01f6, code lost:
        r3.A0x().A0A().AD7(com.facebook.ads.redexgen.X.EnumC02840d.A06);
        r9.A00 = r9.A09.getBodyImageView();
        r9.A04.setVisibility(8);
        r9.A04.unsetNativeAd();
        ((com.facebook.ads.redexgen.X.C5C) r9.A04.getMediaViewVideoRendererApi()).A04();
        r0 = r9.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0222, code lost:
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0224, code lost:
        r0.setVisibility(8);
        r9.A05.setAdapter(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x022c, code lost:
        bringChildToFront(r9.A09);
        r9.A09.setVisibility(0);
        new com.facebook.ads.redexgen.X.AsyncTaskC1091Ws(r9.A09, r9.A07).A06(r9.A02.getHeight(), r9.A02.getWidth()).A07(new com.facebook.ads.redexgen.X.T1(r9, r3)).A08(r3.getAdCoverImage().getUrl());
        A08(r9.A09, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0275, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0I(NativeAd nativeAd) {
        RP c0639Ev;
        C1080Wh A0x = ((C1267bZ) nativeAd.getInternalNativeAd()).A0x();
        A0x.A0C(this);
        this.A07.A0D(A0x);
        this.A07.A0B(A0x.A0A());
        boolean z = true;
        this.A0C = true;
        C1267bZ A0J = C1267bZ.A0J(nativeAd.getInternalNativeAd());
        A0J.A1K(this.A02);
        this.A01.setVisibility(8);
        this.A01.setImageDrawable(null);
        if (A0G(nativeAd)) {
            A0J.A0x().A0A().AD7(EnumC02840d.A03);
            EnumC0746Jc A13 = A0J.A13();
            if (A0E[7].charAt(21) == 'L') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[4] = "CvXrj9TTP1W52m7bIbynzmDbx8Ql";
            strArr[3] = "OGerX4RrBYJpkLXwbXTHIjvyoHPN";
            if (A13 != EnumC0746Jc.A0B) {
                z = false;
            }
            this.A05 = this.A08;
            ((C1U) this.A05).setCurrentPosition(0);
            ((C1U) this.A05).setShowTextInCarousel(z);
            if (z) {
                c0639Ev = new C0640Ew(this.A07, (C1U) this.A05, A0J.A1C(), A0J.A12());
            } else {
                c0639Ev = new C0639Ev((C1U) this.A05, A0J.A1C(), this.A07);
            }
            c0639Ev.A0H(new C0994Sz(this, A0J));
            this.A05.setAdapter(c0639Ev);
            this.A00 = this.A05;
            this.A09.setVisibility(8);
            this.A09.setImage(null, null);
            this.A04.setVisibility(8);
            this.A04.unsetNativeAd();
            ((C5C) this.A04.getMediaViewVideoRendererApi()).A04();
            bringChildToFront(this.A05);
            this.A05.setVisibility(0);
            A08(this.A05, A0J);
            return;
        }
        boolean A0H = A0H(nativeAd);
        String[] strArr2 = A0E;
        if (strArr2[4].length() != strArr2[3].length()) {
            String[] strArr3 = A0E;
            strArr3[4] = "ZQRbya12lyykx5Eq2uFJ3JGH4lXR";
            strArr3[3] = "SLHysRpGcYp4QaXPRJ4K4uNDdgkD";
        } else {
            String[] strArr4 = A0E;
            strArr4[6] = "txzvXhatra49UDlp2BXEovPdWlOkx37e";
            strArr4[2] = "zmD0GPDFfrMRBXxeFyYC2vHynCiCjpaN";
        }
    }

    public final void A0J(NativeAdBaseApi nativeAdBaseApi, boolean z) {
        C1080Wh A0x = ((C1267bZ) nativeAdBaseApi).A0x();
        this.A07.A0D(A0x);
        A0x.A0C(this);
        this.A0C = true;
        C1267bZ A0J = C1267bZ.A0J(nativeAdBaseApi);
        A0J.A1J(this.A02);
        this.A09.setVisibility(8);
        this.A09.setImage(null, null);
        this.A04.setVisibility(8);
        this.A04.unsetNativeAd();
        ((C5C) this.A04.getMediaViewVideoRendererApi()).A04();
        ES es = this.A05;
        if (es != null) {
            es.setVisibility(8);
            this.A05.setAdapter(null);
        }
        this.A01.setVisibility(0);
        bringChildToFront(this.A01);
        this.A00 = this.A01;
        JZ adIcon = A0J.getAdIcon();
        if (adIcon != null) {
            Bitmap A0I = A0J.A0w().A0I(adIcon.getUrl());
            if (A0I != null) {
                this.A01.setImageBitmap(A0I);
                if (z) {
                    this.A02.post(new C0992Sx(this, A0J));
                }
            } else {
                A0E(A0J, z, adIcon);
            }
        } else {
            InterfaceC1268ba A11 = A0J.A11();
            AdErrorType adErrorType = AdErrorType.NATIVE_AD_IS_NOT_LOADED;
            A0x.A0A().A2d(A0J.A0u(), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
            if (A11 != null) {
                A11.A9X(C0755Jm.A01(adErrorType));
            }
            Log.e(A02(46, 17, 115), adErrorType.getDefaultErrorMessage());
            if (nativeAdBaseApi.isAdLoaded()) {
                this.A07.A04().A82(A02(258, 3, 84), C04848i.A0L, new C04858j(A02(yg1.K, 23, 96)));
            }
        }
        A08(this.A01, A0J);
    }

    public final boolean A0K() {
        ES es = this.A05;
        return es != null && es.getVisibility() == 0;
    }

    @Override // com.facebook.ads.redexgen.X.C8F
    public final C1080Wh A5G() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass56, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void bringChildToFront(View view) {
        if (view == this.A05 || view == this.A04 || view == this.A09 || view == this.A01) {
            this.A06.bringChildToFront(view);
            OV ov = this.A0A;
            if (ov != null) {
                this.A06.bringChildToFront(ov);
            }
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void destroy() {
        this.A04.pause(false);
        this.A04.getMediaViewVideoRendererApi().destroy();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final View getAdContentsView() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final int getMediaHeight() {
        if (this.A09.getVisibility() == 0) {
            return this.A09.getImageHeight();
        }
        if (this.A04.getVisibility() == 0) {
            return this.A04.getMediaViewVideoRendererApi().getVideoView().getHeight();
        }
        if (this.A02.getVisibility() == 0) {
            return this.A02.getHeight();
        }
        if (A0E[1].charAt(24) != 't') {
            String[] strArr = A0E;
            strArr[7] = "3C5Zne3gt6SFfa7y1AnuQltffgpI3Oh8";
            strArr[7] = "3C5Zne3gt6SFfa7y1AnuQltffgpI3Oh8";
            return 0;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final int getMediaWidth() {
        if (this.A09.getVisibility() == 0) {
            return this.A09.getImageWidth();
        }
        if (this.A04.getVisibility() == 0) {
            return this.A04.getMediaViewVideoRendererApi().getVideoView().getWidth();
        }
        if (this.A02.getVisibility() == 0) {
            return this.A02.getWidth();
        }
        String[] strArr = A0E;
        if (strArr[6].charAt(12) != strArr[2].charAt(12)) {
            String[] strArr2 = A0E;
            strArr2[5] = "pFreRfYdfw1";
            strArr2[0] = "pVUprXCJsnglf8IlGtX2XFBaJ";
            return 0;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void initialize(AdViewConstructorParams adViewConstructorParams, MediaView mediaView) {
        this.A07 = AnonymousClass57.A02(adViewConstructorParams.getContext());
        this.A07.A0C(this);
        int initializationType = adViewConstructorParams.getInitializationType();
        if (initializationType == 0) {
            A0D(this.A07, mediaView);
        } else if (initializationType == 1) {
            A0C(this.A07, adViewConstructorParams.getAttributeSet(), mediaView);
        } else if (initializationType == 2) {
            A0B(this.A07, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr(), mediaView);
        } else if (initializationType == 3) {
            A0A(this.A07, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr(), adViewConstructorParams.getDefStyleRes(), mediaView);
        } else {
            throw new IllegalArgumentException(A02(155, 37, 116));
        }
        A02(true);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass56, com.facebook.ads.internal.api.AdComponentViewApi
    public final void onAttachedToView(AdComponentView adComponentView, AdComponentViewParentApi adComponentViewParentApi) {
        super.onAttachedToView(adComponentView, adComponentViewParentApi);
        this.A06 = adComponentViewParentApi;
    }

    @Override // com.facebook.ads.internal.api.Repairable
    public final void repair(Throwable th) {
        int width = this.A02.getWidth();
        int height = this.A02.getHeight();
        if (width > 0 && height > 0) {
            this.A02.repair(th);
            this.A02.getLayoutParams().width = width;
            MediaView mediaView = this.A02;
            if (A0E[1].charAt(24) == 't') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[5] = "Mgb6bOJjyiN";
            strArr[0] = "MTEeDXbdwkPsq4eW7ABfM3WBi";
            mediaView.getLayoutParams().height = height;
            this.A02.setBackgroundColor(-3355444);
            return;
        }
        this.A02.repair(th);
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void setListener(MediaViewListener mediaViewListener) {
        this.A03 = mediaViewListener;
        if (mediaViewListener == null) {
            ((C5C) this.A04.getMediaViewVideoRendererApi()).A08(null);
        } else {
            ((C5C) this.A04.getMediaViewVideoRendererApi()).A08(new T2(this, mediaViewListener));
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void setVideoRenderer(MediaViewVideoRenderer mediaViewVideoRenderer) {
        if (!this.A0C) {
            MediaViewVideoRenderer mediaViewVideoRenderer2 = this.A04;
            if (A0E[7].charAt(21) == 'L') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[6] = "ifAS5bhxfK6Gg4eu5Yemnhg9EBEfp9jT";
            strArr[2] = "R5YDbsM1msNnvJcIFydw3DY2O0brJ9d9";
            if (mediaViewVideoRenderer2 != null) {
                this.A02.removeView(mediaViewVideoRenderer2);
                this.A04.getMediaViewVideoRendererApi().destroy();
            }
            ((C5C) mediaViewVideoRenderer.getMediaViewVideoRendererApi()).A06(this.A07.A06());
            mediaViewVideoRenderer.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            ((T3) this.A02.getMediaViewApi()).A07(mediaViewVideoRenderer, layoutParams);
            this.A04 = mediaViewVideoRenderer;
            this.A0B = !(this.A04 instanceof DefaultMediaViewVideoRenderer);
            mediaViewVideoRenderer.setId(C0795Le.A00());
            return;
        }
        throw new IllegalStateException(A02(215, 43, 114));
    }
}