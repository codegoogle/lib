package com.p7700g.p99005;

import com.p7700g.p99005.i2;

/* compiled from: Dependency.java */
@i2({i2.a.t})
@g40(foreignKeys = {@j40(childColumns = {"work_spec_id"}, entity = we0.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"}), @j40(childColumns = {"prerequisite_id"}, entity = we0.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@q40({"work_spec_id"}), @q40({"prerequisite_id"})}, primaryKeys = {"work_spec_id", "prerequisite_id"})
/* loaded from: classes.dex */
public class fe0 {
    @x1
    @z30(name = "work_spec_id")
    public final String a;
    @x1
    @z30(name = "prerequisite_id")
    public final String b;

    public fe0(@x1 String workSpecId, @x1 String prerequisiteId) {
        this.a = workSpecId;
        this.b = prerequisiteId;
    }
}