package com.p7700g.p99005;

import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import com.bumptech.glide.GeneratedAppGlideModule;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.p7700g.p99005.au1;
import com.p7700g.p99005.iu1;
import com.p7700g.p99005.iw1;
import com.p7700g.p99005.ku1;
import com.p7700g.p99005.lu1;
import com.p7700g.p99005.mu1;
import com.p7700g.p99005.nu1;
import com.p7700g.p99005.pt1;
import com.p7700g.p99005.pu1;
import com.p7700g.p99005.qt1;
import com.p7700g.p99005.rt1;
import com.p7700g.p99005.ru1;
import com.p7700g.p99005.su1;
import com.p7700g.p99005.tt1;
import com.p7700g.p99005.tu1;
import com.p7700g.p99005.ut1;
import com.p7700g.p99005.uu1;
import com.p7700g.p99005.vt1;
import com.p7700g.p99005.yq1;
import com.p7700g.p99005.zo1;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Glide.java */
/* loaded from: classes2.dex */
public class yo1 implements ComponentCallbacks2 {
    private static final String s = "image_manager_disk_cache";
    private static final String t = "Glide";
    @k1("Glide.class")
    private static volatile yo1 u;
    private static volatile boolean v;
    private final hp1 A;
    private final is1 B;
    private final zx1 C;
    private final nx1 D;
    private final a F;
    @z1
    @k1("this")
    private nt1 H;
    private final rr1 w;
    private final ls1 x;
    private final gt1 y;
    private final ap1 z;
    @k1("managers")
    private final List<jp1> E = new ArrayList();
    private dp1 G = dp1.NORMAL;

