package com.p7700g.p99005;

import com.p7700g.p99005.i2;
import java.util.List;

/* compiled from: WorkProgressDao.java */
@i2({i2.a.LIBRARY_GROUP})
@a40
/* loaded from: classes.dex */
public interface ue0 {
    @y40("DELETE from WorkProgress where work_spec_id=:workSpecId")
    void a(@x1 String workSpecId);

    @z1
    @y40("SELECT progress FROM WorkProgress WHERE work_spec_id=:workSpecId")
    kb0 b(@x1 String workSpecId);

    @x1
    @y40("SELECT progress FROM WorkProgress WHERE work_spec_id IN (:workSpecIds)")
    List<kb0> c(@x1 List<String> workSpecIds);

    @y40("DELETE FROM WorkProgress")
    void d();

    @r40(onConflict = 1)
    void e(@x1 te0 progress);
}