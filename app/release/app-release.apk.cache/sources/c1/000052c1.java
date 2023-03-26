package com.p7700g.p99005;

import android.content.ContentValues;
import android.database.Cursor;
import com.p7700g.p99005.fo3;
import com.p7700g.p99005.rs2;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: OSOutcomeEventsCache.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010>\u001a\u00020<\u0012\u0006\u0010;\u001a\u000209\u0012\u0006\u0010A\u001a\u00020?¢\u0006\u0004\bE\u0010FJ1\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0019\u001a\u00020\u00182\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001c\u001a\u00020\u00182\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00182\u0010\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\"H\u0007¢\u0006\u0004\b'\u0010%J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020\"0(H\u0007¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\"H\u0007¢\u0006\u0004\b+\u0010%J+\u0010/\u001a\b\u0012\u0004\u0012\u00020-0(2\u0006\u0010,\u001a\u00020\u00072\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0(H\u0007¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020\u00182\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0007H\u0007¢\u0006\u0004\b3\u00104R\u0013\u00108\u001a\u0002058F@\u0006¢\u0006\u0006\u001a\u0004\b6\u00107R\u0016\u0010;\u001a\u0002098\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010:R\u0016\u0010>\u001a\u00020<8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010=R\u0016\u0010A\u001a\u00020?8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010@R\u001b\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001e8F@\u0006¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006G"}, d2 = {"Lcom/p7700g/p99005/no3;", "", "Lcom/p7700g/p99005/fo3;", "notificationInfluenceType", "Lcom/p7700g/p99005/ep3;", "directSourceBody", "indirectSourceBody", "", "notificationIds", "Lcom/p7700g/p99005/dp3;", "h", "(Lcom/p7700g/p99005/fo3;Lcom/p7700g/p99005/ep3;Lcom/p7700g/p99005/ep3;Ljava/lang/String;)Lcom/p7700g/p99005/dp3;", "iamInfluenceType", "iamIds", rs2.f.b, "f", "(Lcom/p7700g/p99005/fo3;Lcom/p7700g/p99005/ep3;Lcom/p7700g/p99005/ep3;Ljava/lang/String;Lcom/p7700g/p99005/dp3;)Lcom/p7700g/p99005/dp3;", "", "Lcom/p7700g/p99005/ap3;", "cachedUniqueOutcomes", "Lorg/json/JSONArray;", "channelIds", "Lcom/p7700g/p99005/eo3;", "channel", "Lcom/p7700g/p99005/yq4;", "a", "(Ljava/util/List;Lorg/json/JSONArray;Lcom/p7700g/p99005/eo3;)V", "sourceBody", "b", "(Ljava/util/List;Lcom/p7700g/p99005/ep3;)V", "", "unattributedUniqueOutcomeEvents", "l", "(Ljava/util/Set;)V", "Lcom/p7700g/p99005/bp3;", "event", "d", "(Lcom/p7700g/p99005/bp3;)V", "eventParams", "k", "", "e", "()Ljava/util/List;", com.anythink.expressad.d.a.b.dH, "name", "Lcom/p7700g/p99005/do3;", "influences", com.anythink.basead.d.g.i, "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "notificationTableName", "notificationIdColumnName", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "", "j", "()Z", "isOutcomesV2ServiceEnabled", "Lcom/p7700g/p99005/pm3;", "Lcom/p7700g/p99005/pm3;", "dbHelper", "Lcom/p7700g/p99005/tk3;", "Lcom/p7700g/p99005/tk3;", "logger", "Lcom/p7700g/p99005/sl3;", "Lcom/p7700g/p99005/sl3;", "preferences", "i", "()Ljava/util/Set;", "unattributedUniqueOutcomeEventsSentByChannel", "<init>", "(Lcom/p7700g/p99005/tk3;Lcom/p7700g/p99005/pm3;Lcom/p7700g/p99005/sl3;)V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class no3 {
    private final tk3 a;
    private final pm3 b;
    private final sl3 c;

    public no3(@NotNull tk3 tk3Var, @NotNull pm3 pm3Var, @NotNull sl3 sl3Var) {
        c25.p(tk3Var, "logger");
        c25.p(pm3Var, "dbHelper");
        c25.p(sl3Var, "preferences");
        this.a = tk3Var;
        this.b = pm3Var;
        this.c = sl3Var;
    }

    private final void a(List<ap3> list, JSONArray jSONArray, eo3 eo3Var) {
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    String string = jSONArray.getString(i);
                    c25.o(string, "influenceId");
                    list.add(new ap3(string, eo3Var));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private final void b(List<ap3> list, ep3 ep3Var) {
        if (ep3Var != null) {
            JSONArray a = ep3Var.a();
            JSONArray b = ep3Var.b();
            a(list, a, eo3.IAM);
            a(list, b, eo3.NOTIFICATION);
        }
    }

    private final dp3 f(fo3 fo3Var, ep3 ep3Var, ep3 ep3Var2, String str, dp3 dp3Var) {
        dp3 c;
        dp3 e;
        int ordinal = fo3Var.ordinal();
        if (ordinal == 0) {
            ep3Var.c(new JSONArray(str));
            return (dp3Var == null || (c = dp3Var.c(ep3Var)) == null) ? new dp3(ep3Var, null) : c;
        } else if (ordinal != 1) {
            return dp3Var;
        } else {
            ep3Var2.c(new JSONArray(str));
            return (dp3Var == null || (e = dp3Var.e(ep3Var2)) == null) ? new dp3(null, ep3Var2) : e;
        }
    }

    private final dp3 h(fo3 fo3Var, ep3 ep3Var, ep3 ep3Var2, String str) {
        dp3 dp3Var;
        int ordinal = fo3Var.ordinal();
        if (ordinal == 0) {
            ep3Var.d(new JSONArray(str));
            dp3Var = new dp3(ep3Var, null);
        } else if (ordinal != 1) {
            return null;
        } else {
            ep3Var2.d(new JSONArray(str));
            dp3Var = new dp3(null, ep3Var2);
        }
        return dp3Var;
    }

    @s2
    public final synchronized void c(@NotNull String str, @NotNull String str2) {
        c25.p(str, "notificationTableName");
        c25.p(str2, "notificationIdColumnName");
        StringBuilder sb = new StringBuilder();
        sb.append("NOT EXISTS(SELECT NULL FROM ");
        sb.append(str);
        sb.append(" n ");
        sb.append("WHERE");
        sb.append(" n.");
        sb.append(str2);
        sb.append(" = ");
        sb.append("channel_influence_id");
        sb.append(" AND ");
        sb.append("channel_type");
        sb.append(" = \"");
        String eo3Var = eo3.NOTIFICATION.toString();
        Locale locale = Locale.ROOT;
        c25.o(locale, "Locale.ROOT");
        if (eo3Var != null) {
            String lowerCase = eo3Var.toLowerCase(locale);
            c25.o(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            sb.append(lowerCase);
            sb.append("\")");
            this.b.f("cached_unique_outcome", sb.toString(), null);
        } else {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    @s2
    public final synchronized void d(@NotNull bp3 bp3Var) {
        c25.p(bp3Var, "event");
        this.b.f("outcome", "timestamp = ?", new String[]{String.valueOf(bp3Var.c())});
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd A[Catch: all -> 0x00d2, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:28:0x00b7, B:30:0x00bd, B:37:0x00c8, B:39:0x00ce, B:40:0x00d1), top: B:46:0x0003 }] */
    @s2
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized List<bp3> e() {
        ArrayList arrayList;
        Cursor d;
        arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            d = this.b.d("outcome", null, null, null, null, null, null);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (d.moveToFirst()) {
                do {
                    String string = d.getString(d.getColumnIndex(yo3.f));
                    fo3.a aVar = fo3.x;
                    fo3 a = aVar.a(string);
                    fo3 a2 = aVar.a(d.getString(d.getColumnIndex(yo3.g)));
                    String string2 = d.getString(d.getColumnIndex("notification_ids"));
                    if (string2 == null) {
                        string2 = zq5.e;
                    }
                    String string3 = d.getString(d.getColumnIndex(yo3.d));
                    if (string3 == null) {
                        string3 = zq5.e;
                    }
                    String str = string3;
                    String string4 = d.getString(d.getColumnIndex("name"));
                    float f = d.getFloat(d.getColumnIndex("weight"));
                    long j = d.getLong(d.getColumnIndex("timestamp"));
                    try {
                        ep3 ep3Var = new ep3(null, null, 3, null);
                        ep3 ep3Var2 = new ep3(null, null, 3, null);
                        dp3 h = h(a, ep3Var, ep3Var2, string2);
                        f(a2, ep3Var, ep3Var2, str, h);
                        if (h == null) {
                            h = new dp3(null, null);
                        }
                        dp3 dp3Var = h;
                        c25.o(string4, "name");
                        arrayList.add(new bp3(string4, dp3Var, f, j));
                    } catch (JSONException e) {
                        this.a.a("Generating JSONArray from notifications ids outcome:JSON Failed.", e);
                    }
                } while (d.moveToNext());
                if (!d.isClosed()) {
                    d.close();
                }
            } else if (!d.isClosed()) {
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = d;
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            throw th;
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0090, code lost:
        if (r4.isClosed() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a2, code lost:
        if (r4.isClosed() == false) goto L34;
     */
    @s2
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized List<do3> g(@NotNull String str, @NotNull List<do3> list) {
        ArrayList arrayList;
        c25.p(str, "name");
        c25.p(list, "influences");
        arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            for (do3 do3Var : list) {
                JSONArray jSONArray = new JSONArray();
                JSONArray c = do3Var.c();
                if (c != null) {
                    int length = c.length();
                    for (int i = 0; i < length; i++) {
                        String string = c.getString(i);
                        cursor = this.b.b("cached_unique_outcome", new String[0], "channel_influence_id = ? AND channel_type = ? AND name = ?", new String[]{string, do3Var.d().toString(), str}, null, null, null, "1");
                        c25.o(cursor, "cursor");
                        if (cursor.getCount() == 0) {
                            jSONArray.put(string);
                        }
                    }
                    if (jSONArray.length() > 0) {
                        do3 a = do3Var.a();
                        a.f(jSONArray);
                        arrayList.add(a);
                    }
                }
            }
            if (cursor != null) {
            }
        } catch (JSONException e) {
            e.printStackTrace();
            if (cursor != null) {
            }
        }
        return arrayList;
    }

    @Nullable
    public final Set<String> i() {
        sl3 sl3Var = this.c;
        return sl3Var.c(sl3Var.h(), ko3.a, null);
    }

    public final boolean j() {
        sl3 sl3Var = this.c;
        return sl3Var.n(sl3Var.h(), this.c.j(), false);
    }

    @s2
    public final synchronized void k(@NotNull bp3 bp3Var) {
        fo3 fo3Var;
        ep3 b;
        ep3 a;
        fo3 fo3Var2;
        c25.p(bp3Var, "eventParams");
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        fo3 fo3Var3 = fo3.UNATTRIBUTED;
        dp3 b2 = bp3Var.b();
        if (b2 == null || (a = b2.a()) == null) {
            fo3Var = fo3Var3;
        } else {
            JSONArray b3 = a.b();
            if (b3 == null || b3.length() <= 0) {
                fo3Var2 = fo3Var3;
            } else {
                fo3Var2 = fo3.DIRECT;
                jSONArray = b3;
            }
            JSONArray a2 = a.a();
            if (a2 != null && a2.length() > 0) {
                fo3Var3 = fo3.DIRECT;
                jSONArray2 = a2;
            }
            fo3Var = fo3Var3;
            fo3Var3 = fo3Var2;
        }
        dp3 b4 = bp3Var.b();
        if (b4 != null && (b = b4.b()) != null) {
            JSONArray b5 = b.b();
            if (b5 != null && b5.length() > 0) {
                fo3Var3 = fo3.INDIRECT;
                jSONArray = b5;
            }
            JSONArray a3 = b.a();
            if (a3 != null && a3.length() > 0) {
                fo3Var = fo3.INDIRECT;
                jSONArray2 = a3;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("notification_ids", jSONArray.toString());
        contentValues.put(yo3.d, jSONArray2.toString());
        String str = fo3Var3.toString();
        if (str != null) {
            String lowerCase = str.toLowerCase();
            c25.o(lowerCase, "(this as java.lang.String).toLowerCase()");
            contentValues.put(yo3.f, lowerCase);
            String str2 = fo3Var.toString();
            if (str2 != null) {
                String lowerCase2 = str2.toLowerCase();
                c25.o(lowerCase2, "(this as java.lang.String).toLowerCase()");
                contentValues.put(yo3.g, lowerCase2);
                contentValues.put("name", bp3Var.a());
                contentValues.put("weight", Float.valueOf(bp3Var.d()));
                contentValues.put("timestamp", Long.valueOf(bp3Var.c()));
                this.b.h("outcome", null, contentValues);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    public final void l(@Nullable Set<String> set) {
        sl3 sl3Var = this.c;
        String h = sl3Var.h();
        c25.m(set);
        sl3Var.i(h, ko3.a, set);
    }

    @s2
    public final synchronized void m(@NotNull bp3 bp3Var) {
        c25.p(bp3Var, "eventParams");
        tk3 tk3Var = this.a;
        tk3Var.b("OneSignal saveUniqueOutcomeEventParams: " + bp3Var);
        String a = bp3Var.a();
        ArrayList arrayList = new ArrayList();
        dp3 b = bp3Var.b();
        ep3 a2 = b != null ? b.a() : null;
        dp3 b2 = bp3Var.b();
        ep3 b3 = b2 != null ? b2.b() : null;
        b(arrayList, a2);
        b(arrayList, b3);
        for (ap3 ap3Var : arrayList) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("channel_influence_id", ap3Var.b());
            contentValues.put("channel_type", ap3Var.a().toString());
            contentValues.put("name", a);
            this.b.h("cached_unique_outcome", null, contentValues);
        }
    }
}