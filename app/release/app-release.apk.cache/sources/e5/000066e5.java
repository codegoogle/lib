package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ya3 extends ua3 {
    @NotNull
    public static final a b = new a(null);
    @Nullable
    private final Context c;
    @Nullable
    private final Boolean d;
    @NotNull
    private final String e;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            l23.values();
            int[] iArr = new int[16];
            iArr[l23.PHONE_MODEL.ordinal()] = 1;
            iArr[l23.ANDROID_VERSION.ordinal()] = 2;
            iArr[l23.AI5.ordinal()] = 3;
            iArr[l23.SDK_N.ordinal()] = 4;
            iArr[l23.SDK_V.ordinal()] = 5;
            iArr[l23.IS_NON_FATAL.ordinal()] = 6;
            iArr[l23.TAG.ordinal()] = 7;
            iArr[l23.PLATFORM.ordinal()] = 8;
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya3(@Nullable Context context, @Nullable Boolean bool, @NotNull String str) {
        super(l23.PHONE_MODEL, l23.ANDROID_VERSION, l23.AI5, l23.SDK_N, l23.SDK_V, l23.IS_NON_FATAL, l23.TAG, l23.PLATFORM);
        c25.p(str, "mTag");
        this.c = context;
        this.d = bool;
        this.e = str;
    }

    @SuppressLint({"HardwareIds"})
    private final String d() {
        Context context = this.c;
        c25.m(context);
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        c25.o(string, "getString(mContext!!.contentResolver,\n                Settings.Secure.ANDROID_ID)");
        return string;
    }

    private final String e() {
        if (d().length() > 0) {
            return zz2.b(d());
        }
        return d();
    }

    private final String f() {
        return "0.0.94";
    }

    private final String g() {
        return "3042";
    }

    @Override // com.p7700g.p99005.ua3
    @NotNull
    public db3 a(@NotNull l23 l23Var) {
        c25.p(l23Var, "reportField");
        switch (b.a[l23Var.ordinal()]) {
            case 1:
                String str = Build.MODEL;
                c25.o(str, "MODEL");
                return new fb3(str);
            case 2:
                String str2 = Build.VERSION.RELEASE;
                c25.o(str2, "RELEASE");
                return new fb3(str2);
            case 3:
                String e = e();
                c25.m(e);
                return new fb3(e);
            case 4:
                return new fb3(g());
            case 5:
                return new fb3(f());
            case 6:
                Boolean bool = this.d;
                c25.m(bool);
                return new bb3(bool.booleanValue());
            case 7:
                return new fb3(this.e);
            case 8:
                return new fb3(pt0.a);
            default:
                return wa3.b.a();
        }
    }
}