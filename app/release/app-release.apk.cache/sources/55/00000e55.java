package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4W  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C4W implements Runnable {
    public static byte[] A07;
    public static String[] A08;
    public OverScroller A01;
    public int A02;
    public int A03;
    public final /* synthetic */ ES A06;
    public Interpolator A00 = ES.A1A;
    public boolean A04 = false;
    public boolean A05 = false;

    static {
        A04();
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 32);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{-46, -42, -96, -45, -29, -14, -17, -20, -20};
    }

    public static void A04() {
        A08 = new String[]{"c4xSVVt4fNiIZ9aJ0ftrOCVpKy2EJW", "bj77oS7wYHzhrY124YppwtIfPTuDoAHL", "mRmZUQV2DMpprRsDQaH8Mtbq5JuQtR14", "UXM5", "qfxFRQLCBxpF20va4RNO9ygLlTXV5cTV", "Bw29gSSAA0erG37CQVEqOkFPeCj6ZZr8", "KVIri1u0fbW7r5jnncTGzAnirlJcKx", "TA0EOfT3Z02jNldii3VIEnkki3"};
    }

    public C4W(ES es) {
        this.A06 = es;
        this.A01 = new OverScroller(es.getContext(), ES.A1A);
    }

    private float A00(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    private int A01(int absDx, int absDy, int i, int i2) {
        int i3;
        int containerSize = Math.abs(absDx);
        int halfContainerSize = Math.abs(absDy);
        boolean z = containerSize > halfContainerSize;
        int sqrt = (int) Math.sqrt((i * i) + (i2 * i2));
        int sqrt2 = (int) Math.sqrt((absDx * absDx) + (absDy * absDy));
        ES es = this.A06;
        int width = z ? es.getWidth() : es.getHeight();
        int delta = width / 2;
        float A00 = delta + (delta * A00(Math.min(1.0f, (sqrt2 * 1.0f) / width)));
        if (sqrt > 0) {
            i3 = Math.round(Math.abs(A00 / sqrt) * 1000.0f) * 4;
        } else {
            if (!z) {
                containerSize = halfContainerSize;
            }
            i3 = (int) (((containerSize / width) + 1.0f) * 300.0f);
        }
        return Math.min(i3, 2000);
    }

    private final void A05() {
        this.A05 = false;
        this.A04 = true;
    }

    private final void A06() {
        this.A04 = false;
        if (this.A05) {
            A08();
        }
    }

    private final void A07(int i, int i2, int i3, int i4) {
        A0C(i, i2, A01(i, i2, i3, i4));
    }

    public final void A08() {
        if (this.A04) {
            this.A05 = true;
            return;
        }
        this.A06.removeCallbacks(this);
        if (A08[4].charAt(10) == 'o') {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[2] = "DBTzn4opHB64KJUt1kyQdTPFEm6jko5S";
        strArr[2] = "DBTzn4opHB64KJUt1kyQdTPFEm6jko5S";
        C2u.A0C(this.A06, this);
    }

    public final void A09() {
        this.A06.removeCallbacks(this);
        this.A01.abortAnimation();
    }

    public final void A0A(int i, int i2) {
        this.A06.setScrollState(2);
        this.A03 = 0;
        this.A02 = 0;
        this.A01.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        A08();
    }

    public final void A0B(int i, int i2) {
        A07(i, i2, 0, 0);
    }

    public final void A0C(int i, int i2, int i3) {
        A0D(i, i2, i3, ES.A1A);
    }

    public final void A0D(int i, int i2, int i3, Interpolator interpolator) {
        if (this.A00 != interpolator) {
            this.A00 = interpolator;
            this.A01 = new OverScroller(this.A06.getContext(), interpolator);
        }
        this.A06.setScrollState(2);
        this.A03 = 0;
        this.A02 = 0;
        this.A01.startScroll(0, 0, i, i2, i3);
        if (Build.VERSION.SDK_INT < 23) {
            OverScroller overScroller = this.A01;
            if (A08[7].length() != 26) {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[2] = "UeYo97OquvC2FnZv3LivDSVIricXCoYT";
            strArr[2] = "UeYo97OquvC2FnZv3LivDSVIricXCoYT";
            overScroller.computeScrollOffset();
        }
        A08();
    }

    public final void A0E(int i, int i2, Interpolator interpolator) {
        int A01 = A01(i, i2, 0, 0);
        if (interpolator == null) {
            interpolator = ES.A1A;
        }
        A0D(i, i2, A01, interpolator);
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x02a6, code lost:
        if (r15 != 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02c0, code lost:
        if (r9.A08() < r11) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02c2, code lost:
        r9.A0B(r11 - 1);
        r9.A05(r5 - r1, r4 - r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02d0, code lost:
        r9.A05(r5 - r1, r4 - r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02e8, code lost:
        if (r9 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02fd, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ec, code lost:
        if (r9 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f2, code lost:
        if (r9.A0F() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f8, code lost:
        if (r9.A0G() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00fa, code lost:
        r11 = r21.A06.A0s.A03();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0102, code lost:
        if (r11 != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0104, code lost:
        r9.A0A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0114, code lost:
        if (com.facebook.ads.redexgen.X.C4W.A08[4].charAt(10) == 'o') goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0116, code lost:
        r12 = com.facebook.ads.redexgen.X.C4W.A08;
        r12[3] = "TGS8taa2nLIFayhr7f7v";
        r12[3] = "TGS8taa2nLIFayhr7f7v";
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0190, code lost:
        if (r15 != 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0192, code lost:
        r21.A06.A1Z(r14, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0197, code lost:
        if (r14 != 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0199, code lost:
        if (r1 == r7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x019b, code lost:
        r1 = r0.getFinalX();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x019f, code lost:
        if (r1 != 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01a1, code lost:
        if (r13 != 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a3, code lost:
        if (r0 == r6) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a9, code lost:
        if (r0.getFinalY() != 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01ab, code lost:
        r0.abortAnimation();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0227, code lost:
        if (r0 == false) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0210  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int[] iArr;
        boolean awakenScrollBars;
        boolean fullyConsumedVertical;
        boolean fullyConsumedVertical2;
        if (this.A06.A06 == null) {
            A09();
            if (A08[2].charAt(8) != 'G') {
                String[] strArr = A08;
                strArr[3] = "wyRlewweBEsEMs9L1doa5ZD019uED4";
                strArr[3] = "wyRlewweBEsEMs9L1doa5ZD019uED4";
                return;
            }
        } else {
            A05();
            this.A06.A1K();
            OverScroller overScroller = this.A01;
            C4S c4s = this.A06.A06.A02;
            if (overScroller.computeScrollOffset()) {
                iArr = this.A06.A16;
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int y = this.A02;
                int i = currX - y;
                int y2 = this.A03;
                int i2 = currY - y2;
                int i3 = 0;
                int i4 = 0;
                this.A02 = currX;
                this.A03 = currY;
                int dx = 0;
                int overscrollY = 0;
                if (this.A06.A1z(i, i2, iArr, null, 1)) {
                    i -= iArr[0];
                    i2 -= iArr[1];
                }
                if (this.A06.A04 != null) {
                    this.A06.A1L();
                    this.A06.A1M();
                    C2H.A01(A02(0, 9, 96));
                    ES es = this.A06;
                    es.A1m(es.A0s);
                    if (i != 0) {
                        i3 = this.A06.A06.A1i(i, this.A06.A0r, this.A06.A0s);
                        dx = i - i3;
                    }
                    if (i2 != 0) {
                        i4 = this.A06.A06.A1j(i2, this.A06.A0r, this.A06.A0s);
                        overscrollY = i2 - i4;
                    }
                    C2H.A00();
                    if (A08[4].charAt(10) != 'o') {
                        String[] strArr2 = A08;
                        strArr2[7] = "AEnMZuqp98GVRFTkSbmwbA51QL";
                        strArr2[7] = "AEnMZuqp98GVRFTkSbmwbA51QL";
                        this.A06.A1Q();
                        this.A06.A1N();
                        this.A06.A1s(false);
                    } else {
                        this.A06.A1Q();
                        this.A06.A1N();
                        this.A06.A1s(false);
                    }
                }
                if (!this.A06.A0v.isEmpty()) {
                    this.A06.invalidate();
                }
                if (this.A06.getOverScrollMode() != 2) {
                    this.A06.A1a(i, i2);
                }
                if (!this.A06.A1y(i3, i4, dx, overscrollY, null, 1) && (dx != 0 || overscrollY != 0)) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i5 = 0;
                    if (dx != currX) {
                        if (dx < 0) {
                            i5 = -currVelocity;
                        } else {
                            i5 = dx > 0 ? currVelocity : 0;
                        }
                    }
                    if (overscrollY != currY) {
                        if (overscrollY < 0) {
                            currVelocity = -currVelocity;
                        } else if (overscrollY <= 0) {
                            currVelocity = 0;
                        }
                    } else {
                        currVelocity = 0;
                    }
                    int overScrollMode = this.A06.getOverScrollMode();
                    String[] strArr3 = A08;
                    if (strArr3[5].charAt(12) != strArr3[1].charAt(12)) {
                        String[] strArr4 = A08;
                        strArr4[7] = "VAPByUbSVbCRl876Iw5SK7wrPn";
                        strArr4[7] = "VAPByUbSVbCRl876Iw5SK7wrPn";
                    }
                }
                if (i3 != 0 || i4 != 0) {
                    ES es2 = this.A06;
                    String[] strArr5 = A08;
                    String str = strArr5[6];
                    String str2 = strArr5[0];
                    int velY = str.length();
                    if (velY != str2.length()) {
                        es2.A1c(i3, i4);
                    } else {
                        String[] strArr6 = A08;
                        strArr6[6] = "bSHjdsVkhDQdmG1cm4T37Ejfm8kVFC";
                        strArr6[0] = "uWlM2d1CCrIfar3HOPPYeFU5881RH0";
                        es2.A1c(i3, i4);
                    }
                }
                awakenScrollBars = this.A06.awakenScrollBars();
                if (!awakenScrollBars) {
                    this.A06.invalidate();
                }
                int velY2 = (i2 != 0 && this.A06.A06.A26() && i4 == i2) ? 1 : 0;
                if (i != 0) {
                    boolean fullyConsumedVertical3 = this.A06.A06.A25();
                    if (fullyConsumedVertical3 && i3 == i) {
                        fullyConsumedVertical = true;
                        boolean z = (i != 0 && i2 == 0) || fullyConsumedVertical || velY2 != 0;
                        boolean isFinished = overScroller.isFinished();
                        if (A08[4].charAt(10) != 'o') {
                            throw new RuntimeException();
                        }
                        String[] strArr7 = A08;
                        strArr7[2] = "98aPJs2vUpcbHQSYyxrV3zG03CSHn11I";
                        strArr7[2] = "98aPJs2vUpcbHQSYyxrV3zG03CSHn11I";
                        if (!isFinished) {
                            if (!z) {
                                boolean fullyConsumedVertical4 = this.A06.A1w(1);
                            }
                            A08();
                            if (this.A06.A03 != null) {
                                this.A06.A03.A0C(this.A06, i, i2);
                            }
                        }
                        this.A06.setScrollState(0);
                        fullyConsumedVertical2 = ES.A1E;
                        if (fullyConsumedVertical2) {
                            this.A06.A02.A03();
                        }
                        this.A06.A1Y(1);
                    }
                }
                fullyConsumedVertical = false;
                if (i != 0) {
                }
                boolean isFinished2 = overScroller.isFinished();
                if (A08[4].charAt(10) != 'o') {
                }
            }
            if (c4s != null) {
                boolean A0F = c4s.A0F();
                String[] strArr8 = A08;
                if (strArr8[5].charAt(12) != strArr8[1].charAt(12)) {
                    String[] strArr9 = A08;
                    strArr9[6] = "1QtdEsEbLTCaQSWKyl1hJXPObs6yvI";
                    strArr9[0] = "gIBnLdKBfiMzk6Ug2irxti7V3sW67K";
                    if (A0F) {
                        c4s.A05(0, 0);
                    }
                    if (!this.A05) {
                        c4s.A0A();
                    }
                }
            }
            A06();
            return;
        }
        throw new RuntimeException();
    }
}