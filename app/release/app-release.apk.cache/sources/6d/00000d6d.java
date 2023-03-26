package com.facebook.ads.redexgen.X;

import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* renamed from: com.facebook.ads.redexgen.X.0j  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02900j {
    public static byte[] A00;
    public static String[] A01;

    static {
        A03();
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 56);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{101, 64, 4, 77, 87, 4, 77, 74, 82, 69, 72, 77, 64, 69, 80, 65, 64, 4, 83, 77, 80, 76, 75, 81, 80, 4, 80, 75, 79, 65, 74, 10, 10, 27, 2};
    }

    public static void A03() {
        A01 = new String[]{"4Fi3cRKjKwjo", "pfwDmZC0EgnSHGG3akphHDiSxRpjxWfc", "OwKyFlCBYoW0NHpoiuFf2exuC", "FTixXnraWBf7yQ9sseM6khJqknPB2", "87lno6sBf8EnLpq9v2WrftgOrdI4V", "hcLSbPhFObKmfxN2jEGb0Jf71EM4", "MV7VLhl", "AE1L1nhQpeYYJvXkfFkincgpQRIdvuit"};
    }

    /* JADX WARN: Incorrect condition in loop: B:9:0x0014 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Collection<String> A01(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < i; i++) {
            hashSet.add(jSONArray.optString(i));
        }
        return hashSet;
    }

    public static boolean A04(C1080Wh c1080Wh, InterfaceC02890i interfaceC02890i, JE je) {
        EnumC02880h A6Q = interfaceC02890i.A6Q();
        if (A6Q == null || A6Q == EnumC02880h.A03) {
            return false;
        }
        boolean z = false;
        Collection<String> A61 = interfaceC02890i.A61();
        if (A61 == null || A61.isEmpty()) {
            return false;
        }
        Iterator<String> it = A61.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String packageName = it.next();
            if (A05(c1080Wh, packageName)) {
                z = true;
                break;
            }
        }
        if (z != (A6Q == EnumC02880h.A02)) {
            return false;
        }
        String A5j = interfaceC02890i.A5j();
        boolean isEmpty = TextUtils.isEmpty(A5j);
        String[] strArr = A01;
        if (strArr[7].charAt(25) != strArr[1].charAt(25)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[2] = "Y0XUyINdugWnNFuKX72emGLWk";
        strArr2[2] = "Y0XUyINdugWnNFuKX72emGLWk";
        if (!isEmpty) {
            je.A87(A5j, null);
            return true;
        }
        InterfaceC04838h A04 = c1080Wh.A04();
        int i = C04848i.A0O;
        String packageName2 = A00(0, 32, 28);
        C04858j c04858j = new C04858j(packageName2);
        String packageName3 = A00(32, 3, 83);
        A04.A82(packageName3, i, c04858j);
        return true;
    }

    public static boolean A05(C1080Wh c1080Wh, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            c1080Wh.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        } catch (RuntimeException unused2) {
            return false;
        }
    }
}