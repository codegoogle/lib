package com.p7700g.p99005;

import com.p7700g.p99005.i2;

/* compiled from: WorkProgress.java */
@i2({i2.a.LIBRARY_GROUP})
@g40(foreignKeys = {@j40(childColumns = {"work_spec_id"}, entity = we0.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})})
/* loaded from: classes.dex */
public class te0 {
    @x1
    @x40
    @z30(name = "work_spec_id")
    public final String a;
    @x1
    @z30(name = "progress")
    public final kb0 b;

    public te0(@x1 String workSpecId, @x1 kb0 progress) {
        this.a = workSpecId;
        this.b = progress;
    }
}