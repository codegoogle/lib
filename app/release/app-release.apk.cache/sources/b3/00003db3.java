package com.p7700g.p99005;

import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FileTreeWalk.kt */
@vo4(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001a\u001b\u001cB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0089\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u00128\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0096\u0002J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0014J\u001a\u0010\u0007\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bJ \u0010\f\u001a\u00020\u00002\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\rJ\u001a\u0010\n\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R@\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lkotlin/io/FileTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/io/File;", com.anythink.expressad.foundation.d.c.bR, "direction", "Lkotlin/io/FileWalkDirection;", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;)V", "onEnter", "Lkotlin/Function1;", "", "onLeave", "", "onFail", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "f", "Ljava/io/IOException;", "e", "maxDepth", "", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)V", "iterator", "", "depth", "function", "DirectoryState", "FileTreeWalkIterator", "WalkState", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class cy4 implements g75<File> {
    @NotNull
    private final File a;
    @NotNull
    private final dy4 b;
    @Nullable
    private final f05<File, Boolean> c;
    @Nullable
    private final f05<File, yq4> d;
    @Nullable
    private final j05<File, IOException, yq4> e;
    private final int f;

    /* compiled from: FileTreeWalk.kt */
    @vo4(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\"\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/io/FileTreeWalk$DirectoryState;", "Lkotlin/io/FileTreeWalk$WalkState;", "rootDir", "Ljava/io/File;", "(Ljava/io/File;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull File file) {
            super(file);
            c25.p(file, "rootDir");
        }
    }

    /* compiled from: FileTreeWalk.kt */
    @vo4(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\r\u000e\u000fB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0014J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0082\u0010R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;", "Lkotlin/collections/AbstractIterator;", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk;)V", CallMraidJS.b, "Ljava/util/ArrayDeque;", "Lkotlin/io/FileTreeWalk$WalkState;", "computeNext", "", "directoryState", "Lkotlin/io/FileTreeWalk$DirectoryState;", "root", "gotoNext", "BottomUpDirectoryState", "SingleFileState", "TopDownDirectoryState", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public final class b extends mr4<File> {
        @NotNull
        private final ArrayDeque<c> u;

        /* compiled from: FileTreeWalk.kt */
        @vo4(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState;", "Lkotlin/io/FileTreeWalk$DirectoryState;", "rootDir", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "failed", "", "fileIndex", "", "fileList", "", "[Ljava/io/File;", "rootVisited", "step", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
        /* loaded from: classes3.dex */
        public final class a extends a {
            private boolean b;
            @Nullable
            private File[] c;
            private int d;
            private boolean e;
            public final /* synthetic */ b f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull b bVar, File file) {
                super(file);
                c25.p(file, "rootDir");
                this.f = bVar;
            }

            @Override // com.p7700g.p99005.cy4.c
            @Nullable
            public File b() {
                if (!this.e && this.c == null) {
                    f05 f05Var = cy4.this.c;
                    boolean z = false;
                    if (f05Var != null && !((Boolean) f05Var.M(a())).booleanValue()) {
                        z = true;
                    }
                    if (z) {
                        return null;
                    }
                    File[] listFiles = a().listFiles();
                    this.c = listFiles;
                    if (listFiles == null) {
                        j05 j05Var = cy4.this.e;
                        if (j05Var != null) {
                            j05Var.w3(a(), new sx4(a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.e = true;
                    }
                }
                File[] fileArr = this.c;
                if (fileArr != null) {
                    int i = this.d;
                    c25.m(fileArr);
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.c;
                        c25.m(fileArr2);
                        int i2 = this.d;
                        this.d = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (this.b) {
                    f05 f05Var2 = cy4.this.d;
                    if (f05Var2 != null) {
                        f05Var2.M(a());
                    }
                    return null;
                }
                this.b = true;
                return a();
            }
        }

        /* compiled from: FileTreeWalk.kt */
        @vo4(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState;", "Lkotlin/io/FileTreeWalk$WalkState;", "rootFile", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "visited", "", "step", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
        /* renamed from: com.p7700g.p99005.cy4$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public final class C0158b extends c {
            private boolean b;
            public final /* synthetic */ b c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0158b(@NotNull b bVar, File file) {
                super(file);
                c25.p(file, "rootFile");
                this.c = bVar;
            }

            @Override // com.p7700g.p99005.cy4.c
            @Nullable
            public File b() {
                if (this.b) {
                    return null;
                }
                this.b = true;
                return a();
            }
        }

        /* compiled from: FileTreeWalk.kt */
        @vo4(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState;", "Lkotlin/io/FileTreeWalk$DirectoryState;", "rootDir", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "fileIndex", "", "fileList", "", "[Ljava/io/File;", "rootVisited", "", "step", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
        /* loaded from: classes3.dex */
        public final class c extends a {
            private boolean b;
            @Nullable
            private File[] c;
            private int d;
            public final /* synthetic */ b e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@NotNull b bVar, File file) {
                super(file);
                c25.p(file, "rootDir");
                this.e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
                if (r0.length == 0) goto L32;
             */
            @Override // com.p7700g.p99005.cy4.c
            @Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public File b() {
                j05 j05Var;
                if (!this.b) {
                    f05 f05Var = cy4.this.c;
                    boolean z = false;
                    if (f05Var != null && !((Boolean) f05Var.M(a())).booleanValue()) {
                        z = true;
                    }
                    if (z) {
                        return null;
                    }
                    this.b = true;
                    return a();
                }
                File[] fileArr = this.c;
                if (fileArr != null) {
                    int i = this.d;
                    c25.m(fileArr);
                    if (i >= fileArr.length) {
                        f05 f05Var2 = cy4.this.d;
                        if (f05Var2 != null) {
                            f05Var2.M(a());
                        }
                        return null;
                    }
                }
                if (this.c == null) {
                    File[] listFiles = a().listFiles();
                    this.c = listFiles;
                    if (listFiles == null && (j05Var = cy4.this.e) != null) {
                        j05Var.w3(a(), new sx4(a(), null, "Cannot list files in a directory", 2, null));
                    }
                    File[] fileArr2 = this.c;
                    if (fileArr2 != null) {
                        c25.m(fileArr2);
                    }
                    f05 f05Var3 = cy4.this.d;
                    if (f05Var3 != null) {
                        f05Var3.M(a());
                    }
                    return null;
                }
                File[] fileArr3 = this.c;
                c25.m(fileArr3);
                int i2 = this.d;
                this.d = i2 + 1;
                return fileArr3[i2];
            }
        }

        /* compiled from: FileTreeWalk.kt */
        @vo4(k = 3, mv = {1, 7, 1}, xi = 48)
        /* loaded from: classes3.dex */
        public /* synthetic */ class d {
            public static final /* synthetic */ int[] a;

            static {
                dy4.values();
                int[] iArr = new int[2];
                iArr[dy4.TOP_DOWN.ordinal()] = 1;
                iArr[dy4.BOTTOM_UP.ordinal()] = 2;
                a = iArr;
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.u = arrayDeque;
            if (cy4.this.a.isDirectory()) {
                arrayDeque.push(e(cy4.this.a));
            } else if (cy4.this.a.isFile()) {
                arrayDeque.push(new C0158b(this, cy4.this.a));
            } else {
                b();
            }
        }

        private final a e(File file) {
            int ordinal = cy4.this.b.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    return new a(this, file);
                }
                throw new wo4();
            }
            return new c(this, file);
        }

        private final File h() {
            File b;
            while (true) {
                c peek = this.u.peek();
                if (peek == null) {
                    return null;
                }
                b = peek.b();
                if (b == null) {
                    this.u.pop();
                } else if (c25.g(b, peek.a()) || !b.isDirectory() || this.u.size() >= cy4.this.f) {
                    break;
                } else {
                    this.u.push(e(b));
                }
            }
            return b;
        }

        @Override // com.p7700g.p99005.mr4
        public void a() {
            File h = h();
            if (h != null) {
                c(h);
            } else {
                b();
            }
        }
    }

    /* compiled from: FileTreeWalk.kt */
    @vo4(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\"\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/io/FileTreeWalk$WalkState;", "", "root", "Ljava/io/File;", "(Ljava/io/File;)V", "getRoot", "()Ljava/io/File;", "step", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static abstract class c {
        @NotNull
        private final File a;

        public c(@NotNull File file) {
            c25.p(file, "root");
            this.a = file;
        }

        @NotNull
        public final File a() {
            return this.a;
        }

        @Nullable
        public abstract File b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private cy4(File file, dy4 dy4Var, f05<? super File, Boolean> f05Var, f05<? super File, yq4> f05Var2, j05<? super File, ? super IOException, yq4> j05Var, int i) {
        this.a = file;
        this.b = dy4Var;
        this.c = f05Var;
        this.d = f05Var2;
        this.e = j05Var;
        this.f = i;
    }

    @NotNull
    public final cy4 i(int i) {
        if (i > 0) {
            return new cy4(this.a, this.b, this.c, this.d, this.e, i);
        }
        throw new IllegalArgumentException("depth must be positive, but was " + i + '.');
    }

    @Override // com.p7700g.p99005.g75
    @NotNull
    public Iterator<File> iterator() {
        return new b();
    }

    @NotNull
    public final cy4 j(@NotNull f05<? super File, Boolean> f05Var) {
        c25.p(f05Var, "function");
        return new cy4(this.a, this.b, f05Var, this.d, this.e, this.f);
    }

    @NotNull
    public final cy4 k(@NotNull j05<? super File, ? super IOException, yq4> j05Var) {
        c25.p(j05Var, "function");
        return new cy4(this.a, this.b, this.c, this.d, j05Var, this.f);
    }

    @NotNull
    public final cy4 l(@NotNull f05<? super File, yq4> f05Var) {
        c25.p(f05Var, "function");
        return new cy4(this.a, this.b, this.c, f05Var, this.e, this.f);
    }

    public /* synthetic */ cy4(File file, dy4 dy4Var, f05 f05Var, f05 f05Var2, j05 j05Var, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i2 & 2) != 0 ? dy4.TOP_DOWN : dy4Var, f05Var, f05Var2, j05Var, (i2 & 32) != 0 ? Integer.MAX_VALUE : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cy4(@NotNull File file, @NotNull dy4 dy4Var) {
        this(file, dy4Var, null, null, null, 0, 32, null);
        c25.p(file, com.anythink.expressad.foundation.d.c.bR);
        c25.p(dy4Var, "direction");
    }

    public /* synthetic */ cy4(File file, dy4 dy4Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? dy4.TOP_DOWN : dy4Var);
    }
}