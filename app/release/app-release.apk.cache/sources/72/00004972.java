package com.p7700g.p99005;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: SharedPrefHelper.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010%\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001f\u001a\f\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u00030\u001c8F@\u0006¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!¨\u0006("}, d2 = {"Lcom/p7700g/p99005/iy2;", "", "", "key", "Lcom/p7700g/p99005/yq4;", "k", "(Ljava/lang/String;)V", "value", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "", "d", "(Ljava/lang/String;Z)V", "", "a", "(Ljava/lang/String;I)V", "", "b", "(Ljava/lang/String;J)V", "defaultValue", "h", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "i", "(Ljava/lang/String;Z)Z", "f", "(Ljava/lang/String;I)I", com.anythink.basead.d.g.i, "(Ljava/lang/String;J)J", "", "e", "()Ljava/util/Map;", "all", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "prefs", "Landroid/content/Context;", "mContext", "preferenceName", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class iy2 {
    @NotNull
    public static final a a = new a(null);
    @NotNull
    public static final String b = "uuid_id";
    @NotNull
    public static final String c = "install_referrer_already_sent";
    @NotNull
    private final SharedPreferences d;

    /* compiled from: SharedPrefHelper.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"com/p7700g/p99005/iy2$a", "", "", "INSTALL_REFERRER_ALREADY_SENT", "Ljava/lang/String;", "UUID_ID", "<init>", "()V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public iy2(@NotNull Context context, @NotNull String str) {
        c25.p(context, "mContext");
        c25.p(str, "preferenceName");
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        c25.o(sharedPreferences, "mContext.getSharedPreferences(preferenceName, Context.MODE_PRIVATE)");
        this.d = sharedPreferences;
    }

    public static /* synthetic */ boolean j(iy2 iy2Var, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return iy2Var.i(str, z);
    }

    public final void a(@NotNull String str, int i) {
        c25.p(str, "key");
        this.d.edit().putInt(str, i).apply();
    }

    public final void b(@NotNull String str, long j) {
        c25.p(str, "key");
        this.d.edit().putLong(str, j).apply();
    }

    public final void c(@NotNull String str, @NotNull String str2) {
        c25.p(str, "key");
        c25.p(str2, "value");
        this.d.edit().putString(str, str2).apply();
    }

    public final void d(@NotNull String str, boolean z) {
        c25.p(str, "key");
        this.d.edit().putBoolean(str, z).apply();
    }

    @NotNull
    public final Map<String, ?> e() {
        Map<String, ?> all = this.d.getAll();
        c25.o(all, "prefs.all");
        return all;
    }

    public final int f(@NotNull String str, int i) {
        c25.p(str, "key");
        return this.d.getInt(str, i);
    }

    public final long g(@NotNull String str, long j) {
        c25.p(str, "key");
        return this.d.getLong(str, j);
    }

    @NotNull
    public final String h(@NotNull String str, @NotNull String str2) {
        c25.p(str, "key");
        c25.p(str2, "defaultValue");
        String string = this.d.getString(str, str2);
        return string == null ? "" : string;
    }

    public final boolean i(@NotNull String str, boolean z) {
        c25.p(str, "key");
        return this.d.getBoolean(str, z);
    }

    public final void k(@NotNull String str) {
        c25.p(str, "key");
        SharedPreferences.Editor edit = this.d.edit();
        edit.remove(str);
        edit.apply();
    }
}