package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BufferedSource.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H&¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\tH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH&¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\tH&¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\tH&¢\u0006\u0004\b\u001f\u0010\u001cJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b \u0010\rJ\u000f\u0010\"\u001a\u00020!H&¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020!2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00172\u0006\u0010'\u001a\u00020&H&¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H&¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020*2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00172\u0006\u0010/\u001a\u00020*H&¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020*H&¢\u0006\u0004\b2\u00103J'\u00100\u001a\u00020\u00172\u0006\u0010/\u001a\u00020*2\u0006\u00104\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u0017H&¢\u0006\u0004\b0\u00105J\u001f\u00106\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\t2\u0006\u0010/\u001a\u000208H&¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H&¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020;2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b>\u0010?J\u0011\u0010@\u001a\u0004\u0018\u00010;H&¢\u0006\u0004\b@\u0010=J\u000f\u0010A\u001a\u00020;H&¢\u0006\u0004\bA\u0010=J\u0017\u0010C\u001a\u00020;2\u0006\u0010B\u001a\u00020\tH&¢\u0006\u0004\bC\u0010?J\u000f\u0010D\u001a\u00020\u0017H&¢\u0006\u0004\bD\u0010\u0019J\u0017\u0010G\u001a\u00020;2\u0006\u0010F\u001a\u00020EH&¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u00020;2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010F\u001a\u00020EH&¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020\t2\u0006\u0010K\u001a\u00020\u0010H&¢\u0006\u0004\bL\u0010MJ\u001f\u0010O\u001a\u00020\t2\u0006\u0010K\u001a\u00020\u00102\u0006\u0010N\u001a\u00020\tH&¢\u0006\u0004\bO\u0010PJ'\u0010R\u001a\u00020\t2\u0006\u0010K\u001a\u00020\u00102\u0006\u0010N\u001a\u00020\t2\u0006\u0010Q\u001a\u00020\tH&¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020\t2\u0006\u0010T\u001a\u00020!H&¢\u0006\u0004\bU\u0010VJ\u001f\u0010W\u001a\u00020\t2\u0006\u0010T\u001a\u00020!2\u0006\u0010N\u001a\u00020\tH&¢\u0006\u0004\bW\u0010XJ\u0017\u0010Z\u001a\u00020\t2\u0006\u0010Y\u001a\u00020!H&¢\u0006\u0004\bZ\u0010VJ\u001f\u0010[\u001a\u00020\t2\u0006\u0010Y\u001a\u00020!2\u0006\u0010N\u001a\u00020\tH&¢\u0006\u0004\b[\u0010XJ\u001f\u0010\\\u001a\u00020\u00062\u0006\u00104\u001a\u00020\t2\u0006\u0010T\u001a\u00020!H&¢\u0006\u0004\b\\\u0010]J/\u0010_\u001a\u00020\u00062\u0006\u00104\u001a\u00020\t2\u0006\u0010T\u001a\u00020!2\u0006\u0010^\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u0017H&¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020\u0000H&¢\u0006\u0004\ba\u0010bJ\u000f\u0010d\u001a\u00020cH&¢\u0006\u0004\bd\u0010eR\u0016\u0010g\u001a\u00020\u00038&@&X¦\u0004¢\u0006\u0006\u001a\u0004\bf\u0010\u0005¨\u0006h"}, d2 = {"Lcom/p7700g/p99005/uv5;", "Lcom/p7700g/p99005/xw5;", "Ljava/nio/channels/ReadableByteChannel;", "Lcom/p7700g/p99005/sv5;", "n", "()Lcom/p7700g/p99005/sv5;", "", "f0", "()Z", "", "byteCount", "Lcom/p7700g/p99005/yq4;", "P1", "(J)V", "i1", "(J)Z", "", "readByte", "()B", "", "readShort", "()S", "z1", "", "readInt", "()I", "o1", "readLong", "()J", AFHydra.STATUS_CONNECTED, "q0", "V1", "skip", "Lcom/p7700g/p99005/vv5;", "f1", "()Lcom/p7700g/p99005/vv5;", "D", "(J)Lcom/p7700g/p99005/vv5;", "Lcom/p7700g/p99005/mw5;", "options", "X1", "(Lcom/p7700g/p99005/mw5;)I", "", "b0", "()[B", "r1", "(J)[B", "sink", "read", "([B)I", "readFully", "([B)V", "offset", "([BII)I", "l0", "(Lcom/p7700g/p99005/sv5;J)V", "Lcom/p7700g/p99005/vw5;", "F1", "(Lcom/p7700g/p99005/vw5;)J", "", "u1", "()Ljava/lang/String;", com.anythink.basead.d.g.i, "(J)Ljava/lang/String;", "o0", "m1", "limit", "t0", "Y0", "Ljava/nio/charset/Charset;", "charset", "R0", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "x1", "(JLjava/nio/charset/Charset;)Ljava/lang/String;", "b", "U1", "(B)J", "fromIndex", "k0", "(BJ)J", "toIndex", "m0", "(BJJ)J", "bytes", "d0", "(Lcom/p7700g/p99005/vv5;)J", "i", "(Lcom/p7700g/p99005/vv5;J)J", "targetBytes", "n0", "N1", "Q0", "(JLcom/p7700g/p99005/vv5;)Z", "bytesOffset", "p1", "(JLcom/p7700g/p99005/vv5;II)Z", "p", "()Lcom/p7700g/p99005/uv5;", "Ljava/io/InputStream;", "W1", "()Ljava/io/InputStream;", ij3.b, "buffer", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public interface uv5 extends xw5, ReadableByteChannel {
    long C1() throws IOException;

    @NotNull
    vv5 D(long j) throws IOException;

    long F1(@NotNull vw5 vw5Var) throws IOException;

    long N1(@NotNull vv5 vv5Var, long j) throws IOException;

    void P1(long j) throws IOException;

    boolean Q0(long j, @NotNull vv5 vv5Var) throws IOException;

    @NotNull
    String R0(@NotNull Charset charset) throws IOException;

    long U1(byte b) throws IOException;

    long V1() throws IOException;

    @NotNull
    InputStream W1();

    int X1(@NotNull mw5 mw5Var) throws IOException;

    int Y0() throws IOException;

    @NotNull
    byte[] b0() throws IOException;

    long d0(@NotNull vv5 vv5Var) throws IOException;

    boolean f0() throws IOException;

    @NotNull
    vv5 f1() throws IOException;

    @NotNull
    String g(long j) throws IOException;

    long i(@NotNull vv5 vv5Var, long j) throws IOException;

    boolean i1(long j) throws IOException;

    long k0(byte b, long j) throws IOException;

    void l0(@NotNull sv5 sv5Var, long j) throws IOException;

    long m0(byte b, long j, long j2) throws IOException;

    @NotNull
    String m1() throws IOException;

    @xn4(level = zn4.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @op4(expression = "buffer", imports = {}))
    @NotNull
    sv5 n();

    long n0(@NotNull vv5 vv5Var) throws IOException;

    @NotNull
    sv5 o();

    @Nullable
    String o0() throws IOException;

    int o1() throws IOException;

    @NotNull
    uv5 p();

    boolean p1(long j, @NotNull vv5 vv5Var, int i, int i2) throws IOException;

    long q0() throws IOException;

    @NotNull
    byte[] r1(long j) throws IOException;

    int read(@NotNull byte[] bArr) throws IOException;

    int read(@NotNull byte[] bArr, int i, int i2) throws IOException;

    byte readByte() throws IOException;

    void readFully(@NotNull byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    void skip(long j) throws IOException;

    @NotNull
    String t0(long j) throws IOException;

    @NotNull
    String u1() throws IOException;

    @NotNull
    String x1(long j, @NotNull Charset charset) throws IOException;

    short z1() throws IOException;
}