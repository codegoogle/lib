package com.p7700g.p99005;

import com.p7700g.p99005.rs2;
import java.io.IOException;
import java.nio.channels.FileChannel;
import org.jetbrains.annotations.NotNull;

/* compiled from: FileOperator.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\tR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/p7700g/p99005/as5;", "", "", "pos", "Lcom/p7700g/p99005/sv5;", rs2.f.b, "byteCount", "Lcom/p7700g/p99005/yq4;", "b", "(JLcom/p7700g/p99005/sv5;J)V", "sink", "a", "Ljava/nio/channels/FileChannel;", "Ljava/nio/channels/FileChannel;", "fileChannel", "<init>", "(Ljava/nio/channels/FileChannel;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class as5 {
    private final FileChannel a;

    public as5(@NotNull FileChannel fileChannel) {
        c25.p(fileChannel, "fileChannel");
        this.a = fileChannel;
    }

    public final void a(long j, @NotNull sv5 sv5Var, long j2) {
        c25.p(sv5Var, "sink");
        if (j2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (j2 > 0) {
            long transferTo = this.a.transferTo(j, j2, sv5Var);
            j += transferTo;
            j2 -= transferTo;
        }
    }

    public final void b(long j, @NotNull sv5 sv5Var, long j2) throws IOException {
        c25.p(sv5Var, rs2.f.b);
        if (j2 < 0 || j2 > sv5Var.z2()) {
            throw new IndexOutOfBoundsException();
        }
        long j3 = j;
        long j4 = j2;
        while (j4 > 0) {
            long transferFrom = this.a.transferFrom(sv5Var, j3, j4);
            j3 += transferFrom;
            j4 -= transferFrom;
        }
    }
}