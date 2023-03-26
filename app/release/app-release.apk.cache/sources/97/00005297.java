package com.p7700g.p99005;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ImageAssetManager.java */
/* loaded from: classes.dex */
public class nk0 {
    private static final Object a = new Object();
    private final Context b;
    private final String c;
    @z1
    private bi0 d;
    private final Map<String, ii0> e;

    public nk0(Drawable.Callback callback, String str, bi0 bi0Var, Map<String, ii0> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.c = str + j14.P;
        } else {
            this.c = str;
        }
        if (!(callback instanceof View)) {
            yo0.e("LottieDrawable must be inside of a view for images to work.");
            this.e = new HashMap();
            this.b = null;
            return;
        }
        this.b = ((View) callback).getContext();
        this.e = map;
        e(bi0Var);
    }

    private Bitmap d(String str, @z1 Bitmap bitmap) {
        synchronized (a) {
            this.e.get(str).h(bitmap);
        }
        return bitmap;
    }

    @z1
    public Bitmap a(String str) {
        ii0 ii0Var = this.e.get(str);
        if (ii0Var == null) {
            return null;
        }
        Bitmap a2 = ii0Var.a();
        if (a2 != null) {
            return a2;
        }
        bi0 bi0Var = this.d;
        if (bi0Var != null) {
            Bitmap a3 = bi0Var.a(ii0Var);
            if (a3 != null) {
                d(str, a3);
            }
            return a3;
        }
        String c = ii0Var.c();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (c.startsWith("data:") && c.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(c.substring(c.indexOf(44) + 1), 0);
                return d(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException e) {
                yo0.f("data URL did not have correct base64 format.", e);
                return null;
            }
        }
        try {
            if (!TextUtils.isEmpty(this.c)) {
                AssetManager assets = this.b.getAssets();
                try {
                    return d(str, cp0.m(BitmapFactory.decodeStream(assets.open(this.c + c), null, options), ii0Var.f(), ii0Var.d()));
                } catch (IllegalArgumentException e2) {
                    yo0.f("Unable to decode image.", e2);
                    return null;
                }
            }
            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
        } catch (IOException e3) {
            yo0.f("Unable to open asset.", e3);
            return null;
        }
    }

    @z1
    public ii0 b(String str) {
        return this.e.get(str);
    }

    public boolean c(Context context) {
        return (context == null && this.b == null) || this.b.equals(context);
    }

    public void e(@z1 bi0 bi0Var) {
        this.d = bi0Var;
    }

    @z1
    public Bitmap f(String str, @z1 Bitmap bitmap) {
        if (bitmap == null) {
            ii0 ii0Var = this.e.get(str);
            Bitmap a2 = ii0Var.a();
            ii0Var.h(null);
            return a2;
        }
        Bitmap a3 = this.e.get(str).a();
        d(str, bitmap);
        return a3;
    }
}