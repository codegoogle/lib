package com.p7700g.p99005;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.anchorfree.sdk.exceptions.PartnerApiException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.List;

/* compiled from: Utils.java */
/* loaded from: classes.dex */
public class d81 {
    @x1
    public static Bitmap a(@x1 Drawable drawable) {
        Bitmap createBitmap;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        } else {
            createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    @x1
    public static gc1 b(@x1 Throwable th) {
        if (th instanceof bu0) {
            bu0 bu0Var = (bu0) th;
            return new PartnerApiException(bu0Var.g(), bu0Var.i(), bu0Var.f());
        } else if (th instanceof yt0) {
            return gc1.network(th);
        } else {
            return gc1.cast(th);
        }
    }

    @z1
    public static Drawable c(@x1 Context context) {
        try {
            return context.getPackageManager().getApplicationIcon(context.getPackageName());
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @x1
    public static String d(@x1 Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i = applicationInfo.labelRes;
        return i == 0 ? applicationInfo.nonLocalizedLabel.toString() : context.getString(i);
    }

    @x1
    public static String e(@x1 Resources resources, int i) throws IOException {
        if (i == 0) {
            return "";
        }
        InputStream openRawResource = resources.openRawResource(i);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource));
        StringBuilder sb = new StringBuilder();
        for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
            sb.append(readLine);
        }
        try {
            openRawResource.close();
        } catch (Exception unused) {
        }
        return sb.toString();
    }

    @x1
    public static File f(@x1 String str, @x1 String str2, @x1 List<String> list) throws IOException {
        File createTempFile = File.createTempFile(str, str2);
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        for (String str3 : list) {
            fileOutputStream.write(str3.getBytes(Charset.forName("UTF-8")));
            fileOutputStream.write("\n".getBytes(Charset.forName("UTF-8")));
        }
        fileOutputStream.close();
        return createTempFile;
    }
}