package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Message;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.6F  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6F {
    @Nullable
    public static C6F A07;
    public static String[] A08;
    public static final AtomicBoolean A09;
    public C6E A00 = new C6E(this, AnonymousClass73.A00().A04().getLooper());
    public C6O A01;
    public C6P A02;
    public List<C6S> A03;
    public final Context A04;
    public final C04325z A05;
    public final EnumC04456m A06;

    public static void A02() {
        A08 = new String[]{"lhELmGRUtbYPcwJFNCjn5HfCntRtzqQU", "Mt1hbHTlPicMeG4rtX3JBcBhsjGdj", "WXTUL6dhKmyeG13MmR9X1nSF3ta0T4v7", "pnvqG2PyjZWupJIeMnGxGNF5M9wfPV2M", "tVIu8wQwIUzvrLJUsX9QEkuDOevngDVu", "qDTAVfu3jvCTQwnOSiE3SjcB7mVx4hBM", "klm6aBATY902pfwdRKxrpHOkJcym9ne5", "D4wxrsR0ab6WquJuKpvZlDWLQMdeNXqb"};
    }

    static {
        A02();
        A09 = new AtomicBoolean();
    }

    public C6F(C04325z c04325z, Context context) {
        this.A05 = c04325z;
        this.A04 = context;
        this.A06 = c04325z.A0a();
    }

    public static synchronized C6F A00(Context context, C04325z c04325z) {
        C6F c6f;
        synchronized (C6F.class) {
            if (A07 == null) {
                A07 = new C6F(c04325z, context);
            }
            c6f = A07;
        }
        return c6f;
    }

    private synchronized void A03() {
        A09.set(false);
        this.A03 = new ArrayList();
        String[] strArr = A08;
        if (strArr[2].charAt(18) != strArr[4].charAt(18)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[3] = "OJ9tJzFQNQxQ8qaEQfi4ar7y8Z5YVilt";
        strArr2[1] = "oKX4c494QlidqOlhH9QFYLNn1ihcq";
    }

    public final synchronized void A04() {
        if (this.A01 != null) {
            this.A01.A04(this.A03);
        }
        A03();
    }

    public final synchronized void A05(Map<Integer, C04386f> map, EnumC04426j enumC04426j) {
        A03();
        C6J c6j = new C6J(this.A05, map);
        for (Map.Entry<Integer, C04386f> entry : map.entrySet()) {
            C04386f bdSignal = entry.getValue();
            if (bdSignal != null && bdSignal.A04(enumC04426j)) {
                int intValue = entry.getKey().intValue();
                if (intValue != 10800) {
                    switch (intValue) {
                        case 10810:
                            this.A03.add(C6S.A04);
                            continue;
                        case 10811:
                            this.A03.add(C6S.A08);
                            continue;
                        case 10812:
                            this.A03.add(C6S.A0A);
                            continue;
                        case 10813:
                            this.A03.add(C6S.A07);
                            continue;
                        case 10814:
                            this.A03.add(C6S.A0B);
                            continue;
                        case 10815:
                            this.A03.add(C6S.A0C);
                            continue;
                        case 10816:
                            this.A03.add(C6S.A0E);
                            continue;
                        case 10817:
                            this.A03.add(C6S.A09);
                            continue;
                        case 10818:
                            this.A03.add(C6S.A06);
                            continue;
                        case 10819:
                            this.A03.add(C6S.A05);
                            continue;
                        case 10820:
                            this.A03.add(C6S.A0D);
                            continue;
                        default:
                            continue;
                    }
                } else {
                    this.A02 = new C6P(this.A04, c6j, this.A06);
                    A09.set(true);
                }
            }
        }
        this.A01 = new C6O(this.A04, c6j, this.A06);
        this.A01.A03(this.A03);
        if (!this.A00.getLooper().getThread().isAlive()) {
            this.A00 = new C6E(this, AnonymousClass73.A00().A04().getLooper());
        }
    }

    public final synchronized boolean A06(MotionEvent motionEvent) {
        if (!A09.get()) {
            return false;
        }
        Message message = new Message();
        message.what = C6D.A03.ordinal();
        message.obj = motionEvent;
        this.A00.sendMessage(message);
        return true;
    }
}