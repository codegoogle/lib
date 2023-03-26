package com.p7700g.p99005;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.jetbrains.annotations.NotNull;

/* compiled from: Credentials.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/p7700g/p99005/sq5;", "", "", "username", "password", "Ljava/nio/charset/Charset;", "charset", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class sq5 {
    public static final sq5 a = new sq5();

    private sq5() {
    }

    @gz4
    @jz4
    @NotNull
    public static final String a(@NotNull String str, @NotNull String str2) {
        return c(str, str2, null, 4, null);
    }

    @gz4
    @jz4
    @NotNull
    public static final String b(@NotNull String str, @NotNull String str2, @NotNull Charset charset) {
        c25.p(str, "username");
        c25.p(str2, "password");
        c25.p(charset, "charset");
        return wo1.t("Basic ", vv5.u.j(str + ':' + str2, charset).h());
    }

    public static /* synthetic */ String c(String str, String str2, Charset charset, int i, Object obj) {
        if ((i & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
            c25.o(charset, "ISO_8859_1");
        }
        return b(str, str2, charset);
    }
}