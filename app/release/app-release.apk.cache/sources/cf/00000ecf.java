package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.6V  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C6V {
    public static String[] A02;
    public final Context A00;
    public final C04325z A01;

    static {
        A01();
    }

    public static void A01() {
        A02 = new String[]{"HSkcF60AiAyYJizD2I8vIjqhfibhLk4F", "vdkNajAjw36u5RvY9xFki59AuKhwr3og", "", "sseZ8EdYk7i", "1PxOfa9BsFlCUZKt15VhEMgvVyvUPrjN", "QpqokUuVk7nKJb7TmK", "vU9iDbhGXBQk4voVJMEMlbxkWIFvNann", "KoP5O6PQnxDmDbSqeBv0xhaZ"};
    }

    public C6V(Context context, C04325z c04325z) {
        this.A00 = context;
        this.A01 = c04325z;
    }

    private int A00(C04325z c04325z, C04386f c04386f) {
        if (c04325z.A0e(c04386f.A00()) != null) {
            return c04325z.A0e(c04386f.A00()).intValue();
        }
        if (c04386f.A03().contains(EnumC04456m.A0B)) {
            return c04325z.A0S();
        }
        if (c04386f.A03().contains(EnumC04456m.A08)) {
            return c04325z.A0R();
        }
        return c04325z.A0V();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.64 != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef> */
    @SuppressLint({"CatchGeneralException"})
    public final synchronized void A02(EnumC04426j enumC04426j, List<C04386f> list) {
        AbstractC04566x A50;
        Map<Integer, AnonymousClass64<AbstractC04566x>> A03 = C04436k.A01().A03();
        for (C04386f c04386f : list) {
            InterfaceC04416i signalExecutor = c04386f.A02(enumC04426j);
            if (signalExecutor != null && (A50 = signalExecutor.A50()) != null && A50.A08() != null) {
                if (c04386f.A03().contains(EnumC04456m.A0B) && A03.containsKey(Integer.valueOf(c04386f.A00()))) {
                    AnonymousClass64<AbstractC04566x> anonymousClass64 = A03.get(Integer.valueOf(c04386f.A00()));
                    AbstractC04566x A032 = anonymousClass64 != null ? anonymousClass64.A03() : null;
                    if (anonymousClass64 == null) {
                        anonymousClass64 = new AnonymousClass64<>(A00(this.A01, c04386f));
                    }
                    if (A032 == null || !A50.A0C(A032, c04386f.A03())) {
                        anonymousClass64.A05(A50);
                        C04436k.A01().A04(c04386f.A00(), anonymousClass64, A50.A06());
                    }
                } else {
                    AnonymousClass64<AbstractC04566x> anonymousClass642 = new AnonymousClass64<>(A00(this.A01, c04386f));
                    anonymousClass642.A05(A50);
                    C04436k.A01().A04(c04386f.A00(), anonymousClass642, A50.A06());
                }
            }
        }
        String[] strArr = A02;
        if (strArr[0].charAt(9) == strArr[1].charAt(9)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[5] = "mCdjiAVU6tB7YULC7P";
        strArr2[2] = "";
    }
}