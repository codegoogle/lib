package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.6J  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6J {
    public final C04325z A00;
    public final Map<Integer, C04386f> A01;
    public final AtomicBoolean A02 = new AtomicBoolean();

    public C6J(C04325z c04325z, Map<Integer, C04386f> map) {
        this.A00 = c04325z;
        this.A01 = map;
        this.A02.compareAndSet(false, true);
    }

    private int A00(int i) {
        if (this.A00.A0e(i) != null) {
            return this.A00.A0e(i).intValue();
        }
        return this.A00.A0R();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.64 != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef> */
    private synchronized void A01(AbstractC04566x abstractC04566x, C04386f c04386f) {
        int A00 = c04386f.A00();
        Map<Integer, AnonymousClass64<AbstractC04566x>> A03 = C04436k.A01().A03();
        if (A03.containsKey(Integer.valueOf(A00))) {
            AnonymousClass64<AbstractC04566x> anonymousClass64 = A03.get(Integer.valueOf(A00));
            AbstractC04566x A032 = anonymousClass64 != null ? anonymousClass64.A03() : null;
            if (anonymousClass64 == null) {
                anonymousClass64 = new AnonymousClass64<>(A00(A00));
            }
            if (!abstractC04566x.A0C(A032, c04386f.A03())) {
                anonymousClass64.A05(abstractC04566x);
                C04436k.A01().A04(A00, anonymousClass64, abstractC04566x.A06());
            }
        } else {
            AnonymousClass64<AbstractC04566x> anonymousClass642 = new AnonymousClass64<>(A00(A00));
            anonymousClass642.A05(abstractC04566x);
            C04436k.A01().A04(A00, anonymousClass642, abstractC04566x.A06());
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public final void A02(AbstractC04566x abstractC04566x, C6I c6i) {
        if (!this.A02.get()) {
            return;
        }
        try {
            switch (c6i) {
                case A0E:
                    C04386f c04386f = this.A01.get(10800);
                    if (abstractC04566x != null && c04386f != null) {
                        A01(abstractC04566x, c04386f);
                        break;
                    } else {
                        return;
                    }
                case A03:
                    C04386f c04386f2 = this.A01.get(10810);
                    if (abstractC04566x != null && c04386f2 != null) {
                        A01(abstractC04566x, c04386f2);
                        break;
                    } else {
                        return;
                    }
                    break;
                case A09:
                    C04386f c04386f3 = this.A01.get(10812);
                    if (abstractC04566x != null && c04386f3 != null) {
                        A01(abstractC04566x, c04386f3);
                        break;
                    } else {
                        return;
                    }
                    break;
                case A06:
                    C04386f c04386f4 = this.A01.get(10813);
                    if (abstractC04566x != null && c04386f4 != null) {
                        A01(abstractC04566x, c04386f4);
                        break;
                    } else {
                        return;
                    }
                    break;
                case A0A:
                    C04386f c04386f5 = this.A01.get(10814);
                    if (abstractC04566x != null && c04386f5 != null) {
                        A01(abstractC04566x, c04386f5);
                        break;
                    } else {
                        return;
                    }
                    break;
                case A0B:
                    C04386f c04386f6 = this.A01.get(10815);
                    if (abstractC04566x != null && c04386f6 != null) {
                        A01(abstractC04566x, c04386f6);
                        break;
                    } else {
                        return;
                    }
                case A0D:
                    C04386f c04386f7 = this.A01.get(10816);
                    if (abstractC04566x != null && c04386f7 != null) {
                        A01(abstractC04566x, c04386f7);
                        break;
                    } else {
                        return;
                    }
                    break;
                case A08:
                    C04386f c04386f8 = this.A01.get(10817);
                    if (abstractC04566x != null && c04386f8 != null) {
                        A01(abstractC04566x, c04386f8);
                        break;
                    } else {
                        return;
                    }
                case A05:
                    C04386f c04386f9 = this.A01.get(10818);
                    if (abstractC04566x != null && c04386f9 != null) {
                        A01(abstractC04566x, c04386f9);
                        break;
                    } else {
                        return;
                    }
                    break;
                case A04:
                    C04386f c04386f10 = this.A01.get(10819);
                    if (abstractC04566x != null && c04386f10 != null) {
                        A01(abstractC04566x, c04386f10);
                        break;
                    } else {
                        return;
                    }
                case A0C:
                    C04386f c04386f11 = this.A01.get(10820);
                    if (abstractC04566x != null && c04386f11 != null) {
                        A01(abstractC04566x, c04386f11);
                        break;
                    } else {
                        return;
                    }
                    break;
            }
        } catch (Throwable th) {
            C6B.A04(th);
        }
    }
}