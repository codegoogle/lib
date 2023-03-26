package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import com.p7700g.p99005.bx;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* renamed from: com.facebook.ads.redexgen.X.5v  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04285v {
    public static byte[] A00;
    public static String[] A01;
    public static final AtomicReference<AnonymousClass60> A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[4].charAt(15) != 'H') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "ewynTuX5etTUvRbKneAORAXWy6m3gfja";
            strArr[0] = "MEXbvG7De7lT0m7kyXT3Vo2bJU5t0LAQ";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 28);
            i4++;
        }
    }

    public static void A01() {
        A00 = new byte[]{60, 40, 57, 52, 56, 51, 62, 56, 2, 51, 56, 41, bx.W5, 50, 47, 54, 115, 57, 56, 37, 45, 47, 36, 47, 56, 35, 41};
    }

    public static void A02() {
        A01 = new String[]{"r7c1s5U0efOStYGowMowhUbuYlQTG1Tt", "4N5luf2P5Kce0fziMzoENYJ9JUsEy4RG", "Zwxj", "L2KmiKnie6D54jPyz7fJn9CofNiJStjg", "Reipc3PbxUqE4G7HYurM4m8tamMVkuwI", "qFHCxa5Kyhox8u", "zslT757DGHQcDkpTRw1DlpZ4hqoBSQOy", "oFLB5GUqllb2V05SIM"};
    }

    static {
        A02();
        A01();
        A02 = new AtomicReference<>();
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A03(@Nullable Activity activity, MotionEvent motionEvent) {
        AnonymousClass60 anonymousClass60;
        try {
            if (C04295w.A0Q(activity) && (anonymousClass60 = A02.get()) != null) {
                anonymousClass60.A06(motionEvent);
            }
        } catch (Throwable th) {
            C1081Wi A002 = C8G.A00();
            if (A002 != null) {
                A002.A04().A82(A00(20, 7, 86), C04848i.A10, new C04858j(th));
            }
        }
    }

    public static void A04(Context context) {
        if (!(context instanceof Application)) {
            return;
        }
        C0785Ks.A05(new TT());
    }

    public static void A05(C1081Wi c1081Wi, @Nullable String str) {
        ExecutorC0800Lj.A06.execute(new TQ(c1081Wi, str));
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A06(C1081Wi c1081Wi, String str) {
        if (!C04295w.A0Q(c1081Wi)) {
            return;
        }
        if (A02.get() == null && AnonymousClass76.A0F(AnonymousClass76.A03(str))) {
            A05(c1081Wi, str);
            return;
        }
        AnonymousClass60 anonymousClass60 = A02.get();
        if (anonymousClass60 != null) {
            ExecutorC0800Lj.A06.execute(new TR(anonymousClass60, str, c1081Wi));
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.facebook.ads.redexgen.X.5y] */
    @SuppressLint({"CatchGeneralException"})
    public static synchronized void A08(C1081Wi c1081Wi, @Nullable String str) {
        synchronized (C04285v.class) {
            try {
            } finally {
            }
            if (A02.get() != null) {
                return;
            }
            if (C04295w.A0Q(c1081Wi)) {
                TV tv = new TV(c1081Wi);
                TU tu = new TU(c1081Wi);
                C04325z A0J = new Object() { // from class: com.facebook.ads.redexgen.X.5y
                    public double A00;
                    public float A01;
                    public int A02;
                    public int A03;
                    public int A04;
                    public int A05;
                    public int A06;
                    public long A07;
                    public long A08;
                    public long A09;
                    public AnonymousClass68 A0A;
                    public AnonymousClass69 A0B;
                    public C6A A0C;
                    public EnumC04456m A0D;
                    public InterfaceC04576y A0E;
                    public InterfaceC04586z A0F;
                    public Class A0G;
                    @Nullable
                    public String A0H;
                    @Nullable
                    public String A0I;
                    public String A0J;
                    public HashMap<Integer, Integer> A0K;
                    public Map<Integer, String> A0L;
                    public ScheduledExecutorService A0M;
                    public boolean A0N;

                    public final C04315y A00(double d) {
                        this.A00 = d;
                        return this;
                    }

                    public final C04315y A01(float f) {
                        this.A01 = f;
                        return this;
                    }

                    public final C04315y A02(int i) {
                        this.A02 = i;
                        return this;
                    }

                    public final C04315y A03(int i) {
                        this.A03 = i;
                        return this;
                    }

                    public final C04315y A04(int i) {
                        this.A04 = i;
                        return this;
                    }

                    public final C04315y A05(int i) {
                        this.A05 = i;
                        return this;
                    }

                    public final C04315y A06(int i) {
                        this.A06 = i;
                        return this;
                    }

                    public final C04315y A07(long j) {
                        this.A07 = j;
                        return this;
                    }

                    public final C04315y A08(long j) {
                        this.A08 = j;
                        return this;
                    }

                    public final C04315y A09(AnonymousClass68 anonymousClass68) {
                        this.A0A = anonymousClass68;
                        return this;
                    }

                    public final C04315y A0A(AnonymousClass69 anonymousClass69) {
                        this.A0B = anonymousClass69;
                        return this;
                    }

                    public final C04315y A0B(C6A c6a) {
                        this.A0C = c6a;
                        return this;
                    }

                    public final C04315y A0C(EnumC04456m enumC04456m) {
                        this.A0D = enumC04456m;
                        return this;
                    }

                    public final C04315y A0D(Class cls) {
                        this.A0G = cls;
                        return this;
                    }

                    public final C04315y A0E(@Nullable String str2) {
                        this.A0I = str2;
                        return this;
                    }

                    public final C04315y A0F(String str2) {
                        this.A0J = str2;
                        return this;
                    }

                    public final C04315y A0G(HashMap<Integer, Integer> circularBufferLengthMap) {
                        this.A0K = circularBufferLengthMap;
                        return this;
                    }

                    public final C04315y A0H(Map map) {
                        this.A0L = map;
                        return this;
                    }

                    public final C04315y A0I(boolean z) {
                        this.A0N = z;
                        return this;
                    }

                    public final C04325z A0J() {
                        C04325z c04325z = new C04325z();
                        c04325z.A0J = this.A0N;
                        c04325z.A02 = this.A04;
                        c04325z.A0G = this.A0K;
                        c04325z.A01 = this.A03;
                        c04325z.A00 = this.A02;
                        c04325z.A04 = this.A06;
                        c04325z.A0F = this.A0J;
                        c04325z.A07 = this.A0B;
                        c04325z.A06 = this.A0A;
                        double unused = C04325z.A0K = this.A00;
                        c04325z.A09 = this.A0D;
                        c04325z.A0H = this.A0L;
                        c04325z.A03 = this.A05;
                        c04325z.A0C = this.A0G;
                        c04325z.A08 = this.A0C;
                        float unused2 = C04325z.A0L = this.A01;
                        long unused3 = C04325z.A0N = this.A08;
                        long unused4 = C04325z.A0M = this.A07;
                        c04325z.A05 = this.A09;
                        c04325z.A0B = this.A0F;
                        c04325z.A0A = this.A0E;
                        c04325z.A0I = this.A0M;
                        c04325z.A0D = this.A0H;
                        c04325z.A0E = this.A0I;
                        return c04325z;
                    }
                }.A0I(true).A04(C04295w.A05(c1081Wi)).A02(C04295w.A03(c1081Wi)).A03(C04295w.A04(c1081Wi)).A06(C04295w.A07(c1081Wi)).A0G(C04295w.A0M()).A0A(tv).A09(tu.A01()).A00(C04295w.A01(c1081Wi)).A0C(EnumC04456m.A0G).A0F(C04295w.A0D(c1081Wi)).A0H(C04295w.A0N(c1081Wi)).A05(C04295w.A06(c1081Wi)).A0D(Build.class).A01(C04295w.A02(c1081Wi)).A08(C04295w.A09(c1081Wi)).A07(C04295w.A08(c1081Wi)).A0B(tu).A0E(A00(0, 20, 65)).A0J();
                if (C04295w.A0R(c1081Wi)) {
                    A04(c1081Wi.getApplicationContext());
                }
                AnonymousClass60 anonymousClass60 = new AnonymousClass60(c1081Wi, A0J, C04295w.A0A(c1081Wi));
                if (str != null) {
                    anonymousClass60.A07(str);
                }
                A02.set(anonymousClass60);
            }
        }
    }
}