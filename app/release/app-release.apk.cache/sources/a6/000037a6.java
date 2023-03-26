package com.microsoft.appcenter.utils.storage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import com.microsoft.appcenter.utils.AppCenterLog;
import com.p7700g.p99005.p1;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.io.Closeable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class DatabaseManager implements Closeable {
    public static final String PRIMARY_KEY = "oid";
    public static final String[] SELECT_PRIMARY_KEY = {"oid"};
    private final Context mContext;
    private final String mDatabase;
    private final String mDefaultTable;
    private final Listener mListener;
    private SQLiteOpenHelper mSQLiteOpenHelper;
    private final ContentValues mSchema;

    /* loaded from: classes3.dex */
    public interface Listener {
        void onCreate(SQLiteDatabase sQLiteDatabase);

        void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2);
    }

    public DatabaseManager(Context context, String str, String str2, int i, ContentValues contentValues, final String str3, @x1 Listener listener) {
        this.mContext = context;
        this.mDatabase = str;
        this.mDefaultTable = str2;
        this.mSchema = contentValues;
        this.mListener = listener;
        this.mSQLiteOpenHelper = new SQLiteOpenHelper(context, str, null, i) { // from class: com.microsoft.appcenter.utils.storage.DatabaseManager.1
            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onCreate(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL(str3);
                DatabaseManager.this.mListener.onCreate(sQLiteDatabase);
            }

            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
                DatabaseManager.this.mListener.onUpgrade(sQLiteDatabase, i2, i3);
            }
        };
    }

    private static ContentValues buildValues(Cursor cursor, ContentValues contentValues) {
        ContentValues contentValues2 = new ContentValues();
        for (int i = 0; i < cursor.getColumnCount(); i++) {
            if (!cursor.isNull(i)) {
                String columnName = cursor.getColumnName(i);
                if (columnName.equals("oid")) {
                    contentValues2.put(columnName, Long.valueOf(cursor.getLong(i)));
                } else {
                    Object obj = contentValues.get(columnName);
                    if (obj instanceof byte[]) {
                        contentValues2.put(columnName, cursor.getBlob(i));
                    } else if (obj instanceof Double) {
                        contentValues2.put(columnName, Double.valueOf(cursor.getDouble(i)));
                    } else if (obj instanceof Float) {
                        contentValues2.put(columnName, Float.valueOf(cursor.getFloat(i)));
                    } else if (obj instanceof Integer) {
                        contentValues2.put(columnName, Integer.valueOf(cursor.getInt(i)));
                    } else if (obj instanceof Long) {
                        contentValues2.put(columnName, Long.valueOf(cursor.getLong(i)));
                    } else if (obj instanceof Short) {
                        contentValues2.put(columnName, Short.valueOf(cursor.getShort(i)));
                    } else if (obj instanceof Boolean) {
                        contentValues2.put(columnName, Boolean.valueOf(cursor.getInt(i) == 1));
                    } else {
                        contentValues2.put(columnName, cursor.getString(i));
                    }
                }
            }
        }
        return contentValues2;
    }

    public void clear() {
        try {
            getDatabase().delete(this.mDefaultTable, null, null);
        } catch (RuntimeException e) {
            AppCenterLog.error("AppCenter", "Failed to clear the table.", e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.mSQLiteOpenHelper.close();
        } catch (RuntimeException e) {
            AppCenterLog.error("AppCenter", "Failed to close the database.", e);
        }
    }

    public void delete(@p1(from = 0) long j) {
        delete(this.mDefaultTable, "oid", Long.valueOf(j));
    }

    public Cursor getCursor(@z1 SQLiteQueryBuilder sQLiteQueryBuilder, String[] strArr, @z1 String[] strArr2, @z1 String str) throws RuntimeException {
        return getCursor(this.mDefaultTable, sQLiteQueryBuilder, strArr, strArr2, str);
    }

    @r2
    public SQLiteDatabase getDatabase() {
        try {
            return this.mSQLiteOpenHelper.getWritableDatabase();
        } catch (RuntimeException e) {
            AppCenterLog.warn("AppCenter", "Failed to open database. Trying to delete database (may be corrupted).", e);
            if (this.mContext.deleteDatabase(this.mDatabase)) {
                AppCenterLog.info("AppCenter", "The database was successfully deleted.");
            } else {
                AppCenterLog.warn("AppCenter", "Failed to delete database.");
            }
            return this.mSQLiteOpenHelper.getWritableDatabase();
        }
    }

    public long getMaxSize() {
        try {
            return getDatabase().getMaximumSize();
        } catch (RuntimeException e) {
            AppCenterLog.error("AppCenter", "Could not get maximum database size.", e);
            return -1L;
        }
    }

    public final long getRowCount() {
        try {
            return DatabaseUtils.queryNumEntries(getDatabase(), this.mDefaultTable);
        } catch (RuntimeException e) {
            AppCenterLog.error("AppCenter", "Failed to get row count of database.", e);
            return -1L;
        }
    }

    @z1
    public ContentValues nextValues(Cursor cursor) {
        try {
            if (cursor.moveToNext()) {
                return buildValues(cursor);
            }
            return null;
        } catch (RuntimeException e) {
            AppCenterLog.error("AppCenter", "Failed to get next cursor value: ", e);
            return null;
        }
    }

    public long put(@x1 ContentValues contentValues, @x1 String str) {
        Long l = null;
        Cursor cursor = null;
        while (l == null) {
            try {
                try {
                    l = Long.valueOf(getDatabase().insertOrThrow(this.mDefaultTable, null, contentValues));
                } catch (SQLiteFullException e) {
                    AppCenterLog.debug("AppCenter", "Storage is full, trying to delete the oldest log that has the lowest priority which is lower or equal priority than the new log");
                    if (cursor == null) {
                        String asString = contentValues.getAsString(str);
                        SQLiteQueryBuilder newSQLiteQueryBuilder = SQLiteUtils.newSQLiteQueryBuilder();
                        newSQLiteQueryBuilder.appendWhere(str + " <= ?");
                        cursor = getCursor(newSQLiteQueryBuilder, SELECT_PRIMARY_KEY, new String[]{asString}, str + " , oid");
                    }
                    if (cursor.moveToNext()) {
                        long j = cursor.getLong(0);
                        delete(j);
                        AppCenterLog.debug("AppCenter", "Deleted log id=" + j);
                    } else {
                        throw e;
                    }
                }
            } catch (RuntimeException e2) {
                l = -1L;
                AppCenterLog.error("AppCenter", String.format("Failed to insert values (%s) to database %s.", contentValues.toString(), this.mDatabase), e2);
            }
        }
        if (cursor != null) {
            try {
                cursor.close();
            } catch (RuntimeException unused) {
            }
        }
        return l.longValue();
    }

    public boolean setMaxSize(long j) {
        try {
            SQLiteDatabase database = getDatabase();
            long maximumSize = database.setMaximumSize(j);
            long pageSize = database.getPageSize();
            long j2 = j / pageSize;
            if (j % pageSize != 0) {
                j2++;
            }
            if (maximumSize != j2 * pageSize) {
                AppCenterLog.error("AppCenter", "Could not change maximum database size to " + j + " bytes, current maximum size is " + maximumSize + " bytes.");
                return false;
            } else if (j == maximumSize) {
                AppCenterLog.info("AppCenter", "Changed maximum database size to " + maximumSize + " bytes.");
                return true;
            } else {
                AppCenterLog.info("AppCenter", "Changed maximum database size to " + maximumSize + " bytes (next multiple of page size).");
                return true;
            }
        } catch (RuntimeException e) {
            AppCenterLog.error("AppCenter", "Could not change maximum database size.", e);
            return false;
        }
    }

    @r2
    public void setSQLiteOpenHelper(@x1 SQLiteOpenHelper sQLiteOpenHelper) {
        this.mSQLiteOpenHelper.close();
        this.mSQLiteOpenHelper = sQLiteOpenHelper;
    }

    public int delete(@x1 String str, @z1 Object obj) {
        return delete(this.mDefaultTable, str, obj);
    }

    public Cursor getCursor(@x1 String str, @z1 SQLiteQueryBuilder sQLiteQueryBuilder, String[] strArr, @z1 String[] strArr2, @z1 String str2) throws RuntimeException {
        if (sQLiteQueryBuilder == null) {
            sQLiteQueryBuilder = SQLiteUtils.newSQLiteQueryBuilder();
        }
        SQLiteQueryBuilder sQLiteQueryBuilder2 = sQLiteQueryBuilder;
        sQLiteQueryBuilder2.setTables(str);
        return sQLiteQueryBuilder2.query(getDatabase(), strArr, null, strArr2, null, null, str2);
    }

    private int delete(@x1 String str, @x1 String str2, @z1 Object obj) {
        String[] strArr = {String.valueOf(obj)};
        try {
            SQLiteDatabase database = getDatabase();
            return database.delete(str, str2 + " = ?", strArr);
        } catch (RuntimeException e) {
            AppCenterLog.error("AppCenter", String.format("Failed to delete values that match condition=\"%s\" and values=\"%s\" from database %s.", wo1.t(str2, " = ?"), Arrays.toString(strArr), this.mDatabase), e);
            return 0;
        }
    }

    public ContentValues buildValues(Cursor cursor) {
        return buildValues(cursor, this.mSchema);
    }
}