package com.p7700g.p99005;

import com.anythink.core.api.ATAdConst;
import java.io.File;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FilePathComponents.kt */
@vo4(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0013J\t\u0010\u001f\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lkotlin/io/FilePathComponents;", "", "root", "Ljava/io/File;", "segments", "", "(Ljava/io/File;Ljava/util/List;)V", "isRooted", "", "()Z", "getRoot", "()Ljava/io/File;", "rootName", "", "getRootName", "()Ljava/lang/String;", "getSegments", "()Ljava/util/List;", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "", "getSize", "()I", "component1", "component2", "copy", "equals", "other", "hashCode", "subPath", "beginIndex", "endIndex", "toString", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ay4 {
    @NotNull
    private final File a;
    @NotNull
    private final List<File> b;

    /* JADX WARN: Multi-variable type inference failed */
    public ay4(@NotNull File file, @NotNull List<? extends File> list) {
        c25.p(file, "root");
        c25.p(list, "segments");
        this.a = file;
        this.b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ay4 d(ay4 ay4Var, File file, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            file = ay4Var.a;
        }
        if ((i & 2) != 0) {
            list = ay4Var.b;
        }
        return ay4Var.c(file, list);
    }

    @NotNull
    public final File a() {
        return this.a;
    }

    @NotNull
    public final List<File> b() {
        return this.b;
    }

    @NotNull
    public final ay4 c(@NotNull File file, @NotNull List<? extends File> list) {
        c25.p(file, "root");
        c25.p(list, "segments");
        return new ay4(file, list);
    }

    @NotNull
    public final File e() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ay4) {
            ay4 ay4Var = (ay4) obj;
            return c25.g(this.a, ay4Var.a) && c25.g(this.b, ay4Var.b);
        }
        return false;
    }

    @NotNull
    public final String f() {
        String path = this.a.getPath();
        c25.o(path, "root.path");
        return path;
    }

    @NotNull
    public final List<File> g() {
        return this.b;
    }

    public final int h() {
        return this.b.size();
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final boolean i() {
        String path = this.a.getPath();
        c25.o(path, "root.path");
        return path.length() > 0;
    }

    @NotNull
    public final File j(int i, int i2) {
        if (i >= 0 && i <= i2 && i2 <= h()) {
            List<File> subList = this.b.subList(i, i2);
            String str = File.separator;
            c25.o(str, "separator");
            return new File(rs4.h3(subList, str, null, null, 0, null, null, 62, null));
        }
        throw new IllegalArgumentException();
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("FilePathComponents(root=");
        G.append(this.a);
        G.append(", segments=");
        G.append(this.b);
        G.append(')');
        return G.toString();
    }
}