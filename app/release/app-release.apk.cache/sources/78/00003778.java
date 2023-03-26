package com.microsoft.appcenter.persistence;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import com.microsoft.appcenter.Constants;
import com.microsoft.appcenter.Flags;
import com.microsoft.appcenter.ingestion.models.Log;
import com.microsoft.appcenter.ingestion.models.one.CommonSchemaLog;
import com.microsoft.appcenter.ingestion.models.one.PartAUtils;
import com.microsoft.appcenter.persistence.Persistence;
import com.microsoft.appcenter.utils.AppCenterLog;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import com.microsoft.appcenter.utils.crypto.CryptoUtils;
import com.microsoft.appcenter.utils.storage.DatabaseManager;
import com.microsoft.appcenter.utils.storage.FileManager;
import com.microsoft.appcenter.utils.storage.SQLiteUtils;
import com.p7700g.p99005.p1;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class DatabasePersistence extends Persistence {
    private static final String COLUMN_DATA_TYPE = "type";
    @r2
    public static final String COLUMN_GROUP = "persistence_group";
    @r2
    public static final String COLUMN_LOG = "log";
    @r2
    public static final String COLUMN_PRIORITY = "priority";
    @r2
    public static final String COLUMN_TARGET_KEY = "target_key";
    @r2
    public static final String COLUMN_TARGET_TOKEN = "target_token";
    @r2
    public static final String CREATE_LOGS_SQL = "CREATE TABLE IF NOT EXISTS `logs`(`oid` INTEGER PRIMARY KEY AUTOINCREMENT,`target_token` TEXT,`type` TEXT,`priority` INTEGER,`log` TEXT,`persistence_group` TEXT,`target_key` TEXT);";
    private static final String CREATE_PRIORITY_INDEX_LOGS = "CREATE INDEX `ix_logs_priority` ON logs (`priority`)";
    @r2
    public static final String DATABASE = "com.microsoft.appcenter.persistence";
    private static final String DROP_LOGS_SQL = "DROP TABLE `logs`";
    private static final String GET_SORT_ORDER = "priority DESC, oid";
    private static final String PAYLOAD_FILE_EXTENSION = ".json";
    private static final String PAYLOAD_LARGE_DIRECTORY = "/appcenter/database_large_payloads";
    private static final int PAYLOAD_MAX_SIZE = 1992294;
    @r2
    public static final ContentValues SCHEMA = getContentValues("", "", "", "", "", 0);
    @r2
    public static final String TABLE = "logs";
    private static final int VERSION = 6;
    @r2
    public static final int VERSION_TIMESTAMP_COLUMN = 5;
    private final Context mContext;
    @r2
    public final DatabaseManager mDatabaseManager;
    private final File mLargePayloadDirectory;
    @r2
    public final Set<Long> mPendingDbIdentifiers;
    @r2
    public final Map<String, List<Long>> mPendingDbIdentifiersGroups;

    public DatabasePersistence(Context context) {
        this(context, 6, SCHEMA);
    }

    private void deleteLog(File file, long j) {
        getLargePayloadFile(file, j).delete();
        this.mDatabaseManager.delete(j);
    }

    private static ContentValues getContentValues(@z1 String str, @z1 String str2, String str3, String str4, String str5, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_GROUP, str);
        contentValues.put(COLUMN_LOG, str2);
        contentValues.put(COLUMN_TARGET_TOKEN, str3);
        contentValues.put("type", str4);
        contentValues.put(COLUMN_TARGET_KEY, str5);
        contentValues.put("priority", Integer.valueOf(i));
        return contentValues;
    }

    private List<Long> getLogsIds(SQLiteQueryBuilder sQLiteQueryBuilder, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursor = this.mDatabaseManager.getCursor(sQLiteQueryBuilder, DatabaseManager.SELECT_PRIMARY_KEY, strArr, null);
            while (cursor.moveToNext()) {
                arrayList.add(this.mDatabaseManager.buildValues(cursor).getAsLong("oid"));
            }
            cursor.close();
        } catch (RuntimeException e) {
            AppCenterLog.error("AppCenter", "Failed to get corrupted ids: ", e);
        }
        return arrayList;
    }

    @Override // com.microsoft.appcenter.persistence.Persistence
    public void clearPendingLogState() {
        this.mPendingDbIdentifiers.clear();
        this.mPendingDbIdentifiersGroups.clear();
        AppCenterLog.debug("AppCenter", "Cleared pending log states");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.mDatabaseManager.close();
    }

    @Override // com.microsoft.appcenter.persistence.Persistence
    public int countLogs(@x1 String str) {
        SQLiteQueryBuilder newSQLiteQueryBuilder = SQLiteUtils.newSQLiteQueryBuilder();
        newSQLiteQueryBuilder.appendWhere("persistence_group = ?");
        int i = 0;
        try {
            Cursor cursor = this.mDatabaseManager.getCursor(newSQLiteQueryBuilder, new String[]{"COUNT(*)"}, new String[]{str}, null);
            cursor.moveToNext();
            i = cursor.getInt(0);
            cursor.close();
        } catch (RuntimeException e) {
            AppCenterLog.error("AppCenter", "Failed to get logs count: ", e);
        }
        return i;
    }

    @Override // com.microsoft.appcenter.persistence.Persistence
    public void deleteLogs(@x1 String str, @x1 String str2) {
        AppCenterLog.debug("AppCenter", "Deleting logs from the Persistence database for " + str + " with " + str2);
        AppCenterLog.debug("AppCenter", "The IDs for deleting log(s) is/are:");
        Map<String, List<Long>> map = this.mPendingDbIdentifiersGroups;
        List<Long> remove = map.remove(str + str2);
        File largePayloadGroupDirectory = getLargePayloadGroupDirectory(str);
        if (remove != null) {
            for (Long l : remove) {
                AppCenterLog.debug("AppCenter", "\t" + l);
                deleteLog(largePayloadGroupDirectory, l.longValue());
                this.mPendingDbIdentifiers.remove(l);
            }
        }
    }

    @x1
    @r2
    public File getLargePayloadFile(File file, long j) {
        return new File(file, j + ".json");
    }

    @x1
    @r2
    public File getLargePayloadGroupDirectory(String str) {
        return new File(this.mLargePayloadDirectory, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.microsoft.appcenter.persistence.Persistence
    @z1
    public String getLogs(@x1 String str, @x1 Collection<String> collection, @p1(from = 0) int i, @x1 List<Log> list) {
        AppCenterLog.debug("AppCenter", "Trying to get " + i + " logs from the Persistence database for " + str);
        SQLiteQueryBuilder newSQLiteQueryBuilder = SQLiteUtils.newSQLiteQueryBuilder();
        newSQLiteQueryBuilder.appendWhere("persistence_group = ?");
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        if (!collection.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < collection.size(); i2++) {
                sb.append("?,");
            }
            sb.deleteCharAt(sb.length() - 1);
            newSQLiteQueryBuilder.appendWhere(" AND ");
            newSQLiteQueryBuilder.appendWhere("target_key NOT IN (" + sb.toString() + ")");
            arrayList.addAll(collection);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        File largePayloadGroupDirectory = getLargePayloadGroupDirectory(str);
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        Cursor cursor = null;
        try {
            cursor = this.mDatabaseManager.getCursor(newSQLiteQueryBuilder, null, strArr, GET_SORT_ORDER);
        } catch (RuntimeException e) {
            AppCenterLog.error("AppCenter", "Failed to get logs: ", e);
        }
        int i3 = 0;
        while (cursor != null) {
            ContentValues nextValues = this.mDatabaseManager.nextValues(cursor);
            if (nextValues == null || i3 >= i) {
                break;
            }
            Long asLong = nextValues.getAsLong("oid");
            if (asLong == null) {
                AppCenterLog.error("AppCenter", "Empty database record, probably content was larger than 2MB, need to delete as it's now corrupted.");
                Iterator<Long> it = getLogsIds(newSQLiteQueryBuilder, strArr).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Long next = it.next();
                        if (!this.mPendingDbIdentifiers.contains(next) && !linkedHashMap.containsKey(next)) {
                            deleteLog(largePayloadGroupDirectory, next.longValue());
                            AppCenterLog.error("AppCenter", "Empty database corrupted empty record deleted, id=" + next);
                            break;
                        }
                    }
                }
            } else if (this.mPendingDbIdentifiers.contains(asLong)) {
                continue;
            } else {
                try {
                    String asString = nextValues.getAsString(COLUMN_LOG);
                    if (asString == null) {
                        File largePayloadFile = getLargePayloadFile(largePayloadGroupDirectory, asLong.longValue());
                        AppCenterLog.debug("AppCenter", "Read payload file " + largePayloadFile);
                        asString = FileManager.read(largePayloadFile);
                        if (asString == null) {
                            throw new JSONException("Log payload is null and not stored as a file.");
                            break;
                        }
                    }
                    Log deserializeLog = getLogSerializer().deserializeLog(asString, nextValues.getAsString("type"));
                    String asString2 = nextValues.getAsString(COLUMN_TARGET_TOKEN);
                    if (asString2 != null) {
                        deserializeLog.addTransmissionTarget(CryptoUtils.getInstance(this.mContext).decrypt(asString2).getDecryptedData());
                    }
                    linkedHashMap.put(asLong, deserializeLog);
                    i3++;
                } catch (JSONException e2) {
                    AppCenterLog.error("AppCenter", "Cannot deserialize a log in the database", e2);
                    arrayList2.add(asLong);
                }
            }
        }
        if (cursor != null) {
            try {
                cursor.close();
            } catch (RuntimeException unused) {
            }
        }
        if (arrayList2.size() > 0) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                deleteLog(largePayloadGroupDirectory, ((Long) it2.next()).longValue());
            }
            AppCenterLog.warn("AppCenter", "Deleted logs that cannot be deserialized");
        }
        if (linkedHashMap.size() <= 0) {
            AppCenterLog.debug("AppCenter", "No logs found in the Persistence database at the moment");
            return null;
        }
        String uuid = UUID.randomUUID().toString();
        StringBuilder G = wo1.G("Returning ");
        G.append(linkedHashMap.size());
        G.append(" log(s) with an ID, ");
        G.append(uuid);
        AppCenterLog.debug("AppCenter", G.toString());
        AppCenterLog.debug("AppCenter", "The SID/ID pairs for returning log(s) is/are:");
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Long l = (Long) entry.getKey();
            this.mPendingDbIdentifiers.add(l);
            arrayList3.add(l);
            list.add(entry.getValue());
            AppCenterLog.debug("AppCenter", "\t" + ((Log) entry.getValue()).getSid() + " / " + l);
        }
        Map<String, List<Long>> map = this.mPendingDbIdentifiersGroups;
        map.put(str + uuid, arrayList3);
        return uuid;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
        r8 = null;
     */
    @Override // com.microsoft.appcenter.persistence.Persistence
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long putLog(@x1 Log log, @x1 String str, @p1(from = 1, to = 2) int i) throws Persistence.PersistenceException {
        String str2;
        String str3;
        try {
            try {
                AppCenterLog.debug("AppCenter", "Storing a log to the Persistence database for log type " + log.getType() + " with flags=" + i);
                String serializeLog = getLogSerializer().serializeLog(log);
                int length = serializeLog.getBytes("UTF-8").length;
                boolean z = length >= PAYLOAD_MAX_SIZE;
                if (!(log instanceof CommonSchemaLog)) {
                    str2 = null;
                    str3 = null;
                } else if (!z) {
                    String next = log.getTransmissionTargetTokens().iterator().next();
                    str3 = PartAUtils.getTargetKey(next);
                    str2 = CryptoUtils.getInstance(this.mContext).encrypt(next);
                } else {
                    throw new Persistence.PersistenceException("Log is larger than 1992294 bytes, cannot send to OneCollector.");
                }
                long maxSize = this.mDatabaseManager.getMaxSize();
                if (maxSize != -1) {
                    if (!z && maxSize <= length) {
                        throw new Persistence.PersistenceException("Log is too large (" + length + " bytes) to store in database. Current maximum database size is " + maxSize + " bytes.");
                    }
                    String str4 = serializeLog;
                    long put = this.mDatabaseManager.put(getContentValues(str, str4, str2, log.getType(), str3, Flags.getPersistenceFlag(i, false)), "priority");
                    if (put != -1) {
                        AppCenterLog.debug("AppCenter", "Stored a log to the Persistence database for log type " + log.getType() + " with databaseId=" + put);
                        if (z) {
                            AppCenterLog.debug("AppCenter", "Payload is larger than what SQLite supports, storing payload in a separate file.");
                            File largePayloadGroupDirectory = getLargePayloadGroupDirectory(str);
                            largePayloadGroupDirectory.mkdir();
                            File largePayloadFile = getLargePayloadFile(largePayloadGroupDirectory, put);
                            try {
                                FileManager.write(largePayloadFile, serializeLog);
                                AppCenterLog.debug("AppCenter", "Payload written to " + largePayloadFile);
                            } catch (IOException e) {
                                this.mDatabaseManager.delete(put);
                                throw e;
                            }
                        }
                        return put;
                    }
                    throw new Persistence.PersistenceException("Failed to store a log to the Persistence database for log type " + log.getType() + CryptoConstants.ALIAS_SEPARATOR);
                }
                throw new Persistence.PersistenceException("Failed to store a log to the Persistence database.");
            } catch (IOException e2) {
                throw new Persistence.PersistenceException("Cannot save large payload in a file.", e2);
            }
        } catch (JSONException e3) {
            throw new Persistence.PersistenceException("Cannot convert to JSON string.", e3);
        }
    }

    @Override // com.microsoft.appcenter.persistence.Persistence
    public boolean setMaxStorageSize(long j) {
        return this.mDatabaseManager.setMaxSize(j);
    }

    public DatabasePersistence(Context context, int i, ContentValues contentValues) {
        this.mContext = context;
        this.mPendingDbIdentifiersGroups = new HashMap();
        this.mPendingDbIdentifiers = new HashSet();
        this.mDatabaseManager = new DatabaseManager(context, DATABASE, TABLE, i, contentValues, CREATE_LOGS_SQL, new DatabaseManager.Listener() { // from class: com.microsoft.appcenter.persistence.DatabasePersistence.1
            @Override // com.microsoft.appcenter.utils.storage.DatabaseManager.Listener
            public void onCreate(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL(DatabasePersistence.CREATE_PRIORITY_INDEX_LOGS);
            }

            @Override // com.microsoft.appcenter.utils.storage.DatabaseManager.Listener
            public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
                sQLiteDatabase.execSQL(DatabasePersistence.DROP_LOGS_SQL);
                sQLiteDatabase.execSQL(DatabasePersistence.CREATE_LOGS_SQL);
                sQLiteDatabase.execSQL(DatabasePersistence.CREATE_PRIORITY_INDEX_LOGS);
            }
        });
        File file = new File(wo1.C(new StringBuilder(), Constants.FILES_PATH, PAYLOAD_LARGE_DIRECTORY));
        this.mLargePayloadDirectory = file;
        file.mkdirs();
    }

    @Override // com.microsoft.appcenter.persistence.Persistence
    public void deleteLogs(String str) {
        AppCenterLog.debug("AppCenter", "Deleting all logs from the Persistence database for " + str);
        File largePayloadGroupDirectory = getLargePayloadGroupDirectory(str);
        File[] listFiles = largePayloadGroupDirectory.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                file.delete();
            }
        }
        largePayloadGroupDirectory.delete();
        AppCenterLog.debug("AppCenter", "Deleted " + this.mDatabaseManager.delete(COLUMN_GROUP, str) + " logs.");
        Iterator<String> it = this.mPendingDbIdentifiersGroups.keySet().iterator();
        while (it.hasNext()) {
            if (it.next().startsWith(str)) {
                it.remove();
            }
        }
    }
}