package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.facebook.ads.redexgen.X.Xo  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1113Xo implements BG {
    public static boolean A0p;
    public static boolean A0q;
    public static byte[] A0r;
    public static String[] A0s;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public AudioTrack A0M;
    @Nullable
    public AudioTrack A0N;
    @Nullable
    public AP A0O;
    public AP A0P;
    public C0548Av A0Q;
    @Nullable
    public BE A0R;
    @Nullable
    public ByteBuffer A0S;
    @Nullable
    public ByteBuffer A0T;
    @Nullable
    public ByteBuffer A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public byte[] A0c;
    public B3[] A0d;
    public ByteBuffer[] A0e;
    public final ConditionVariable A0f;
    @Nullable
    public final C0549Aw A0g;
    public final BM A0h;
    public final C1110Xl A0i;
    public final BP A0j;
    public final C1120Xv A0k;
    public final ArrayDeque<BR> A0l;
    public final boolean A0m;
    public final B3[] A0n;
    public final B3[] A0o;

    public static String A0I(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0r, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 75);
        }
        return new String(copyOfRange);
    }

    public static void A0O() {
        A0r = new byte[]{68, 72, 15, 7, 28, 72, 94, 106, 123, 118, 112, 75, 109, 126, 124, 116, 78, 99, 121, 105, 101, 100, 126, 99, 100, g15.c, 99, 126, 115, bx.W5, 110, 111, 126, 111, 105, 126, 111, 110, bx.W5, 81, 111, 114, 122, 111, 105, 126, 111, 110, bx.W5, 14, 22, 9, 4, 9, 1, 8, ax5.a, 41, ax5.a, 46, 46, 51, 52, 61, 122, 41, 46, 59, 54, 54, ax5.a, 62, 122, 59, 47, 62, 51, 53, 122, 46, 40, 59, 57, 49, 102, 93, 86, 75, 67, 86, 80, 71, 86, 87, 19, 82, 70, 87, 90, 92, 19, 86, 93, 80, 92, 87, 90, 93, 84, 9, 19, 96, 91, 70, 64, 69, 69, 90, 71, 65, 80, 81, 21, 86, 93, 84, 91, 91, 80, 89, 21, 86, 90, 64, 91, 65, 15, 21, 101, 10, 3, 31, 24, 9, 30, 59, 40, 58, 40};
    }

    public static void A0P() {
        A0s = new String[]{"5Nyv0guRYVcKSAuezGPcUxg9vJAOBGI4", "vvUbbcGamjazB6O7sNKlV2Due1EGN4h1", "bCdq7Y65nqLa7O1PpyZ9UmfFfim1tIKH", "XSMaSGyqY735xp0uf5mX1ioiT5AfU73", "LbuXdG3g6wlkS0wgubrQcd1EFcxL1vaW", "BfdFnDj7fdcaZnnCNK5XWBslzsEwyMTC", "82TROEAjyC6M053XP3PwF3IgkAnZSWb8", "TH4S9e3rxD8emXavfeipeAwkF3kWLOvQ"};
    }

    static {
        A0P();
        A0O();
        A0p = false;
        A0q = false;
    }

    public C1113Xo(@Nullable C0549Aw c0549Aw, BP bp, boolean z) {
        this.A0g = c0549Aw;
        this.A0j = (BP) I1.A01(bp);
        this.A0m = z;
        this.A0f = new ConditionVariable(true);
        this.A0h = new BM(new C1112Xn(this, null));
        this.A0i = new C1110Xl();
        this.A0k = new C1120Xv();
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C1116Xr(), this.A0i, this.A0k);
        Collections.addAll(arrayList, bp.A5Q());
        this.A0o = (B3[]) arrayList.toArray(new B3[arrayList.size()]);
        this.A0n = new B3[]{new C1114Xp()};
        this.A00 = 1.0f;
        this.A0D = 0;
        this.A0Q = C0548Av.A04;
        this.A01 = 0;
        this.A0P = AP.A04;
        this.A04 = -1;
        this.A0d = new B3[0];
        this.A0e = new ByteBuffer[0];
        this.A0l = new ArrayDeque<>();
    }

    public C1113Xo(@Nullable C0549Aw c0549Aw, B3[] b3Arr) {
        this(c0549Aw, b3Arr, false);
    }

    public C1113Xo(@Nullable C0549Aw c0549Aw, B3[] b3Arr, boolean z) {
        this(c0549Aw, new C1111Xm(b3Arr), z);
    }

    public static int A00(int i, ByteBuffer byteBuffer) {
        if (i == 7 || i == 8) {
            return BT.A00(byteBuffer);
        }
        if (i == 5) {
            return C0545As.A00();
        }
        if (i == 6) {
            return C0545As.A03(byteBuffer);
        }
        if (i == 14) {
            int A02 = C0545As.A02(byteBuffer);
            if (A02 == -1) {
                return 0;
            }
            int A04 = C0545As.A04(byteBuffer, A02);
            String[] strArr = A0s;
            if (strArr[5].charAt(2) != strArr[2].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[3] = "Dqt88CMr8vwwAc3fZIJcRVt2XyhD8Cl";
            strArr2[3] = "Dqt88CMr8vwwAc3fZIJcRVt2XyhD8Cl";
            return A04 * 16;
        }
        throw new IllegalStateException(A0I(84, 27, 120) + i);
    }

    @TargetApi(21)
    public static int A01(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    @TargetApi(21)
    private int A02(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (this.A0S == null) {
            this.A0S = ByteBuffer.allocate(16);
            this.A0S.order(ByteOrder.BIG_ENDIAN);
            this.A0S.putInt(1431633921);
        }
        if (this.A03 == 0) {
            this.A0S.putInt(4, i);
            this.A0S.putLong(8, 1000 * j);
            this.A0S.position(0);
            this.A03 = i;
        }
        int remaining = this.A0S.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.A0S, remaining, 1);
            if (write < 0) {
                this.A03 = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int A01 = A01(audioTrack, byteBuffer, i);
        String[] strArr = A0s;
        if (strArr[4].charAt(9) != strArr[1].charAt(9)) {
            String[] strArr2 = A0s;
            strArr2[5] = "EGdI4VK4aN1uiBzzsuaeFo7lQ03tB7Gh";
            strArr2[2] = "vodoofn0TiYpLi76FRuwTlDh379TFVaK";
            if (A01 < 0) {
                this.A03 = 0;
                return A01;
            }
            this.A03 -= A01;
            return A01;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A03() {
        return this.A0X ? this.A0J / this.A0B : this.A0I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A04() {
        return this.A0X ? this.A0L / this.A09 : this.A0K;
    }

    private long A05(long j) {
        return A08(this.A0j.A6z()) + j;
    }

    private long A06(long j) {
        BR br = null;
        while (!this.A0l.isEmpty() && j >= BR.A00(this.A0l.getFirst())) {
            br = this.A0l.remove();
        }
        if (br != null) {
            this.A0P = BR.A02(br);
            this.A0G = BR.A00(br);
            this.A0F = BR.A01(br) - this.A0H;
        }
        if (this.A0P.A01 == 1.0f) {
            return (this.A0F + j) - this.A0G;
        }
        if (this.A0l.isEmpty()) {
            return this.A0F + this.A0j.A6X(j - this.A0G);
        }
        return this.A0F + C0726Ig.A0C(j - this.A0G, this.A0P.A01);
    }

    private long A07(long j) {
        return (this.A0A * j) / 1000000;
    }

    private long A08(long j) {
        return (1000000 * j) / this.A0A;
    }

    private long A09(long j) {
        return (1000000 * j) / this.A06;
    }

    @TargetApi(21)
    private AudioTrack A0D() {
        AudioAttributes A00;
        if (this.A0b) {
            A00 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        } else {
            A00 = this.A0Q.A00();
        }
        AudioFormat build = new AudioFormat.Builder().setChannelMask(this.A07).setEncoding(this.A08).setSampleRate(this.A0A).build();
        int i = this.A01;
        if (i == 0) {
            i = 0;
        }
        return new AudioTrack(A00, build, this.A02, 1, i);
    }

    private AudioTrack A0E() throws BD {
        AudioTrack audioTrack;
        if (C0726Ig.A02 >= 21) {
            audioTrack = A0D();
        } else {
            int A03 = C0726Ig.A03(this.A0Q.A03);
            int i = this.A01;
            String[] strArr = A0s;
            String str = strArr[4];
            String str2 = strArr[1];
            int state = str.charAt(9);
            if (state == str2.charAt(9)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[4] = "uEqtixTroQ47jvhgXsjygxp317gkhCVZ";
            strArr2[1] = "MeWTB72qJhBmjPGmSmxXQDSK14yx53vJ";
            if (i == 0) {
                audioTrack = new AudioTrack(A03, this.A0A, this.A07, this.A08, this.A02, 1);
            } else {
                audioTrack = new AudioTrack(A03, this.A0A, this.A07, this.A08, this.A02, 1, i);
            }
        }
        int state2 = audioTrack.getState();
        if (state2 == 1) {
            return audioTrack;
        }
        try {
            audioTrack.release();
        } catch (Exception unused) {
        }
        throw new BD(state2, this.A0A, this.A07, this.A02);
    }

    private AudioTrack A0F(int i) {
        return new AudioTrack(3, 4000, 4, 2, 2, 0, i);
    }

    private void A0J() {
        int i = 0;
        while (true) {
            B3[] b3Arr = this.A0d;
            if (i < b3Arr.length) {
                B3 b3 = b3Arr[i];
                b3.flush();
                this.A0e[i] = b3.A6a();
                i++;
            } else {
                return;
            }
        }
    }

    private void A0K() throws BD {
        AP ap;
        this.A0f.block();
        this.A0M = A0E();
        int audioSessionId = this.A0M.getAudioSessionId();
        if (A0p && C0726Ig.A02 < 21) {
            AudioTrack audioTrack = this.A0N;
            if (audioTrack != null) {
                int audioSessionId2 = audioTrack.getAudioSessionId();
                String[] strArr = A0s;
                if (strArr[4].charAt(9) == strArr[1].charAt(9)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0s;
                strArr2[7] = "BXErtyYgJXamt9yde7CeLqS26Q9j6Dt3";
                strArr2[7] = "BXErtyYgJXamt9yde7CeLqS26Q9j6Dt3";
                if (audioSessionId != audioSessionId2) {
                    A0L();
                }
            }
            if (this.A0N == null) {
                this.A0N = A0F(audioSessionId);
            }
        }
        if (this.A01 != audioSessionId) {
            this.A01 = audioSessionId;
            BE be = this.A0R;
            if (be != null) {
                be.A8y(audioSessionId);
            }
        }
        if (this.A0V) {
            ap = this.A0j.A3R(this.A0P);
        } else {
            ap = AP.A04;
        }
        this.A0P = ap;
        A0N();
        this.A0h.A0H(this.A0M, this.A08, this.A09, this.A02);
        A0M();
    }

    private void A0L() {
        if (this.A0N == null) {
            return;
        }
        AudioTrack audioTrack = this.A0N;
        this.A0N = null;
        new BO(this, audioTrack).start();
    }

    private void A0M() {
        if (!A0V()) {
            return;
        }
        if (C0726Ig.A02 >= 21) {
            AudioTrack audioTrack = this.A0M;
            float f = this.A00;
            if (A0s[3].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0s;
            strArr[7] = "8NL9PZoDB9Ch1WQJQaXfXaVAIVHPoweZ";
            strArr[7] = "8NL9PZoDB9Ch1WQJQaXfXaVAIVHPoweZ";
            A0R(audioTrack, f);
            return;
        }
        A0S(this.A0M, this.A00);
    }

    private void A0N() {
        B3[] A0W;
        ArrayList arrayList = new ArrayList();
        for (B3 b3 : A0W()) {
            if (b3.A7V()) {
                arrayList.add(b3);
            } else {
                b3.flush();
            }
        }
        int size = arrayList.size();
        B3[] b3Arr = new B3[size];
        if (A0s[3].length() != 31) {
            throw new RuntimeException();
        }
        String[] strArr = A0s;
        strArr[5] = "YRdEguSYP1wOqJMzR8T0sEbN9ru3F1GF";
        strArr[2] = "jCd7Ib2fALhdhS4xedSLoMHgXMVbMQ2Z";
        this.A0d = (B3[]) arrayList.toArray(b3Arr);
        this.A0e = new ByteBuffer[size];
        A0J();
    }

    private void A0Q(long j) throws BF {
        ByteBuffer input;
        int length = this.A0d.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                input = this.A0e[i - 1];
            } else {
                input = this.A0T;
                if (input == null) {
                    input = B3.A00;
                }
            }
            if (i == length) {
                A0T(input, j);
            } else {
                B3 audioProcessor = this.A0d[i];
                audioProcessor.ABv(input);
                ByteBuffer A6a = audioProcessor.A6a();
                this.A0e[i] = A6a;
                if (A6a.hasRemaining()) {
                    i++;
                }
            }
            if (input.hasRemaining()) {
                return;
            }
            i--;
        }
    }

    @TargetApi(21)
    public static void A0R(AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    public static void A0S(AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c4, code lost:
        if (r0 < r2) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0T(ByteBuffer byteBuffer, long j) throws BF {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        ByteBuffer byteBuffer2 = this.A0U;
        if (byteBuffer2 != null) {
            I1.A03(byteBuffer2 == byteBuffer);
        } else {
            this.A0U = byteBuffer;
            int bytesWritten = C0726Ig.A02;
            if (bytesWritten < 21) {
                int remaining = byteBuffer.remaining();
                byte[] bArr = this.A0c;
                if (bArr != null) {
                    int bytesWritten2 = bArr.length;
                }
                this.A0c = new byte[remaining];
                int position = byteBuffer.position();
                byteBuffer.get(this.A0c, 0, remaining);
                byteBuffer.position(position);
                this.A0C = 0;
            }
        }
        int remaining2 = byteBuffer.remaining();
        int i = 0;
        int bytesWritten3 = C0726Ig.A02;
        if (bytesWritten3 < 21) {
            int bytesWritten4 = this.A0h.A0C(this.A0L);
            if (bytesWritten4 > 0) {
                int min = Math.min(remaining2, bytesWritten4);
                AudioTrack audioTrack = this.A0M;
                byte[] bArr2 = this.A0c;
                int bytesWritten5 = this.A0C;
                i = audioTrack.write(bArr2, bytesWritten5, min);
                if (i > 0) {
                    int bytesWritten6 = this.A0C;
                    this.A0C = bytesWritten6 + i;
                    int bytesWritten7 = byteBuffer.position();
                    byteBuffer.position(bytesWritten7 + i);
                }
            }
        } else if (!this.A0b) {
            i = A01(this.A0M, byteBuffer, remaining2);
        } else {
            int bytesWritten8 = (j > (-9223372036854775807L) ? 1 : (j == (-9223372036854775807L) ? 0 : -1));
            I1.A04(bytesWritten8 != 0);
            String[] strArr = A0s;
            String str = strArr[6];
            String str2 = strArr[0];
            int charAt = str.charAt(18);
            int bytesWritten9 = str2.charAt(18);
            if (charAt != bytesWritten9) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[6] = "uc8dsziOyfZDdpAIC1PVCulQ3xFiNwSU";
            strArr2[0] = "f1kQp84DxGThwffoyoPMW5CjH544FPQd";
            i = A02(this.A0M, byteBuffer, remaining2, j);
        }
        this.A0E = SystemClock.elapsedRealtime();
        if (i >= 0) {
            if (this.A0X) {
                this.A0L += i;
            }
            if (i == remaining2) {
                if (!this.A0X) {
                    long j2 = this.A0K;
                    int bytesWritten10 = this.A05;
                    this.A0K = j2 + bytesWritten10;
                }
                this.A0U = null;
                return;
            }
            return;
        }
        throw new BF(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
        if (r5 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
        A0T(r5, -9223372036854775807L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
        if (r9.A0U == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
        if (r5 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
        r9.A04 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A0U() throws BF {
        boolean z = false;
        if (this.A04 == -1) {
            this.A04 = this.A0Z ? 0 : this.A0d.length;
            z = true;
        }
        while (true) {
            int i = this.A04;
            B3[] b3Arr = this.A0d;
            if (i < b3Arr.length) {
                B3 b3 = b3Arr[i];
                if (z) {
                    b3.ABu();
                }
                A0Q(-9223372036854775807L);
                boolean A7Z = b3.A7Z();
                String[] strArr = A0s;
                if (strArr[4].charAt(9) == strArr[1].charAt(9)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0s;
                strArr2[4] = "2xZTToEoCwsl8MeSQ9EIUdCBiuq4j6Lb";
                strArr2[1] = "WXli42TSAlQlgSv7suJf6xw7W0hHNYE8";
                if (!A7Z) {
                    return false;
                }
                z = true;
                this.A04++;
            } else {
                ByteBuffer byteBuffer = this.A0U;
                if (A0s[3].length() == 31) {
                    String[] strArr3 = A0s;
                    strArr3[5] = "9QdkqYSTFHb7WYiPiRp7Y6nS2TP2i0It";
                    strArr3[2] = "gIdgEUZyaZheDXAdPlxJ5YfvFSsVsGnk";
                }
            }
        }
    }

    private boolean A0V() {
        return this.A0M != null;
    }

    private B3[] A0W() {
        return this.A0a ? this.A0n : this.A0o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01c2, code lost:
        if (r14 == 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c4, code lost:
        r10.A02 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01c6, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c9, code lost:
        if (r10.A0X == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01cb, code lost:
        r2 = android.media.AudioTrack.getMinBufferSize(r13, r5, r10.A08);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01d2, code lost:
        if (r2 == (-2)) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01d4, code lost:
        com.facebook.ads.redexgen.X.I1.A04(r4);
        r9 = r2 * 4;
        r10.A02 = com.facebook.ads.redexgen.X.C0726Ig.A06(r9, ((int) A07(250000)) * r10.A09, (int) java.lang.Math.max(r2, A07(750000) * r10.A09));
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01fc, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01fe, code lost:
        r1 = r10.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0200, code lost:
        if (r1 == r2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0203, code lost:
        if (r1 != 6) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0205, code lost:
        r10.A02 = 20480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x020b, code lost:
        if (r1 != 7) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x020d, code lost:
        r10.A02 = 49152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0213, code lost:
        r10.A02 = 294912;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0219, code lost:
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ee, code lost:
        if (r6 <= 23) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ff, code lost:
        if (A0I(org.xbill.DNS.WKSRecord.Service.NETBIOS_SSN, 6, 39).equals(com.facebook.ads.redexgen.X.C0726Ig.A03) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0110, code lost:
        if (A0I(49, 6, 11).equals(com.facebook.ads.redexgen.X.C0726Ig.A05) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0113, code lost:
        if (r12 == 3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0115, code lost:
        if (r12 == r2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0118, code lost:
        if (r12 == 7) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011a, code lost:
        r1 = com.facebook.ads.redexgen.X.C0726Ig.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011e, code lost:
        if (r1 > 25) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012f, code lost:
        if (A0I(145, 4, 22).equals(com.facebook.ads.redexgen.X.C0726Ig.A03) == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0133, code lost:
        if (r10.A0X != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0135, code lost:
        r4 = true;
        r6 = com.facebook.ads.redexgen.X.C1113Xo.A0s;
        r1 = r6[5];
        r6 = r6[2];
        r1 = r1.charAt(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0147, code lost:
        if (r1 == r6.charAt(2)) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014e, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014f, code lost:
        r5 = com.facebook.ads.redexgen.X.C05269y.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0152, code lost:
        r5 = 252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0162, code lost:
        if (r6 <= 23) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0165, code lost:
        r6 = com.facebook.ads.redexgen.X.C1113Xo.A0s;
        r6[6] = "lyxpn71WQn9dckKW56P9nO6T9wnpMgEk";
        r6[0] = "LnPBCXPfIDTyG7NKycPeENmI65ZDVhzG";
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0171, code lost:
        if (r12 != 1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0173, code lost:
        r5 = 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0176, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0177, code lost:
        if (r9 != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x017d, code lost:
        if (A0V() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0181, code lost:
        if (r10.A08 != r8) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0183, code lost:
        r9 = r10.A0A;
        r1 = com.facebook.ads.redexgen.X.C1113Xo.A0s[3].length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0190, code lost:
        if (r1 == 31) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0197, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0198, code lost:
        r6 = com.facebook.ads.redexgen.X.C1113Xo.A0s;
        r6[7] = "QJheChQOtEbeash7G8AcHOsRzFDcTJZ5";
        r6[7] = "QJheChQOtEbeash7G8AcHOsRzFDcTJZ5";
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a4, code lost:
        if (r9 != r13) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a8, code lost:
        if (r10.A07 != r5) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01aa, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ab, code lost:
        reset();
        r10.A0Z = r7;
        r10.A0A = r13;
        r10.A07 = r5;
        r10.A08 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b8, code lost:
        if (r10.A0X == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ba, code lost:
        r0 = com.facebook.ads.redexgen.X.C0726Ig.A05(r10.A08, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c0, code lost:
        r10.A09 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0155  */
    @Override // com.facebook.ads.redexgen.X.BG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A46(int i, int sampleRate, int i2, int i3, @Nullable int[] iArr, int sampleRate2, int encoding) throws BC {
        boolean z;
        boolean z2;
        int i4;
        String str;
        int channelConfig;
        int channelCount;
        B3[] A0W;
        boolean z3 = false;
        this.A06 = i2;
        this.A0X = C0726Ig.A0d(i);
        if (this.A0m && A7Y(1073741824)) {
            boolean A0c = C0726Ig.A0c(i);
            String[] strArr = A0s;
            if (strArr[4].charAt(9) == strArr[1].charAt(9)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[6] = "pSgUMuqclJtR7Wll0dPjJ2zzf2ilR1Rg";
            strArr2[0] = "HOjaWwZtZrcuosAAwRPsfae4433kR7Xp";
            if (A0c) {
                z = true;
                this.A0a = z;
                if (this.A0X) {
                    this.A0B = C0726Ig.A05(i, sampleRate);
                }
                int i5 = i;
                z2 = (this.A0X || i == 4) ? false : true;
                this.A0V = (z2 || this.A0a) ? false : true;
                if (z2) {
                    this.A0k.A01(sampleRate2, encoding);
                    this.A0i.A01(iArr);
                    for (B3 b3 : A0W()) {
                        try {
                            z3 |= b3.A47(i2, sampleRate, i5);
                            if (b3.A7V()) {
                                sampleRate = b3.A6b();
                                i2 = b3.A6d();
                                i5 = b3.A6c();
                            }
                        } catch (B2 e) {
                            throw new BC(e);
                        }
                    }
                }
                switch (sampleRate) {
                    case 1:
                        i4 = 4;
                        break;
                    case 2:
                        i4 = 12;
                        break;
                    case 3:
                        i4 = 28;
                        break;
                    case 4:
                        i4 = 204;
                        break;
                    case 5:
                        i4 = 220;
                        break;
                    case 6:
                        i4 = 252;
                        break;
                    case 7:
                        i4 = 1276;
                        break;
                    case 8:
                        i4 = C05269y.A00;
                        break;
                    default:
                        throw new BC(A0I(111, 27, 126) + sampleRate);
                }
                int i6 = C0726Ig.A02;
                String[] strArr3 = A0s;
                String str2 = strArr3[6];
                str = strArr3[0];
                channelConfig = str2.charAt(18);
                if (channelConfig == str.charAt(18)) {
                    channelCount = 5;
                } else {
                    String[] strArr4 = A0s;
                    strArr4[4] = "YZfXt3sXT4j271kDE0ioC9OxQaOXWjH5";
                    strArr4[1] = "T3cPMba1o5OKtrwqBxp9YFX0amMUuBH0";
                    channelCount = 5;
                }
            }
        }
        z = false;
        this.A0a = z;
        if (this.A0X) {
        }
        int i52 = i;
        if (this.A0X) {
        }
        this.A0V = (z2 || this.A0a) ? false : true;
        if (z2) {
        }
        switch (sampleRate) {
        }
        int i62 = C0726Ig.A02;
        String[] strArr32 = A0s;
        String str22 = strArr32[6];
        str = strArr32[0];
        channelConfig = str22.charAt(18);
        if (channelConfig == str.charAt(18)) {
        }
    }

    @Override // com.facebook.ads.redexgen.X.BG
    public final void A4l() {
        if (this.A0b) {
            this.A0b = false;
            this.A01 = 0;
            reset();
        }
    }

    @Override // com.facebook.ads.redexgen.X.BG
    public final void A4u(int i) {
        I1.A04(C0726Ig.A02 >= 21);
        if (!this.A0b || this.A01 != i) {
            this.A0b = true;
            this.A01 = i;
            reset();
        }
    }

    @Override // com.facebook.ads.redexgen.X.BG
    public final long A5u(boolean z) {
        if (!A0V() || this.A0D == 0) {
            return Long.MIN_VALUE;
        }
        return this.A0H + A05(A06(Math.min(this.A0h.A0D(z), A08(A04()))));
    }

    @Override // com.facebook.ads.redexgen.X.BG
    public final AP A6l() {
        return this.A0P;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
        if (r19.A0X == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
        r19.A0J += r20.remaining();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
        r19.A0T = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
        r4 = r19.A0I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
        if (com.facebook.ads.redexgen.X.C1113Xo.A0s[7].charAt(5) == 'v') goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0093, code lost:
        r9 = com.facebook.ads.redexgen.X.C1113Xo.A0s;
        r9[7] = "RMIgxhGSPUjaAJeGU8ndpU4l5tEpmaGN";
        r9[7] = "RMIgxhGSPUjaAJeGU8ndpU4l5tEpmaGN";
        r19.A0I = r4 + r19.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0121, code lost:
        if (r12 == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0123, code lost:
        r19.A0H = java.lang.Math.max(0L, r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0134, code lost:
        if (com.facebook.ads.redexgen.X.C1113Xo.A0s[3].length() == 31) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013b, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0148, code lost:
        if (r12 == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014b, code lost:
        r4 = r19.A0H + A09(A03());
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0159, code lost:
        if (r19.A0D != 1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015b, code lost:
        r15 = java.lang.Math.abs(r4 - r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0170, code lost:
        if (com.facebook.ads.redexgen.X.C1113Xo.A0s[7].charAt(5) == 'v') goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0172, code lost:
        r9 = com.facebook.ads.redexgen.X.C1113Xo.A0s;
        r9[5] = "Mjd2F7C7kiLCVUTRblLdSlwSo04If9jH";
        r9[2] = "SFdTDB39f2uDBeT9Tbwwt5W5QdPlKJfQ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0180, code lost:
        if (r15 <= 200000) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0182, code lost:
        android.util.Log.e(r10, A0I(16, 33, 65) + r4 + A0I(0, 6, 35) + r21 + A0I(org.xbill.DNS.WKSRecord.Service.NETBIOS_DGM, 1, 115));
        r19.A0D = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ba, code lost:
        r13 = r19.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01c7, code lost:
        if (com.facebook.ads.redexgen.X.C1113Xo.A0s[3].length() == 31) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01cb, code lost:
        r9 = com.facebook.ads.redexgen.X.C1113Xo.A0s;
        r9[7] = "vGS91cAAG7hMw0xriamqCYCKlpI1kVhb";
        r9[7] = "vGS91cAAG7hMw0xriamqCYCKlpI1kVhb";
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01d9, code lost:
        if (r15 <= 200000) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01dc, code lost:
        r4 = com.facebook.ads.redexgen.X.C1113Xo.A0s;
        r4[5] = "k8d1uoKGcn9oqEPcbfqEuDtWZEluvqcv";
        r4[2] = "0FdbLpGzKjPPYkWO7EHSmW7ecHxpzOIE";
        r19.A0D = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ec, code lost:
        r9 = com.facebook.ads.redexgen.X.C1113Xo.A0s;
        r9[6] = "1n9GuuRZsd3tbftYhBPGe0z5aHsix9eq";
        r9[0] = "CrYGxTKVQxqkoEEYRaPu1U1mUEDoOHWT";
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01f8, code lost:
        if (r13 != 2) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01fa, code lost:
        r19.A0H += r21 - r4;
        r19.A0D = 1;
        r2 = r19.A0R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0205, code lost:
        if (r2 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0207, code lost:
        r2.AAY();
     */
    @Override // com.facebook.ads.redexgen.X.BG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A7F(ByteBuffer byteBuffer, long j) throws BD, BF {
        ByteBuffer byteBuffer2 = this.A0T;
        I1.A03(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!A0V()) {
            A0K();
            if (this.A0Y) {
                ABg();
            }
        }
        if (this.A0h.A0M(A04())) {
            ByteBuffer byteBuffer3 = this.A0T;
            String A0I = A0I(6, 10, 84);
            if (byteBuffer3 == null) {
                if (!byteBuffer.hasRemaining()) {
                    return true;
                }
                if (!this.A0X && this.A05 == 0) {
                    this.A05 = A00(this.A08, byteBuffer);
                    if (this.A05 == 0) {
                        return true;
                    }
                }
                if (this.A0O != null) {
                    boolean A0U = A0U();
                    String[] strArr = A0s;
                    if (strArr[6].charAt(18) == strArr[0].charAt(18)) {
                        String[] strArr2 = A0s;
                        strArr2[7] = "32G65PTM58F7sQCdfpmp6BeZ89jlEc3c";
                        strArr2[7] = "32G65PTM58F7sQCdfpmp6BeZ89jlEc3c";
                        if (!A0U) {
                            return false;
                        }
                        AP ap = this.A0O;
                        this.A0O = null;
                        this.A0l.add(new BR(this.A0j.A3R(ap), Math.max(0L, j), A08(A04()), null));
                        A0N();
                    }
                    throw new RuntimeException();
                }
                int i = this.A0D;
                String[] strArr3 = A0s;
                if (strArr3[6].charAt(18) != strArr3[0].charAt(18)) {
                    String[] strArr4 = A0s;
                    strArr4[5] = "fLdk8aATSmJXoquyNHeNsiC6Q5oLlXzM";
                    strArr4[2] = "ENde7HZSsZADB3fZdejE9kxAgCgEEhM2";
                } else {
                    String[] strArr5 = A0s;
                    strArr5[7] = "e4cnN7UP0SnjMswao4r9LHhuRWlwcAUo";
                    strArr5[7] = "e4cnN7UP0SnjMswao4r9LHhuRWlwcAUo";
                }
            }
            if (!this.A0Z) {
                A0T(this.A0T, j);
            } else {
                A0Q(j);
            }
            if (!this.A0T.hasRemaining()) {
                this.A0T = null;
                return true;
            } else if (this.A0h.A0L(A04())) {
                Log.w(A0I, A0I(55, 29, 17));
                reset();
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.BG
    public final void A7G() {
        if (this.A0D == 1) {
            this.A0D = 2;
        }
    }

    @Override // com.facebook.ads.redexgen.X.BG
    public final boolean A7J() {
        return A0V() && this.A0h.A0K(A04());
    }

    @Override // com.facebook.ads.redexgen.X.BG
    public final boolean A7Y(int i) {
        if (C0726Ig.A0d(i)) {
            return i != 4 || C0726Ig.A02 >= 21;
        }
        C0549Aw c0549Aw = this.A0g;
        return c0549Aw != null && c0549Aw.A04(i);
    }

    @Override // com.facebook.ads.redexgen.X.BG
    public final boolean A7Z() {
        return !A0V() || (this.A0W && !A7J());
    }

    @Override // com.facebook.ads.redexgen.X.BG
    public final void ABg() {
        this.A0Y = true;
        if (A0V()) {
            this.A0h.A0F();
            AudioTrack audioTrack = this.A0M;
            if (A0s[3].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0s;
            strArr[3] = "NrYH7da7InJYZ7DcifiCDIWgHy9XttZ";
            strArr[3] = "NrYH7da7InJYZ7DcifiCDIWgHy9XttZ";
            audioTrack.play();
        }
    }

    @Override // com.facebook.ads.redexgen.X.BG
    public final void ABh() throws BF {
        if (this.A0W) {
            return;
        }
        boolean A0V = A0V();
        String[] strArr = A0s;
        if (strArr[6].charAt(18) != strArr[0].charAt(18)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0s;
        strArr2[6] = "potoNIjJr8c5PhhOHWP3V8xbrUltb98O";
        strArr2[0] = "s7h49TBBG9Upv5zOzLPi805BwVxtpEdY";
        if (A0V && A0U()) {
            this.A0h.A0G(A04());
            this.A0M.stop();
            this.A03 = 0;
            this.A0W = true;
        }
    }

    @Override // com.facebook.ads.redexgen.X.BG
    public final void ACD() {
        reset();
        A0L();
        for (B3 b3 : this.A0o) {
            b3.reset();
            if (A0s[3].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0s;
            strArr[5] = "qwdTDv5zTd3QZESqVqPfOIKdJj7Lz8kg";
            strArr[2] = "LbdTDWALSGuogzF76GUONHDiI7JL2ED4";
        }
        for (B3 b32 : this.A0n) {
            b32.reset();
        }
        this.A01 = 0;
        this.A0Y = false;
        if (A0s[7].charAt(5) != 'v') {
            String[] strArr2 = A0s;
            strArr2[3] = "7yJp0zMcRreZgWUPzTirOlbpECU1qPL";
            strArr2[3] = "7yJp0zMcRreZgWUPzTirOlbpECU1qPL";
            return;
        }
        String[] strArr3 = A0s;
        strArr3[5] = "IJdzF7l1OUCqcHSZRNfx63TpictB3CeC";
        strArr3[2] = "IidC6PogfV1YW6p29FProDWayU60rDbu";
    }

    @Override // com.facebook.ads.redexgen.X.BG
    public final void ACs(C0548Av c0548Av) {
        if (this.A0Q.equals(c0548Av)) {
            return;
        }
        this.A0Q = c0548Av;
        if (this.A0b) {
            return;
        }
        reset();
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.BG
    public final void ACz(BE be) {
        this.A0R = be;
    }

    @Override // com.facebook.ads.redexgen.X.BG
    public final AP AD3(AP ap) {
        if (A0V() && !this.A0V) {
            this.A0P = AP.A04;
            return this.A0P;
        }
        AP ap2 = this.A0O;
        if (ap2 == null) {
            ap2 = !this.A0l.isEmpty() ? BR.A02(this.A0l.getLast()) : this.A0P;
        }
        if (!ap.equals(ap2)) {
            if (A0V()) {
                this.A0O = ap;
            } else {
                this.A0P = this.A0j.A3R(ap);
            }
        }
        return this.A0P;
    }

    @Override // com.facebook.ads.redexgen.X.BG
    public final void pause() {
        this.A0Y = false;
        if (A0V() && this.A0h.A0J()) {
            this.A0M.pause();
        }
    }

    @Override // com.facebook.ads.redexgen.X.BG
    public final void reset() {
        if (A0V()) {
            this.A0J = 0L;
            this.A0I = 0L;
            this.A0L = 0L;
            this.A0K = 0L;
            this.A05 = 0;
            AP ap = this.A0O;
            if (ap != null) {
                this.A0P = ap;
                this.A0O = null;
            } else if (!this.A0l.isEmpty()) {
                ArrayDeque<BR> arrayDeque = this.A0l;
                if (A0s[7].charAt(5) == 'v') {
                    throw new RuntimeException();
                }
                String[] strArr = A0s;
                strArr[7] = "7Zd0LJuJ8v1AsDIGeh9Ten8e10sO09Lx";
                strArr[7] = "7Zd0LJuJ8v1AsDIGeh9Ten8e10sO09Lx";
                this.A0P = BR.A02(arrayDeque.getLast());
            }
            this.A0l.clear();
            this.A0F = 0L;
            this.A0G = 0L;
            this.A0T = null;
            this.A0U = null;
            A0J();
            this.A0W = false;
            this.A04 = -1;
            this.A0S = null;
            this.A03 = 0;
            this.A0D = 0;
            if (this.A0h.A0I()) {
                this.A0M.pause();
            }
            AudioTrack audioTrack = this.A0M;
            this.A0M = null;
            this.A0h.A0E();
            this.A0f.close();
            new BN(this, audioTrack).start();
        }
    }

    @Override // com.facebook.ads.redexgen.X.BG
    public final void setVolume(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            A0M();
        }
    }
}