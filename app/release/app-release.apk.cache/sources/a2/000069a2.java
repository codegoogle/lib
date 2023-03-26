package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* compiled from: OSOutcomesDbContract.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b \bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0016\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0016\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004¨\u0006\""}, d2 = {"Lcom/p7700g/p99005/zo3;", "", "", "f", "Ljava/lang/String;", "OUTCOME_EVENT_TABLE", com.anythink.basead.d.g.i, "CACHE_UNIQUE_OUTCOME_TABLE", "a", "INTEGER_PRIMARY_KEY_TYPE", "l", "SQL_CREATE_OUTCOME_ENTRIES_V3", "n", "SQL_CREATE_UNIQUE_OUTCOME_ENTRIES_V2", "i", "CACHE_UNIQUE_OUTCOME_COLUMN_CHANNEL_TYPE", "b", "TEXT_TYPE", "h", "CACHE_UNIQUE_OUTCOME_COLUMN_CHANNEL_INFLUENCE_ID", com.anythink.expressad.d.a.b.dH, "SQL_CREATE_UNIQUE_OUTCOME_ENTRIES_V1", "c", "INT_TYPE", "k", "SQL_CREATE_OUTCOME_ENTRIES_V2", "d", "FLOAT_TYPE", "j", "SQL_CREATE_OUTCOME_ENTRIES_V1", "e", "TIMESTAMP_TYPE", "<init>", "()V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class zo3 {
    private static final String a = " INTEGER PRIMARY KEY";
    private static final String b = " TEXT";
    private static final String c = " INTEGER";
    private static final String d = " FLOAT";
    private static final String e = " TIMESTAMP";
    @NotNull
    public static final String f = "outcome";
    @NotNull
    public static final String g = "cached_unique_outcome";
    @NotNull
    public static final String h = "channel_influence_id";
    @NotNull
    public static final String i = "channel_type";
    @NotNull
    public static final String j = "CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_ids TEXT,name TEXT,session TEXT,params TEXT,timestamp TIMESTAMP);";
    @NotNull
    public static final String k = "CREATE TABLE outcome (_id INTEGER PRIMARY KEY,session TEXT,notification_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);";
    @NotNull
    public static final String l = "CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);";
    @NotNull
    public static final String m = "CREATE TABLE cached_unique_outcome_notification (_id INTEGER PRIMARY KEY,notification_id TEXT,name TEXT);";
    @NotNull
    public static final String n = "CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);";
    @NotNull
    public static final zo3 o = new zo3();

    private zo3() {
    }
}