package com.anchorfree.sdk.fireshield;

import android.os.Parcel;
import android.os.Parcelable;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class FireshieldConfig implements Parcelable {
    @x1
    public static final Parcelable.Creator<FireshieldConfig> CREATOR = new Parcelable.Creator<FireshieldConfig>() { // from class: com.anchorfree.sdk.fireshield.FireshieldConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @x1
        public FireshieldConfig createFromParcel(@x1 Parcel parcel) {
            return new FireshieldConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @x1
        public FireshieldConfig[] newArray(int i) {
            return new FireshieldConfig[i];
        }
    };
    @z1
    private AlertPage alertPage;
    @x1
    private List<FireshieldCategory> categories;
    @x1
    private List<FireshieldCategoryRule> categoryRules;
    private boolean enabled;
    @x1
    private List<String> services;

    /* loaded from: classes.dex */
    public interface Categories {
        @x1
        public static final String FRAUD = "unsafe:fraud";
        @x1
        public static final String MALWARE = "unsafe:malware";
        @x1
        public static final String SAFE = "safe";
        @x1
        public static final String TRACKERS = "unsafe:trackers";
        @x1
        public static final String UNSAFE = "unsafe";
        @x1
        public static final String UNTRUSTED = "unsafe:untrusted";
    }

    /* loaded from: classes.dex */
    public interface Services {
        @x1
        public static final String BITDEFENDER = "bitdefender";
        @x1
        public static final String IP = "ip";
        @x1
        public static final String SOPHOS = "sophos";
    }

    public FireshieldConfig(@x1 List<String> list, boolean z, @x1 List<FireshieldCategory> list2, @x1 List<FireshieldCategoryRule> list3, @z1 AlertPage alertPage) {
        this.services = list;
        this.enabled = z;
        this.categories = list2;
        this.categoryRules = list3;
        this.alertPage = alertPage;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @z1
    public AlertPage getAlertPage() {
        return this.alertPage;
    }

    @x1
    public List<FireshieldCategory> getCategories() {
        return Collections.unmodifiableList(this.categories);
    }

    @x1
    public List<FireshieldCategoryRule> getCategoryRules() {
        return Collections.unmodifiableList(this.categoryRules);
    }

    @x1
    public List<String> getServices() {
        return Collections.unmodifiableList(this.services);
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeByte(this.enabled ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.services);
        parcel.writeTypedList(this.categories);
        parcel.writeTypedList(this.categoryRules);
        parcel.writeParcelable(this.alertPage, i);
    }

    /* loaded from: classes.dex */
    public static class Builder {
        @z1
        private AlertPage alertPage;
        @x1
        private List<FireshieldCategory> categories;
        @x1
        private List<FireshieldCategoryRule> categoryRules;
        private boolean enabled;
        @x1
        private List<String> services;

        public Builder(@x1 FireshieldConfig fireshieldConfig) {
            this.services = new ArrayList(fireshieldConfig.services);
            this.categories = new ArrayList(fireshieldConfig.categories);
            this.enabled = fireshieldConfig.enabled;
            this.categoryRules = new ArrayList(fireshieldConfig.categoryRules);
            this.alertPage = fireshieldConfig.alertPage;
        }

        @x1
        public static FireshieldConfig empty() {
            return new Builder().enabled(false).build();
        }

        @x1
        public Builder addCategory(@x1 FireshieldCategory fireshieldCategory) {
            if (!this.categories.contains(fireshieldCategory)) {
                this.categories.add(fireshieldCategory);
            }
            return this;
        }

        @x1
        public Builder addCategoryRule(@x1 FireshieldCategoryRule fireshieldCategoryRule) {
            this.categoryRules.add(fireshieldCategoryRule);
            return this;
        }

        @x1
        public Builder addService(@x1 String str) {
            if (!this.services.contains(str)) {
                this.services.add(str);
            }
            return this;
        }

        @x1
        public Builder alertPage(@z1 AlertPage alertPage) {
            this.alertPage = alertPage;
            return this;
        }

        @x1
        public FireshieldConfig build() {
            return new FireshieldConfig(this.services, this.enabled, this.categories, this.categoryRules, this.alertPage);
        }

        @x1
        public Builder clearServices() {
            this.services.clear();
            return this;
        }

        @x1
        public Builder enabled(boolean z) {
            this.enabled = z;
            return this;
        }

        @x1
        public Builder replaceCategory(@x1 FireshieldCategory fireshieldCategory) {
            boolean z = false;
            for (int i = 0; i < this.categories.size(); i++) {
                if (this.categories.get(i).getCategory().equals(fireshieldCategory.getCategory())) {
                    this.categories.set(i, fireshieldCategory);
                    z = true;
                }
            }
            if (!z) {
                this.categories.add(fireshieldCategory);
            }
            return this;
        }

        public Builder() {
            this.services = new ArrayList();
            this.categories = new ArrayList();
            this.enabled = true;
            this.categoryRules = new ArrayList();
        }
    }

    public FireshieldConfig(@x1 Parcel parcel) {
        this.services = parcel.createStringArrayList();
        this.categories = parcel.createTypedArrayList(FireshieldCategory.CREATOR);
        this.enabled = parcel.readByte() != 0;
        this.categoryRules = parcel.createTypedArrayList(FireshieldCategoryRule.CREATOR);
        this.alertPage = (AlertPage) parcel.readParcelable(AlertPage.class.getClassLoader());
    }
}