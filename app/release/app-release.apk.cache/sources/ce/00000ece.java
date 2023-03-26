package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import com.p7700g.p99005.bx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.6U  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6U {
    public static final String A08 = C6U.class.getSimpleName();
    public final int A00;
    public final Context A01;
    public final C04325z A02;
    public final C6G A03;
    public final TY A04;
    public final TZ A05;
    public final C0995Ta A06;
    public final AnonymousClass71 A07;

    /* JADX WARN: Type inference failed for: r2v0, types: [com.facebook.ads.redexgen.X.6X] */
    public C6U(final Context context, final C04325z c04325z) {
        final C6Y c6y = new C6Y(new C04336a(context, c04325z));
        ?? r2 = new Object(context, c6y, c04325z) { // from class: com.facebook.ads.redexgen.X.6X
            public static byte[] A07;
            public static String[] A08;
            public int A00;
            public final C04325z A01;
            public final TY A02;
            public final TZ A03;
            public final C0995Ta A04;
            public final C6Y A05;
            public final AnonymousClass71 A06;

            static {
                A05();
                A04();
            }

            public static String A02(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 75);
                }
                return new String(copyOfRange);
            }

            public static void A04() {
                A07 = new byte[]{bx.j7, 4};
            }

            public static void A05() {
                A08 = new String[]{"Nj4TqS4QnuHXli7th2heksSDMg2Z", "RSouwChKZWzGhunCWCHEu7HkA4YX3nJn", "5fVToSkDBkuydhS3BZw", "o644y0JXIVns0cvIXh4fs0HcxxzuSHU9", "L6wIWC4w0dKe6dclyvwc8pXUf7KK", "NV8kH7O4XMciCHnyYHa8lR80N34PEowy", "S6E1x33SpjjOrFFRELF", "CEXaqd5N8FzuUquPi7vxqko1f9a5yOv1"};
            }

            {
                this.A03 = new TZ(context, c04325z);
                this.A04 = new C0995Ta(context, c04325z);
                this.A02 = new TY(context, c04325z);
                this.A06 = new AnonymousClass71(context, c04325z);
                this.A05 = c6y;
                this.A01 = c04325z;
                A06();
            }

            @Nullable
            public static C04406h A00(int i, String str, int i2, int i3) {
                if (i != 10300) {
                    if (i == 10920) {
                        return A01(str, i2, i3, EnumC04396g.A03);
                    }
                    if (i != 10940 && i != 10941) {
                        switch (i) {
                            case 10943:
                            case 10944:
                            case 10945:
                                break;
                            default:
                                return null;
                        }
                    }
                }
                return A01(str, i2, i3, EnumC04396g.A04);
            }

            @Nullable
            public static C04406h A01(String str, int i, int i2, EnumC04396g enumC04396g) {
                int i3 = C6W.A00[enumC04396g.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        return null;
                    }
                    return new C04406h(str, i, i2);
                }
                return new C04406h(Integer.valueOf(Integer.parseInt(str)), i, i2);
            }

            @Nullable
            private List<C04406h> A03(int i) throws JSONException {
                ArrayList arrayList = new ArrayList();
                Map<Integer, String> A0i = this.A01.A0i();
                if (A0i == null || A0i.isEmpty() || !A0i.containsKey(Integer.valueOf(i))) {
                    return arrayList;
                }
                JSONObject jSONObject = new JSONObject(A0i.get(Integer.valueOf(i)));
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray jSONArray = jSONObject.getJSONArray(next);
                    if (jSONArray != null && jSONArray.length() == 2) {
                        int i2 = jSONArray.getInt(0);
                        int minApiLevel = jSONArray.getInt(1);
                        arrayList.add(A00(i, next, i2, minApiLevel));
                    }
                }
                return arrayList;
            }

            @SuppressLint({"BadMethodUse-android.util.Log.e", "CatchGeneralException"})
            private final void A06() {
                String A02 = A02(1, 1, 69);
                try {
                    JSONObject jSONObject = new JSONObject(this.A01.A0h());
                    Integer valueOf = jSONObject.has(A02) ? Integer.valueOf(jSONObject.getInt(A02)) : null;
                    if (valueOf == null) {
                        return;
                    }
                    this.A00 = valueOf.intValue();
                    this.A06.A04(this.A00);
                    A07(jSONObject.getJSONArray(A02(0, 1, 51)));
                } catch (Throwable th) {
                    C6B.A04(th);
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
                if (r4.containsKey(r8) == false) goto L35;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
                if (r9 == false) goto L36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:
                if (r9 == false) goto L49;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x00c5, code lost:
                r0 = r10.A05.A01(r6, r7);
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x00cb, code lost:
                r1 = new com.facebook.ads.redexgen.X.C04386f(r6, r5, r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x00d4, code lost:
                if (r5.contains(com.facebook.ads.redexgen.X.EnumC04456m.A07) == false) goto L43;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00d6, code lost:
                r10.A06.A05(r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x00e1, code lost:
                if (r5.contains(com.facebook.ads.redexgen.X.EnumC04456m.A0B) == false) goto L47;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x00e3, code lost:
                r10.A03.A04(r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x00ea, code lost:
                r0 = r4.get(java.lang.Integer.valueOf(r6));
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x0105, code lost:
                if (r4.containsKey(r8) == false) goto L35;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x0108, code lost:
                r10.A04.A03(r1);
             */
            @SuppressLint({"BadMethodUse-android.util.Log.e"})
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private void A07(JSONArray jSONArray) throws Exception {
                JSONArray jSONArray2;
                Map<Integer, InterfaceC04416i> A02 = this.A05.A02();
                if (A02 == null) {
                    return;
                }
                for (int signalFlagsEncoded = 0; signalFlagsEncoded < jSONArray.length() && (jSONArray2 = jSONArray.getJSONArray(signalFlagsEncoded)) != null && jSONArray2.length() == 2; signalFlagsEncoded++) {
                    if ((jSONArray2.get(0) instanceof Integer) && (jSONArray2.get(1) instanceof Integer)) {
                        int i = jSONArray2.getInt(0);
                        EnumSet<EnumC04456m> A022 = EnumC04456m.A02(jSONArray2.getInt(1));
                        if (A08(A022)) {
                            continue;
                        } else if (A022.contains(EnumC04456m.A08)) {
                            this.A02.A03(new C04386f(i, A022, A02.get(Integer.valueOf(i))));
                        } else {
                            List<C04406h> list = null;
                            boolean z = false;
                            if (A022.contains(EnumC04456m.A09)) {
                                list = A03(i);
                                String[] strArr = A08;
                                if (strArr[0].length() != strArr[4].length()) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A08;
                                strArr2[3] = "gbsbynt3Jt5Ibwn4XUi3JyTNvJgAjiLF";
                                strArr2[3] = "gbsbynt3Jt5Ibwn4XUi3JyTNvJgAjiLF";
                                z = true;
                            }
                            Integer valueOf = Integer.valueOf(i);
                            String[] strArr3 = A08;
                            if (strArr3[1].charAt(14) != strArr3[5].charAt(14)) {
                                String[] strArr4 = A08;
                                strArr4[7] = "VQtaGepZfQkON0ZRaGi6CJHbKlyPl2Xb";
                                strArr4[7] = "VQtaGepZfQkON0ZRaGi6CJHbKlyPl2Xb";
                            } else {
                                String[] strArr5 = A08;
                                strArr5[2] = "gP534oAWxzuxTSvyS3V";
                                strArr5[6] = "569Auvwjd3shsCWoORD";
                            }
                        }
                    }
                }
            }

            private final boolean A08(EnumSet<EnumC04456m> enumSet) {
                return (enumSet.contains(this.A01.A0a()) && enumSet.contains(EnumC04456m.A05) && enumSet.contains(EnumC04456m.A06) && !enumSet.contains(EnumC04456m.A0A)) ? false : true;
            }

            public final int A09() {
                return this.A00;
            }

            public final TY A0A() {
                return this.A02;
            }

            public final TZ A0B() {
                return this.A03;
            }

            public final C0995Ta A0C() {
                return this.A04;
            }

            public final AnonymousClass71 A0D() {
                return this.A06;
            }
        };
        this.A01 = context;
        this.A05 = r2.A0B();
        this.A06 = r2.A0C();
        this.A04 = r2.A0A();
        this.A00 = r2.A09();
        this.A02 = c04325z;
        this.A03 = new C6G();
        this.A03.A01(this.A04);
        this.A07 = r2.A0D();
        this.A07.A03();
    }

    @SuppressLint({"BadMethodUse-android.util.Log.e", "CatchGeneralException"})
    public static JSONObject A00() {
        JSONObject jsonSignalObject = new JSONObject();
        Map<Integer, AnonymousClass64<AbstractC04566x>> A03 = C04436k.A01().A03();
        if (A03 == null || A03.isEmpty()) {
            return jsonSignalObject;
        }
        try {
            for (Integer num : A03.keySet()) {
                List<AbstractC04566x> A04 = A03.get(num).A04();
                JSONArray jSONArray = new JSONArray();
                for (AbstractC04566x abstractC04566x : A04) {
                    jSONArray.put(abstractC04566x.A0A(true));
                }
                jsonSignalObject.put(num.toString(), jSONArray);
            }
        } catch (Throwable th) {
            C6B.A04(th);
        }
        return jsonSignalObject;
    }

    @SuppressLint({"BadMethodUse-java.lang.System.currentTimeMillis"})
    private void A01(String str, EnumC04426j enumC04426j, EnumC04466n enumC04466n) {
        AnonymousClass69 A0Y = this.A02.A0Y();
        if (A0Y != null) {
            int sessionEndTime = (int) (System.currentTimeMillis() / 1000);
            A0Y.A8I(AnonymousClass76.A05(), str, this.A00, enumC04426j.A03(), sessionEndTime, A00(), enumC04466n);
        }
        AnonymousClass76.A0C(this.A02, AnonymousClass66.A07.A02(), str);
    }

    public final void A02() {
        this.A03.A00();
    }

    public final void A03(EnumC04426j enumC04426j) {
        this.A04.A04(enumC04426j, this.A01);
    }

    public final void A04(EnumC04446l enumC04446l, EnumC04426j enumC04426j, @Nullable String str) {
        A05(enumC04446l, enumC04426j, str, EnumC04466n.A04);
    }

    public final void A05(EnumC04446l enumC04446l, EnumC04426j enumC04426j, @Nullable String str, EnumC04466n enumC04466n) {
        this.A05.A05(enumC04426j);
        if (enumC04446l == EnumC04446l.A02) {
            this.A06.A04(enumC04426j);
            if (str != null) {
                A01(str, enumC04426j, enumC04466n);
            }
        }
    }

    public final boolean A06() {
        List<C04386f> A03 = this.A05.A03();
        return (A03 == null || A03.isEmpty()) ? false : true;
    }
}