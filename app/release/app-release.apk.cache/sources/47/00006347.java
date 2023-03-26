package com.p7700g.p99005;

import android.content.pm.PackageInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class wa3 extends ua3 {
    @NotNull
    public static final a b = new a(null);
    @NotNull
    private static final db3 c = new fb3("");
    @NotNull
    private final gb3 d;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final db3 a() {
            return wa3.c;
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            l23.values();
            int[] iArr = new int[16];
            iArr[l23.APP_VERSION_NAME.ordinal()] = 1;
            iArr[l23.APP_VERSION_CODE.ordinal()] = 2;
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa3(@NotNull gb3 gb3Var) {
        super(l23.APP_VERSION_NAME, l23.APP_VERSION_CODE);
        c25.p(gb3Var, "pm");
        this.d = gb3Var;
    }

    @Override // com.p7700g.p99005.ua3
    @NotNull
    public db3 a(@NotNull l23 l23Var) {
        c25.p(l23Var, "reportField");
        PackageInfo a2 = this.d.a();
        if (a2 != null) {
            int i = b.a[l23Var.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return c;
                }
                return new eb3(Integer.valueOf(a2.versionCode));
            }
            String str = a2.versionName;
            c25.o(str, "info.versionName");
            return new fb3(str);
        }
        return c;
    }
}