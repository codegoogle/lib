package com.p7700g.p99005;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: StreamAssetPathFetcher.java */
/* loaded from: classes2.dex */
public class ar1 extends pq1<InputStream> {
    public ar1(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.p7700g.p99005.rq1
    @x1
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.p7700g.p99005.pq1
    /* renamed from: g */
    public void c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // com.p7700g.p99005.pq1
    /* renamed from: h */
    public InputStream f(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}