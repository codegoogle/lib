package com.p7700g.p99005;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* compiled from: FileDescriptorAssetPathFetcher.java */
/* loaded from: classes2.dex */
public class vq1 extends pq1<AssetFileDescriptor> {
    public vq1(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.p7700g.p99005.rq1
    @x1
    public Class<AssetFileDescriptor> a() {
        return AssetFileDescriptor.class;
    }

    @Override // com.p7700g.p99005.pq1
    /* renamed from: g */
    public void c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // com.p7700g.p99005.pq1
    /* renamed from: h */
    public AssetFileDescriptor f(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str);
    }
}