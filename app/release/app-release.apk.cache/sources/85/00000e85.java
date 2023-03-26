package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import com.p7700g.p99005.ax5;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5I  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C5I extends AsyncTask<C5K, Void, Drawable> {
    public static byte[] A03;
    public static String[] A04;
    public final C5J A00;
    public final C1080Wh A01;
    public final boolean A02;

    static {
        A03();
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 118);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{59, 57, 50, 57, 46, 53, ax5.a};
    }

    public static void A03() {
        A04 = new String[]{"1BJo9noXfKND6AuvSNdcB1V3GCwIAiOG", "Zj7TA2K", "dGMOiNue98uIHvh7voSV0LAZFWXYzfEv", "CcnxrNYo5kyWzKS3XGCDqe4PQiCtH", "knheqnusZFI0swerek9wKwEDBcdWqhKt", "XjDOSOe9Ixcmw73z7hfuGI1aFjWKj", "M2ugdIZCKbhB2vBaVocVLhBvD0BsDTY5", "metH7Y2aXkNKgtpuuGKiPWqQd6SU"};
    }

    public C5I(C1080Wh c1080Wh, C5J c5j, boolean z) {
        this.A01 = c1080Wh;
        this.A00 = c5j;
        this.A02 = z;
    }

    public /* synthetic */ C5I(C1080Wh c1080Wh, C5J c5j, boolean z, TB tb) {
        this(c1080Wh, c5j, z);
    }

    @SuppressLint({"CatchGeneralException"})
    private final Drawable A00(C5K... c5kArr) {
        if (!KU.A02(this) && c5kArr != null) {
            try {
                if (c5kArr.length >= 1) {
                    String str = c5kArr[0].A01;
                    String str2 = c5kArr[0].A00;
                    Bitmap A0J = new C7H(this.A01).A0J(str, -1, -1);
                    if (A0J != null) {
                        return C1267bZ.A05(this.A01, A0J, this.A02, str2);
                    }
                    return null;
                }
            } catch (Throwable th) {
                KU.A00(th, this);
                return null;
            }
        }
        return null;
    }

    private final void A04(Drawable drawable) {
        if (KU.A02(this)) {
            return;
        }
        try {
            this.A00.A9h(drawable);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // android.os.AsyncTask
    @SuppressLint({"CatchGeneralException"})
    public final /* bridge */ /* synthetic */ Drawable doInBackground(C5K[] c5kArr) {
        if (KU.A02(this)) {
            return null;
        }
        try {
            return A00(c5kArr);
        } catch (Throwable th) {
            KU.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Drawable drawable) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(drawable);
        } catch (Throwable th) {
            KU.A00(th, this);
            String[] strArr = A04;
            if (strArr[0].charAt(5) != strArr[4].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[1] = "H4qVqfS";
            strArr2[7] = "3NPSPTmKkS9byZNXvPXu57LevjUG";
        }
    }
}