package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.6x  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC04566x<T> {
    public static byte[] A04;
    public static String[] A05;
    public static final String A06;
    public final long A00;
    @Nullable
    public final C04546v A01;
    public final EnumC04556w A02;
    public final T A03;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{105, 126, 114, 40, 124};
    }

    public static void A05() {
        A05 = new String[]{"IPzGtGdAf7dMWjoiAfsJwT8MSbfW", "XMCeZkZyu3cdrivUr2jZRBASAtioBKsk", "M9df3TmYW4NVaJXwV617xCLf0ka0RL", "QgNQyFbsObpuCkNzfa3XkTwr8fWterHM", "OM6XrXF8htknNzzoWXy", "2umg9hNEEJctkPlZR8BXtgIxIwG9FY0j", "MjJVouBCVmg2kVwWDhDqrlmadtoLZ7M", "22y3hOnyLMExHbJepmdK5jKs80KnwphC"};
    }

    public abstract int A07() throws Exception;

    public abstract JSONObject A09(JSONObject jSONObject) throws JSONException;

    public abstract boolean A0B(AbstractC04566x<T> abstractC04566x);

    static {
        A05();
        A04();
        A06 = AbstractC04566x.class.getSimpleName();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6x != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    public AbstractC04566x(long j, @Nullable C04546v c04546v, T signalValue, EnumC04556w enumC04556w) {
        this.A00 = j;
        this.A01 = c04546v;
        this.A03 = signalValue;
        this.A02 = enumC04556w;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6x != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    private final long A00() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6x != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    @Nullable
    private final C04546v A01() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6x != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    private final EnumC04556w A02() {
        return this.A02;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6x != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    @SuppressLint({"CatchGeneralException"})
    public final int A06() {
        int length = (A01() != null ? A01().A03().getBytes().length : 0) + 8;
        try {
            return A07() + length;
        } catch (Exception e) {
            C6B.A04(e);
            return length;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6x != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    public final T A08() {
        return this.A03;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6x != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    @SuppressLint({"BadMethodUse-android.util.Log.e", "CatchGeneralException"})
    public final JSONObject A0A(boolean z) {
        JSONObject jSONObject = new JSONObject();
        if (z) {
            try {
                jSONObject.put(A03(4, 1, 2), ((float) this.A00) / 1000.0f);
            } catch (Throwable th) {
                C6B.A04(th);
            }
        }
        if (this.A01 != null && z) {
            jSONObject.put(A03(0, 3, 0), this.A01.A04());
        }
        if (this.A02 != EnumC04556w.A04 && A08() != null) {
            A09(jSONObject);
        } else {
            EnumC04556w enumC04556w = this.A02;
            EnumC04556w enumC04556w2 = EnumC04556w.A04;
            if (A05[7].charAt(6) != 'n') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[7] = "j6hvLenmhks7DifvzYp6ZMm4s1P7WZuQ";
            strArr[7] = "j6hvLenmhks7DifvzYp6ZMm4s1P7WZuQ";
            String A03 = A03(3, 1, 71);
            if (enumC04556w == enumC04556w2) {
                jSONObject.put(A03, ((C04536u) this.A03).A09());
            } else if (this.A03 == null) {
                jSONObject.put(A03, new C04536u(EnumC04526t.A07).A09());
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6x != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    public final boolean A0C(@Nullable AbstractC04566x<T> abstractC04566x, EnumSet<EnumC04456m> enumSet) {
        long A08;
        if (abstractC04566x == null || A02() != abstractC04566x.A02()) {
            return false;
        }
        if (A02() == EnumC04556w.A04 && abstractC04566x.A02() == EnumC04556w.A04) {
            return A0B(abstractC04566x);
        }
        boolean z = false;
        if (enumSet.contains(EnumC04456m.A0E)) {
            z = A0B(abstractC04566x);
        }
        if (enumSet.contains(EnumC04456m.A0C)) {
            z &= (A01() == null || abstractC04566x.A01() == null || !A01().A03().equals(abstractC04566x.A01().A03())) ? false : true;
        }
        if (enumSet.contains(EnumC04456m.A0D)) {
            if (A02() == EnumC04556w.A0D || A02() == EnumC04556w.A0B) {
                A08 = C04325z.A08();
            } else {
                A08 = C04325z.A09();
            }
            long epsilon = Math.abs(this.A00 - abstractC04566x.A00());
            return z & (epsilon < A08);
        }
        return z;
    }
}