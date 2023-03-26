package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.0g  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02870g {
    public static byte[] A00;
    public static final String A01;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 33);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{111, 84, 91, 88, 86, 95, 26, 78, 85, 26, 74, 91, 72, 73, 95, 26, 80, 73, 85, 84, 26, 94, 91, 78, 91, 26, 83, 84, 26, 123, 94, 123, 89, 78, 83, 85, 84, 124, 91, 89, 78, 85, 72, 67, 20, 19, 22, 3, 22, 82, 77, 88, 83, 98, 81, 84, 83, 86, 94, 79, 92, 93, 71, 64, 73, 98, 115, 97, 97, 102, 122, 96, 125, 103, 117, 122, 24, 31, 4, 25, 14, 34, 61, 48, 49, 59, Flags.CD, 33, 38, 56};
    }

    static {
        A03();
        A01 = C02870g.class.getSimpleName();
    }

    @Nullable
    public static AbstractC02860f A00(C1080Wh c1080Wh, JE je, String str, Uri uri, Map<String, String> extraData) {
        return A01(c1080Wh, je, str, uri, extraData, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC02860f A01(C1080Wh c1080Wh, JE je, String str, Uri uri, Map<String, String> map, boolean z, boolean z2) {
        char c;
        int hashCode;
        if (uri == null || uri.getAuthority() == null) {
            return null;
        }
        String action = uri.getAuthority();
        String queryParameter = uri.getQueryParameter(A02(81, 9, 117));
        String dataJson = A02(45, 4, 86);
        if (!TextUtils.isEmpty(uri.getQueryParameter(dataJson))) {
            try {
                JSONObject jSONObject = new JSONObject(uri.getQueryParameter(dataJson));
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String dataJson2 = keys.next();
                    try {
                        map.put(dataJson2, jSONObject.getString(dataJson2));
                    } catch (JSONException e) {
                        e = e;
                        c1080Wh.A04().A82(A02(58, 7, 15), C04848i.A1i, new C04858j(e));
                        Log.w(A01, A02(0, 45, 27), e);
                        C02930m A002 = C02930m.A00(je, C0785Ks.A00());
                        c = 65535;
                        hashCode = action.hashCode();
                        if (hashCode == -1458789996) {
                        }
                        if (c != 0) {
                        }
                    }
                }
            } catch (JSONException e2) {
                e = e2;
            }
        }
        C02930m A0022 = C02930m.A00(je, C0785Ks.A00());
        c = 65535;
        hashCode = action.hashCode();
        if (hashCode == -1458789996) {
            if (hashCode != 109770977) {
                if (hashCode == 1546100943 && action.equals(A02(49, 9, 28))) {
                    c = 1;
                }
            } else if (action.equals(A02(76, 5, 74))) {
                c = 0;
            }
        } else if (action.equals(A02(65, 11, 51))) {
            c = 2;
        }
        if (c != 0) {
            if (queryParameter != null) {
                return null;
            }
            return new F3(c1080Wh, je, str, uri, map, A0022, z);
        } else if (c != 1) {
            if (c != 2) {
                return new R7(c1080Wh, je, str, uri);
            }
            return new R6(c1080Wh, je, str, uri, map);
        } else if (z2) {
            return new F2(c1080Wh, je, str, uri, map);
        } else {
            return new F1(c1080Wh, je, str, uri, map, A0022, z);
        }
    }

    public static boolean A04(String str) {
        return A02(76, 5, 74).equalsIgnoreCase(str) || A02(49, 9, 28).equalsIgnoreCase(str);
    }
}