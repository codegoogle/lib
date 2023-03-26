package com.microsoft.appcenter.utils.context;

import com.microsoft.appcenter.utils.AppCenterLog;
import com.microsoft.appcenter.utils.storage.SharedPreferencesManager;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.s2;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;

/* loaded from: classes3.dex */
public class SessionContext {
    private static final String STORAGE_KEY = "sessions";
    private static final String STORAGE_KEY_VALUE_SEPARATOR = "/";
    private static final int STORAGE_MAX_SESSIONS = 10;
    private static SessionContext sInstance;
    private final NavigableMap<Long, SessionInfo> mSessions = new TreeMap();
    private final long mAppLaunchTimestamp = System.currentTimeMillis();

    /* loaded from: classes3.dex */
    public static class SessionInfo {
        private final long mAppLaunchTimestamp;
        private final UUID mSessionId;
        private final long mTimestamp;

        public SessionInfo(long j, UUID uuid, long j2) {
            this.mTimestamp = j;
            this.mSessionId = uuid;
            this.mAppLaunchTimestamp = j2;
        }

        public long getAppLaunchTimestamp() {
            return this.mAppLaunchTimestamp;
        }

        public UUID getSessionId() {
            return this.mSessionId;
        }

        public long getTimestamp() {
            return this.mTimestamp;
        }

        @x1
        public String toString() {
            String str = getTimestamp() + SessionContext.STORAGE_KEY_VALUE_SEPARATOR;
            if (getSessionId() != null) {
                StringBuilder G = wo1.G(str);
                G.append(getSessionId());
                str = G.toString();
            }
            StringBuilder L = wo1.L(str, SessionContext.STORAGE_KEY_VALUE_SEPARATOR);
            L.append(getAppLaunchTimestamp());
            return L.toString();
        }
    }

    @s2
    private SessionContext() {
        Set<String> stringSet = SharedPreferencesManager.getStringSet(STORAGE_KEY);
        if (stringSet != null) {
            for (String str : stringSet) {
                String[] split = str.split(STORAGE_KEY_VALUE_SEPARATOR, -1);
                try {
                    long parseLong = Long.parseLong(split[0]);
                    String str2 = split[1];
                    this.mSessions.put(Long.valueOf(parseLong), new SessionInfo(parseLong, str2.isEmpty() ? null : UUID.fromString(str2), split.length > 2 ? Long.parseLong(split[2]) : parseLong));
                } catch (RuntimeException e) {
                    AppCenterLog.warn("AppCenter", "Ignore invalid session in store: " + str, e);
                }
            }
        }
        StringBuilder G = wo1.G("Loaded stored sessions: ");
        G.append(this.mSessions);
        AppCenterLog.debug("AppCenter", G.toString());
        addSession(null);
    }

    @s2
    public static synchronized SessionContext getInstance() {
        SessionContext sessionContext;
        synchronized (SessionContext.class) {
            if (sInstance == null) {
                sInstance = new SessionContext();
            }
            sessionContext = sInstance;
        }
        return sessionContext;
    }

    @r2
    public static synchronized void unsetInstance() {
        synchronized (SessionContext.class) {
            sInstance = null;
        }
    }

    public synchronized void addSession(UUID uuid) {
        long currentTimeMillis = System.currentTimeMillis();
        this.mSessions.put(Long.valueOf(currentTimeMillis), new SessionInfo(currentTimeMillis, uuid, this.mAppLaunchTimestamp));
        if (this.mSessions.size() > 10) {
            this.mSessions.pollFirstEntry();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (SessionInfo sessionInfo : this.mSessions.values()) {
            linkedHashSet.add(sessionInfo.toString());
        }
        SharedPreferencesManager.putStringSet(STORAGE_KEY, linkedHashSet);
    }

    public synchronized void clearSessions() {
        this.mSessions.clear();
        SharedPreferencesManager.remove(STORAGE_KEY);
    }

    public synchronized SessionInfo getSessionAt(long j) {
        Map.Entry<Long, SessionInfo> floorEntry = this.mSessions.floorEntry(Long.valueOf(j));
        if (floorEntry != null) {
            return floorEntry.getValue();
        }
        return null;
    }
}