package com.anchorfree.sdk.fireshield;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.p7700g.p99005.kb0;
import com.p7700g.p99005.o31;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class FireshieldCategoryRule implements Parcelable {
    @x1
    private final String category;
    @x1
    public static final RuntimeTypeAdapterFactory<FireshieldCategoryRule> SERIALIZER = RuntimeTypeAdapterFactory.of(FireshieldCategoryRule.class, "type").registerSubtype(AssetsRule.class, "assets").registerSubtype(FileRule.class, o31.b).registerSubtype(DomainsRule.class, "domains");
    @x1
    public static final Parcelable.Creator<FireshieldCategoryRule> CREATOR = new Parcelable.Creator<FireshieldCategoryRule>() { // from class: com.anchorfree.sdk.fireshield.FireshieldCategoryRule.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @x1
        public FireshieldCategoryRule createFromParcel(@x1 Parcel parcel) {
            return new FireshieldCategoryRule(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @x1
        public FireshieldCategoryRule[] newArray(int i) {
            return new FireshieldCategoryRule[i];
        }
    };

    /* loaded from: classes.dex */
    public static class Builder {
        @x1
        public static FireshieldCategoryRule fromAssets(@x1 String str, @x1 String str2) {
            return new AssetsRule(str, str2);
        }

        @x1
        public static FireshieldCategoryRule fromDomains(@x1 String str, @x1 List<String> list) {
            return new DomainsRule(str, list);
        }

        @x1
        public static FireshieldCategoryRule fromFile(@x1 String str, @x1 String str2) {
            return new FileRule(str, str2);
        }
    }

    public FireshieldCategoryRule(@x1 String str) {
        this.category = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @x1
    public String getCategory() {
        return this.category;
    }

    @z1
    public File getFile(@x1 Context context, @x1 File file) {
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeString(this.category);
    }

    /* loaded from: classes.dex */
    public static class AssetsRule extends FireshieldCategoryRule {
        private final String name;

        public AssetsRule(Parcel parcel) {
            super(parcel);
            this.name = parcel.readString();
        }

        @Override // com.anchorfree.sdk.fireshield.FireshieldCategoryRule
        @z1
        public File getFile(@x1 Context context, @x1 File file) {
            try {
                InputStream open = context.getAssets().open(this.name);
                File createTempFile = File.createTempFile("assets", "fireshield", file);
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                byte[] bArr = new byte[kb0.c];
                while (true) {
                    int read = open.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.close();
                        open.close();
                        return createTempFile;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override // com.anchorfree.sdk.fireshield.FireshieldCategoryRule, android.os.Parcelable
        public void writeToParcel(@x1 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.name);
        }

        public AssetsRule(@x1 String str, @x1 String str2) {
            super(str);
            this.name = str2;
        }
    }

    /* loaded from: classes.dex */
    public static class FileRule extends FireshieldCategoryRule {
        private final String path;

        public FileRule(@x1 Parcel parcel) {
            super(parcel);
            this.path = parcel.readString();
        }

        @Override // com.anchorfree.sdk.fireshield.FireshieldCategoryRule
        @x1
        public File getFile(@x1 Context context, @x1 File file) {
            return new File(this.path);
        }

        @Override // com.anchorfree.sdk.fireshield.FireshieldCategoryRule, android.os.Parcelable
        public void writeToParcel(@x1 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.path);
        }

        public FileRule(@x1 String str, @x1 String str2) {
            super(str);
            this.path = str2;
        }
    }

    /* loaded from: classes.dex */
    public static class DomainsRule extends FireshieldCategoryRule {
        @x1
        private final List<String> domains;

        public DomainsRule(@x1 Parcel parcel) {
            super(parcel);
            ArrayList arrayList = new ArrayList();
            this.domains = arrayList;
            parcel.readStringList(arrayList);
        }

        @x1
        public List<String> getDomains() {
            return this.domains;
        }

        @Override // com.anchorfree.sdk.fireshield.FireshieldCategoryRule
        @z1
        public File getFile(@x1 Context context, @x1 File file) {
            try {
                File createTempFile = File.createTempFile("domains", "fireshield", file);
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                for (String str : this.domains) {
                    fileOutputStream.write(str.getBytes(Charset.forName("UTF-8")));
                    fileOutputStream.write("\n".getBytes(Charset.forName("UTF-8")));
                }
                fileOutputStream.close();
                return createTempFile;
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override // com.anchorfree.sdk.fireshield.FireshieldCategoryRule, android.os.Parcelable
        public void writeToParcel(@x1 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeStringList(this.domains);
        }

        public DomainsRule(@x1 String str, @x1 List<String> list) {
            super(str);
            this.domains = list;
        }
    }

    public FireshieldCategoryRule(@x1 Parcel parcel) {
        this.category = parcel.readString();
    }
}