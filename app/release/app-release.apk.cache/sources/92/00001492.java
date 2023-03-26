package com.facebook.ads.redexgen.X;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class V8 implements InterfaceC04416i {
    public static String[] A02;
    public final /* synthetic */ VA A00;
    public final /* synthetic */ List A01;

    static {
        A00();
    }

    public static void A00() {
        A02 = new String[]{"2ZaMFzGKyd9hSHjcUno1udsEhbeu09ce", "vtEgA47YqlpfzAewuy7ISaRlDIFsO2a2", "0pnteHQI04JELPJiiEYAY3M", "2nICVeqwE", "Lm6L6ti1RgkYKkQwD0idrMIu4GdN9z0L", "56JOKRJet", "nEp6Q7dVZjXWwne9d2QyLy7miVXBQb0l", "dXPHGnc4ncUJghGdDaugHzl"};
    }

    public V8(VA va, List list) {
        this.A00 = va;
        this.A01 = list;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        AbstractC04566x A022;
        String A07;
        File A03;
        HashMap hashMap = new HashMap();
        Iterator it = this.A01.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A02;
            if (strArr[2].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[2] = "3z5KEoLDxtAdyJAxPBbZMV2";
            strArr2[5] = "xCESy1UOQ";
            if (hasNext) {
                C04406h c04406h = (C04406h) it.next();
                if (c04406h.A02()) {
                    A07 = VA.A07((String) c04406h.A01());
                    A03 = VA.A03(A07);
                    hashMap.put(A07, new V9(A03));
                }
            } else {
                A022 = this.A00.A02(hashMap);
                return A022;
            }
        }
    }
}