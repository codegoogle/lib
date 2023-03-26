package com.p7700g.p99005;

import com.p7700g.p99005.e24;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import org.xbill.DNS.TTL;

/* compiled from: AddressItemSpliteratorBase.java */
/* loaded from: classes3.dex */
public abstract class n24<S extends e24, T> extends w24<S, T> {
    private static final BigInteger c = BigInteger.valueOf(TTL.MAX_VALUE);
    public boolean d;
    public BigInteger e = BigInteger.ZERO;
    public long f;

    @Override // com.p7700g.p99005.w24
    public boolean e(Iterator<T> it, Consumer<? super T> consumer) {
        if (this.d) {
            try {
                T next = it.next();
                this.e = this.e.add(BigInteger.ONE);
                consumer.accept(next);
                return true;
            } catch (NoSuchElementException unused) {
                return false;
            }
        }
        return super.e(it, consumer);
    }

    public void f(Iterator<T> it, Consumer<? super T> consumer, BigInteger bigInteger) {
        int intValue;
        boolean z;
        if (this.e.signum() > 0) {
            bigInteger = bigInteger.subtract(this.e);
        }
        if (bigInteger.compareTo(c) >= 0) {
            z = true;
            intValue = 0;
        } else {
            intValue = bigInteger.intValue();
            z = false;
        }
        while (true) {
            if (!z) {
                try {
                    if (this.f >= intValue) {
                        break;
                    }
                } finally {
                    long j = this.f;
                    if (j != 0) {
                        this.e = this.e.add(BigInteger.valueOf(j));
                        this.f = 0L;
                    }
                }
            }
            try {
                T next = it.next();
                long j2 = this.f + 1;
                this.f = j2;
                if (j2 == TTL.MAX_VALUE) {
                    this.f = 0L;
                    BigInteger bigInteger2 = this.e;
                    BigInteger bigInteger3 = c;
                    this.e = bigInteger2.add(bigInteger3);
                    bigInteger = bigInteger.subtract(bigInteger3);
                    if (bigInteger.compareTo(bigInteger3) < 0) {
                        intValue = bigInteger.intValue();
                        z = false;
                    }
                }
                consumer.accept(next);
            } catch (NoSuchElementException unused) {
            }
        }
    }
}