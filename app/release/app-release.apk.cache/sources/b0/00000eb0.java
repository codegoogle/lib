package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import com.p7700g.p99005.g15;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.ThreadSafe;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ThreadSafe
@SuppressLint({"StaticFieldLeak"})
/* renamed from: com.facebook.ads.redexgen.X.60  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass60 {
    public static EnumC04426j A06;
    public static byte[] A07;
    public static String[] A08;
    public static final AtomicReference<AnonymousClass60> A09;
    public AnonymousClass62 A00;
    public C6U A01;
    public final Context A02;
    public final C04325z A03;
    public final AtomicReference<C6F> A04 = new AtomicReference<>();
    public final AtomicReference<TX> A05 = new AtomicReference<>();

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 68);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{99, 101, 116, g15.c, 25, 20, 92, 90, 114, 109, 113};
    }

    public static void A02() {
        A08 = new String[]{"eZKmHpMMDfaoBqW8nqrxEoXtMavqlqNM", "AtFM24PyHDF8", "75v22abHTVt154frUD1Ye4KyqdVteY4i", "Q1X3dzo1KUJ0DHl8HY6jDpMlStfBjogW", "z2ZYiDayfErc", "35EgzrmLPkhoCqMLba9eqfKFMV7fawsP", "opJsobvHgIMCHkez4yG45JKspLs2PehX", "oVaFSOpmfGo5v5TJJzClDpDAWRdHWsbi"};
    }

    static {
        A02();
        A01();
        A09 = new AtomicReference<>();
    }

    public AnonymousClass60(Context context, C04325z c04325z, EnumC04426j enumC04426j) {
        this.A02 = context;
        this.A03 = c04325z;
        this.A01 = new C6U(this.A02, this.A03);
        if (this.A04.get() == null && AnonymousClass76.A0F(enumC04426j)) {
            A03(enumC04426j);
        }
    }

    private synchronized void A03(EnumC04426j enumC04426j) {
        if (this.A04.get() == null) {
            C6B.A03(this.A03.A0Z());
            TX tx = new TX(this.A03, this.A01);
            this.A05.set(tx);
            this.A00 = new AnonymousClass62();
            this.A00.A00(tx);
            if (this.A01.A06() && AnonymousClass76.A0F(enumC04426j)) {
                tx.A06(enumC04426j);
            }
            A06 = enumC04426j;
            this.A00.A01(enumC04426j);
            this.A04.set(C6F.A00(this.A02, this.A03));
        }
    }

    private boolean A04(EnumC04426j enumC04426j) {
        if (AnonymousClass76.A0F(enumC04426j)) {
            A03(enumC04426j);
        }
        if (enumC04426j.equals(A06)) {
            return false;
        }
        A06 = enumC04426j;
        AnonymousClass62 anonymousClass62 = this.A00;
        if (anonymousClass62 != null) {
            anonymousClass62.A01(enumC04426j);
        }
        if (A08[0].charAt(4) != 't') {
            String[] strArr = A08;
            strArr[2] = "al3lqCaa3X6BhafyoLSdmdZ2qZ9PyUcx";
            strArr[2] = "al3lqCaa3X6BhafyoLSdmdZ2qZ9PyUcx";
            return true;
        }
        throw new RuntimeException();
    }

    private boolean A05(String str, EnumC04466n enumC04466n) {
        if (!AnonymousClass76.A0F(A06) || this.A04.get() == null) {
            return false;
        }
        C6U c6u = this.A01;
        if (c6u != null) {
            c6u.A05(EnumC04446l.A02, A06, str, enumC04466n);
            return true;
        }
        return true;
    }

    @SuppressLint({"CatchGeneralException"})
    public final void A06(MotionEvent motionEvent) {
        try {
            if (this.A04.get() == null) {
                return;
            }
            this.A04.get().A06(motionEvent);
        } catch (Throwable th) {
            C6B.A04(th);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public final synchronized boolean A07(String str) {
        JSONObject jSONObject;
        EnumC04466n enumC04466n;
        String string;
        if (str != null) {
            if (!str.isEmpty()) {
                try {
                    jSONObject = new JSONObject(str).getJSONObject(A00(0, 2, 69));
                } catch (JSONException unused) {
                } catch (Throwable th) {
                    C6B.A04(th);
                }
                if (jSONObject != null) {
                    r7 = jSONObject.has(A00(6, 2, 106)) ? false | A04(EnumC04426j.A00(jSONObject.getInt(A00(6, 2, 106)))) : false;
                    JSONArray jSONArray = jSONObject.getJSONArray(A00(2, 2, 83));
                    if (jSONObject.has(A00(8, 3, 69))) {
                        enumC04466n = EnumC04466n.A00(jSONObject.getInt(A00(8, 3, 69)));
                    } else {
                        enumC04466n = EnumC04466n.A04;
                    }
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        if (jSONObject2.has(A00(4, 2, 52)) && (string = jSONObject2.getString(A00(4, 2, 52))) != null && !string.isEmpty()) {
                            AnonymousClass76.A0C(this.A03, AnonymousClass66.A04.A02(), string);
                            r7 |= A05(string, enumC04466n);
                        }
                    }
                    return r7;
                }
                return false;
            }
        }
        return false;
    }
}