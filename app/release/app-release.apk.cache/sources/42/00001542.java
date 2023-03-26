package com.facebook.ads.redexgen.X;

import com.facebook.ads.redexgen.X.AbstractC1122Xx;
import com.facebook.ads.redexgen.X.C1121Xw;
import java.lang.Exception;
import java.util.ArrayDeque;

/* renamed from: com.facebook.ads.redexgen.X.Xy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1123Xy<I extends C1121Xw, O extends AbstractC1122Xx, E extends Exception> implements InterfaceC0556Bd<I, O, E> {
    public static String[] A0D;
    public int A00;
    public int A01;
    public int A02;
    public I A03;
    public E A04;
    public boolean A05;
    public boolean A06;
    public final Thread A08;
    public final I[] A0B;
    public final O[] A0C;
    public final Object A07 = new Object();
    public final ArrayDeque<I> A09 = new ArrayDeque<>();
    public final ArrayDeque<O> A0A = new ArrayDeque<>();

    static {
        A0O();
    }

    public static void A0O() {
        A0D = new String[]{"Gkl", "qMMBfBKIWMYZs", "JMr5TMdVlQ7lAxQbe7gmsO3TMTXZHZrx", "k", "fplFQmQDWPfBEKatf3t9LdZAMaYE90Yr", "qk38PGrA", "BZh", "ypodQLxrY5Mqx0yNqiahJYpo"};
    }

    public abstract I A0V();

    public abstract O A0X();

    public abstract E A0Y(I i, O o, boolean z);

    public abstract E A0Z(Throwable th);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xy != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xw, O extends com.facebook.ads.redexgen.X.Xx, E extends java.lang.Exception> */
    public AbstractC1123Xy(I[] iArr, O[] oArr) {
        this.A0B = iArr;
        this.A00 = iArr.length;
        for (int i = 0; i < this.A00; i++) {
            this.A0B[i] = A0V();
        }
        this.A0C = oArr;
        this.A01 = oArr.length;
        for (int i2 = 0; i2 < this.A01; i2++) {
            this.A0C[i2] = A0X();
        }
        this.A08 = new C0558Bg(this);
        this.A08.start();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xy != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xw, O extends com.facebook.ads.redexgen.X.Xx, E extends java.lang.Exception> */
    private void A0L() {
        if (A0S()) {
            this.A07.notify();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xy != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xw, O extends com.facebook.ads.redexgen.X.Xx, E extends java.lang.Exception> */
    private void A0M() throws Exception {
        E e = this.A04;
        if (e == null) {
            return;
        }
        throw e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xy != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xw, O extends com.facebook.ads.redexgen.X.Xx, E extends java.lang.Exception> */
    public void A0N() {
        while (A0T()) {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xy != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xw, O extends com.facebook.ads.redexgen.X.Xx, E extends java.lang.Exception> */
    private void A0P(I i) {
        i.A07();
        I[] iArr = this.A0B;
        int i2 = this.A00;
        this.A00 = i2 + 1;
        iArr[i2] = i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xy != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xw, O extends com.facebook.ads.redexgen.X.Xx, E extends java.lang.Exception> */
    private void A0Q(O o) {
        o.A07();
        O[] oArr = this.A0C;
        int i = this.A01;
        this.A01 = i + 1;
        oArr[i] = o;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xy != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xw, O extends com.facebook.ads.redexgen.X.Xx, E extends java.lang.Exception> */
    private boolean A0S() {
        return !this.A09.isEmpty() && this.A01 > 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xy != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xw, O extends com.facebook.ads.redexgen.X.Xx, E extends java.lang.Exception> */
    private boolean A0T() throws InterruptedException {
        synchronized (this.A07) {
            while (!this.A06 && !A0S()) {
                this.A07.wait();
            }
            if (this.A06) {
                return false;
            }
            I removeFirst = this.A09.removeFirst();
            O[] oArr = this.A0C;
            int i = this.A01 - 1;
            this.A01 = i;
            O o = oArr[i];
            boolean z = this.A05;
            this.A05 = false;
            boolean resetDecoder = removeFirst.A04();
            if (resetDecoder) {
                o.A00(4);
            } else {
                boolean resetDecoder2 = removeFirst.A03();
                if (resetDecoder2) {
                    o.A00(Integer.MIN_VALUE);
                }
                try {
                    this.A04 = A0Y(removeFirst, o, z);
                } catch (OutOfMemoryError e) {
                    this.A04 = A0Z(e);
                } catch (RuntimeException e2) {
                    String[] strArr = A0D;
                    if (strArr[1].length() != strArr[7].length()) {
                        String[] strArr2 = A0D;
                        strArr2[1] = "JmdauonVcnINF";
                        strArr2[7] = "vppaV7cv17cCxaH2hgZaXUeE";
                        this.A04 = A0Z(e2);
                    }
                }
                if (this.A04 != null) {
                    synchronized (this.A07) {
                    }
                    return false;
                }
            }
            Object obj = this.A07;
            String[] strArr3 = A0D;
            if (strArr3[0].length() == strArr3[6].length()) {
                String[] strArr4 = A0D;
                strArr4[1] = "q0ZgAWd6JYMJo";
                strArr4[7] = "B3H8IuJfVBRbzuvGv4HpnNYI";
                synchronized (obj) {
                    boolean resetDecoder3 = this.A05;
                    if (resetDecoder3) {
                        A0Q(o);
                    } else {
                        boolean resetDecoder4 = o.A03();
                        if (resetDecoder4) {
                            this.A02++;
                            A0Q(o);
                        } else {
                            o.A00 = this.A02;
                            this.A02 = 0;
                            this.A0A.addLast(o);
                        }
                    }
                    A0P(removeFirst);
                }
                return true;
            }
            throw new RuntimeException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xy != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xw, O extends com.facebook.ads.redexgen.X.Xx, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0556Bd
    /* renamed from: A0U */
    public final I A4h() throws Exception {
        I i;
        I i2;
        synchronized (this.A07) {
            A0M();
            I1.A04(this.A03 == null);
            if (this.A00 == 0) {
                i = null;
            } else {
                I[] iArr = this.A0B;
                int i3 = this.A00 - 1;
                this.A00 = i3;
                i = iArr[i3];
            }
            this.A03 = i;
            i2 = this.A03;
        }
        return i2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xy != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xw, O extends com.facebook.ads.redexgen.X.Xx, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0556Bd
    /* renamed from: A0W */
    public final O A4i() throws Exception {
        synchronized (this.A07) {
            A0M();
            if (this.A0A.isEmpty()) {
                return null;
            }
            return this.A0A.removeFirst();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xy != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xw, O extends com.facebook.ads.redexgen.X.Xx, E extends java.lang.Exception> */
    public final void A0a(int i) {
        I[] iArr;
        I1.A04(this.A00 == this.A0B.length);
        for (I inputBuffer : this.A0B) {
            inputBuffer.A09(i);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xy != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xw, O extends com.facebook.ads.redexgen.X.Xx, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0556Bd
    /* renamed from: A0b */
    public final void ABw(I i) throws Exception {
        synchronized (this.A07) {
            A0M();
            I inputBuffer = this.A03;
            I1.A03(i == inputBuffer);
            this.A09.addLast(i);
            A0L();
            this.A03 = null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xy != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xw, O extends com.facebook.ads.redexgen.X.Xx, E extends java.lang.Exception> */
    public void A0c(O o) {
        synchronized (this.A07) {
            A0Q(o);
            A0L();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xy != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xw, O extends com.facebook.ads.redexgen.X.Xx, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0556Bd
    public final void ACD() {
        synchronized (this.A07) {
            this.A06 = true;
            this.A07.notify();
        }
        try {
            this.A08.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xy != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xw, O extends com.facebook.ads.redexgen.X.Xx, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0556Bd
    public final void flush() {
        synchronized (this.A07) {
            this.A05 = true;
            this.A02 = 0;
            if (this.A03 != null) {
                A0P(this.A03);
                this.A03 = null;
            }
            while (!this.A09.isEmpty()) {
                A0P(this.A09.removeFirst());
            }
            while (!this.A0A.isEmpty()) {
                A0Q(this.A0A.removeFirst());
            }
        }
    }
}