package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.Asserts;
import com.p7700g.p99005.z1;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class zaa implements Runnable {
    public final /* synthetic */ ImageManager zaa;
    private final Uri zab;
    @z1
    private final ParcelFileDescriptor zac;

    public zaa(ImageManager imageManager, @z1 Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
        this.zaa = imageManager;
        this.zab = uri;
        this.zac = parcelFileDescriptor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        boolean z;
        Handler handler;
        Asserts.checkNotMainThread("LoadBitmapFromDiskRunnable can't be executed in the main thread");
        ParcelFileDescriptor parcelFileDescriptor = this.zac;
        Bitmap bitmap2 = null;
        boolean z2 = false;
        if (parcelFileDescriptor != null) {
            try {
                bitmap2 = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
            } catch (OutOfMemoryError unused) {
                String valueOf = String.valueOf(this.zab);
                valueOf.length();
                "OOM while loading bitmap for uri: ".concat(valueOf);
                z2 = true;
            }
            try {
                this.zac.close();
            } catch (IOException unused2) {
            }
            bitmap = bitmap2;
            z = z2;
        } else {
            bitmap = null;
            z = false;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ImageManager imageManager = this.zaa;
        handler = imageManager.zae;
        handler.post(new zac(imageManager, this.zab, bitmap, z, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused3) {
            String valueOf2 = String.valueOf(this.zab);
            valueOf2.length();
            "Latch interrupted while posting ".concat(valueOf2);
        }
    }
}