package com.p7700g.p99005;

import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Utils.kt */
@vo4(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a*\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0007\u001a*\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0007\u001a8\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u001a&\u0010\u0016\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u001a\n\u0010\u0019\u001a\u00020\u000f*\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\n\u0010\u001c\u001a\u00020\u0002*\u00020\u0002\u001a\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d*\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0002¢\u0006\u0002\b\u001e\u001a\u0011\u0010\u001c\u001a\u00020\u001f*\u00020\u001fH\u0002¢\u0006\u0002\b\u001e\u001a\u0012\u0010 \u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0014\u0010\"\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010#\u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\u0012\u0010(\u001a\u00020\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u001b\u0010)\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0002\b*\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006+"}, d2 = {"extension", "", "Ljava/io/File;", "getExtension", "(Ljava/io/File;)Ljava/lang/String;", "invariantSeparatorsPath", "getInvariantSeparatorsPath", "nameWithoutExtension", "getNameWithoutExtension", "createTempDir", "prefix", "suffix", "directory", "createTempFile", "copyRecursively", "", "target", "overwrite", "onError", "Lkotlin/Function2;", "Ljava/io/IOException;", "Lkotlin/io/OnErrorAction;", "copyTo", "bufferSize", "", "deleteRecursively", "endsWith", "other", "normalize", "", "normalize$FilesKt__UtilsKt", "Lkotlin/io/FilePathComponents;", "relativeTo", "base", "relativeToOrNull", "relativeToOrSelf", "resolve", "relative", "resolveSibling", "startsWith", "toRelativeString", "toRelativeStringOrNull", "toRelativeStringOrNull$FilesKt__UtilsKt", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/io/FilesKt")
/* loaded from: classes3.dex */
public class iy4 extends hy4 {

    /* compiled from: Utils.kt */
    @vo4(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Ljava/io/File;", "exception", "Ljava/io/IOException;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends e25 implements j05 {
        public static final a t = new a();

        public a() {
            super(2);
        }

        @Override // com.p7700g.p99005.j05
        @NotNull
        /* renamed from: a */
        public final Void w3(@NotNull File file, @NotNull IOException iOException) {
            c25.p(file, "<anonymous parameter 0>");
            c25.p(iOException, "exception");
            throw iOException;
        }
    }

    /* compiled from: Utils.kt */
    @vo4(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "f", "Ljava/io/File;", "e", "Ljava/io/IOException;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends e25 implements j05<File, IOException, yq4> {
        public final /* synthetic */ j05<File, IOException, my4> t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(j05<? super File, ? super IOException, ? extends my4> j05Var) {
            super(2);
            this.t = j05Var;
        }

        public final void a(@NotNull File file, @NotNull IOException iOException) {
            c25.p(file, "f");
            c25.p(iOException, "e");
            if (this.t.w3(file, iOException) == my4.TERMINATE) {
                throw new py4(file);
            }
        }

        @Override // com.p7700g.p99005.j05
        public /* bridge */ /* synthetic */ yq4 w3(File file, IOException iOException) {
            a(file, iOException);
            return yq4.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean N(@NotNull File file, @NotNull File file2, boolean z, @NotNull j05<? super File, ? super IOException, ? extends my4> j05Var) {
        boolean z2;
        c25.p(file, "<this>");
        c25.p(file2, "target");
        c25.p(j05Var, "onError");
        if (!file.exists()) {
            return j05Var.w3(file, new ly4(file, null, "The source file doesn't exist.", 2, null)) != my4.TERMINATE;
        }
        try {
            Iterator<File> it = hy4.M(file).k(new b(j05Var)).iterator();
            while (it.hasNext()) {
                File next = it.next();
                if (!next.exists()) {
                    if (j05Var.w3(next, new ly4(next, null, "The source file doesn't exist.", 2, null)) == my4.TERMINATE) {
                        return false;
                    }
                } else {
                    File file3 = new File(file2, n0(next, file));
                    if (file3.exists() && (!next.isDirectory() || !file3.isDirectory())) {
                        if (z) {
                            if (file3.isDirectory()) {
                                if (!V(file3)) {
                                }
                                z2 = false;
                            } else {
                                if (!file3.delete()) {
                                }
                                z2 = false;
                            }
                            if (!z2) {
                                if (j05Var.w3(file3, new zx4(next, file3, "The destination file already exists.")) == my4.TERMINATE) {
                                    return false;
                                }
                            }
                        }
                        z2 = true;
                        if (!z2) {
                        }
                    }
                    if (next.isDirectory()) {
                        file3.mkdirs();
                    } else if (Q(next, file3, z, 0, 4, null).length() != next.length() && j05Var.w3(next, new IOException("Source file wasn't copied completely, length of destination file differs.")) == my4.TERMINATE) {
                        return false;
                    }
                }
            }
            return true;
        } catch (py4 unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean O(File file, File file2, boolean z, j05 j05Var, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            j05Var = a.t;
        }
        return N(file, file2, z, j05Var);
    }

    @NotNull
    public static final File P(@NotNull File file, @NotNull File file2, boolean z, int i) {
        c25.p(file, "<this>");
        c25.p(file2, "target");
        if (file.exists()) {
            if (file2.exists()) {
                if (z) {
                    if (!file2.delete()) {
                        throw new zx4(file, file2, "Tried to overwrite the destination, but failed to delete it.");
                    }
                } else {
                    throw new zx4(file, file2, "The destination file already exists.");
                }
            }
            if (file.isDirectory()) {
                if (!file2.mkdirs()) {
                    throw new by4(file, file2, "Failed to create target directory.");
                }
            } else {
                File parentFile = file2.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    tx4.k(fileInputStream, fileOutputStream, i);
                    ux4.a(fileOutputStream, null);
                    ux4.a(fileInputStream, null);
                } finally {
                }
            }
            return file2;
        }
        throw new ly4(file, null, "The source file doesn't exist.", 2, null);
    }

    public static /* synthetic */ File Q(File file, File file2, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 8192;
        }
        return P(file, file2, z, i);
    }

    @xn4(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    @NotNull
    public static final File R(@NotNull String str, @Nullable String str2, @Nullable File file) {
        c25.p(str, "prefix");
        File createTempFile = File.createTempFile(str, str2, file);
        createTempFile.delete();
        if (createTempFile.mkdir()) {
            c25.o(createTempFile, "dir");
            return createTempFile;
        }
        throw new IOException("Unable to create temporary directory " + createTempFile + '.');
    }

    public static /* synthetic */ File S(String str, String str2, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return R(str, str2, file);
    }

    @xn4(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    @NotNull
    public static final File T(@NotNull String str, @Nullable String str2, @Nullable File file) {
        c25.p(str, "prefix");
        File createTempFile = File.createTempFile(str, str2, file);
        c25.o(createTempFile, "createTempFile(prefix, suffix, directory)");
        return createTempFile;
    }

    public static /* synthetic */ File U(String str, String str2, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return T(str, str2, file);
    }

    public static final boolean V(@NotNull File file) {
        c25.p(file, "<this>");
        while (true) {
            boolean z = true;
            for (File file2 : hy4.L(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                        break;
                    }
                }
                z = false;
            }
            return z;
        }
    }

    public static final boolean W(@NotNull File file, @NotNull File file2) {
        c25.p(file, "<this>");
        c25.p(file2, "other");
        ay4 f = fy4.f(file);
        ay4 f2 = fy4.f(file2);
        if (f2.i()) {
            return c25.g(file, file2);
        }
        int h = f.h() - f2.h();
        if (h < 0) {
            return false;
        }
        return f.g().subList(h, f.h()).equals(f2.g());
    }

    public static final boolean X(@NotNull File file, @NotNull String str) {
        c25.p(file, "<this>");
        c25.p(str, "other");
        return W(file, new File(str));
    }

    @NotNull
    public static final String Y(@NotNull File file) {
        c25.p(file, "<this>");
        String name = file.getName();
        c25.o(name, "name");
        return c95.q5(name, '.', "");
    }

    @NotNull
    public static final String Z(@NotNull File file) {
        c25.p(file, "<this>");
        if (File.separatorChar != '/') {
            String path = file.getPath();
            c25.o(path, la1.k);
            return b95.j2(path, File.separatorChar, j14.P, false, 4, null);
        }
        String path2 = file.getPath();
        c25.o(path2, la1.k);
        return path2;
    }

    @NotNull
    public static final String a0(@NotNull File file) {
        c25.p(file, "<this>");
        String name = file.getName();
        c25.o(name, "name");
        return c95.B5(name, CryptoConstants.ALIAS_SEPARATOR, null, 2, null);
    }

    @NotNull
    public static final File b0(@NotNull File file) {
        c25.p(file, "<this>");
        ay4 f = fy4.f(file);
        File e = f.e();
        List<File> c0 = c0(f.g());
        String str = File.separator;
        c25.o(str, "separator");
        return i0(e, rs4.h3(c0, str, null, null, 0, null, null, 62, null));
    }

    private static final List<File> c0(List<? extends File> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (!c25.g(name, CryptoConstants.ALIAS_SEPARATOR)) {
                if (!c25.g(name, "..")) {
                    arrayList.add(file);
                } else if (arrayList.isEmpty() || c25.g(((File) rs4.k3(arrayList)).getName(), "..")) {
                    arrayList.add(file);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return arrayList;
    }

    private static final ay4 d0(ay4 ay4Var) {
        return new ay4(ay4Var.e(), c0(ay4Var.g()));
    }

    @NotNull
    public static final File e0(@NotNull File file, @NotNull File file2) {
        c25.p(file, "<this>");
        c25.p(file2, "base");
        return new File(n0(file, file2));
    }

    @Nullable
    public static final File f0(@NotNull File file, @NotNull File file2) {
        c25.p(file, "<this>");
        c25.p(file2, "base");
        String o0 = o0(file, file2);
        if (o0 != null) {
            return new File(o0);
        }
        return null;
    }

    @NotNull
    public static final File g0(@NotNull File file, @NotNull File file2) {
        c25.p(file, "<this>");
        c25.p(file2, "base");
        String o0 = o0(file, file2);
        return o0 != null ? new File(o0) : file;
    }

    @NotNull
    public static final File h0(@NotNull File file, @NotNull File file2) {
        c25.p(file, "<this>");
        c25.p(file2, "relative");
        if (fy4.d(file2)) {
            return file2;
        }
        String file3 = file.toString();
        c25.o(file3, "this.toString()");
        if ((file3.length() == 0) || c95.a3(file3, File.separatorChar, false, 2, null)) {
            return new File(wo1.r(file3, file2));
        }
        StringBuilder G = wo1.G(file3);
        G.append(File.separatorChar);
        G.append(file2);
        return new File(G.toString());
    }

    @NotNull
    public static final File i0(@NotNull File file, @NotNull String str) {
        c25.p(file, "<this>");
        c25.p(str, "relative");
        return h0(file, new File(str));
    }

    @NotNull
    public static final File j0(@NotNull File file, @NotNull File file2) {
        c25.p(file, "<this>");
        c25.p(file2, "relative");
        ay4 f = fy4.f(file);
        return h0(h0(f.e(), f.h() == 0 ? new File("..") : f.j(0, f.h() - 1)), file2);
    }

    @NotNull
    public static final File k0(@NotNull File file, @NotNull String str) {
        c25.p(file, "<this>");
        c25.p(str, "relative");
        return j0(file, new File(str));
    }

    public static final boolean l0(@NotNull File file, @NotNull File file2) {
        c25.p(file, "<this>");
        c25.p(file2, "other");
        ay4 f = fy4.f(file);
        ay4 f2 = fy4.f(file2);
        if (c25.g(f.e(), f2.e()) && f.h() >= f2.h()) {
            return f.g().subList(0, f2.h()).equals(f2.g());
        }
        return false;
    }

    public static final boolean m0(@NotNull File file, @NotNull String str) {
        c25.p(file, "<this>");
        c25.p(str, "other");
        return l0(file, new File(str));
    }

    @NotNull
    public static final String n0(@NotNull File file, @NotNull File file2) {
        c25.p(file, "<this>");
        c25.p(file2, "base");
        String o0 = o0(file, file2);
        if (o0 != null) {
            return o0;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + file2 + '.');
    }

    private static final String o0(File file, File file2) {
        ay4 d0 = d0(fy4.f(file));
        ay4 d02 = d0(fy4.f(file2));
        if (c25.g(d0.e(), d02.e())) {
            int h = d02.h();
            int h2 = d0.h();
            int i = 0;
            int min = Math.min(h2, h);
            while (i < min && c25.g(d0.g().get(i), d02.g().get(i))) {
                i++;
            }
            StringBuilder sb = new StringBuilder();
            int i2 = h - 1;
            if (i <= i2) {
                while (!c25.g(d02.g().get(i2).getName(), "..")) {
                    sb.append("..");
                    if (i2 != i) {
                        sb.append(File.separatorChar);
                    }
                    if (i2 != i) {
                        i2--;
                    }
                }
                return null;
            }
            if (i < h2) {
                if (i < h) {
                    sb.append(File.separatorChar);
                }
                List X1 = rs4.X1(d0.g(), i);
                String str = File.separator;
                c25.o(str, "separator");
                rs4.e3(X1, sb, (r14 & 2) != 0 ? ", " : str, (r14 & 4) != 0 ? "" : null, (r14 & 8) == 0 ? null : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
            }
            return sb.toString();
        }
        return null;
    }
}