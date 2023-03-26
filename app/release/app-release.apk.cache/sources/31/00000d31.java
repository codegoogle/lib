package com.facebook.ads.internal.exoplayer2.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;
import com.facebook.ads.redexgen.X.C0726Ig;
import com.facebook.ads.redexgen.X.HandlerThreadC0731Im;
import com.facebook.ads.redexgen.X.I1;
import java.util.Arrays;

@TargetApi(17)
/* loaded from: assets/audience_network.dex */
public final class DummySurface extends Surface {
    public static int A03;
    public static boolean A04;
    public static byte[] A05;
    public boolean A00;
    public final boolean A01;
    public final HandlerThreadC0731Im A02;

    static {
        A04();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 76);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{-29, -27, -22, -3, -29, -10, -14, -3, 14, 16, 13, 18, 3, 1, 18, 3, 2, -3, 1, 13, 12, 18, 3, 12, 18, -101, -99, -94, -75, -95, -98, -88, -75, -55, -53, -56, -68, -73, -71, -69, -62, -69, -55, -55, -75, -71, -59, -60, -54, -69, -50, -54, -81, -56, -51, -49, -54, -54, -55, -52, -50, -65, -66, 122, -54, -52, -61, -55, -52, 122, -50, -55, 122, -101, -86, -93, 122, -58, -65, -48, -65, -58, 122, -117, -111, 21, 17, -18, -13, -14, -19, -65, -52, -62, -48, -51, -57, -62, -116, -58, -65, -48, -62, -43, -65, -48, -61, -116, -44, -48, -116, -58, -57, -59, -58, -67, -50, -61, -48, -60, -51, -48, -53, -65, -52, -63, -61, -57, -75, -63, -57, -55, -62, -69};
    }

    public DummySurface(HandlerThreadC0731Im handlerThreadC0731Im, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.A02 = handlerThreadC0731Im;
        this.A01 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
        if (A02(85, 6, 113).equals(com.facebook.ads.redexgen.X.C0726Ig.A06) != false) goto L7;
     */
    @TargetApi(24)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A00(Context context) {
        String eglQueryString;
        if (C0726Ig.A02 < 26) {
            if (!A02(127, 7, 8).equals(C0726Ig.A05)) {
            }
            return 0;
        }
        if ((C0726Ig.A02 >= 26 || context.getPackageManager().hasSystemFeature(A02(91, 36, 18))) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null) {
            String eglExtensions = A02(0, 25, 82);
            if (eglQueryString.contains(eglExtensions)) {
                String eglExtensions2 = A02(25, 27, 10);
                return eglQueryString.contains(eglExtensions2) ? 1 : 2;
            }
            return 0;
        }
        return 0;
    }

    public static DummySurface A01(Context context, boolean z) {
        A03();
        I1.A04(!z || A05(context));
        return new HandlerThreadC0731Im().A05(z ? A03 : 0);
    }

    public static void A03() {
        if (C0726Ig.A02 >= 17) {
            return;
        }
        throw new UnsupportedOperationException(A02(52, 33, 14));
    }

    public static synchronized boolean A05(Context context) {
        boolean z;
        synchronized (DummySurface.class) {
            z = true;
            if (!A04) {
                A03 = C0726Ig.A02 < 24 ? 0 : A00(context);
                A04 = true;
            }
            if (A03 == 0) {
                z = false;
            }
        }
        return z;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.A02) {
            if (!this.A00) {
                this.A02.A06();
                this.A00 = true;
            }
        }
    }
}