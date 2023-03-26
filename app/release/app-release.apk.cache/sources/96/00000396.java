package com.android.volley;

import android.text.TextUtils;
import com.p7700g.p99005.wo1;

/* loaded from: classes2.dex */
public final class Header {
    private final String mName;
    private final String mValue;

    public Header(String str, String str2) {
        this.mName = str;
        this.mValue = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Header.class != obj.getClass()) {
            return false;
        }
        Header header = (Header) obj;
        return TextUtils.equals(this.mName, header.mName) && TextUtils.equals(this.mValue, header.mValue);
    }

    public final String getName() {
        return this.mName;
    }

    public final String getValue() {
        return this.mValue;
    }

    public int hashCode() {
        return this.mValue.hashCode() + (this.mName.hashCode() * 31);
    }

    public String toString() {
        StringBuilder G = wo1.G("Header[name=");
        G.append(this.mName);
        G.append(",value=");
        return wo1.C(G, this.mValue, "]");
    }
}