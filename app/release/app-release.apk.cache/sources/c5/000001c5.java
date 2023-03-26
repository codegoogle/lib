package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

@e2(api = 28)
@i2({i2.a.u})
/* loaded from: classes.dex */
public class CoreComponentFactory extends AppComponentFactory {

    @i2({i2.a.u})
    /* loaded from: classes.dex */
    public interface a {
        Object a();
    }

    public static <T> T a(T t) {
        T t2;
        return (!(t instanceof a) || (t2 = (T) ((a) t).a()) == null) ? t : t2;
    }

    @Override // android.app.AppComponentFactory
    @x1
    public Activity instantiateActivity(@x1 ClassLoader classLoader, @x1 String str, @z1 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Activity) a(super.instantiateActivity(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    @x1
    public Application instantiateApplication(@x1 ClassLoader classLoader, @x1 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Application) a(super.instantiateApplication(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    @x1
    public ContentProvider instantiateProvider(@x1 ClassLoader classLoader, @x1 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (ContentProvider) a(super.instantiateProvider(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    @x1
    public BroadcastReceiver instantiateReceiver(@x1 ClassLoader classLoader, @x1 String str, @z1 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (BroadcastReceiver) a(super.instantiateReceiver(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    @x1
    public Service instantiateService(@x1 ClassLoader classLoader, @x1 String str, @z1 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Service) a(super.instantiateService(classLoader, str, intent));
    }
}