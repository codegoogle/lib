package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.redexgen.X.HZ;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.un3;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;

@SuppressLint({"HandlerLeak"})
/* loaded from: assets/audience_network.dex */
public final class HY<T extends HZ> extends Handler implements Runnable {
    public static byte[] A0A;
    public int A00;
    @Nullable
    public HX<T> A01;
    public IOException A02;
    public final int A03;
    public final long A04;
    public final T A05;
    public volatile Thread A06;
    public volatile boolean A07;
    public volatile boolean A08;
    public final /* synthetic */ C1220al A09;

    static {
        A04();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 16);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0A = new byte[]{-96, -61, -75, -72, -88, -75, -57, -65, -113, -75, -76, -113, -90, -115, -91, -83, -81, -78, -71, 96, -91, -78, -78, -81, -78, 96, -84, -81, -95, -92, -87, -82, -89, 96, -77, -76, -78, -91, -95, -83, -70, -45, -54, -35, -43, -54, -56, bx.l7, -54, -55, -123, -54, -41, -41, -44, -41, -123, -47, -44, -58, -55, -50, -45, -52, -123, -40, bx.l7, -41, -54, -58, -46, -87, -62, -71, -52, -60, -71, -73, -56, -71, -72, 116, -71, -52, -73, -71, -60, -56, -67, -61, -62, 116, -68, -75, -62, -72, -64, -67, -62, -69, 116, -64, -61, -75, -72, 116, -73, -61, -63, -60, -64, -71, -56, -71, -72, -38, -13, -22, -3, -11, -22, -24, -7, -22, -23, -91, -22, -3, -24, -22, -11, -7, -18, -12, -13, -91, -15, -12, -26, -23, -18, -13, -20, -91, -8, -7, -9, -22, -26, -14, -94, -91, -105, -102, 112};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HX != com.facebook.ads.internal.exoplayer2.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.HZ> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HY != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.HZ> */
    public HY(C1220al c1220al, Looper looper, T loadable, HX<T> hx, int i, long j) {
        super(looper);
        this.A09 = c1220al;
        this.A05 = loadable;
        this.A01 = hx;
        this.A03 = i;
        this.A04 = j;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HY != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.HZ> */
    private long A00() {
        return Math.min((this.A00 - 1) * 1000, (int) un3.f.v);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HY != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.HZ> */
    private void A02() {
        ExecutorService executorService;
        HY hy;
        this.A02 = null;
        executorService = this.A09.A02;
        hy = this.A09.A00;
        executorService.execute(hy);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HY != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.HZ> */
    private void A03() {
        this.A09.A00 = null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HY != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.HZ> */
    public final void A05(int i) throws IOException {
        IOException iOException = this.A02;
        if (iOException == null || this.A00 <= i) {
            return;
        }
        throw iOException;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HY != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.HZ> */
    public final void A06(long j) {
        HY hy;
        hy = this.A09.A00;
        I1.A04(hy == null);
        this.A09.A00 = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            A02();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HY != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.HZ> */
    public final void A07(boolean z) {
        this.A08 = z;
        this.A02 = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            this.A07 = true;
            this.A05.A3y();
            if (this.A06 != null) {
                this.A06.interrupt();
            }
        }
        if (z) {
            A03();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.A01.A9x(this.A05, elapsedRealtime, elapsedRealtime - this.A04, true);
            this.A01 = null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HY != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.HZ> */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (KU.A02(this)) {
            return;
        }
        try {
            if (this.A08) {
                return;
            }
            if (message.what == 0) {
                A02();
            } else if (message.what != 4) {
                A03();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.A04;
                if (this.A07) {
                    this.A01.A9x(this.A05, elapsedRealtime, j, false);
                    return;
                }
                int i = message.what;
                if (i == 1) {
                    this.A01.A9x(this.A05, elapsedRealtime, j, false);
                } else if (i == 2) {
                    try {
                        this.A01.A9z(this.A05, elapsedRealtime, j);
                    } catch (RuntimeException e) {
                        Log.e(A01(0, 8, 68), A01(71, 44, 68), e);
                        this.A09.A01 = new C0697Hd(e);
                    }
                } else if (i != 3) {
                } else {
                    this.A02 = (IOException) message.obj;
                    int AA0 = this.A01.AA0(this.A05, elapsedRealtime, j, this.A02);
                    if (AA0 != 3) {
                        if (AA0 == 2) {
                            return;
                        }
                        this.A00 = AA0 == 1 ? 1 : this.A00 + 1;
                        A06(A00());
                        return;
                    }
                    this.A09.A01 = this.A02;
                }
            } else {
                throw ((Error) message.obj);
            }
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HY != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.HZ> */
    @Override // java.lang.Runnable
    public final void run() {
        String A01 = A01(0, 8, 68);
        if (KU.A02(this)) {
            return;
        }
        try {
            try {
                try {
                    try {
                        try {
                            this.A06 = Thread.currentThread();
                            if (!this.A07) {
                                C0723Id.A02(A01(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, 5, 38) + this.A05.getClass().getSimpleName());
                                try {
                                    this.A05.A7q();
                                } finally {
                                    C0723Id.A00();
                                }
                            }
                            if (!this.A08) {
                                sendEmptyMessage(2);
                            }
                        } catch (Error e) {
                            Log.e(A01, A01(40, 31, 85), e);
                            if (!this.A08) {
                                obtainMessage(4, e).sendToTarget();
                            }
                            throw e;
                        } catch (InterruptedException unused) {
                            I1.A04(this.A07);
                            if (!this.A08) {
                                sendEmptyMessage(2);
                            }
                        }
                    } catch (OutOfMemoryError e2) {
                        Log.e(A01, A01(8, 32, 48), e2);
                        if (!this.A08) {
                            obtainMessage(3, new C0697Hd(e2)).sendToTarget();
                        }
                    }
                } catch (Exception e3) {
                    Log.e(A01, A01(115, 35, 117), e3);
                    if (!this.A08) {
                        obtainMessage(3, new C0697Hd(e3)).sendToTarget();
                    }
                }
            } catch (IOException e4) {
                if (!this.A08) {
                    obtainMessage(3, e4).sendToTarget();
                }
            }
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}