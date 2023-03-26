package com.p7700g.p99005;

import android.database.sqlite.SQLiteDatabase;
import org.jetbrains.annotations.NotNull;

/* compiled from: SQLiteDatabase.kt */
@vo4(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"transaction", "T", "Landroid/database/sqlite/SQLiteDatabase;", "exclusive", "", "body", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroid/database/sqlite/SQLiteDatabase;ZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class xi {
    public static final <T> T a(@NotNull SQLiteDatabase sQLiteDatabase, boolean z, @NotNull f05<? super SQLiteDatabase, ? extends T> f05Var) {
        c25.p(sQLiteDatabase, "<this>");
        c25.p(f05Var, "body");
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T M = f05Var.M(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return M;
        } finally {
            z15.d(1);
            sQLiteDatabase.endTransaction();
            z15.c(1);
        }
    }

    public static /* synthetic */ Object b(SQLiteDatabase sQLiteDatabase, boolean z, f05 f05Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c25.p(sQLiteDatabase, "<this>");
        c25.p(f05Var, "body");
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            Object M = f05Var.M(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return M;
        } finally {
            z15.d(1);
            sQLiteDatabase.endTransaction();
            z15.c(1);
        }
    }
}