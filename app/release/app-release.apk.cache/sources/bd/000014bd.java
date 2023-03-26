package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Vp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1062Vp implements InterfaceC04416i {
    public static byte[] A01;
    public static String[] A02;
    public final /* synthetic */ C1064Vr A00;

    static {
        A02();
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 123);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{49, 39, 44, 49, 45, 48};
    }

    public static void A02() {
        A02 = new String[]{"DYzZ33D", "FX", "1OACtFyT458udh1Nq8LtT5hKAntFdlV0", "NREy1eS", "YXbhfnB1JeAOpwzc7R5F4UgUcnERyrlo", "CB", "UiK58QgaQ3DZSY0y2Dj7Y4rAezwTtVBd", "ZsDGmeWwG8AfDaZfTpPswbVEo9CgGFmV"};
    }

    public C1062Vp(C1064Vr c1064Vr) {
        this.A00 = c1064Vr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() throws Exception {
        Context context;
        C1064Vr c1064Vr = this.A00;
        context = c1064Vr.A01;
        c1064Vr.A00 = (SensorManager) context.getSystemService(A00(0, 6, 57));
        if (Build.VERSION.SDK_INT < 20) {
            return this.A00.A08(EnumC04526t.A05);
        }
        C1064Vr c1064Vr2 = this.A00;
        String[] strArr = A02;
        if (strArr[5].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[5] = "Uf";
        strArr2[1] = "fm";
        if (c1064Vr2.A00 == null) {
            return this.A00.A08(EnumC04526t.A07);
        }
        List<Sensor> sensorList = this.A00.A00.getSensorList(-1);
        ArrayList arrayList = new ArrayList();
        for (Sensor sensor : sensorList) {
            arrayList.add(new C1063Vq(sensor));
        }
        return this.A00.A0E(arrayList);
    }
}