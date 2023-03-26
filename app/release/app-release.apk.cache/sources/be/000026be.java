package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzees extends SQLiteOpenHelper {
    private final Context zza;
    private final zzfvm zzb;

    public zzees(Context context, zzfvm zzfvmVar) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzha)).intValue());
        this.zza = context;
        this.zzb = zzfvmVar;
    }

    public static /* synthetic */ void zzf(SQLiteDatabase sQLiteDatabase, String str, zzcfn zzcfnVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzj(sQLiteDatabase, zzcfnVar);
    }

    public static final void zzi(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    public static void zzj(SQLiteDatabase sQLiteDatabase, zzcfn zzcfnVar) {
        sQLiteDatabase.beginTransaction();
        try {
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{"url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex("url");
                if (columnIndex != -1) {
                    strArr[i] = query.getString(columnIndex);
                }
                i++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            for (int i2 = 0; i2 < count; i2++) {
                zzcfnVar.zza(strArr[i2]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final /* synthetic */ Void zza(zzeeu zzeeuVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzeeuVar.zza));
        contentValues.put("gws_query_id", zzeeuVar.zzb);
        contentValues.put("url", zzeeuVar.zzc);
        contentValues.put("event_state", Integer.valueOf(zzeeuVar.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        com.google.android.gms.ads.internal.zzt.zzp();
        com.google.android.gms.ads.internal.util.zzbr zzw = com.google.android.gms.ads.internal.util.zzs.zzw(this.zza);
        if (zzw != null) {
            try {
                zzw.zze(ObjectWrapper.wrap(this.zza));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }

    public final void zzc(final String str) {
        zze(new zzffi() { // from class: com.google.android.gms.internal.ads.zzeep
            @Override // com.google.android.gms.internal.ads.zzffi
            public final Object zza(Object obj) {
                zzees.zzi((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void zzd(final zzeeu zzeeuVar) {
        zze(new zzffi() { // from class: com.google.android.gms.internal.ads.zzeen
            @Override // com.google.android.gms.internal.ads.zzffi
            public final Object zza(Object obj) {
                zzees.this.zza(zzeeuVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    public final void zze(zzffi zzffiVar) {
        zzfvc.zzr(this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeel
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzees.this.getWritableDatabase();
            }
        }), new zzeer(this, zzffiVar), this.zzb);
    }

    public final void zzg(final SQLiteDatabase sQLiteDatabase, final zzcfn zzcfnVar, final String str) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeem
            @Override // java.lang.Runnable
            public final void run() {
                zzees.zzf(sQLiteDatabase, str, zzcfnVar);
            }
        });
    }

    public final void zzh(final zzcfn zzcfnVar, final String str) {
        zze(new zzffi() { // from class: com.google.android.gms.internal.ads.zzeeq
            @Override // com.google.android.gms.internal.ads.zzffi
            public final Object zza(Object obj) {
                zzees.this.zzg((SQLiteDatabase) obj, zzcfnVar, str);
                return null;
            }
        });
    }
}