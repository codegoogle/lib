package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.p7700g.p99005.e1;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.ep;
import com.p7700g.p99005.f1;
import com.p7700g.p99005.fk;
import com.p7700g.p99005.gh;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.jp;
import com.p7700g.p99005.m1;
import com.p7700g.p99005.o31;
import com.p7700g.p99005.oi;
import com.p7700g.p99005.pt0;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.w0;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    private static final String a = "IconCompat";
    public static final int b = -1;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    private static final float i = 0.25f;
    private static final float j = 0.6666667f;
    private static final float k = 0.9166667f;
    private static final float l = 0.010416667f;
    private static final float m = 0.020833334f;
    private static final int n = 61;
    private static final int o = 30;
    @r2
    public static final String p = "type";
    @r2
    public static final String q = "obj";
    @r2
    public static final String r = "int1";
    @r2
    public static final String s = "int2";
    @r2
    public static final String t = "tint_list";
    @r2
    public static final String u = "tint_mode";
    @r2
    public static final String v = "string1";
    public static final PorterDuff.Mode w = PorterDuff.Mode.SRC_IN;
    @i2({i2.a.LIBRARY})
    @z1
    public Parcelable A;
    @i2({i2.a.LIBRARY})
    public int B;
    @i2({i2.a.LIBRARY})
    public int C;
    @i2({i2.a.LIBRARY})
    @z1
    public ColorStateList D;
    public PorterDuff.Mode E;
    @i2({i2.a.LIBRARY})
    @z1
    public String F;
    @i2({i2.a.LIBRARY})
    @z1
    public String G;
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public int x;
    public Object y;
    @i2({i2.a.LIBRARY})
    @z1
    public byte[] z;

    @e2(23)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @z1
        public static IconCompat a(@x1 Context context, @x1 Icon icon) {
            int e = e(icon);
            if (e == 2) {
                String d = d(icon);
                try {
                    return IconCompat.y(IconCompat.C(context, d), d, c(icon));
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else if (e != 4) {
                if (e != 6) {
                    IconCompat iconCompat = new IconCompat(-1);
                    iconCompat.y = icon;
                    return iconCompat;
                }
                return IconCompat.r(f(icon));
            } else {
                return IconCompat.u(f(icon));
            }
        }

        public static IconCompat b(@x1 Object obj) {
            jp.l(obj);
            int e = e(obj);
            if (e != 2) {
                if (e != 4) {
                    if (e != 6) {
                        IconCompat iconCompat = new IconCompat(-1);
                        iconCompat.y = obj;
                        return iconCompat;
                    }
                    return IconCompat.r(f(obj));
                }
                return IconCompat.u(f(obj));
            }
            return IconCompat.y(null, d(obj), c(obj));
        }

        @m1
        @f1
        public static int c(@x1 Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        }

        @z1
        public static String d(@x1 Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }

        public static int e(@x1 Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException unused) {
                String str = "Unable to get icon type " + obj;
                return -1;
            } catch (NoSuchMethodException unused2) {
                String str2 = "Unable to get icon type " + obj;
                return -1;
            } catch (InvocationTargetException unused3) {
                String str3 = "Unable to get icon type " + obj;
                return -1;
            }
        }

        @e1
        @z1
        public static Uri f(@x1 Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }

        @e1
        public static Drawable g(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        @e1
        public static Icon h(IconCompat iconCompat, Context context) {
            Icon createWithBitmap;
            switch (iconCompat.x) {
                case -1:
                    return (Icon) iconCompat.y;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.y);
                    break;
                case 2:
                    createWithBitmap = Icon.createWithResource(iconCompat.B(), iconCompat.B);
                    break;
                case 3:
                    createWithBitmap = Icon.createWithData((byte[]) iconCompat.y, iconCompat.B, iconCompat.C);
                    break;
                case 4:
                    createWithBitmap = Icon.createWithContentUri((String) iconCompat.y);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT >= 26) {
                        createWithBitmap = b.b((Bitmap) iconCompat.y);
                        break;
                    } else {
                        createWithBitmap = Icon.createWithBitmap(IconCompat.p((Bitmap) iconCompat.y, false));
                        break;
                    }
                case 6:
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 30) {
                        createWithBitmap = d.a(iconCompat.E());
                        break;
                    } else if (context != null) {
                        InputStream F = iconCompat.F(context);
                        if (F == null) {
                            StringBuilder G = wo1.G("Cannot load adaptive icon from uri: ");
                            G.append(iconCompat.E());
                            throw new IllegalStateException(G.toString());
                        } else if (i >= 26) {
                            createWithBitmap = b.b(BitmapFactory.decodeStream(F));
                            break;
                        } else {
                            createWithBitmap = Icon.createWithBitmap(IconCompat.p(BitmapFactory.decodeStream(F), false));
                            break;
                        }
                    } else {
                        StringBuilder G2 = wo1.G("Context is required to resolve the file uri of the icon: ");
                        G2.append(iconCompat.E());
                        throw new IllegalArgumentException(G2.toString());
                    }
            }
            ColorStateList colorStateList = iconCompat.D;
            if (colorStateList != null) {
                createWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.E;
            if (mode != IconCompat.w) {
                createWithBitmap.setTintMode(mode);
            }
            return createWithBitmap;
        }
    }

    @e2(26)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        @e1
        public static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    @e2(28)
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        @e1
        public static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        @e1
        public static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        @e1
        public static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        @e1
        public static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    @e2(30)
    /* loaded from: classes.dex */
    public static class d {
        private d() {
        }

        @e1
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    @i2({i2.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface e {
    }

    @i2({i2.a.LIBRARY})
    public IconCompat() {
        this.x = -1;
        this.z = null;
        this.A = null;
        this.B = 0;
        this.C = 0;
        this.D = null;
        this.E = w;
        this.F = null;
    }

    public static Resources C(Context context, String str) {
        if (pt0.a.equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            String.format("Unable to find pkg=%s for icon", str);
            return null;
        }
    }

    private Drawable H(Context context) {
        switch (this.x) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.y);
            case 2:
                String B = B();
                if (TextUtils.isEmpty(B)) {
                    B = context.getPackageName();
                }
                try {
                    return oi.g(C(context, B), this.B, context.getTheme());
                } catch (RuntimeException unused) {
                    String.format("Unable to load resource 0x%08x from pkg=%s", Integer.valueOf(this.B), this.y);
                    break;
                }
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.y, this.B, this.C));
            case 4:
                InputStream F = F(context);
                if (F != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(F));
                }
                break;
            case 5:
                return new BitmapDrawable(context.getResources(), p((Bitmap) this.y, false));
            case 6:
                InputStream F2 = F(context);
                if (F2 != null) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        return b.a(null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(F2)));
                    }
                    return new BitmapDrawable(context.getResources(), p(BitmapFactory.decodeStream(F2), false));
                }
                break;
        }
        return null;
    }

    private static String N(int i2) {
        switch (i2) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    @z1
    public static IconCompat l(@x1 Bundle bundle) {
        int i2 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i2);
        iconCompat.B = bundle.getInt(r);
        iconCompat.C = bundle.getInt(s);
        iconCompat.G = bundle.getString(v);
        if (bundle.containsKey(t)) {
            iconCompat.D = (ColorStateList) bundle.getParcelable(t);
        }
        if (bundle.containsKey(u)) {
            iconCompat.E = PorterDuff.Mode.valueOf(bundle.getString(u));
        }
        switch (i2) {
            case -1:
            case 1:
            case 5:
                iconCompat.y = bundle.getParcelable(q);
                break;
            case 0:
            default:
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.y = bundle.getString(q);
                break;
            case 3:
                iconCompat.y = bundle.getByteArray(q);
                break;
        }
        return iconCompat;
    }

    @e2(23)
    @z1
    public static IconCompat m(@x1 Context context, @x1 Icon icon) {
        jp.l(icon);
        return a.a(context, icon);
    }

    @e2(23)
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @z1
    public static IconCompat n(@x1 Icon icon) {
        return a.b(icon);
    }

    @e2(23)
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @z1
    public static IconCompat o(@x1 Icon icon) {
        if (a.e(icon) == 2 && a.c(icon) == 0) {
            return null;
        }
        return a.b(icon);
    }

    @r2
    public static Bitmap p(Bitmap bitmap, boolean z) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * j);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f2 = min;
        float f3 = 0.5f * f2;
        float f4 = k * f3;
        if (z) {
            float f5 = l * f2;
            paint.setColor(0);
            paint.setShadowLayer(f5, 0.0f, f2 * m, 1023410176);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(sr.t);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    @x1
    public static IconCompat q(@x1 Bitmap bitmap) {
        ep.d(bitmap);
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.y = bitmap;
        return iconCompat;
    }

    @x1
    public static IconCompat r(@x1 Uri uri) {
        ep.d(uri);
        return s(uri.toString());
    }

    @x1
    public static IconCompat s(@x1 String str) {
        ep.d(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.y = str;
        return iconCompat;
    }

    @x1
    public static IconCompat t(@x1 Bitmap bitmap) {
        ep.d(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.y = bitmap;
        return iconCompat;
    }

    @x1
    public static IconCompat u(@x1 Uri uri) {
        ep.d(uri);
        return v(uri.toString());
    }

    @x1
    public static IconCompat v(@x1 String str) {
        ep.d(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.y = str;
        return iconCompat;
    }

    @x1
    public static IconCompat w(@x1 byte[] bArr, int i2, int i3) {
        ep.d(bArr);
        IconCompat iconCompat = new IconCompat(3);
        iconCompat.y = bArr;
        iconCompat.B = i2;
        iconCompat.C = i3;
        return iconCompat;
    }

    @x1
    public static IconCompat x(@x1 Context context, @f1 int i2) {
        ep.d(context);
        return y(context.getResources(), context.getPackageName(), i2);
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @x1
    public static IconCompat y(@z1 Resources resources, @x1 String str, @f1 int i2) {
        ep.d(str);
        if (i2 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.B = i2;
            if (resources != null) {
                try {
                    iconCompat.y = resources.getResourceName(i2);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.y = str;
            }
            iconCompat.G = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    @f1
    public int A() {
        int i2 = this.x;
        if (i2 != -1 || Build.VERSION.SDK_INT < 23) {
            if (i2 == 2) {
                return this.B;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        return a.c(this.y);
    }

    @x1
    public String B() {
        int i2 = this.x;
        if (i2 != -1 || Build.VERSION.SDK_INT < 23) {
            if (i2 == 2) {
                String str = this.G;
                if (str != null && !TextUtils.isEmpty(str)) {
                    return this.G;
                }
                return ((String) this.y).split(":", -1)[0];
            }
            throw new IllegalStateException("called getResPackage() on " + this);
        }
        return a.d(this.y);
    }

    public int D() {
        int i2 = this.x;
        return (i2 != -1 || Build.VERSION.SDK_INT < 23) ? i2 : a.e(this.y);
    }

    @x1
    public Uri E() {
        int i2 = this.x;
        if (i2 != -1 || Build.VERSION.SDK_INT < 23) {
            if (i2 != 4 && i2 != 6) {
                throw new IllegalStateException("called getUri() on " + this);
            }
            return Uri.parse((String) this.y);
        }
        return a.f(this.y);
    }

    @i2({i2.a.LIBRARY_GROUP})
    @z1
    public InputStream F(@x1 Context context) {
        Uri E = E();
        String scheme = E.getScheme();
        if (!"content".equals(scheme) && !o31.b.equals(scheme)) {
            try {
                return new FileInputStream(new File((String) this.y));
            } catch (FileNotFoundException unused) {
                String str = "Unable to load image from path: " + E;
                return null;
            }
        }
        try {
            return context.getContentResolver().openInputStream(E);
        } catch (Exception unused2) {
            String str2 = "Unable to load image from URI: " + E;
            return null;
        }
    }

    @z1
    public Drawable G(@x1 Context context) {
        k(context);
        if (Build.VERSION.SDK_INT >= 23) {
            return a.g(M(context), context);
        }
        Drawable H = H(context);
        if (H != null && (this.D != null || this.E != w)) {
            H.mutate();
            fk.o(H, this.D);
            fk.p(H, this.E);
        }
        return H;
    }

    @x1
    public IconCompat I(@w0 int i2) {
        return J(ColorStateList.valueOf(i2));
    }

    @x1
    public IconCompat J(@z1 ColorStateList colorStateList) {
        this.D = colorStateList;
        return this;
    }

    @x1
    public IconCompat K(@z1 PorterDuff.Mode mode) {
        this.E = mode;
        return this;
    }

    @e2(23)
    @x1
    @Deprecated
    public Icon L() {
        return M(null);
    }

    @e2(23)
    @x1
    public Icon M(@z1 Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.h(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void h() {
        this.E = PorterDuff.Mode.valueOf(this.F);
        switch (this.x) {
            case -1:
                Parcelable parcelable = this.A;
                if (parcelable != null) {
                    this.y = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.A;
                if (parcelable2 != null) {
                    this.y = parcelable2;
                    return;
                }
                byte[] bArr = this.z;
                this.y = bArr;
                this.x = 3;
                this.B = 0;
                this.C = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.z, Charset.forName("UTF-16"));
                this.y = str;
                if (this.x == 2 && this.G == null) {
                    this.G = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.y = this.z;
                return;
        }
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void i(boolean z) {
        this.F = this.E.name();
        switch (this.x) {
            case -1:
                if (!z) {
                    this.A = (Parcelable) this.y;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.y).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.z = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.A = (Parcelable) this.y;
                return;
            case 2:
                this.z = ((String) this.y).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.z = (byte[]) this.y;
                return;
            case 4:
            case 6:
                this.z = this.y.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void j(@x1 Intent intent, @z1 Drawable drawable, @x1 Context context) {
        Bitmap bitmap;
        k(context);
        int i2 = this.x;
        if (i2 == 1) {
            bitmap = (Bitmap) this.y;
            if (drawable != null) {
                bitmap = bitmap.copy(bitmap.getConfig(), true);
            }
        } else if (i2 == 2) {
            try {
                Context createPackageContext = context.createPackageContext(B(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(createPackageContext, this.B));
                    return;
                }
                Drawable i3 = gh.i(createPackageContext, this.B);
                if (i3.getIntrinsicWidth() > 0 && i3.getIntrinsicHeight() > 0) {
                    bitmap = Bitmap.createBitmap(i3.getIntrinsicWidth(), i3.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    i3.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    i3.draw(new Canvas(bitmap));
                }
                int launcherLargeIconSize = ((ActivityManager) createPackageContext.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)).getLauncherLargeIconSize();
                bitmap = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                i3.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                i3.draw(new Canvas(bitmap));
            } catch (PackageManager.NameNotFoundException e2) {
                StringBuilder G = wo1.G("Can't find package ");
                G.append(this.y);
                throw new IllegalArgumentException(G.toString(), e2);
            }
        } else if (i2 == 5) {
            bitmap = p((Bitmap) this.y, true);
        } else {
            throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
        }
        if (drawable != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new Canvas(bitmap));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void k(@x1 Context context) {
        Object obj;
        int identifier;
        if (this.x != 2 || (obj = this.y) == null) {
            return;
        }
        String str = (String) obj;
        if (str.contains(":")) {
            String str2 = str.split(":", -1)[1];
            String str3 = str2.split("/", -1)[0];
            String str4 = str2.split("/", -1)[1];
            String str5 = str.split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(str4) || this.B == (identifier = C(context, B()).getIdentifier(str4, str3, str5))) {
                return;
            }
            this.B = identifier;
        }
    }

    @x1
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        switch (this.x) {
            case -1:
                bundle.putParcelable(q, (Parcelable) this.y);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable(q, (Bitmap) this.y);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString(q, (String) this.y);
                break;
            case 3:
                bundle.putByteArray(q, (byte[]) this.y);
                break;
        }
        bundle.putInt("type", this.x);
        bundle.putInt(r, this.B);
        bundle.putInt(s, this.C);
        bundle.putString(v, this.G);
        ColorStateList colorStateList = this.D;
        if (colorStateList != null) {
            bundle.putParcelable(t, colorStateList);
        }
        PorterDuff.Mode mode = this.E;
        if (mode != w) {
            bundle.putString(u, mode.name());
        }
        return bundle;
    }

    @x1
    public String toString() {
        if (this.x == -1) {
            return String.valueOf(this.y);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(N(this.x));
        switch (this.x) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.y).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.y).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.G);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(A())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.B);
                if (this.C != 0) {
                    sb.append(" off=");
                    sb.append(this.C);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.y);
                break;
        }
        if (this.D != null) {
            sb.append(" tint=");
            sb.append(this.D);
        }
        if (this.E != w) {
            sb.append(" mode=");
            sb.append(this.E);
        }
        sb.append(")");
        return sb.toString();
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @z1
    public Bitmap z() {
        int i2 = this.x;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.y;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i2 == 1) {
            return (Bitmap) this.y;
        } else {
            if (i2 == 5) {
                return p((Bitmap) this.y, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    public IconCompat(int i2) {
        this.x = -1;
        this.z = null;
        this.A = null;
        this.B = 0;
        this.C = 0;
        this.D = null;
        this.E = w;
        this.F = null;
        this.x = i2;
    }
}