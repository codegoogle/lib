package com.p7700g.p99005;

import android.net.Uri;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.URLConnection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class x33 {
    @NotNull
    public static final a a = new a(null);
    @NotNull
    private final b b;
    @Nullable
    private final xx2 c;
    @Nullable
    private Uri d;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean b(String str) {
            return c95.V2(str, ".gif", false, 2, null);
        }

        private final boolean c(xx2 xx2Var, String str) {
            String guessContentTypeFromStream = URLConnection.guessContentTypeFromStream(new BufferedInputStream(new FileInputStream(new File(xx2Var.b(str).toString()))));
            if (guessContentTypeFromStream == null) {
                return false;
            }
            return b95.u2(guessContentTypeFromStream, "image", false, 2, null);
        }

        @NotNull
        public final x33 a(@NotNull String str, @NotNull xx2 xx2Var) {
            c25.p(str, "url");
            c25.p(xx2Var, "assetInterface");
            if (b(str)) {
                return new x33(b.GIF, str, xx2Var, null);
            }
            return new x33(b.IMAGE, str, xx2Var, null);
        }
    }

    /* loaded from: classes3.dex */
    public enum b {
        IMAGE,
        GIF,
        INVALID
    }

    private x33(b bVar, String str, xx2 xx2Var) {
        this.b = bVar;
        this.c = xx2Var;
        if (str == null) {
            return;
        }
        c(xx2Var == null ? null : xx2Var.b(str));
    }

    public /* synthetic */ x33(b bVar, String str, xx2 xx2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, str, xx2Var);
    }

    @Nullable
    public final Uri a() {
        return this.d;
    }

    @NotNull
    public final b b() {
        return this.b;
    }

    public final void c(@Nullable Uri uri) {
        this.d = uri;
    }
}