package com.p7700g.p99005;

import com.anythink.core.api.ATAdConst;
import java.io.ByteArrayOutputStream;
import org.jetbrains.annotations.NotNull;

/* compiled from: FileReadWrite.kt */
@vo4(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/io/ExposingBufferByteArrayOutputStream;", "Ljava/io/ByteArrayOutputStream;", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "", "(I)V", "buffer", "", "getBuffer", "()[B", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class yx4 extends ByteArrayOutputStream {
    public yx4(int i) {
        super(i);
    }

    @NotNull
    public final byte[] a() {
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        c25.o(bArr, "buf");
        return bArr;
    }
}