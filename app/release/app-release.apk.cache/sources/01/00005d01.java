package com.p7700g.p99005;

import java.nio.file.Path;
import java.nio.file.Paths;
import org.jetbrains.annotations.NotNull;

/* compiled from: PathUtils.kt */
@vo4(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlin/io/path/PathRelativizer;", "", "()V", "emptyPath", "Ljava/nio/file/Path;", "kotlin.jvm.PlatformType", "parentPath", "tryRelativeTo", la1.k, "base", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class sy4 {
    @NotNull
    public static final sy4 a = new sy4();
    private static final Path b = Paths.get("", new String[0]);
    private static final Path c = Paths.get("..", new String[0]);

    private sy4() {
    }

    @NotNull
    public final Path a(@NotNull Path path, @NotNull Path path2) {
        c25.p(path, la1.k);
        c25.p(path2, "base");
        Path normalize = path2.normalize();
        Path normalize2 = path.normalize();
        Path relativize = normalize.relativize(normalize2);
        int min = Math.min(normalize.getNameCount(), normalize2.getNameCount());
        int i = 0;
        while (i < min) {
            int i2 = i + 1;
            Path name = normalize.getName(i);
            Path path3 = c;
            if (!c25.g(name, path3)) {
                break;
            } else if (!c25.g(normalize2.getName(i), path3)) {
                throw new IllegalArgumentException("Unable to compute relative path");
            } else {
                i = i2;
            }
        }
        if (c25.g(normalize2, normalize) || !c25.g(normalize, b)) {
            String obj = relativize.toString();
            String separator = relativize.getFileSystem().getSeparator();
            c25.o(separator, "rn.fileSystem.separator");
            normalize2 = b95.J1(obj, separator, false, 2, null) ? relativize.getFileSystem().getPath(e95.C6(obj, relativize.getFileSystem().getSeparator().length()), new String[0]) : relativize;
        }
        c25.o(normalize2, "r");
        return normalize2;
    }
}