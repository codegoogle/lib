package com.p7700g.p99005;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class xa3 extends ua3 {
    @NotNull
    private final String b;
    @NotNull
    private final String c;
    @NotNull
    private final SharedPreferences d;

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            l23.values();
            int[] iArr = new int[16];
            iArr[l23.SESSION_ID.ordinal()] = 1;
            iArr[l23.GAME_ID.ordinal()] = 2;
            iArr[l23.ADVID.ordinal()] = 3;
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa3(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        super(l23.SESSION_ID, l23.GAME_ID, l23.ADVID);
        c25.p(context, "context");
        c25.p(str, "prefName");
        c25.p(str2, "sessionId");
        c25.p(str3, "gameId");
        this.b = str2;
        this.c = str3;
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        c25.o(sharedPreferences, "context.getSharedPreferences(prefName, Context.MODE_PRIVATE)");
        this.d = sharedPreferences;
    }

    @Override // com.p7700g.p99005.ua3
    @NotNull
    public db3 a(@NotNull l23 l23Var) {
        String str;
        String str2;
        c25.p(l23Var, "reportField");
        int i = a.a[l23Var.ordinal()];
        if (i == 1) {
            if (TextUtils.isEmpty(this.b)) {
                str = this.d.getString("session_id", null);
            } else {
                str = this.b;
            }
            if (TextUtils.isEmpty(str)) {
                return wa3.b.a();
            }
            return new fb3(str != null ? str : "");
        } else if (i != 2) {
            if (i != 3) {
                return wa3.b.a();
            }
            String string = this.d.getString("advid", "");
            return new fb3(string != null ? string : "");
        } else {
            if (TextUtils.isEmpty(this.c)) {
                str2 = this.d.getString("app_id", null);
            } else {
                str2 = this.c;
            }
            if (TextUtils.isEmpty(str2)) {
                return wa3.b.a();
            }
            return new fb3(str2 != null ? str2 : "");
        }
    }
}