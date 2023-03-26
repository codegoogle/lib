package com.p7700g.p99005;

import com.p7700g.p99005.rs2;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;

/* compiled from: BufferedSink.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u0016H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010!\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\nH&¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\nH&¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020&H&¢\u0006\u0004\b(\u0010)J/\u0010*\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\n2\u0006\u0010'\u001a\u00020&H&¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\nH&¢\u0006\u0004\b-\u0010%J\u0017\u0010/\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\nH&¢\u0006\u0004\b/\u0010%J\u0017\u00100\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\nH&¢\u0006\u0004\b0\u0010%J\u0017\u00102\u001a\u00020\u00002\u0006\u00101\u001a\u00020\nH&¢\u0006\u0004\b2\u0010%J\u0017\u00103\u001a\u00020\u00002\u0006\u00101\u001a\u00020\nH&¢\u0006\u0004\b3\u0010%J\u0017\u00105\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u0016H&¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u0016H&¢\u0006\u0004\b7\u00106J\u0017\u00108\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u0016H&¢\u0006\u0004\b8\u00106J\u0017\u00109\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u0016H&¢\u0006\u0004\b9\u00106J\u000f\u0010;\u001a\u00020:H&¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0000H&¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0000H&¢\u0006\u0004\b?\u0010>J\u000f\u0010A\u001a\u00020@H&¢\u0006\u0004\bA\u0010BR\u0016\u0010D\u001a\u00020\u00038&@&X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u0005¨\u0006E"}, d2 = {"Lcom/p7700g/p99005/tv5;", "Lcom/p7700g/p99005/vw5;", "Ljava/nio/channels/WritableByteChannel;", "Lcom/p7700g/p99005/sv5;", "n", "()Lcom/p7700g/p99005/sv5;", "Lcom/p7700g/p99005/vv5;", "byteString", "y1", "(Lcom/p7700g/p99005/vv5;)Lcom/p7700g/p99005/tv5;", "", "offset", "byteCount", "Q", "(Lcom/p7700g/p99005/vv5;II)Lcom/p7700g/p99005/tv5;", "", rs2.f.b, "w1", "([B)Lcom/p7700g/p99005/tv5;", "V0", "([BII)Lcom/p7700g/p99005/tv5;", "Lcom/p7700g/p99005/xw5;", "", "b1", "(Lcom/p7700g/p99005/xw5;)J", "j1", "(Lcom/p7700g/p99005/xw5;J)Lcom/p7700g/p99005/tv5;", "", "string", "K0", "(Ljava/lang/String;)Lcom/p7700g/p99005/tv5;", "beginIndex", "endIndex", "a1", "(Ljava/lang/String;II)Lcom/p7700g/p99005/tv5;", "codePoint", "O", "(I)Lcom/p7700g/p99005/tv5;", "Ljava/nio/charset/Charset;", "charset", "g1", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lcom/p7700g/p99005/tv5;", "M1", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Lcom/p7700g/p99005/tv5;", "b", "g0", "s", "M", "G0", "i", "S", "e0", com.ironsource.sdk.controller.v.a, "O1", "(J)Lcom/p7700g/p99005/tv5;", bx.C4, "Q1", "e1", "Lcom/p7700g/p99005/yq4;", "flush", "()V", "L", "()Lcom/p7700g/p99005/tv5;", "p0", "Ljava/io/OutputStream;", "S1", "()Ljava/io/OutputStream;", ij3.b, "buffer", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public interface tv5 extends vw5, WritableByteChannel {
    @NotNull
    tv5 G0(int i) throws IOException;

    @NotNull
    tv5 K0(@NotNull String str) throws IOException;

    @NotNull
    tv5 L() throws IOException;

    @NotNull
    tv5 M(int i) throws IOException;

    @NotNull
    tv5 M1(@NotNull String str, int i, int i2, @NotNull Charset charset) throws IOException;

    @NotNull
    tv5 O(int i) throws IOException;

    @NotNull
    tv5 O1(long j) throws IOException;

    @NotNull
    tv5 Q(@NotNull vv5 vv5Var, int i, int i2) throws IOException;

    @NotNull
    tv5 Q1(long j) throws IOException;

    @NotNull
    tv5 S(int i) throws IOException;

    @NotNull
    OutputStream S1();

    @NotNull
    tv5 V(long j) throws IOException;

    @NotNull
    tv5 V0(@NotNull byte[] bArr, int i, int i2) throws IOException;

    @NotNull
    tv5 a1(@NotNull String str, int i, int i2) throws IOException;

    long b1(@NotNull xw5 xw5Var) throws IOException;

    @NotNull
    tv5 e0(int i) throws IOException;

    @NotNull
    tv5 e1(long j) throws IOException;

    @Override // com.p7700g.p99005.vw5, java.io.Flushable
    void flush() throws IOException;

    @NotNull
    tv5 g0(int i) throws IOException;

    @NotNull
    tv5 g1(@NotNull String str, @NotNull Charset charset) throws IOException;

    @NotNull
    tv5 j1(@NotNull xw5 xw5Var, long j) throws IOException;

    @xn4(level = zn4.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @op4(expression = "buffer", imports = {}))
    @NotNull
    sv5 n();

    @NotNull
    sv5 o();

    @NotNull
    tv5 p0() throws IOException;

    @NotNull
    tv5 w1(@NotNull byte[] bArr) throws IOException;

    @NotNull
    tv5 y1(@NotNull vv5 vv5Var) throws IOException;
}