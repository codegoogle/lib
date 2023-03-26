package com.p7700g.p99005;

import com.p7700g.p99005.lz5;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: OptionalConverterFactory.java */
@IgnoreJRERequirement
/* loaded from: classes4.dex */
public final class sz5 extends lz5.a {
    public static final lz5.a a = new sz5();

    /* compiled from: OptionalConverterFactory.java */
    @IgnoreJRERequirement
    /* loaded from: classes4.dex */
    public static final class a<T> implements lz5<kr5, Optional<T>> {
        public final lz5<kr5, T> a;

        public a(lz5<kr5, T> lz5Var) {
            this.a = lz5Var;
        }

        @Override // com.p7700g.p99005.lz5
        /* renamed from: b */
        public Optional<T> a(kr5 kr5Var) throws IOException {
            return Optional.ofNullable(this.a.a(kr5Var));
        }
    }

    @Override // com.p7700g.p99005.lz5.a
    @Nullable
    public lz5<kr5, ?> d(Type type, Annotation[] annotationArr, yz5 yz5Var) {
        if (lz5.a.b(type) != Optional.class) {
            return null;
        }
        return new a(yz5Var.n(lz5.a.a(0, (ParameterizedType) type), annotationArr));
    }
}