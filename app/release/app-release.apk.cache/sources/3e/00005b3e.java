package com.p7700g.p99005;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.p7700g.p99005.hd3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class s33 extends hd3 {
    @NotNull
    public static final b m = new b(null);
    @NotNull
    private static final String n = "FacebookAdChoice";

    /* loaded from: classes3.dex */
    public static final class a extends LinearLayout {
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @gz4
        public a(@NotNull Context context) {
            this(context, null, 0, 6, null);
            c25.p(context, "context");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @gz4
        public a(@NotNull Context context, @z1 @Nullable AttributeSet attributeSet) {
            this(context, attributeSet, 0, 4, null);
            c25.p(context, "context");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @gz4
        public a(@NotNull Context context, @z1 @Nullable AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            c25.p(context, "context");
        }

        public void a() {
        }

        public /* synthetic */ a(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s33(@NotNull hd3.a aVar) {
        super(aVar);
        c25.p(aVar, "builder");
    }

    @Override // com.p7700g.p99005.hd3
    @Nullable
    /* renamed from: A */
    public a o() {
        return new a(c(), null, 0, 6, null);
    }
}