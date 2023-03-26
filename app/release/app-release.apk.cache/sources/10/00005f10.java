package com.p7700g.p99005;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SystemPropertyReader.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/p7700g/p99005/tz2;", "", "<init>", "()V", "a", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class tz2 {
    @NotNull
    public static final a a = new a(null);
    @NotNull
    public static final String b = "SystemPropReader";

    /* compiled from: SystemPropertyReader.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"com/p7700g/p99005/tz2$a", "", "", "key", "default", "a", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "b", "(Ljava/lang/String;Z)Z", "TAG", "Ljava/lang/String;", "<init>", "()V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final String a(@NotNull String str, @NotNull String str2) throws Exception {
            c25.p(str, "key");
            c25.p(str2, "default");
            try {
                Object invoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
                if (invoke != null) {
                    String str3 = (String) invoke;
                    return b95.U1(str3) ? str2 : str3;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            } catch (ClassNotFoundException | Exception | NoClassDefFoundError unused) {
                return str2;
            }
        }

        public final boolean b(@NotNull String str, boolean z) {
            c25.p(str, "key");
            try {
                String a = a(str, String.valueOf(z));
                if (a == null) {
                    return false;
                }
                return Boolean.parseBoolean(a);
            } catch (Exception unused) {
                return z;
            }
        }
    }
}