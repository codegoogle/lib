package com.facebook.ads.redexgen.X;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.locks.Lock;

/* renamed from: com.facebook.ads.redexgen.X.Ck  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0580Ck extends AbstractC1089Wq<String> {
    public static byte[] A08;
    public static String[] A09;
    public final /* synthetic */ double A00;
    public final /* synthetic */ double A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C8O A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ Map A07;

    static {
        A03();
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 32);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A08 = new byte[]{-112, -115, -96, -115, -114, -115, -97, -111};
    }

    public static void A03() {
        A09 = new String[]{"l", "T0JdG9ZEnLfTeCeftC9G7d8cUsVG3XZb", "aLcPLzyPnyiGnlL0eBnocVG2Im", "W3EwFUE7CvVeZV", "t2q4fu0Y0bIBimY2SigNyotMmunbmEsF", "TUpEXXUjgi8xLksArOVlucAVZCM", "AqOn5F5Mae0spU5kh0gbanyLcs", "chqW8UrgIl8Ef4OOKimE4h"};
    }

    public C0580Ck(C8O c8o, String str, String str2, int i, double d, double d2, String str3, Map map) {
        this.A03 = c8o;
        this.A06 = str;
        this.A05 = str2;
        this.A02 = i;
        this.A01 = d;
        this.A00 = d2;
        this.A04 = str3;
        this.A07 = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C8R
    @Nullable
    /* renamed from: A00 */
    public final String A04() {
        C1081Wi c1081Wi;
        Lock lock;
        C1081Wi c1081Wi2;
        Lock lock2;
        C1081Wi c1081Wi3;
        Lock lock3;
        C1081Wi c1081Wi4;
        C1086Wn c1086Wn;
        C1088Wp c1088Wp;
        C1081Wi c1081Wi5;
        Lock lock4;
        String A01 = A01(0, 8, 12);
        c1081Wi = this.A03.A01;
        c1081Wi.A04().A7N(this.A06);
        if (TextUtils.isEmpty(this.A05)) {
            return null;
        }
        lock = C8O.A08;
        lock.lock();
        String[] strArr = A09;
        if (strArr[6].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[1] = "mqnyRlomjFPPGlBu5iJ3A4HRnrnsorAH";
        strArr2[4] = "vLAqNnzkqKgbXCY8NZfbbPBhHyGRm9s6";
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                sQLiteDatabase = this.A03.A0F();
                sQLiteDatabase.beginTransaction();
                c1086Wn = this.A03.A02;
                c1088Wp = this.A03.A03;
                String A0F = c1086Wn.A0F(c1088Wp.A0D(this.A05), this.A02, this.A06, this.A01, this.A00, this.A04, this.A07);
                sQLiteDatabase.setTransactionSuccessful();
                if (sQLiteDatabase.isOpen()) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Exception e) {
                        c1081Wi5 = this.A03.A01;
                        c1081Wi5.A04().A82(A01, C04848i.A0n, new C04858j(e));
                    }
                }
                lock4 = C8O.A08;
                String[] strArr3 = A09;
                String str = strArr3[0];
                String eventId = strArr3[3];
                if (str.length() != eventId.length()) {
                    String[] strArr4 = A09;
                    strArr4[6] = "euwrYX6ZBvkkPfbLG6LTpx3NDj";
                    strArr4[2] = "qLYaMtYi2WKu9oTuT6ElhKmpF4";
                    lock4.unlock();
                    return A0F;
                }
                throw new RuntimeException();
            } catch (Exception e2) {
                A01(C8Q.A06);
                c1081Wi2 = this.A03.A01;
                c1081Wi2.A04().A82(A01, C04848i.A0m, new C04858j(e2));
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Exception e3) {
                        c1081Wi3 = this.A03.A01;
                        c1081Wi3.A04().A82(A01, C04848i.A0n, new C04858j(e3));
                    }
                }
                lock2 = C8O.A08;
                lock2.unlock();
                return null;
            }
        } catch (Throwable th) {
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                try {
                    if (sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.endTransaction();
                    }
                } catch (Exception e4) {
                    c1081Wi4 = this.A03.A01;
                    c1081Wi4.A04().A82(A01, C04848i.A0n, new C04858j(e4));
                }
            }
            lock3 = C8O.A08;
            lock3.unlock();
            throw th;
        }
    }
}