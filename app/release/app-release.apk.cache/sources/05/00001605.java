package com.facebook.ads.redexgen.X;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.yg1;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xbill.DNS.Flags;
import org.xbill.DNS.WKSRecord;

/* renamed from: com.facebook.ads.redexgen.X.bB  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1245bB implements JD {
    public static byte[] A0D;
    public static final String A0E;
    public int A00;
    public long A01;
    public final long A02;
    public final long A03;
    public final ConnectivityManager A04;
    public final C1081Wi A06;
    public final JC A07;
    public final InterfaceC0906Pm A08;
    public volatile boolean A0C;
    public final Runnable A0A = new C1243b9(this);
    public final Runnable A09 = new C1244bA(this);
    public final ThreadPoolExecutor A0B = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    public final Handler A05 = new Handler(Looper.getMainLooper());

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 88);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0D = new byte[]{bx.l7, -22, -48, -44, -73, -36, -26, -29, -44, -25, -42, -37, -36, bx.j7, -38, -109, -40, -23, -40, bx.j7, -25, -109, -101, -45, 6, -15, -13, -2, 2, -9, -3, -4, -82, 5, -10, -9, -6, -13, -82, -14, -9, 1, -2, -17, 2, -15, -10, -9, -4, -11, -82, -13, 4, -13, -4, 2, 1, -68, -28, -10, 3, 7, -10, 3, -79, 1, 3, 0, -12, -10, 4, 4, -10, -11, -79, 1, -14, 3, 5, -6, -14, -3, -79, -13, -14, 5, -12, -7, -67, -79, -12, 0, -1, 5, -6, -1, 6, -6, -1, -8, -79, 5, 0, -79, -1, -10, 9, 5, -79, 0, -1, -10, -65, 27, 45, 58, 62, 45, 58, -24, 58, 45, 59, 56, 55, 54, 59, 45, -24, 49, 59, -24, 45, 53, 56, 60, 65, -10, -17, 1, 14, 18, 1, 14, -68, 14, 1, 16, 17, 14, 10, 1, 0, -68, -3, -68, 10, Flags.CD, 10, -55, 15, 17, -1, -1, 1, 15, 15, 2, 17, 8, -68, 15, 16, -3, 16, 17, 15, -68, -1, Flags.CD, 0, 1, -68, Flags.CD, 2, -68, -61, -43, -30, -26, -43, -30, -112, -25, -47, -29, -112, -27, -34, -47, -46, -36, -43, -112, -28, -33, -112, -32, -30, -33, -45, -43, -29, -29, -112, -47, -36, -36, -112, -43, -26, -43, -34, -28, -29, -100, -112, -28, -30, -23, bx.l7, -34, -41, -112, -47, -41, -47, bx.l7, -34, -98, -17, 7, 5, 12, 12, 5, 10, 3, -68, 0, 5, 15, 12, -3, 16, -1, 4, -68, 0, 17, 1, -68, 16, Flags.CD, -68, 8, -3, -1, 7, -68, Flags.CD, 2, -68, -1, Flags.CD, 10, 10, 1, -1, 16, 5, 18, 5, 16, 21, -54, bx.j7, -12, -12, -27, -19, -16, -12, -59, -47, -48, -48, -57, -59, -42, -53, -40, -53, -42, -37, 47, 44, ax5.a, 44, -22, -5, -22, -13, -7, -8, 36, 21, 45, 32, 35, 21, 24};
    }

    static {
        A07();
        A0E = JD.class.getSimpleName();
    }

    public C1245bB(C1081Wi c1081Wi, JC jc) {
        this.A07 = jc;
        this.A06 = c1081Wi;
        this.A04 = (ConnectivityManager) c1081Wi.getSystemService(A03(293, 12, 10));
        this.A08 = Q4.A01(c1081Wi);
        this.A03 = J9.A0K(c1081Wi);
        this.A02 = J9.A0J(c1081Wi);
    }

    public static /* synthetic */ int A00(C1245bB c1245bB) {
        int i = c1245bB.A00 + 1;
        c1245bB.A00 = i;
        return i;
    }

    private void A05() {
        BuildConfigApi.isDebug();
        this.A00 = 0;
        this.A01 = 0L;
        if (this.A0B.getQueue().size() == 0) {
            this.A07.A8q();
        }
    }

    private void A06() {
        if (this.A00 >= J9.A09(this.A06)) {
            A05();
            A4n();
            return;
        }
        if (this.A00 == 1) {
            this.A01 = J9.A0I(this.A06);
        } else {
            this.A01 *= 2;
        }
        A4o();
    }

    private void A08(long j) {
        this.A05.postDelayed(this.A09, j);
    }

    private void A09(JSONObject jSONObject) throws JSONException {
        for (Map.Entry<String, String> entry : this.A06.A02().A4S().entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:22:0x005b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0B() {
        JSONArray jSONArray;
        try {
            NetworkInfo activeNetworkInfo = this.A04.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
                if (BuildConfigApi.isDebug()) {
                    Log.e(A0E, A03(240, 46, 68));
                }
                A08(this.A02);
                return;
            }
            BuildConfigApi.isDebug();
            JSONObject A4G = this.A07.A4G();
            if (A4G == null) {
                BuildConfigApi.isDebug();
                A05();
                return;
            }
            boolean isDebug = BuildConfigApi.isDebug();
            String A03 = A03(309, 6, 45);
            if (isDebug && A4G.has(A03)) {
                for (int i = 0; i < i; i++) {
                    String str = A03(4, 19, 27) + i + A03(0, 3, 88) + jSONArray.get(i);
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A03(286, 7, 40), String.valueOf(this.A00));
            A09(jSONObject);
            A4G.put(A03(305, 4, 115), jSONObject);
            Q0 q0 = new Q0();
            q0.put(A03(315, 7, 92), A4G.toString());
            InterfaceC0905Pl ABd = this.A08.ABd(this.A06.A03().A6H(), q0.A09());
            String responseBody = ABd != null ? ABd.A5U() : null;
            if (!TextUtils.isEmpty(responseBody) && ABd != null) {
                if (ABd.A74() != 200) {
                    if (BuildConfigApi.isDebug()) {
                        Log.e(A0E, A03(WKSRecord.Service.NETBIOS_DGM, 48, 68) + ABd.A74() + A03(3, 1, 78));
                    }
                    if (ABd.A74() == 413 && J8.A1K(this.A06)) {
                        this.A07.AAg();
                        A05();
                        return;
                    }
                    if (A4G.has(A03)) {
                        this.A07.A9J(A4G.getJSONArray(A03));
                    }
                    A06();
                    return;
                } else if (!this.A07.A9L(new JSONArray(responseBody))) {
                    if (BuildConfigApi.isDebug()) {
                        Log.w(A0E, A03(yg1.G, 54, 24));
                    }
                    A06();
                    return;
                } else if (this.A07.A7g()) {
                    if (BuildConfigApi.isDebug()) {
                        Log.i(A0E, A03(58, 55, 57));
                    }
                    A06();
                    return;
                } else {
                    A05();
                    return;
                }
            }
            if (BuildConfigApi.isDebug()) {
                Log.e(A0E, A03(113, 25, 112));
            }
            if (J8.A1F(this.A06) && A4G.has(A03)) {
                this.A07.A9J(A4G.getJSONArray(A03));
            }
            A06();
        } catch (Exception e) {
            if (BuildConfigApi.isDebug()) {
                Log.e(A0E, A03(23, 35, 54), e);
            }
            A06();
        }
    }

    @Override // com.facebook.ads.redexgen.X.JD
    public final void A4n() {
        if (this.A0C) {
            return;
        }
        this.A0C = true;
        this.A05.removeCallbacks(this.A09);
        A08(this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.JD
    public final void A4o() {
        this.A0C = true;
        this.A05.removeCallbacks(this.A09);
        A08(this.A03);
    }
}