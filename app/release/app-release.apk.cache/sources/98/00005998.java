package com.p7700g.p99005;

import android.provider.BaseColumns;

/* compiled from: EventContract.java */
/* loaded from: classes2.dex */
public class r91 {
    @x1
    private static final String a = " TEXT";
    @x1
    private static final String b = " INTEGER";
    @x1
    private static final String c = " BLOB";
    @x1
    private static final String d = ",";
    @x1
    public static final String e = "CREATE TABLE entry (_id INTEGER PRIMARY KEY,action TEXT,timestamp INTEGER,props BLOB,_tracker TEXT,_transport TEXT default 'default' )";
    @x1
    public static final String f = "CREATE TABLE history (_id INTEGER PRIMARY KEY,data TEXT,response_code INTEGER,response TEXT,timestamp INTEGER )";
    @x1
    public static final String g = "DROP TABLE IF EXISTS entry";
    @x1
    public static final String h = "DROP TABLE IF EXISTS history";

    /* compiled from: EventContract.java */
    /* loaded from: classes2.dex */
    public static abstract class a implements BaseColumns {
        @x1
        public static final String a = "entry";
        @x1
        public static final String b = "action";
        @x1
        public static final String c = "timestamp";
        @x1
        public static final String d = "props";
        @x1
        public static final String e = "_tracker";
        @x1
        public static final String f = "_transport";
    }

    /* compiled from: EventContract.java */
    /* loaded from: classes2.dex */
    public static abstract class b implements BaseColumns {
        @x1
        public static final String a = "history";
        @x1
        public static final String b = "data";
        @x1
        public static final String c = "response";
        @x1
        public static final String d = "response_code";
        @x1
        public static final String e = "timestamp";
    }
}