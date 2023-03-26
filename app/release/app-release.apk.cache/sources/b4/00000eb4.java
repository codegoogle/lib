package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.64  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass64<T> {
    public static String[] A02;
    public final int A00;
    public final LinkedBlockingDeque<T> A01;

    static {
        A00();
    }

    public static void A00() {
        A02 = new String[]{"dOZKS2ZI7II", "H1g7gqR2EKn", "HfxVquxaUjpYbjJdoITajwkesDv6b5OP", "LKGrDWI4UhzaVgtHDOFVkFmAOkdfM3kS", "eoAuUQbCqIbnVyiqi6nAqoKpMgu8SE72", "BREsl3NjjeIkGT8YX46XMxY6QnBlFPku", "r0N9JiiALcRfLFwgFUe0Fbolf1MfiQ1h", "O05UPhpRrjuDMd"};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.64 != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<T> */
    public AnonymousClass64(int i) {
        this.A01 = new LinkedBlockingDeque<>(i);
        this.A00 = i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.64 != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<T> */
    public final synchronized int A01() {
        int remainingCapacity;
        remainingCapacity = this.A01.remainingCapacity();
        if (A02[4].charAt(17) != 't') {
            String[] strArr = A02;
            strArr[4] = "R8iXUhs6Ry9t7OlTnDSaYaqPOUvaVcmE";
            strArr[4] = "R8iXUhs6Ry9t7OlTnDSaYaqPOUvaVcmE";
            return remainingCapacity;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.64 != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<T> */
    @Nullable
    public final synchronized T A02() {
        if (!this.A01.isEmpty()) {
            return this.A01.peekFirst();
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.64 != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<T> */
    @Nullable
    public final synchronized T A03() {
        if (!this.A01.isEmpty()) {
            return this.A01.peekLast();
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.64 != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<T> */
    public final synchronized List<T> A04() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<T> it = this.A01.iterator();
        while (it.hasNext()) {
            T dataObject = it.next();
            arrayList.add(dataObject);
        }
        return arrayList;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.64 != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<T> */
    public final synchronized void A05(T t) {
        if (this.A00 <= 0) {
            return;
        }
        if (!this.A01.isEmpty() && A01() == 0) {
            this.A01.removeFirst();
        }
        this.A01.offer(t);
    }
}