    /* compiled from: Glide.java */
    /* loaded from: classes2.dex */
    public interface a {
        @x1
        zy1 build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v2, types: [com.p7700g.p99005.iv1] */
    public yo1(@x1 Context context, @x1 rr1 rr1Var, @x1 gt1 gt1Var, @x1 ls1 ls1Var, @x1 is1 is1Var, @x1 zx1 zx1Var, @x1 nx1 nx1Var, int i, @x1 a aVar, @x1 Map<Class<?>, kp1<?, ?>> map, @x1 List<yy1<Object>> list, bp1 bp1Var) {
        Object obj;
        lq1 dw1Var;
        hv1 hv1Var;
        int i2;
        this.w = rr1Var;
        this.x = ls1Var;
        this.B = is1Var;
        this.y = gt1Var;
        this.C = zx1Var;
        this.D = nx1Var;
        this.F = aVar;
        Resources resources = context.getResources();
        hp1 hp1Var = new hp1();
        this.A = hp1Var;
        hp1Var.t(new mv1());
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 27) {
            hp1Var.t(new rv1());
        }
        List<ImageHeaderParser> g = hp1Var.g();
        tw1 tw1Var = new tw1(context, g, ls1Var, is1Var);
        lq1<ParcelFileDescriptor, Bitmap> h = hw1.h(ls1Var);
        ov1 ov1Var = new ov1(hp1Var.g(), resources.getDisplayMetrics(), ls1Var, is1Var);
        if (i3 >= 28 && bp1Var.b(zo1.d.class)) {
            dw1Var = new wv1();
            hv1Var = new iv1();
            obj = String.class;
        } else {
            hv1 hv1Var2 = new hv1(ov1Var);
            obj = String.class;
            dw1Var = new dw1(ov1Var, is1Var);
            hv1Var = hv1Var2;
        }
        if (i3 < 28 || !bp1Var.b(zo1.c.class)) {
            i2 = i3;
        } else {
            i2 = i3;
            hp1Var.e("Animation", InputStream.class, Drawable.class, kw1.f(g, is1Var));
            hp1Var.e("Animation", ByteBuffer.class, Drawable.class, kw1.a(g, is1Var));
        }
        pw1 pw1Var = new pw1(context);
        iu1.c cVar = new iu1.c(resources);
        iu1.d dVar = new iu1.d(resources);
        iu1.b bVar = new iu1.b(resources);
        iu1.a aVar2 = new iu1.a(resources);
        cv1 cv1Var = new cv1(is1Var);
        dx1 dx1Var = new dx1();
        gx1 gx1Var = new gx1();
        ContentResolver contentResolver = context.getContentResolver();
        hp1Var.a(ByteBuffer.class, new st1()).a(InputStream.class, new ju1(is1Var)).e(hp1.c, ByteBuffer.class, Bitmap.class, hv1Var).e(hp1.c, InputStream.class, Bitmap.class, dw1Var);
        if (ParcelFileDescriptorRewinder.c()) {
            hp1Var.e(hp1.c, ParcelFileDescriptor.class, Bitmap.class, new yv1(ov1Var));
        }
        hp1Var.e(hp1.c, ParcelFileDescriptor.class, Bitmap.class, h).e(hp1.c, AssetFileDescriptor.class, Bitmap.class, hw1.c(ls1Var)).d(Bitmap.class, Bitmap.class, lu1.a.b()).e(hp1.c, Bitmap.class, Bitmap.class, new fw1()).b(Bitmap.class, cv1Var).e(hp1.d, ByteBuffer.class, BitmapDrawable.class, new yu1(resources, hv1Var)).e(hp1.d, InputStream.class, BitmapDrawable.class, new yu1(resources, dw1Var)).e(hp1.d, ParcelFileDescriptor.class, BitmapDrawable.class, new yu1(resources, h)).b(BitmapDrawable.class, new zu1(ls1Var, cv1Var)).e("Animation", InputStream.class, vw1.class, new cx1(g, tw1Var, is1Var)).e("Animation", ByteBuffer.class, vw1.class, tw1Var).b(vw1.class, new ww1()).d(up1.class, up1.class, lu1.a.b()).e(hp1.c, up1.class, Bitmap.class, new ax1(ls1Var)).c(Uri.class, Drawable.class, pw1Var).c(Uri.class, Bitmap.class, new aw1(pw1Var, ls1Var)).u(new iw1.a()).d(File.class, ByteBuffer.class, new tt1.b()).d(File.class, InputStream.class, new vt1.e()).c(File.class, File.class, new rw1()).d(File.class, ParcelFileDescriptor.class, new vt1.b()).d(File.class, File.class, lu1.a.b()).u(new yq1.a(is1Var));
        if (ParcelFileDescriptorRewinder.c()) {
            hp1Var.u(new ParcelFileDescriptorRewinder.a());
        }
        Class cls = Integer.TYPE;
        Object obj2 = obj;
        hp1Var.d(cls, InputStream.class, cVar).d(cls, ParcelFileDescriptor.class, bVar).d(Integer.class, InputStream.class, cVar).d(Integer.class, ParcelFileDescriptor.class, bVar).d(Integer.class, Uri.class, dVar).d(cls, AssetFileDescriptor.class, aVar2).d(Integer.class, AssetFileDescriptor.class, aVar2).d(cls, Uri.class, dVar).d(obj2, InputStream.class, new ut1.c()).d(Uri.class, InputStream.class, new ut1.c()).d(obj2, InputStream.class, new ku1.c()).d(obj2, ParcelFileDescriptor.class, new ku1.b()).d(obj2, AssetFileDescriptor.class, new ku1.a()).d(Uri.class, InputStream.class, new qt1.c(context.getAssets())).d(Uri.class, AssetFileDescriptor.class, new qt1.b(context.getAssets())).d(Uri.class, InputStream.class, new ru1.a(context)).d(Uri.class, InputStream.class, new su1.a(context));
        int i4 = i2;
        if (i4 >= 29) {
            hp1Var.d(Uri.class, InputStream.class, new tu1.c(context));
            hp1Var.d(Uri.class, ParcelFileDescriptor.class, new tu1.b(context));
        }
        hp1Var.d(Uri.class, InputStream.class, new mu1.d(contentResolver)).d(Uri.class, ParcelFileDescriptor.class, new mu1.b(contentResolver)).d(Uri.class, AssetFileDescriptor.class, new mu1.a(contentResolver)).d(Uri.class, InputStream.class, new nu1.a()).d(URL.class, InputStream.class, new uu1.a()).d(Uri.class, File.class, new au1.a(context)).d(wt1.class, InputStream.class, new pu1.a()).d(byte[].class, ByteBuffer.class, new rt1.a()).d(byte[].class, InputStream.class, new rt1.d()).d(Uri.class, Uri.class, lu1.a.b()).d(Drawable.class, Drawable.class, lu1.a.b()).c(Drawable.class, Drawable.class, new qw1()).x(Bitmap.class, BitmapDrawable.class, new ex1(resources)).x(Bitmap.class, byte[].class, dx1Var).x(Drawable.class, byte[].class, new fx1(ls1Var, dx1Var, gx1Var)).x(vw1.class, byte[].class, gx1Var);
        if (i4 >= 23) {
            lq1<ByteBuffer, Bitmap> d = hw1.d(ls1Var);
            hp1Var.c(ByteBuffer.class, Bitmap.class, d);
            hp1Var.c(ByteBuffer.class, BitmapDrawable.class, new yu1(resources, d));
        }
        this.z = new ap1(context, is1Var, hp1Var, new nz1(), aVar, map, list, rr1Var, bp1Var, i);
    }

