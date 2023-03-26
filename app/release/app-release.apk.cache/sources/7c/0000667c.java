package com.p7700g.p99005;

import android.content.Context;
import com.p7700g.p99005.qm3;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Logger.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b\"\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0007J+\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0007J\u0015\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u0016\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u001cR\u0016\u0010)\u001a\u00020'8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010(R\u0016\u0010*\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001c¨\u0006-"}, d2 = {"Lcom/p7700g/p99005/xz2;", "", "", "tag", "msg", "Lcom/p7700g/p99005/yq4;", com.anythink.basead.d.g.i, "(Ljava/lang/String;Ljava/lang/String;)V", "", "c", "(Ljava/lang/String;[Ljava/lang/String;)V", "", "throwable", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "d", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V", "f", "(Ljava/lang/String;)Ljava/lang/String;", qm3.b.j, "i", "Landroid/content/Context;", "context", "h", "(Landroid/content/Context;)V", "Ljava/lang/String;", "DEBUG_KEY", "DEFAULT_DEBUG_NAME", "CHECK_DEBUG_PREFIX", "LOG_FILE_NAME", "SDK_VERSION", "Ljava/io/File;", "j", "Ljava/io/File;", "logsFile", "TAG_PREFIX", "", "Z", "DEBUG", "DEBUG_PROP", "<init>", "()V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class xz2 {
    @NotNull
    private static final String b = "GG";
    @NotNull
    private static final String c = "GG_";
    @NotNull
    private static final String f = "debug_pref";
    @NotNull
    private static final String g = "debug_key";
    @NotNull
    private static final String i = "sdkx.log";
    @Nullable
    private static File j;
    @NotNull
    public static final xz2 a = new xz2();
    @cz4
    @NotNull
    public static String d = "";
    @NotNull
    private static final String h = "debug.greedygame.sdkx.enable.logs";
    @cz4
    public static boolean e = tz2.a.b(h, false);

    /* compiled from: Logger.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/p7700g/p99005/yq4;", "<anonymous>", "()V"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a extends e25 implements uz4<yq4> {
        public final /* synthetic */ String t;
        public final /* synthetic */ String u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(0);
            this.t = str;
            this.u = str2;
        }

        public final void h() {
            File file = xz2.j;
            if (file == null) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.t);
            sb.append(" - ");
            gy4.i(file, wo1.B(sb, this.u, '\n'), null, 2, null);
        }

        @Override // com.p7700g.p99005.uz4
        public /* bridge */ /* synthetic */ yq4 x() {
            h();
            return yq4.a;
        }
    }

    private xz2() {
    }

    @jz4
    public static final void b(@NotNull String str, @NotNull String str2, @NotNull Throwable th) {
        c25.p(str, "tag");
        c25.p(str2, "msg");
        c25.p(th, "throwable");
        if (e) {
            xz2 xz2Var = a;
            f(str);
            th.getLocalizedMessage();
            xz2Var.i(str, str2);
        }
    }

    @jz4
    public static final void c(@NotNull String str, @NotNull String... strArr) {
        c25.p(str, "tag");
        c25.p(strArr, "msg");
        if (e) {
            String Mh = as4.Mh(strArr, "\n", null, null, 0, null, null, 62, null);
            xz2 xz2Var = a;
            f(str);
            xz2Var.i(str, Mh);
        }
    }

    @jz4
    public static final void d(@NotNull String str, @NotNull String str2) {
        c25.p(str, "tag");
        c25.p(str2, "msg");
        xz2 xz2Var = a;
        f(str);
        xz2Var.i(str, str2);
    }

    @jz4
    public static final void e(@NotNull String str, @NotNull String str2, @NotNull Exception exc) {
        c25.p(str, "tag");
        c25.p(str2, "msg");
        c25.p(exc, "e");
        xz2 xz2Var = a;
        f(str);
        exc.getMessage();
        xz2Var.i(str, str2);
        exc.printStackTrace();
    }

    @jz4
    private static final String f(String str) {
        if (e) {
            StringBuilder sb = new StringBuilder();
            sb.append(b);
            sb.append(f14.u);
            sb.append(str);
            sb.append("][");
            return wo1.B(sb, d, f14.v);
        }
        return wo1.B(wo1.L(b, "[GGAds]["), d, f14.v);
    }

    @jz4
    public static final void g(@NotNull String str, @NotNull String str2) {
        c25.p(str, "tag");
        c25.p(str2, "msg");
        xz2 xz2Var = a;
        f(str);
        xz2Var.i(str, str2);
    }

    private final void i(String str, String str2) {
        ky2.a.a().f(new a(str, str2));
    }

    public final void h(@NotNull Context context) {
        File file;
        c25.p(context, "context");
        if (e) {
            File file2 = new File(context.getFilesDir(), i);
            j = file2;
            if ((file2.exists()) && (file = j) != null) {
                file.delete();
            }
            File file3 = j;
            if (file3 == null) {
                return;
            }
            file3.createNewFile();
        }
    }
}