package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Log;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.gc0;
import com.p7700g.p99005.yg1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.2l  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03442l extends AbstractC0550Ax {
    public static byte[] A05;
    public static String[] A06;
    public static final Pattern A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final boolean A04;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 114);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{-98, -20, 3, -2, -20, 32, 40, -17, -19, -2, -19, 3, -20, 32, 40, -17, -19, -2, -20, 32, 40, -17, -19, -20, 3, -2, -2, 64, 32, -14, -19, -20, 32, 40, -17, -19, -82, 44, 81, 73, 84, 87, 79, 93, 77, 34, 8, -2, 39, bx.W5, 37, 25, 44, -14, -40, -5, 19, 17, 24, 24, 17, 22, 15, -56, 12, 17, 9, 20, 23, 15, 29, 13, -56, 20, 17, 22, 13, -56, 10, 13, 14, 23, 26, 13, -56, Flags.CD, 23, 21, 24, 20, 13, 28, 13, -56, 14, 23, 26, 21, 9, 28, -30, -56, 17, 41, 39, 46, 46, 39, 44, 37, -34, 34, 39, 31, bx.W5, 45, 37, 51, 35, -34, bx.W5, 39, 44, 35, -34, 53, 39, 50, 38, -34, 36, 35, 53, 35, 48, -34, 33, 45, bx.W5, 51, 43, 44, 49, -34, 50, 38, 31, 44, -34, 36, 45, 48, 43, 31, 50, -8, -34, -35, -11, -13, -6, -6, -13, -8, -15, -86, -13, -8, 0, -21, -10, -13, -18, -86, -2, -13, -9, -13, -8, -15, -60, -86, 68, 100, 82, 53, 86, 84, 96, 85, 86, 99, -11, -33, 16, -1, 8, 14, 13, -9, bx.W5, bx.W5, 28, 73, 73, 91, 21, 52, -25, -29, -8, 21, 54, -24, -15, -25, 53, 54, 35, 52, 54, 85, 70, 89, 85};
    }

    public static void A04() {
        A06 = new String[]{"nLO9L7XoEpR8vgnDFT", "WlEQ0W9HytVOtlcgcYyzDlj1QkZOFGjO", "ODtnbW3mHTyNn479FkodGv794qS9hsWl", "APk9cVzJYKr2vBqvSJCf7k3ktACu2ubu", "Tq9sEDvjDozJ9rvk5K396aURjyjwu7hY", "bGv", "ZQgwsO83xrUrRKbDM61rEvH7uEXNNVYo", "gyYiWp0aVpa2EpLIT9J28do7UtlziSMd"};
    }

    static {
        A04();
        A03();
        A07 = Pattern.compile(A02(1, 35, 82));
    }

    public C03442l() {
        this(null);
    }

    public C03442l(List<byte[]> list) {
        super(A02(182, 10, 127));
        if (list != null && !list.isEmpty()) {
            this.A04 = true;
            String A0Q = C0726Ig.A0Q(list.get(0));
            I1.A03(A0Q.startsWith(A02(47, 8, 70)));
            A07(A0Q);
            A05(new IQ(list.get(1)));
            return;
        }
        this.A04 = false;
    }

    public static long A00(String str) {
        Matcher matcher = A07.matcher(str);
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        long timestampUs = Long.parseLong(matcher.group(2));
        long parseLong = (Long.parseLong(matcher.group(1)) * 60 * 60 * 1000000) + (timestampUs * 60 * 1000000);
        long timestampUs2 = Long.parseLong(matcher.group(3));
        return parseLong + (timestampUs2 * 1000000) + (Long.parseLong(matcher.group(4)) * gc0.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC0550Ax
    /* renamed from: A01 */
    public final C1190aH A0d(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        IG ig = new IG();
        IQ iq = new IQ(bArr, i);
        if (!this.A04) {
            A05(iq);
        }
        A06(iq, arrayList, ig);
        GF[] gfArr = new GF[arrayList.size()];
        arrayList.toArray(gfArr);
        return new C1190aH(gfArr, ig.A05());
    }

    private void A05(IQ iq) {
        String A0Q;
        do {
            A0Q = iq.A0Q();
            if (A0Q == null) {
                return;
            }
            if (A06[6].charAt(30) != 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[0] = "7FHmrvaj0sy2XXhHTc";
            strArr[5] = "VJa";
        } while (!A0Q.startsWith(A02(yg1.K, 8, 40)));
    }

    private void A06(IQ iq, List<GF> list, IG ig) {
        while (true) {
            String A0Q = iq.A0Q();
            if (A0Q != null) {
                if (!this.A04 && A0Q.startsWith(A02(47, 8, 70))) {
                    A07(A0Q);
                } else if (A0Q.startsWith(A02(37, 10, 118))) {
                    A08(A0Q, list, ig);
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
        if (r9.equals(A02(216, 5, 80)) == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A07(String str) {
        String[] split = TextUtils.split(str.substring(A02(47, 8, 70).length()), A02(36, 1, 16));
        this.A01 = split.length;
        this.A02 = -1;
        this.A00 = -1;
        this.A03 = -1;
        int i = 0;
        while (true) {
            int i2 = this.A01;
            char c = 0;
            if (A06[7].charAt(27) != 'z') {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[6] = "ohbteayusWQmP2eqo1O6uo4DamJwM8Y2";
            strArr[6] = "ohbteayusWQmP2eqo1O6uo4DamJwM8Y2";
            if (i < i2) {
                String A0M = C0726Ig.A0M(split[i].trim());
                int hashCode = A0M.hashCode();
                if (hashCode == 100571) {
                    if (A0M.equals(A02(213, 3, 17))) {
                        c = 1;
                        if (c == 0) {
                        }
                        i++;
                    }
                    c = 65535;
                    if (c == 0) {
                    }
                    i++;
                } else if (hashCode != 3556653) {
                    if (hashCode == 109757538) {
                    }
                    c = 65535;
                    if (c == 0) {
                        this.A02 = i;
                    } else if (c == 1) {
                        this.A00 = i;
                    } else if (c == 2) {
                        this.A03 = i;
                    }
                    i++;
                } else {
                    if (A0M.equals(A02(221, 4, 111))) {
                        c = 2;
                        if (c == 0) {
                        }
                        i++;
                    }
                    c = 65535;
                    if (c == 0) {
                    }
                    i++;
                }
            } else {
                int i3 = this.A02;
                String[] strArr2 = A06;
                if (strArr2[3].length() != strArr2[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A06;
                strArr3[1] = "les6sY7sl1N1w442PsI3dyj52qvLqIgC";
                strArr3[1] = "les6sY7sl1N1w442PsI3dyj52qvLqIgC";
                if (i3 == -1 || this.A00 == -1 || this.A03 == -1) {
                    this.A01 = 0;
                    return;
                }
                return;
            }
        }
    }

    private void A08(String str, List<GF> list, IG ig) {
        int i = this.A01;
        String A02 = A02(182, 10, 127);
        if (i == 0) {
            Log.w(A02, A02(55, 47, 54) + str);
            return;
        }
        String[] split = str.substring(A02(37, 10, 118).length()).split(A02(36, 1, 16), this.A01);
        if (split.length != this.A01) {
            Log.w(A02, A02(102, 55, 76) + str);
            return;
        }
        long A00 = A00(split[this.A02]);
        String A022 = A02(157, 25, 24);
        if (A00 == -9223372036854775807L) {
            Log.w(A02, A022 + str);
            return;
        }
        long endTimeUs = -9223372036854775807L;
        String str2 = split[this.A00];
        if (!str2.trim().isEmpty()) {
            endTimeUs = A00(str2);
            if (endTimeUs == -9223372036854775807L) {
                Log.w(A02, A022 + str);
                return;
            }
        }
        String replaceAll = split[this.A03].replaceAll(A02(206, 7, 71), A02(0, 0, 15));
        String A023 = A02(0, 1, 34);
        list.add(new GF(replaceAll.replaceAll(A02(200, 3, 92), A023).replaceAll(A02(203, 3, 123), A023)));
        ig.A04(A00);
        if (endTimeUs != -9223372036854775807L) {
            list.add(null);
            ig.A04(endTimeUs);
        }
    }
}