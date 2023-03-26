package com.p7700g.p99005;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.f60;
import com.p7700g.p99005.i2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SavedStateHandle.kt */
@vo4(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\t\u0018\u0000 *2\u00020\u0001:\u0002*+B\u001d\b\u0016\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\u0002\u0010\u0005B\u0007\b\u0016¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0007J\u0011\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0004H\u0087\u0002J\u001e\u0010\u0015\u001a\u0004\u0018\u0001H\u0016\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0012\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0002\u0010\u0017J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0019\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0012\u001a\u00020\u0004H\u0007J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0019\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u0002H\u0016H\u0007¢\u0006\u0002\u0010\u001bJ1\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0019\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u0002H\u0016H\u0002¢\u0006\u0002\u0010\u001eJ)\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00160 \"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u0002H\u0016H\u0007¢\u0006\u0002\u0010!J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040#H\u0007J\u001d\u0010$\u001a\u0004\u0018\u0001H\u0016\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0017J\b\u0010\r\u001a\u00020\u000eH\u0007J&\u0010%\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u0001H\u0016H\u0087\u0002¢\u0006\u0002\u0010'J\u0018\u0010(\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u000eH\u0007R\"\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Landroidx/lifecycle/SavedStateHandle;", "", "initialState", "", "", "(Ljava/util/Map;)V", "()V", "flows", "", "Lkotlinx/coroutines/flow/MutableStateFlow;", "liveDatas", "Landroidx/lifecycle/SavedStateHandle$SavingStateLiveData;", "regular", "savedStateProvider", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "savedStateProviders", "clearSavedStateProvider", "", "key", "contains", "", "get", "T", "(Ljava/lang/String;)Ljava/lang/Object;", "getLiveData", "Landroidx/lifecycle/MutableLiveData;", "initialValue", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/lifecycle/MutableLiveData;", "getLiveDataInternal", "hasInitialValue", "(Ljava/lang/String;ZLjava/lang/Object;)Landroidx/lifecycle/MutableLiveData;", "getStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;", "keys", "", la1.b, la1.a, "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "setSavedStateProvider", IronSourceConstants.EVENTS_PROVIDER, "Companion", "SavingStateLiveData", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c00 {
    @NotNull
    private static final String b = "values";
    @NotNull
    private static final String c = "keys";
    @NotNull
    private final Map<String, Object> e;
    @NotNull
    private final Map<String, f60.c> f;
    @NotNull
    private final Map<String, b<?>> g;
    @NotNull
    private final Map<String, lj5<Object>> h;
    @NotNull
    private final f60.c i;
    @NotNull
    public static final a a = new a(null);
    @NotNull
    private static final Class<? extends Object>[] d = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* compiled from: SavedStateHandle.kt */
    @vo4(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0007R \u0010\u0003\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/SavedStateHandle$Companion;", "", "()V", "ACCEPTABLE_CLASSES", "", "Ljava/lang/Class;", "[Ljava/lang/Class;", "KEYS", "", "VALUES", "createHandle", "Landroidx/lifecycle/SavedStateHandle;", "restoredState", "Landroid/os/Bundle;", "defaultState", "validateValue", "", "value", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @i2({i2.a.LIBRARY_GROUP})
        @jz4
        @NotNull
        public final c00 a(@Nullable Bundle bundle, @Nullable Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new c00();
                }
                HashMap hashMap = new HashMap();
                for (String str : bundle2.keySet()) {
                    c25.o(str, "key");
                    hashMap.put(str, bundle2.get(str));
                }
                return new c00(hashMap);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(c00.b);
            if ((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = parcelableArrayList.size();
                for (int i = 0; i < size; i++) {
                    Object obj = parcelableArrayList.get(i);
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
                }
                return new c00(linkedHashMap);
            }
            throw new IllegalStateException("Invalid bundle passed as restored state".toString());
        }

        @i2({i2.a.LIBRARY_GROUP})
        public final boolean b(@Nullable Object obj) {
            Class[] clsArr;
            if (obj == null) {
                return true;
            }
            for (Class cls : c00.d) {
                c25.m(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    public c00(@NotNull Map<String, ? extends Object> map) {
        c25.p(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.e = linkedHashMap;
        this.f = new LinkedHashMap();
        this.g = new LinkedHashMap();
        this.h = new LinkedHashMap();
        this.i = new f60.c() { // from class: com.p7700g.p99005.zy
            @Override // com.p7700g.p99005.f60.c
            public final Bundle a() {
                return c00.m(c00.this);
            }
        };
        linkedHashMap.putAll(map);
    }

    @i2({i2.a.LIBRARY_GROUP})
    @jz4
    @NotNull
    public static final c00 f(@Nullable Bundle bundle, @Nullable Bundle bundle2) {
        return a.a(bundle, bundle2);
    }

    private final <T> xz<T> j(String str, boolean z, T t) {
        b<?> bVar;
        b<?> bVar2 = this.g.get(str);
        b<?> bVar3 = bVar2 instanceof xz ? bVar2 : null;
        if (bVar3 != null) {
            return bVar3;
        }
        if (this.e.containsKey(str)) {
            bVar = new b<>(this, str, this.e.get(str));
        } else if (z) {
            this.e.put(str, t);
            bVar = new b<>(this, str, t);
        } else {
            bVar = new b<>(this, str);
        }
        this.g.put(str, bVar);
        return bVar;
    }

    public static /* synthetic */ Bundle m(c00 c00Var) {
        return p(c00Var);
    }

    public static final Bundle p(c00 c00Var) {
        c25.p(c00Var, "this$0");
        for (Map.Entry entry : nt4.D0(c00Var.f).entrySet()) {
            c00Var.q((String) entry.getKey(), ((f60.c) entry.getValue()).a());
        }
        Set<String> keySet = c00Var.e.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(c00Var.e.get(str));
        }
        return mm.b(cq4.a("keys", arrayList), cq4.a(b, arrayList2));
    }

    @u1
    public final void d(@NotNull String str) {
        c25.p(str, "key");
        this.f.remove(str);
    }

    @u1
    public final boolean e(@NotNull String str) {
        c25.p(str, "key");
        return this.e.containsKey(str);
    }

    @u1
    @Nullable
    public final <T> T g(@NotNull String str) {
        c25.p(str, "key");
        return (T) this.e.get(str);
    }

    @u1
    @NotNull
    public final <T> xz<T> h(@NotNull String str) {
        c25.p(str, "key");
        return j(str, false, null);
    }

    @u1
    @NotNull
    public final <T> xz<T> i(@NotNull String str, T t) {
        c25.p(str, "key");
        return j(str, true, t);
    }

    @u1
    @NotNull
    public final <T> ak5<T> k(@NotNull String str, T t) {
        c25.p(str, "key");
        Map<String, lj5<Object>> map = this.h;
        lj5<Object> lj5Var = map.get(str);
        if (lj5Var == null) {
            if (!this.e.containsKey(str)) {
                this.e.put(str, t);
            }
            lj5Var = ck5.a(this.e.get(str));
            this.h.put(str, lj5Var);
            map.put(str, lj5Var);
        }
        return ri5.m(lj5Var);
    }

    @u1
    @NotNull
    public final Set<String> l() {
        return zt4.C(zt4.C(this.e.keySet(), this.f.keySet()), this.g.keySet());
    }

    @u1
    @Nullable
    public final <T> T n(@NotNull String str) {
        c25.p(str, "key");
        T t = (T) this.e.remove(str);
        b<?> remove = this.g.remove(str);
        if (remove != null) {
            remove.r();
        }
        this.h.remove(str);
        return t;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @NotNull
    public final f60.c o() {
        return this.i;
    }

    @u1
    public final <T> void q(@NotNull String str, @Nullable T t) {
        c25.p(str, "key");
        if (a.b(t)) {
            b<?> bVar = this.g.get(str);
            b<?> bVar2 = bVar instanceof xz ? bVar : null;
            if (bVar2 != null) {
                bVar2.q(t);
            } else {
                this.e.put(str, t);
            }
            lj5<Object> lj5Var = this.h.get(str);
            if (lj5Var == null) {
                return;
            }
            lj5Var.setValue(t);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't put value with type ");
        c25.m(t);
        sb.append(t.getClass());
        sb.append(" into saved state");
        throw new IllegalArgumentException(sb.toString());
    }

    @u1
    public final void r(@NotNull String str, @NotNull f60.c cVar) {
        c25.p(str, "key");
        c25.p(cVar, IronSourceConstants.EVENTS_PROVIDER);
        this.f.put(str, cVar);
    }

    /* compiled from: SavedStateHandle.kt */
    @vo4(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B!\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0002\u0010\bB\u0019\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\rR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/SavedStateHandle$SavingStateLiveData;", "T", "Landroidx/lifecycle/MutableLiveData;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "key", "", "value", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;)V", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;)V", "detach", "", "setValue", "(Ljava/lang/Object;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b<T> extends xz<T> {
        @NotNull
        private String m;
        @Nullable
        private c00 n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@Nullable c00 c00Var, @NotNull String str, T t) {
            super(t);
            c25.p(str, "key");
            this.m = str;
            this.n = c00Var;
        }

        @Override // com.p7700g.p99005.xz, androidx.lifecycle.LiveData
        public void q(T t) {
            c00 c00Var = this.n;
            if (c00Var != null) {
                c00Var.e.put(this.m, t);
                lj5 lj5Var = (lj5) c00Var.h.get(this.m);
                if (lj5Var != null) {
                    lj5Var.setValue(t);
                }
            }
            super.q(t);
        }

        public final void r() {
            this.n = null;
        }

        public b(@Nullable c00 c00Var, @NotNull String str) {
            c25.p(str, "key");
            this.m = str;
            this.n = c00Var;
        }
    }

    public c00() {
        this.e = new LinkedHashMap();
        this.f = new LinkedHashMap();
        this.g = new LinkedHashMap();
        this.h = new LinkedHashMap();
        this.i = new f60.c() { // from class: com.p7700g.p99005.zy
            @Override // com.p7700g.p99005.f60.c
            public final Bundle a() {
                return c00.m(c00.this);
            }
        };
    }
}