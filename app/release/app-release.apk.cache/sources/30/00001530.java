package com.facebook.ads.redexgen.X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Xg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class SurfaceHolder$CallbackC1105Xg implements J4, BB, GJ, E1, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public static String[] A01;
    public final /* synthetic */ CI A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"tENgV7sVRmCggStQb7ahqyncu3McMlqx", "EBCLDe86SI67l2WgLGk", "Xc2z6PWfFp", "ZjGJvfPpi7mMWyj8ThC73X2hXIQsvVeY", "O", "wm4K2NOZzdg8zteNHm", "uxR1U8t68FFaIgGW", "ZP1sAESULwb937k6ya35I8qp57tsUFN9"};
    }

    public SurfaceHolder$CallbackC1105Xg(CI ci) {
        this.A00 = ci;
    }

    @Override // com.facebook.ads.redexgen.X.BB
    public final void A8u(String str, long j, long j2) {
        Iterator it = CI.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((BB) it.next()).A8u(str, j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BB
    public final void A8v(C0557Be c0557Be) {
        Iterator it = CI.A0D(this.A00).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A01;
            if (strArr[0].charAt(30) == strArr[7].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "r";
            strArr2[1] = "Pw7sEp82k0vieihjeRw";
            if (!hasNext) {
                CI ci = this.A00;
                String[] strArr3 = A01;
                if (strArr3[0].charAt(30) == strArr3[7].charAt(30)) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A01;
                strArr4[5] = "AJXnTxM8Cjr";
                strArr4[5] = "AJXnTxM8Cjr";
                CI.A04(ci, null);
                CI.A06(this.A00, null);
                CI.A00(this.A00, 0);
                return;
            }
            BB bb = (BB) it.next();
            if (A01[3].charAt(20) != '3') {
                throw new RuntimeException();
            }
            String[] strArr5 = A01;
            strArr5[5] = "rZ";
            strArr5[5] = "rZ";
            bb.A8v(c0557Be);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BB
    public final void A8w(C0557Be c0557Be) {
        CI.A06(this.A00, c0557Be);
        Iterator it = CI.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((BB) it.next()).A8w(c0557Be);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BB
    public final void A8x(Format format) {
        CI.A04(this.A00, format);
        Iterator it = CI.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((BB) it.next()).A8x(format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BB
    public final void A8y(int i) {
        CI.A00(this.A00, i);
        Iterator it = CI.A0D(this.A00).iterator();
        while (it.hasNext()) {
            BB bb = (BB) it.next();
            if (A01[2].length() == 11) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "0C";
            strArr[2] = "0C";
            bb.A8y(i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BB
    public final void A8z(int i, long j, long j2) {
        Iterator it = CI.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((BB) it.next()).A8z(i, j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.GJ
    public final void A9I(List<GF> list) {
        CI.A08(this.A00, list);
        Iterator it = CI.A09(this.A00).iterator();
        while (it.hasNext()) {
            ((GJ) it.next()).A9I(list);
        }
    }

    @Override // com.facebook.ads.redexgen.X.J4
    public final void A9T(int i, long j) {
        Iterator it = CI.A0B(this.A00).iterator();
        while (it.hasNext()) {
            ((J4) it.next()).A9T(i, j);
        }
    }

    @Override // com.facebook.ads.redexgen.X.E1
    public final void AAE(Metadata metadata) {
        Iterator it = CI.A0A(this.A00).iterator();
        while (it.hasNext()) {
            ((E1) it.next()).AAE(metadata);
        }
    }

    @Override // com.facebook.ads.redexgen.X.J4
    public final void AAk(Surface surface) {
        if (CI.A01(this.A00) == surface) {
            Iterator it = CI.A0C(this.A00).iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        Iterator it2 = CI.A0B(this.A00).iterator();
        while (it2.hasNext()) {
            ((J4) it2.next()).AAk(surface);
        }
    }

    @Override // com.facebook.ads.redexgen.X.J4
    public final void ABF(String str, long j, long j2) {
        Iterator it = CI.A0B(this.A00).iterator();
        while (it.hasNext()) {
            ((J4) it.next()).ABF(str, j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.J4
    public final void ABG(C0557Be c0557Be) {
        Iterator it = CI.A0B(this.A00).iterator();
        while (it.hasNext()) {
            ((J4) it.next()).ABG(c0557Be);
        }
        CI.A03(this.A00, null);
        CI.A05(this.A00, null);
    }

    @Override // com.facebook.ads.redexgen.X.J4
    public final void ABH(C0557Be c0557Be) {
        CI.A05(this.A00, c0557Be);
        Iterator it = CI.A0B(this.A00).iterator();
        while (it.hasNext()) {
            J4 j4 = (J4) it.next();
            if (A01[3].charAt(20) != '3') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[5] = "6iGRC7";
            strArr[5] = "6iGRC7";
            j4.ABH(c0557Be);
        }
    }

    @Override // com.facebook.ads.redexgen.X.J4
    public final void ABJ(Format format) {
        CI.A03(this.A00, format);
        Iterator it = CI.A0B(this.A00).iterator();
        while (it.hasNext()) {
            J4 j4 = (J4) it.next();
            String[] strArr = A01;
            if (strArr[0].charAt(30) == strArr[7].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "M1lNqMtLlEQhDRLPZV8vitTN6y5pnm";
            strArr2[5] = "M1lNqMtLlEQhDRLPZV8vitTN6y5pnm";
            j4.ABJ(format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.J4
    public final void ABM(int i, int i2, int i3, float f) {
        Iterator it = CI.A0C(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC0739Iv) it.next()).ABM(i, i2, i3, f);
        }
        Iterator it2 = CI.A0B(this.A00).iterator();
        while (it2.hasNext()) {
            ((J4) it2.next()).ABM(i, i2, i3, f);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        CI.A0I(this.A00, new Surface(surfaceTexture), true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        CI.A0I(this.A00, null, true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        CI.A0I(this.A00, surfaceHolder.getSurface(), false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        CI.A0I(this.A00, null, false);
    }
}