package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.p7700g.p99005.sv5;
import com.p7700g.p99005.vv5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WebSocketProtocol.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\t\n\u0002\b\u001f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b>\u0010?J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u000b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\t8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\t8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\t8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0016\u0010\u001b\u001a\u00020\t8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0016\u0010\u001d\u001a\u00020\t8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015R\u0016\u0010\u001e\u001a\u00020\t8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0016\u0010 \u001a\u00020\t8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0015R\u0016\u0010$\u001a\u00020!8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\t8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b%\u0010\u0015R\u0016\u0010(\u001a\u00020\t8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b'\u0010\u0015R\u0016\u0010*\u001a\u00020\t8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b)\u0010\u0015R\u0016\u0010,\u001a\u00020\t8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b+\u0010\u0015R\u0016\u0010.\u001a\u00020\t8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b-\u0010\u0015R\u0016\u00100\u001a\u00020\t8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b/\u0010\u0015R\u0016\u00102\u001a\u00020!8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u0010#R\u0016\u00103\u001a\u00020\t8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0016\u00105\u001a\u00020\t8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b4\u0010\u0015R\u0016\u00107\u001a\u00020\t8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b6\u0010\u0015R\u0016\u00109\u001a\u00020\t8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b8\u0010\u0015R\u0016\u0010;\u001a\u00020\t8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b:\u0010\u0015R\u0016\u0010=\u001a\u00020!8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b<\u0010#¨\u0006@"}, d2 = {"Lcom/p7700g/p99005/av5;", "", "Lcom/p7700g/p99005/sv5$a;", "cursor", "", "key", "Lcom/p7700g/p99005/yq4;", "c", "(Lcom/p7700g/p99005/sv5$a;[B)V", "", "code", "", "b", "(I)Ljava/lang/String;", "d", "(I)V", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/String;", "ACCEPT_MAGIC", "t", AFHydra.STATUS_IDLE, "PAYLOAD_LONG", "B0_FLAG_RSV2", "h", "B1_FLAG_MASK", com.anythink.expressad.d.a.b.dH, "OPCODE_CONTROL_CLOSE", com.ironsource.sdk.controller.v.a, "CLOSE_NO_STATUS_CODE", "B0_FLAG_FIN", "n", "OPCODE_CONTROL_PING", "", "p", "J", "PAYLOAD_BYTE_MAX", "l", "OPCODE_BINARY", com.anythink.basead.d.g.i, "OPCODE_FLAG_CONTROL", "i", "B1_MASK_LENGTH", "f", "B0_MASK_OPCODE", "k", "OPCODE_TEXT", ij3.b, "OPCODE_CONTROL_PONG", "q", "CLOSE_MESSAGE_MAX", "B0_FLAG_RSV1", "r", "PAYLOAD_SHORT", "u", "CLOSE_CLIENT_GOING_AWAY", "e", "B0_FLAG_RSV3", "j", "OPCODE_CONTINUATION", "s", "PAYLOAD_SHORT_MAX", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class av5 {
    @NotNull
    public static final String a = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    public static final int b = 128;
    public static final int c = 64;
    public static final int d = 32;
    public static final int e = 16;
    public static final int f = 15;
    public static final int g = 8;
    public static final int h = 128;
    public static final int i = 127;
    public static final int j = 0;
    public static final int k = 1;
    public static final int l = 2;
    public static final int m = 8;
    public static final int n = 9;
    public static final int o = 10;
    public static final long p = 125;
    public static final long q = 123;
    public static final int r = 126;
    public static final long s = 65535;
    public static final int t = 127;
    public static final int u = 1001;
    public static final int v = 1005;
    public static final av5 w = new av5();

    private av5() {
    }

    @NotNull
    public final String a(@NotNull String str) {
        c25.p(str, "key");
        vv5.a aVar = vv5.u;
        return aVar.l(str + a).t3().h();
    }

    @Nullable
    public final String b(int i2) {
        if (i2 < 1000 || i2 >= 5000) {
            return wo1.l("Code must be in range [1000,5000): ", i2);
        }
        if ((1004 > i2 || 1006 < i2) && (1015 > i2 || 2999 < i2)) {
            return null;
        }
        return wo1.n("Code ", i2, " is reserved and may not be used.");
    }

    public final void c(@NotNull sv5.a aVar, @NotNull byte[] bArr) {
        c25.p(aVar, "cursor");
        c25.p(bArr, "key");
        int length = bArr.length;
        int i2 = 0;
        do {
            byte[] bArr2 = aVar.w;
            int i3 = aVar.x;
            int i4 = aVar.y;
            if (bArr2 != null) {
                while (i3 < i4) {
                    int i5 = i2 % length;
                    bArr2[i3] = (byte) (bArr2[i3] ^ bArr[i5]);
                    i3++;
                    i2 = i5 + 1;
                }
            }
        } while (aVar.d() != -1);
    }

    public final void d(int i2) {
        String b2 = b(i2);
        if (b2 == null) {
            return;
        }
        c25.m(b2);
        throw new IllegalArgumentException(b2.toString());
    }
}