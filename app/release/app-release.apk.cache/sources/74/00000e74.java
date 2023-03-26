package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import com.facebook.ads.internal.api.Repairable;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.p7700g.p99005.aa;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.dg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.xbill.DNS.Flags;
import org.xbill.DNS.WKSRecord;

/* renamed from: com.facebook.ads.redexgen.X.51 */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass51 implements AudienceNetworkActivityApi, Repairable {
    public static byte[] A0P;
    public static String[] A0Q;
    public int A00;
    public int A02;
    public long A03;
    public long A04;
    public Intent A05;
    public RelativeLayout A06;
    public JL A07;
    public KL A08;
    @Nullable
    public M7 A09;
    public AbstractC0823Mg A0A;
    public NS A0B;
    @Nullable
    public OV A0C;
    public String A0D;
    public String A0E;
    @Nullable
    public String A0F;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final AudienceNetworkActivity A0L;
    public final AudienceNetworkActivityApi A0M;
    public final C1080Wh A0N;
    public final List<InterfaceC04074z> A0O = new ArrayList();
    public int A01 = -1;
    public boolean A0G = false;

    static {
        A08();
        A07();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0P, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 111);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0P = new byte[]{-37, 7, 40, 37, 56, bx.W5, 55, 80, 67, 68, 78, 71, 2, 86, 81, 2, 75, 80, 72, 71, 84, 2, 88, 75, 71, 89, 54, 91, 82, 71, 2, 72, 84, 81, 79, 2, 75, 80, 86, 71, 80, 86, 2, 81, 84, 2, 85, 67, 88, 71, 70, 43, 80, 85, 86, 67, 80, 69, 71, 53, 86, 67, 86, 71, -24, -11, -26, -24, -22, -5, -16, -3, -16, -5, 0, -10, -1, -4, -8, 1, 7, -25, 2, -2, -8, 1, -44, -32, -34, -97, -41, -46, -44, -42, -45, -32, -32, -36, -97, -46, -43, -28, -97, -46, -43, -29, -42, bx.j7, -32, -29, -27, -38, -33, -40, -97, -73, -70, -65, -70, -60, -71, -48, -78, -75, -48, -61, -74, -63, -64, -61, -59, -70, -65, -72, -48, -73, -67, -64, -56, 1, 13, Flags.CD, -52, 4, -1, 1, 3, 0, 13, 13, 9, -52, -1, 2, 17, -52, 7, 12, 18, 3, 16, 17, 18, 7, 18, 7, -1, 10, -52, -1, 1, 18, 7, 20, 7, 18, 23, -3, 2, 3, 17, 18, 16, 13, 23, 3, 2, -32, -20, -22, -85, -29, -34, -32, -30, -33, -20, -20, -24, -85, -34, bx.j7, -16, -85, -26, -21, -15, -30, -17, -16, -15, -26, -15, -26, -34, -23, -85, bx.j7, -26, -16, -22, -26, -16, -16, -30, bx.j7, 15, 27, 25, -38, 18, 13, 15, 17, 14, 27, 27, 23, -38, 13, 16, 31, -38, 21, 26, 32, 17, 30, 31, 32, 21, 32, 21, 13, 24, -38, 16, 21, 31, 28, 24, 13, 37, 17, 16, -23, -11, -13, -76, -20, -25, -23, -21, -24, -11, -11, -15, -76, -25, -22, -7, -76, -17, -12, -6, -21, -8, -7, -6, -17, -6, -17, -25, -14, -76, -21, -8, -8, -11, -8, 16, 28, 26, -37, 19, 14, 16, 18, 15, 28, 28, 24, -37, 14, 17, 32, -37, 22, 27, 33, 18, 31, 32, 33, 22, 33, 22, 14, 25, -37, 19, 22, 27, 22, 32, 21, 12, 14, 16, 33, 22, 35, 22, 33, 38, 54, 66, 64, 1, 57, 52, 54, 56, 53, 66, 66, 62, 1, 52, 55, 70, 1, 60, 65, 71, 56, 69, 70, 71, 60, 71, 60, 52, ax5.a, 1, 60, 64, 67, 69, 56, 70, 70, 60, 66, 65, 1, ax5.a, 66, 58, 58, 56, 55, 77, 94, 77, 86, 92, 49, 38, 51, 41, 56, 40, 38, 53, bx.W5, 69, 61, 60, 65, 57, 76, 65, 71, 70, 28, 57, 76, 57, 18, 14, 3, 5, 7, 15, 7, 16, 22, -21, 6, -7, -8, -5, -3, -5, -22, -14, -3, 87, 89, 76, 75, 76, 77, 80, 85, 76, 75, 54, 89, 80, 76, 85, 91, 72, 91, 80, 86, 85, 50, 76, 96, 78, 65, 77, 81, 65, 79, 80, 48, 69, 73, 65, -7, -15, -17, -10, -57, -20, -6, -21, -8, bx.l7, -21, -23, -11, -12, -22, -7, 45, 40, 24, 40, 43, 34, 30, 39, 45, 26, 45, 34, 40, 39, -11, -18, -23, -15, -11, -27, -55, -28, 58, 45, 41, 59, 24, 61, 52, 41};
    }

    public static void A08() {
        A0Q = new String[]{"6hyfNvrTK6t0uOk4ZUiKTcly4lO9QIT3", "Cx5XWQG9gTlQcsVl0OO6K9WlulTSTZ", "4fLDdlgMQ2q", "AM05mUF2qaDkDYU3MyDNTK", "rN7iVf06fBiMXo1UDWoI2bEJDxOmVmjv", "9bqAz3M9pAQkcUJXzFdGLS", "1D1uNCEUmAwDpqE", "h0QQnxfLOYpp7kAK6sPhgGYv8wQTA65G"};
    }

    public AnonymousClass51(AudienceNetworkActivity audienceNetworkActivity, AudienceNetworkActivityApi audienceNetworkActivityApi) {
        this.A0L = audienceNetworkActivity;
        this.A0M = audienceNetworkActivityApi;
        this.A0N = AnonymousClass57.A01(audienceNetworkActivity);
        this.A0N.A0C(this);
    }

    @Nullable
    private M7 A01(Intent intent) {
        M7 A04;
        M7 A03;
        M7 A07;
        M7 A05;
        M7 A06;
        M7 A08;
        M7 A02;
        M7 A0A;
        M7 A09;
        M7 A0B;
        C04064y c04064y = new C04064y(this, intent, this.A0N.A06(), this.A0N);
        if (this.A08 == null) {
            return null;
        }
        switch (this.A08) {
            case A05:
                A0B = c04064y.A0B(this.A06);
                return A0B;
            case A0B:
                A09 = c04064y.A09();
                return A09;
            case A0A:
                A0A = c04064y.A0A();
                return A0A;
            case A02:
                A02 = c04064y.A02();
                return A02;
            case A09:
                A08 = c04064y.A08();
                if (A0Q[1].length() != 0) {
                    String[] strArr = A0Q;
                    strArr[1] = "wwrXZHO6We2";
                    strArr[1] = "wwrXZHO6We2";
                    return A08;
                }
                String[] strArr2 = A0Q;
                strArr2[1] = "bd05r2lrBXgQHiU8zhW56DndFWzJq";
                strArr2[1] = "bd05r2lrBXgQHiU8zhW56DndFWzJq";
                return A08;
            case A07:
                A06 = c04064y.A06();
                return A06;
            case A06:
                A05 = c04064y.A05();
                if (A0Q[2].length() != 25) {
                    String[] strArr3 = A0Q;
                    strArr3[7] = "st3v0TpfdqXoPWlO02nQcse4uCAIapoF";
                    strArr3[7] = "st3v0TpfdqXoPWlO02nQcse4uCAIapoF";
                    return A05;
                }
                throw new RuntimeException();
            case A08:
                A07 = c04064y.A07();
                return A07;
            case A03:
                A03 = c04064y.A03();
                if (A0Q[7].charAt(27) != 'B') {
                    String[] strArr4 = A0Q;
                    strArr4[1] = "x";
                    strArr4[1] = "x";
                    return A03;
                }
                throw new RuntimeException();
            case A04:
                A04 = c04064y.A04();
                return A04;
            default:
                return null;
        }
    }

    private void A05() {
        String str = this.A0F;
        if (str != null) {
            this.A0C = OU.A01(this.A0N, str);
            if (this.A0C != null) {
                this.A06.addView(this.A0C, new RelativeLayout.LayoutParams(-1, -1));
            }
        }
    }

    private void A06() {
        if (!this.A0J) {
            if (A0H()) {
                A0E(EnumC0888Ou.A03.A02());
            } else {
                A0E(A04(WKSRecord.Service.NETBIOS_SSN, 48, 47));
            }
            this.A0J = true;
        }
    }

    private void A09(Intent intent) {
        if (J8.A0q(this.A0L)) {
            KL kl = this.A08;
            KL kl2 = KL.A02;
            if (A0Q[2].length() == 25) {
                throw new RuntimeException();
            }
            String[] strArr = A0Q;
            strArr[1] = "ROWUzhbvPevH2";
            strArr[1] = "ROWUzhbvPevH2";
            if (kl != kl2 && Build.VERSION.SDK_INT >= 18) {
                this.A0B = new NS();
                this.A0B.A0D(intent.getStringExtra(A04(419, 11, 51)));
                this.A0B.A0C(this.A0L.getPackageName());
                long longExtra = intent.getLongExtra(A04(462, 11, 109), 0L);
                if (longExtra != 0) {
                    this.A0B.A0A(longExtra);
                }
                TextView textView = new TextView(this.A0L);
                textView.setText(A04(1, 5, 84));
                textView.setTextColor(-1);
                C0795Le.A0P(textView, Color.argb(160, 0, 0, 0));
                textView.setPadding(5, 5, 5, 5);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12, -1);
                layoutParams.addRule(11, -1);
                textView.setLayoutParams(layoutParams);
                AnonymousClass50 anonymousClass50 = new AnonymousClass50(this);
                textView.setOnLongClickListener(anonymousClass50);
                this.A06.setOnLongClickListener(anonymousClass50);
                this.A06.getOverlay().add(this.A0B);
            }
        }
    }

    private void A0A(Intent intent, @Nullable Bundle bundle) {
        String A04 = A04(dg.t, 8, 85);
        String A042 = A04(aa.g.k, 8, 17);
        String A043 = A04(438, 24, 120);
        if (bundle != null) {
            Bundle adnwSavedStateBundle = C0783Kq.A02(bundle, DynamicLoaderImpl.class.getClassLoader());
            this.A01 = adnwSavedStateBundle.getInt(A043, -1);
            this.A0D = adnwSavedStateBundle.getString(A042);
            this.A08 = (KL) adnwSavedStateBundle.getSerializable(A04);
            return;
        }
        this.A01 = intent.getIntExtra(A043, -1);
        this.A0D = intent.getStringExtra(A042);
        this.A08 = (KL) intent.getSerializableExtra(A04);
        this.A02 = intent.getIntExtra(A04(473, 16, 23), 0) * 1000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0058, code lost:
        if (r3.equals(r6) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A0E(String str) {
        if (A04(345, 47, 100).equals(str) || EnumC0888Ou.A0A.A02().equals(str)) {
            this.A0I = true;
        }
        if (!A04(265, 35, 23).equals(str)) {
            String A02 = EnumC0888Ou.A09.A02();
            if (A0Q[6].length() != 15) {
                throw new RuntimeException();
            }
            String[] strArr = A0Q;
            strArr[5] = "BsUqgJlN3izr4734FAkiK4";
            strArr[3] = "DZ4pb9dksBh2p0w2isnwDh";
        }
        this.A0H = true;
        if (A04(86, 53, 2).equals(str)) {
            finish(9);
        } else if (A04(300, 45, 62).equals(str)) {
            finish(10);
        } else {
            A0G(str, null);
        }
    }

    public void A0F(String str, C1Q c1q) {
        if (this.A09 == null) {
            return;
        }
        if (this.A0A == null) {
            C1080Wh c1080Wh = this.A0N;
            this.A0A = C0824Mh.A02(c1080Wh, c1080Wh.A06(), str, c1q, this.A09, new C0985Sq(this));
            this.A0A.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
        C0795Le.A0M(this.A0A);
        C0795Le.A0X(this.A06);
        this.A06.addView(this.A0A);
        this.A0A.A0J();
    }

    public void A0G(String str, @Nullable C9I c9i) {
        Intent intent = new Intent(str + A04(0, 1, 50) + this.A0D);
        if (c9i != null) {
            intent.putExtra(A04(392, 5, 121), c9i);
        }
        C2F.A00(this.A0L).A08(intent);
    }

    private boolean A0H() {
        return this.A08 == KL.A0B || this.A08 == KL.A0A;
    }

    public final AudienceNetworkActivity A0I() {
        return this.A0L;
    }

    public final C1080Wh A0J() {
        return this.A0N;
    }

    @VisibleForTesting
    public final void A0K() {
        if (A0H()) {
            A0E(EnumC0888Ou.A09.A02());
        } else {
            A0E(A04(265, 35, 23));
        }
    }

    public final void A0L(InterfaceC04074z interfaceC04074z) {
        this.A0O.add(interfaceC04074z);
    }

    public final void A0M(InterfaceC04074z interfaceC04074z) {
        this.A0O.remove(interfaceC04074z);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void finish(int i) {
        this.A0N.A0A().A2R(String.valueOf(A0I().hashCode()), i);
        if (this.A0L.isFinishing()) {
            return;
        }
        if (J8.A15(this.A0N) && !this.A0I && !this.A0H) {
            this.A0N.A0A().A8b();
            A0K();
        }
        if (A0H() && !this.A0G) {
            A0E(EnumC0888Ou.A05.A02());
        } else {
            A0E(A04(187, 39, 14));
        }
        A06();
        this.A0M.finish(i);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onBackPressed() {
        long currentTimeMillis = System.currentTimeMillis();
        this.A03 += currentTimeMillis - this.A04;
        this.A04 = currentTimeMillis;
        if (this.A03 > this.A02) {
            boolean shouldIntercept = false;
            for (InterfaceC04074z interfaceC04074z : this.A0O) {
                if (interfaceC04074z.A7U()) {
                    shouldIntercept = true;
                }
            }
            if (!shouldIntercept) {
                this.A0M.onBackPressed();
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onConfigurationChanged(Configuration configuration) {
        M7 m7 = this.A09;
        if (m7 instanceof C1118Xt) {
            C1118Xt c1118Xt = (C1118Xt) m7;
            String[] strArr = A0Q;
            if (strArr[0].charAt(26) != strArr[4].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0Q;
            strArr2[2] = "hDbrw";
            strArr2[2] = "hDbrw";
            c1118Xt.onConfigurationChanged(configuration);
        }
        if (this.A00 != configuration.orientation) {
            HashMap hashMap = new HashMap();
            int i = configuration.orientation;
            String A04 = A04(489, 14, 74);
            if (i == 1) {
                hashMap.put(A04, A04(430, 8, 26));
            } else {
                hashMap.put(A04, A04(397, 9, 86));
            }
            this.A07.A03(JK.A0K, hashMap);
            this.A00 = configuration.orientation;
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onCreate(@Nullable Bundle bundle) {
        C0797Lg.A02();
        this.A05 = C0783Kq.A01(this.A0L.getIntent(), DynamicLoaderImpl.class.getClassLoader());
        C1080Wh A03 = C0783Kq.A03(this.A05);
        if (A03 != null) {
            this.A0N.A0B(A03.A0A());
            C1080Wh c1080Wh = this.A0N;
            String[] strArr = A0Q;
            if (strArr[0].charAt(26) != strArr[4].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0Q;
            strArr2[6] = "7njofUp2AYjKONZ";
            strArr2[6] = "7njofUp2AYjKONZ";
            c1080Wh.A08(A03.A07());
        }
        this.A0N.A0A().A2S(String.valueOf(A0I().hashCode()));
        this.A0L.requestWindowFeature(1);
        this.A0L.getWindow().setFlags(1024, 1024);
        this.A06 = new RelativeLayout(this.A0L);
        C0795Le.A0P(this.A06, 0);
        this.A0L.setContentView(this.A06, new RelativeLayout.LayoutParams(-1, -1));
        A0A(this.A05, bundle);
        this.A09 = A01(this.A05);
        M7 m7 = this.A09;
        if (m7 == null) {
            this.A0N.A04().A82(A04(64, 11, 24), C04848i.A02, new C04858j(A04(6, 58, 115)));
            A0K();
            finish(7);
            return;
        }
        m7.A7r(this.A05, bundle, this);
        A0E(A04(226, 39, 61));
        this.A04 = System.currentTimeMillis();
        this.A0F = this.A05.getStringExtra(A04(406, 13, 105));
        A05();
        A09(this.A05);
        this.A00 = this.A0L.getResources().getConfiguration().orientation;
        String A04 = A04(75, 11, 36);
        if (bundle != null) {
            this.A0E = bundle.getString(A04);
        } else {
            this.A0E = this.A05.getStringExtra(A04);
        }
        this.A07 = new JL(this.A0E, this.A0N.A06());
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0065, code lost:
        if (r3 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006d, code lost:
        if (com.facebook.ads.redexgen.X.J8.A0q(r4.A0L) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x006f, code lost:
        r4.A0B.A08();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0074, code lost:
        r3 = r4.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0081, code lost:
        if (com.facebook.ads.redexgen.X.AnonymousClass51.A0Q[2].length() == 25) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0083, code lost:
        r2 = com.facebook.ads.redexgen.X.AnonymousClass51.A0Q;
        r2[5] = "rHb3ILEFnyWtMYiOwcguj0";
        r2[3] = "XKBHK5KZoSEcfbvzOM5yLt";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
        if (r3 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0091, code lost:
        r3.A0I();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0094, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0095, code lost:
        if (r3 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a4, code lost:
        if (r3 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
        return;
     */
    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDestroy() {
        this.A0N.A0A().A2T(String.valueOf(A0I().hashCode()));
        A06();
        RelativeLayout relativeLayout = this.A06;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        M7 m7 = this.A09;
        if (m7 != null) {
            m7.onDestroy();
            String[] strArr = A0Q;
            if (strArr[0].charAt(26) != strArr[4].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0Q;
            strArr2[1] = "BK5JyIukG";
            strArr2[1] = "BK5JyIukG";
            this.A09 = null;
        }
        NS ns = this.A0B;
        String[] strArr3 = A0Q;
        if (strArr3[0].charAt(26) == strArr3[4].charAt(26)) {
            String[] strArr4 = A0Q;
            strArr4[2] = "VoJV9dI9dal5KZ60JkB8i5Bpps";
            strArr4[2] = "VoJV9dI9dal5KZ60JkB8i5Bpps";
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onPause() {
        this.A0N.A0A().A2U(String.valueOf(A0I().hashCode()));
        this.A03 += System.currentTimeMillis() - this.A04;
        M7 m7 = this.A09;
        if (m7 != null) {
            m7.AAO(false);
            if (!this.A0L.isFinishing()) {
                this.A07.A03(JK.A0E, null);
                this.A0K = true;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onResume() {
        this.A0N.A0A().A2V(String.valueOf(A0I().hashCode()));
        this.A04 = System.currentTimeMillis();
        M7 m7 = this.A09;
        if (m7 != null) {
            m7.AAl(false);
            if (this.A0K) {
                this.A07.A03(JK.A0F, null);
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        M7 m7 = this.A09;
        if (m7 != null) {
            m7.ACg(bundle2);
        }
        bundle2.putInt(A04(438, 24, 120), this.A01);
        bundle2.putString(A04(aa.g.k, 8, 17), this.A0D);
        bundle2.putString(A04(75, 11, 36), this.A0E);
        bundle2.putSerializable(A04(dg.t, 8, 85), this.A08);
        C0783Kq.A09(bundle, bundle2);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStart() {
        this.A0N.A0A().A2W(String.valueOf(A0I().hashCode()));
        int i = this.A01;
        if (i != -1) {
            C0814Lx.A03(this.A0L, i, this.A0N);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStop() {
        this.A0N.A0A().A2X(String.valueOf(A0I().hashCode()));
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C04285v.A03(null, motionEvent);
        return this.A0M.onTouchEvent(motionEvent);
    }

    @Override // com.facebook.ads.internal.api.Repairable
    public final void repair(Throwable th) {
        A0K();
        finish(5);
    }
}