    @x1
    public static jp1 C(@x1 Activity activity) {
        return p(activity).j(activity);
    }

    @x1
    @Deprecated
    public static jp1 D(@x1 Fragment fragment) {
        return p(fragment.getActivity()).k(fragment);
    }

    @x1
    public static jp1 E(@x1 Context context) {
        return p(context).l(context);
    }

    @x1
    public static jp1 F(@x1 View view) {
        return p(view.getContext()).m(view);
    }

    @x1
    public static jp1 G(@x1 androidx.fragment.app.Fragment fragment) {
        return p(fragment.getContext()).n(fragment);
    }

    @x1
    public static jp1 H(@x1 hx hxVar) {
        return p(hxVar).o(hxVar);
    }

    @k1("Glide.class")
    private static void a(@x1 Context context, @z1 GeneratedAppGlideModule generatedAppGlideModule) {
        if (!v) {
            v = true;
            s(context, generatedAppGlideModule);
            v = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    @r2
    public static void d() {
        uv1.d().l();
    }

    @x1
    public static yo1 e(@x1 Context context) {
        if (u == null) {
            GeneratedAppGlideModule f = f(context.getApplicationContext());
            synchronized (yo1.class) {
                if (u == null) {
                    a(context, f);
                }
            }
        }
        return u;
    }

    @z1
    private static GeneratedAppGlideModule f(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            Log.isLoggable(t, 5);
            return null;
        } catch (IllegalAccessException e) {
            z(e);
            return null;
        } catch (InstantiationException e2) {
            z(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            z(e3);
            return null;
        } catch (InvocationTargetException e4) {
            z(e4);
            return null;
        }
    }

    @z1
    public static File l(@x1 Context context) {
        return m(context, "image_manager_disk_cache");
    }

    @z1
    public static File m(@x1 Context context, @x1 String str) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            File file = new File(cacheDir, str);
            if (file.isDirectory() || file.mkdirs()) {
                return file;
            }
            return null;
        }
        Log.isLoggable(t, 6);
        return null;
    }

    @x1
    private static zx1 p(@z1 Context context) {
        x02.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return e(context).o();
    }

    @r2
    public static void q(@x1 Context context, @x1 zo1 zo1Var) {
        GeneratedAppGlideModule f = f(context);
        synchronized (yo1.class) {
            if (u != null) {
                y();
            }
            t(context, zo1Var, f);
        }
    }

    @r2
    @Deprecated
    public static synchronized void r(yo1 yo1Var) {
        synchronized (yo1.class) {
            if (u != null) {
                y();
            }
            u = yo1Var;
        }
    }

