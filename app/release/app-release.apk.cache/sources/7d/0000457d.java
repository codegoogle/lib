package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PermissionHelper.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\r\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/p7700g/p99005/gy2;", "", "", "permission", "", "d", "(Ljava/lang/String;)Z", "e", "()Z", "Landroid/content/Context;", "Landroid/content/Context;", "c", "()Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "a", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class gy2 {
    @NotNull
    public static final a a = new a(null);
    @NotNull
    private static final String b = "PrmHlpr";
    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    private static gy2 c;
    @NotNull
    private final Context d;

    /* compiled from: PermissionHelper.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"com/p7700g/p99005/gy2$a", "", "Landroid/content/Context;", "context", "Lcom/p7700g/p99005/gy2;", "a", "(Landroid/content/Context;)Lcom/p7700g/p99005/gy2;", "", "TAG", "Ljava/lang/String;", "permissionManager", "Lcom/p7700g/p99005/gy2;", "<init>", "()V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @jz4
        @Nullable
        public final gy2 a(@Nullable Context context) {
            if (context == null) {
                return null;
            }
            if (gy2.c == null) {
                gy2.c = new gy2(context, null);
            }
            return gy2.c;
        }
    }

    private gy2(Context context) {
        this.d = context;
    }

    public /* synthetic */ gy2(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    @jz4
    @Nullable
    public static final gy2 f(@Nullable Context context) {
        return a.a(context);
    }

    @NotNull
    public final Context c() {
        return this.d;
    }

    public final boolean d(@NotNull String str) {
        c25.p(str, "permission");
        try {
            return this.d.checkCallingOrSelfPermission(str) == 0;
        } catch (Error e) {
            Throwable cause = e.getCause();
            c25.m(cause);
            xz2.b(b, "PackageManager check permission crashed", cause);
            return false;
        } catch (Exception e2) {
            Throwable cause2 = e2.getCause();
            c25.m(cause2);
            xz2.b(b, "PackageManager check permission crashed", cause2);
            return false;
        }
    }

    public final boolean e() {
        return d("android.permission.ACCESS_COARSE_LOCATION") || d("android.permission.ACCESS_FINE_LOCATION");
    }
}