package com.p7700g.p99005;

import java.util.Random;
import org.jetbrains.annotations.NotNull;

/* compiled from: PlatformRandom.kt */
@vo4(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lkotlin/random/AbstractPlatformRandom;", "Lkotlin/random/Random;", "()V", "impl", "Ljava/util/Random;", "getImpl", "()Ljava/util/Random;", "nextBits", "", "bitCount", "nextBoolean", "", "nextBytes", "", "array", "nextDouble", "", "nextFloat", "", "nextInt", "until", "nextLong", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public abstract class i45 extends n45 {
    @Override // com.p7700g.p99005.n45
    public int A(int i) {
        return H().nextInt(i);
    }

    @Override // com.p7700g.p99005.n45
    public long D() {
        return H().nextLong();
    }

    @NotNull
    public abstract Random H();

    @Override // com.p7700g.p99005.n45
    public int g(int i) {
        return o45.j(H().nextInt(), i);
    }

    @Override // com.p7700g.p99005.n45
    public boolean h() {
        return H().nextBoolean();
    }

    @Override // com.p7700g.p99005.n45
    @NotNull
    public byte[] m(@NotNull byte[] bArr) {
        c25.p(bArr, "array");
        H().nextBytes(bArr);
        return bArr;
    }

    @Override // com.p7700g.p99005.n45
    public double p() {
        return H().nextDouble();
    }

    @Override // com.p7700g.p99005.n45
    public float x() {
        return H().nextFloat();
    }

    @Override // com.p7700g.p99005.n45
    public int y() {
        return H().nextInt();
    }
}