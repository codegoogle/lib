package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import org.jetbrains.annotations.NotNull;

/* compiled from: Http2.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b@\u0010AJ5\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0016\u0010\u001a\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0016\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u0016\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011R\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0015R\u001e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0015R\u0016\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0011R\u0016\u0010%\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0011R\u0016\u0010'\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0011R\u0016\u0010)\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0011R\u0016\u0010+\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0011R\u0016\u0010-\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u0011R\u0016\u0010/\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u0011R\u0016\u00101\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\u0011R\u0016\u00103\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\u0011R\u0016\u00104\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u0016\u00106\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010\u0011R\u0016\u00108\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010\u0011R\u0016\u0010:\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010\u0011R\u0016\u0010=\u001a\u00020;8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010<R\u0016\u0010?\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010\u0011¨\u0006B"}, d2 = {"Lcom/p7700g/p99005/it5;", "", "", "inbound", "", "streamId", "length", "type", "flags", "", "c", "(ZIIII)Ljava/lang/String;", "b", "(I)Ljava/lang/String;", "a", "(II)Ljava/lang/String;", "r", AFHydra.STATUS_IDLE, "FLAG_PADDED", "", "w", "[Ljava/lang/String;", "BINARY", "p", "FLAG_END_HEADERS", "e", "TYPE_PRIORITY", "INITIAL_MAX_FRAME_SIZE", "j", "TYPE_GOAWAY", "u", "FRAME_NAMES", com.ironsource.sdk.controller.v.a, "FLAGS", "l", "TYPE_CONTINUATION", ij3.b, "FLAG_END_STREAM", "t", "FLAG_COMPRESSED", "d", "TYPE_HEADERS", com.anythink.basead.d.g.i, "TYPE_SETTINGS", com.anythink.expressad.d.a.b.dH, "FLAG_NONE", "q", "FLAG_END_PUSH_PROMISE", "k", "TYPE_WINDOW_UPDATE", "n", "FLAG_ACK", "TYPE_DATA", "f", "TYPE_RST_STREAM", "h", "TYPE_PUSH_PROMISE", "i", "TYPE_PING", "Lcom/p7700g/p99005/vv5;", "Lcom/p7700g/p99005/vv5;", "CONNECTION_PREFACE", "s", "FLAG_PRIORITY", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class it5 {
    public static final int b = 16384;
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 4;
    public static final int h = 5;
    public static final int i = 6;
    public static final int j = 7;
    public static final int k = 8;
    public static final int l = 9;
    public static final int m = 0;
    public static final int n = 1;
    public static final int o = 1;
    public static final int p = 4;
    public static final int q = 4;
    public static final int r = 8;
    public static final int s = 32;
    public static final int t = 32;
    private static final String[] w;
    public static final it5 x = new it5();
    @cz4
    @NotNull
    public static final vv5 a = vv5.u.l("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final String[] u = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    private static final String[] v = new String[64];

    static {
        String[] strArr = new String[256];
        for (int i2 = 0; i2 < 256; i2++) {
            String binaryString = Integer.toBinaryString(i2);
            c25.o(binaryString, "Integer.toBinaryString(it)");
            strArr[i2] = b95.j2(sr5.v("%8s", binaryString), gl4.R, '0', false, 4, null);
        }
        w = strArr;
        String[] strArr2 = v;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i3 = 0; i3 < 1; i3++) {
            int i4 = iArr[i3];
            String[] strArr3 = v;
            strArr3[i4 | 8] = c25.C(strArr3[i4], "|PADDED");
        }
        String[] strArr4 = v;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 < 1; i7++) {
                int i8 = iArr[i7];
                String[] strArr5 = v;
                int i9 = i8 | i6;
                strArr5[i9] = strArr5[i8] + com.anythink.expressad.foundation.g.a.bQ + strArr5[i6];
                StringBuilder sb = new StringBuilder();
                sb.append(strArr5[i8]);
                sb.append(com.anythink.expressad.foundation.g.a.bQ);
                strArr5[i9 | 8] = wo1.C(sb, strArr5[i6], "|PADDED");
            }
        }
        int length = v.length;
        for (int i10 = 0; i10 < length; i10++) {
            String[] strArr6 = v;
            if (strArr6[i10] == null) {
                strArr6[i10] = w[i10];
            }
        }
    }

    private it5() {
    }

    @NotNull
    public final String a(int i2, int i3) {
        String str;
        if (i3 == 0) {
            return "";
        }
        if (i2 != 2 && i2 != 3) {
            if (i2 == 4 || i2 == 6) {
                return i3 == 1 ? "ACK" : w[i3];
            } else if (i2 != 7 && i2 != 8) {
                String[] strArr = v;
                if (i3 < strArr.length) {
                    str = strArr[i3];
                    c25.m(str);
                } else {
                    str = w[i3];
                }
                String str2 = str;
                if (i2 != 5 || (i3 & 4) == 0) {
                    return (i2 != 0 || (i3 & 32) == 0) ? str2 : b95.k2(str2, "PRIORITY", "COMPRESSED", false, 4, null);
                }
                return b95.k2(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
            }
        }
        return w[i3];
    }

    @NotNull
    public final String b(int i2) {
        String[] strArr = u;
        return i2 < strArr.length ? strArr[i2] : sr5.v("0x%02x", Integer.valueOf(i2));
    }

    @NotNull
    public final String c(boolean z, int i2, int i3, int i4, int i5) {
        return sr5.v("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i2), Integer.valueOf(i3), b(i4), a(i4, i5));
    }
}