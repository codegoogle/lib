package com.p7700g.p99005;

import java.nio.charset.Charset;

/* compiled from: Charsets.kt */
@fz4(name = "CharsetsKt")
@vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\b¨\u0006\u0004"}, d2 = {"charset", "Ljava/nio/charset/Charset;", "charsetName", "", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class g85 {
    @dx4
    private static final Charset a(String str) {
        c25.p(str, "charsetName");
        Charset forName = Charset.forName(str);
        c25.o(forName, "forName(charsetName)");
        return forName;
    }
}