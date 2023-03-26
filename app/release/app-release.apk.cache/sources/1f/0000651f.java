package com.p7700g.p99005;

import java.util.Iterator;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.jetbrains.annotations.NotNull;

/* compiled from: Streams.kt */
@fz4(name = "StreamsKt")
@vo4(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u0005H\u0007\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0007H\u0007\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\b0\u0001\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\tH\u0007\u001a\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\t\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u0001H\u0007\u001a\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f*\u00020\u0003H\u0007\u001a\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f*\u00020\u0005H\u0007\u001a\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\u00020\u0007H\u0007\u001a\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0\f\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\tH\u0007¨\u0006\r"}, d2 = {"asSequence", "Lkotlin/sequences/Sequence;", "", "Ljava/util/stream/DoubleStream;", "", "Ljava/util/stream/IntStream;", "", "Ljava/util/stream/LongStream;", "T", "Ljava/util/stream/Stream;", "asStream", "toList", "", "kotlin-stdlib-jdk8"}, k = 2, mv = {1, 6, 0}, pn = "kotlin.streams", xi = 48)
/* loaded from: classes3.dex */
public final class x75 {

    /* compiled from: Sequences.kt */
    @vo4(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements g75<T> {
        public final /* synthetic */ Stream a;

        public a(Stream stream) {
            this.a = stream;
        }

        @Override // com.p7700g.p99005.g75
        @NotNull
        public Iterator<T> iterator() {
            Iterator<T> it = this.a.iterator();
            c25.o(it, "iterator()");
            return it;
        }
    }

    /* compiled from: Sequences.kt */
    @vo4(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements g75<Integer> {
        public final /* synthetic */ IntStream a;

        public b(IntStream intStream) {
            this.a = intStream;
        }

        @Override // com.p7700g.p99005.g75
        @NotNull
        public Iterator<Integer> iterator() {
            PrimitiveIterator.OfInt it = this.a.iterator();
            c25.o(it, "iterator()");
            return it;
        }
    }

    /* compiled from: Sequences.kt */
    @vo4(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c implements g75<Long> {
        public final /* synthetic */ LongStream a;

        public c(LongStream longStream) {
            this.a = longStream;
        }

        @Override // com.p7700g.p99005.g75
        @NotNull
        public Iterator<Long> iterator() {
            PrimitiveIterator.OfLong it = this.a.iterator();
            c25.o(it, "iterator()");
            return it;
        }
    }

    /* compiled from: Sequences.kt */
    @vo4(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d implements g75<Double> {
        public final /* synthetic */ DoubleStream a;

        public d(DoubleStream doubleStream) {
            this.a = doubleStream;
        }

        @Override // com.p7700g.p99005.g75
        @NotNull
        public Iterator<Double> iterator() {
            PrimitiveIterator.OfDouble it = this.a.iterator();
            c25.o(it, "iterator()");
            return it;
        }
    }

    @tp4(version = "1.2")
    @NotNull
    public static final g75<Double> a(@NotNull DoubleStream doubleStream) {
        c25.p(doubleStream, "<this>");
        return new d(doubleStream);
    }

    @tp4(version = "1.2")
    @NotNull
    public static final g75<Integer> b(@NotNull IntStream intStream) {
        c25.p(intStream, "<this>");
        return new b(intStream);
    }

    @tp4(version = "1.2")
    @NotNull
    public static final g75<Long> c(@NotNull LongStream longStream) {
        c25.p(longStream, "<this>");
        return new c(longStream);
    }

    @tp4(version = "1.2")
    @NotNull
    public static final <T> g75<T> d(@NotNull Stream<T> stream) {
        c25.p(stream, "<this>");
        return new a(stream);
    }

    @tp4(version = "1.2")
    @NotNull
    public static final <T> Stream<T> e(@NotNull final g75<? extends T> g75Var) {
        c25.p(g75Var, "<this>");
        Stream<T> stream = StreamSupport.stream(new Supplier() { // from class: com.p7700g.p99005.w75
            @Override // java.util.function.Supplier
            public final Object get() {
                return x75.g(g75.this);
            }
        }, 16, false);
        c25.o(stream, "stream({ Spliterators.sp…literator.ORDERED, false)");
        return stream;
    }

    public static final Spliterator f(g75 g75Var) {
        c25.p(g75Var, "$this_asStream");
        return Spliterators.spliteratorUnknownSize(g75Var.iterator(), 16);
    }

    public static /* synthetic */ Spliterator g(g75 g75Var) {
        return f(g75Var);
    }

    @tp4(version = "1.2")
    @NotNull
    public static final List<Double> h(@NotNull DoubleStream doubleStream) {
        c25.p(doubleStream, "<this>");
        double[] array = doubleStream.toArray();
        c25.o(array, "toArray()");
        return zr4.p(array);
    }

    @tp4(version = "1.2")
    @NotNull
    public static final List<Integer> i(@NotNull IntStream intStream) {
        c25.p(intStream, "<this>");
        int[] array = intStream.toArray();
        c25.o(array, "toArray()");
        return zr4.r(array);
    }

    @tp4(version = "1.2")
    @NotNull
    public static final List<Long> j(@NotNull LongStream longStream) {
        c25.p(longStream, "<this>");
        long[] array = longStream.toArray();
        c25.o(array, "toArray()");
        return zr4.s(array);
    }

    @tp4(version = "1.2")
    @NotNull
    public static final <T> List<T> k(@NotNull Stream<T> stream) {
        c25.p(stream, "<this>");
        Object collect = stream.collect(Collectors.toList());
        c25.o(collect, "collect(Collectors.toList<T>())");
        return (List) collect;
    }
}