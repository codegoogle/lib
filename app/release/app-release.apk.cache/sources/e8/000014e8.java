package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class WW<T> extends AbstractC04566x<List<T>> {
    public static byte[] A02;
    public static String[] A03;
    public final EnumC04556w A00;
    public final List<T> A01;

    static {
        A04();
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 25);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{113};
    }

    public static void A04() {
        A03 = new String[]{"9itrjnnCMeXzcKw4LDwr3", "0ZUpi3OgdlmKuABHcG8PMsqc4Oj", "fTRPCIaWt84rUUsVk3HDIivZKs", "V5Apl", "JVZfUK34SIuqNwHf2oV3ojB3sFjQruRb", "fsV6jHlkXkNImPX103xxf", "wiQZRNNXqXk8QOUIHtx5EDu7Qpw", "6g7apQMvF8ZkxnUyBbRCBajSKJlIo"};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.WW != com.facebook.ads.internal.botdetection.signals.model.signal_value.ListSignalValueType<T> */
    public WW(long j, @Nullable C04546v c04546v, List<T> list, EnumC04556w enumC04556w) {
        super(j, c04546v, list, EnumC04556w.A08);
        this.A01 = list;
        this.A00 = enumC04556w;
        if (A05()) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.WW != com.facebook.ads.internal.botdetection.signals.model.signal_value.ListSignalValueType<T> */
    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    private int A00(T t) {
        int i = C04496q.A00[this.A00.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return ((InterfaceC04476o) t).ADC();
                }
                throw new UnsupportedOperationException();
            }
            return ((String) t).length();
        }
        return 4;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.WW != com.facebook.ads.internal.botdetection.signals.model.signal_value.ListSignalValueType<T> */
    private boolean A05() {
        int i = C04496q.A00[this.A00.ordinal()];
        if (i != 1 && i != 2) {
            String[] strArr = A03;
            if (strArr[3].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[4] = "pkJoykusnl5HLvmmS2nCUwVdsFz02CDm";
            strArr2[4] = "pkJoykusnl5HLvmmS2nCUwVdsFz02CDm";
            if (i != 3) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.WW != com.facebook.ads.internal.botdetection.signals.model.signal_value.ListSignalValueType<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.ads.redexgen.X.AbstractC04566x
    public final int A07() {
        int i = 0;
        if (A08() == null || ((List) A08()).isEmpty()) {
            return 0;
        }
        for (Object obj : (List) A08()) {
            i += A00(obj);
        }
        return i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.WW != com.facebook.ads.internal.botdetection.signals.model.signal_value.ListSignalValueType<T> */
    @Override // com.facebook.ads.redexgen.X.AbstractC04566x
    public final JSONObject A09(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (T t : this.A01) {
            int i = C04496q.A00[this.A00.ordinal()];
            if (i == 1 || i == 2) {
                jSONArray.put(t);
            } else {
                String[] strArr = A03;
                if (strArr[3].length() == strArr[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A03;
                strArr2[3] = "TE27R";
                strArr2[0] = "fy5SSQFd7I5OAEL1WcIst";
                if (i == 3) {
                    jSONArray.put(((InterfaceC04476o) t).ADV());
                }
            }
        }
        jSONObject.put(A01(0, 1, 30), jSONArray);
        return jSONObject;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6x != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<java.util.List<T>> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.WW != com.facebook.ads.internal.botdetection.signals.model.signal_value.ListSignalValueType<T> */
    @Override // com.facebook.ads.redexgen.X.AbstractC04566x
    public final boolean A0B(AbstractC04566x<List<T>> abstractC04566x) {
        List<T> A08 = abstractC04566x.A08();
        List list = (List) A08();
        if (list == null || A08 == null) {
            return list == null && A08 == null;
        } else if (abstractC04566x.A08().size() != ((List) A08()).size()) {
            return false;
        } else {
            int i = 0;
            while (true) {
                int size = A08.size();
                if (A03[4].charAt(25) != 'F') {
                    throw new RuntimeException();
                }
                String[] strArr = A03;
                strArr[3] = "t4r48";
                strArr[0] = "skb916f7am8mTaTTklPg2";
                if (i >= size) {
                    return true;
                }
                T t = A08.get(i);
                Object obj = list.get(i);
                int i2 = C04496q.A00[this.A00.ordinal()];
                if (i2 != 1 && i2 != 2) {
                    if (i2 == 3 && !((InterfaceC04476o) t).A7a(obj)) {
                        return false;
                    }
                } else if (!A08.get(i).equals(list.get(i))) {
                    return false;
                }
                i++;
            }
        }
    }
}