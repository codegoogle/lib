package com.p7700g.p99005;

import com.anchorfree.sdk.DBProvider;
import com.anythink.core.api.ATAdConst;
import com.p7700g.p99005.t35;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MapBuilder.kt */
@vo4(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 {*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u00060\u0004j\u0002`\u0005:\u0007{|}~\u007f\u0080\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tBE\b\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0002\u0010\u0012J\u0017\u00102\u001a\u00020\b2\u0006\u00103\u001a\u00028\u0000H\u0000¢\u0006\u0004\b4\u00105J\u0013\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0002¢\u0006\u0002\u00107J\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000109J\r\u0010:\u001a\u00020;H\u0000¢\u0006\u0002\b<J\b\u0010=\u001a\u00020;H\u0016J\b\u0010>\u001a\u00020;H\u0002J\u0019\u0010?\u001a\u00020!2\n\u0010@\u001a\u0006\u0012\u0002\b\u00030AH\u0000¢\u0006\u0002\bBJ!\u0010C\u001a\u00020!2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010EH\u0000¢\u0006\u0002\bFJ\u0015\u0010G\u001a\u00020!2\u0006\u00103\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010HJ\u0015\u0010I\u001a\u00020!2\u0006\u0010J\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010HJ\u0018\u0010K\u001a\u00020!2\u000e\u0010L\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u000309H\u0002J\u0010\u0010M\u001a\u00020;2\u0006\u0010\u0013\u001a\u00020\bH\u0002J\u0010\u0010N\u001a\u00020;2\u0006\u0010O\u001a\u00020\bH\u0002J\u0019\u0010P\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010QH\u0000¢\u0006\u0002\bRJ\u0013\u0010S\u001a\u00020!2\b\u0010L\u001a\u0004\u0018\u00010TH\u0096\u0002J\u0015\u0010U\u001a\u00020\b2\u0006\u00103\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00105J\u0015\u0010V\u001a\u00020\b2\u0006\u0010J\u001a\u00028\u0001H\u0002¢\u0006\u0002\u00105J\u0018\u0010W\u001a\u0004\u0018\u00018\u00012\u0006\u00103\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010XJ\u0015\u0010Y\u001a\u00020\b2\u0006\u00103\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00105J\b\u0010Z\u001a\u00020\bH\u0016J\b\u0010[\u001a\u00020!H\u0016J\u0019\u0010\\\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010]H\u0000¢\u0006\u0002\b^J\u001f\u0010_\u001a\u0004\u0018\u00018\u00012\u0006\u00103\u001a\u00028\u00002\u0006\u0010J\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010`J\u001e\u0010a\u001a\u00020;2\u0014\u0010b\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000109H\u0016J\"\u0010c\u001a\u00020!2\u0018\u0010b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010E0AH\u0002J\u001c\u0010d\u001a\u00020!2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010EH\u0002J\u0010\u0010e\u001a\u00020!2\u0006\u0010f\u001a\u00020\bH\u0002J\u0010\u0010g\u001a\u00020;2\u0006\u0010h\u001a\u00020\bH\u0002J\u0017\u0010i\u001a\u0004\u0018\u00018\u00012\u0006\u00103\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010XJ!\u0010j\u001a\u00020!2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010EH\u0000¢\u0006\u0002\bkJ\u0010\u0010l\u001a\u00020;2\u0006\u0010m\u001a\u00020\bH\u0002J\u0017\u0010n\u001a\u00020\b2\u0006\u00103\u001a\u00028\u0000H\u0000¢\u0006\u0004\bo\u00105J\u0010\u0010p\u001a\u00020;2\u0006\u0010q\u001a\u00020\bH\u0002J\u0017\u0010r\u001a\u00020!2\u0006\u0010s\u001a\u00028\u0001H\u0000¢\u0006\u0004\bt\u0010HJ\b\u0010u\u001a\u00020vH\u0016J\u0019\u0010w\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010xH\u0000¢\u0006\u0002\byJ\b\u0010z\u001a\u00020TH\u0002R\u0014\u0010\u0013\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00180\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0015R\u001e\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020!@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001aR\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010'R\u0016\u0010(\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010*\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0015R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010'R\u0016\u00100\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0081\u0001"}, d2 = {"Lkotlin/collections/builders/MapBuilder;", "K", bx.C4, "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "initialCapacity", "", "(I)V", "keysArray", "", "valuesArray", "presenceArray", "", "hashArray", "maxProbeDistance", "length", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "capacity", "getCapacity", "()I", "entries", "", "", "getEntries", "()Ljava/util/Set;", "entriesView", "Lkotlin/collections/builders/MapBuilderEntries;", "hashShift", "hashSize", "getHashSize", "<set-?>", "", "isReadOnly", "isReadOnly$kotlin_stdlib", "()Z", DBProvider.s, "getKeys", "[Ljava/lang/Object;", "keysView", "Lkotlin/collections/builders/MapBuilderKeys;", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "getSize", "values", "", "getValues", "()Ljava/util/Collection;", "valuesView", "Lkotlin/collections/builders/MapBuilderValues;", "addKey", "key", "addKey$kotlin_stdlib", "(Ljava/lang/Object;)I", "allocateValuesArray", "()[Ljava/lang/Object;", "build", "", "checkIsMutable", "", "checkIsMutable$kotlin_stdlib", "clear", "compact", "containsAllEntries", com.anythink.expressad.d.a.b.dH, "", "containsAllEntries$kotlin_stdlib", "containsEntry", "entry", "", "containsEntry$kotlin_stdlib", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "value", "contentEquals", "other", "ensureCapacity", "ensureExtraCapacity", "n", "entriesIterator", "Lkotlin/collections/builders/MapBuilder$EntriesItr;", "entriesIterator$kotlin_stdlib", "equals", "", "findKey", "findValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "hash", "hashCode", "isEmpty", "keysIterator", "Lkotlin/collections/builders/MapBuilder$KeysItr;", "keysIterator$kotlin_stdlib", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "from", "putAllEntries", "putEntry", "putRehash", "i", "rehash", "newHashSize", la1.b, "removeEntry", "removeEntry$kotlin_stdlib", "removeHashAt", "removedHash", "removeKey", "removeKey$kotlin_stdlib", "removeKeyAt", la1.l, "removeValue", "element", "removeValue$kotlin_stdlib", "toString", "", "valuesIterator", "Lkotlin/collections/builders/MapBuilder$ValuesItr;", "valuesIterator$kotlin_stdlib", "writeReplace", "Companion", "EntriesItr", "EntryRef", "Itr", "KeysItr", "ValuesItr", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ku4<K, V> implements Map<K, V>, Serializable, t35 {
    @NotNull
    private static final a s = new a(null);
    @Deprecated
    private static final int t = -1640531527;
    @Deprecated
    private static final int u = 8;
    @Deprecated
    private static final int v = 2;
    @Deprecated
    private static final int w = -1;
    @NotNull
    private int[] A;
    private int B;
    private int C;
    private int D;
    private int E;
    @Nullable
    private mu4<K> F;
    @Nullable
    private nu4<V> G;
    @Nullable
    private lu4<K, V> H;
    private boolean I;
    @NotNull
    private K[] x;
    @Nullable
    private V[] y;
    @NotNull
    private int[] z;

    /* compiled from: MapBuilder.kt */
    @vo4(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlin/collections/builders/MapBuilder$Companion;", "", "()V", "INITIAL_CAPACITY", "", "INITIAL_MAX_PROBE_DISTANCE", "MAGIC", "TOMBSTONE", "computeHashSize", "capacity", "computeShift", "hashSize", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int i) {
            return Integer.highestOneBit(i55.n(i, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int i) {
            return Integer.numberOfLeadingZeros(i) + 1;
        }
    }

    /* compiled from: MapBuilder.kt */
    @vo4(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00050\u0004B\u0019\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\nH\u0096\u0002J\u0012\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000fJ\r\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lkotlin/collections/builders/MapBuilder$EntriesItr;", "K", bx.C4, "Lkotlin/collections/builders/MapBuilder$Itr;", "", "", "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "Lkotlin/collections/builders/MapBuilder$EntryRef;", "nextAppendString", "", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "nextHashCode", "", "nextHashCode$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, q35 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull ku4<K, V> ku4Var) {
            super(ku4Var);
            c25.p(ku4Var, "map");
        }

        @Override // java.util.Iterator
        @NotNull
        /* renamed from: i */
        public c<K, V> next() {
            if (a() < ((ku4) c()).C) {
                int a = a();
                e(a + 1);
                h(a);
                c<K, V> cVar = new c<>(c(), b());
                d();
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public final void j(@NotNull StringBuilder sb) {
            c25.p(sb, "sb");
            if (a() < ((ku4) c()).C) {
                int a = a();
                e(a + 1);
                h(a);
                Object obj = ((ku4) c()).x[b()];
                if (c25.g(obj, c())) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] objArr = ((ku4) c()).y;
                c25.m(objArr);
                Object obj2 = objArr[b()];
                if (c25.g(obj2, c())) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                d();
                return;
            }
            throw new NoSuchElementException();
        }

        public final int k() {
            if (a() < ((ku4) c()).C) {
                int a = a();
                e(a + 1);
                h(a);
                Object obj = ((ku4) c()).x[b()];
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object[] objArr = ((ku4) c()).y;
                c25.m(objArr);
                Object obj2 = objArr[b()];
                int hashCode2 = hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
                d();
                return hashCode2;
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: MapBuilder.kt */
    @vo4(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B!\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\u0015\u0010\u0013\u001a\u00028\u00032\u0006\u0010\u0014\u001a\u00028\u0003H\u0016¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00028\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lkotlin/collections/builders/MapBuilder$EntryRef;", "K", bx.C4, "", "map", "Lkotlin/collections/builders/MapBuilder;", la1.l, "", "(Lkotlin/collections/builders/MapBuilder;I)V", "key", "getKey", "()Ljava/lang/Object;", "value", "getValue", "equals", "", "other", "", "hashCode", "setValue", "newValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c<K, V> implements Map.Entry<K, V>, t35.a {
        @NotNull
        private final ku4<K, V> s;
        private final int t;

        public c(@NotNull ku4<K, V> ku4Var, int i) {
            c25.p(ku4Var, "map");
            this.s = ku4Var;
            this.t = i;
        }

        @Override // java.util.Map.Entry
        public boolean equals(@Nullable Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (c25.g(entry.getKey(), getKey()) && c25.g(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) ((ku4) this.s).x[this.t];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            Object[] objArr = ((ku4) this.s).y;
            c25.m(objArr);
            return (V) objArr[this.t];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            this.s.u();
            Object[] p = this.s.p();
            int i = this.t;
            V v2 = (V) p[i];
            p[i] = v;
            return v2;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* compiled from: MapBuilder.kt */
    @vo4(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0012\u001a\u00020\u0013J\r\u0010\u0014\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0016J\u0006\u0010\u0017\u001a\u00020\u0015R\u001a\u0010\u0007\u001a\u00020\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lkotlin/collections/builders/MapBuilder$Itr;", "K", bx.C4, "", "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", la1.l, "", "getIndex$kotlin_stdlib", "()I", "setIndex$kotlin_stdlib", "(I)V", "lastIndex", "getLastIndex$kotlin_stdlib", "setLastIndex$kotlin_stdlib", "getMap$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder;", "hasNext", "", "initNext", "", "initNext$kotlin_stdlib", la1.b, "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static class d<K, V> {
        @NotNull
        private final ku4<K, V> s;
        private int t;
        private int u;

        public d(@NotNull ku4<K, V> ku4Var) {
            c25.p(ku4Var, "map");
            this.s = ku4Var;
            this.u = -1;
            d();
        }

        public final int a() {
            return this.t;
        }

        public final int b() {
            return this.u;
        }

        @NotNull
        public final ku4<K, V> c() {
            return this.s;
        }

        public final void d() {
            while (this.t < ((ku4) this.s).C) {
                int[] iArr = ((ku4) this.s).z;
                int i = this.t;
                if (iArr[i] >= 0) {
                    return;
                }
                this.t = i + 1;
            }
        }

        public final void e(int i) {
            this.t = i;
        }

        public final void h(int i) {
            this.u = i;
        }

        public final boolean hasNext() {
            return this.t < ((ku4) this.s).C;
        }

        public final void remove() {
            if (this.u != -1) {
                this.s.u();
                this.s.X0(this.u);
                this.u = -1;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    /* compiled from: MapBuilder.kt */
    @vo4(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/collections/builders/MapBuilder$KeysItr;", "K", bx.C4, "Lkotlin/collections/builders/MapBuilder$Itr;", "", "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e<K, V> extends d<K, V> implements Iterator<K>, q35 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull ku4<K, V> ku4Var) {
            super(ku4Var);
            c25.p(ku4Var, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            if (a() < ((ku4) c()).C) {
                int a = a();
                e(a + 1);
                h(a);
                K k = (K) ((ku4) c()).x[b()];
                d();
                return k;
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: MapBuilder.kt */
    @vo4(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/collections/builders/MapBuilder$ValuesItr;", "K", bx.C4, "Lkotlin/collections/builders/MapBuilder$Itr;", "", "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f<K, V> extends d<K, V> implements Iterator<V>, q35 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@NotNull ku4<K, V> ku4Var) {
            super(ku4Var);
            c25.p(ku4Var, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            if (a() < ((ku4) c()).C) {
                int a = a();
                e(a + 1);
                h(a);
                Object[] objArr = ((ku4) c()).y;
                c25.m(objArr);
                V v = (V) objArr[b()];
                d();
                return v;
            }
            throw new NoSuchElementException();
        }
    }

    private ku4(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i, int i2) {
        this.x = kArr;
        this.y = vArr;
        this.z = iArr;
        this.A = iArr2;
        this.B = i;
        this.C = i2;
        this.D = s.d(M());
    }

    private final boolean B(Map<?, ?> map) {
        return size() == map.size() && y(map.entrySet());
    }

    private final void D(int i) {
        if (i >= 0) {
            if (i > J()) {
                int J = (J() * 3) / 2;
                if (i <= J) {
                    i = J;
                }
                this.x = (K[]) ju4.e(this.x, i);
                V[] vArr = this.y;
                this.y = vArr != null ? (V[]) ju4.e(vArr, i) : null;
                int[] copyOf = Arrays.copyOf(this.z, i);
                c25.o(copyOf, "copyOf(this, newSize)");
                this.z = copyOf;
                int c2 = s.c(i);
                if (c2 > M()) {
                    X(c2);
                    return;
                }
                return;
            } else if ((this.C + i) - size() > J()) {
                X(M());
                return;
            } else {
                return;
            }
        }
        throw new OutOfMemoryError();
    }

    private final Object D1() {
        if (this.I) {
            return new pu4(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    private final void E(int i) {
        D(this.C + i);
    }

    private final int H(K k) {
        int Q = Q(k);
        int i = this.B;
        while (true) {
            int i2 = this.A[Q];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (c25.g(this.x[i3], k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            Q = Q == 0 ? M() - 1 : Q - 1;
        }
    }

    private final int I(V v2) {
        int i = this.C;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.z[i] >= 0) {
                V[] vArr = this.y;
                c25.m(vArr);
                if (c25.g(vArr[i], v2)) {
                    return i;
                }
            }
        }
    }

    private final int J() {
        return this.x.length;
    }

    private final int M() {
        return this.A.length;
    }

    private final int Q(K k) {
        return ((k != null ? k.hashCode() : 0) * t) >>> this.D;
    }

    private final boolean T(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        E(collection.size());
        for (Map.Entry<? extends K, ? extends V> entry : collection) {
            if (U(entry)) {
                z = true;
            }
        }
        return z;
    }

    private final boolean U(Map.Entry<? extends K, ? extends V> entry) {
        int o = o(entry.getKey());
        V[] p = p();
        if (o >= 0) {
            p[o] = entry.getValue();
            return true;
        }
        int i = (-o) - 1;
        if (c25.g(entry.getValue(), p[i])) {
            return false;
        }
        p[i] = entry.getValue();
        return true;
    }

    private final boolean V(int i) {
        int Q = Q(this.x[i]);
        int i2 = this.B;
        while (true) {
            int[] iArr = this.A;
            if (iArr[Q] == 0) {
                iArr[Q] = i + 1;
                this.z[i] = Q;
                return true;
            }
            i2--;
            if (i2 < 0) {
                return false;
            }
            Q = Q == 0 ? M() - 1 : Q - 1;
        }
    }

    private final void X(int i) {
        if (this.C > size()) {
            x();
        }
        int i2 = 0;
        if (i != M()) {
            this.A = new int[i];
            this.D = s.d(i);
        } else {
            zr4.l2(this.A, 0, 0, M());
        }
        while (i2 < this.C) {
            int i3 = i2 + 1;
            if (!V(i2)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i2 = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X0(int i) {
        ju4.f(this.x, i);
        w0(this.z[i]);
        this.z[i] = -1;
        this.E = size() - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V[] p() {
        V[] vArr = this.y;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) ju4.d(J());
        this.y = vArr2;
        return vArr2;
    }

    private final void w0(int i) {
        int u2 = i55.u(this.B * 2, M() / 2);
        int i2 = 0;
        int i3 = i;
        do {
            i = i == 0 ? M() - 1 : i - 1;
            i2++;
            if (i2 > this.B) {
                this.A[i3] = 0;
                return;
            }
            int[] iArr = this.A;
            int i4 = iArr[i];
            if (i4 == 0) {
                iArr[i3] = 0;
                return;
            }
            if (i4 < 0) {
                iArr[i3] = -1;
            } else {
                int i5 = i4 - 1;
                if (((Q(this.x[i5]) - i) & (M() - 1)) >= i2) {
                    this.A[i3] = i4;
                    this.z[i5] = i3;
                }
                u2--;
            }
            i3 = i;
            i2 = 0;
            u2--;
        } while (u2 >= 0);
        this.A[i3] = -1;
    }

    private final void x() {
        int i;
        V[] vArr = this.y;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.C;
            if (i2 >= i) {
                break;
            }
            if (this.z[i2] >= 0) {
                K[] kArr = this.x;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                i3++;
            }
            i2++;
        }
        ju4.g(this.x, i3, i);
        if (vArr != null) {
            ju4.g(vArr, i3, this.C);
        }
        this.C = i3;
    }

    public final boolean A(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        c25.p(entry, "entry");
        int H = H(entry.getKey());
        if (H < 0) {
            return false;
        }
        V[] vArr = this.y;
        c25.m(vArr);
        return c25.g(vArr[H], entry.getValue());
    }

    @NotNull
    public final b<K, V> G() {
        return new b<>(this);
    }

    @NotNull
    public Set<Map.Entry<K, V>> L() {
        lu4<K, V> lu4Var = this.H;
        if (lu4Var == null) {
            lu4<K, V> lu4Var2 = new lu4<>(this);
            this.H = lu4Var2;
            return lu4Var2;
        }
        return lu4Var;
    }

    @NotNull
    public Set<K> N() {
        mu4<K> mu4Var = this.F;
        if (mu4Var == null) {
            mu4<K> mu4Var2 = new mu4<>(this);
            this.F = mu4Var2;
            return mu4Var2;
        }
        return mu4Var;
    }

    public int O() {
        return this.E;
    }

    @NotNull
    public Collection<V> P() {
        nu4<V> nu4Var = this.G;
        if (nu4Var == null) {
            nu4<V> nu4Var2 = new nu4<>(this);
            this.G = nu4Var2;
            return nu4Var2;
        }
        return nu4Var;
    }

    public final boolean R() {
        return this.I;
    }

    @NotNull
    public final e<K, V> S() {
        return new e<>(this);
    }

    public final boolean Z(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        c25.p(entry, "entry");
        u();
        int H = H(entry.getKey());
        if (H < 0) {
            return false;
        }
        V[] vArr = this.y;
        c25.m(vArr);
        if (c25.g(vArr[H], entry.getValue())) {
            X0(H);
            return true;
        }
        return false;
    }

    public final boolean c1(V v2) {
        u();
        int I = I(v2);
        if (I < 0) {
            return false;
        }
        X0(I);
        return true;
    }

    @Override // java.util.Map
    public void clear() {
        u();
        ft4 it = new c55(0, this.C - 1).iterator();
        while (it.hasNext()) {
            int b2 = it.b();
            int[] iArr = this.z;
            int i = iArr[b2];
            if (i >= 0) {
                this.A[i] = 0;
                iArr[b2] = -1;
            }
        }
        ju4.g(this.x, 0, this.C);
        V[] vArr = this.y;
        if (vArr != null) {
            ju4.g(vArr, 0, this.C);
        }
        this.E = 0;
        this.C = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return H(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return I(obj) >= 0;
    }

    @NotNull
    public final f<K, V> d1() {
        return new f<>(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return L();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        return obj == this || ((obj instanceof Map) && B((Map) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        int H = H(obj);
        if (H < 0) {
            return null;
        }
        V[] vArr = this.y;
        c25.m(vArr);
        return vArr[H];
    }

    @Override // java.util.Map
    public int hashCode() {
        b<K, V> G = G();
        int i = 0;
        while (G.hasNext()) {
            i += G.k();
        }
        return i;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return N();
    }

    public final int o(K k) {
        u();
        while (true) {
            int Q = Q(k);
            int u2 = i55.u(this.B * 2, M() / 2);
            int i = 0;
            while (true) {
                int i2 = this.A[Q];
                if (i2 <= 0) {
                    if (this.C >= J()) {
                        E(1);
                    } else {
                        int i3 = this.C;
                        int i4 = i3 + 1;
                        this.C = i4;
                        this.x[i3] = k;
                        this.z[i3] = Q;
                        this.A[Q] = i4;
                        this.E = size() + 1;
                        if (i > this.B) {
                            this.B = i;
                        }
                        return i3;
                    }
                } else if (c25.g(this.x[i2 - 1], k)) {
                    return -i2;
                } else {
                    i++;
                    if (i > u2) {
                        X(M() * 2);
                        break;
                    }
                    Q = Q == 0 ? M() - 1 : Q - 1;
                }
            }
        }
    }

    @Override // java.util.Map
    @Nullable
    public V put(K k, V v2) {
        u();
        int o = o(k);
        V[] p = p();
        if (o < 0) {
            int i = (-o) - 1;
            V v3 = p[i];
            p[i] = v2;
            return v3;
        }
        p[o] = v2;
        return null;
    }

    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends V> map) {
        c25.p(map, "from");
        u();
        T(map.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public V remove(Object obj) {
        int x0 = x0(obj);
        if (x0 < 0) {
            return null;
        }
        V[] vArr = this.y;
        c25.m(vArr);
        V v2 = vArr[x0];
        ju4.f(vArr, x0);
        return v2;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return O();
    }

    @NotNull
    public final Map<K, V> t() {
        u();
        this.I = true;
        return this;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        b<K, V> G = G();
        int i = 0;
        while (G.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            G.j(sb);
            i++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        c25.o(sb2, "sb.toString()");
        return sb2;
    }

    public final void u() {
        if (this.I) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return P();
    }

    public final int x0(K k) {
        u();
        int H = H(k);
        if (H < 0) {
            return -1;
        }
        X0(H);
        return H;
    }

    public final boolean y(@NotNull Collection<?> collection) {
        c25.p(collection, com.anythink.expressad.d.a.b.dH);
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!A((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public ku4() {
        this(8);
    }

    public ku4(int i) {
        this(ju4.d(i), null, new int[i], new int[s.c(i)], 2, 0);
    }
}