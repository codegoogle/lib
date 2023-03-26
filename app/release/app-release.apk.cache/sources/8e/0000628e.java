package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.anythink.core.api.ATAdConst;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ByteString.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0016\u0018\u0000 t2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001uB\u0011\b\u0000\u0012\u0006\u0010k\u001a\u000204¢\u0006\u0004\br\u0010sJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\r\u0010\u0014\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\r\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\fH\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0000H\u0016¢\u0006\u0004\b \u0010\u001eJ\u001f\u0010!\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0000H\u0010¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010\u000eJ\u000f\u0010$\u001a\u00020\fH\u0016¢\u0006\u0004\b$\u0010\u000eJ\u000f\u0010%\u001a\u00020\u0000H\u0016¢\u0006\u0004\b%\u0010\u0015J\u000f\u0010&\u001a\u00020\u0000H\u0016¢\u0006\u0004\b&\u0010\u0015J#\u0010*\u001a\u00020\u00002\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020'H\u0017¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020'H\u0010¢\u0006\u0004\b.\u0010/J\u0018\u00101\u001a\u00020-2\u0006\u00100\u001a\u00020'H\u0087\u0002¢\u0006\u0004\b1\u0010/J\u000f\u00102\u001a\u00020'H\u0010¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u000204H\u0010¢\u0006\u0004\b7\u00106J\u000f\u00109\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J'\u0010B\u001a\u00020\u00052\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020'2\u0006\u0010A\u001a\u00020'H\u0010¢\u0006\u0004\bB\u0010CJ/\u0010G\u001a\u00020F2\u0006\u0010@\u001a\u00020'2\u0006\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020'2\u0006\u0010A\u001a\u00020'H\u0016¢\u0006\u0004\bG\u0010HJ/\u0010I\u001a\u00020F2\u0006\u0010@\u001a\u00020'2\u0006\u0010D\u001a\u0002042\u0006\u0010E\u001a\u00020'2\u0006\u0010A\u001a\u00020'H\u0016¢\u0006\u0004\bI\u0010JJ\u0015\u0010L\u001a\u00020F2\u0006\u0010K\u001a\u00020\u0000¢\u0006\u0004\bL\u0010MJ\u0015\u0010N\u001a\u00020F2\u0006\u0010K\u001a\u000204¢\u0006\u0004\bN\u0010OJ\u0015\u0010Q\u001a\u00020F2\u0006\u0010P\u001a\u00020\u0000¢\u0006\u0004\bQ\u0010MJ\u0015\u0010R\u001a\u00020F2\u0006\u0010P\u001a\u000204¢\u0006\u0004\bR\u0010OJ!\u0010T\u001a\u00020'2\u0006\u0010D\u001a\u00020\u00002\b\b\u0002\u0010S\u001a\u00020'H\u0007¢\u0006\u0004\bT\u0010UJ!\u0010V\u001a\u00020'2\u0006\u0010D\u001a\u0002042\b\b\u0002\u0010S\u001a\u00020'H\u0017¢\u0006\u0004\bV\u0010WJ!\u0010X\u001a\u00020'2\u0006\u0010D\u001a\u00020\u00002\b\b\u0002\u0010S\u001a\u00020'H\u0007¢\u0006\u0004\bX\u0010UJ!\u0010Y\u001a\u00020'2\u0006\u0010D\u001a\u0002042\b\b\u0002\u0010S\u001a\u00020'H\u0017¢\u0006\u0004\bY\u0010WJ\u001a\u0010[\u001a\u00020F2\b\u0010D\u001a\u0004\u0018\u00010ZH\u0096\u0002¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020'H\u0016¢\u0006\u0004\b]\u00103J\u0018\u0010^\u001a\u00020'2\u0006\u0010D\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020\fH\u0016¢\u0006\u0004\b`\u0010\u000eJ\u0017\u0010a\u001a\u00020-2\u0006\u00100\u001a\u00020'H\u0007¢\u0006\u0004\ba\u0010/J\u000f\u0010b\u001a\u00020'H\u0007¢\u0006\u0004\bb\u00103R$\u0010h\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010\u000e\"\u0004\bf\u0010gR\u001c\u0010k\u001a\u0002048\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bQ\u0010i\u001a\u0004\bj\u00106R\u0013\u0010m\u001a\u00020'8G@\u0006¢\u0006\u0006\u001a\u0004\bl\u00103R\"\u0010]\u001a\u00020'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bn\u0010!\u001a\u0004\bo\u00103\"\u0004\bp\u0010q¨\u0006v"}, d2 = {"Lcom/p7700g/p99005/vv5;", "Ljava/io/Serializable;", "", "Ljava/io/ObjectInputStream;", "in", "Lcom/p7700g/p99005/yq4;", "k3", "(Ljava/io/ObjectInputStream;)V", "Ljava/io/ObjectOutputStream;", "out", "x4", "(Ljava/io/ObjectOutputStream;)V", "", "p4", "()Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "I3", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "h", "c1", "()Lcom/p7700g/p99005/vv5;", "t3", "w3", "x3", "algorithm", "p", "(Ljava/lang/String;)Lcom/p7700g/p99005/vv5;", "key", "J", "(Lcom/p7700g/p99005/vv5;)Lcom/p7700g/p99005/vv5;", "L", "M", AFHydra.STATUS_IDLE, "(Ljava/lang/String;Lcom/p7700g/p99005/vv5;)Lcom/p7700g/p99005/vv5;", "i", "H", "e4", "g4", "", "beginIndex", "endIndex", "U3", "(II)Lcom/p7700g/p99005/vv5;", "pos", "", "U", "(I)B", la1.l, bx.B4, "E", "()I", "", com.anythink.expressad.d.a.b.Z, "()[B", "T", "Ljava/nio/ByteBuffer;", com.anythink.basead.d.g.i, "()Ljava/nio/ByteBuffer;", "Ljava/io/OutputStream;", "q4", "(Ljava/io/OutputStream;)V", "Lcom/p7700g/p99005/sv5;", "buffer", "offset", "byteCount", "w4", "(Lcom/p7700g/p99005/sv5;II)V", "other", "otherOffset", "", com.anythink.expressad.foundation.g.a.M, "(ILcom/p7700g/p99005/vv5;II)Z", "i3", "(I[BII)Z", "prefix", "E3", "(Lcom/p7700g/p99005/vv5;)Z", "G3", "([B)Z", "suffix", "x", "y", "fromIndex", "O", "(Lcom/p7700g/p99005/vv5;I)I", "Q", "([BI)I", "X", "w0", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", com.anythink.expressad.d.a.b.dH, "(Lcom/p7700g/p99005/vv5;)I", "toString", "b", "f", "w", "Ljava/lang/String;", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "p3", "(Ljava/lang/String;)V", "utf8", "[B", AFHydra.EV_BYTECOUNT, "data", "C3", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, com.ironsource.sdk.controller.v.a, "D", com.anythink.expressad.d.a.b.Y, "(I)V", "<init>", "([B)V", "u", "a", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public class vv5 implements Serializable, Comparable<vv5> {
    private static final long s = 1;
    private transient int v;
    @Nullable
    private transient String w;
    @NotNull
    private final byte[] x;
    @NotNull
    public static final a u = new a(null);
    @cz4
    @NotNull
    public static final vv5 t = new vv5(new byte[0]);

    /* compiled from: ByteString.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b,\u0010-J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00020\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\u0005*\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0005*\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u0005*\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0005*\u00020\u0010H\u0007¢\u0006\u0004\b\u0017\u0010\u0012J\u0013\u0010\u0018\u001a\u00020\u0005*\u00020\u0010H\u0007¢\u0006\u0004\b\u0018\u0010\u0012J\u001b\u0010\u001a\u001a\u00020\u0005*\u00020\u00192\u0006\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001c\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001d\u0010\u0012J\u0017\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001e\u0010\u0012J\u001f\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001f\u0010\u0016J\u0017\u0010 \u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0010H\u0007¢\u0006\u0004\b \u0010\u0012J\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\rH\u0007¢\u0006\u0004\b\"\u0010\u000fJ'\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0004\b$\u0010\fJ\u001f\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0004\b&\u0010\u001bR\u0016\u0010'\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, d2 = {"com/p7700g/p99005/vv5$a", "", "", "", "data", "Lcom/p7700g/p99005/vv5;", "n", "([B)Lcom/p7700g/p99005/vv5;", "", "offset", "byteCount", ij3.b, "([BII)Lcom/p7700g/p99005/vv5;", "Ljava/nio/ByteBuffer;", com.anythink.expressad.d.a.b.dH, "(Ljava/nio/ByteBuffer;)Lcom/p7700g/p99005/vv5;", "", "l", "(Ljava/lang/String;)Lcom/p7700g/p99005/vv5;", "Ljava/nio/charset/Charset;", "charset", "j", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lcom/p7700g/p99005/vv5;", "h", "i", "Ljava/io/InputStream;", "q", "(Ljava/io/InputStream;I)Lcom/p7700g/p99005/vv5;", "string", "a", "b", "c", "d", "buffer", "e", "array", "f", "inputstream", com.anythink.basead.d.g.i, "EMPTY", "Lcom/p7700g/p99005/vv5;", "", "serialVersionUID", "J", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public static /* synthetic */ vv5 k(a aVar, String str, Charset charset, int i, Object obj) {
            if ((i & 1) != 0) {
                charset = f85.b;
            }
            return aVar.j(str, charset);
        }

        public static /* synthetic */ vv5 p(a aVar, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = bArr.length;
            }
            return aVar.o(bArr, i, i2);
        }

        @fz4(name = "-deprecated_decodeBase64")
        @xn4(level = zn4.ERROR, message = "moved to extension function", replaceWith = @op4(expression = "string.decodeBase64()", imports = {"okio.ByteString.Companion.decodeBase64"}))
        @Nullable
        public final vv5 a(@NotNull String str) {
            c25.p(str, "string");
            return h(str);
        }

        @fz4(name = "-deprecated_decodeHex")
        @xn4(level = zn4.ERROR, message = "moved to extension function", replaceWith = @op4(expression = "string.decodeHex()", imports = {"okio.ByteString.Companion.decodeHex"}))
        @NotNull
        public final vv5 b(@NotNull String str) {
            c25.p(str, "string");
            return i(str);
        }

        @fz4(name = "-deprecated_encodeString")
        @xn4(level = zn4.ERROR, message = "moved to extension function", replaceWith = @op4(expression = "string.encode(charset)", imports = {"okio.ByteString.Companion.encode"}))
        @NotNull
        public final vv5 c(@NotNull String str, @NotNull Charset charset) {
            c25.p(str, "string");
            c25.p(charset, "charset");
            return j(str, charset);
        }

        @fz4(name = "-deprecated_encodeUtf8")
        @xn4(level = zn4.ERROR, message = "moved to extension function", replaceWith = @op4(expression = "string.encodeUtf8()", imports = {"okio.ByteString.Companion.encodeUtf8"}))
        @NotNull
        public final vv5 d(@NotNull String str) {
            c25.p(str, "string");
            return l(str);
        }

        @fz4(name = "-deprecated_of")
        @xn4(level = zn4.ERROR, message = "moved to extension function", replaceWith = @op4(expression = "buffer.toByteString()", imports = {"okio.ByteString.Companion.toByteString"}))
        @NotNull
        public final vv5 e(@NotNull ByteBuffer byteBuffer) {
            c25.p(byteBuffer, "buffer");
            return m(byteBuffer);
        }

        @fz4(name = "-deprecated_of")
        @xn4(level = zn4.ERROR, message = "moved to extension function", replaceWith = @op4(expression = "array.toByteString(offset, byteCount)", imports = {"okio.ByteString.Companion.toByteString"}))
        @NotNull
        public final vv5 f(@NotNull byte[] bArr, int i, int i2) {
            c25.p(bArr, "array");
            return o(bArr, i, i2);
        }

        @fz4(name = "-deprecated_read")
        @xn4(level = zn4.ERROR, message = "moved to extension function", replaceWith = @op4(expression = "inputstream.readByteString(byteCount)", imports = {"okio.ByteString.Companion.readByteString"}))
        @NotNull
        public final vv5 g(@NotNull InputStream inputStream, int i) {
            c25.p(inputStream, "inputstream");
            return q(inputStream, i);
        }

        @jz4
        @Nullable
        public final vv5 h(@NotNull String str) {
            c25.p(str, "$this$decodeBase64");
            byte[] a = gv5.a(str);
            if (a != null) {
                return new vv5(a);
            }
            return null;
        }

        @jz4
        @NotNull
        public final vv5 i(@NotNull String str) {
            c25.p(str, "$this$decodeHex");
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    bArr[i] = (byte) (cx5.b(str.charAt(i2 + 1)) + (cx5.b(str.charAt(i2)) << 4));
                }
                return new vv5(bArr);
            }
            throw new IllegalArgumentException(wo1.t("Unexpected hex string: ", str).toString());
        }

        @fz4(name = "encodeString")
        @jz4
        @NotNull
        public final vv5 j(@NotNull String str, @NotNull Charset charset) {
            c25.p(str, "$this$encode");
            c25.p(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            c25.o(bytes, "(this as java.lang.String).getBytes(charset)");
            return new vv5(bytes);
        }

        @jz4
        @NotNull
        public final vv5 l(@NotNull String str) {
            c25.p(str, "$this$encodeUtf8");
            vv5 vv5Var = new vv5(ov5.a(str));
            vv5Var.p3(str);
            return vv5Var;
        }

        @fz4(name = "of")
        @jz4
        @NotNull
        public final vv5 m(@NotNull ByteBuffer byteBuffer) {
            c25.p(byteBuffer, "$this$toByteString");
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new vv5(bArr);
        }

        @jz4
        @NotNull
        public final vv5 n(@NotNull byte... bArr) {
            c25.p(bArr, "data");
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            c25.o(copyOf, "java.util.Arrays.copyOf(this, size)");
            return new vv5(copyOf);
        }

        @fz4(name = "of")
        @jz4
        @NotNull
        public final vv5 o(@NotNull byte[] bArr, int i, int i2) {
            c25.p(bArr, "$this$toByteString");
            pv5.e(bArr.length, i, i2);
            return new vv5(zr4.G1(bArr, i, i2 + i));
        }

        @fz4(name = "read")
        @jz4
        @NotNull
        public final vv5 q(@NotNull InputStream inputStream, int i) throws IOException {
            c25.p(inputStream, "$this$readByteString");
            int i2 = 0;
            if (i >= 0) {
                byte[] bArr = new byte[i];
                while (i2 < i) {
                    int read = inputStream.read(bArr, i2, i - i2);
                    if (read == -1) {
                        throw new EOFException();
                    }
                    i2 += read;
                }
                return new vv5(bArr);
            }
            throw new IllegalArgumentException(wo1.l("byteCount < 0: ", i).toString());
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public vv5(@NotNull byte[] bArr) {
        c25.p(bArr, "data");
        this.x = bArr;
    }

    @jz4
    @NotNull
    public static final vv5 D1(@NotNull byte... bArr) {
        return u.n(bArr);
    }

    public static /* synthetic */ int R(vv5 vv5Var, vv5 vv5Var2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return vv5Var.O(vv5Var2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ int S(vv5 vv5Var, byte[] bArr, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return vv5Var.Q(bArr, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ vv5 W3(vv5 vv5Var, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = vv5Var.C3();
            }
            return vv5Var.U3(i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }

    public static /* synthetic */ int X0(vv5 vv5Var, byte[] bArr, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = vv5Var.C3();
            }
            return vv5Var.w0(bArr, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    @fz4(name = "of")
    @jz4
    @NotNull
    public static final vv5 X2(@NotNull byte[] bArr, int i, int i2) {
        return u.o(bArr, i, i2);
    }

    @fz4(name = "of")
    @jz4
    @NotNull
    public static final vv5 d1(@NotNull ByteBuffer byteBuffer) {
        return u.m(byteBuffer);
    }

    @fz4(name = "read")
    @jz4
    @NotNull
    public static final vv5 j3(@NotNull InputStream inputStream, int i) throws IOException {
        return u.q(inputStream, i);
    }

    private final void k3(ObjectInputStream objectInputStream) throws IOException {
        vv5 q = u.q(objectInputStream, objectInputStream.readInt());
        Field declaredField = vv5.class.getDeclaredField("x");
        c25.o(declaredField, "field");
        declaredField.setAccessible(true);
        declaredField.set(this, q.x);
    }

    @jz4
    @Nullable
    public static final vv5 n(@NotNull String str) {
        return u.h(str);
    }

    @jz4
    @NotNull
    public static final vv5 o(@NotNull String str) {
        return u.i(str);
    }

    @fz4(name = "encodeString")
    @jz4
    @NotNull
    public static final vv5 t(@NotNull String str, @NotNull Charset charset) {
        return u.j(str, charset);
    }

    @jz4
    @NotNull
    public static final vv5 u(@NotNull String str) {
        return u.l(str);
    }

    public static /* synthetic */ int x0(vv5 vv5Var, vv5 vv5Var2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = vv5Var.C3();
            }
            return vv5Var.X(vv5Var2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    private final void x4(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.x.length);
        objectOutputStream.write(this.x);
    }

    @fz4(name = "getByte")
    public final byte A(int i) {
        return U(i);
    }

    @NotNull
    public final byte[] B() {
        return this.x;
    }

    @fz4(name = ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE)
    public final int C3() {
        return E();
    }

    public final int D() {
        return this.v;
    }

    public int E() {
        return B().length;
    }

    public final boolean E3(@NotNull vv5 vv5Var) {
        c25.p(vv5Var, "prefix");
        return d3(0, vv5Var, 0, vv5Var.C3());
    }

    @Nullable
    public final String G() {
        return this.w;
    }

    public final boolean G3(@NotNull byte[] bArr) {
        c25.p(bArr, "prefix");
        return i3(0, bArr, 0, bArr.length);
    }

    @NotNull
    public String H() {
        byte[] B;
        char[] cArr = new char[B().length * 2];
        int i = 0;
        for (byte b : B()) {
            int i2 = i + 1;
            cArr[i] = cx5.I()[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cx5.I()[b & 15];
        }
        return new String(cArr);
    }

    @NotNull
    public vv5 I(@NotNull String str, @NotNull vv5 vv5Var) {
        c25.p(str, "algorithm");
        c25.p(vv5Var, "key");
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(vv5Var.n4(), str));
            byte[] doFinal = mac.doFinal(this.x);
            c25.o(doFinal, "mac.doFinal(data)");
            return new vv5(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @NotNull
    public String I3(@NotNull Charset charset) {
        c25.p(charset, "charset");
        return new String(this.x, charset);
    }

    @NotNull
    public vv5 J(@NotNull vv5 vv5Var) {
        c25.p(vv5Var, "key");
        return I("HmacSHA1", vv5Var);
    }

    @NotNull
    public vv5 L(@NotNull vv5 vv5Var) {
        c25.p(vv5Var, "key");
        return I("HmacSHA256", vv5Var);
    }

    @NotNull
    public vv5 M(@NotNull vv5 vv5Var) {
        c25.p(vv5Var, "key");
        return I("HmacSHA512", vv5Var);
    }

    @gz4
    public final int N(@NotNull vv5 vv5Var) {
        return R(this, vv5Var, 0, 2, null);
    }

    @gz4
    @NotNull
    public final vv5 N3() {
        return W3(this, 0, 0, 3, null);
    }

    @gz4
    public final int O(@NotNull vv5 vv5Var, int i) {
        c25.p(vv5Var, "other");
        return Q(vv5Var.T(), i);
    }

    @gz4
    public final int P(@NotNull byte[] bArr) {
        return S(this, bArr, 0, 2, null);
    }

    @gz4
    public int Q(@NotNull byte[] bArr, int i) {
        c25.p(bArr, "other");
        int length = B().length - bArr.length;
        int max = Math.max(i, 0);
        if (max <= length) {
            while (!pv5.d(B(), max, bArr, 0, bArr.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    @gz4
    @NotNull
    public final vv5 S3(int i) {
        return W3(this, i, 0, 2, null);
    }

    @NotNull
    public byte[] T() {
        return B();
    }

    public byte U(int i) {
        return B()[i];
    }

    @gz4
    @NotNull
    public vv5 U3(int i, int i2) {
        if (i >= 0) {
            if (i2 <= B().length) {
                if (i2 - i >= 0) {
                    return (i == 0 && i2 == B().length) ? this : new vv5(zr4.G1(B(), i, i2));
                }
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            }
            throw new IllegalArgumentException(wo1.y(wo1.G("endIndex > length("), B().length, ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0".toString());
    }

    @gz4
    public final int V(@NotNull vv5 vv5Var) {
        return x0(this, vv5Var, 0, 2, null);
    }

    @gz4
    public final int X(@NotNull vv5 vv5Var, int i) {
        c25.p(vv5Var, "other");
        return w0(vv5Var.T(), i);
    }

    @gz4
    public final int Z(@NotNull byte[] bArr) {
        return X0(this, bArr, 0, 2, null);
    }

    @fz4(name = "-deprecated_getByte")
    @xn4(level = zn4.ERROR, message = "moved to operator function", replaceWith = @op4(expression = "this[index]", imports = {}))
    public final byte b(int i) {
        return A(i);
    }

    @NotNull
    public final vv5 c1() {
        return p("MD5");
    }

    public boolean d3(int i, @NotNull vv5 vv5Var, int i2, int i3) {
        c25.p(vv5Var, "other");
        return vv5Var.i3(i2, B(), i, i3);
    }

    @NotNull
    public vv5 e4() {
        byte b;
        for (int i = 0; i < B().length; i++) {
            byte b2 = B()[i];
            byte b3 = (byte) 65;
            if (b2 >= b3 && b2 <= (b = (byte) 90)) {
                byte[] B = B();
                byte[] copyOf = Arrays.copyOf(B, B.length);
                c25.o(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new vv5(copyOf);
            }
        }
        return this;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vv5) {
            vv5 vv5Var = (vv5) obj;
            if (vv5Var.C3() == B().length && vv5Var.i3(0, B(), 0, B().length)) {
                return true;
            }
        }
        return false;
    }

    @fz4(name = "-deprecated_size")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, imports = {}))
    public final int f() {
        return C3();
    }

    @NotNull
    public ByteBuffer g() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(this.x).asReadOnlyBuffer();
        c25.o(asReadOnlyBuffer, "ByteBuffer.wrap(data).asReadOnlyBuffer()");
        return asReadOnlyBuffer;
    }

    @NotNull
    public vv5 g4() {
        byte b;
        for (int i = 0; i < B().length; i++) {
            byte b2 = B()[i];
            byte b3 = (byte) 97;
            if (b2 >= b3 && b2 <= (b = (byte) 122)) {
                byte[] B = B();
                byte[] copyOf = Arrays.copyOf(B, B.length);
                c25.o(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 - 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 - 32);
                    }
                }
                return new vv5(copyOf);
            }
        }
        return this;
    }

    @NotNull
    public String h() {
        return gv5.c(B(), null, 1, null);
    }

    public int hashCode() {
        int D = D();
        if (D != 0) {
            return D;
        }
        int hashCode = Arrays.hashCode(B());
        n3(hashCode);
        return hashCode;
    }

    @NotNull
    public String i() {
        return gv5.b(B(), gv5.e());
    }

    public boolean i3(int i, @NotNull byte[] bArr, int i2, int i3) {
        c25.p(bArr, "other");
        return i >= 0 && i <= B().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && pv5.d(B(), i, bArr, i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int compareTo(@NotNull vv5 vv5Var) {
        c25.p(vv5Var, "other");
        int C3 = C3();
        int C32 = vv5Var.C3();
        int min = Math.min(C3, C32);
        for (int i = 0; i < min; i++) {
            int A = A(i) & 255;
            int A2 = vv5Var.A(i) & 255;
            if (A != A2) {
                return A < A2 ? -1 : 1;
            }
        }
        if (C3 == C32) {
            return 0;
        }
        if (C3 < C32) {
        }
    }

    public final void n3(int i) {
        this.v = i;
    }

    @NotNull
    public byte[] n4() {
        byte[] B = B();
        byte[] copyOf = Arrays.copyOf(B, B.length);
        c25.o(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    @NotNull
    public vv5 p(@NotNull String str) {
        c25.p(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.x, 0, C3());
        byte[] digest = messageDigest.digest();
        c25.o(digest, "digestBytes");
        return new vv5(digest);
    }

    public final void p3(@Nullable String str) {
        this.w = str;
    }

    @NotNull
    public String p4() {
        String G = G();
        if (G == null) {
            String c = ov5.c(T());
            p3(c);
            return c;
        }
        return G;
    }

    public void q4(@NotNull OutputStream outputStream) throws IOException {
        c25.p(outputStream, "out");
        outputStream.write(this.x);
    }

    @NotNull
    public final vv5 t3() {
        return p("SHA-1");
    }

    @NotNull
    public String toString() {
        if (B().length == 0) {
            return "[size=0]";
        }
        int a2 = cx5.a(B(), 64);
        if (a2 == -1) {
            if (B().length <= 64) {
                StringBuilder G = wo1.G("[hex=");
                G.append(H());
                G.append(f14.v);
                return G.toString();
            }
            StringBuilder G2 = wo1.G("[size=");
            G2.append(B().length);
            G2.append(" hex=");
            if (64 <= B().length) {
                G2.append((64 == B().length ? this : new vv5(zr4.G1(B(), 0, 64))).H());
                G2.append("…]");
                return G2.toString();
            }
            throw new IllegalArgumentException(wo1.y(wo1.G("endIndex > length("), B().length, ')').toString());
        }
        String p4 = p4();
        Objects.requireNonNull(p4, "null cannot be cast to non-null type java.lang.String");
        String substring = p4.substring(0, a2);
        c25.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        String k2 = b95.k2(b95.k2(b95.k2(substring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
        if (a2 < p4.length()) {
            StringBuilder G3 = wo1.G("[size=");
            G3.append(B().length);
            G3.append(" text=");
            G3.append(k2);
            G3.append("…]");
            return G3.toString();
        }
        return "[text=" + k2 + f14.v;
    }

    @gz4
    public int w0(@NotNull byte[] bArr, int i) {
        c25.p(bArr, "other");
        for (int min = Math.min(i, B().length - bArr.length); min >= 0; min--) {
            if (pv5.d(B(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    @NotNull
    public final vv5 w3() {
        return p("SHA-256");
    }

    public void w4(@NotNull sv5 sv5Var, int i, int i2) {
        c25.p(sv5Var, "buffer");
        cx5.G(this, sv5Var, i, i2);
    }

    public final boolean x(@NotNull vv5 vv5Var) {
        c25.p(vv5Var, "suffix");
        return d3(C3() - vv5Var.C3(), vv5Var, 0, vv5Var.C3());
    }

    @NotNull
    public final vv5 x3() {
        return p("SHA-512");
    }

    public final boolean y(@NotNull byte[] bArr) {
        c25.p(bArr, "suffix");
        return i3(C3() - bArr.length, bArr, 0, bArr.length);
    }
}