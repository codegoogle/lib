package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.widget.ImageView;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Constants;
import com.google.android.gms.internal.base.zak;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.internal.base.zaq;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class ImageManager {
    private static final Object zaa = new Object();
    private static HashSet<Uri> zab = new HashSet<>();
    private static ImageManager zac;
    private final Context zad;
    private final Handler zae = new zaq(Looper.getMainLooper());
    private final ExecutorService zaf = zap.zaa().zab(4, 2);
    private final zak zag = new zak();
    private final Map<zag, ImageReceiver> zah = new HashMap();
    private final Map<Uri, ImageReceiver> zai = new HashMap();
    private final Map<Uri, Long> zaj = new HashMap();

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepName
    /* loaded from: classes2.dex */
    public final class ImageReceiver extends ResultReceiver {
        private final Uri zab;
        private final ArrayList<zag> zac;

        public ImageReceiver(Uri uri) {
            super(new zaq(Looper.getMainLooper()));
            this.zab = uri;
            this.zac = new ArrayList<>();
        }

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i, Bundle bundle) {
            ImageManager imageManager = ImageManager.this;
            imageManager.zaf.execute(new zaa(imageManager, this.zab, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }

        public final void zab(zag zagVar) {
            Asserts.checkMainThread("ImageReceiver.addImageRequest() must be called in the main thread");
            this.zac.add(zagVar);
        }

        public final void zac(zag zagVar) {
            Asserts.checkMainThread("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.zac.remove(zagVar);
        }

        public final void zad() {
            Intent intent = new Intent(Constants.ACTION_LOAD_IMAGE);
            intent.setPackage("com.google.android.gms");
            intent.putExtra(Constants.EXTRA_URI, this.zab);
            intent.putExtra(Constants.EXTRA_RESULT_RECEIVER, this);
            intent.putExtra(Constants.EXTRA_PRIORITY, 3);
            ImageManager.this.zad.sendBroadcast(intent);
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* loaded from: classes2.dex */
    public interface OnImageLoadedListener {
        void onImageLoaded(@x1 Uri uri, @z1 Drawable drawable, boolean z);
    }

    private ImageManager(Context context, boolean z) {
        this.zad = context.getApplicationContext();
    }

    @x1
    public static ImageManager create(@x1 Context context) {
        if (zac == null) {
            zac = new ImageManager(context, false);
        }
        return zac;
    }

    public void loadImage(@x1 ImageView imageView, int i) {
        zaj(new zae(imageView, i));
    }

    public final void zaj(zag zagVar) {
        Asserts.checkMainThread("ImageManager.loadImage() must be called in the main thread");
        new zab(this, zagVar).run();
    }

    public void loadImage(@x1 ImageView imageView, @x1 Uri uri) {
        zaj(new zae(imageView, uri));
    }

    public void loadImage(@x1 ImageView imageView, @x1 Uri uri, int i) {
        zae zaeVar = new zae(imageView, uri);
        zaeVar.zab = i;
        zaj(zaeVar);
    }

    public void loadImage(@x1 OnImageLoadedListener onImageLoadedListener, @x1 Uri uri) {
        zaj(new zaf(onImageLoadedListener, uri));
    }

    public void loadImage(@x1 OnImageLoadedListener onImageLoadedListener, @x1 Uri uri, int i) {
        zaf zafVar = new zaf(onImageLoadedListener, uri);
        zafVar.zab = i;
        zaj(zafVar);
    }
}