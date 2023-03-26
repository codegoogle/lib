package com.facebook.ads.redexgen.X;

import android.text.Html;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import com.anythink.expressad.d.a.b;
import com.anythink.expressad.foundation.g.a;
import com.facebook.ads.internal.exoplayer2.Format;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.b30;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import com.p7700g.p99005.gl4;
import com.p7700g.p99005.h95;
import com.p7700g.p99005.n04;
import com.p7700g.p99005.nr;
import com.p7700g.p99005.zg2;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.xbill.DNS.Flags;
import org.xbill.DNS.WKSRecord;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.facebook.ads.redexgen.X.aB  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1184aB implements GI {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 103);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{62, Flags.CD, Flags.CD, 26, 18, 15, Flags.CD, 26, 27, 95, Flags.CD, 16, 95, 28, 13, 26, 30, Flags.CD, 26, 95, 27, 26, 28, 16, 27, 26, 13, 95, 25, 16, 13, 95, 10, 17, 12, 10, 15, 15, 16, 13, Flags.CD, 26, 27, 95, 25, 16, 13, 18, 30, Flags.CD, 113, 96, 96, 124, 121, 115, 113, 100, 121, g15.c, 126, ax5.a, 115, 117, 113, 61, 38, 32, 40, 29, 12, 12, 16, 21, 31, 29, 8, 21, 19, 18, 83, 31, 25, 29, 81, 75, 76, 68, 103, 118, 118, 106, 111, 101, 103, 114, 111, 105, 104, 41, 98, 112, 100, 117, 115, 100, 117, 28, 13, 13, 17, 20, 30, 28, 9, 20, 18, 19, 82, 13, 26, 14, 81, 64, 64, 92, 89, 83, 81, 68, 89, 95, 94, 31, 68, 68, 93, 92, 27, 72, 93, 92, 33, 48, 48, 44, 41, 35, 33, 52, 41, 47, 46, 111, 56, 109, 45, 48, 116, 109, 35, 37, 33, 109, 118, 112, 120, ax5.a, 46, 46, 50, 55, 61, ax5.a, bx.W5, 55, 49, 48, 113, 38, 115, 51, 46, 106, 115, 40, bx.W5, bx.W5, 123, 106, 106, 118, 115, 121, 123, 110, 115, 117, 116, 53, 98, 55, 107, 111, 115, 121, 113, 110, 115, 119, g15.c, 55, 110, 98, 41, 125, 4, 21, 21, 9, 12, 6, 4, 17, 12, 10, Flags.CD, 74, 29, 72, 22, 16, 7, 23, 12, 21, 99, 114, 111, 99, 56, 97, 99, 99, 70, 87, 74, 70, 29, 74, 31, 65, 65, 83};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.ads.redexgen.X.GI
    public final InterfaceC1183aA A4F(Format format) {
        char c;
        String str = format.A0O;
        switch (str.hashCode()) {
            case -1351681404:
                if (str.equals(A00(88, 19, 97))) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1248334819:
                if (str.equals(A00(107, 15, 26))) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1026075066:
                if (str.equals(A00(167, 21, 57))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1004728940:
                if (str.equals(A00(236, 8, 112))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 691401887:
                if (str.equals(A00(188, 28, 125))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 822864842:
                if (str.equals(A00(244, 10, 85))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 930165504:
                if (str.equals(A00(WKSRecord.Service.BL_IDM, 25, 39))) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1566015601:
                if (str.equals(A00(50, 19, 119))) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1566016562:
                if (str.equals(A00(69, 19, 27))) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1668750253:
                if (str.equals(A00(216, 20, 2))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1693976202:
                if (str.equals(A00(122, 20, 87))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return new AbstractC0550Ax() { // from class: com.facebook.ads.redexgen.X.2g
                    public static byte[] A05;
                    public static String[] A06;
                    public final C0678Gk A00;
                    public final C0684Gq A01;
                    public final C0687Gt A02;
                    public final IQ A03;
                    public final List<C0682Go> A04;

                    static {
                        A04();
                        A03();
                    }

                    public static String A02(int i, int i2, int i3) {
                        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
                        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 113);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A03() {
                        A05 = new byte[]{89, 56, 107, 108, 97, 116, 125, 56, 122, 116, 119, 123, 115, 56, 111, 121, 107, 56, 126, 119, 109, 118, 124, 56, 121, 126, 108, 125, 106, 56, 108, 112, 125, 56, 126, 113, 106, 107, 108, 56, 123, 109, 125, 54, 52, 53, 46, ax5.a, 28, 27, 22, 3, 10, 29, 47, 40, 60, 62, 62, 14, 47, 41, 37, 46, 47, 56};
                    }

                    public static void A04() {
                        A06 = new String[]{"CMeD5mXDZDTfb", "fWYAWHkLFKDlflVtn3klkQMszSy2czx5", "00RFRgIDsqiIARLTNA3N6SPhWhBdnLh1", "U8JLQKkyCBG48OlAsiyvwZYOetZ2qreJ", "pY35d7af18sebuviuQ2bLCANBl7hHJuY", "f8ToU2BaHxZg9tVTog2hKPYEgQcC6j0M", "sxXavdrivd5JbbwFv9VJPSRnNTBEZ25u", "aixApfSzl80yG78LfLrSNW905rKMIX1l"};
                    }

                    {
                        A02(53, 13, 59);
                        this.A02 = new C0687Gt();
                        this.A03 = new IQ();
                        this.A01 = new C0684Gq();
                        this.A00 = new C0678Gk();
                        this.A04 = new ArrayList();
                    }

                    public static int A00(IQ iq) {
                        int currentInputPosition = -1;
                        int i = 0;
                        while (currentInputPosition == -1) {
                            i = iq.A07();
                            String A0Q = iq.A0Q();
                            if (A0Q == null) {
                                currentInputPosition = 0;
                            } else if (A02(48, 5, 62).equals(A0Q)) {
                                currentInputPosition = 2;
                            } else if (A02(44, 4, 11).startsWith(A0Q)) {
                                currentInputPosition = 1;
                            } else {
                                currentInputPosition = 3;
                            }
                        }
                        iq.A0Z(i);
                        String[] strArr = A06;
                        if (strArr[1].charAt(4) != strArr[2].charAt(4)) {
                            String[] strArr2 = A06;
                            strArr2[1] = "wICfUq6cRqM8QSRmpIxw59la3C0B28Gh";
                            strArr2[2] = "UCa9DZD1GiApguhXmO9GHmNOpL0AOlSY";
                            return currentInputPosition;
                        }
                        throw new RuntimeException();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:58:0x0047 A[SYNTHETIC] */
                    @Override // com.facebook.ads.redexgen.X.AbstractC0550Ax
                    /* renamed from: A01 */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final C1196aN A0d(byte[] bArr, int i, boolean z) throws GH {
                        boolean isEmpty;
                        C0682Go A0F;
                        this.A03.A0c(bArr, i);
                        this.A01.A0F();
                        this.A04.clear();
                        C0688Gu.A05(this.A03);
                        do {
                            isEmpty = TextUtils.isEmpty(this.A03.A0Q());
                            if (A06[7].charAt(24) != '5') {
                                throw new RuntimeException();
                            }
                            String[] strArr = A06;
                            strArr[4] = "yIxA0yuP9hQGFN4fa3NPu5J4rTDeCvUe";
                            strArr[4] = "yIxA0yuP9hQGFN4fa3NPu5J4rTDeCvUe";
                        } while (!isEmpty);
                        ArrayList arrayList = new ArrayList();
                        while (true) {
                            int A002 = A00(this.A03);
                            if (A002 != 0) {
                                if (A002 == 1) {
                                    A05(this.A03);
                                } else if (A06[6].charAt(24) != 'N') {
                                    throw new RuntimeException();
                                } else {
                                    String[] strArr2 = A06;
                                    strArr2[4] = "ccU6TSbM8V8OtEl7BaomB3QNW5j0Q6sw";
                                    strArr2[4] = "ccU6TSbM8V8OtEl7BaomB3QNW5j0Q6sw";
                                    if (A002 == 2) {
                                        boolean isEmpty2 = arrayList.isEmpty();
                                        if (A06[0].length() != 13) {
                                            String[] strArr3 = A06;
                                            strArr3[1] = "YowA8l8uvxZXaVypumJ5yBUyc4sOcAQV";
                                            strArr3[2] = "HKbmxYlwqclncAnOAoFTo7zzjR7PE75y";
                                            if (!isEmpty2) {
                                                break;
                                            }
                                            this.A03.A0Q();
                                            A0F = this.A00.A0F(this.A03);
                                            if (A0F == null) {
                                                this.A04.add(A0F);
                                            }
                                        } else {
                                            String[] strArr4 = A06;
                                            strArr4[1] = "RankGpg1WKksvMbJf2r1Mj9i4dXCVfm7";
                                            strArr4[2] = "PTwUfk4233EGPZYG7vYxG5zvlLDyWplM";
                                            if (!isEmpty2) {
                                                break;
                                            }
                                            this.A03.A0Q();
                                            A0F = this.A00.A0F(this.A03);
                                            if (A0F == null) {
                                            }
                                        }
                                    } else if (A002 == 3 && this.A02.A0H(this.A03, this.A01, this.A04)) {
                                        arrayList.add(this.A01.A0E());
                                        this.A01.A0F();
                                    }
                                }
                            } else {
                                return new C1196aN(arrayList);
                            }
                        }
                        throw new GH(A02(0, 44, 105));
                    }

                    public static void A05(IQ iq) {
                        do {
                        } while (!TextUtils.isEmpty(iq.A0Q()));
                    }
                };
            case 1:
                return new C03442l(format.A0P);
            case 2:
                return new AbstractC0550Ax() { // from class: com.facebook.ads.redexgen.X.2h
                    public static byte[] A02;
                    public static final int A03;
                    public static final int A04;
                    public static final int A05;
                    public final C0684Gq A00;
                    public final IQ A01;

                    public static String A02(int i, int i2, int i3) {
                        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
                        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 118);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A03() {
                        A02 = new byte[]{1, 38, 27, 39, 37, 40, 36, 29, 44, 29, -40, 5, 40, -20, 15, 29, 26, 46, 44, 44, -40, 12, 39, 40, -40, 4, 29, 46, 29, 36, -40, 26, 39, 48, -40, 32, 29, 25, 28, 29, bx.W5, -40, 30, 39, 45, 38, 28, -26, 43, 80, 69, 81, 79, 82, 78, 71, 86, 71, 2, 88, 86, 86, 2, 69, 87, 71, 2, 68, 81, 90, 2, 74, 71, 67, 70, 71, 84, 2, 72, 81, 87, 80, 70, 16, 16, 51, -9, 26, 40, 37, 57, 55, 55, 7, 40, 38, 50, 39, 40, 53, 3, -12, 12, -1, -14, -13, -13, -26, 54, 52, 52, 35};
                    }

                    static {
                        A03();
                        A03 = C0726Ig.A08(A02(100, 4, 29));
                        A04 = C0726Ig.A08(A02(104, 4, 9));
                        A05 = C0726Ig.A08(A02(108, 4, 74));
                    }

                    {
                        A02(84, 16, 77);
                        this.A01 = new IQ();
                        this.A00 = new C0684Gq();
                    }

                    public static GF A00(IQ iq, C0684Gq c0684Gq, int payloadLength) throws GH {
                        c0684Gq.A0F();
                        while (payloadLength > 0) {
                            if (payloadLength >= 8) {
                                int A09 = iq.A09();
                                int A092 = iq.A09();
                                int i = A09 - 8;
                                String A0R = C0726Ig.A0R(iq.A00, iq.A07(), i);
                                iq.A0a(i);
                                payloadLength = (payloadLength - 8) - i;
                                if (A092 == A04) {
                                    C0687Gt.A09(A0R, c0684Gq);
                                } else if (A092 == A03) {
                                    C0687Gt.A0D(null, A0R.trim(), c0684Gq, Collections.emptyList());
                                }
                            } else {
                                String boxPayload = A02(48, 36, 108);
                                throw new GH(boxPayload);
                            }
                        }
                        return c0684Gq.A0E();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // com.facebook.ads.redexgen.X.AbstractC0550Ax
                    /* renamed from: A01 */
                    public final C1194aL A0d(byte[] bArr, int i, boolean z) throws GH {
                        this.A01.A0c(bArr, i);
                        ArrayList arrayList = new ArrayList();
                        while (this.A01.A05() > 0) {
                            if (this.A01.A05() >= 8) {
                                int A09 = this.A01.A09();
                                if (this.A01.A09() == A05) {
                                    arrayList.add(A00(this.A01, this.A00, A09 - 8));
                                } else {
                                    this.A01.A0a(A09 - 8);
                                }
                            } else {
                                throw new GH(A02(0, 48, 66));
                            }
                        }
                        return new C1194aL(arrayList);
                    }
                };
            case 3:
                return new AbstractC0550Ax() { // from class: com.facebook.ads.redexgen.X.2j
                    public static byte[] A01;
                    public static String[] A02;
                    public static final C0669Gb A03;
                    public static final C0670Gc A04;
                    public static final Pattern A05;
                    public static final Pattern A06;
                    public static final Pattern A07;
                    public static final Pattern A08;
                    public static final Pattern A09;
                    public final XmlPullParserFactory A00;

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 13
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:202)
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:124)
                    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
                    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:564)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
                     */
                    public static long A00(String str2, C0670Gc c0670Gc) throws GH {
                        Matcher matcher = A06.matcher(str2);
                        if (matcher.matches()) {
                            double parseLong = (Long.parseLong(matcher.group(1)) * b.P) + (Long.parseLong(matcher.group(2)) * 60) + Long.parseLong(matcher.group(3));
                            String group = matcher.group(4);
                            double d = zg2.s;
                            double parseDouble = parseLong + (group != null ? Double.parseDouble(group) : 0.0d);
                            String group2 = matcher.group(5);
                            double parseLong2 = parseDouble + (group2 != null ? ((float) Long.parseLong(group2)) / c0670Gc.A00 : 0.0d);
                            String group3 = matcher.group(6);
                            if (group3 != null) {
                                d = (Long.parseLong(group3) / c0670Gc.A01) / c0670Gc.A00;
                            }
                            return (long) (1000000.0d * (parseLong2 + d));
                        }
                        Matcher matcher2 = A08.matcher(str2);
                        if (!matcher2.matches()) {
                            throw new GH(A08(556, 27, 38) + str2);
                        }
                        double parseDouble2 = Double.parseDouble(matcher2.group(1));
                        String group4 = matcher2.group(2);
                        char c2 = 65535;
                        int hashCode = group4.hashCode();
                        if (hashCode != 102) {
                            if (hashCode != 104) {
                                if (hashCode != 109) {
                                    if (hashCode != 3494) {
                                        if (hashCode != 115) {
                                            if (hashCode == 116 && group4.equals(A08(1374, 1, 68))) {
                                                c2 = 5;
                                            }
                                        } else if (group4.equals(A08(IronSourceConstants.RV_AUCTION_SUCCESS, 1, 5))) {
                                            c2 = 2;
                                        }
                                    } else if (group4.equals(A08(1256, 2, 1))) {
                                        c2 = 3;
                                    }
                                } else if (group4.equals(A08(1247, 1, 86))) {
                                    c2 = 1;
                                }
                            } else if (group4.equals(A08(1178, 1, 87))) {
                                c2 = 0;
                            }
                        } else if (group4.equals(A08(1072, 1, 23))) {
                            c2 = 4;
                        }
                        if (c2 == 0) {
                            parseDouble2 *= 3600.0d;
                        } else if (c2 == 1) {
                            parseDouble2 *= 60.0d;
                        } else if (c2 != 2) {
                            if (c2 == 3) {
                                String[] strArr = A02;
                                if (strArr[1].length() != strArr[7].length()) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A02;
                                strArr2[6] = "4wWFQkJIgDUDxvhbLoyjDEJLfIHbXKXA";
                                strArr2[4] = "i9Tkte0qzP2dvhcWyRZLUYoYUmQQFstK";
                                parseDouble2 /= 1000.0d;
                            } else if (c2 == 4) {
                                parseDouble2 /= c0670Gc.A00;
                            } else if (c2 == 5) {
                                parseDouble2 /= c0670Gc.A02;
                            }
                        }
                        return (long) (1000000.0d * parseDouble2);
                    }

                    public static String A08(int i, int i2, int i3) {
                        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 51);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A0A() {
                        A01 = new byte[]{-69, -61, -98, -91, 113, -52, -8, -2, -11, -19, -9, -80, -3, -87, -20, -5, -18, -22, -3, -18, -87, bx.j7, -10, -11, bx.l7, -2, -11, -11, bx.l7, -22, -5, -4, -18, -5, -49, -22, -20, -3, -8, -5, 2, -87, -14, -9, -4, -3, -22, -9, -20, -18, -43, -16, -8, -5, -12, -13, -81, -1, -16, 1, 2, -8, -3, -10, -81, -15, -16, -14, -6, -10, 1, -2, 4, -3, -13, -81, 5, -16, -5, 4, -12, -55, -81, -117, -90, -82, -79, -86, -87, 101, -75, -90, -73, -72, -82, -77, -84, 101, -88, -76, -79, -76, -73, 101, -69, -90, -79, -70, -86, g15.c, 101, -10, 17, 25, 28, 21, 20, -48, 32, 17, 34, 35, 25, 30, 23, -48, 22, 31, 30, 36, 3, 25, bx.W5, 21, -48, 38, 17, 28, 37, 21, -22, -48, -101, -71, -64, -63, -60, -69, -64, -71, 114, -65, -77, -66, -72, -63, -60, -65, -73, -74, 114, -75, -73, -66, -66, 114, -60, -73, -59, -63, -66, -57, -58, -69, -63, -64, -116, 114, -90, -60, -53, -52, -49, -58, -53, -60, 125, -49, -62, -60, -58, -52, -53, 125, -44, -58, -47, -59, 125, -54, -66, -55, -61, -52, -49, -54, -62, -63, 125, -62, -43, -47, -62, -53, -47, -105, 125, bx.l7, -9, -2, -1, 2, -7, -2, -9, -80, 2, -11, -9, -7, -1, -2, -80, 7, -7, 4, -8, -80, -3, -15, -4, -10, -1, 2, -3, -11, -12, -80, -1, 2, -7, -9, -7, -2, -54, -80, -108, -78, -71, -70, -67, -76, -71, -78, 107, -67, -80, -78, -76, -70, -71, 107, -62, -76, -65, -77, 107, -64, -71, -66, -64, -69, -69, -70, -67, -65, -80, -81, 107, -80, -61, -65, -80, -71, -65, -123, 107, -95, -65, -58, -57, -54, -63, -58, -65, 120, -54, -67, -65, -63, -57, -58, 120, -49, -63, -52, -64, 120, -51, -58, -53, -51, -56, -56, -57, -54, -52, -67, -68, 120, -57, -54, -63, -65, -63, -58, -110, 120, -54, -24, -17, -16, -13, -22, -17, -24, -95, -13, -26, -24, -22, -16, -17, -95, -8, -22, -11, -23, -16, -10, -11, -95, -30, -17, -95, -26, -7, -11, -26, -17, -11, -75, -45, -38, -37, -34, -43, -38, -45, -116, -34, -47, -45, -43, -37, -38, -116, -29, -43, -32, -44, -37, bx.j7, -32, -116, -51, -38, -116, -37, -34, -43, -45, -43, -38, -50, -20, -13, -12, -9, -18, -13, -20, -91, -6, -13, -8, -6, -11, -11, -12, -9, -7, -22, -23, -91, -7, -26, -20, -65, -91, -111, -74, -66, -87, -76, -79, -84, 104, -85, -83, -76, -76, 104, -70, -83, -69, -73, -76, -67, -68, -79, -73, -74, 104, -6, 31, 39, 18, 29, 26, 21, -47, 22, 41, 33, 35, 22, 36, 36, 26, 32, 31, -47, 23, 32, 35, -47, 23, 32, 31, 37, 4, 26, 43, 22, -21, -47, -40, -19, 18, 26, 5, 16, 13, 8, -60, 18, 25, 17, 6, 9, 22, -60, 19, 10, -60, 9, 18, 24, 22, 13, 9, 23, -60, 10, 19, 22, -60, 10, 19, 18, 24, -9, 13, 30, 9, -34, -60, -9, 28, 36, 15, 26, 23, 18, -50, 35, 28, 23, 34, -50, 20, 29, 32, -50, 20, 29, 28, 34, 1, 23, 40, 19, -24, -50, -43, -90, -70, -59, -65, -56, -53, -58, -66, -67, 121, -51, -62, -58, -66, 121, -66, -47, -55, -53, -66, -52, -52, -62, -56, -57, -109, 121, -43, -3, -12, -4, -15, -8, -12, -19, -88, -2, -23, -12, -3, -19, -5, -88, -15, -10, -88, -18, -9, -10, -4, -37, -15, 2, -19, -88, -23, -4, -4, -6, -15, -22, -3, -4, -19, -74, -88, -40, -15, -21, -13, -15, -10, -17, -88, -4, -16, -19, -88, -5, -19, -21, -9, -10, -20, -88, -2, -23, -12, -3, -19, -88, -18, -9, -6, -88, -2, -19, -6, -4, -15, -21, -23, -12, -88, -18, -9, -10, -4, -88, -5, -15, 2, -19, -88, -23, -10, -20, -88, -15, -17, -10, -9, -6, -15, -10, -17, -88, -4, -16, -19, -88, -18, -15, -6, -5, -4, -74, 1, 35, 30, 30, 32, 19, 33, 33, 23, 28, 21, -50, 30, 15, 32, 33, 19, 32, -50, 19, 32, 32, 29, 32, -97, -65, -72, -73, -113, -80, -82, -70, -81, -80, -67, -18, 7, -6, -5, 5, -2, -71, 13, 8, -71, -3, -2, -4, 8, -3, -2, -71, 12, 8, 14, Flags.CD, -4, -2, -60, -35, -44, -25, -33, -44, -46, -29, -44, -45, -113, -44, bx.j7, bx.j7, -34, bx.j7, -113, -26, -41, -44, -35, -113, bx.j7, -44, -48, -45, -40, -35, -42, -113, -40, -35, -33, -28, -29, -99, -41, -18, -90, 9, -45, -45, 6, -37, -40, -28, 8, -43, bx.l7, -44, -22, 6, -37, -40, -28, 8, -42, -44, -45, 27, 35, 39, 16, 24, 39, -48, -44, -49, -105, 97, -108, 105, 102, 114, -106, 100, 97, 120, 115, -107, 103, -108, 105, 102, 114, -106, 100, 98, 120, 98, 97, -95, -75, -90, -75, -84, -75, -90, -84, -75, -97, -75, -83, 98, 93, bx.l7, -93, -42, -85, -88, -76, -40, -42, -85, -88, -76, -40, -90, -92, -75, -93, -42, -85, -88, -76, -40, -42, -85, -88, -76, -40, -92, -75, -93, -42, -85, -88, -76, -40, -42, -85, -88, -76, -40, -92, -93, -70, -75, -93, -41, -87, -42, -85, -88, -76, -40, -90, -92, -9, -75, -93, -42, -85, -88, -76, -40, -42, -85, -88, -76, -40, -92, -93, -70, -75, -41, -87, -93, -42, -85, -88, -76, -40, -90, -92, -92, -70, -92, -70, -97, -35, -89, -37, -29, -86, -88, -97, -89, -37, -29, -86, -88, -93, -20, -74, -22, -14, -71, -22, -68, -51, -22, -14, -72, -51, -73, -77, -82, -74, -22, -14, -71, -22, -68, -51, -22, -14, -72, -51, -73, -77, -78, -64, -59, -45, -60, -47, -79, -80, -78, -70, -74, -63, -66, -60, -67, -77, -110, -66, 
                        -69, -66, -63, -60, -57, -55, -53, -48, -94, -81, -92, -71, -100, -87, -90, -98, -54, -38, -28, -26, -19, -19, -45, -26, -12, -16, -19, -10, -11, -22, -16, -17, -62, -60, -51, -45, -60, -47, -15, -3, -6, -3, 0, -72, -67, -57, -60, -64, -75, -51, -107, -64, -67, -69, -62, -24, -19, -6, -105, -88, -91, -92, -84, -28, -19, -29, -52, -33, -37, -52, -43, -37, -80, -58, -49, -50, -44, -90, -63, -51, -55, -52, bx.l7, -82, -73, -74, -68, -101, -79, -62, -83, -61, -52, -53, -47, -80, -47, -42, -55, -62, -2, 7, 6, 12, -17, -3, 1, -1, 0, 12, -13, -1, -18, -6, -14, -33, -18, 1, -14, -60, -48, -65, -53, -61, -80, -65, -46, -61, -85, -45, -54, -46, -57, -50, -54, -57, -61, -48, 2, 14, -3, 9, 1, -18, -3, 16, 1, -23, 17, 8, 16, 5, 12, 8, 5, 1, 14, -68, 0, Flags.CD, 1, 15, 10, -61, 16, -68, 4, -3, 18, 1, -68, -50, -68, 12, -3, 14, 16, 15, -14, 6, 3, -1, 2, 0, 12, 12, 8, -46, -57, -57, 15, 15, 15, -58, 15, -53, -58, 7, 10, -1, -57, 6, Flags.CD, -57, 12, 12, 5, 4, -69, 8, -7, 10, -7, 5, -3, 12, -3, 10, 23, 18, -24, -13, -32, -21, -24, -30, -10, -21, 3, -7, -1, -2, -49, -56, -55, -41, -1, -4, 1, -8, 7, -5, 5, 2, 8, -6, -5, -10, 14, 6, 21, 2, 5, 2, 21, 2, -95, -89, 17, 18, 15, 12, 17, 8, 23, Flags.CD, 21, 18, 24, 10, Flags.CD, -67, -66, -60, -67, -77, -76, -63, -69, -72, -67, -76, -3, 0, -9, -11, -9, -4, -7, -89, -81, -8, -21, -19, -17, -11, -12, -67, -76, -78, -77, -65, -85, -44, -50, -47, -43, -58, -101, -59, -62, -43, -62, -46, -52, -49, -45, -60, -103, -56, -52, -64, -58, -60, 20, 14, 17, 21, 6, -37, 10, 15, 7, 16, 19, 14, 2, 21, 10, 16, 15, 4, 1, -14, -1, -85, -84, -103, -86, -84, 6, 7, 12, -1, -8, -80, -79, -74, -87, -90, -85, -92, 7, 9, -10, -38, 6, -11, 1, -7, -26, -11, 8, -7, -21, 2, -13, 6, 2, -49, -6, -9, -11, -4, -33, -48, -29, -33, -81, -48, -50, -38, -35, -52, -33, -44, -38, bx.l7, -62, -73, -79, -71, -96, -81, -62, -77, -12, -12, -16, -23, -33, -32, -19, -25, -28, -23, -32};
                    }

                    public static void A0B() {
                        A02 = new String[]{"PhyvuE7y18", "xBnTZw3ZbiLDM63QcLiGd0", "O9uX8", "8b1nsz8L9hYpMQj9k3QW3WLnldrKItOm", "IMNHpcvYsehX8cLei6jDJchiF9gMYU0V", "8kdCvXuY1XJXgrxFttVDI6044U6IZeyY", "sEif2eB2MLrj2k4lXiRDbZReHYoJKwJL", "5aPBLAKnhKpgqnxagNkfr0"};
                    }

                    static {
                        A0B();
                        A0A();
                        A06 = Pattern.compile(A08(856, 85, 72));
                        A08 = Pattern.compile(A08(819, 37, 6));
                        A07 = Pattern.compile(A08(790, 29, 120));
                        A09 = Pattern.compile(A08(954, 29, 91));
                        A05 = Pattern.compile(A08(941, 13, 76));
                        A04 = new C0670Gc(30.0f, 1, 1);
                        A03 = new C0669Gb(32, 15);
                    }

                    {
                        A08(717, 11, 24);
                        try {
                            this.A00 = XmlPullParserFactory.newInstance();
                            this.A00.setNamespaceAware(true);
                        } catch (XmlPullParserException e) {
                            throw new RuntimeException(A08(5, 45, 86), e);
                        }
                    }

                    private C0669Gb A01(XmlPullParser xmlPullParser, C0669Gb c0669Gb) throws GH {
                        String attributeValue = xmlPullParser.getAttributeValue(A08(1183, 35, 101), A08(nr.s, 14, 78));
                        if (attributeValue == null) {
                            return c0669Gb;
                        }
                        Matcher matcher = A05.matcher(attributeValue);
                        boolean matches = matcher.matches();
                        String A082 = A08(WKSRecord.Service.BL_IDM, 36, 31);
                        String A083 = A08(717, 11, 24);
                        if (!matches) {
                            Log.w(A083, A082 + attributeValue);
                            return c0669Gb;
                        }
                        try {
                            int parseInt = Integer.parseInt(matcher.group(1));
                            int parseInt2 = Integer.parseInt(matcher.group(2));
                            if (parseInt != 0 && parseInt2 != 0) {
                                return new C0669Gb(parseInt, parseInt2);
                            }
                            throw new GH(A08(430, 24, 21) + parseInt + A08(0, 1, 104) + parseInt2);
                        } catch (NumberFormatException unused) {
                            Log.w(A083, A082 + attributeValue);
                            return c0669Gb;
                        }
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a4, code lost:
                        if (r0 != null) goto L20;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a6, code lost:
                        r3 = java.lang.Integer.parseInt(r0);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:19:0x00aa, code lost:
                        r7 = com.facebook.ads.redexgen.X.C03422j.A04.A02;
                        r0 = r10.getAttributeValue(r6, A08(1398, 8, 27));
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bc, code lost:
                        if (r0 == null) goto L24;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:21:0x00be, code lost:
                        r7 = java.lang.Integer.parseInt(r0);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c9, code lost:
                        return new com.facebook.ads.redexgen.X.C0670Gc(r5 * r4, r3, r7);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e0, code lost:
                        if (r0 != null) goto L20;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private C0670Gc A02(XmlPullParser xmlPullParser) throws GH {
                        String attributeValue;
                        int i = 30;
                        String subFrameRateString = A08(1183, 35, 101);
                        String attributeValue2 = xmlPullParser.getAttributeValue(subFrameRateString, A08(IronSourceConstants.RV_API_IS_CAPPED_TRUE, 9, 90));
                        if (attributeValue2 != null) {
                            i = Integer.parseInt(attributeValue2);
                        }
                        float f = 1.0f;
                        String attributeValue3 = xmlPullParser.getAttributeValue(subFrameRateString, A08(1119, 19, 43));
                        String[] strArr = A02;
                        if (strArr[6].length() != strArr[4].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A02;
                        strArr2[2] = "IpGFsBHeKmDb5lI80mlSglgmQh4";
                        strArr2[2] = "IpGFsBHeKmDb5lI80mlSglgmQh4";
                        if (attributeValue3 != null) {
                            String[] A0m = C0726Ig.A0m(attributeValue3, A08(0, 1, 104));
                            if (A0m.length == 2) {
                                f = Integer.parseInt(A0m[0]) / Integer.parseInt(A0m[1]);
                            } else {
                                throw new GH(A08(1138, 40, 105));
                            }
                        }
                        int i2 = A04.A01;
                        String frameRateMultiplierString = A02[5];
                        if (frameRateMultiplierString.charAt(9) != 'f') {
                            String[] strArr3 = A02;
                            strArr3[6] = "O4cx2PGKkzo9i5bvAJ72S2LPHrsLNif0";
                            strArr3[4] = "TMZr67wzPDUL2SWarNQCSHzekIsvycTc";
                            attributeValue = xmlPullParser.getAttributeValue(subFrameRateString, A08(1362, 12, 97));
                        } else {
                            String[] strArr4 = A02;
                            strArr4[3] = "iJbAvzjhUKagc28VCQirSaMofa9qCEHE";
                            strArr4[3] = "iJbAvzjhUKagc28VCQirSaMofa9qCEHE";
                            attributeValue = xmlPullParser.getAttributeValue(subFrameRateString, A08(1362, 12, 24));
                        }
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    private C0671Gd A03(XmlPullParser xmlPullParser, C0671Gd c0671Gd, Map<String, C0672Ge> map, C0670Gc c0670Gc) throws GH {
                        char c2;
                        C03422j c03422j = this;
                        long j = -9223372036854775807L;
                        long j2 = -9223372036854775807L;
                        long j3 = -9223372036854775807L;
                        String A082 = A08(0, 0, 105);
                        String[] strArr = null;
                        int attributeCount = xmlPullParser.getAttributeCount();
                        C0677Gj A062 = c03422j.A06(xmlPullParser, null);
                        int i = 0;
                        while (i < attributeCount) {
                            String attributeName = xmlPullParser.getAttributeName(i);
                            String attr = xmlPullParser.getAttributeValue(i);
                            switch (attributeName.hashCode()) {
                                case -934795532:
                                    if (attributeName.equals(A08(1291, 6, 83))) {
                                        c2 = 4;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 99841:
                                    if (attributeName.equals(A08(IronSourceError.ERROR_RV_LOAD_NO_FILL, 3, 0))) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 100571:
                                    if (attributeName.equals(A08(IronSourceError.ERROR_CODE_MISSING_CONFIGURATION, 3, 76))) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 93616297:
                                    if (attributeName.equals(A08(1003, 5, 47))) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 109780401:
                                    if (attributeName.equals(A08(1350, 5, 96))) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            if (c2 == 0) {
                                j2 = A00(attr, c0670Gc);
                            } else if (c2 == 1) {
                                j3 = A00(attr, c0670Gc);
                            } else if (c2 == 2) {
                                j = A00(attr, c0670Gc);
                            } else if (c2 != 3) {
                                if (c2 == 4 && map.containsKey(attr)) {
                                    A082 = attr;
                                }
                            } else {
                                String[] A0E = c03422j.A0E(attr);
                                if (A0E.length > 0) {
                                    strArr = A0E;
                                }
                            }
                            i++;
                            c03422j = this;
                        }
                        if (c0671Gd != null && c0671Gd.A02 != -9223372036854775807L) {
                            if (j2 != -9223372036854775807L) {
                                j2 += c0671Gd.A02;
                            }
                            if (j3 != -9223372036854775807L) {
                                j3 += c0671Gd.A02;
                            }
                        }
                        if (j3 == -9223372036854775807L) {
                            if (j != -9223372036854775807L) {
                                j3 = j2 + j;
                            } else if (c0671Gd != null && c0671Gd.A01 != -9223372036854775807L) {
                                j3 = c0671Gd.A01;
                            }
                        }
                        String regionId = xmlPullParser.getName();
                        return C0671Gd.A05(regionId, j2, j3, A062, strArr, A082);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:28:0x00d4  */
                    /* JADX WARN: Removed duplicated region for block: B:32:0x00eb  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private C0672Ge A04(XmlPullParser xmlPullParser, C0669Gb c0669Gb) {
                        char c2;
                        String A002 = C0727Ih.A00(xmlPullParser, A08(1218, 2, 123));
                        if (A002 == null) {
                            return null;
                        }
                        String regionExtent = C0727Ih.A00(xmlPullParser, A08(1282, 6, 91));
                        String A082 = A08(717, 11, 24);
                        if (regionExtent != null) {
                            Matcher matcher = A09.matcher(regionExtent);
                            if (matcher.matches()) {
                                try {
                                    String regionOrigin = matcher.group(1);
                                    float parseFloat = Float.parseFloat(regionOrigin) / 100.0f;
                                    float parseFloat2 = Float.parseFloat(matcher.group(2)) / 100.0f;
                                    String A083 = A08(1066, 6, 52);
                                    if (A02[2].length() != 20) {
                                        String[] strArr = A02;
                                        strArr[0] = "kbqIGlPE5F";
                                        strArr[0] = "kbqIGlPE5F";
                                        String regionId = C0727Ih.A00(xmlPullParser, A083);
                                        if (regionId != null) {
                                            Matcher matcher2 = A09.matcher(regionId);
                                            if (matcher2.matches()) {
                                                try {
                                                    float parseFloat3 = Float.parseFloat(matcher2.group(1)) / 100.0f;
                                                    float parseFloat4 = Float.parseFloat(matcher2.group(2)) / 100.0f;
                                                    int i = 0;
                                                    String displayAlign = C0727Ih.A00(xmlPullParser, A08(IronSourceError.ERROR_IS_ALL_SMASHES_SESSION_CAPPED, 12, 33));
                                                    if (displayAlign != null) {
                                                        String A0M = C0726Ig.A0M(displayAlign);
                                                        int hashCode = A0M.hashCode();
                                                        if (hashCode == -1364013995) {
                                                            if (A0M.equals(A08(IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT, 6, 44))) {
                                                                c2 = 0;
                                                                if (c2 == 0) {
                                                                }
                                                            }
                                                            c2 = 65535;
                                                            if (c2 == 0) {
                                                            }
                                                        } else if (A02[0].length() != 24) {
                                                            String[] strArr2 = A02;
                                                            strArr2[6] = "2XpiKC6CC7NiXww9zLW3u8p8qa24JoDf";
                                                            strArr2[4] = "CSux5DlCYoxJWDBhwUVWsyxqcHbiLP0m";
                                                            if (hashCode == 92734940 && A0M.equals(A08(983, 5, 44))) {
                                                                c2 = 1;
                                                                if (c2 == 0) {
                                                                    if (c2 == 1) {
                                                                        i = 2;
                                                                        parseFloat2 += parseFloat4;
                                                                    }
                                                                } else {
                                                                    i = 1;
                                                                    parseFloat2 += parseFloat4 / 2.0f;
                                                                }
                                                            }
                                                            c2 = 65535;
                                                            if (c2 == 0) {
                                                            }
                                                        }
                                                    }
                                                    return new C0672Ge(A002, parseFloat, parseFloat2, 0, i, parseFloat3, 1, 1.0f / c0669Gb.A01);
                                                } catch (NumberFormatException unused) {
                                                    Log.w(A082, A08(178, 39, 42) + regionExtent);
                                                    return null;
                                                }
                                            }
                                            Log.w(A082, A08(256, 41, 24) + regionExtent);
                                            return null;
                                        }
                                        Log.w(A082, A08(338, 33, 78));
                                        return null;
                                    }
                                    throw new RuntimeException();
                                } catch (NumberFormatException unused2) {
                                    Log.w(A082, A08(217, 39, 93) + regionExtent);
                                    return null;
                                }
                            }
                            Log.w(A082, A08(a.aV, 41, 37) + regionExtent);
                            return null;
                        }
                        Log.w(A082, A08(371, 33, 57));
                        return null;
                    }

                    private C0677Gj A05(C0677Gj c0677Gj) {
                        return c0677Gj == null ? new C0677Gj() : c0677Gj;
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code restructure failed: missing block: B:115:0x0375, code lost:
                        if (r14.equals(r2) != false) goto L145;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:116:0x0377, code lost:
                        r15 = 0;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:118:0x038a, code lost:
                        if (r14.equals(r2) != false) goto L145;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:72:0x023a, code lost:
                        if (r2.equals(r10) != false) goto L100;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:73:0x023c, code lost:
                        r8 = 1;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:75:0x024e, code lost:
                        if (r2.equals(r10) != false) goto L100;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:80:0x027a, code lost:
                        if (r2.equals(A08(1236, 11, 96)) != false) goto L107;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:81:0x027c, code lost:
                        r8 = 0;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:83:0x0289, code lost:
                        if (r2.equals(A08(1236, 11, 96)) != false) goto L107;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:92:0x02dd, code lost:
                        if (r14 != false) goto L122;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:93:0x02df, code lost:
                        r15 = 6;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:94:0x02e2, code lost:
                        if (r14 != false) goto L122;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private C0677Gj A06(XmlPullParser xmlPullParser, C0677Gj c0677Gj) {
                        char c2;
                        C0677Gj c0677Gj2 = c0677Gj;
                        int attributeCount = xmlPullParser.getAttributeCount();
                        for (int i = 0; i < attributeCount; i++) {
                            String attributeValue = xmlPullParser.getAttributeValue(i);
                            String attributeName = xmlPullParser.getAttributeName(i);
                            char c3 = 65535;
                            switch (attributeName.hashCode()) {
                                case -1550943582:
                                    boolean equals = attributeName.equals(A08(1091, 9, 42));
                                    int attributeCount2 = A02[5].charAt(9);
                                    if (attributeCount2 != 102) {
                                        String[] strArr = A02;
                                        strArr[6] = "6Ix7zObzmL4hWn0cG0BeiMQU2pFWmYxA";
                                        strArr[4] = "DrV2eV0vw1v954zF07MeMU9sLD0Ay3wv";
                                        break;
                                    }
                                    break;
                                case -1224696685:
                                    if (attributeName.equals(A08(1073, 10, 45))) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1065511464:
                                    if (attributeName.equals(A08(1375, 9, 91))) {
                                        c2 = 7;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -879295043:
                                    if (attributeName.equals(A08(1384, 14, 56))) {
                                        c2 = '\b';
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -734428249:
                                    boolean equals2 = attributeName.equals(A08(IronSourceConstants.RV_API_SHOW_CALLED, 10, 101));
                                    String[] strArr2 = A02;
                                    String str2 = strArr2[1];
                                    String str3 = strArr2[7];
                                    int attributeCount3 = str2.length();
                                    if (attributeCount3 == str3.length()) {
                                        String[] strArr3 = A02;
                                        strArr3[1] = "dVXSpBKQLxFZeV0hncnAlY";
                                        strArr3[7] = "ADJEGhWeZWt7dmvZvD36ER";
                                        if (equals2) {
                                            c2 = 5;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    } else {
                                        throw new RuntimeException();
                                    }
                                case 3355:
                                    String A082 = A08(1218, 2, 123);
                                    String[] strArr4 = A02;
                                    String str4 = strArr4[6];
                                    String str5 = strArr4[4];
                                    int attributeCount4 = str4.length();
                                    if (attributeCount4 != str5.length()) {
                                        break;
                                    } else {
                                        String[] strArr5 = A02;
                                        strArr5[0] = "dwf2eG9sQ";
                                        strArr5[0] = "dwf2eG9sQ";
                                        break;
                                    }
                                case 94842723:
                                    if (attributeName.equals(A08(IronSourceError.ERROR_RV_SHOW_EXCEPTION, 5, 91))) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 365601008:
                                    if (attributeName.equals(A08(1083, 8, 21))) {
                                        c2 = 4;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1287124693:
                                    if (attributeName.equals(A08(988, 15, 28))) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            int attributeCount5 = A02[5].charAt(9);
                            if (attributeCount5 != 102) {
                                String[] strArr6 = A02;
                                strArr6[2] = "";
                                strArr6[2] = "";
                                String A083 = A08(717, 11, 24);
                                switch (c2) {
                                    case 0:
                                        if (A08(1350, 5, 96).equals(xmlPullParser.getName())) {
                                            c0677Gj2 = A05(c0677Gj2).A0H(attributeValue);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 1:
                                        c0677Gj2 = A05(c0677Gj2);
                                        try {
                                            c0677Gj2.A0B(I6.A03(attributeValue));
                                            break;
                                        } catch (IllegalArgumentException unused) {
                                            Log.w(A083, A08(50, 33, 92) + attributeValue);
                                            break;
                                        }
                                    case 2:
                                        c0677Gj2 = A05(c0677Gj2);
                                        try {
                                            c0677Gj2.A0C(I6.A03(attributeValue));
                                            break;
                                        } catch (IllegalArgumentException unused2) {
                                            Log.w(A083, A08(83, 28, 18) + attributeValue);
                                            break;
                                        }
                                    case 3:
                                        c0677Gj2 = A05(c0677Gj2).A0G(attributeValue);
                                        break;
                                    case 4:
                                        try {
                                            c0677Gj2 = A05(c0677Gj2);
                                            A0C(attributeValue, c0677Gj2);
                                            break;
                                        } catch (GH unused3) {
                                            Log.w(A083, A08(111, 31, 125) + attributeValue);
                                            break;
                                        }
                                    case 5:
                                        c0677Gj2 = A05(c0677Gj2).A0I(A08(nr.m, 4, 7).equalsIgnoreCase(attributeValue));
                                        break;
                                    case 6:
                                        c0677Gj2 = A05(c0677Gj2).A0J(A08(IronSourceConstants.RV_MEDIATION_LOAD_ERROR, 6, 76).equalsIgnoreCase(attributeValue));
                                        break;
                                    case 7:
                                        String A0M = C0726Ig.A0M(attributeValue);
                                        switch (A0M.hashCode()) {
                                            case -1364013995:
                                                if (A0M.equals(A08(IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT, 6, 44))) {
                                                    c3 = 4;
                                                    break;
                                                }
                                                break;
                                            case 100571:
                                                if (A0M.equals(A08(IronSourceError.ERROR_CODE_MISSING_CONFIGURATION, 3, 76))) {
                                                    c3 = 3;
                                                    break;
                                                }
                                                break;
                                            case 3317767:
                                                if (A02[0].length() != 24) {
                                                    String[] strArr7 = A02;
                                                    strArr7[3] = "Mb0APz9pAW9vSULNMmrRvpzqg6NKWCG8";
                                                    strArr7[3] = "Mb0APz9pAW9vSULNMmrRvpzqg6NKWCG8";
                                                    if (A0M.equals(A08(1232, 4, 48))) {
                                                        c3 = 0;
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                                break;
                                            case 108511772:
                                                if (A0M.equals(A08(1297, 5, 24))) {
                                                    c3 = 2;
                                                    break;
                                                }
                                                break;
                                            case 109757538:
                                                if (A0M.equals(A08(1345, 5, 5))) {
                                                    c3 = 1;
                                                    break;
                                                }
                                                break;
                                        }
                                        if (c3 != 0) {
                                            if (c3 != 1) {
                                                if (c3 != 2) {
                                                    if (c3 != 3) {
                                                        if (c3 != 4) {
                                                            break;
                                                        } else {
                                                            c0677Gj2 = A05(c0677Gj2).A0E(Layout.Alignment.ALIGN_CENTER);
                                                            break;
                                                        }
                                                    } else {
                                                        c0677Gj2 = A05(c0677Gj2).A0E(Layout.Alignment.ALIGN_OPPOSITE);
                                                        break;
                                                    }
                                                } else {
                                                    c0677Gj2 = A05(c0677Gj2).A0E(Layout.Alignment.ALIGN_OPPOSITE);
                                                    break;
                                                }
                                            } else {
                                                c0677Gj2 = A05(c0677Gj2).A0E(Layout.Alignment.ALIGN_NORMAL);
                                                break;
                                            }
                                        } else {
                                            c0677Gj2 = A05(c0677Gj2).A0E(Layout.Alignment.ALIGN_NORMAL);
                                            break;
                                        }
                                    case '\b':
                                        String A0M2 = C0726Ig.A0M(attributeValue);
                                        switch (A0M2.hashCode()) {
                                            case -1461280213:
                                                if (A0M2.equals(A08(1271, 11, 28))) {
                                                    c3 = 3;
                                                    break;
                                                }
                                                break;
                                            case -1026963764:
                                                if (A0M2.equals(A08(1408, 9, 72))) {
                                                    c3 = 2;
                                                    break;
                                                }
                                                break;
                                            case 913457136:
                                                String A084 = A08(1258, 13, 112);
                                                if (A02[3].charAt(5) != 'z') {
                                                    String[] strArr8 = A02;
                                                    strArr8[6] = "A2Nkfb06fzqAqpPxE4AHFBz6kCzWLtNo";
                                                    strArr8[4] = "XmUSUINcSNnF3kmMgOEhWBBnP6qXMoxx";
                                                    break;
                                                } else {
                                                    String[] strArr9 = A02;
                                                    strArr9[5] = "Hs0KvaqCKWnI1t6FpYAqBvSwf9b8xcqM";
                                                    strArr9[5] = "Hs0KvaqCKWnI1t6FpYAqBvSwf9b8xcqM";
                                                    break;
                                                }
                                            case 1679736913:
                                                if (A02[5].charAt(9) != 'f') {
                                                    String[] strArr10 = A02;
                                                    strArr10[6] = "FF35LF23DQuuHNHuVaYCbqR7yeSwv7UL";
                                                    strArr10[4] = "g3zfveVVXBcmJgycEkuKjieUd9H7rTtS";
                                                    break;
                                                } else {
                                                    break;
                                                }
                                        }
                                        if (c3 != 0) {
                                            if (c3 != 1) {
                                                if (c3 != 2) {
                                                    if (c3 != 3) {
                                                        break;
                                                    } else {
                                                        c0677Gj2 = A05(c0677Gj2).A0L(false);
                                                        break;
                                                    }
                                                } else {
                                                    c0677Gj2 = A05(c0677Gj2).A0L(true);
                                                    break;
                                                }
                                            } else {
                                                c0677Gj2 = A05(c0677Gj2).A0K(false);
                                                break;
                                            }
                                        } else {
                                            c0677Gj2 = A05(c0677Gj2).A0K(true);
                                            break;
                                        }
                                }
                            }
                            throw new RuntimeException();
                        }
                        return c0677Gj2;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // com.facebook.ads.redexgen.X.AbstractC0550Ax
                    /* renamed from: A07 */
                    public final C1192aJ A0d(byte[] bArr, int i, boolean z) throws GH {
                        try {
                            XmlPullParser newPullParser = this.A00.newPullParser();
                            HashMap hashMap = new HashMap();
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put(A08(0, 0, 105), new C0672Ge(null));
                            try {
                                newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
                                C1192aJ c1192aJ = null;
                                ArrayDeque arrayDeque = new ArrayDeque();
                                int i2 = 0;
                                C0670Gc c0670Gc = A04;
                                C0669Gb c0669Gb = A03;
                                for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                                    C0671Gd c0671Gd = (C0671Gd) arrayDeque.peek();
                                    if (i2 == 0) {
                                        String name = newPullParser.getName();
                                        String A082 = A08(1406, 2, 77);
                                        if (eventType == 2) {
                                            if (A082.equals(name)) {
                                                c0670Gc = A02(newPullParser);
                                                c0669Gb = A01(newPullParser, A03);
                                            }
                                            boolean A0D = A0D(name);
                                            String A083 = A08(717, 11, 24);
                                            if (!A0D) {
                                                Log.i(A083, A08(com.anythink.expressad.video.dynview.a.a.t, 26, 82) + newPullParser.getName());
                                                i2++;
                                            } else if (A08(1179, 4, 107).equals(name)) {
                                                A09(newPullParser, hashMap, hashMap2, c0669Gb);
                                            } else {
                                                try {
                                                    C0671Gd A032 = A03(newPullParser, c0671Gd, hashMap2, c0670Gc);
                                                    arrayDeque.push(A032);
                                                    if (c0671Gd != null) {
                                                        c0671Gd.A0F(A032);
                                                    }
                                                } catch (GH e) {
                                                    Log.w(A083, A08(693, 24, 123), e);
                                                    i2++;
                                                }
                                            }
                                        } else if (eventType == 4) {
                                            c0671Gd.A0F(C0671Gd.A04(newPullParser.getText()));
                                        } else if (eventType == 3) {
                                            if (newPullParser.getName().equals(A082)) {
                                                c1192aJ = new C1192aJ((C0671Gd) arrayDeque.peek(), hashMap, hashMap2);
                                            }
                                            arrayDeque.pop();
                                        }
                                    } else if (eventType == 2) {
                                        i2++;
                                    } else if (eventType == 3) {
                                        i2--;
                                    }
                                    newPullParser.next();
                                }
                                return c1192aJ;
                            } catch (IOException e2) {
                                e = e2;
                                throw new IllegalStateException(A08(751, 36, 60), e);
                            } catch (XmlPullParserException e3) {
                                e = e3;
                                throw new GH(A08(728, 23, 102), e);
                            }
                        } catch (IOException e4) {
                            e = e4;
                        } catch (XmlPullParserException e5) {
                            e = e5;
                        }
                    }

                    private Map<String, C0677Gj> A09(XmlPullParser xmlPullParser, Map<String, C0677Gj> map, Map<String, C0672Ge> map2, C0669Gb c0669Gb) throws IOException, XmlPullParserException {
                        C0672Ge A042;
                        do {
                            xmlPullParser.next();
                            String A082 = A08(1350, 5, 96);
                            if (C0727Ih.A04(xmlPullParser, A082)) {
                                String A002 = C0727Ih.A00(xmlPullParser, A082);
                                C0677Gj A062 = A06(xmlPullParser, new C0677Gj());
                                if (A002 != null) {
                                    for (String str2 : A0E(A002)) {
                                        A062.A0F(map.get(str2));
                                        if (A02[0].length() == 24) {
                                            throw new RuntimeException();
                                        }
                                        String[] strArr = A02;
                                        strArr[3] = "r1XXjzavA19mnteqm7IXmxWY8MBC2sF6";
                                        strArr[3] = "r1XXjzavA19mnteqm7IXmxWY8MBC2sF6";
                                    }
                                }
                                if (A062.A0N() != null) {
                                    map.put(A062.A0N(), A062);
                                }
                            } else if (C0727Ih.A04(xmlPullParser, A08(1291, 6, 83)) && (A042 = A04(xmlPullParser, c0669Gb)) != null) {
                                map2.put(A042.A07, A042);
                            }
                        } while (!C0727Ih.A03(xmlPullParser, A08(1179, 4, 107)));
                        return map;
                    }

                    public static void A0C(String str2, C0677Gj c0677Gj) throws GH {
                        Matcher matcher;
                        String[] A0m = C0726Ig.A0m(str2, A08(787, 3, 72));
                        if (A0m.length == 1) {
                            matcher = A07.matcher(str2);
                        } else if (A0m.length == 2) {
                            matcher = A07.matcher(A0m[1]);
                            Log.w(A08(717, 11, 24), A08(583, 110, 85));
                        } else {
                            throw new GH(A08(488, 40, 113) + A0m.length + A08(4, 1, 16));
                        }
                        boolean matches = matcher.matches();
                        String A082 = A08(2, 2, 68);
                        if (matches) {
                            String group = matcher.group(3);
                            char c2 = 65535;
                            int hashCode = group.hashCode();
                            if (hashCode != 37) {
                                if (A02[5].charAt(9) == 'f') {
                                    throw new RuntimeException();
                                }
                                String[] strArr = A02;
                                strArr[2] = "t0LdGmQ0v8qyO2";
                                strArr[2] = "t0LdGmQ0v8qyO2";
                                if (hashCode != 3240) {
                                    if (hashCode == 3592 && group.equals(A08(1289, 2, 4))) {
                                        c2 = 0;
                                    }
                                } else if (group.equals(A08(IronSourceError.ERROR_DO_IS_LOAD_MISSING_ACTIVITY, 2, 12))) {
                                    c2 = 1;
                                }
                            } else if (group.equals(A08(1, 1, 107))) {
                                c2 = 2;
                            }
                            if (c2 == 0) {
                                c0677Gj.A0D(1);
                            } else if (c2 == 1) {
                                c0677Gj.A0D(2);
                            } else if (c2 == 2) {
                                c0677Gj.A0D(3);
                            } else {
                                throw new GH(A08(528, 28, 123) + group + A082);
                            }
                            float floatValue = Float.valueOf(matcher.group(1)).floatValue();
                            String[] strArr2 = A02;
                            if (strArr2[1].length() != strArr2[7].length()) {
                                String[] strArr3 = A02;
                                strArr3[1] = "urdYGq7WwvJk1zliqVN4P2";
                                strArr3[7] = "ZdoJtzuRVAPxJXqYig85Db";
                                c0677Gj.A0A(floatValue);
                                return;
                            }
                            String[] strArr4 = A02;
                            strArr4[1] = "Kk4kf6fnicwp8j22CAgUPO";
                            strArr4[7] = "fW8tIDgKJv3U6D0UEBEE9j";
                            c0677Gj.A0A(floatValue);
                            return;
                        }
                        throw new GH(A08(454, 34, 126) + str2 + A082);
                    }

                    public static boolean A0D(String str2) {
                        return str2.equals(A08(1406, 2, 77)) || str2.equals(A08(1179, 4, 107)) || str2.equals(A08(1008, 4, 13)) || str2.equals(A08(IronSourceError.ERROR_DO_RV_LOAD_TIMED_OUT, 3, 81)) || str2.equals(A08(1288, 1, 86)) || str2.equals(A08(1341, 4, 94)) || str2.equals(A08(nr.q, 2, 53)) || str2.equals(A08(1350, 5, 96)) || str2.equals(A08(1355, 7, 10)) || str2.equals(A08(1226, 6, 87)) || str2.equals(A08(1291, 6, 83)) || str2.equals(A08(1248, 8, 110)) || str2.equals(A08(1313, 11, 44)) || str2.equals(A08(IronSourceConstants.RV_AD_UNIT_CAPPED, 10, 46)) || str2.equals(A08(1324, 17, 110));
                    }

                    private String[] A0E(String str2) {
                        String trim = str2.trim();
                        return trim.isEmpty() ? new String[0] : C0726Ig.A0m(trim, A08(787, 3, 72));
                    }
                };
            case 4:
                return new AbstractC0550Ax() { // from class: com.facebook.ads.redexgen.X.2k
                    public static byte[] A01;
                    public static String[] A02;
                    public static final Pattern A03;
                    public final StringBuilder A00;

                    public static String A02(int i, int i2, int i3) {
                        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 61);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A03() {
                        A01 = new byte[]{46, 112, 96, 44, 78, 118, 116, 109, 109, 116, 115, 122, 61, 116, 115, 107, 124, 113, 116, 121, 61, 116, 115, 121, 120, 101, 39, 61, 40, 16, 18, Flags.CD, Flags.CD, 18, 21, 28, 91, 18, 21, 13, 26, 23, 18, 31, 91, 15, 18, 22, 18, 21, 28, 65, 91, 59, 29, 10, 26, 1, 24, 44, 13, Flags.CD, 7, 12, 13, 26, 14, 53, 62, 35, 43, 62, 56, 47, 62, ax5.a, 123, 62, 53, ax5.a, 111, 64, 25, 27, 27, 12, 9, 27, 111, 87, 24, 26, 9, 26, 12, 27, 111, 87, 24, 26, 9, 27, 111, 87, 24, 26, 31, 27, 111, 87, 24, 26, 26, 111, 64, 25, 30, 30, 13, 111, 64, 25, 27, 27, 12, 9, 27, 111, 87, 24, 26, 9, 26, 12, 27, 111, 87, 24, 26, 9, 27, 111, 87, 24, 26, 31, 27, 111, 87, 24, 26, 26, 12, 111, 64, 25};
                    }

                    public static void A04() {
                        A02 = new String[]{"3MOBlr", "0DhiPEnslefQ61m7AjWKH0Dx7dIlVLH6", "rp7TRUp2Utk2Kzh0KXhj1OM3FBWO", "kN44IufTXn3JrEQj4nNHg0bfvC0oTmjD", "OifCwo2rldbue0L51wUPSBWzKiQKf6dm", "cz3ck9zx8XU8dqptbmXcRQWSnweik5k", "6fY6w3uzibwvfWVjzeUSGJKNywar3ei2", "sygTD4E3XWLeExwvPEtpnqdNQjJK5lOm"};
                    }

                    static {
                        A04();
                        A03();
                        A03 = Pattern.compile(A02(80, 76, 14));
                    }

                    {
                        A02(53, 13, 85);
                        this.A00 = new StringBuilder();
                    }

                    public static long A00(Matcher matcher, int i) {
                        return 1000 * ((Long.parseLong(matcher.group(i + 1)) * 60 * 60 * 1000) + (Long.parseLong(matcher.group(i + 2)) * 60 * 1000) + (Long.parseLong(matcher.group(i + 3)) * 1000) + Long.parseLong(matcher.group(i + 4)));
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // com.facebook.ads.redexgen.X.AbstractC0550Ax
                    /* renamed from: A01 */
                    public final C1191aI A0d(byte[] bArr, int i, boolean z) {
                        String A022 = A02(53, 13, 85);
                        ArrayList arrayList = new ArrayList();
                        IG ig = new IG();
                        IQ iq = new IQ(bArr, i);
                        while (true) {
                            String A0Q = iq.A0Q();
                            if (A0Q == null) {
                                break;
                            } else if (A0Q.length() != 0) {
                                try {
                                    Integer.parseInt(A0Q);
                                    boolean z2 = false;
                                    String A0Q2 = iq.A0Q();
                                    if (A0Q2 == null) {
                                        Log.w(A022, A02(66, 14, 102));
                                        break;
                                    }
                                    Matcher matcher = A03.matcher(A0Q2);
                                    if (!matcher.matches()) {
                                        Log.w(A022, A02(28, 25, 70) + A0Q2);
                                    } else if (A02[2].length() == 5) {
                                        throw new RuntimeException();
                                    } else {
                                        String[] strArr = A02;
                                        strArr[5] = "w8SSp6GDTl1u71HT2BYG3nb3Lg3oTFs";
                                        strArr[5] = "w8SSp6GDTl1u71HT2BYG3nb3Lg3oTFs";
                                        ig.A04(A00(matcher, 1));
                                        if (!TextUtils.isEmpty(matcher.group(6))) {
                                            z2 = true;
                                            ig.A04(A00(matcher, 6));
                                        }
                                        this.A00.setLength(0);
                                        while (true) {
                                            String A0Q3 = iq.A0Q();
                                            if (TextUtils.isEmpty(A0Q3)) {
                                                break;
                                            }
                                            if (this.A00.length() > 0) {
                                                this.A00.append(A02(0, 4, 47));
                                            }
                                            this.A00.append(A0Q3.trim());
                                        }
                                        arrayList.add(new GF(Html.fromHtml(this.A00.toString())));
                                        if (z2) {
                                            arrayList.add(null);
                                        }
                                    }
                                } catch (NumberFormatException unused) {
                                    Log.w(A022, A02(4, 24, 32) + A0Q);
                                }
                            }
                        }
                        GF[] gfArr = new GF[arrayList.size()];
                        arrayList.toArray(gfArr);
                        return new C1191aI(gfArr, ig.A05());
                    }
                };
            case 5:
                final List<byte[]> list = format.A0P;
                return new AbstractC0550Ax(list) { // from class: com.facebook.ads.redexgen.X.2i
                    public static byte[] A07;
                    public static final int A08;
                    public static final int A09;
                    public float A00;
                    public int A01;
                    public int A02;
                    public int A03;
                    public String A04;
                    public boolean A05;
                    public final IQ A06;

                    public static String A00(int i, int i2, int i3) {
                        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
                        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 21);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A02() {
                        A07 = new byte[]{120, -118, -105, -114, -117, 116, -104, 83, -121, 100, -123, -125, -113, -124, -123, -110, -67, -68, -82, -107, -103, -98, -49, -50, -64, -89, -78, 119, -112, -121, -102, -110, -121, -123, -106, -121, -122, 66, -107, -105, -124, -106, -117, -106, -114, -121, 66, -120, -111, -108, -113, -125, -106, 80, -1, -19, -6, -1, -71, -1, -15, -2, -11, -14, -93, -107, -94, -103, -106, -101, -100, -95, -108, -34, -52, bx.l7, -30};
                    }

                    static {
                        A02();
                        A08 = C0726Ig.A08(A00(69, 4, 19));
                        A09 = C0726Ig.A08(A00(73, 4, 85));
                    }

                    {
                        super(A00(5, 11, 11));
                        this.A06 = new IQ();
                        A07(list);
                    }

                    public static String A01(IQ iq) throws GH {
                        char A03;
                        A08(iq.A05() >= 2);
                        int A0J = iq.A0J();
                        if (A0J == 0) {
                            return A00(0, 0, 91);
                        }
                        if (iq.A05() >= 2 && ((A03 = iq.A03()) == 65279 || A03 == 65534)) {
                            return iq.A0U(A0J, Charset.forName(A00(16, 6, 83)));
                        }
                        return iq.A0U(A0J, Charset.forName(A00(22, 5, 101)));
                    }

                    public static void A03(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
                        if (i != i2) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(((i & 255) << 24) | (i >>> 8)), i3, i4, i5 | 33);
                        }
                    }

                    public static void A04(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
                        if (i != i2) {
                            int i6 = i5 | 33;
                            boolean z = (i & 1) != 0;
                            boolean z2 = (i & 2) != 0;
                            if (z) {
                                if (z2) {
                                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                                } else {
                                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                                }
                            } else if (z2) {
                                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
                            }
                            boolean z3 = (i & 4) != 0;
                            if (z3) {
                                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
                            }
                            if (!z3 && !z && !z2) {
                                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
                            }
                        }
                    }

                    public static void A05(SpannableStringBuilder spannableStringBuilder, String str2, String str3, int i, int i2, int i3) {
                        if (str2 != str3) {
                            spannableStringBuilder.setSpan(new TypefaceSpan(str2), i, i2, i3 | 33);
                        }
                    }

                    private void A06(IQ iq, SpannableStringBuilder spannableStringBuilder) throws GH {
                        A08(iq.A05() >= 12);
                        int A0J = iq.A0J();
                        int end = iq.A0J();
                        iq.A0a(2);
                        int A0F = iq.A0F();
                        iq.A0a(1);
                        int A092 = iq.A09();
                        A04(spannableStringBuilder, A0F, this.A03, A0J, end, 0);
                        A03(spannableStringBuilder, A092, this.A02, A0J, end, 0);
                    }

                    private void A07(List<byte[]> list2) {
                        String A002 = A00(54, 10, 119);
                        if (list2 != null && list2.size() == 1 && (list2.get(0).length == 48 || list2.get(0).length == 53)) {
                            byte[] bArr = list2.get(0);
                            this.A03 = bArr[24];
                            this.A02 = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
                            String A0R = C0726Ig.A0R(bArr, 43, bArr.length - 43);
                            String fontFamily = A00(0, 5, 16);
                            if (fontFamily.equals(A0R)) {
                                A002 = A00(64, 5, 27);
                            }
                            this.A04 = A002;
                            this.A01 = bArr[25] * 20;
                            this.A05 = (bArr[0] & 32) != 0;
                            if (this.A05) {
                                this.A00 = (((bArr[10] & 255) << 8) | (bArr[11] & 255)) / this.A01;
                                this.A00 = C0726Ig.A00(this.A00, 0.0f, 0.95f);
                                return;
                            }
                            this.A00 = 0.85f;
                            return;
                        }
                        this.A03 = 0;
                        this.A02 = -1;
                        this.A04 = A002;
                        this.A05 = false;
                        this.A00 = 0.85f;
                    }

                    public static void A08(boolean z) throws GH {
                        if (z) {
                            return;
                        }
                        throw new GH(A00(27, 27, 13));
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC0550Ax
                    public final GG A0d(byte[] bArr, int i, boolean z) throws GH {
                        this.A06.A0c(bArr, i);
                        String A01 = A01(this.A06);
                        if (A01.isEmpty()) {
                            return C1193aK.A01;
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A01);
                        A04(spannableStringBuilder, this.A03, 0, 0, spannableStringBuilder.length(), b30.s);
                        A03(spannableStringBuilder, this.A02, -1, 0, spannableStringBuilder.length(), b30.s);
                        A05(spannableStringBuilder, this.A04, A00(54, 10, 119), 0, spannableStringBuilder.length(), b30.s);
                        float verticalPlacement = this.A00;
                        while (this.A06.A05() >= 8) {
                            int A072 = this.A06.A07();
                            int A092 = this.A06.A09();
                            int A093 = this.A06.A09();
                            int position = A08;
                            if (A093 == position) {
                                int position2 = this.A06.A05();
                                A08(position2 >= 2);
                                int atomSize = this.A06.A0J();
                                for (int atomType = 0; atomType < atomSize; atomType++) {
                                    A06(this.A06, spannableStringBuilder);
                                }
                            } else {
                                int styleRecordCount = A09;
                                if (A093 == styleRecordCount && this.A05) {
                                    int styleRecordCount2 = this.A06.A05();
                                    A08(styleRecordCount2 >= 2);
                                    int styleRecordCount3 = this.A06.A0J();
                                    float f = styleRecordCount3;
                                    int requestedVerticalPlacement = this.A01;
                                    verticalPlacement = C0726Ig.A00(f / requestedVerticalPlacement, 0.0f, 0.95f);
                                }
                            }
                            this.A06.A0Z(A072 + A092);
                        }
                        return new C1193aK(new GF(spannableStringBuilder, null, verticalPlacement, 0, 0, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE));
                    }
                };
            case 6:
            case 7:
                return new C03502r(format.A0O, format.A03);
            case '\b':
                final int i = format.A03;
                return new AV(i) { // from class: com.facebook.ads.redexgen.X.2q
                    public static byte[] A09;
                    public static String[] A0A;
                    public int A00;
                    public GN A01;
                    public GO A02;
                    public List<GF> A03;
                    public List<GF> A04;
                    public final int A05;
                    public final GN[] A08;
                    public final IQ A07 = new IQ();
                    public final IP A06 = new IP();

                    static {
                        A0A();
                        A09();
                    }

                    public static String A00(int i2, int i3, int i4) {
                        byte[] copyOfRange = Arrays.copyOfRange(A09, i2, i2 + i3);
                        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
                            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 14);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A09() {
                        A09 = new byte[]{-102, -94, -19, -33, -21, -17, -33, -24, -35, -33, -102, -24, -17, -25, -36, -33, -20, -102, 108, 99, -70, -85, -88, -79, 99, -91, -81, -78, -90, -82, -106, -84, -67, -88, 99, -84, -74, 99, 115, 112, -126, 103, -80, -82, -75, -74, -71, -80, -75, -82, 103, -73, -88, -86, -78, -84, -69, 101, 89, -101, -82, -83, 89, -100, -82, -85, -85, -98, -89, -83, 89, -94, -89, -99, -98, -79, 89, -94, -84, 89, 116, -106, -110, 104, 97, 105, 117, -106, -108, -96, -107, -106, -93, -127, -77, -80, -80, -93, -84, -78, -86, -73, 94, -77, -84, -79, -77, -82, -82, -83, -80, -78, -93, -94, 94, -127, -115, -117, -117, g15.c, -116, -126, -99, -125, -106, -110, 111, 94, -127, -83, -85, -85, -97, -84, -94, 120, 94, -59, -9, -12, -12, -25, -16, -10, -18, -5, -94, -9, -16, -11, -9, -14, -14, -15, -12, -10, -25, -26, -94, -59, -47, -49, -49, -61, -48, -58, bx.j7, -46, -77, -72, -94, -59, -15, -17, -17, -29, -16, -26, -68, -94, -103, -55, -53, -104, -72, -91, -74, -72, -64, -70, -55, 117, -70, -61, -71, -70, -71, 117, -59, -57, -70, -62, -74, -55, -54, -57, -70, -63, -50, -112, 117, -56, -66, -49, -70, 117, -66, -56, 117, 109, -106, -117, -105, -99, -106, -100, -115, -102, -115, -116, 72, 108, 124, 126, 107, 107, -121, 120, 105, 107, 115, 109, 124, -121, 108, 105, 124, 105, 72, -118, -115, -114, -105, -102, -115, 72, 108, 124, 126, 107, 107, -121, 120, 105, 107, 115, 109, 124, -121, 123, 124, 105, 122, 124, -119, -82, -74, -95, -84, -87, -92, 96, -125, 112, 96, -93, -81, -83, -83, -95, -82, -92, 122, 96, -42, -5, 3, -18, -7, -10, -15, -83, -48, -66, -83, -16, -4, -6, -6, -18, -5, -15, -57, -83, -110, -73, -65, -86, -75, -78, -83, 105, -112, 123, 105, -84, -79, -86, -69, -86, -84, -67, -82, -69, -125, 105, 118, -101, -93, -114, -103, -106, -111, 77, 116, 96, 77, -112, -107, -114, -97, -114, -112, -95, -110, -97, 103, 77, -104, -67, -59, -80, -69, -72, -77, 111, -79, -80, -62, -76, 111, -78, -66, -68, -68, -80, -67, -77, -119, 111, -55, -18, -10, bx.j7, -20, -23, -28, -96, -27, -8, -12, -27, -18, -28, -27, -28, -96, -29, -17, -19, -19, bx.j7, -18, -28, -70, -96, -6, -20, -7, -3, -16, -22, -20, -43, -4, -12, -23, -20, -7, -89, -16, -6, -89, -11, -10, -11, -76, 1, -20, -7, -10, -89, -81};
                    }

                    public static void A0A() {
                        A0A = new String[]{"L1xpy5cp85DZhci17XuVPwuBI", "YkTNFPOzwzkJtYlViXkR23NQqoCQppA0", "SGim0bOTaYlclFO3csKadT6H6g9xYkcM", "jQ8PzV3P", "QC0kpNF7RiOrPOmNNHkvJn0tMmNRSOb3", "UpfI1Vr3VxozUqaf4r1nY355XZgGFNi", "PidsADYQpUdS401V", "6iBltx3Oq3HhhZI1vDwKIUw2PCH0pZTk"};
                    }

                    {
                        this.A05 = i == -1 ? 1 : i;
                        this.A08 = new GN[8];
                        for (int i2 = 0; i2 < 8; i2++) {
                            this.A08[i2] = new GN();
                        }
                        this.A01 = this.A08[0];
                        A08();
                    }

                    private List<GF> A01() {
                        ArrayList arrayList = new ArrayList();
                        for (int i2 = 0; i2 < 8; i2++) {
                            if (!this.A08[i2].A0I() && this.A08[i2].A0J()) {
                                arrayList.add(this.A08[i2].A06());
                            }
                        }
                        Collections.sort(arrayList);
                        return Collections.unmodifiableList(arrayList);
                    }

                    private void A02() {
                        if (this.A02 == null) {
                            return;
                        }
                        A07();
                        this.A02 = null;
                    }

                    private void A03() {
                        int A05 = this.A06.A05(4);
                        int A052 = this.A06.A05(2);
                        int A053 = this.A06.A05(2);
                        boolean A0G = this.A06.A0G();
                        boolean underlineToggle = this.A06.A0G();
                        this.A01.A0D(A05, A052, A053, A0G, underlineToggle, this.A06.A05(3), this.A06.A05(3));
                    }

                    private void A04() {
                        int foregroundG = this.A06.A05(2);
                        int A05 = this.A06.A05(2);
                        int A052 = this.A06.A05(2);
                        int foregroundB = this.A06.A05(2);
                        int backgroundColor = GN.A01(A05, A052, foregroundB, foregroundG);
                        int foregroundG2 = this.A06.A05(2);
                        int foregroundColor = this.A06.A05(2);
                        int backgroundR = this.A06.A05(2);
                        int backgroundG = this.A06.A05(2);
                        int foregroundG3 = GN.A01(foregroundColor, backgroundR, backgroundG, foregroundG2);
                        this.A06.A09(2);
                        int foregroundColor2 = this.A06.A05(2);
                        int backgroundR2 = this.A06.A05(2);
                        int edgeR = this.A06.A05(2);
                        this.A01.A0C(backgroundColor, foregroundG3, GN.A00(foregroundColor2, backgroundR2, edgeR));
                    }

                    private void A05() {
                        this.A06.A09(4);
                        int A05 = this.A06.A05(4);
                        this.A06.A09(2);
                        this.A01.A0B(A05, this.A06.A05(6));
                    }

                    private void A06() {
                        int fillG = this.A06.A05(2);
                        int A05 = this.A06.A05(2);
                        int A052 = this.A06.A05(2);
                        int fillB = this.A06.A05(2);
                        int fillG2 = GN.A01(A05, A052, fillB, fillG);
                        int borderG = this.A06.A05(2);
                        int borderType = this.A06.A05(2);
                        int A053 = this.A06.A05(2);
                        int fillColor = this.A06.A05(2);
                        int scrollDirection = GN.A00(borderType, A053, fillColor);
                        if (this.A06.A0G()) {
                            borderG |= 4;
                        }
                        boolean A0G = this.A06.A0G();
                        int A054 = this.A06.A05(2);
                        int A055 = this.A06.A05(2);
                        int A056 = this.A06.A05(2);
                        this.A06.A09(8);
                        this.A01.A0E(fillG2, scrollDirection, A0G, borderG, A054, A055, A056);
                    }

                    /* JADX WARN: Incorrect condition in loop: B:18:0x00d7 */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private void A07() {
                        int i2 = this.A02.A00;
                        int i3 = (this.A02.A01 * 2) - 1;
                        String A002 = A00(80, 13, 35);
                        if (i2 != i3) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(A00(180, 39, 71));
                            sb.append((this.A02.A01 * 2) - 1);
                            sb.append(A00(57, 23, 43));
                            sb.append(this.A02.A00);
                            sb.append(A00(0, 18, 108));
                            sb.append(this.A02.A02);
                            sb.append(A00(39, 18, 57));
                            Log.w(A002, sb.toString());
                            return;
                        }
                        this.A06.A0D(this.A02.A03, this.A02.A00);
                        int A05 = this.A06.A05(3);
                        int A052 = this.A06.A05(5);
                        if (A05 == 7) {
                            this.A06.A09(2);
                            int blockSize = this.A06.A05(6);
                            A05 += blockSize;
                        }
                        if (A052 == 0) {
                            if (A05 != 0) {
                                Log.w(A002, A00(406, 27, 121) + A05 + A00(18, 21, 53));
                                return;
                            }
                            return;
                        }
                        int blockSize2 = this.A05;
                        if (A05 != blockSize2) {
                            return;
                        }
                        boolean z = false;
                        while (blockSize > 0) {
                            int A053 = this.A06.A05(8);
                            String[] strArr = A0A;
                            String str2 = strArr[2];
                            String str3 = strArr[1];
                            int charAt = str2.charAt(6);
                            int command = str3.charAt(6);
                            if (charAt != command) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A0A;
                            strArr2[4] = "ms0OGa625FAXtw1h35os66EQGefGqsb0";
                            strArr2[7] = "y0WyytXakCt9dcKCWCePMiqFSD1TGdmN";
                            if (A053 != 16) {
                                if (A053 <= 31) {
                                    A0B(A053);
                                } else if (A053 <= 127) {
                                    A0G(A053);
                                    z = true;
                                } else if (A053 <= 159) {
                                    A0C(A053);
                                    z = true;
                                } else if (A053 <= 255) {
                                    A0H(A053);
                                    z = true;
                                } else {
                                    Log.w(A002, A00(358, 22, 65) + A053);
                                }
                            } else {
                                int A054 = this.A06.A05(8);
                                if (A054 <= 31) {
                                    A0D(A054);
                                } else if (A054 <= 127) {
                                    A0I(A054);
                                    z = true;
                                } else if (A054 <= 159) {
                                    A0E(A054);
                                } else if (A054 <= 255) {
                                    A0J(A054);
                                    z = true;
                                } else {
                                    Log.w(A002, A00(380, 26, 114) + A054);
                                }
                            }
                        }
                        if (z) {
                            this.A03 = A01();
                        }
                    }

                    private void A08() {
                        for (int i2 = 0; i2 < 8; i2++) {
                            GN[] gnArr = this.A08;
                            if (A0A[5].length() == 25) {
                                throw new RuntimeException();
                            }
                            String[] strArr = A0A;
                            strArr[5] = "s2U2A8";
                            strArr[5] = "s2U2A8";
                            gnArr[i2].A09();
                        }
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
                        if (r7 <= 23) goto L15;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
                        android.util.Log.w(r4, A00(93, 44, 48) + r7);
                        r6.A06.A09(8);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
                        return;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:18:0x0079, code lost:
                        if (r7 <= 23) goto L15;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private void A0B(int i2) {
                        if (i2 != 0) {
                            if (i2 == 3) {
                                this.A03 = A01();
                            } else if (A0A[5].length() == 25) {
                                throw new RuntimeException();
                            } else {
                                String[] strArr = A0A;
                                strArr[3] = "H8dS7ULq";
                                strArr[6] = "47YXPe6ck7E4ACrn";
                                if (i2 != 8) {
                                    switch (i2) {
                                        case 12:
                                            A08();
                                            return;
                                        case 13:
                                            GN gn = this.A01;
                                            String[] strArr2 = A0A;
                                            if (strArr2[2].charAt(6) != strArr2[1].charAt(6)) {
                                                gn.A0A('\n');
                                                return;
                                            }
                                            String[] strArr3 = A0A;
                                            strArr3[3] = "LxOVysLH";
                                            strArr3[6] = "PbXDcGLFNpdTKJ0c";
                                            gn.A0A('\n');
                                            return;
                                        case 14:
                                            return;
                                        default:
                                            String A002 = A00(80, 13, 35);
                                            if (i2 >= 17) {
                                                String[] strArr4 = A0A;
                                                if (strArr4[4].charAt(10) != strArr4[7].charAt(10)) {
                                                    String[] strArr5 = A0A;
                                                    strArr5[0] = "Kfp0xyGlj";
                                                    strArr5[0] = "Kfp0xyGlj";
                                                    break;
                                                }
                                            }
                                            if (i2 >= 24 && i2 <= 31) {
                                                Log.w(A002, A00(WKSRecord.Service.NETBIOS_NS, 43, 116) + i2);
                                                this.A06.A09(16);
                                                return;
                                            }
                                            Log.w(A002, A00(274, 20, 50) + i2);
                                            return;
                                    }
                                }
                                this.A01.A07();
                            }
                        }
                    }

                    private void A0C(int i2) {
                        GN gn;
                        switch (i2) {
                            case 128:
                            case 129:
                            case WKSRecord.Service.CISCO_FNA /* 130 */:
                            case WKSRecord.Service.CISCO_TNA /* 131 */:
                            case WKSRecord.Service.CISCO_SYS /* 132 */:
                            case WKSRecord.Service.STATSRV /* 133 */:
                            case WKSRecord.Service.INGRES_NET /* 134 */:
                            case WKSRecord.Service.LOC_SRV /* 135 */:
                                int i3 = i2 - 128;
                                if (this.A00 == i3) {
                                    return;
                                }
                                this.A00 = i3;
                                this.A01 = this.A08[i3];
                                return;
                            case WKSRecord.Service.PROFILE /* 136 */:
                                for (int i4 = 1; i4 <= 8; i4++) {
                                    if (this.A06.A0G()) {
                                        this.A08[8 - i4].A08();
                                    }
                                }
                                return;
                            case WKSRecord.Service.NETBIOS_NS /* 137 */:
                                for (int i5 = 1; i5 <= 8; i5++) {
                                    boolean A0G = this.A06.A0G();
                                    String[] strArr = A0A;
                                    if (strArr[4].charAt(10) == strArr[7].charAt(10)) {
                                        throw new RuntimeException();
                                    }
                                    String[] strArr2 = A0A;
                                    strArr2[5] = "EEpd";
                                    strArr2[5] = "EEpd";
                                    if (A0G) {
                                        this.A08[8 - i5].A0F(true);
                                    }
                                }
                                return;
                            case WKSRecord.Service.NETBIOS_DGM /* 138 */:
                                for (int i6 = 1; i6 <= 8; i6++) {
                                    if (this.A06.A0G()) {
                                        this.A08[8 - i6].A0F(false);
                                    }
                                }
                                return;
                            case WKSRecord.Service.NETBIOS_SSN /* 139 */:
                                for (int i7 = 1; i7 <= 8; i7++) {
                                    if (this.A06.A0G()) {
                                        this.A08[8 - i7].A0F(!gn.A0J());
                                    }
                                }
                                return;
                            case 140:
                                for (int i8 = 1; i8 <= 8; i8++) {
                                    if (this.A06.A0G()) {
                                        this.A08[8 - i8].A09();
                                    }
                                }
                                return;
                            case WKSRecord.Service.EMFIS_CNTL /* 141 */:
                                this.A06.A09(8);
                                return;
                            case WKSRecord.Service.BL_IDM /* 142 */:
                                return;
                            case 143:
                                A08();
                                return;
                            case 144:
                                if (!this.A01.A0H()) {
                                    this.A06.A09(16);
                                    return;
                                } else {
                                    A03();
                                    return;
                                }
                            case 145:
                                if (!this.A01.A0H()) {
                                    this.A06.A09(24);
                                    return;
                                } else {
                                    A04();
                                    return;
                                }
                            case 146:
                                if (!this.A01.A0H()) {
                                    this.A06.A09(16);
                                    return;
                                } else {
                                    A05();
                                    return;
                                }
                            case 147:
                            case 148:
                            case 149:
                            case IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED /* 150 */:
                            default:
                                Log.w(A00(80, 13, 35), A00(294, 20, 127) + i2);
                                return;
                            case 151:
                                if (!this.A01.A0H()) {
                                    this.A06.A09(32);
                                    return;
                                } else {
                                    A06();
                                    return;
                                }
                            case 152:
                            case 153:
                            case 154:
                            case 155:
                            case 156:
                            case 157:
                            case 158:
                            case 159:
                                int i9 = i2 - 152;
                                A0F(i9);
                                if (this.A00 == i9) {
                                    return;
                                }
                                this.A00 = i9;
                                this.A01 = this.A08[i9];
                                return;
                        }
                    }

                    private void A0D(int i2) {
                        if (i2 <= 7) {
                            return;
                        }
                        if (i2 <= 15) {
                            this.A06.A09(8);
                        } else if (i2 <= 23) {
                            this.A06.A09(16);
                        } else if (i2 > 31) {
                        } else {
                            this.A06.A09(24);
                        }
                    }

                    private void A0E(int i2) {
                        if (i2 <= 135) {
                            this.A06.A09(32);
                            return;
                        }
                        String[] strArr = A0A;
                        if (strArr[3].length() == strArr[6].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0A;
                        strArr2[3] = "CkyZUSwm";
                        strArr2[6] = "y0ZSf6RqH8VvK6A8";
                        if (i2 <= 143) {
                            this.A06.A09(40);
                        } else if (i2 > 159) {
                        } else {
                            this.A06.A09(2);
                            this.A06.A09(this.A06.A05(6) * 8);
                        }
                    }

                    private void A0F(int i2) {
                        GN gn = this.A08[i2];
                        this.A06.A09(2);
                        boolean A0G = this.A06.A0G();
                        boolean A0G2 = this.A06.A0G();
                        boolean A0G3 = this.A06.A0G();
                        int A05 = this.A06.A05(3);
                        boolean columnLock = this.A06.A0G();
                        int verticalAnchor = this.A06.A05(7);
                        int rowCount = this.A06.A05(8);
                        int penStyle = this.A06.A05(4);
                        int A052 = this.A06.A05(4);
                        this.A06.A09(2);
                        int A053 = this.A06.A05(6);
                        this.A06.A09(2);
                        gn.A0G(A0G, A0G2, A0G3, A05, columnLock, verticalAnchor, rowCount, A052, A053, penStyle, this.A06.A05(3), this.A06.A05(3));
                    }

                    private void A0G(int i2) {
                        if (i2 == 127) {
                            this.A01.A0A((char) 9835);
                        } else {
                            this.A01.A0A((char) (i2 & 255));
                        }
                    }

                    private void A0H(int i2) {
                        this.A01.A0A((char) (i2 & 255));
                    }

                    private void A0I(int i2) {
                        if (i2 == 32) {
                            this.A01.A0A(gl4.R);
                        } else if (i2 == 33) {
                            this.A01.A0A(h95.g);
                        } else if (i2 == 37) {
                            this.A01.A0A(h95.F);
                        } else if (i2 == 42) {
                            this.A01.A0A((char) 352);
                        } else if (i2 == 44) {
                            this.A01.A0A((char) 338);
                        } else if (i2 == 63) {
                            this.A01.A0A((char) 376);
                        } else {
                            String[] strArr = A0A;
                            if (strArr[2].charAt(6) == strArr[1].charAt(6)) {
                                String[] strArr2 = A0A;
                                strArr2[5] = "VBgxEtCZM8hUXU02q62ejO2N";
                                strArr2[5] = "VBgxEtCZM8hUXU02q62ejO2N";
                                if (i2 == 57) {
                                    this.A01.A0A(h95.J);
                                    return;
                                } else if (i2 != 58) {
                                    if (i2 == 60) {
                                        this.A01.A0A((char) 339);
                                        return;
                                    } else if (i2 != 61) {
                                        switch (i2) {
                                            case 48:
                                                this.A01.A0A((char) 9608);
                                                return;
                                            case 49:
                                                this.A01.A0A(h95.w);
                                                return;
                                            case 50:
                                                GN gn = this.A01;
                                                String[] strArr3 = A0A;
                                                if (strArr3[3].length() == strArr3[6].length()) {
                                                    throw new RuntimeException();
                                                }
                                                String[] strArr4 = A0A;
                                                strArr4[0] = "pntPsILDFVvSJsAkqe";
                                                strArr4[0] = "pntPsILDFVvSJsAkqe";
                                                gn.A0A(h95.x);
                                                return;
                                            case 51:
                                                this.A01.A0A(h95.z);
                                                return;
                                            case 52:
                                                GN gn2 = this.A01;
                                                if (A0A[0].length() == 12) {
                                                    throw new RuntimeException();
                                                }
                                                String[] strArr5 = A0A;
                                                strArr5[4] = "pjkXXm09rSmpulg3ZnQvc2tVnRpvsPhy";
                                                strArr5[7] = "1ZIH3c3lD2nrVh46isF21y1NEU8S3DGz";
                                                gn2.A0A(h95.A);
                                                return;
                                            case 53:
                                                this.A01.A0A(h95.E);
                                                return;
                                            default:
                                                switch (i2) {
                                                    case 118:
                                                        this.A01.A0A((char) 8539);
                                                        return;
                                                    case 119:
                                                        this.A01.A0A((char) 8540);
                                                        return;
                                                    case 120:
                                                        this.A01.A0A((char) 8541);
                                                        return;
                                                    case 121:
                                                        this.A01.A0A((char) 8542);
                                                        return;
                                                    case 122:
                                                        this.A01.A0A((char) 9474);
                                                        return;
                                                    case 123:
                                                        this.A01.A0A((char) 9488);
                                                        return;
                                                    case 124:
                                                        this.A01.A0A((char) 9492);
                                                        return;
                                                    case 125:
                                                        this.A01.A0A((char) 9472);
                                                        return;
                                                    case 126:
                                                        this.A01.A0A((char) 9496);
                                                        return;
                                                    case 127:
                                                        this.A01.A0A((char) 9484);
                                                        return;
                                                    default:
                                                        Log.w(A00(80, 13, 35), A00(314, 22, 59) + i2);
                                                        return;
                                                }
                                        }
                                    } else {
                                        this.A01.A0A((char) 8480);
                                        return;
                                    }
                                } else {
                                    GN gn3 = this.A01;
                                    if (A0A[0].length() != 12) {
                                        String[] strArr6 = A0A;
                                        strArr6[2] = "Hn1frjObrkKWee9bQkUvSoGsCyNbx6K5";
                                        strArr6[1] = "5jLxiAOonCPZsccE4Rlf5xBOSnJI2Mxj";
                                        gn3.A0A((char) 353);
                                        return;
                                    }
                                }
                            }
                            throw new RuntimeException();
                        }
                    }

                    private void A0J(int i2) {
                        if (i2 == 160) {
                            this.A01.A0A((char) 13252);
                            return;
                        }
                        Log.w(A00(80, 13, 35), A00(336, 22, 31) + i2);
                        this.A01.A0A(n04.E);
                    }

                    @Override // com.facebook.ads.redexgen.X.AV
                    public final GG A0N() {
                        List<GF> list2 = this.A03;
                        this.A04 = list2;
                        return new C1187aE(list2);
                    }

                    @Override // com.facebook.ads.redexgen.X.AV
                    public final /* bridge */ /* synthetic */ C0543Aq A0O() throws GH {
                        return super.A4h();
                    }

                    @Override // com.facebook.ads.redexgen.X.AV
                    public final /* bridge */ /* synthetic */ AbstractC0529Ab A0P() throws GH {
                        return super.A4i();
                    }

                    @Override // com.facebook.ads.redexgen.X.AV
                    public final /* bridge */ /* synthetic */ void A0Q(C0543Aq c0543Aq) throws GH {
                        super.ABw(c0543Aq);
                    }

                    @Override // com.facebook.ads.redexgen.X.AV
                    public final void A0R(C0543Aq c0543Aq) {
                        GO go;
                        this.A07.A0c(c0543Aq.A01.array(), c0543Aq.A01.limit());
                        while (this.A07.A05() >= 3) {
                            int A0F = this.A07.A0F() & 7;
                            int i2 = A0F & 3;
                            boolean z = (A0F & 4) == 4;
                            int A0F2 = this.A07.A0F();
                            if (A0A[0].length() == 12) {
                                throw new RuntimeException();
                            }
                            String[] strArr = A0A;
                            strArr[4] = "mPNkJPPaAQUsGFTknTy0QJ3qIgBWTNxI";
                            strArr[7] = "fItgrykYfXnNqjhR9xK6GfD4mEN43S7J";
                            byte b = (byte) A0F2;
                            byte A0F3 = (byte) this.A07.A0F();
                            if (i2 == 2 || i2 == 3) {
                                if (z) {
                                    if (i2 == 3) {
                                        A02();
                                        int ccType = (b & 192) >> 6;
                                        int i3 = b & ax5.a;
                                        if (i3 == 0) {
                                            i3 = 64;
                                        }
                                        this.A02 = new GO(ccType, i3);
                                        byte[] bArr = this.A02.A03;
                                        GO go2 = this.A02;
                                        int i4 = go2.A00;
                                        int packetSize = i4 + 1;
                                        go2.A00 = packetSize;
                                        bArr[i4] = A0F3;
                                    } else {
                                        I1.A03(i2 == 2);
                                        if (A0A[0].length() != 12) {
                                            String[] strArr2 = A0A;
                                            strArr2[3] = "0p2cTlko";
                                            strArr2[6] = "0zmBBYWCDQbGLnH6";
                                            go = this.A02;
                                            if (go == null) {
                                                Log.e(A00(80, 13, 35), A00(219, 55, 26));
                                            } else {
                                                byte[] bArr2 = go.A03;
                                                GO go3 = this.A02;
                                                int i5 = go3.A00;
                                                go3.A00 = i5 + 1;
                                                bArr2[i5] = b;
                                                byte[] bArr3 = this.A02.A03;
                                                GO go4 = this.A02;
                                                int i6 = go4.A00;
                                                go4.A00 = i6 + 1;
                                                bArr3[i6] = A0F3;
                                            }
                                        } else {
                                            String[] strArr3 = A0A;
                                            strArr3[3] = "AnSv654l";
                                            strArr3[6] = "VDMP1o28JZezz2Cr";
                                            go = this.A02;
                                            if (go == null) {
                                                Log.e(A00(80, 13, 35), A00(219, 55, 26));
                                            } else {
                                                byte[] bArr22 = go.A03;
                                                GO go32 = this.A02;
                                                int i52 = go32.A00;
                                                go32.A00 = i52 + 1;
                                                bArr22[i52] = b;
                                                byte[] bArr32 = this.A02.A03;
                                                GO go42 = this.A02;
                                                int i62 = go42.A00;
                                                go42.A00 = i62 + 1;
                                                bArr32[i62] = A0F3;
                                            }
                                        }
                                    }
                                    if (this.A02.A00 == (this.A02.A01 * 2) - 1) {
                                        A02();
                                    }
                                }
                            }
                        }
                    }

                    @Override // com.facebook.ads.redexgen.X.AV
                    public final boolean A0T() {
                        return this.A03 != this.A04;
                    }

                    @Override // com.facebook.ads.redexgen.X.AV, com.facebook.ads.redexgen.X.InterfaceC0556Bd
                    public final /* bridge */ /* synthetic */ void ACD() {
                        super.ACD();
                    }

                    @Override // com.facebook.ads.redexgen.X.AV, com.facebook.ads.redexgen.X.InterfaceC1183aA
                    public final /* bridge */ /* synthetic */ void AD4(long j) {
                        super.AD4(j);
                    }

                    @Override // com.facebook.ads.redexgen.X.AV, com.facebook.ads.redexgen.X.InterfaceC0556Bd
                    public final void flush() {
                        super.flush();
                        this.A03 = null;
                        this.A04 = null;
                        this.A00 = 0;
                        this.A01 = this.A08[this.A00];
                        A08();
                        this.A02 = null;
                    }
                };
            case '\t':
                final List<byte[]> list2 = format.A0P;
                return new AbstractC0550Ax(list2) { // from class: com.facebook.ads.redexgen.X.2n
                    public static byte[] A01;
                    public final GZ A00;

                    static {
                        A02();
                    }

                    public static String A01(int i2, int i3, int i4) {
                        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
                        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
                            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 44);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A02() {
                        A01 = new byte[]{-83, -33, -53, -83, -50, -52, -40, -51, -50, -37};
                    }

                    {
                        super(A01(0, 10, 61));
                        IQ iq = new IQ(list2.get(0));
                        int subtitleAncillaryPage = iq.A0J();
                        this.A00 = new GZ(subtitleAncillaryPage, iq.A0J());
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // com.facebook.ads.redexgen.X.AbstractC0550Ax
                    /* renamed from: A00 */
                    public final C1188aF A0d(byte[] bArr, int i2, boolean z) {
                        if (z) {
                            this.A00.A0K();
                        }
                        return new C1188aF(this.A00.A0J(bArr, i2));
                    }
                };
            case '\n':
                return new AbstractC0550Ax() { // from class: com.facebook.ads.redexgen.X.2m
                    public static byte[] A05;
                    public static String[] A06;
                    public int A00;
                    public Inflater A01;
                    public byte[] A02;
                    public final C0668Ga A03;
                    public final IQ A04;

                    static {
                        A03();
                        A02();
                    }

                    public static String A01(int i2, int i3, int i4) {
                        byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
                        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
                            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 117);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A02() {
                        A05 = new byte[]{97, 86, 66, 117, 84, 82, 94, 85, 84, 67};
                    }

                    public static void A03() {
                        A06 = new String[]{"D8ktImD4gI341B9dMX", "p", "8S1Qfr0uQHuWlKinBNgV3mwJeBc1O2wn", "O", "UgOsD1qslkvgk8WTNW5IJqqmR5mppeJL", "YmudOgNfte0R1MlRzZs3i7R", "t", "Vvarb6mClw"};
                    }

                    {
                        A01(0, 10, 68);
                        this.A04 = new IQ();
                        this.A03 = new C0668Ga();
                    }

                    public static GF A00(IQ iq, C0668Ga c0668Ga) {
                        int sectionLength = iq.A08();
                        int nextSectionPosition = iq.A0F();
                        int A0J = iq.A0J();
                        int A07 = iq.A07() + A0J;
                        if (A07 > sectionLength) {
                            iq.A0Z(sectionLength);
                            return null;
                        }
                        GF gf = null;
                        if (nextSectionPosition == 128) {
                            gf = c0668Ga.A07();
                            String[] strArr = A06;
                            if (strArr[5].length() != strArr[7].length()) {
                                String[] strArr2 = A06;
                                strArr2[0] = "8Q7r9e8nqCgCYEZ6IU";
                                strArr2[0] = "8Q7r9e8nqCgCYEZ6IU";
                                c0668Ga.A08();
                            } else {
                                c0668Ga.A08();
                            }
                        } else {
                            switch (nextSectionPosition) {
                                case 20:
                                    c0668Ga.A06(iq, A0J);
                                    break;
                                case 21:
                                    c0668Ga.A04(iq, A0J);
                                    break;
                                case 22:
                                    c0668Ga.A05(iq, A0J);
                                    break;
                            }
                        }
                        iq.A0Z(A07);
                        if (A06[0].length() != 18) {
                            throw new RuntimeException();
                        }
                        String[] strArr3 = A06;
                        strArr3[2] = "BTE07TDUmys5OOcsYpYqmwkAe847KCkG";
                        strArr3[2] = "BTE07TDUmys5OOcsYpYqmwkAe847KCkG";
                        return gf;
                    }

                    private boolean A04(byte[] bArr, int i2) {
                        if (i2 != 0) {
                            byte b = bArr[0];
                            if (A06[3].length() != 1) {
                                throw new RuntimeException();
                            }
                            String[] strArr = A06;
                            strArr[4] = "3s6wsel2PksO74PVHVwG8hUXCMbdJ5Q0";
                            strArr[4] = "3s6wsel2PksO74PVHVwG8hUXCMbdJ5Q0";
                            if (b == 120) {
                                if (this.A01 == null) {
                                    this.A01 = new Inflater();
                                    this.A02 = new byte[i2];
                                }
                                this.A00 = 0;
                                this.A01.setInput(bArr, 0, i2);
                                while (!this.A01.finished() && !this.A01.needsDictionary() && !this.A01.needsInput()) {
                                    try {
                                        if (this.A00 == this.A02.length) {
                                            this.A02 = Arrays.copyOf(this.A02, this.A02.length * 2);
                                        }
                                        this.A00 += this.A01.inflate(this.A02, this.A00, this.A02.length - this.A00);
                                    } catch (DataFormatException unused) {
                                        return false;
                                    } finally {
                                        this.A01.reset();
                                    }
                                }
                                return this.A01.finished();
                            }
                        }
                        return false;
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC0550Ax
                    public final GG A0d(byte[] bArr, int i2, boolean z) throws GH {
                        if (A04(bArr, i2)) {
                            this.A04.A0c(this.A02, this.A00);
                        } else {
                            IQ iq = this.A04;
                            if (A06[0].length() != 18) {
                                throw new RuntimeException();
                            }
                            String[] strArr = A06;
                            strArr[2] = "roAZZspd009Dh1499aBQr6xCTRbeSGaA";
                            strArr[2] = "roAZZspd009Dh1499aBQr6xCTRbeSGaA";
                            iq.A0c(bArr, i2);
                        }
                        this.A03.A08();
                        ArrayList arrayList = new ArrayList();
                        while (this.A04.A05() >= 3) {
                            GF A002 = A00(this.A04, this.A03);
                            if (A002 != null) {
                                arrayList.add(A002);
                            }
                        }
                        return new C1189aG(Collections.unmodifiableList(arrayList));
                    }
                };
            default:
                throw new IllegalArgumentException(A00(0, 50, 24));
        }
    }

    @Override // com.facebook.ads.redexgen.X.GI
    public final boolean ADT(Format format) {
        String str = format.A0O;
        return A00(236, 8, 112).equals(str) || A00(244, 10, 85).equals(str) || A00(122, 20, 87).equals(str) || A00(167, 21, 57).equals(str) || A00(216, 20, 2).equals(str) || A00(188, 28, 125).equals(str) || A00(50, 19, 119).equals(str) || A00(WKSRecord.Service.BL_IDM, 25, 39).equals(str) || A00(69, 19, 27).equals(str) || A00(88, 19, 97).equals(str) || A00(107, 15, 26).equals(str);
    }
}