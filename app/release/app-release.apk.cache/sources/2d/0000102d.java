package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.Cf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0575Cf implements XK {
    public static byte[] A02;
    public static String[] A03;
    public final C1081Wi A00;
    public final C8O A01;

    static {
        A05();
        A04();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 85);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        String[] strArr = A03;
        if (strArr[7].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[0] = "GUa5RhIL61d4FW3HWW0RBx9i";
        strArr2[1] = "4nKtohmUbY7tHai9z2t8ojCMJbrZv";
        A02 = new byte[]{62, 28, 19, 90, 9, 93, 25, 24, 17, 24, 9, 24, 93, 28, 9, 9, 24, 16, 13, 9, 14, 93, 24, 5, 30, 24, 24, 25, 24, 25, 93, 24, Flags.CD, 24, 19, 9, 14, 83, 16, 21, 7, 24, 21, 46, 59, 59, bx.W5, 34, ax5.a, 59, g15.c, 122, 111, 122, 16, 29, 50, 36, 50, 50, 40, 46, 47, 30, 40, 37, 32, 54, 32, 32, 58, 60, 61, 12, 39, 58, 62, 54, 76, 81, 85, 93, 20, 15, Flags.CD, 5, 14, ax5.a, 9, 4, g15.c, 114, 123, 110};
    }

    public static void A05() {
        A03 = new String[]{"zSqnO64p11LQVC3SPrHTwk7q", "RQQcRArwNRw7pCFobI7zm4AECBhyO", "uX7W3VjoXSZ8mIic8tH9fb17VHeYN2EI", "VdQ4q", "h", "roUcO9bhLUMzgbi0", "6tdL5l5B64y16QievzXwm2hdxMIwTdT2", "M1EyYsdVjnJYnVOvo"};
    }

    public C0575Cf(C1081Wi c1081Wi) {
        this.A00 = c1081Wi;
        this.A01 = new C8O(c1081Wi);
    }

    private JSONArray A01(Cursor cursor) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(A00(54, 2, 44), cursor.getString(C1086Wn.A04.A00));
            jSONObject2.put(A00(82, 8, 53), cursor.getString(C1086Wn.A09.A00));
            jSONObject2.put(A00(90, 4, 94), cursor.getString(C1086Wn.A0A.A00));
            jSONObject2.put(A00(78, 4, 109), LW.A02(cursor.getDouble(C1086Wn.A08.A00)));
            jSONObject2.put(A00(66, 12, 6), LW.A02(cursor.getDouble(C1086Wn.A07.A00)));
            jSONObject2.put(A00(56, 10, 20), cursor.getString(C1086Wn.A06.A00));
            String string = cursor.getString(C1086Wn.A03.A00);
            if (string != null) {
                jSONObject = new JSONObject(string);
            } else {
                jSONObject = new JSONObject();
            }
            jSONObject2.put(A00(50, 4, 78), jSONObject);
            jSONObject2.put(A00(43, 7, 26), cursor.getString(C1086Wn.A02.A00));
            jSONObject2.put(A00(38, 5, 36), this.A00.A02().A6S());
            jSONArray.put(jSONObject2);
        }
        return jSONArray;
    }

    private JSONArray A02(Cursor cursor) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(A00(54, 2, 44), cursor.getString(2));
            jSONObject2.put(A00(82, 8, 53), cursor.getString(0));
            jSONObject2.put(A00(90, 4, 94), cursor.getString(4));
            jSONObject2.put(A00(78, 4, 109), LW.A02(cursor.getDouble(5)));
            jSONObject2.put(A00(66, 12, 6), LW.A02(cursor.getDouble(6)));
            jSONObject2.put(A00(56, 10, 20), cursor.getString(7));
            String string = cursor.getString(8);
            if (string != null) {
                jSONObject = new JSONObject(string);
            } else {
                jSONObject = new JSONObject();
            }
            jSONObject2.put(A00(50, 4, 78), jSONObject);
            jSONObject2.put(A00(43, 7, 26), cursor.getString(9));
            jSONObject2.put(A00(38, 5, 36), this.A00.A02().A6S());
            jSONArray.put(jSONObject2);
        }
        return jSONArray;
    }

    public static JSONObject A03(Cursor cursor) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        while (cursor.moveToNext()) {
            String string = cursor.getString(C1088Wp.A02.A00);
            String string2 = cursor.getString(C1088Wp.A01.A00);
            String[] strArr = A03;
            if (strArr[6].charAt(14) != strArr[2].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[7] = "IfQdYzKY6vCyBSxPg";
            strArr2[5] = "fxZpsWnZoPKbT5Dt";
            jSONObject.put(string, string2);
        }
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.C9N
    @SuppressLint({"CatchGeneralException"})
    public final int A3z(int i) {
        int i2 = 0;
        if (i > -1) {
            try {
                i2 = this.A01.A09(i);
            } catch (Exception e) {
                if (BuildConfigApi.isDebug()) {
                    Log.e(XK.A00, A00(0, 38, 40), e);
                }
            }
        }
        this.A01.A0J();
        this.A01.A0K();
        return i2;
    }

    @Override // com.facebook.ads.redexgen.X.C9O
    public final void A40() {
        this.A01.A0I();
    }

    @Override // com.facebook.ads.redexgen.X.C9N
    public final boolean A4g(String str) {
        return this.A01.A0L(str);
    }

    @Override // com.facebook.ads.redexgen.X.C9N
    @Nullable
    public final JSONArray A5K() {
        Cursor cursor = null;
        try {
            cursor = this.A01.A0B();
            JSONArray jSONArray = null;
            if (cursor.getCount() > 0) {
                jSONArray = A01(cursor);
            }
            cursor.close();
            return jSONArray;
        } catch (JSONException unused) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C9N
    @Nullable
    public final JSONObject A5L() {
        Cursor cursor = null;
        try {
            cursor = this.A01.A0C();
            JSONObject jSONObject = null;
            if (cursor.getCount() > 0) {
                jSONObject = A03(cursor);
            }
            cursor.close();
            return jSONObject;
        } catch (JSONException unused) {
            String[] strArr = A03;
            if (strArr[3].length() != strArr[4].length()) {
                String[] strArr2 = A03;
                strArr2[0] = "fQ4GsEetTW4Q8M7eeZgpps0V";
                strArr2[1] = "7a4bIAh8lhheYJZGYQIYoy5madi9z";
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            }
            throw new RuntimeException();
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C9N
    public final int A6D() {
        Cursor cursor = null;
        try {
            cursor = this.A01.A0A();
            int i = cursor.moveToFirst() ? cursor.getInt(0) : 0;
            cursor.close();
            return i;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C9N
    @Nullable
    public final String A6G(String str) {
        String str2 = null;
        Cursor A0E = this.A01.A0E(str);
        if (A0E != null) {
            if (A0E.moveToNext() && A0E.getCount() > 0) {
                C8M c8m = C1086Wn.A0A;
                String[] strArr = A03;
                if (strArr[7].length() == strArr[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A03;
                strArr2[3] = "VgiME";
                strArr2[4] = "4";
                str2 = A0E.getString(A0E.getColumnIndex(c8m.A01));
            }
            A0E.close();
        }
        return str2;
    }

    @Override // com.facebook.ads.redexgen.X.C9N
    public final Pair<JSONObject, JSONArray> A77(int i) {
        Cursor cursor = null;
        try {
            try {
                cursor = this.A01.A0D(i);
                JSONArray jSONArray = null;
                JSONObject jSONObject = null;
                if (cursor.getCount() > 0) {
                    jSONObject = A03(cursor);
                    jSONArray = A02(cursor);
                }
                Pair<JSONObject, JSONArray> pair = new Pair<>(jSONObject, jSONArray);
                cursor.close();
                return pair;
            } catch (JSONException unused) {
                Pair<JSONObject, JSONArray> pair2 = new Pair<>(null, null);
                if (cursor != null) {
                    cursor.close();
                }
                return pair2;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C9N
    public final boolean A7O(String str) {
        return this.A01.A0M(str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9L != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    @Override // com.facebook.ads.redexgen.X.C9O
    public final void ADv(JB jb, C9L<String> c9l) {
        this.A01.A0H(jb.A09(), jb.A06().A00, jb.A07().toString(), jb.A05(), jb.A04(), jb.A08(), jb.A0A(), c9l);
    }
}