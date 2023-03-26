package com.anythink.core.api;

import com.p7700g.p99005.pg1;

/* loaded from: classes2.dex */
public class ATAdStatusInfo {
    private ATAdInfo mATTopAdInfo;
    private boolean mIsLoading;
    private boolean mIsReady;

    public ATAdStatusInfo(boolean z, boolean z2, ATAdInfo aTAdInfo) {
        this.mIsLoading = z;
        this.mIsReady = z2;
        this.mATTopAdInfo = aTAdInfo;
    }

    public ATAdInfo getATTopAdInfo() {
        return this.mATTopAdInfo;
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public boolean isReady() {
        return this.mIsReady;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ATAdStatusInfo{isLoading=");
        sb.append(this.mIsLoading);
        sb.append(", isReady=");
        sb.append(this.mIsReady);
        sb.append(", topAdInfo=");
        Object obj = this.mATTopAdInfo;
        if (obj == null) {
            obj = pg1.d;
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }
}