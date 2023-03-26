package com.p7700g.p99005;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TypeParameterReference.kt */
@vo4(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0014\u0010\u001c\u001a\u00020\u001d2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\b\u0010\u001e\u001a\u00020\u0005H\u0016R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006 "}, d2 = {"Lkotlin/jvm/internal/TypeParameterReference;", "Lkotlin/reflect/KTypeParameter;", "container", "", "name", "", "variance", "Lkotlin/reflect/KVariance;", "isReified", "", "(Ljava/lang/Object;Ljava/lang/String;Lkotlin/reflect/KVariance;Z)V", "bounds", "", "Lkotlin/reflect/KType;", "()Z", "getName", "()Ljava/lang/String;", "upperBounds", "getUpperBounds$annotations", "()V", "getUpperBounds", "()Ljava/util/List;", "getVariance", "()Lkotlin/reflect/KVariance;", "equals", "other", "hashCode", "", "setUpperBounds", "", "toString", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@tp4(version = "1.4")
/* loaded from: classes3.dex */
public final class l35 implements k65 {
    @NotNull
    public static final a s = new a(null);
    @Nullable
    private final Object t;
    @NotNull
    private final String u;
    @NotNull
    private final m65 v;
    private final boolean w;
    @Nullable
    private volatile List<? extends j65> x;

    /* compiled from: TypeParameterReference.kt */
    @vo4(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/jvm/internal/TypeParameterReference$Companion;", "", "()V", "toString", "", "typeParameter", "Lkotlin/reflect/KTypeParameter;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {

        /* compiled from: TypeParameterReference.kt */
        @vo4(k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: com.p7700g.p99005.l35$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C0208a {
            public static final /* synthetic */ int[] a;

            static {
                m65.values();
                int[] iArr = new int[3];
                iArr[m65.INVARIANT.ordinal()] = 1;
                iArr[m65.IN.ordinal()] = 2;
                iArr[m65.OUT.ordinal()] = 3;
                a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a(@NotNull k65 k65Var) {
            c25.p(k65Var, "typeParameter");
            StringBuilder sb = new StringBuilder();
            int ordinal = k65Var.b().ordinal();
            if (ordinal == 1) {
                sb.append("in ");
            } else if (ordinal == 2) {
                sb.append("out ");
            }
            sb.append(k65Var.getName());
            String sb2 = sb.toString();
            c25.o(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
    }

    public l35(@Nullable Object obj, @NotNull String str, @NotNull m65 m65Var, boolean z) {
        c25.p(str, "name");
        c25.p(m65Var, "variance");
        this.t = obj;
        this.u = str;
        this.v = m65Var;
        this.w = z;
    }

    public static /* synthetic */ void c() {
    }

    @Override // com.p7700g.p99005.k65
    public boolean a() {
        return this.w;
    }

    @Override // com.p7700g.p99005.k65
    @NotNull
    public m65 b() {
        return this.v;
    }

    public final void d(@NotNull List<? extends j65> list) {
        c25.p(list, "upperBounds");
        if (this.x == null) {
            this.x = list;
            return;
        }
        throw new IllegalStateException(("Upper bounds of type parameter '" + this + "' have already been initialized.").toString());
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof l35) {
            l35 l35Var = (l35) obj;
            if (c25.g(this.t, l35Var.t) && c25.g(getName(), l35Var.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p7700g.p99005.k65
    @NotNull
    public String getName() {
        return this.u;
    }

    @Override // com.p7700g.p99005.k65
    @NotNull
    public List<j65> getUpperBounds() {
        List list = this.x;
        if (list == null) {
            List<j65> l = is4.l(c35.n(Object.class));
            this.x = l;
            return l;
        }
        return list;
    }

    public int hashCode() {
        Object obj = this.t;
        return getName().hashCode() + ((obj != null ? obj.hashCode() : 0) * 31);
    }

    @NotNull
    public String toString() {
        return s.a(this);
    }
}