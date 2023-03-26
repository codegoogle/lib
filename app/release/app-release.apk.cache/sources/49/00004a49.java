package com.p7700g.p99005;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.LiveData;
import androidx.work.impl.WorkDatabase;
import com.p7700g.p99005.i2;

/* compiled from: PreferenceUtils.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class jf0 {
    public static final String a = "androidx.work.util.preferences";
    public static final String b = "last_cancel_all_time_ms";
    public static final String c = "reschedule_needed";
    private final WorkDatabase d;

    /* compiled from: PreferenceUtils.java */
    /* loaded from: classes.dex */
    public class a implements m5<Long, Long> {
        public a() {
        }

        @Override // com.p7700g.p99005.m5
        /* renamed from: a */
        public Long apply(Long value) {
            return Long.valueOf(value != null ? value.longValue() : 0L);
        }
    }

    public jf0(@x1 WorkDatabase workDatabase) {
        this.d = workDatabase;
    }

    public static void d(@x1 Context context, @x1 n60 sqLiteDatabase) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(a, 0);
        if (sharedPreferences.contains(c) || sharedPreferences.contains(b)) {
            long j = sharedPreferences.getLong(b, 0L);
            long j2 = sharedPreferences.getBoolean(c, false) ? 1L : 0L;
            sqLiteDatabase.t();
            try {
                sqLiteDatabase.B0(pc0.v, new Object[]{b, Long.valueOf(j)});
                sqLiteDatabase.B0(pc0.v, new Object[]{c, Long.valueOf(j2)});
                sharedPreferences.edit().clear().apply();
                sqLiteDatabase.A0();
            } finally {
                sqLiteDatabase.W0();
            }
        }
    }

    public long a() {
        Long b2 = this.d.G().b(b);
        if (b2 != null) {
            return b2.longValue();
        }
        return 0L;
    }

    @x1
    public LiveData<Long> b() {
        return j00.b(this.d.G().a(b), new a());
    }

    public boolean c() {
        Long b2 = this.d.G().b(c);
        return b2 != null && b2.longValue() == 1;
    }

    public void e(final long timeMillis) {
        this.d.G().c(new ie0(b, timeMillis));
    }

    public void f(boolean needsReschedule) {
        this.d.G().c(new ie0(c, needsReschedule));
    }
}