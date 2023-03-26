package com.greedygame.core.network.model.responses;

import android.os.Parcel;
import android.os.Parcelable;
import com.p7700g.p99005.b95;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.la5;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
@la5
/* loaded from: classes3.dex */
public final class UiiConfiguration implements Parcelable {
    @Nullable
    private final String u;
    @NotNull
    public static final a s = new a(null);
    @NotNull
    public static final Parcelable.Creator<UiiConfiguration> CREATOR = new b();
    @NotNull
    private static final UiiConfiguration t = new UiiConfiguration(c.FLAT.toString());

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UiiConfiguration a() {
            return UiiConfiguration.t;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements Parcelable.Creator<UiiConfiguration> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public final UiiConfiguration createFromParcel(@NotNull Parcel parcel) {
            c25.p(parcel, "parcel");
            return new UiiConfiguration(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public final UiiConfiguration[] newArray(int i) {
            return new UiiConfiguration[i];
        }
    }

    /* loaded from: classes3.dex */
    public enum c {
        FLAT("flat"),
        WRAP("wrap"),
        WRAP_GRADIENT("gradient_wrap");
        
        @NotNull
        public static final a s = new a(null);
        @NotNull
        private final String x;

        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final c a(@Nullable String str) {
                c cVar = c.FLAT;
                if (b95.K1(str, cVar.g(), true)) {
                    return cVar;
                }
                c cVar2 = c.WRAP;
                if (!b95.K1(str, cVar2.g(), true)) {
                    cVar2 = c.WRAP_GRADIENT;
                    if (!b95.K1(str, cVar2.g(), true)) {
                        return cVar;
                    }
                }
                return cVar2;
            }
        }

        c(String str) {
            this.x = str;
        }

        @NotNull
        public final String g() {
            return this.x;
        }
    }

    public UiiConfiguration(@Json(name = "type") @Nullable String str) {
        this.u = str;
    }

    @NotNull
    public final c d() {
        return c.s.a(this.u);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String e() {
        return this.u;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        c25.p(parcel, "out");
        parcel.writeString(this.u);
    }
}