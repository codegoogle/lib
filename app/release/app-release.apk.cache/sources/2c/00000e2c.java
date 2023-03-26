package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.annotation.Nullable;
import com.anythink.basead.d.g;
import com.p7700g.p99005.bx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.ads.redexgen.X.3q  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class RunnableC03733q implements Runnable {
    public static Comparator<C03723p> A04;
    public static byte[] A05;
    public static String[] A06;
    public static final ThreadLocal<RunnableC03733q> A07;
    public long A00;
    public long A01;
    public ArrayList<ES> A02 = new ArrayList<>();
    public ArrayList<C03723p> A03 = new ArrayList<>();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 8);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{97, 101, 47, 93, 116, -126, -125, 116, 115, 47, 95, -127, 116, 117, 116, -125, 114, 119, 92, 96, bx.W5, 90, 124, 111, 112, 111, 126, 109, 114};
    }

    public static void A04() {
        A06 = new String[]{"C", g.i, "thIgEQWd9nx", "UJ", "nKFIv9xSQBz", "WKzZJ6F0j2u08DpGCnjDR9E", "2Nt4JwZoKXCf4OpJNcF1oxTto7W5gJbD", "RW"};
    }

    static {
        A04();
        A03();
        A07 = new ThreadLocal<>();
        A04 = new Comparator<C03723p>() { // from class: com.facebook.ads.redexgen.X.3o
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* renamed from: A00 */
            public final int compare(C03723p c03723p, C03723p c03723p2) {
                if ((c03723p.A03 == null) != (c03723p2.A03 == null)) {
                    return c03723p.A03 == null ? 1 : -1;
                } else if (c03723p.A04 != c03723p2.A04) {
                    return c03723p.A04 ? -1 : 1;
                } else {
                    int i = c03723p2.A02 - c03723p.A02;
                    if (i != 0) {
                        return i;
                    }
                    int i2 = c03723p.A00 - c03723p2.A00;
                    if (i2 != 0) {
                        return i2;
                    }
                    return 0;
                }
            }
        };
    }

    private C4X A00(ES es, int i, long j) {
        if (A09(es, i)) {
            return null;
        }
        C4N c4n = es.A0r;
        try {
            es.A1M();
            C4X A0J = c4n.A0J(i, false, j);
            if (A0J != null) {
                if (A0J.A0b() && !A0J.A0c()) {
                    c4n.A0Y(A0J.A0H);
                } else {
                    c4n.A0e(A0J, false);
                }
            }
            return A0J;
        } finally {
            es.A1r(false);
        }
    }

    private void A02() {
        C03723p task;
        int i = this.A02.size();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            ES es = this.A02.get(i3);
            int totalTaskCount = es.getWindowVisibility();
            if (totalTaskCount == 0) {
                es.A02.A05(es, false);
                int totalTaskCount2 = es.A02.A00;
                i2 += totalTaskCount2;
            }
        }
        this.A03.ensureCapacity(i2);
        int i4 = 0;
        String[] strArr = A06;
        String str = strArr[3];
        String str2 = strArr[7];
        int length = str.length();
        int totalTaskCount3 = str2.length();
        if (length != totalTaskCount3) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[3] = "OH";
        strArr2[7] = "7S";
        for (int i5 = 0; i5 < i; i5++) {
            ES es2 = this.A02.get(i5);
            int totalTaskCount4 = es2.getWindowVisibility();
            if (totalTaskCount4 == 0) {
                ST st = es2.A02;
                int abs = Math.abs(st.A01) + Math.abs(st.A02);
                for (int i6 = 0; i6 < st.A00 * 2; i6 += 2) {
                    if (i4 >= this.A03.size()) {
                        task = new C03723p();
                        this.A03.add(task);
                    } else {
                        task = this.A03.get(i4);
                    }
                    int j = i6 + 1;
                    int i7 = st.A03[j];
                    task.A04 = i7 <= abs;
                    task.A02 = abs;
                    task.A00 = i7;
                    task.A03 = es2;
                    int j2 = st.A03[i6];
                    task.A01 = j2;
                    i4++;
                }
            }
        }
        Collections.sort(this.A03, A04);
    }

    private void A05(long j) {
        for (int i = 0; i < this.A03.size(); i++) {
            C03723p c03723p = this.A03.get(i);
            if (c03723p.A03 == null) {
                return;
            }
            A07(c03723p, j);
            c03723p.A00();
        }
    }

    private final void A06(long j) {
        A02();
        A05(j);
    }

    private void A07(C03723p c03723p, long j) {
        C4X A00 = A00(c03723p.A03, c03723p.A01, c03723p.A04 ? Long.MAX_VALUE : j);
        if (A00 != null && A00.A09 != null && A00.A0b() && !A00.A0c()) {
            A08(A00.A09.get(), j);
        }
    }

    private void A08(@Nullable ES es, long j) {
        if (es == null) {
            return;
        }
        if (es.A0C) {
            C03603d c03603d = es.A01;
            if (A06[5].length() != 17) {
                String[] strArr = A06;
                strArr[6] = "t2x0aSlbBonOFe0N5m1ttILNz4IaYpUW";
                strArr[6] = "t2x0aSlbBonOFe0N5m1ttILNz4IaYpUW";
                if (c03603d.A07() != 0) {
                    es.A1P();
                }
            }
            throw new RuntimeException();
        }
        ST st = es.A02;
        st.A05(es, true);
        if (st.A00 != 0) {
            try {
                C2H.A01(A01(0, 18, 7));
                es.A0s.A05(es.A04);
                int i = 0;
                while (true) {
                    int i2 = st.A00 * 2;
                    if (A06[6].charAt(8) == 'I') {
                        break;
                    }
                    String[] strArr2 = A06;
                    strArr2[3] = "nG";
                    strArr2[7] = "TD";
                    if (i < i2) {
                        A00(es, st.A03[i], j);
                        i += 2;
                    } else {
                        return;
                    }
                }
                throw new RuntimeException();
            } finally {
                C2H.A00();
            }
        }
    }

    public static boolean A09(ES es, int i) {
        int A072 = es.A01.A07();
        for (int i2 = 0; i2 < A072; i2++) {
            View attachedView = es.A01.A0B(i2);
            C4X A0G = ES.A0G(attachedView);
            if (A0G.A03 == i && !A0G.A0c()) {
                return true;
            }
        }
        return false;
    }

    public final void A0A(ES es) {
        this.A02.add(es);
    }

    public final void A0B(ES es) {
        this.A02.remove(es);
    }

    public final void A0C(ES es, int i, int i2) {
        if (es.isAttachedToWindow() && this.A01 == 0) {
            this.A01 = es.getNanoTime();
            es.post(this);
        }
        es.A02.A04(i, i2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C2H.A01(A01(18, 11, 2));
            if (this.A02.isEmpty()) {
                return;
            }
            int size = this.A02.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                ES es = this.A02.get(i);
                int i2 = es.getWindowVisibility();
                if (i2 == 0) {
                    j = Math.max(es.getDrawingTime(), j);
                }
            }
            if (j == 0) {
                this.A01 = 0L;
                if (A06[5].length() == 17) {
                    throw new RuntimeException();
                }
                String[] strArr = A06;
                strArr[5] = "H4nD1dOrFb1";
                strArr[5] = "H4nD1dOrFb1";
                C2H.A00();
                return;
            }
            long latestFrameVsyncMs = TimeUnit.MILLISECONDS.toNanos(j);
            A06(latestFrameVsyncMs + this.A00);
        } finally {
            this.A01 = 0L;
            C2H.A00();
        }
    }
}