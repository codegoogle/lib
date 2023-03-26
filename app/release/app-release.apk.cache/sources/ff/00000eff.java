package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Nullable;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import com.p7700g.p99005.yg1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.7H  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7H {
    public static AnonymousClass00 A0A;
    public static byte[] A0B;
    public static String[] A0C;
    public static final String A0D;
    public static final Map<String, AnonymousClass06> A0E;
    public long A00;
    public JL A01;
    public final C7I A03;
    public final C8H A04;
    public final boolean A08;
    public final boolean A09;
    public final Map<String, Bitmap> A07 = Collections.synchronizedMap(new HashMap());
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final List<Callable<Boolean>> A05 = new ArrayList();
    public final List<Callable<Boolean>> A06 = new ArrayList();

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 10);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0B = new byte[]{-70, -62, -66, -20, -20, -63, -21, -21, 126, -85, 123, -80, -80, g15.b, 122, -127, 109, -104, 102, 102, -100, 108, 107, 111, 96, 126, g15.b, -123, -126, 61, -112, -111, 126, -113, -111, -126, -127, 75, -119, -89, -87, -82, -81, -76, -83, 102, -87, -75, -77, -74, -78, -85, -70, -85, -113, -83, -81, -76, -75, -70, -77, 108, -78, -83, -75, -72, -79, -80, g15.c, -99, -97, -92, -91, -86, -93, 92, -81, -80, -99, -82, -80, -95, -96, 106, 106, 106, 102, -103, -124, -122, -111, -107, -118, -112, -113, 65, -104, -119, -118, -115, -122, 65, -122, -103, -122, -124, -106, -107, -118, -113, -120, 65, -124, -126, -124, -119, -122, 65, -123, -112, -104, -113, -115, -112, -126, -123, -108, 79, -86, -88, -86, -81, -84, -118, -74, -76, -73, -77, -84, -69, -80, -74, -75, -113, -74, -74, -78, -79, -81, -79, -74, -77, -108, -81, -73, -70, -61, -64, -77, -106, -67, -67, -71, 122, -115, 122, 120, -118, -119, 122, -113, -110, -124, -121, -24, -21, -35, -32, -37, -16, -27, -23, bx.j7, -37, -23, -17, -20, bx.j7, -24, -16};
    }

    public static void A0E() {
        A0C = new String[]{"8gkZjHnxCvZyg7TzwjjGeSdvls9L7Gam", "fcbSC3ja3K2jNylkxCBC51G6bXitMdQ0", "2foOCT", "ocB0m3", "KfMQJM794wt5IuG", "feDb68pnVWWOEqV45c", "KnEa0S3Tnigt4irEXno07XBXpnYxFsFq", "aK1UKkDbG3zR1xh0x3umKxUvmkPLseuR"};
    }

    static {
        A0E();
        A0D();
        A0D = C7H.class.getSimpleName();
        A0E = Collections.synchronizedMap(new HashMap());
    }

    public C7H(C8H c8h) {
        this.A04 = c8h;
        this.A03 = C7I.A06(c8h.A00());
        this.A08 = J8.A1Z(c8h);
        this.A09 = PR.A04() && J8.A1c(c8h);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.07] */
    public static AnonymousClass00 A02(C1081Wi c1081Wi) {
        if (A0A == null) {
            A0A = AnonymousClass01.A00(c1081Wi, new Object() { // from class: com.facebook.ads.redexgen.X.07
                public int A00;
                public int A01;
                public boolean A02;
                public boolean A03;
                public boolean A04;

                public final AnonymousClass07 A00(int i) {
                    this.A00 = i;
                    return this;
                }

                public final AnonymousClass07 A01(int i) {
                    this.A01 = i;
                    return this;
                }

                public final AnonymousClass07 A02(boolean z) {
                    this.A02 = z;
                    return this;
                }

                public final AnonymousClass07 A03(boolean z) {
                    this.A03 = z;
                    return this;
                }

                public final AnonymousClass07 A04(boolean z) {
                    this.A04 = z;
                    return this;
                }

                public final AnonymousClass08 A05() {
                    return new AnonymousClass08(this.A00, this.A02, this.A01, this.A03, this.A04);
                }
            }.A00(J8.A04(c1081Wi)).A02(c1081Wi.A03().A7X()).A01(-1).A03(J8.A0h(c1081Wi)).A04(J8.A1g(c1081Wi)).A05(), A05(c1081Wi));
        }
        return A0A;
    }

    public static AnonymousClass06 A04(C8H c8h, String str) {
        AnonymousClass06 anonymousClass06 = A0E.get(str);
        if (C7K.A06(c8h) && anonymousClass06 != null) {
            return new AnonymousClass06(anonymousClass06);
        }
        return new AnonymousClass06(str);
    }

    public static C0M A05(C1081Wi c1081Wi) {
        return new C1077We(c1081Wi);
    }

    public static AtomicBoolean A0B(ArrayList<Callable<Boolean>> arrayList) {
        ArrayList<Future> arrayList2 = new ArrayList(arrayList.size());
        Iterator<Callable<Boolean>> it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A0C;
            if (strArr[3].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[5] = "";
            strArr2[5] = "";
            if (!hasNext) {
                AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                try {
                    for (Future future : arrayList2) {
                        atomicBoolean.set(atomicBoolean.get() && ((Boolean) future.get()).booleanValue());
                    }
                } catch (InterruptedException | ExecutionException e) {
                    Log.e(A0D, A08(86, 42, 23), e);
                    atomicBoolean.set(false);
                }
                return atomicBoolean;
            }
            arrayList2.add(ExecutorC0800Lj.A02().submit(it.next()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(JK jk) {
        if (this.A01 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(A08(174, 12, 114), LW.A04(this.A00));
        this.A01.A03(jk, hashMap);
    }

    @Nullable
    public final Bitmap A0I(String str) {
        return this.A07.get(str);
    }

    @Nullable
    public final Bitmap A0J(String str, int i, int i2) {
        if (this.A08) {
            AnonymousClass06 A04 = A04(this.A04, str);
            A04.A03 = A08(yg1.G, 4, 111);
            A04.A01 = i2;
            A04.A00 = i;
            return A02(this.A04.A00()).ACX(A04, true).A00();
        }
        return this.A03.A0E(this.A04, str, i, i2, A08(170, 4, 25));
    }

    public final String A0K(String cachedUrl) {
        if (this.A08) {
            AnonymousClass06 A04 = A04(this.A04, cachedUrl);
            A04.A03 = A08(yg1.G, 4, 111);
            String ACZ = A02(this.A04.A00()).ACZ(A04);
            return ACZ != null ? ACZ : cachedUrl;
        }
        return this.A03.A0F(cachedUrl);
    }

    public final String A0L(String cachedUrl) {
        AnonymousClass06 A04 = A04(this.A04, cachedUrl);
        A04.A03 = A08(yg1.G, 4, 111);
        String ACZ = A02(this.A04.A00()).ACZ(A04);
        return ACZ != null ? ACZ : cachedUrl;
    }

    public final String A0M(String cachedUrl) {
        if (this.A09) {
            return cachedUrl;
        }
        AnonymousClass06 A04 = A04(this.A04, cachedUrl);
        A04.A03 = A08(yg1.G, 4, 111);
        String ACZ = A02(this.A04.A00()).ACZ(A04);
        return ACZ != null ? ACZ : cachedUrl;
    }

    public final void A0N() {
        K0.A05(A08(128, 19, 61), A08(38, 16, 60), A08(0, 8, 127));
    }

    public final void A0O() {
        K0.A05(A08(147, 16, 68), A08(54, 14, 66), A08(16, 8, 44));
    }

    public final void A0P() {
        this.A07.clear();
    }

    public final void A0Q(@Nullable AnonymousClass79 anonymousClass79, C7A c7a) {
        K0.A05(A08(163, 7, 11), A08(68, 18, 50), A08(8, 8, 64));
        this.A00 = System.currentTimeMillis();
        C7K.A02(this.A04, c7a, C7K.A07, A08(24, 14, 19), -1L);
        ExecutorC0800Lj.A03().execute(new C1076Wd(this, new ArrayList(this.A05), anonymousClass79, c7a, new ArrayList(this.A06)));
        this.A05.clear();
        this.A06.clear();
    }

    public final void A0R(final C7E c7e) {
        Callable<Boolean> callable = new Callable<Boolean>(c7e) { // from class: com.facebook.ads.redexgen.X.7F
            public static byte[] A02;
            public static String[] A03;
            public final C7E A00;

            static {
                A03();
                A02();
            }

            public static String A01(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
                int i4 = 0;
                while (true) {
                    int length = copyOfRange.length;
                    if (A03[1].length() == 32) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A03;
                    strArr[3] = "";
                    strArr[3] = "";
                    if (i4 >= length) {
                        return new String(copyOfRange);
                    }
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 48);
                    i4++;
                }
            }

            public static void A02() {
                A02 = new byte[]{-20, -16, -28, -22, -24};
            }

            public static void A03() {
                A03 = new String[]{"jwTNBF52XqMGgcVEiQTwvXvSBsl43Bcu", "zl9XISU", "9LwyCiCzMXmNgkxTRjX8XUqiNT4UlidW", "Jar4Zz8ck96tLH67JFbLbWmYESMeU49V", "Yd8bjyjazIom6Oxe2tnjIAJyfdSlHwWG", "VgUZ5KaBAYbzt3oMIew8EQ4BA2c", "hXTgBapwd4emagenALPcDOSBW5zmdf3H", "17k"};
            }

            {
                this.A00 = c7e;
            }

            private final Boolean A00() {
                C8H c8h;
                boolean z;
                C8H c8h2;
                AnonymousClass00 A022;
                boolean z2;
                boolean z3;
                C7I c7i;
                Map map;
                if (KU.A02(this)) {
                    return null;
                }
                try {
                    TrafficStats.setThreadStatsTag(61453);
                    AnonymousClass06 anonymousClass06 = new AnonymousClass06(this.A00.A07, this.A00.A06, this.A00.A05, A01(0, 5, 83), this.A00.A01, this.A00.A02);
                    anonymousClass06.A01 = this.A00.A04;
                    anonymousClass06.A00 = this.A00.A03;
                    c8h = C7H.this.A04;
                    if (C7K.A06(c8h)) {
                        map = C7H.A0E;
                        map.put(this.A00.A07, anonymousClass06);
                    }
                    z = C7H.this.A08;
                    boolean z4 = false;
                    if (A03[3].length() != 5) {
                        String[] strArr = A03;
                        strArr[4] = "CZcPy1KhLDdCOlGcBT5xxsnRB32IUDMD";
                        strArr[4] = "CZcPy1KhLDdCOlGcBT5xxsnRB32IUDMD";
                        if (!z) {
                            c7i = C7H.this.A03;
                            if (c7i.A0D(this.A00) != null) {
                                z4 = true;
                            }
                        } else {
                            c8h2 = C7H.this.A04;
                            A022 = C7H.A02(c8h2.A00());
                            z4 = A022.ACX(anonymousClass06, false).A01();
                        }
                        C7M c7m = this.A00.A00;
                        if (c7m != null && c7m.A02()) {
                            int A00 = c7m.A00();
                            int A01 = c7m.A01();
                            if (A00 <= 0 || A01 <= 0) {
                                z2 = C7H.this.A08;
                                if (z2) {
                                    A05(this.A00.A07, anonymousClass06);
                                } else {
                                    int i = this.A00.A03;
                                    int width = this.A00.A04;
                                    A04(i, width);
                                }
                            } else {
                                z3 = C7H.this.A08;
                                if (z3) {
                                    anonymousClass06.A00 = A00;
                                    anonymousClass06.A01 = A01;
                                    A05(this.A00.A07, anonymousClass06);
                                } else {
                                    A04(A00, A01);
                                }
                            }
                        }
                        return Boolean.valueOf(z4);
                    }
                    throw new RuntimeException();
                } catch (Throwable th) {
                    KU.A00(th, this);
                    return null;
                }
            }

            private void A04(int i, int i2) {
                C7I c7i;
                C8H c8h;
                Map map;
                c7i = C7H.this.A03;
                c8h = C7H.this.A04;
                Bitmap A0E2 = c7i.A0E(c8h, this.A00.A07, i, i2, this.A00.A01);
                if (A0E2 == null) {
                    return;
                }
                map = C7H.this.A07;
                map.put(this.A00.A07, A0E2);
            }

            private void A05(String str, AnonymousClass06 anonymousClass06) {
                C8H c8h;
                AnonymousClass00 A022;
                Map map;
                c8h = C7H.this.A04;
                A022 = C7H.A02(c8h.A00());
                Bitmap A00 = A022.ACX(anonymousClass06, true).A00();
                if (A00 == null) {
                    return;
                }
                map = C7H.this.A07;
                map.put(str, A00);
            }

            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
                if (KU.A02(this)) {
                    return null;
                }
                try {
                    return A00();
                } catch (Throwable th) {
                    KU.A00(th, this);
                    return null;
                }
            }
        };
        if (!c7e.A02) {
            this.A05.add(callable);
        } else {
            this.A06.add(callable);
        }
    }

    public final void A0S(C7E c7e) {
        c7e.A02 = true;
        A0R(c7e);
    }

    public final void A0T(C7G c7g) {
        this.A05.add(new C7D(this, c7g));
    }

    public final void A0U(C7G c7g) {
        c7g.A05 = true;
        this.A06.add(new C7D(this, c7g));
    }

    public final void A0V(C7G c7g) {
        c7g.A05 = true;
        if (this.A09) {
            this.A06.add(new C7C(this, c7g));
        } else {
            this.A06.add(new C7D(this, c7g));
        }
    }

    public final void A0W(C7G c7g) {
        if (this.A09) {
            this.A05.add(new C7C(this, c7g));
        } else {
            this.A05.add(new C7D(this, c7g));
        }
    }

    public final void A0X(JL jl) {
        this.A01 = jl;
    }

    public final boolean A0Y(String str) {
        AnonymousClass06 A04 = A04(this.A04, str);
        A04.A03 = A08(yg1.G, 4, 111);
        return A02(this.A04.A00()).ACZ(A04) != null;
    }
}