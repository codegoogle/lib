package com.greedygame.core.network.model.responses;

import android.os.Parcel;
import android.os.Parcelable;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.la5;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
@la5
/* loaded from: classes3.dex */
public final class Tracking implements Parcelable {
    @NotNull
    public static final Parcelable.Creator<Tracking> CREATOR = new a();
    @Nullable
    private final List<String> s;
    @Nullable
    private final List<String> t;
    @Nullable
    private final List<String> u;

    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<Tracking> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public final Tracking createFromParcel(@NotNull Parcel parcel) {
            c25.p(parcel, "parcel");
            return new Tracking(parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public final Tracking[] newArray(int i) {
            return new Tracking[i];
        }
    }

    public Tracking(@Json(name = "click") @Nullable List<String> list, @Json(name = "impression") @Nullable List<String> list2, @Json(name = "error") @Nullable List<String> list3) {
        this.s = list;
        this.t = list2;
        this.u = list3;
    }

    @Nullable
    public final List<String> c() {
        return this.s;
    }

    @Nullable
    public final List<String> d() {
        return this.u;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final List<String> e() {
        return this.t;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        c25.p(parcel, "out");
        parcel.writeStringList(this.s);
        parcel.writeStringList(this.t);
        parcel.writeStringList(this.u);
    }
}