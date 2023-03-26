package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.graphics.Path;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;

/* compiled from: Path.kt */
@vo4(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f¨\u0006\f"}, d2 = {"and", "Landroid/graphics/Path;", "p", "flatten", "", "Landroidx/core/graphics/PathSegment;", "error", "", "minus", "or", "plus", "xor", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class lj {
    @e2(19)
    @NotNull
    public static final Path a(@NotNull Path path, @NotNull Path path2) {
        c25.p(path, "<this>");
        c25.p(path2, "p");
        Path path3 = new Path();
        path3.op(path, path2, Path.Op.INTERSECT);
        return path3;
    }

    @e2(26)
    @NotNull
    public static final Iterable<nj> b(@NotNull Path path, float f) {
        c25.p(path, "<this>");
        Collection<nj> b = oj.b(path, f);
        c25.o(b, "flatten(this, error)");
        return b;
    }

    public static /* synthetic */ Iterable c(Path path, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.5f;
        }
        return b(path, f);
    }

    @e2(19)
    @NotNull
    public static final Path d(@NotNull Path path, @NotNull Path path2) {
        c25.p(path, "<this>");
        c25.p(path2, "p");
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.DIFFERENCE);
        return path3;
    }

    @e2(19)
    @NotNull
    public static final Path e(@NotNull Path path, @NotNull Path path2) {
        c25.p(path, "<this>");
        c25.p(path2, "p");
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    @e2(19)
    @NotNull
    public static final Path f(@NotNull Path path, @NotNull Path path2) {
        c25.p(path, "<this>");
        c25.p(path2, "p");
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    @e2(19)
    @NotNull
    public static final Path g(@NotNull Path path, @NotNull Path path2) {
        c25.p(path, "<this>");
        c25.p(path2, "p");
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.XOR);
        return path3;
    }
}