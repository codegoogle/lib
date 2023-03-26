package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SegmentedByteString.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u0010P\u001a\b\u0012\u0004\u0012\u00020#0K\u0012\u0006\u0010J\u001a\u00020E¢\u0006\u0004\bQ\u0010RJ\u000f\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\rJ\u001f\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0018H\u0010¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0010¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b,\u0010-J'\u00102\u001a\u00020+2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u00182\u0006\u00101\u001a\u00020\u0018H\u0010¢\u0006\u0004\b2\u00103J/\u00107\u001a\u0002062\u0006\u00100\u001a\u00020\u00182\u0006\u00104\u001a\u00020\u00012\u0006\u00105\u001a\u00020\u00182\u0006\u00101\u001a\u00020\u0018H\u0016¢\u0006\u0004\b7\u00108J/\u00109\u001a\u0002062\u0006\u00100\u001a\u00020\u00182\u0006\u00104\u001a\u00020#2\u0006\u00105\u001a\u00020\u00182\u0006\u00101\u001a\u00020\u0018H\u0016¢\u0006\u0004\b9\u0010:J\u001f\u0010<\u001a\u00020\u00182\u0006\u00104\u001a\u00020#2\u0006\u0010;\u001a\u00020\u0018H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010>\u001a\u00020\u00182\u0006\u00104\u001a\u00020#2\u0006\u0010;\u001a\u00020\u0018H\u0016¢\u0006\u0004\b>\u0010=J\u000f\u0010?\u001a\u00020#H\u0010¢\u0006\u0004\b?\u0010%J\u001a\u0010A\u001a\u0002062\b\u00104\u001a\u0004\u0018\u00010@H\u0096\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0018H\u0016¢\u0006\u0004\bC\u0010\"J\u000f\u0010D\u001a\u00020\tH\u0016¢\u0006\u0004\bD\u0010\rR\u001c\u0010J\u001a\u00020E8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\"\u0010P\u001a\b\u0012\u0004\u0012\u00020#0K8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O¨\u0006S"}, d2 = {"Lcom/p7700g/p99005/uw5;", "Lcom/p7700g/p99005/vv5;", "D4", "()Lcom/p7700g/p99005/vv5;", "Ljava/lang/Object;", "E4", "()Ljava/lang/Object;", "Ljava/nio/charset/Charset;", "charset", "", "I3", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "h", "()Ljava/lang/String;", "H", "e4", "g4", "algorithm", "p", "(Ljava/lang/String;)Lcom/p7700g/p99005/vv5;", "key", AFHydra.STATUS_IDLE, "(Ljava/lang/String;Lcom/p7700g/p99005/vv5;)Lcom/p7700g/p99005/vv5;", "i", "", "beginIndex", "endIndex", "U3", "(II)Lcom/p7700g/p99005/vv5;", "pos", "", "U", "(I)B", "E", "()I", "", com.anythink.expressad.d.a.b.Z, "()[B", "Ljava/nio/ByteBuffer;", com.anythink.basead.d.g.i, "()Ljava/nio/ByteBuffer;", "Ljava/io/OutputStream;", "out", "Lcom/p7700g/p99005/yq4;", "q4", "(Ljava/io/OutputStream;)V", "Lcom/p7700g/p99005/sv5;", "buffer", "offset", "byteCount", "w4", "(Lcom/p7700g/p99005/sv5;II)V", "other", "otherOffset", "", com.anythink.expressad.foundation.g.a.M, "(ILcom/p7700g/p99005/vv5;II)Z", "i3", "(I[BII)Z", "fromIndex", "Q", "([BI)I", "w0", "T", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "", "z", "[I", "y4", "()[I", "directory", "", "y", "[[B", "B4", "()[[B", "segments", "<init>", "([[B[I)V", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class uw5 extends vv5 {
    @NotNull
    private final transient byte[][] y;
    @NotNull
    private final transient int[] z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw5(@NotNull byte[][] bArr, @NotNull int[] iArr) {
        super(vv5.t.B());
        c25.p(bArr, "segments");
        c25.p(iArr, "directory");
        this.y = bArr;
        this.z = iArr;
    }

    private final vv5 D4() {
        return new vv5(n4());
    }

    private final Object E4() {
        vv5 D4 = D4();
        Objects.requireNonNull(D4, "null cannot be cast to non-null type java.lang.Object");
        return D4;
    }

    @NotNull
    public final byte[][] B4() {
        return this.y;
    }

    @Override // com.p7700g.p99005.vv5
    public int E() {
        return y4()[B4().length - 1];
    }

    @Override // com.p7700g.p99005.vv5
    @NotNull
    public String H() {
        return D4().H();
    }

    @Override // com.p7700g.p99005.vv5
    @NotNull
    public vv5 I(@NotNull String str, @NotNull vv5 vv5Var) {
        c25.p(str, "algorithm");
        c25.p(vv5Var, "key");
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(vv5Var.n4(), str));
            int length = B4().length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = y4()[length + i];
                int i4 = y4()[i];
                mac.update(B4()[i], i3, i4 - i2);
                i++;
                i2 = i4;
            }
            byte[] doFinal = mac.doFinal();
            c25.o(doFinal, "mac.doFinal()");
            return new vv5(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // com.p7700g.p99005.vv5
    @NotNull
    public String I3(@NotNull Charset charset) {
        c25.p(charset, "charset");
        return D4().I3(charset);
    }

    @Override // com.p7700g.p99005.vv5
    public int Q(@NotNull byte[] bArr, int i) {
        c25.p(bArr, "other");
        return D4().Q(bArr, i);
    }

    @Override // com.p7700g.p99005.vv5
    @NotNull
    public byte[] T() {
        return n4();
    }

    @Override // com.p7700g.p99005.vv5
    public byte U(int i) {
        pv5.e(y4()[B4().length - 1], i, 1L);
        int n = fx5.n(this, i);
        return B4()[n][(i - (n == 0 ? 0 : y4()[n - 1])) + y4()[B4().length + n]];
    }

    @Override // com.p7700g.p99005.vv5
    @NotNull
    public vv5 U3(int i, int i2) {
        if (i >= 0) {
            if (!(i2 <= C3())) {
                StringBuilder H = wo1.H("endIndex=", i2, " > length(");
                H.append(C3());
                H.append(')');
                throw new IllegalArgumentException(H.toString().toString());
            }
            int i3 = i2 - i;
            if (i3 >= 0) {
                if (i == 0 && i2 == C3()) {
                    return this;
                }
                if (i == i2) {
                    return vv5.t;
                }
                int n = fx5.n(this, i);
                int n2 = fx5.n(this, i2 - 1);
                byte[][] bArr = (byte[][]) zr4.M1(B4(), n, n2 + 1);
                int[] iArr = new int[bArr.length * 2];
                if (n <= n2) {
                    int i4 = 0;
                    int i5 = n;
                    while (true) {
                        iArr[i4] = Math.min(y4()[i5] - i, i3);
                        int i6 = i4 + 1;
                        iArr[i4 + bArr.length] = y4()[B4().length + i5];
                        if (i5 == n2) {
                            break;
                        }
                        i5++;
                        i4 = i6;
                    }
                }
                int i7 = n != 0 ? y4()[n - 1] : 0;
                int length = bArr.length;
                iArr[length] = (i - i7) + iArr[length];
                return new uw5(bArr, iArr);
            }
            throw new IllegalArgumentException(wo1.o("endIndex=", i2, " < beginIndex=", i).toString());
        }
        throw new IllegalArgumentException(wo1.n("beginIndex=", i, " < 0").toString());
    }

    @Override // com.p7700g.p99005.vv5
    public boolean d3(int i, @NotNull vv5 vv5Var, int i2, int i3) {
        c25.p(vv5Var, "other");
        if (i < 0 || i > C3() - i3) {
            return false;
        }
        int i4 = i3 + i;
        int n = fx5.n(this, i);
        while (i < i4) {
            int i5 = n == 0 ? 0 : y4()[n - 1];
            int i6 = y4()[B4().length + n];
            int min = Math.min(i4, (y4()[n] - i5) + i5) - i;
            if (!vv5Var.i3(i2, B4()[n], (i - i5) + i6, min)) {
                return false;
            }
            i2 += min;
            i += min;
            n++;
        }
        return true;
    }

    @Override // com.p7700g.p99005.vv5
    @NotNull
    public vv5 e4() {
        return D4().e4();
    }

    @Override // com.p7700g.p99005.vv5
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vv5) {
            vv5 vv5Var = (vv5) obj;
            if (vv5Var.C3() == C3() && d3(0, vv5Var, 0, C3())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p7700g.p99005.vv5
    @NotNull
    public ByteBuffer g() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(n4()).asReadOnlyBuffer();
        c25.o(asReadOnlyBuffer, "ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer()");
        return asReadOnlyBuffer;
    }

    @Override // com.p7700g.p99005.vv5
    @NotNull
    public vv5 g4() {
        return D4().g4();
    }

    @Override // com.p7700g.p99005.vv5
    @NotNull
    public String h() {
        return D4().h();
    }

    @Override // com.p7700g.p99005.vv5
    public int hashCode() {
        int D = D();
        if (D != 0) {
            return D;
        }
        int length = B4().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = y4()[length + i];
            int i5 = y4()[i];
            byte[] bArr = B4()[i];
            int i6 = (i5 - i3) + i4;
            while (i4 < i6) {
                i2 = (i2 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i3 = i5;
        }
        n3(i2);
        return i2;
    }

    @Override // com.p7700g.p99005.vv5
    @NotNull
    public String i() {
        return D4().i();
    }

    @Override // com.p7700g.p99005.vv5
    public boolean i3(int i, @NotNull byte[] bArr, int i2, int i3) {
        c25.p(bArr, "other");
        if (i < 0 || i > C3() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int n = fx5.n(this, i);
        while (i < i4) {
            int i5 = n == 0 ? 0 : y4()[n - 1];
            int i6 = y4()[B4().length + n];
            int min = Math.min(i4, (y4()[n] - i5) + i5) - i;
            if (!pv5.d(B4()[n], (i - i5) + i6, bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            n++;
        }
        return true;
    }

    @Override // com.p7700g.p99005.vv5
    @NotNull
    public byte[] n4() {
        byte[] bArr = new byte[C3()];
        int length = B4().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = y4()[length + i];
            int i5 = y4()[i];
            int i6 = i5 - i2;
            zr4.W0(B4()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // com.p7700g.p99005.vv5
    @NotNull
    public vv5 p(@NotNull String str) {
        c25.p(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = B4().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = y4()[length + i];
            int i4 = y4()[i];
            messageDigest.update(B4()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = messageDigest.digest();
        c25.o(digest, "digestBytes");
        return new vv5(digest);
    }

    @Override // com.p7700g.p99005.vv5
    public void q4(@NotNull OutputStream outputStream) throws IOException {
        c25.p(outputStream, "out");
        int length = B4().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = y4()[length + i];
            int i4 = y4()[i];
            outputStream.write(B4()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
    }

    @Override // com.p7700g.p99005.vv5
    @NotNull
    public String toString() {
        return D4().toString();
    }

    @Override // com.p7700g.p99005.vv5
    public int w0(@NotNull byte[] bArr, int i) {
        c25.p(bArr, "other");
        return D4().w0(bArr, i);
    }

    @Override // com.p7700g.p99005.vv5
    public void w4(@NotNull sv5 sv5Var, int i, int i2) {
        c25.p(sv5Var, "buffer");
        int i3 = i + i2;
        int n = fx5.n(this, i);
        while (i < i3) {
            int i4 = n == 0 ? 0 : y4()[n - 1];
            int i5 = y4()[B4().length + n];
            int min = Math.min(i3, (y4()[n] - i4) + i4) - i;
            int i6 = (i - i4) + i5;
            sw5 sw5Var = new sw5(B4()[n], i6, i6 + min, true, false);
            sw5 sw5Var2 = sv5Var.s;
            if (sw5Var2 == null) {
                sw5Var.j = sw5Var;
                sw5Var.i = sw5Var;
                sv5Var.s = sw5Var;
            } else {
                c25.m(sw5Var2);
                sw5 sw5Var3 = sw5Var2.j;
                c25.m(sw5Var3);
                sw5Var3.c(sw5Var);
            }
            i += min;
            n++;
        }
        sv5Var.v2(sv5Var.z2() + i2);
    }

    @NotNull
    public final int[] y4() {
        return this.z;
    }
}