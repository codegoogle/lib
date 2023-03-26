package com.microsoft.appcenter.channel;

import com.microsoft.appcenter.ingestion.Ingestion;
import com.microsoft.appcenter.ingestion.models.Log;
import com.p7700g.p99005.p1;
import com.p7700g.p99005.x1;

/* loaded from: classes3.dex */
public interface Channel {

    /* loaded from: classes3.dex */
    public interface GroupListener {
        void onBeforeSending(Log log);

        void onFailure(Log log, Exception exc);

        void onSuccess(Log log);
    }

    /* loaded from: classes3.dex */
    public interface Listener {
        void onClear(@x1 String str);

        void onGloballyEnabled(boolean z);

        void onGroupAdded(@x1 String str, GroupListener groupListener, long j);

        void onGroupRemoved(@x1 String str);

        void onPaused(@x1 String str, String str2);

        void onPreparedLog(@x1 Log log, @x1 String str, int i);

        void onPreparingLog(@x1 Log log, @x1 String str);

        void onResumed(@x1 String str, String str2);

        boolean shouldFilter(@x1 Log log);
    }

    void addGroup(String str, int i, long j, int i2, Ingestion ingestion, GroupListener groupListener);

    void addListener(Listener listener);

    void clear(String str);

    void enqueue(@x1 Log log, @x1 String str, @p1(from = 1, to = 2) int i);

    void invalidateDeviceCache();

    boolean isEnabled();

    void pauseGroup(String str, String str2);

    void removeGroup(String str);

    void removeListener(Listener listener);

    void resumeGroup(String str, String str2);

    void setAppSecret(@x1 String str);

    void setEnabled(boolean z);

    void setLogUrl(String str);

    boolean setMaxStorageSize(long j);

    void setNetworkRequests(boolean z);

    void shutdown();
}