package com.p7700g.p99005;

import com.p7700g.p99005.jm3;
import com.p7700g.p99005.wm3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: OSTrackerFactory.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00120\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0013\u0010\u001d\u001a\u00020\u00128F@\u0006¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u001f\u001a\u00020\u00128F@\u0006¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F@\u0006¢\u0006\u0006\u001a\u0004\b \u0010!R\u0019\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F@\u0006¢\u0006\u0006\u001a\u0004\b\"\u0010!R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010%R\u0019\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b8F@\u0006¢\u0006\u0006\u001a\u0004\b'\u0010!¨\u00061"}, d2 = {"Lcom/p7700g/p99005/co3;", "", "Lcom/p7700g/p99005/yq4;", "i", "()V", "Lcom/p7700g/p99005/wm3$e;", "influenceParams", "j", "(Lcom/p7700g/p99005/wm3$e;)V", "Lorg/json/JSONObject;", "jsonObject", "", "Lcom/p7700g/p99005/do3;", "influences", "a", "(Lorg/json/JSONObject;Ljava/util/List;)V", "Lcom/p7700g/p99005/jm3$l0;", "entryAction", "Lcom/p7700g/p99005/xn3;", "b", "(Lcom/p7700g/p99005/jm3$l0;)Lcom/p7700g/p99005/xn3;", "d", "(Lcom/p7700g/p99005/jm3$l0;)Ljava/util/List;", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Ljava/util/concurrent/ConcurrentHashMap;", "trackers", com.anythink.basead.d.g.i, "()Lcom/p7700g/p99005/xn3;", "notificationChannelTracker", "e", "iAMChannelTracker", "f", "()Ljava/util/List;", "h", "sessionInfluences", "Lcom/p7700g/p99005/zn3;", "Lcom/p7700g/p99005/zn3;", "dataRepository", "c", "channels", "Lcom/p7700g/p99005/sl3;", "preferences", "Lcom/p7700g/p99005/tk3;", "logger", "Lcom/p7700g/p99005/bm3;", "timeProvider", "<init>", "(Lcom/p7700g/p99005/sl3;Lcom/p7700g/p99005/tk3;Lcom/p7700g/p99005/bm3;)V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class co3 {
    private final ConcurrentHashMap<String, xn3> a;
    private final zn3 b;

    public co3(@NotNull sl3 sl3Var, @NotNull tk3 tk3Var, @NotNull bm3 bm3Var) {
        c25.p(sl3Var, "preferences");
        c25.p(tk3Var, "logger");
        c25.p(bm3Var, "timeProvider");
        ConcurrentHashMap<String, xn3> concurrentHashMap = new ConcurrentHashMap<>();
        this.a = concurrentHashMap;
        zn3 zn3Var = new zn3(sl3Var);
        this.b = zn3Var;
        wn3 wn3Var = wn3.w;
        concurrentHashMap.put(wn3Var.a(), new yn3(zn3Var, tk3Var, bm3Var));
        concurrentHashMap.put(wn3Var.b(), new ao3(zn3Var, tk3Var, bm3Var));
    }

    public final void a(@NotNull JSONObject jSONObject, @NotNull List<do3> list) {
        c25.p(jSONObject, "jsonObject");
        c25.p(list, "influences");
        for (do3 do3Var : list) {
            if (do3Var.d().ordinal() == 1) {
                g().a(jSONObject, do3Var);
            }
        }
    }

    @Nullable
    public final xn3 b(@NotNull jm3.l0 l0Var) {
        c25.p(l0Var, "entryAction");
        if (l0Var.h()) {
            return g();
        }
        return null;
    }

    @NotNull
    public final List<xn3> c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(g());
        arrayList.add(e());
        return arrayList;
    }

    @NotNull
    public final List<xn3> d(@NotNull jm3.l0 l0Var) {
        c25.p(l0Var, "entryAction");
        ArrayList arrayList = new ArrayList();
        if (l0Var.f()) {
            return arrayList;
        }
        xn3 g = l0Var.g() ? g() : null;
        if (g != null) {
            arrayList.add(g);
        }
        arrayList.add(e());
        return arrayList;
    }

    @NotNull
    public final xn3 e() {
        xn3 xn3Var = this.a.get(wn3.w.a());
        c25.m(xn3Var);
        return xn3Var;
    }

    @NotNull
    public final List<do3> f() {
        Collection<xn3> values = this.a.values();
        c25.o(values, "trackers.values");
        ArrayList arrayList = new ArrayList(ks4.Z(values, 10));
        for (xn3 xn3Var : values) {
            arrayList.add(xn3Var.e());
        }
        return arrayList;
    }

    @NotNull
    public final xn3 g() {
        xn3 xn3Var = this.a.get(wn3.w.b());
        c25.m(xn3Var);
        return xn3Var;
    }

    @NotNull
    public final List<do3> h() {
        Collection<xn3> values = this.a.values();
        c25.o(values, "trackers.values");
        ArrayList<xn3> arrayList = new ArrayList();
        for (Object obj : values) {
            if (!c25.g(((xn3) obj).h(), wn3.w.a())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ks4.Z(arrayList, 10));
        for (xn3 xn3Var : arrayList) {
            arrayList2.add(xn3Var.e());
        }
        return arrayList2;
    }

    public final void i() {
        Collection<xn3> values = this.a.values();
        c25.o(values, "trackers.values");
        for (xn3 xn3Var : values) {
            xn3Var.p();
        }
    }

    public final void j(@NotNull wm3.e eVar) {
        c25.p(eVar, "influenceParams");
        this.b.q(eVar);
    }
}