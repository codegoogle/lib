package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class WY<K, V> extends AbstractC04566x<HashMap<K, InterfaceC04486p>> {
    public static byte[] A02;
    public static String[] A03;
    public final EnumC04556w A00;
    public final HashMap<K, InterfaceC04486p> A01;

    static {
        A04();
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 110);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{104};
    }

    public static void A04() {
        A03 = new String[]{"cKuQ341bpQpj1np", "NRRRR4TEAm42mDR", "Q3CZak00lhavTOo6A", "zaO6DFhzYxSygkW1IzlMUY8ES4dk", "HbJVSBx3MNS6tqQ9XVLKo36QU0gI1Znv", "JrCrl10lt1AHnaihPuUoLOH", "SHM67NRdcA0GW9YM4", "2pIXYY"};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.WY != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    public WY(long j, @Nullable C04546v c04546v, HashMap<K, InterfaceC04486p> hashMap, EnumC04556w enumC04556w) {
        super(j, c04546v, hashMap, EnumC04556w.A0A);
        this.A01 = hashMap;
        this.A00 = enumC04556w;
        if (A05()) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.WY != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    private int A00(K k) {
        int i = C04506r.A00[this.A00.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return ((String) k).length();
            }
            throw new UnsupportedOperationException();
        }
        return 4;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.WY != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    private boolean A05() {
        int i = C04506r.A00[this.A00.ordinal()];
        return i == 1 || i == 2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.WY != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    @Override // com.facebook.ads.redexgen.X.AbstractC04566x
    public final int A07() {
        int i = 0;
        if (A08() == null || ((HashMap) A08()).isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : ((HashMap) A08()).entrySet()) {
            int A00 = i + A00(entry.getKey());
            if (A03[5].length() == 26) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[4] = "UsP7Xgcu0nWDAT33HhVsw8aoixo7a0Y1";
            strArr[4] = "UsP7Xgcu0nWDAT33HhVsw8aoixo7a0Y1";
            i = A00 + ((InterfaceC04486p) entry.getValue()).ADC();
        }
        return i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.WY != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    @Override // com.facebook.ads.redexgen.X.AbstractC04566x
    public final JSONObject A09(JSONObject mapJsonObject) throws JSONException {
        Set<K> keySet = this.A01.keySet();
        JSONObject jSONObject = new JSONObject();
        for (K k : keySet) {
            InterfaceC04486p interfaceC04486p = this.A01.get(k);
            if (A03[5].length() == 26) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "RtRjz";
            strArr[5] = "RtRjz";
            if (interfaceC04486p != null) {
                interfaceC04486p.ADW(k, jSONObject);
            }
        }
        mapJsonObject.put(A01(0, 1, 112), jSONObject);
        return mapJsonObject;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6x != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<java.util.HashMap<K, com.facebook.ads.internal.botdetection.signals.model.signal_value.IMapSignalValueDef>> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.WY != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    @Override // com.facebook.ads.redexgen.X.AbstractC04566x
    @SuppressLint({"Nullable Dereference"})
    public final boolean A0B(AbstractC04566x<HashMap<K, InterfaceC04486p>> abstractC04566x) {
        boolean A7a;
        if (A08() == null || abstractC04566x.A08() == null) {
            return A08() == null && abstractC04566x.A08() == null;
        } else if (abstractC04566x.A08().size() != A08().size()) {
            return false;
        } else {
            HashMap<K, InterfaceC04486p> A08 = abstractC04566x.A08();
            HashMap<K, InterfaceC04486p> A082 = A08();
            Iterator<K> it = A08.keySet().iterator();
            Iterator<K> it2 = A082.keySet().iterator();
            do {
                boolean hasNext = it.hasNext();
                String[] strArr = A03;
                if (strArr[1].length() == strArr[0].length()) {
                    String[] strArr2 = A03;
                    strArr2[1] = "rUsYWVrpG3VWCqr";
                    strArr2[0] = "lLqYbR21ojeq3r6";
                    if (!hasNext || !it2.hasNext()) {
                        return true;
                    }
                    K next = it.next();
                    K next2 = it2.next();
                    if (!next.equals(next2) || !A08.containsKey(next) || !A082.containsKey(next2)) {
                        return false;
                    }
                    InterfaceC04486p interfaceC04486p = A08.get(next);
                    InterfaceC04486p newSignal = A082.get(next2);
                    InterfaceC04486p prevSignal = newSignal;
                    if (interfaceC04486p == null || prevSignal == null) {
                        return interfaceC04486p == null && prevSignal == null;
                    }
                    A7a = interfaceC04486p.A7a(prevSignal);
                    String[] strArr3 = A03;
                    if (strArr3[7].length() != strArr3[3].length()) {
                        String[] strArr4 = A03;
                        strArr4[6] = "3Jq7wk4KgDHXBRv7A";
                        strArr4[2] = "zXvlpWgAojYXCnWeF";
                    }
                }
                throw new RuntimeException();
            } while (A7a);
            return false;
        }
    }
}