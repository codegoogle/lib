package com.p7700g.p99005;

import com.google.android.gms.tasks.Task;
import java.util.List;

/* compiled from: HeartBeatInfo.java */
/* loaded from: classes3.dex */
public interface xq2 {

    /* compiled from: HeartBeatInfo.java */
    /* loaded from: classes3.dex */
    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        
        private final int x;

        a(int i) {
            this.x = i;
        }

        public int f() {
            return this.x;
        }
    }

    @x1
    Task<Void> a(@x1 String str);

    @x1
    a b(@x1 String str);

    @x1
    Task<List<zq2>> c();
}