package com.facebook.ads.redexgen.X;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xbill.DNS.Flags;

/* loaded from: assets/audience_network.dex */
public final class F3 extends R5 {
    public static byte[] A02;
    public static String[] A03;
    public static final String A04;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] - i3) - 27;
            String[] strArr = A03;
            if (strArr[6].charAt(23) == strArr[0].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[3] = "uqLwDcTKX4SWJds2FMBMp5QNw2MnWtU";
            strArr2[3] = "uqLwDcTKX4SWJds2FMBMp5QNw2MnWtU";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A02 = new byte[]{106, -105, -105, -108, -105, 69, -107, -122, -105, -104, -114, -109, -116, 69, -122, -107, -107, -104, -114, -103, -118, -124, -119, -122, -103, -122, -124, -97, -89, -86, -93, -94, 94, -78, -83, 94, -83, -82, -93, -84, 94, -85, -97, -80, -87, -93, -78, 94, -77, -80, -86, 120, 94, -29, -27, -5, 8, -2, 12, 9, 3, -2, -108, -95, -105, -91, -94, -100, -105, 97, -100, -95, -89, -104, -95, -89, 97, -108, -106, -89, -100, -94, -95, 97, 118, 116, g15.c, g15.c, -94, -81, -91, -77, -80, -86, -91, 111, -86, -81, -75, -90, -81, -75, 111, -94, -92, -75, -86, -80, -81, 111, -105, -118, -122, -104, -8, 7, 7, 10, 0, Flags.CD, -4, -10, -5, -8, Flags.CD, -8, -3, -15, 2, -5, -11, 4, -54, -65, -65, -12, -11, 4, -15, -7, -4, 3, -49, -7, -12, -51, -75, 3, -26, -25, -36, -27, -36, -37, -42, -37, -36, -36, -25, -29, -32, -27, -30, -108, -107, -118, -109, -118, -119, -124, -104, -103, -108, -105, -118, -124, -117, -122, -111, -111, -121, -122, -120, -112, -124, -102, -105, -111, -38, -37, -48, bx.l7, -48, -49, -54, -34, -33, -38, -35, -48, -54, -32, -35, -41, -70, -85, -68, -67, -77, -72, -79, -51, -50, -55, -52, -65, -71, -61, -66, -10, -9, -14, -11, -24, -30, -8, -11, -17, -96, -95, -100, -97, -110, -116, -94, -97, -103, -116, -92, -110, -113, -116, -109, -114, -103, -103, -113, -114, -112, -104, -90, -105, -98, 108, -72, -87, -80, -76, -74, -77, -79, -76, -72, 126};
    }

    public static void A07() {
        A03 = new String[]{"eZwrQOnpnpQE2xbRo0zNjy7tlobdqdqH", "SFt7WwZUn", "NjRPf9lXQVcUlHZaPZ2tHyzwDKEOZm5m", "vsw9aGbGyLBdbL44W3z8tEYPUFR7w9", "bZApvv", "GYK1wV", "jBSwIULngy0dc0IzE6SbgF9ev3BAFzHy", "9HFC3JFq8"};
    }

    static {
        A07();
        A06();
        A04 = F3.class.getSimpleName();
    }

    public F3(C1080Wh c1080Wh, JE je, String str, Uri uri, Map<String, String> map, C02930m c02930m, boolean z) {
        super(c1080Wh, je, str, c02930m, z);
        this.A00 = uri;
        this.A01 = map;
    }

    private Intent A00(C02910k c02910k) {
        if (!TextUtils.isEmpty(c02910k.A06()) && C02900j.A05(((AbstractC02860f) this).A00, c02910k.A06())) {
            String A042 = c02910k.A04();
            if (!TextUtils.isEmpty(A042) && (A042.startsWith(A03(250, 4, 23)) || A042.startsWith(A03(254, 10, 41)))) {
                return new Intent(A03(62, 26, 24), Uri.parse(A042));
            }
            PackageManager packageManager = ((AbstractC02860f) this).A00.getPackageManager();
            if (TextUtils.isEmpty(c02910k.A05()) && TextUtils.isEmpty(A042)) {
                return packageManager.getLaunchIntentForPackage(c02910k.A06());
            }
            Intent A01 = A01(c02910k);
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(A01, 65536);
            if (A01.getComponent() == null) {
                Iterator<ResolveInfo> it = queryIntentActivities.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ResolveInfo next = it.next();
                    if (next.activityInfo.packageName.equals(c02910k.A06())) {
                        A01.setComponent(new ComponentName(next.activityInfo.packageName, next.activityInfo.name));
                        break;
                    }
                }
            }
            boolean isEmpty = queryIntentActivities.isEmpty();
            String[] strArr = A03;
            if (strArr[5].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[7] = "mdy3DwQER";
            strArr2[1] = "z4eGZXaiq";
            if (isEmpty || A01.getComponent() == null) {
                return null;
            }
            return A01;
        }
        return null;
    }

    private Intent A01(C02910k c02910k) {
        Intent intent = new Intent(A03(88, 26, 38));
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(c02910k.A06()) && !TextUtils.isEmpty(c02910k.A05())) {
            intent.setComponent(new ComponentName(c02910k.A06(), c02910k.A05()));
        }
        if (!TextUtils.isEmpty(c02910k.A04())) {
            intent.setData(Uri.parse(c02910k.A04()));
        }
        return intent;
    }

    private final Uri A02() {
        String queryParameter = this.A00.getQueryParameter(A03(219, 9, 104));
        if (!TextUtils.isEmpty(queryParameter)) {
            return Uri.parse(queryParameter);
        }
        return Uri.parse(String.format(Locale.US, A03(126, 22, 117), this.A00.getQueryParameter(A03(211, 8, 63))));
    }

    /* JADX WARN: Incorrect condition in loop: B:13:0x0045 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List<C02910k> A04() {
        String queryParameter = this.A00.getQueryParameter(A03(114, 12, 124));
        if (TextUtils.isEmpty(queryParameter) || A03(53, 2, 109).equals(queryParameter)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray optJSONArray = new JSONObject(queryParameter).optJSONArray(A03(55, 7, 127));
            if (optJSONArray != null) {
                for (int i = 0; i < i; i++) {
                    C02910k appSiteData = C02910k.A00(optJSONArray.optJSONObject(i));
                    if (appSiteData != null) {
                        arrayList.add(appSiteData);
                    }
                }
            }
        } catch (JSONException e) {
            ((AbstractC02860f) this).A00.A04().A82(A03(204, 7, 47), C04848i.A1j, new C04858j(e));
            Log.w(A04, A03(0, 26, 10), e);
        }
        return arrayList;
    }

    private final List<Intent> A05() {
        List<C02910k> A042 = A04();
        ArrayList arrayList = new ArrayList();
        if (A042 != null) {
            for (C02910k c02910k : A042) {
                Intent intent = A00(c02910k);
                if (intent != null) {
                    arrayList.add(intent);
                }
            }
        }
        return arrayList;
    }

    private boolean A08() {
        boolean result;
        List<Intent> A05 = A05();
        if (A05 == null) {
            return false;
        }
        for (Intent intent : A05) {
            try {
                result = C0783Kq.A0C(((AbstractC02860f) this).A00, intent);
            } catch (Exception unused) {
            }
            if (result) {
                return true;
            }
        }
        return false;
    }

    private boolean A09() {
        Kw kw = new Kw();
        try {
            Kw.A09(kw, ((AbstractC02860f) this).A00, A02(), this.A02);
            return true;
        } catch (Exception unused) {
            String str = A03(26, 27, 35) + this.A00.toString();
            String queryParameter = this.A00.getQueryParameter(A03(228, 22, 18));
            if (queryParameter != null && queryParameter.length() > 0) {
                Kw.A09(kw, ((AbstractC02860f) this).A00, Uri.parse(queryParameter), this.A02);
                return false;
            }
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02860f
    @Nullable
    public final EnumC02850e A0A() {
        EnumC02850e enumC02850e = null;
        String A032 = A03(148, 15, 92);
        if (!A08()) {
            try {
                A032 = A09() ? A03(188, 16, 80) : A03(163, 25, 10);
            } catch (Exception unused) {
                enumC02850e = EnumC02850e.A02;
            }
        }
        this.A01.put(A032, String.valueOf(true));
        return enumC02850e;
    }

    @Override // com.facebook.ads.redexgen.X.R5
    public final void A0E() {
        EnumC02850e enumC02850e = null;
        if (((R5) this).A01) {
            enumC02850e = A0A();
        } else {
            this.A01.put(A03(188, 16, 80), String.valueOf(true));
        }
        Map<String, String> map = this.A01;
        if (A03[3].length() == 13) {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[2] = "sgzsFq3t5RzUzGxHOqvhuB7Tq08HlvIk";
        strArr[2] = "sgzsFq3t5RzUzGxHOqvhuB7Tq08HlvIk";
        A0F(map, enumC02850e);
    }
}