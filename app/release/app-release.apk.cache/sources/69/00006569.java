package com.p7700g.p99005;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import com.p7700g.p99005.dc0;
import com.p7700g.p99005.we0;
import java.util.List;

/* compiled from: WorkSpecDao.java */
@a40
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public interface xe0 {
    @y40("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id)")
    List<kb0> A(String id);

    @y40("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=:id")
    int B(String id);

    @y40("UPDATE workspec SET period_start_time=:periodStartTime WHERE id=:id")
    void C(String id, long periodStartTime);

    @n50
    @y40("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    List<we0.c> D(String name);

    @n50
    @y40("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (:ids)")
    List<we0.c> E(List<String> ids);

    @y40("SELECT * FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT :maxLimit")
    List<we0> F(int maxLimit);

    @y40("SELECT id FROM workspec")
    List<String> G();

    @y40("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)")
    int H();

    @y40("DELETE FROM workspec WHERE id=:id")
    void a(String id);

    @y40("UPDATE workspec SET state=:state WHERE id IN (:ids)")
    int b(dc0.a state, String... ids);

    @y40("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))")
    void c();

    @y40("UPDATE workspec SET schedule_requested_at=:startTime WHERE id=:id")
    int d(@x1 String id, long startTime);

    @y40("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    List<we0.b> e(String name);

    @y40("SELECT * FROM workspec WHERE period_start_time >= :startingAt AND state IN (2, 3, 5) ORDER BY period_start_time DESC")
    List<we0> f(long startingAt);

    @y40("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(:schedulerLimit-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))")
    List<we0> g(int schedulerLimit);

    @r40(onConflict = 5)
    void h(we0 workSpec);

    @y40("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1")
    List<we0> i();

    @y40("SELECT * FROM workspec WHERE id IN (:ids)")
    we0[] j(List<String> ids);

    @y40("UPDATE workspec SET output=:output WHERE id=:id")
    void k(String id, kb0 output);

    @n50
    @y40("SELECT id FROM workspec")
    LiveData<List<String>> l();

    @n50
    @y40("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    LiveData<List<we0.c>> m(String name);

    @y40("SELECT * FROM workspec WHERE state=1")
    List<we0> n();

    @n50
    @y40("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    LiveData<List<we0.c>> o(String tag);

    @y40("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)")
    List<String> p();

    @y40("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1")
    boolean q();

    @y40("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    List<String> r(@x1 String name);

    @n50
    @y40("SELECT id, state, output, run_attempt_count FROM workspec WHERE id=:id")
    we0.c s(String id);

    @y40("SELECT state FROM workspec WHERE id=:id")
    dc0.a t(String id);

    @y40("SELECT * FROM workspec WHERE id=:id")
    we0 u(String id);

    @y40("UPDATE workspec SET run_attempt_count=0 WHERE id=:id")
    int v(String id);

    @n50
    @y40("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    List<we0.c> w(String tag);

    @y40("SELECT schedule_requested_at FROM workspec WHERE id=:id")
    LiveData<Long> x(@x1 String id);

    @n50
    @y40("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (:ids)")
    LiveData<List<we0.c>> y(List<String> ids);

    @y40("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    List<String> z(@x1 String tag);
}