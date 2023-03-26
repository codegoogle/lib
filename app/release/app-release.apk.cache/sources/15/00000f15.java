package com.facebook.ads.redexgen.X;

import android.media.AudioManager;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.7k  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C04667k extends AbstractC0754Jk {
    public static byte[] A01;
    public final /* synthetic */ C04657i A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 118);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-7, 13, -4, 1, 7};
    }

    public C04667k(C04657i c04657i) {
        this.A00 = c04657i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r0.get() == null) goto L8;
     */
    @Override // com.facebook.ads.redexgen.X.C9K
    /* renamed from: A02 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A04(C0761Jt c0761Jt) {
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        weakReference = this.A00.A00;
        if (weakReference != null) {
            weakReference3 = this.A00.A00;
        }
        this.A00.A00 = new WeakReference(new P1(this));
        weakReference2 = this.A00.A00;
        ((AudioManager) this.A00.getContext().getApplicationContext().getSystemService(A00(0, 5, 34))).requestAudioFocus((AudioManager.OnAudioFocusChangeListener) weakReference2.get(), 3, 1);
    }
}