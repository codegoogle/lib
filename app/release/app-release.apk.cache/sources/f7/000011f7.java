package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.g15;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.xbill.DNS.Flags;

/* loaded from: assets/audience_network.dex */
public final class KF {
    public static byte[] A08;
    public static String[] A09;
    public static final ThreadFactoryC0798Lh A0A;
    public static final Executor A0B;
    public KC A01;
    public KE A02;
    @Nullable
    public String A03;
    public Map<String, String> A04;
    public final C1080Wh A05;
    public long A00 = -1;
    public final KG A06 = KG.A00();
    public final String A07 = KJ.A00();

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 80);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A08 = new byte[]{50, 107, ax5.a, 62, 59, 105, 50, 122, 105, 107, 119, 117, 78, 65, 68, 72, 67, 89, 82, 95, 72, 92, 88, 72, 94, 89, 82, 68, 73, 98, 88, Flags.CD, 121, 101, 17, Flags.CD, 100, 101, 10, 108, 99, 102, 102, 10, 88, 79, 73, 79, 67, 92, 79, 78, 20, 53, 122, 28, 51, 54, 54, 122, ax5.a, 40, 40, 53, 40, 122, 57, 53, 62, ax5.a, 122, 1, g15.c, 41, 7, 122, g15.c, 41, 38, 7, 72, 6, 13, 28, 31, 7, 26, 3, 72, Flags.CD, 7, 6, 6, 13, Flags.CD, 28, 1, 7, 6, 88, 90, 81, 90, 77, 86, 92, 40, 35, 50, 49, 41, 52, 45, 55, 54, 31, 48, 53, 53, 17, 54, 54, 50};
    }

    public static void A0D() {
        A09 = new String[]{"jHqhq9rNYSSw", "oXXasJZKheaqJc0eeEDaqL9fqatR6yjH", "HZfV4vlkHnOHSqnfuZFUyeF6uFp1ZMa", "ctGGwCiuI8x2mhpb6iYaTSYvEv38GMVI", "hooRY0JbS2MOmGEMLhPLLpjKFYik6yA6", "UUaZIloNsnWPLtNmJ6BLiWitv8uuoCfe", "8CdfBsPlUzO8votQ5auuotJRUMhSpJIA", "YHWLBZkCs2mlLEga5omnGJot9WkTYHBz"};
    }

    static {
        A0D();
        A0C();
        A0A = new ThreadFactoryC0798Lh();
        A0B = Executors.newCachedThreadPool(A0A);
    }

    public KF(C1080Wh c1080Wh) {
        this.A05 = c1080Wh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC0907Pn A04(long j) {
        return new C1224ap(this, j);
    }

    private void A0B() {
        C1080Wh c1080Wh = this.A05;
        if (c1080Wh == null || !Q4.A0C(c1080Wh)) {
            return;
        }
        C04858j c04858j = new C04858j(A06(7, 5, 107));
        c04858j.A03(1);
        this.A05.A04().A82(A06(106, 7, 22), C04848i.A1c, c04858j);
    }

    private void A0E(int i, String str) {
        String A06 = A06(113, 10, 9);
        K0.A05(A06, A06(36, 16, 122), A06(0, 7, 90));
        K0.A04(A06, String.format(Locale.US, A06(52, 26, 10), Integer.valueOf(i), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(C0755Jm c0755Jm) {
        KE ke = this.A02;
        if (ke != null) {
            ke.A9X(c0755Jm);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(C0755Jm c0755Jm) {
        LZ.A00(new C1221am(this, c0755Jm));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(C1204aV c1204aV) {
        KE ke = this.A02;
        if (ke != null) {
            ke.AB3(c1204aV);
        }
    }

    private void A0N(C1204aV c1204aV) {
        QN A0C;
        LZ.A00(new C1222an(this, c1204aV));
        if (J8.A1O(this.A05) && (A0C = XG.A02().A0C()) != null) {
            A0C.A59();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O(String str, long j) {
        String str2;
        try {
            KI A06 = this.A06.A06(this.A05, str, j, this.A03);
            AnonymousClass90 A00 = A06.A00();
            C04285v.A06(this.A05.A00(), str);
            if (A00 != null) {
                J8.A0M(this.A05).A1m(A00.A08());
                DynamicLoaderFactory.makeLoader(this.A05).getInitApi().maybeAttachCrashListener(this.A05);
                AnonymousClass23.A0P(this.A05.A00(), A00.A06());
                KB.A06(A00.A05().A0B(), this.A01);
                C0809Ls.A01(this.A05, A0B, A00);
                C04858j c04858j = new C04858j(A06(29, 7, 123) + LA.A02());
                c04858j.A04(1);
                c04858j.A07(false);
                this.A05.A04().A8O(A06(99, 7, 111), C04848i.A1E, c04858j);
            }
            int i = KD.A00[A06.A01().ordinal()];
            if (i == 1) {
                C1204aV c1204aV = (C1204aV) A06;
                if (A00 != null) {
                    if (A00.A05().A0E()) {
                        KB.A08(str, this.A01);
                    }
                    if (this.A04 != null) {
                        str2 = this.A04.get(A06(12, 17, 93));
                    } else {
                        str2 = null;
                    }
                    if (!TextUtils.isEmpty(A06.A02()) && !TextUtils.isEmpty(str2)) {
                        new J6(this.A05, str2, A06.A02()).A0C();
                    }
                }
                this.A05.A0A().A2n(LW.A01(this.A00));
                A0N(c1204aV);
            } else if (i != 2) {
                AdErrorType adErrorType = AdErrorType.UNKNOWN_RESPONSE;
                this.A05.A0A().A2m(LW.A01(this.A00), adErrorType.getErrorCode(), str, adErrorType.isPublicError());
                A0G(C0755Jm.A02(adErrorType, str));
            } else {
                C1203aU c1203aU = (C1203aU) A06;
                String finalErrMessage = c1203aU.A04();
                AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c1203aU.A03(), AdErrorType.ERROR_MESSAGE);
                A0E(c1203aU.A03(), finalErrMessage);
                if (finalErrMessage == null) {
                    finalErrMessage = str;
                }
                this.A05.A0A().A2m(LW.A01(this.A00), adErrorTypeFromCode.getErrorCode(), finalErrMessage, adErrorTypeFromCode.isPublicError());
                A0G(C0755Jm.A02(adErrorTypeFromCode, finalErrMessage));
            }
        } catch (Exception e) {
            String errorMessage = e.getMessage();
            AdErrorType adErrorType2 = AdErrorType.PARSER_FAILURE;
            C0S A0A2 = this.A05.A0A();
            long A01 = LW.A01(this.A00);
            int errorCode = adErrorType2.getErrorCode();
            boolean isPublicError = adErrorType2.isPublicError();
            if (A09[2].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A09;
            strArr[3] = "KiE48ndyzelvmzNW6bdZaRvZ6MMpVlPo";
            strArr[1] = "apnThSuxD28F5jipUISQB7XXqWmqfDCi";
            A0A2.A2m(A01, errorCode, errorMessage, isPublicError);
            A0G(C0755Jm.A02(adErrorType2, errorMessage));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0P(String str, long j) {
        A0B.execute(new C1227as(this, str, j));
    }

    public final void A0Q(KC kc) {
        this.A00 = System.currentTimeMillis();
        if (LU.A00(this.A05) == LT.A07) {
            A0B();
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String A06 = A06(78, 21, 56);
            this.A05.A0A().A2m(LW.A01(this.A00), adErrorType.getErrorCode(), A06, adErrorType.isPublicError());
            A0G(new C0755Jm(adErrorType, A06));
            return;
        }
        this.A01 = kc;
        C04938r.A0B(this.A05);
        if (KB.A09(kc)) {
            String A02 = KB.A02(kc);
            if (A02 != null) {
                this.A05.A0A().ADg();
                A0P(A02, 0L);
                return;
            }
            AdErrorType adErrorType2 = AdErrorType.LOAD_TOO_FREQUENTLY;
            this.A05.A0A().A2m(LW.A01(this.A00), adErrorType2.getErrorCode(), adErrorType2.getDefaultErrorMessage(), adErrorType2.isPublicError());
            A0G(C0755Jm.A02(adErrorType2, null));
            return;
        }
        A0B.execute(new C1230av(this, kc));
    }

    public final void A0R(KE ke) {
        this.A02 = ke;
    }
}