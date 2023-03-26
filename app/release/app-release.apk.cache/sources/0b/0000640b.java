package com.p7700g.p99005;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.microsoft.appcenter.AppCenter;
import org.jetbrains.annotations.NotNull;

/* compiled from: OSOutcomeTableProvider.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/p7700g/p99005/wo3;", "", "Landroid/database/sqlite/SQLiteDatabase;", "db", "Lcom/p7700g/p99005/yq4;", "b", "(Landroid/database/sqlite/SQLiteDatabase;)V", "c", "a", "<init>", "()V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class wo3 {
    public final void a(@NotNull SQLiteDatabase sQLiteDatabase) {
        c25.p(sQLiteDatabase, "db");
        try {
            try {
                sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
                sQLiteDatabase.execSQL(zo3.n);
                sQLiteDatabase.execSQL("INSERT INTO cached_unique_outcome(_id,name,channel_influence_id) SELECT _id,name,notification_id FROM " + lo3.d + AppCenter.PAIR_DELIMITER);
                StringBuilder sb = new StringBuilder();
                sb.append("UPDATE cached_unique_outcome SET channel_type = '");
                sb.append(eo3.NOTIFICATION.toString());
                sb.append("';");
                sQLiteDatabase.execSQL(sb.toString());
                sQLiteDatabase.execSQL("DROP TABLE cached_unique_outcome_notification;");
            } catch (SQLiteException e) {
                e.printStackTrace();
            }
        } finally {
            sQLiteDatabase.execSQL("COMMIT;");
        }
    }

    public final void b(@NotNull SQLiteDatabase sQLiteDatabase) {
        c25.p(sQLiteDatabase, "db");
        try {
            try {
                sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
                sQLiteDatabase.execSQL("CREATE TEMPORARY TABLE outcome_backup(_id,session,notification_ids,name,timestamp);");
                sQLiteDatabase.execSQL("INSERT INTO outcome_backup SELECT _id,session,notification_ids,name,timestamp FROM outcome;");
                sQLiteDatabase.execSQL("DROP TABLE outcome;");
                sQLiteDatabase.execSQL(zo3.k);
                sQLiteDatabase.execSQL("INSERT INTO outcome (_id,session,notification_ids,name,timestamp, weight) SELECT _id,session,notification_ids,name,timestamp, 0 FROM outcome_backup;");
                sQLiteDatabase.execSQL("DROP TABLE outcome_backup;");
            } catch (SQLiteException e) {
                e.printStackTrace();
            }
        } finally {
            sQLiteDatabase.execSQL("COMMIT;");
        }
    }

    public final void c(@NotNull SQLiteDatabase sQLiteDatabase) {
        c25.p(sQLiteDatabase, "db");
        String str = "_id,name,timestamp,notification_ids,weight," + yo3.f;
        try {
            try {
                sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
                sQLiteDatabase.execSQL("ALTER TABLE outcome RENAME TO outcome_aux;");
                sQLiteDatabase.execSQL(zo3.l);
                sQLiteDatabase.execSQL("INSERT INTO outcome(" + str + ") SELECT _id,name,timestamp,notification_ids,weight,session FROM outcome_aux" + AppCenter.PAIR_DELIMITER);
                sQLiteDatabase.execSQL("DROP TABLE outcome_aux;");
            } catch (SQLiteException e) {
                e.printStackTrace();
            }
        } finally {
            sQLiteDatabase.execSQL("COMMIT;");
        }
    }
}