package com.p7700g.p99005;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.p7700g.p99005.we0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: RawWorkInfoDao_Impl.java */
/* loaded from: classes.dex */
public final class me0 implements le0 {
    private final d50 a;

    /* compiled from: RawWorkInfoDao_Impl.java */
    /* loaded from: classes.dex */
    public class a implements Callable<List<we0.c>> {
        public final /* synthetic */ q60 a;

        public a(final q60 val$_internalQuery) {
            this.a = val$_internalQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<we0.c> call() throws Exception {
            Cursor d = w50.d(me0.this.a, this.a, true, null);
            try {
                int b = v50.b(d, "id");
                int b2 = v50.b(d, CallMraidJS.b);
                int b3 = v50.b(d, "output");
                int b4 = v50.b(d, "run_attempt_count");
                q7 q7Var = new q7();
                q7 q7Var2 = new q7();
                while (d.moveToNext()) {
                    if (!d.isNull(b)) {
                        String string = d.getString(b);
                        if (((ArrayList) q7Var.get(string)) == null) {
                            q7Var.put(string, new ArrayList());
                        }
                    }
                    if (!d.isNull(b)) {
                        String string2 = d.getString(b);
                        if (((ArrayList) q7Var2.get(string2)) == null) {
                            q7Var2.put(string2, new ArrayList());
                        }
                    }
                }
                d.moveToPosition(-1);
                me0.this.d(q7Var);
                me0.this.c(q7Var2);
                ArrayList arrayList = new ArrayList(d.getCount());
                while (d.moveToNext()) {
                    ArrayList arrayList2 = !d.isNull(b) ? (ArrayList) q7Var.get(d.getString(b)) : null;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = !d.isNull(b) ? (ArrayList) q7Var2.get(d.getString(b)) : null;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    we0.c cVar = new we0.c();
                    if (b != -1) {
                        cVar.a = d.getString(b);
                    }
                    if (b2 != -1) {
                        cVar.b = cf0.g(d.getInt(b2));
                    }
                    if (b3 != -1) {
                        cVar.c = kb0.m(d.getBlob(b3));
                    }
                    if (b4 != -1) {
                        cVar.d = d.getInt(b4);
                    }
                    cVar.e = arrayList2;
                    cVar.f = arrayList3;
                    arrayList.add(cVar);
                }
                return arrayList;
            } finally {
                d.close();
            }
        }
    }

    public me0(d50 __db) {
        this.a = __db;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final q7<String, ArrayList<kb0>> _map) {
        ArrayList<kb0> arrayList;
        int i;
        Set<String> keySet = _map.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (_map.size() > 999) {
            q7<String, ArrayList<kb0>> q7Var = new q7<>((int) d50.b);
            int size = _map.size();
            int i2 = 0;
            loop0: while (true) {
                i = 0;
                while (i2 < size) {
                    q7Var.put(_map.n(i2), _map.r(i2));
                    i2++;
                    i++;
                    if (i == 999) {
                        break;
                    }
                }
                c(q7Var);
                q7Var = new q7<>((int) d50.b);
            }
            if (i > 0) {
                c(q7Var);
                return;
            }
            return;
        }
        StringBuilder c = a60.c();
        c.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        a60.a(c, size2);
        c.append(")");
        g50 e = g50.e(c.toString(), size2 + 0);
        int i3 = 1;
        for (String str : keySet) {
            if (str == null) {
                e.l1(i3);
            } else {
                e.J(i3, str);
            }
            i3++;
        }
        Cursor d = w50.d(this.a, e, false, null);
        try {
            int b = v50.b(d, "work_spec_id");
            if (b == -1) {
                return;
            }
            while (d.moveToNext()) {
                if (!d.isNull(b) && (arrayList = _map.get(d.getString(b))) != null) {
                    arrayList.add(kb0.m(d.getBlob(0)));
                }
            }
        } finally {
            d.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final q7<String, ArrayList<String>> _map) {
        ArrayList<String> arrayList;
        int i;
        Set<String> keySet = _map.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (_map.size() > 999) {
            q7<String, ArrayList<String>> q7Var = new q7<>((int) d50.b);
            int size = _map.size();
            int i2 = 0;
            loop0: while (true) {
                i = 0;
                while (i2 < size) {
                    q7Var.put(_map.n(i2), _map.r(i2));
                    i2++;
                    i++;
                    if (i == 999) {
                        break;
                    }
                }
                d(q7Var);
                q7Var = new q7<>((int) d50.b);
            }
            if (i > 0) {
                d(q7Var);
                return;
            }
            return;
        }
        StringBuilder c = a60.c();
        c.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        a60.a(c, size2);
        c.append(")");
        g50 e = g50.e(c.toString(), size2 + 0);
        int i3 = 1;
        for (String str : keySet) {
            if (str == null) {
                e.l1(i3);
            } else {
                e.J(i3, str);
            }
            i3++;
        }
        Cursor d = w50.d(this.a, e, false, null);
        try {
            int b = v50.b(d, "work_spec_id");
            if (b == -1) {
                return;
            }
            while (d.moveToNext()) {
                if (!d.isNull(b) && (arrayList = _map.get(d.getString(b))) != null) {
                    arrayList.add(d.getString(0));
                }
            }
        } finally {
            d.close();
        }
    }

    @Override // com.p7700g.p99005.le0
    public List<we0.c> a(final q60 query) {
        this.a.b();
        Cursor d = w50.d(this.a, query, true, null);
        try {
            int b = v50.b(d, "id");
            int b2 = v50.b(d, CallMraidJS.b);
            int b3 = v50.b(d, "output");
            int b4 = v50.b(d, "run_attempt_count");
            q7<String, ArrayList<String>> q7Var = new q7<>();
            q7<String, ArrayList<kb0>> q7Var2 = new q7<>();
            while (d.moveToNext()) {
                if (!d.isNull(b)) {
                    String string = d.getString(b);
                    if (q7Var.get(string) == null) {
                        q7Var.put(string, new ArrayList<>());
                    }
                }
                if (!d.isNull(b)) {
                    String string2 = d.getString(b);
                    if (q7Var2.get(string2) == null) {
                        q7Var2.put(string2, new ArrayList<>());
                    }
                }
            }
            d.moveToPosition(-1);
            d(q7Var);
            c(q7Var2);
            ArrayList arrayList = new ArrayList(d.getCount());
            while (d.moveToNext()) {
                ArrayList<String> arrayList2 = !d.isNull(b) ? q7Var.get(d.getString(b)) : null;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                ArrayList<kb0> arrayList3 = !d.isNull(b) ? q7Var2.get(d.getString(b)) : null;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList<>();
                }
                we0.c cVar = new we0.c();
                if (b != -1) {
                    cVar.a = d.getString(b);
                }
                if (b2 != -1) {
                    cVar.b = cf0.g(d.getInt(b2));
                }
                if (b3 != -1) {
                    cVar.c = kb0.m(d.getBlob(b3));
                }
                if (b4 != -1) {
                    cVar.d = d.getInt(b4);
                }
                cVar.e = arrayList2;
                cVar.f = arrayList3;
                arrayList.add(cVar);
            }
            return arrayList;
        } finally {
            d.close();
        }
    }

    @Override // com.p7700g.p99005.le0
    public LiveData<List<we0.c>> b(final q60 query) {
        return this.a.l().e(new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, false, new a(query));
    }
}