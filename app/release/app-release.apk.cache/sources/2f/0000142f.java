package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: assets/audience_network.dex */
public final class TX implements AnonymousClass61 {
    public static String[] A06;
    public EnumC04426j A00;
    public AnonymousClass77 A01;
    public AnonymousClass78 A02;
    public final C04325z A03;
    public final C6U A04;
    public final AtomicBoolean A05 = new AtomicBoolean();

    static {
        A04();
    }

    public static void A04() {
        A06 = new String[]{"9Omy7cax2OJ4", "ulOhDbnf", "JfFg1yjSSK9TQh7N867q1b7oOj16BTWR", "cs88erT1Nmdhof2Vlv4YHjmvLJ5hV6oE", "codoSKf0AAHHcDxXKaV5ItDp", "Lc71QfpBcjqOx3z6Bpry4MoTnJ3L2Amk", "Bxh30V7DNH8aSp9XNgBHezc1nItbXmG0", "iIuCBEGs"};
    }

    public TX(C04325z c04325z, C6U c6u) {
        this.A03 = c04325z;
        this.A04 = c6u;
    }

    private final synchronized void A05() {
        if (this.A02 != null && this.A05.get()) {
            this.A01.A01(this.A02);
            AnonymousClass73.A00().A05();
            this.A04.A02();
            this.A05.compareAndSet(true, false);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.facebook.ads.redexgen.X.78] */
    public final synchronized void A06(final EnumC04426j enumC04426j) {
        if (this.A05.get() || enumC04426j == null) {
            return;
        }
        if (this.A03.A0k() && AnonymousClass76.A0F(enumC04426j)) {
            this.A01 = new AnonymousClass77(AnonymousClass73.A00().A04().getLooper());
            this.A00 = enumC04426j;
            final Runnable runnable = new Runnable(enumC04426j) { // from class: com.facebook.ads.redexgen.X.63
                public EnumC04426j A00;

                {
                    this.A00 = enumC04426j;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C6U c6u;
                    AnonymousClass77 anonymousClass77;
                    AnonymousClass78 anonymousClass78;
                    C04325z c04325z;
                    if (KU.A02(this)) {
                        return;
                    }
                    try {
                        c6u = TX.this.A04;
                        c6u.A04(EnumC04446l.A03, this.A00, null);
                        anonymousClass77 = TX.this.A01;
                        anonymousClass78 = TX.this.A02;
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        c04325z = TX.this.A03;
                        anonymousClass77.A02(anonymousClass78, timeUnit.toMillis(c04325z.A0T()));
                    } catch (Throwable th) {
                        KU.A00(th, this);
                    }
                }
            };
            this.A02 = new Runnable(runnable) { // from class: com.facebook.ads.redexgen.X.78
                public static String[] A01;
                public final Runnable A00;

                static {
                    A00();
                }

                public static void A00() {
                    A01 = new String[]{"z7DaAYMF8mD5H3Qw6B0df8iWMA5TwaAo", "i1Wz58ppkDzwzyk3vUo3iJD7WEPTUBrQ", "4oPzuaqB78YGGa8PxFst9tbpOvboFZdU", "DouWW69VsyGxi7cZQAT3hM5mkvCiYUWz", "5sMQ3NVw4qAuaNcVNLKcvGJPjeyRgc94", "cawbZ6x1RsnaWkC6S2Mb4x7gKiXWIBBw", "BT64P8yXTg3gcHo3v2kn4U06ifDkl76a", "4iKgaC96n3YCvkeVNFuu4kvW5LMIVzNy"};
                }

                {
                    this.A00 = runnable;
                }

                @Override // java.lang.Runnable
                @SuppressLint({"CatchGeneralException"})
                public final void run() {
                    if (KU.A02(this)) {
                        return;
                    }
                    try {
                        this.A00.run();
                    } catch (Throwable t) {
                        try {
                            C6B.A04(t);
                        } catch (Throwable th) {
                            if (A01[0].charAt(29) != 'a') {
                                Throwable t2 = new RuntimeException();
                                throw t2;
                            }
                            String[] strArr = A01;
                            strArr[0] = "SMPhcSCea3djEKnuzKFzvQw1eCBqlauj";
                            strArr[0] = "SMPhcSCea3djEKnuzKFzvQw1eCBqlauj";
                            KU.A00(th, this);
                        }
                    }
                }
            };
            this.A04.A03(enumC04426j);
            this.A01.A00(this.A02);
            this.A05.compareAndSet(false, true);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass61
    public final synchronized void ADe(EnumC04426j enumC04426j) {
        if (this.A00 == enumC04426j) {
            return;
        }
        this.A00 = enumC04426j;
        if (enumC04426j == EnumC04426j.A04) {
            A05();
        } else {
            A06(enumC04426j);
        }
        String[] strArr = A06;
        if (strArr[5].charAt(25) != strArr[3].charAt(25)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[6] = "6KXzTJPK6a3Rx51uMQDwScazunOB6mre";
        strArr2[6] = "6KXzTJPK6a3Rx51uMQDwScazunOB6mre";
    }
}