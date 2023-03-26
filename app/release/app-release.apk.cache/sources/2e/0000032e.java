package com.anchorfree.sdk.fireshield;

import android.os.Parcel;
import android.os.Parcelable;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class FireshieldCategory implements Parcelable {
    @x1
    public static final Parcelable.Creator<FireshieldCategory> CREATOR = new Parcelable.Creator<FireshieldCategory>() { // from class: com.anchorfree.sdk.fireshield.FireshieldCategory.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @x1
        public FireshieldCategory createFromParcel(@x1 Parcel parcel) {
            return new FireshieldCategory(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FireshieldCategory[] newArray(int i) {
            return new FireshieldCategory[i];
        }
    };
    @x1
    private final String category;
    @x1
    private final Map<String, Object> opts;
    @x1
    private final String type;

    /* loaded from: classes.dex */
    public static class Builder {
        @x1
        public static FireshieldCategory block(@x1 String str) {
            return new FireshieldCategory(str, "block_dns", wo1.R("dst-ip", "127.0.0.1"));
        }

        @x1
        public static FireshieldCategory blockAlertPage(@x1 String str) {
            return new FireshieldCategory(str, "block_alert_page", new HashMap());
        }

        @x1
        public static FireshieldCategory bypass(@x1 String str) {
            return new FireshieldCategory(str, "bypass", new HashMap());
        }

        @x1
        public static FireshieldCategory custom(@x1 String str, @x1 String str2) {
            return custom(str, str2, new HashMap());
        }

        @x1
        public static FireshieldCategory proxy(@x1 String str) {
            return new FireshieldCategory(str, "proxy_peer", new HashMap());
        }

        @x1
        public static FireshieldCategory vpn(@x1 String str) {
            return new FireshieldCategory(str, "vpn", new HashMap());
        }

        @x1
        public static FireshieldCategory custom(@x1 String str, @x1 String str2, @x1 Map<String, Object> map) {
            if (str2.equals("block_dns")) {
                map.put("dst-ip", "127.0.0.1");
            }
            return new FireshieldCategory(str, str2, map);
        }
    }

    public FireshieldCategory(@x1 String str, @x1 String str2, @x1 Map<String, Object> map) {
        this.category = str;
        this.type = str2;
        this.opts = map;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FireshieldCategory fireshieldCategory = (FireshieldCategory) obj;
        if (this.category.equals(fireshieldCategory.category)) {
            return this.type.equals(fireshieldCategory.type);
        }
        return false;
    }

    @x1
    public String getCategory() {
        return this.category;
    }

    @x1
    public Map<String, Object> getOpts() {
        return Collections.unmodifiableMap(this.opts);
    }

    @x1
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + (this.category.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeString(this.category);
        parcel.writeString(this.type);
        parcel.writeMap(this.opts);
    }

    public FireshieldCategory(@x1 Parcel parcel) {
        this.category = parcel.readString();
        this.type = parcel.readString();
        this.opts = parcel.readHashMap(HashMap.class.getClassLoader());
    }
}