    @k1("Glide.class")
    private static void s(@x1 Context context, @z1 GeneratedAppGlideModule generatedAppGlideModule) {
        t(context, new zo1(), generatedAppGlideModule);
    }

    @k1("Glide.class")
    private static void t(@x1 Context context, @x1 zo1 zo1Var, @z1 GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<hy1> emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            emptyList = new jy1(applicationContext).a();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            Set<Class<?>> d = generatedAppGlideModule.d();
            Iterator<hy1> it = emptyList.iterator();
            while (it.hasNext()) {
                hy1 next = it.next();
                if (d.contains(next.getClass())) {
                    if (Log.isLoggable(t, 3)) {
                        String str = "AppGlideModule excludes manifest GlideModule: " + next;
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable(t, 3)) {
            for (hy1 hy1Var : emptyList) {
                StringBuilder G = wo1.G("Discovered GlideModule from manifest: ");
                G.append(hy1Var.getClass());
                G.toString();
            }
        }
        zo1Var.u(generatedAppGlideModule != null ? generatedAppGlideModule.e() : null);
        for (hy1 hy1Var2 : emptyList) {
            hy1Var2.a(applicationContext, zo1Var);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.a(applicationContext, zo1Var);
        }
        yo1 b = zo1Var.b(applicationContext);
        for (hy1 hy1Var3 : emptyList) {
            try {
                hy1Var3.b(applicationContext, b, b.A);
            } catch (AbstractMethodError e) {
                StringBuilder G2 = wo1.G("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ");
                G2.append(hy1Var3.getClass().getName());
                throw new IllegalStateException(G2.toString(), e);
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, b, b.A);
        }
        applicationContext.registerComponentCallbacks(b);
        u = b;
    }

    @r2
    public static void y() {
        synchronized (yo1.class) {
            if (u != null) {
                u.j().getApplicationContext().unregisterComponentCallbacks(u);
                u.w.m();
            }
            u = null;
        }
    }

    private static void z(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public void A(int i) {
        z02.b();
        synchronized (this.E) {
            for (jp1 jp1Var : this.E) {
                jp1Var.onTrimMemory(i);
            }
        }
        this.y.c(i);
        this.x.c(i);
        this.B.c(i);
    }

    public void B(jp1 jp1Var) {
        synchronized (this.E) {
            if (this.E.contains(jp1Var)) {
                this.E.remove(jp1Var);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    public void b() {
        z02.a();
        this.w.e();
    }

    public void c() {
        z02.b();
        this.y.d();
        this.x.d();
        this.B.d();
    }

    @x1
    public is1 g() {
        return this.B;
    }

    @x1
    public ls1 h() {
        return this.x;
    }

    public nx1 i() {
        return this.D;
    }

    @x1
    public Context j() {
        return this.z.getBaseContext();
    }

    @x1
    public ap1 k() {
        return this.z;
    }

    @x1
    public hp1 n() {
        return this.A;
    }

    @x1
    public zx1 o() {
        return this.C;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        c();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        A(i);
    }

    public synchronized void u(@x1 pt1.a... aVarArr) {
        if (this.H == null) {
            this.H = new nt1(this.y, this.x, (bq1) this.F.build().X().c(ov1.b));
        }
        this.H.c(aVarArr);
    }

    public void v(jp1 jp1Var) {
        synchronized (this.E) {
            if (!this.E.contains(jp1Var)) {
                this.E.add(jp1Var);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    public boolean w(@x1 sz1<?> sz1Var) {
        synchronized (this.E) {
            for (jp1 jp1Var : this.E) {
                if (jp1Var.Z(sz1Var)) {
                    return true;
                }
            }
            return false;
        }
    }

    @x1
    public dp1 x(@x1 dp1 dp1Var) {
        z02.b();
        this.y.e(dp1Var.f());
        this.x.e(dp1Var.f());
        dp1 dp1Var2 = this.G;
        this.G = dp1Var;
        return dp1Var2;
    }
}