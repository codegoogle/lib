package com.p7700g.p99005;

import com.microsoft.appcenter.AppCenter;
import com.p7700g.p99005.dc0;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: RawQueries.java */
/* loaded from: classes.dex */
public final class mf0 {
    private mf0() {
    }

    private static void a(@x1 StringBuilder builder, int count) {
        if (count <= 0) {
            return;
        }
        builder.append("?");
        for (int i = 1; i < count; i++) {
            builder.append(",");
            builder.append("?");
        }
    }

    @x1
    public static q60 b(@x1 fc0 querySpec) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("SELECT * FROM workspec");
        List<dc0.a> b = querySpec.b();
        String str = " AND";
        String str2 = " WHERE";
        if (!b.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(b.size());
            for (dc0.a aVar : b) {
                arrayList2.add(Integer.valueOf(cf0.j(aVar)));
            }
            sb.append(" WHERE");
            sb.append(" state IN (");
            a(sb, arrayList2.size());
            sb.append(")");
            arrayList.addAll(arrayList2);
            str2 = " AND";
        }
        List<UUID> a = querySpec.a();
        if (!a.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(a.size());
            for (UUID uuid : a) {
                arrayList3.add(uuid.toString());
            }
            sb.append(str2);
            sb.append(" id IN (");
            a(sb, a.size());
            sb.append(")");
            arrayList.addAll(arrayList3);
            str2 = " AND";
        }
        List<String> c = querySpec.c();
        if (c.isEmpty()) {
            str = str2;
        } else {
            sb.append(str2);
            sb.append(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
            a(sb, c.size());
            sb.append("))");
            arrayList.addAll(c);
        }
        List<String> d = querySpec.d();
        if (!d.isEmpty()) {
            sb.append(str);
            sb.append(" id IN (SELECT work_spec_id FROM workname WHERE name IN (");
            a(sb, d.size());
            sb.append("))");
            arrayList.addAll(d);
        }
        sb.append(AppCenter.PAIR_DELIMITER);
        return new m60(sb.toString(), arrayList.toArray());
    }
}