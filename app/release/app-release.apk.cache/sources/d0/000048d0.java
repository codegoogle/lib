package com.p7700g.p99005;

import android.net.Uri;
import java.io.File;
import org.jetbrains.annotations.NotNull;

/* compiled from: Uri.kt */
@vo4(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\r\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0086\b\u001a\r\u0010\u0003\u001a\u00020\u0002*\u00020\u0004H\u0086\b¨\u0006\u0005"}, d2 = {"toFile", "Ljava/io/File;", "Landroid/net/Uri;", "toUri", "", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class im {
    @NotNull
    public static final File a(@NotNull Uri uri) {
        c25.p(uri, "<this>");
        if (c25.g(uri.getScheme(), o31.b)) {
            String path = uri.getPath();
            if (path != null) {
                return new File(path);
            }
            throw new IllegalArgumentException(("Uri path is null: " + uri).toString());
        }
        throw new IllegalArgumentException(("Uri lacks 'file' scheme: " + uri).toString());
    }

    @NotNull
    public static final Uri b(@NotNull File file) {
        c25.p(file, "<this>");
        Uri fromFile = Uri.fromFile(file);
        c25.o(fromFile, "fromFile(this)");
        return fromFile;
    }

    @NotNull
    public static final Uri c(@NotNull String str) {
        c25.p(str, "<this>");
        Uri parse = Uri.parse(str);
        c25.o(parse, "parse(this)");
        return parse;
    }
}