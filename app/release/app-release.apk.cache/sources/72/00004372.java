package com.p7700g.p99005;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* compiled from: FilePathComponents.kt */
@vo4(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u000b\u001a\u00020\f*\u00020\bH\u0002¢\u0006\u0002\b\r\u001a\u001c\u0010\u000e\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0000\u001a\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0002H\u0000\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0002*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\u0007\u001a\u00020\b*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"isRooted", "", "Ljava/io/File;", "(Ljava/io/File;)Z", "root", "getRoot", "(Ljava/io/File;)Ljava/io/File;", "rootName", "", "getRootName", "(Ljava/io/File;)Ljava/lang/String;", "getRootLength", "", "getRootLength$FilesKt__FilePathComponentsKt", "subPath", "beginIndex", "endIndex", "toComponents", "Lkotlin/io/FilePathComponents;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/io/FilesKt")
/* loaded from: classes3.dex */
public class fy4 {
    @NotNull
    public static final File a(@NotNull File file) {
        c25.p(file, "<this>");
        return new File(c(file));
    }

    private static final int b(String str) {
        int q3;
        int q32 = c95.q3(str, File.separatorChar, 0, false, 4, null);
        if (q32 == 0) {
            if (str.length() > 1) {
                char charAt = str.charAt(1);
                char c = File.separatorChar;
                if (charAt == c && (q3 = c95.q3(str, c, 2, false, 4, null)) >= 0) {
                    int q33 = c95.q3(str, File.separatorChar, q3 + 1, false, 4, null);
                    return q33 >= 0 ? q33 + 1 : str.length();
                }
            }
            return 1;
        } else if (q32 <= 0 || str.charAt(q32 - 1) != ':') {
            if (q32 == -1 && c95.a3(str, ':', false, 2, null)) {
                return str.length();
            }
            return 0;
        } else {
            return q32 + 1;
        }
    }

    @NotNull
    public static final String c(@NotNull File file) {
        c25.p(file, "<this>");
        String path = file.getPath();
        c25.o(path, la1.k);
        String path2 = file.getPath();
        c25.o(path2, la1.k);
        String substring = path.substring(0, b(path2));
        c25.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final boolean d(@NotNull File file) {
        c25.p(file, "<this>");
        String path = file.getPath();
        c25.o(path, la1.k);
        return b(path) > 0;
    }

    @NotNull
    public static final File e(@NotNull File file, int i, int i2) {
        c25.p(file, "<this>");
        return f(file).j(i, i2);
    }

    @NotNull
    public static final ay4 f(@NotNull File file) {
        List list;
        c25.p(file, "<this>");
        String path = file.getPath();
        c25.o(path, la1.k);
        int b = b(path);
        String substring = path.substring(0, b);
        c25.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = path.substring(b);
        c25.o(substring2, "this as java.lang.String).substring(startIndex)");
        if (substring2.length() == 0) {
            list = js4.F();
        } else {
            List<String> S4 = c95.S4(substring2, new char[]{File.separatorChar}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(ks4.Z(S4, 10));
            for (String str : S4) {
                arrayList.add(new File(str));
            }
            list = arrayList;
        }
        return new ay4(new File(substring), list);
    }
}