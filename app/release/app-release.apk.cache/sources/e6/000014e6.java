package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class WU extends AbstractC04566x<HashMap<String, Integer>> {
    public static byte[] A00;
    public static String[] A01;

    static {
        A02();
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 81);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-44};
        if (A01[1].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[5] = "SxUYlD3A0WMAhXB5PTE";
        strArr[5] = "SxUYlD3A0WMAhXB5PTE";
        A00 = bArr;
    }

    public static void A02() {
        A01 = new String[]{"Nq1Kb9TOHvzWwANjwVGizSKF", "JWM4IVLufHQSkDOJGyecwcJ9XG51cvJk", "QEyZFLJTZNzdsjJkYvljVioyRUG2XSKd", "n7SG", "D5E01LJ4kvbqK2OQmpgiuXTPXhrvg0RI", "iCSdHB", "iogVWxzO6MdlKqT6F77t9UC3cqMLTkpE", "gUxLojtchnnArKauALgqkHsSrkkPr"};
    }

    public WU(long j, @Nullable C04546v c04546v, HashMap<String, Integer> signalValues) {
        super(j, c04546v, signalValues, EnumC04556w.A07);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04566x
    public final int A07() {
        int i = 0;
        for (String key : A08().keySet()) {
            i += key.getBytes().length;
        }
        return (A08().size() * 4) + i;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04566x
    public final JSONObject A09(JSONObject jSONObject) throws JSONException {
        HashMap<String, Integer> A08 = A08();
        Set<String> keySet = A08.keySet();
        JSONObject jSONObject2 = new JSONObject();
        for (String str : keySet) {
            jSONObject2.put(str, A08.get(str));
        }
        jSONObject.put(A00(0, 1, 13), jSONObject2);
        return jSONObject;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6x != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<java.util.HashMap<java.lang.String, java.lang.Integer>> */
    @Override // com.facebook.ads.redexgen.X.AbstractC04566x
    @SuppressLint({"Nullable Dereference"})
    public final boolean A0B(AbstractC04566x<HashMap<String, Integer>> abstractC04566x) {
        if (A08() != null) {
            HashMap<String, Integer> A08 = abstractC04566x.A08();
            if (A01[6].charAt(14) == 'I') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[1] = "ZRsxwV5SobJQ5cDwe7XAzXaVJFGFHkOZ";
            strArr[1] = "ZRsxwV5SobJQ5cDwe7XAzXaVJFGFHkOZ";
            if (A08 != null) {
                if (A08().size() != abstractC04566x.A08().size()) {
                    return false;
                }
                HashMap<String, Integer> A082 = abstractC04566x.A08();
                HashMap<String, Integer> A083 = A08();
                Iterator<String> it = A082.keySet().iterator();
                Iterator<String> prevSignalValueKeys = A083.keySet().iterator();
                while (it.hasNext() && prevSignalValueKeys.hasNext()) {
                    String newSignalValueKey = it.next();
                    String next = prevSignalValueKeys.next();
                    if (newSignalValueKey.equals(next) || !A082.containsKey(newSignalValueKey) || !A083.containsKey(next) || !A082.get(newSignalValueKey).equals(A083.get(next))) {
                        return false;
                    }
                    while (it.hasNext()) {
                        String newSignalValueKey2 = it.next();
                        String next2 = prevSignalValueKeys.next();
                        if (newSignalValueKey2.equals(next2)) {
                        }
                        return false;
                    }
                }
                return true;
            }
        }
        return A08() == null && abstractC04566x.A08() == null;
    }
}