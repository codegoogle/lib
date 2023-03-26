package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
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
import com.p7700g.p99005.aa;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import java.io.IOException;
import java.util.Arrays;
import org.xbill.DNS.Flags;

@TargetApi(14)
/* loaded from: assets/audience_network.dex */
public final class GB extends TextureView implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, MediaPlayer.OnSeekCompleteListener, TextureView.SurfaceTextureListener, InterfaceC0896Pc {
    public static byte[] A0N;
    public static String[] A0O;
    public static final String A0P;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    @Nullable
    public MediaPlayer A06;
    public Uri A07;
    public Surface A08;
    public View A09;
    @Nullable
    public MediaController A0A;
    public EnumC0886Os A0B;
    public EnumC0898Pe A0C;
    public EnumC0898Pe A0D;
    public InterfaceC0899Pf A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final long A0K;
    public final MediaController.MediaPlayerControl A0L;
    public final C1080Wh A0M;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0N, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 114);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0N = new byte[]{89, 87, 91, 89, 30, 3, 15, 9, 26, 89, 91, 65, 91, 89, 57, 102, 105, 75, 68, 68, 69, 94, 10, 90, 88, 79, 90, 75, 88, 79, 10, 71, 79, 78, 67, 75, 10, 90, 70, 75, 83, 79, 88, 10, 93, 67, 94, 66, 10, 121, 95, 88, 76, 75, 73, 79, 126, 79, 82, 94, 95, 88, 79, 16, 10, 45, 1, 27, 2, 10, 0, 73, 26, 78, 28, Flags.CD, 26, 28, 7, Flags.CD, 24, Flags.CD, 78, 24, 7, 10, Flags.CD, 1, 78, 7, 0, 8, 1, 28, 3, 15, 26, 7, 1, 0, 93, 122, 114, 119, 126, g15.c, 59, 111, 116, 59, 116, 107, 126, 117, 59, 122, 104, 104, 126, 111, 104, 59, 15, 39, 39, 47, 36, 45, 104, 41, 36, ax5.a, 41, 49, 59, 104, 60, 32, 58, 39, ax5.a, 104, 41, 38, 104, 45, 48, 43, 45, 56, 60, 33, 39, 38, 104, ax5.a, 33, 60, 32, 104, 59, 45, 60, 10, 41, 43, 35, 47, 58, 39, 61, 38, 44, 12, 58, 41, ax5.a, 41, bx.W5, 36, 45, 104, 39, 38, 104, 6, 39, 61, 47, 41, 60, 104, 41, bx.W5, 39, 62, 45, 102, 104, 59, 39, 104, ax5.a, 45, 104, 59, 33, 36, 45, 38, 60, 36, 49, 104, 33, 47, 38, 39, 58, 45, 104, 33, 60, 102, 50, 26, 26, 18, 25, 16, 85, 20, 25, 2, 20, 12, 6, 85, 1, 29, 7, 26, 2, 85, 20, 27, 85, 16, 13, 22, 16, 5, 1, 28, 26, 27, 85, 2, 28, 1, 29, 85, 6, 16, 1, 51, 26, 7, 16, 18, 7, 26, 0, 27, 17, 85, 26, 27, 85, 59, 26, 0, 18, 20, 1, 85, 20, 23, 26, 3, 16, 91, 85, 6, 26, 85, 2, 16, 85, 6, 28, 25, 16, 27, 1, 25, 12, 85, 28, 18, 27, 26, 7, 16, 85, 28, 1, 91, 31, 54, 37, 51, 32, 54, 37, 50, 119, 54, 52, 52, 50, 59, 50, 37, 54, 35, 62, 56, 57, 119, 34, 57, 54, 33, 54, 62, 59, 54, 53, 59, 50, 22, 45, 34, 33, 47, 38, 99, 55, 44, 99, 32, 47, 44, 48, 38, 53, 10, 7, 6, 12, 67, 16, 23, 2, 23, 6, 67, 0, Flags.CD, 2, 13, 4, 6, 7, 67, 23, 12, 67, 97, 115, 115, 101, 116, 83, 79, 66, 90, 70, 81, 115, 108, 97, 96, 106, 94, 7, 82, 77, 68, 81, 7, 5, 31, 5, 7};
    }

    public static void A05() {
        A0O = new String[]{"w6W1Pn4pGSy1veXw7fNic4Q20vJelJ2", "acNB2lhq8cVPZLtYghlcj8euurSBcqdx", "I2BPPFoGG3lXsTKKPy2FKKasdsM", "uMMu8699SI696vicAGdUyhB1Kjcnsg5D", "S7aPtd9QGtmzyQ9VrNW20IwmaDF5p1Ml", "zS648UlhjTBJXulz7NmFsyAIwaw2iCpI", "ZyXsHo9oibpczWLkt42IpHWLTZevRgPI", "euMEykkwaXnS"};
    }

    static {
        A05();
        A04();
        A0P = GB.class.getSimpleName();
    }

    public GB(C1080Wh c1080Wh) {
        super(c1080Wh);
        this.A0C = EnumC0898Pe.A04;
        this.A0D = EnumC0898Pe.A04;
        this.A0I = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0H = false;
        this.A01 = 3;
        this.A0F = false;
        this.A0J = false;
        this.A02 = 0;
        this.A0G = false;
        this.A0B = EnumC0886Os.A04;
        this.A0L = new PZ(this);
        this.A0M = c1080Wh;
    }

    public GB(C1080Wh c1080Wh, AttributeSet attributeSet) {
        super(c1080Wh, attributeSet);
        this.A0C = EnumC0898Pe.A04;
        this.A0D = EnumC0898Pe.A04;
        this.A0I = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0H = false;
        this.A01 = 3;
        this.A0F = false;
        this.A0J = false;
        this.A02 = 0;
        this.A0G = false;
        this.A0B = EnumC0886Os.A04;
        this.A0L = new PZ(this);
        this.A0M = c1080Wh;
    }

    public GB(C1080Wh c1080Wh, AttributeSet attributeSet, int i) {
        super(c1080Wh, attributeSet, i);
        this.A0C = EnumC0898Pe.A04;
        this.A0D = EnumC0898Pe.A04;
        this.A0I = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0H = false;
        this.A01 = 3;
        this.A0F = false;
        this.A0J = false;
        this.A02 = 0;
        this.A0G = false;
        this.A0B = EnumC0886Os.A04;
        this.A0L = new PZ(this);
        this.A0M = c1080Wh;
    }

    private boolean A06() {
        return (this.A0C == EnumC0898Pe.A08 || this.A0C == EnumC0898Pe.A07) ? false : true;
    }

    private boolean A07() {
        return this.A0C == EnumC0898Pe.A07 || this.A0C == EnumC0898Pe.A0A || this.A0C == EnumC0898Pe.A05 || this.A0C == EnumC0898Pe.A06;
    }

    private boolean A08() {
        return (this.A0C == EnumC0898Pe.A08 || this.A0C == EnumC0898Pe.A07) ? false : true;
    }

    private boolean A09() {
        MediaPlayer mediaPlayer = this.A06;
        if (mediaPlayer == null) {
            return false;
        }
        try {
            mediaPlayer.reset();
            return true;
        } catch (IllegalStateException e) {
            this.A0M.A04().A82(A03(394, 6, 81), C04848i.A1t, new C04858j(e));
            return false;
        }
    }

    private boolean A0A(@Nullable Surface surface) {
        MediaPlayer mediaPlayer = this.A06;
        if (mediaPlayer == null) {
            return false;
        }
        try {
            mediaPlayer.setSurface(surface);
            return true;
        } catch (IllegalStateException e) {
            this.A0M.A04().A82(A03(394, 6, 81), C04848i.A1u, new C04858j(e));
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public final void A7E() {
        if (!this.A0F) {
            ABX(false, 3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    @SuppressLint({"NewApi"})
    public final boolean A7L() {
        if (this.A06 == null || Build.VERSION.SDK_INT < 16) {
            return false;
        }
        try {
            for (MediaPlayer.TrackInfo trackInfo : this.A06.getTrackInfo()) {
                int trackType = trackInfo.getTrackType();
                String[] strArr = A0O;
                if (strArr[3].charAt(29) != strArr[6].charAt(29)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0O;
                strArr2[5] = "iSqF26gJBktCMb0RObgKl91oEThpz7Z0";
                strArr2[5] = "iSqF26gJBktCMb0RObgKl91oEThpz7Z0";
                if (trackType == 2) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException e) {
            Log.e(A0P, A03(65, 35, 28), e);
            return true;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public final boolean A7M() {
        return this.A0J;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public final boolean A7h() {
        return this.A0I;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public final void ABX(boolean z, int i) {
        this.A0M.A0A().A2v(i);
        this.A0D = EnumC0898Pe.A05;
        if (this.A06 != null) {
            if (!A06()) {
                return;
            }
            this.A0I = z;
            this.A06.pause();
            if (this.A0C != EnumC0898Pe.A06) {
                setVideoState(EnumC0898Pe.A05);
                return;
            }
            return;
        }
        setVideoState(EnumC0898Pe.A04);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public final void ADE(int i) {
        this.A0M.A0A().A8Z(i);
        setVideoState(EnumC0898Pe.A09);
        ADO(5);
        this.A03 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
        if (r5.A0C != com.facebook.ads.redexgen.X.EnumC0898Pe.A06) goto L13;
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ADI(EnumC0886Os enumC0886Os, int i) {
        this.A0M.A0A().A36(i);
        this.A0I = false;
        this.A0D = EnumC0898Pe.A0A;
        this.A0B = enumC0886Os;
        if (this.A0C != EnumC0898Pe.A0A && this.A0C != EnumC0898Pe.A07) {
            EnumC0898Pe enumC0898Pe = this.A0C;
            if (A0O[7].length() == 4) {
                throw new RuntimeException();
            }
            String[] strArr = A0O;
            strArr[4] = "NTKGPTGyq7PSuZ6pDxSrkOD3BAS3oRMw";
            strArr[4] = "NTKGPTGyq7PSuZ6pDxSrkOD3BAS3oRMw";
            if (enumC0898Pe != EnumC0898Pe.A04) {
                if (this.A0C != EnumC0898Pe.A05) {
                }
            }
        }
        MediaPlayer mediaPlayer = this.A06;
        if (mediaPlayer == null) {
            setup(this.A07);
        } else {
            int i2 = this.A03;
            if (i2 > 0) {
                mediaPlayer.seekTo(i2);
            }
            this.A06.start();
            if (this.A0C != EnumC0898Pe.A07 || this.A0J) {
                setVideoState(EnumC0898Pe.A0A);
            }
        }
        if (isAvailable()) {
            SurfaceTexture surfaceTexture = getSurfaceTexture();
            if (A0O[1].charAt(7) != 'q') {
                String[] strArr2 = A0O;
                strArr2[4] = "Wn6W9Nu3dNfA4pP49CdphRQGwehyl3Rd";
                strArr2[4] = "Wn6W9Nu3dNfA4pP49CdphRQGwehyl3Rd";
                onSurfaceTextureAvailable(surfaceTexture, 0, 0);
                return;
            }
            String[] strArr3 = A0O;
            strArr3[7] = "pXleF17jKjib";
            strArr3[7] = "pXleF17jKjib";
            onSurfaceTextureAvailable(surfaceTexture, 0, 0);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public final void ADO(int i) {
        this.A0M.A0A().A38(i);
        this.A0D = EnumC0898Pe.A04;
        MediaPlayer mediaPlayer = this.A06;
        if (mediaPlayer != null) {
            int currentPosition = mediaPlayer.getCurrentPosition();
            if (currentPosition > 0) {
                this.A03 = currentPosition;
            }
            this.A06.stop();
            if (A0O[4].charAt(14) == '3') {
                throw new RuntimeException();
            }
            String[] strArr = A0O;
            strArr[5] = "KulxFUFqA4xnUTvaQLfyg7cstmOjzycv";
            strArr[5] = "KulxFUFqA4xnUTvaQLfyg7cstmOjzycv";
            A09();
            this.A06.release();
            this.A06 = null;
            MediaController mediaController = this.A0A;
            if (mediaController != null) {
                mediaController.hide();
                this.A0A.setEnabled(false);
            }
        }
        setVideoState(EnumC0898Pe.A04);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public final void destroy() {
        if (this.A06 != null) {
            A0A(null);
            this.A06.setOnBufferingUpdateListener(null);
            this.A06.setOnCompletionListener(null);
            this.A06.setOnErrorListener(null);
            this.A06.setOnInfoListener(null);
            this.A06.setOnPreparedListener(null);
            this.A06.setOnVideoSizeChangedListener(null);
            this.A06.setOnSeekCompleteListener(null);
            A09();
            this.A06 = null;
            setVideoState(EnumC0898Pe.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public int getCurrentPosition() {
        if (this.A06 == null || !A07()) {
            return 0;
        }
        return this.A06.getCurrentPosition();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public int getDuration() {
        if (this.A06 != null) {
            boolean A07 = A07();
            String[] strArr = A0O;
            if (strArr[3].charAt(29) != strArr[6].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0O;
            strArr2[1] = "tqb6wmVqQGZxPylUtz2fkCIx7Bf2WilJ";
            strArr2[1] = "tqb6wmVqQGZxPylUtz2fkCIx7Bf2WilJ";
            if (!A07) {
                return 0;
            }
            return this.A06.getDuration();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public long getInitialBufferTime() {
        return this.A0K;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public EnumC0886Os getStartReason() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public EnumC0898Pe getState() {
        return this.A0C;
    }

    public EnumC0898Pe getTargetState() {
        return this.A0D;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public int getVideoHeight() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public int getVideoWidth() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public float getVolume() {
        return this.A00;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isHardwareAccelerated()) {
            setVideoState(EnumC0898Pe.A03);
            this.A0M.A0A().A2z(5);
            ADO(8);
            this.A0M.A04().A82(A03(400, 5, 119), C04848i.A2B, new C04858j(A03(aa.a.s, 33, 37)));
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        MediaPlayer mediaPlayer2 = this.A06;
        if (mediaPlayer2 != null) {
            mediaPlayer2.pause();
        }
        setVideoState(EnumC0898Pe.A06);
        seekTo(0);
        this.A03 = 0;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        this.A0M.A0A().A8Y(A03(405, 11, 87) + i + A03(0, 14, 9) + i2 + A03(14, 2, 105));
        if (this.A01 > 0 && getState() == EnumC0898Pe.A0A) {
            this.A01--;
            ADO(6);
            ADI(this.A0B, 10);
        } else {
            setVideoState(EnumC0898Pe.A03);
            this.A0M.A0A().A2z(1);
            ADO(7);
        }
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i == 3) {
            this.A0J = true;
            if (this.A0D == EnumC0898Pe.A0A) {
                setVideoState(EnumC0898Pe.A0A);
            }
            return true;
        }
        if (i != 701) {
            if (i == 702 && A08()) {
                setVideoState(EnumC0898Pe.A0A);
            }
        } else {
            EnumC0898Pe enumC0898Pe = EnumC0898Pe.A02;
            if (A0O[4].charAt(14) != '3') {
                String[] strArr = A0O;
                strArr[3] = "iL0L5EQxu2M5tvy2sZDjl5tOkB9wsg4Q";
                strArr[6] = "qEr4cYtmjtQdjlZthk5xBRgssZbq5gW6";
                setVideoState(enumC0898Pe);
            } else {
                setVideoState(enumC0898Pe);
            }
        }
        String[] strArr2 = A0O;
        if (strArr2[3].charAt(29) != strArr2[6].charAt(29)) {
            throw new RuntimeException();
        }
        String[] strArr3 = A0O;
        strArr3[3] = "BctcOQJYgBcKf8RdBMRoW9O8jkER1gO3";
        strArr3[6] = "NFF5b4NOHp1wMQpQtAU8ibXMpYWuxgZg";
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        setVideoState(EnumC0898Pe.A07);
        if (this.A0H && !this.A0G) {
            Activity A09 = this.A0M.A09();
            if (A09 != null) {
                this.A0A = new MediaController(A09);
                MediaController mediaController = this.A0A;
                View view = this.A09;
                if (view == null) {
                    view = this;
                }
                mediaController.setAnchorView(view);
                MediaController mediaController2 = this.A0A;
                MediaController.MediaPlayerControl mediaPlayerControl = this.A0L;
                if (A0O[1].charAt(7) != 'q') {
                    throw new RuntimeException();
                }
                String[] strArr = A0O;
                strArr[3] = "fPjFRSSzuUrY85KdwEQXHAUI7gq3zgJX";
                strArr[6] = "QlnNj2Zi0n3XZkktRetea07zoE6PUgNL";
                mediaController2.setMediaPlayer(mediaPlayerControl);
                this.A0A.setEnabled(true);
            } else {
                this.A0A = null;
            }
        }
        setRequestedVolume(this.A00);
        this.A05 = mediaPlayer.getVideoWidth();
        this.A04 = mediaPlayer.getVideoHeight();
        int i = this.A03;
        if (i > 0) {
            if (i >= this.A06.getDuration()) {
                this.A03 = 0;
            }
            this.A06.seekTo(this.A03);
            this.A03 = 0;
        }
        EnumC0898Pe enumC0898Pe = this.A0D;
        EnumC0898Pe enumC0898Pe2 = EnumC0898Pe.A0A;
        String[] strArr2 = A0O;
        if (strArr2[2].length() == strArr2[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr3 = A0O;
        strArr3[3] = "i4HMjCzdRtS7Zf5jyUfqsJgJBFC3Hgk3";
        strArr3[6] = "nPyigXhxANl12gOwrMulZJ84NGYQcgH1";
        if (enumC0898Pe == enumC0898Pe2) {
            ADI(this.A0B, 8);
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        InterfaceC0899Pf interfaceC0899Pf = this.A0E;
        if (interfaceC0899Pf == null) {
            return;
        }
        interfaceC0899Pf.AAt(this.A02, this.A03);
        this.A03 = 0;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.A08 == null) {
            this.A08 = new Surface(surfaceTexture);
        }
        if (!A0A(this.A08)) {
            setVideoState(EnumC0898Pe.A03);
            this.A0M.A0A().A2z(4);
            destroy();
        } else if (this.A0C == EnumC0898Pe.A05 && !this.A0I) {
            ADI(this.A0B, 7);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        A0A(null);
        Surface surface = this.A08;
        if (surface != null) {
            surface.release();
            this.A08 = null;
        }
        if (this.A0C != EnumC0898Pe.A05) {
            ABX(false, 5);
        }
        if (A0O[1].charAt(7) != 'q') {
            throw new RuntimeException();
        }
        String[] strArr = A0O;
        strArr[5] = "wJEag4Up5dB02EoPbWjrYUJlPYnnpJPt";
        strArr[5] = "wJEag4Up5dB02EoPbWjrYUJlPYnnpJPt";
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        this.A05 = mediaPlayer.getVideoWidth();
        this.A04 = mediaPlayer.getVideoHeight();
        if (this.A05 != 0 && this.A04 != 0) {
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.A06 == null) {
            return;
        }
        MediaController mediaController = this.A0A;
        if (mediaController != null && mediaController.isShowing()) {
            return;
        }
        if (!z) {
            if (this.A0C != EnumC0898Pe.A05) {
                A7E();
            }
        } else if (this.A0C != EnumC0898Pe.A05 || this.A0I) {
        } else {
            ADI(this.A0B, 9);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public final void seekTo(int i) {
        if (this.A06 != null && A07()) {
            if (i < getDuration() && i > 0) {
                this.A02 = getCurrentPosition();
                this.A03 = i;
                this.A06.seekTo(i);
                return;
            }
            return;
        }
        this.A03 = i;
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setBackgroundDrawable(drawable);
        } else if (!AdInternalSettings.isDebugBuild()) {
        } else {
            Log.w(A0P, A03(122, 102, 58));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public void setBackgroundPlaybackEnabled(boolean z) {
        this.A0F = z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public void setControlsAnchorView(View view) {
        this.A09 = view;
        view.setOnTouchListener(new View$OnTouchListenerC0895Pb(this));
    }

    @Override // android.view.TextureView, android.view.View
    public void setForeground(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setForeground(drawable);
        } else if (!AdInternalSettings.isDebugBuild()) {
        } else {
            Log.w(A0P, A03(224, 94, 7));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public void setFullScreen(boolean z) {
        this.A0H = z;
        if (this.A0H && !this.A0G) {
            setOnTouchListener(new View$OnTouchListenerC0894Pa(this));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public void setRequestedVolume(float f) {
        this.A00 = f;
        if (this.A06 != null && this.A0C != EnumC0898Pe.A08 && this.A0C != EnumC0898Pe.A04) {
            this.A06.setVolume(f, f);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public void setVideoMPD(@Nullable String str) {
    }

    private void setVideoState(EnumC0898Pe enumC0898Pe) {
        if (enumC0898Pe != this.A0C) {
            if (BuildConfigApi.isDebug()) {
                String str = A03(366, 23, 17) + enumC0898Pe;
            }
            this.A0C = enumC0898Pe;
            InterfaceC0899Pf interfaceC0899Pf = this.A0E;
            if (interfaceC0899Pf != null) {
                interfaceC0899Pf.ABN(enumC0898Pe);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    public void setVideoStateChangeListener(InterfaceC0899Pf interfaceC0899Pf) {
        this.A0E = interfaceC0899Pf;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0896Pc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setup(Uri uri) {
        MediaPlayer mediaPlayer;
        String[] strArr;
        String A03 = A03(351, 15, 49);
        this.A0M.A0A().A2y();
        this.A0J = false;
        this.A07 = uri;
        if (this.A06 != null) {
            A09();
            A0A(null);
            mediaPlayer = this.A06;
            setVideoState(EnumC0898Pe.A04);
        } else {
            mediaPlayer = new MediaPlayer();
        }
        try {
            if (uri.getScheme().equals(A03(389, 5, 114))) {
                try {
                    try {
                        AssetFileDescriptor openFd = getContext().getAssets().openFd(uri.getPath().substring(1));
                        try {
                            mediaPlayer.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                            try {
                                openFd.close();
                            } catch (IOException e) {
                                String str = A0P;
                                Log.w(str, A03 + e);
                            }
                        } catch (IOException e2) {
                            e = e2;
                            strArr = A0O;
                            if (strArr[3].charAt(29) == strArr[6].charAt(29)) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A0O;
                            strArr2[4] = "vDexTJGknhfX1yfKKY4uPeWNY7BUXXsv";
                            strArr2[4] = "vDexTJGknhfX1yfKKY4uPeWNY7BUXXsv";
                            String str2 = A0P;
                            Log.w(str2, A03(100, 22, 105) + e);
                            setVideoState(EnumC0898Pe.A03);
                            this.A0M.A0A().A2z(2);
                            if (openFd != null) {
                                try {
                                    openFd.close();
                                } catch (IOException e3) {
                                    String str3 = A0P;
                                    Log.w(str3, A03 + e3);
                                }
                            }
                            mediaPlayer.setLooping(false);
                            mediaPlayer.setOnBufferingUpdateListener(this);
                            mediaPlayer.setOnCompletionListener(this);
                            mediaPlayer.setOnErrorListener(this);
                            mediaPlayer.setOnInfoListener(this);
                            mediaPlayer.setOnPreparedListener(this);
                            mediaPlayer.setOnVideoSizeChangedListener(this);
                            mediaPlayer.setOnSeekCompleteListener(this);
                            mediaPlayer.prepareAsync();
                            this.A06 = mediaPlayer;
                            setVideoState(EnumC0898Pe.A08);
                            setSurfaceTextureListener(this);
                            if (!isAvailable()) {
                            }
                        } catch (SecurityException e4) {
                            e = e4;
                            strArr = A0O;
                            if (strArr[3].charAt(29) == strArr[6].charAt(29)) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            String[] strArr3 = A0O;
                            if (strArr3[3].charAt(29) != strArr3[6].charAt(29)) {
                                throw new RuntimeException();
                            }
                            String[] strArr4 = A0O;
                            strArr4[7] = "jmeNgRjQ2jv";
                            strArr4[7] = "jmeNgRjQ2jv";
                            if (openFd != null) {
                                try {
                                    openFd.close();
                                } catch (IOException e5) {
                                    String str4 = A0P;
                                    Log.w(str4, A03 + e5);
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e6) {
                        e = e6;
                    } catch (SecurityException e7) {
                        e = e7;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                mediaPlayer.setDataSource(uri.toString());
            }
            mediaPlayer.setLooping(false);
            mediaPlayer.setOnBufferingUpdateListener(this);
            mediaPlayer.setOnCompletionListener(this);
            mediaPlayer.setOnErrorListener(this);
            mediaPlayer.setOnInfoListener(this);
            mediaPlayer.setOnPreparedListener(this);
            mediaPlayer.setOnVideoSizeChangedListener(this);
            mediaPlayer.setOnSeekCompleteListener(this);
            mediaPlayer.prepareAsync();
            this.A06 = mediaPlayer;
            setVideoState(EnumC0898Pe.A08);
        } catch (Exception e8) {
            setVideoState(EnumC0898Pe.A03);
            this.A0M.A0A().A2z(3);
            mediaPlayer.release();
            String str5 = A0P;
            Log.e(str5, A03(16, 49, 88) + e8);
        }
        setSurfaceTextureListener(this);
        if (!isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }
}