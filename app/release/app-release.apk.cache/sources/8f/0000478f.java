package com.p7700g.p99005;

import java.io.File;
import org.jetbrains.annotations.NotNull;

/* compiled from: FileTreeWalk.kt */
@vo4(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0007"}, d2 = {"walk", "Lkotlin/io/FileTreeWalk;", "Ljava/io/File;", "direction", "Lkotlin/io/FileWalkDirection;", "walkBottomUp", "walkTopDown", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/io/FilesKt")
/* loaded from: classes3.dex */
public class hy4 extends gy4 {
    @NotNull
    public static final cy4 J(@NotNull File file, @NotNull dy4 dy4Var) {
        c25.p(file, "<this>");
        c25.p(dy4Var, "direction");
        return new cy4(file, dy4Var);
    }

    public static /* synthetic */ cy4 K(File file, dy4 dy4Var, int i, Object obj) {
        if ((i & 1) != 0) {
            dy4Var = dy4.TOP_DOWN;
        }
        return J(file, dy4Var);
    }

    @NotNull
    public static final cy4 L(@NotNull File file) {
        c25.p(file, "<this>");
        return J(file, dy4.BOTTOM_UP);
    }

    @NotNull
    public static final cy4 M(@NotNull File file) {
        c25.p(file, "<this>");
        return J(file, dy4.TOP_DOWN);
    }
}