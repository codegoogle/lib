package com.p7700g.p99005;

import com.p7700g.p99005.aa;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: FileSystem.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\bf\u0018\u0000 \b2\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/p7700g/p99005/st5;", "", "Ljava/io/File;", o31.b, "Lcom/p7700g/p99005/xw5;", "a", "(Ljava/io/File;)Lcom/p7700g/p99005/xw5;", "Lcom/p7700g/p99005/vw5;", "b", "(Ljava/io/File;)Lcom/p7700g/p99005/vw5;", com.anythink.basead.d.g.i, "Lcom/p7700g/p99005/yq4;", "f", "(Ljava/io/File;)V", "", "d", "(Ljava/io/File;)Z", "", "h", "(Ljava/io/File;)J", "from", aa.h.d, "e", "(Ljava/io/File;Ljava/io/File;)V", "directory", "c", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public interface st5 {
    public static final a b = new a(null);
    @cz4
    @NotNull
    public static final st5 a = new a.C0243a();

    /* compiled from: FileSystem.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\b"}, d2 = {"com/p7700g/p99005/st5$a", "", "Lcom/p7700g/p99005/st5;", "SYSTEM", "Lcom/p7700g/p99005/st5;", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        public static final /* synthetic */ a a = null;

        /* compiled from: FileSystem.kt */
        @vo4(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\rJ\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"com/p7700g/p99005/st5$a$a", "Lcom/p7700g/p99005/st5;", "Ljava/io/File;", o31.b, "Lcom/p7700g/p99005/xw5;", "a", "(Ljava/io/File;)Lcom/p7700g/p99005/xw5;", "Lcom/p7700g/p99005/vw5;", "b", "(Ljava/io/File;)Lcom/p7700g/p99005/vw5;", com.anythink.basead.d.g.i, "Lcom/p7700g/p99005/yq4;", "f", "(Ljava/io/File;)V", "", "d", "(Ljava/io/File;)Z", "", "h", "(Ljava/io/File;)J", "from", aa.h.d, "e", "(Ljava/io/File;Ljava/io/File;)V", "directory", "c", "", "toString", "()Ljava/lang/String;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: com.p7700g.p99005.st5$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0243a implements st5 {
            @Override // com.p7700g.p99005.st5
            @NotNull
            public xw5 a(@NotNull File file) throws FileNotFoundException {
                c25.p(file, o31.b);
                return jw5.r(file);
            }

            @Override // com.p7700g.p99005.st5
            @NotNull
            public vw5 b(@NotNull File file) throws FileNotFoundException {
                c25.p(file, o31.b);
                try {
                    return kw5.p(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return kw5.p(file, false, 1, null);
                }
            }

            @Override // com.p7700g.p99005.st5
            public void c(@NotNull File file) throws IOException {
                c25.p(file, "directory");
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        c25.o(file2, o31.b);
                        if (file2.isDirectory()) {
                            c(file2);
                        }
                        if (!file2.delete()) {
                            throw new IOException(wo1.r("failed to delete ", file2));
                        }
                    }
                    return;
                }
                throw new IOException(wo1.r("not a readable directory: ", file));
            }

            @Override // com.p7700g.p99005.st5
            public boolean d(@NotNull File file) {
                c25.p(file, o31.b);
                return file.exists();
            }

            @Override // com.p7700g.p99005.st5
            public void e(@NotNull File file, @NotNull File file2) throws IOException {
                c25.p(file, "from");
                c25.p(file2, aa.h.d);
                f(file2);
                if (file.renameTo(file2)) {
                    return;
                }
                throw new IOException("failed to rename " + file + " to " + file2);
            }

            @Override // com.p7700g.p99005.st5
            public void f(@NotNull File file) throws IOException {
                c25.p(file, o31.b);
                if (!file.delete() && file.exists()) {
                    throw new IOException(wo1.r("failed to delete ", file));
                }
            }

            @Override // com.p7700g.p99005.st5
            @NotNull
            public vw5 g(@NotNull File file) throws FileNotFoundException {
                c25.p(file, o31.b);
                try {
                    return jw5.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return jw5.a(file);
                }
            }

            @Override // com.p7700g.p99005.st5
            public long h(@NotNull File file) {
                c25.p(file, o31.b);
                return file.length();
            }

            @NotNull
            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @NotNull
    xw5 a(@NotNull File file) throws FileNotFoundException;

    @NotNull
    vw5 b(@NotNull File file) throws FileNotFoundException;

    void c(@NotNull File file) throws IOException;

    boolean d(@NotNull File file);

    void e(@NotNull File file, @NotNull File file2) throws IOException;

    void f(@NotNull File file) throws IOException;

    @NotNull
    vw5 g(@NotNull File file) throws FileNotFoundException;

    long h(@NotNull File file);
}