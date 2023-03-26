package com.anchorfree.sdk.fireshield;

import android.os.Parcel;
import android.os.Parcelable;
import com.p7700g.p99005.x1;

/* loaded from: classes.dex */
public class AlertPage implements Parcelable {
    @x1
    public static final Parcelable.Creator<AlertPage> CREATOR = new Parcelable.Creator<AlertPage>() { // from class: com.anchorfree.sdk.fireshield.AlertPage.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @x1
        public AlertPage createFromParcel(@x1 Parcel parcel) {
            return new AlertPage(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @x1
        public AlertPage[] newArray(int i) {
            return new AlertPage[i];
        }
    };
    @x1
    private final String domain;
    @x1
    private final String path;

    public AlertPage(@x1 String str, @x1 String str2) {
        this.domain = str;
        this.path = str2;
    }

    @x1
    public static AlertPage create(@x1 String str, @x1 String str2) {
        return new AlertPage(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @x1
    public String getDomain() {
        return this.domain;
    }

    @x1
    public String getPath() {
        return this.path;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeString(this.domain);
        parcel.writeString(this.path);
    }

    public AlertPage(@x1 Parcel parcel) {
        this.domain = parcel.readString();
        this.path = parcel.readString();
    }
}