package com.p7700g.p99005;

import java.util.List;

/* compiled from: SystemIdInfoDao.java */
@a40
/* loaded from: classes.dex */
public interface oe0 {
    @x1
    @y40("SELECT DISTINCT work_spec_id FROM SystemIdInfo")
    List<String> a();

    @r40(onConflict = 1)
    void b(@x1 ne0 systemIdInfo);

    @z1
    @y40("SELECT * FROM SystemIdInfo WHERE work_spec_id=:workSpecId")
    ne0 c(@x1 String workSpecId);

    @y40("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId")
    void d(@x1 String workSpecId);
}