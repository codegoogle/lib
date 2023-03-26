package com.p7700g.p99005;

import com.p7700g.p99005.i2;

/* compiled from: WorkTag.java */
@i2({i2.a.LIBRARY_GROUP})
@g40(foreignKeys = {@j40(childColumns = {"work_spec_id"}, entity = we0.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@q40({"work_spec_id"})}, primaryKeys = {"tag", "work_spec_id"})
/* loaded from: classes.dex */
public class ze0 {
    @x1
    @z30(name = "tag")
    public final String a;
    @x1
    @z30(name = "work_spec_id")
    public final String b;

    public ze0(@x1 String tag, @x1 String workSpecId) {
        this.a = tag;
        this.b = workSpecId;
    }
}