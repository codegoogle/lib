package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.MediaController;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.g15;
import java.util.Arrays;

@TargetApi(14)
/* loaded from: assets/audience_network.dex */
public final class GC extends TextureView implements TextureView.SurfaceTextureListener, PO, InterfaceC0896Pc, PQ {
    public static byte[] A0N;
    public static String[] A0O;
    public static final String A0P;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public Uri A06;
    @Nullable
    public Surface A07;
    public View A08;
    @Nullable
    public MediaController A09;
    public C1080Wh A0A;
    public EnumC0886Os A0B;
    @Nullable
    public PR A0C;
    public EnumC0898Pe A0D;
    public EnumC0898Pe A0E;
    public InterfaceC0899Pf A0F;
    @Nullable
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0N, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 68);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0N = new byte[]{86, 126, 126, 118, 125, 116, 49, 112, 125, 102, 112, 104, 98, 49, 101, 121, 99, 126, 102, 49, 112, g15.c, 49, 116, 105, 114, 116, 97, 101, 120, 126, g15.c, 49, 102, 120, 101, 121, 49, 98, 116, 101, 83, 112, 114, 122, 118, 99, 126, 100, g15.c, 117, 85, 99, 112, 102, 112, 115, 125, 116, 49, 126, g15.c, 49, 95, 126, 100, 118, 112, 101, 49, 112, 115, 126, 103, 116, ax5.a, 49, 98, 126, 49, 102, 116, 49, 98, 120, 125, 116, g15.c, 101, 125, 104, 49, 120, 118, g15.c, 126, 99, 116, 49, 120, 101, ax5.a, 76, 100, 100, 108, 103, 110, 43, 106, 103, 124, 106, 114, 120, 43, g15.c, 99, 121, 100, 124, 43, 106, 101, 43, 110, 115, 104, 110, 123, g15.c, 98, 100, 101, 43, 124, 98, g15.c, 99, 43, 120, 110, g15.c, 77, 100, 121, 110, 108, 121, 100, 126, 101, 111, 43, 100, 101, 43, 69, 100, 126, 108, 106, g15.c, 43, 106, 105, 100, 125, 110, 37, 43, 120, 100, 43, 124, 110, 43, 120, 98, 103, 110, 101, g15.c, 103, 114, 43, 98, 108, 101, 100, 121, 110, 43, 98, g15.c, 37, 33, 30, 19, 18, 24, 87, 4, 3, 22, 3, 18, 87, 20, 31, 22, 25, 16, 18, 19, 87, 3, 24, 87, 95, 93, 86, 93, 74, 81, 91};
        String[] strArr = A0O;
        if (strArr[4].charAt(4) == strArr[6].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0O;
        strArr2[3] = "4Rjqxy3w03hT2rk3wOaPN94qCv";
        strArr2[0] = "J56YrdEaTg6GnpCj3tljjm9xxp";
    }

    public static void A08() {
        A0O = new String[]{"5i34yksohRV8hSvEB2dTOBGqhO", "V2RNkeamXobpzSRVkM4sjlG", "1HR", "8SLqGCa2wxiVkGjIaPVK9LXerY", "SSmTkZgpl4jZsKBndOsNgmbhAq5FKejN", "hgMiihLf1lx1lIiVFZ8jC", "euSTtDnbG06q2RqThlQcyR1Es6oMHQDw", "iHXqYQoKvaPWKvo"};
    }

    static {
        A08();
        A07();
        A0P = GC.class.getSimpleName();
    }

    public GC(C1080Wh c1080Wh) {
        super(c1080Wh);
        this.A0D = EnumC0898Pe.A04;
        this.A0E = EnumC0898Pe.A04;
        this.A0L = false;
        this.A0M = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = EnumC0886Os.A04;
        this.A0K = false;
        this.A0A = c1080Wh;
    }

    public GC(C1080Wh c1080Wh, AttributeSet attributeSet) {
        super(c1080Wh, attributeSet);
        this.A0D = EnumC0898Pe.A04;
        this.A0E = EnumC0898Pe.A04;
        this.A0L = false;
        this.A0M = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = EnumC0886Os.A04;
        this.A0K = false;
        this.A0A = c1080Wh;
    }

    public GC(C1080Wh c1080Wh, AttributeSet attributeSet, int i) {
        super(c1080Wh, attributeSet, i);
        this.A0D = EnumC0898Pe.A04;
        this.A0E = EnumC0898Pe.A04;
        this.A0L = false;
        this.A0M = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = EnumC0886Os.A04;
        this.A0K = false;
        this.A0A = c1080Wh;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
        if (r4 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:
        if (r4.length() == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
        if (r5.A0K == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
        r5.A0C.A0F(getContext(), r5.A06);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c0, code lost:
        if (r4 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A04() {
        this.A0C = new PR(this.A0A);
        this.A0C.A0I(this);
        this.A0C.A0H(this);
        this.A0C.A0J(false);
        if (this.A0J && !this.A0I) {
            Activity A09 = this.A0A.A09();
            if (A0O[5].length() != 21) {
                throw new RuntimeException();
            }
            String[] strArr = A0O;
            strArr[4] = "kOzpobq3cn2ENPvO1dz11rE9gYrdsM2t";
            strArr[6] = "XeC6T5eSgweGxN3AGx0qK1AhpVQau6BW";
            if (A09 != null) {
                this.A09 = new MediaController(A09);
                MediaController mediaController = this.A09;
                View view = this.A08;
                if (view == null) {
                    view = this;
                }
                mediaController.setAnchorView(view);
                this.A09.setMediaPlayer(new PW(this));
                this.A09.setEnabled(true);
            } else {
                this.A09 = null;
            }
        }
        String str = this.A0G;
        String[] strArr2 = A0O;
        if (strArr2[4].charAt(4) != strArr2[6].charAt(4)) {
            String[] strArr3 = A0O;
            strArr3[1] = "7OzxCvlMe7OewOex";
            strArr3[1] = "7OzxCvlMe7OewOex";
        } else {
            String[] strArr4 = A0O;
            strArr4[4] = "NXAVCVHzJxAz58YH1UEgH4PHy83Kp8aQ";
            strArr4[6] = "f1ODdwAOeVqSGvJpvEMDUKedn4FgojKu";
        }
        setVideoState(EnumC0898Pe.A08);
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }

    private void A05() {
        PR pr = this.A0C;
        if (pr == null) {
            return;
        }
        PP A09 = pr.A09();
        String[] strArr = A0O;
        if (strArr[3].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0O;
        strArr2[3] = "yniwio37QFCiL85s5GWvJngxgc";
        strArr2[0] = "95HbvmBBNGyB2bovEph22CE4vZ";
        if (A09 != null) {
            A09(A09.A01, A09.A00);
        }
    }

    private void A06() {
        Surface surface = this.A07;
        if (surface != null) {
            surface.release();
            this.A07 = null;
        }
        PR pr = this.A0C;
        if (pr != null) {
            pr.A0A();
            if (A0O[5].length() != 21) {
                throw new RuntimeException();
            }
            String[] strArr = A0O;
            strArr[3] = "he0jjWxzFB8qDestWT3k7cDZmQ";
            strArr[0] = "YQusGxI3ZRGEiRLtvLIlZ3cCdg";
            this.A0C = null;
        }
        this.A09 = null;
        this.A0M = false;
        setVideoState(EnumC0898Pe.A04);
    }

    private void A09(int i, int i2) {
        if (i != this.A03 || i2 != this.A02) {
            this.A03 = i;
            this.A02 = i2;
            if (this.A03 != 0 && this.A02 != 0) {
                requestLayout();
            }
        }
    }

    public static boolean A0A() {
        return PR.A04();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public final void A7E() {
        if (!this.A0H) {
            ABX(false, 3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public final boolean A7L() {
        PR pr = this.A0C;
        return pr != null && pr.A0L();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public final boolean A7M() {
        return this.A0M;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public final boolean A7h() {
        return this.A0L;
    }

    @Override // com.facebook.ads.redexgen.X.PO
    public final void AAW(String str, Exception exc) {
        this.A0A.A0A().A8Y(str);
        this.A0A.A0A().A2z(1);
        setVideoState(EnumC0898Pe.A03);
        this.A0A.A04().A82(A03(219, 7, 124), C04848i.A15, new C04858j(exc));
    }

    @Override // com.facebook.ads.redexgen.X.PO
    public final void AAX(boolean z, int i) {
        if (this.A0C == null) {
            return;
        }
        if (i == 1) {
            EnumC0898Pe enumC0898Pe = EnumC0898Pe.A04;
            String[] strArr = A0O;
            if (strArr[3].length() != strArr[0].length()) {
                setVideoState(enumC0898Pe);
                return;
            }
            String[] strArr2 = A0O;
            strArr2[5] = "bt2gfLOq6VYcjgDmYUS3R";
            strArr2[5] = "bt2gfLOq6VYcjgDmYUS3R";
            setVideoState(enumC0898Pe);
        } else if (i == 2) {
            A05();
            int i2 = this.A01;
            if (A0O[1].length() == 30) {
                throw new RuntimeException();
            }
            String[] strArr3 = A0O;
            strArr3[2] = "9yr";
            strArr3[7] = "mKFyaVoRgsxwFz3";
            if (i2 < 0) {
                return;
            }
            int i3 = this.A01;
            this.A01 = -1;
            this.A0F.AAt(i3, getCurrentPosition());
        } else {
            if (i == 3) {
                A05();
                this.A04 = System.currentTimeMillis();
                setRequestedVolume(this.A00);
                long j = this.A05;
                if (j > 0 && j < this.A0C.A08()) {
                    this.A0C.A0E(this.A05);
                    this.A05 = 0L;
                }
                if (this.A0C.A07() != 0 && !z && this.A0M) {
                    setVideoState(EnumC0898Pe.A05);
                    return;
                } else if (z || this.A0D == EnumC0898Pe.A06) {
                    return;
                } else {
                    setVideoState(EnumC0898Pe.A07);
                    EnumC0898Pe enumC0898Pe2 = this.A0E;
                    String[] strArr4 = A0O;
                    if (strArr4[4].charAt(4) != strArr4[6].charAt(4)) {
                        String[] strArr5 = A0O;
                        strArr5[3] = "QOwsd8cFgtBxhwq2W5mYjt9JcX";
                        strArr5[0] = "NiYGjjh9hUScPgNoOA1xOqSddN";
                        if (enumC0898Pe2 != EnumC0898Pe.A0A) {
                            return;
                        }
                    } else if (enumC0898Pe2 != EnumC0898Pe.A0A) {
                        return;
                    }
                    ADI(this.A0B, 8);
                    EnumC0898Pe enumC0898Pe3 = EnumC0898Pe.A04;
                    String[] strArr6 = A0O;
                    if (strArr6[3].length() == strArr6[0].length()) {
                        String[] strArr7 = A0O;
                        strArr7[5] = "yetXNvPdXumqVjXfCpilY";
                        strArr7[5] = "yetXNvPdXumqVjXfCpilY";
                        this.A0E = enumC0898Pe3;
                        return;
                    }
                }
            } else if (i != 4) {
                return;
            } else {
                if (z) {
                    setVideoState(EnumC0898Pe.A06);
                }
                PR pr = this.A0C;
                if (A0O[5].length() == 21) {
                    String[] strArr8 = A0O;
                    strArr8[5] = "KLjUXng8f5n9djrrPXv2F";
                    strArr8[5] = "KLjUXng8f5n9djrrPXv2F";
                    if (pr != null) {
                        pr.A0J(false);
                        if (!z) {
                            this.A0C.A0B();
                        }
                    }
                    this.A0M = false;
                    return;
                }
            }
            throw new RuntimeException();
        }
    }

    @Override // com.facebook.ads.redexgen.X.PQ
    public final void ABM(int i, int i2, int i3, float f) {
        A09(i, i2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public final void ABX(boolean z, int i) {
        this.A0A.A0A().A2v(i);
        this.A0E = EnumC0898Pe.A05;
        this.A0L = z;
        PR pr = this.A0C;
        if (pr != null) {
            pr.A0J(false);
        } else {
            setVideoState(EnumC0898Pe.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public final void ADE(int i) {
        this.A0A.A0A().A8Z(i);
        setVideoState(EnumC0898Pe.A09);
        ADO(5);
        this.A05 = 0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public final void ADI(EnumC0886Os enumC0886Os, int i) {
        this.A0A.A0A().A36(i);
        this.A0L = false;
        this.A0E = EnumC0898Pe.A0A;
        this.A0B = enumC0886Os;
        if (this.A0C == null) {
            setup(this.A06);
        } else if (this.A0D != EnumC0898Pe.A07 && this.A0D != EnumC0898Pe.A05 && this.A0D != EnumC0898Pe.A06) {
        } else {
            this.A0C.A0J(true);
            setVideoState(EnumC0898Pe.A0A);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public final void ADO(int i) {
        this.A0A.A0A().A38(i);
        this.A0E = EnumC0898Pe.A04;
        PR pr = this.A0C;
        if (pr != null) {
            pr.A0C();
            this.A0C.A0A();
            this.A0C = null;
        }
        setVideoState(EnumC0898Pe.A04);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public final void destroy() {
        A06();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public int getCurrentPosition() {
        PR pr = this.A0C;
        if (pr != null) {
            return (int) pr.A07();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public int getDuration() {
        PR pr = this.A0C;
        if (pr == null) {
            return 0;
        }
        return (int) pr.A08();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public long getInitialBufferTime() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public EnumC0886Os getStartReason() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public EnumC0898Pe getState() {
        return this.A0D;
    }

    public EnumC0898Pe getTargetState() {
        return this.A0E;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public int getVideoHeight() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public int getVideoWidth() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public float getVolume() {
        return this.A00;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = this.A07;
        if (surface != null) {
            surface.release();
        }
        this.A07 = new Surface(surfaceTexture);
        PR pr = this.A0C;
        if (pr == null) {
            return;
        }
        pr.A0G(this.A07);
        if (this.A0D == EnumC0898Pe.A05 && !this.A0L) {
            ADI(this.A0B, 7);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Surface surface = this.A07;
        if (surface != null) {
            surface.release();
            this.A07 = null;
            PR pr = this.A0C;
            if (pr != null) {
                pr.A0G(null);
            }
        }
        if (this.A0D != EnumC0898Pe.A05) {
            if (A0O[5].length() != 21) {
                throw new RuntimeException();
            }
            String[] strArr = A0O;
            strArr[5] = "TScQzo9LVHiM3saFvXTgi";
            strArr[5] = "TScQzo9LVHiM3saFvXTgi";
            ABX(false, 5);
            return true;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.A0C == null) {
            return;
        }
        MediaController mediaController = this.A09;
        if (mediaController != null && mediaController.isShowing()) {
            return;
        }
        if (!z) {
            if (this.A0D != EnumC0898Pe.A05) {
                A7E();
            }
        } else if (this.A0D != EnumC0898Pe.A05 || this.A0L) {
        } else {
            ADI(this.A0B, 9);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public final void seekTo(int i) {
        if (this.A0C != null) {
            this.A01 = getCurrentPosition();
            this.A0C.A0E(i);
            return;
        }
        long j = i;
        String[] strArr = A0O;
        if (strArr[2].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0O;
        strArr2[5] = "kfjJwAtkK1UY2s6fcoM3d";
        strArr2[5] = "kfjJwAtkK1UY2s6fcoM3d";
        this.A05 = j;
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        boolean isDebugBuild = AdInternalSettings.isDebugBuild();
        if (A0O[5].length() != 21) {
            throw new RuntimeException();
        }
        String[] strArr = A0O;
        strArr[1] = "HF5JdwiOlRNKOfaOH";
        strArr[1] = "HF5JdwiOlRNKOfaOH";
        if (!isDebugBuild) {
            return;
        }
        Log.w(A0P, A03(0, 102, 85));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public void setBackgroundPlaybackEnabled(boolean z) {
        this.A0H = z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public void setControlsAnchorView(View view) {
        this.A08 = view;
        view.setOnTouchListener(new PY(this));
    }

    @Override // android.view.TextureView, android.view.View
    public void setForeground(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setForeground(drawable);
        } else if (!AdInternalSettings.isDebugBuild()) {
        } else {
            String str = A0P;
            String[] strArr = A0O;
            if (strArr[3].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0O;
            strArr2[4] = "adR4uJi1AjYNmamYU7fKdN8LPQzpuqJY";
            strArr2[6] = "LCKmfGi2Ka9VnYBnqFwdGZK0MZJmec2m";
            Log.w(str, A03(102, 94, 79));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public void setFullScreen(boolean z) {
        this.A0J = z;
        if (z && !this.A0I) {
            setOnTouchListener(new PX(this));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public void setRequestedVolume(float f) {
        this.A00 = f;
        if (this.A0C != null && this.A0D != EnumC0898Pe.A08 && this.A0D != EnumC0898Pe.A04) {
            this.A0C.A0D(f);
        }
    }

    public void setTestMode(boolean z) {
        this.A0K = z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public void setVideoMPD(@Nullable String str) {
        this.A0G = str;
    }

    private void setVideoState(EnumC0898Pe enumC0898Pe) {
        if (enumC0898Pe != this.A0D) {
            if (BuildConfigApi.isDebug()) {
                String str = A03(196, 23, 51) + enumC0898Pe;
            }
            this.A0D = enumC0898Pe;
            if (this.A0D == EnumC0898Pe.A0A) {
                this.A0M = true;
            }
            InterfaceC0899Pf interfaceC0899Pf = this.A0F;
            if (interfaceC0899Pf != null) {
                interfaceC0899Pf.ABN(enumC0898Pe);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public void setVideoStateChangeListener(InterfaceC0899Pf interfaceC0899Pf) {
        this.A0F = interfaceC0899Pf;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public void setup(Uri uri) {
        this.A0A.A0A().A2y();
        if (this.A0C != null) {
            A06();
        }
        this.A06 = uri;
        setSurfaceTextureListener(this);
        A04();
    }
}