package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Es  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0636Es extends AbstractC0950Re {
    public static byte[] A00;
    public static String[] A01;

    static {
        A04();
        A03();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 52);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{77, 72, 12, 69, 95, 12, 66, 67, 88, 12, 94, 73, 77, 72, 85, 12, 67, 94, 12, 77, 64, 94, 73, 77, 72, 85, 12, 72, 69, 95, 92, 64, 77, 85, 73, 72, 56, 57, 48, 61, 37};
    }

    public static void A04() {
        A01 = new String[]{"d7tLiGkqyLa7cKOkED7RtvmpIXZH8d0b", "LmA4T64r6T9e", "1EBtOKlPck0twYp3ElEJQmg3d", "uhXcdOUibAChEZNBNQuPqKRIQ2", "Z", "LV0o53GlcsqgEYK9Pr4EwymnJShooL9b", "NLZosIPt4DzrQXhRsvqwWEHVFOTX5bDJ", "MQasnwh7q"};
    }

    public C0636Es(C1080Wh c1080Wh, C03171k c03171k) {
        super(c1080Wh, c03171k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(A00(36, 5, 104), String.valueOf(System.currentTimeMillis() - j));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(List<String> list, Map<String, String> map) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A01;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[0] = "jDIZMq7wlAdnEmkEGDRuOyHBIh8qxobs";
            strArr2[0] = "jDIZMq7wlAdnEmkEGDRuOyHBIh8qxobs";
            if (hasNext) {
                new Q6(this.A0C, map).execute(it.next());
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0950Re
    public final void A0N() {
        RG rg = (RG) this.A02;
        if (rg.A0g()) {
            this.A07.A0A(rg);
            return;
        }
        throw new IllegalStateException(A00(0, 36, 24));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0950Re
    public final void A0Q(InterfaceC02940n interfaceC02940n, AnonymousClass90 anonymousClass90, C05008y c05008y, Map<String, Object> map) {
        RG rg = (RG) interfaceC02940n;
        long currentTimeMillis = System.currentTimeMillis();
        C0953Rh c0953Rh = new C0953Rh(this, map, rg, currentTimeMillis, c05008y);
        A0G().postDelayed(c0953Rh, anonymousClass90.A05().A05());
        rg.A0Y(this.A0C, new C0954Ri(this, c0953Rh, currentTimeMillis, c05008y), this.A09, map, C1267bZ.A0I());
    }
}