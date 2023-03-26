package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.n40;
import com.p7700g.p99005.o40;
import com.p7700g.p99005.z1;
import java.util.HashMap;

@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {
    public int s = 0;
    public final HashMap<Integer, String> t = new HashMap<>();
    public final RemoteCallbackList<n40> u = new a();
    private final o40.a v = new b();

    /* loaded from: classes.dex */
    public class a extends RemoteCallbackList<n40> {
        public a() {
        }

        @Override // android.os.RemoteCallbackList
        /* renamed from: a */
        public void onCallbackDied(n40 n40Var, Object obj) {
            MultiInstanceInvalidationService.this.t.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* loaded from: classes.dex */
    public class b extends o40.a {
        public b() {
        }

        @Override // com.p7700g.p99005.o40
        public void E1(n40 n40Var, int i) {
            synchronized (MultiInstanceInvalidationService.this.u) {
                MultiInstanceInvalidationService.this.u.unregister(n40Var);
                MultiInstanceInvalidationService.this.t.remove(Integer.valueOf(i));
            }
        }

        @Override // com.p7700g.p99005.o40
        public int Z(n40 n40Var, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.u) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.s + 1;
                multiInstanceInvalidationService.s = i;
                if (multiInstanceInvalidationService.u.register(n40Var, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.t.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.s--;
                return 0;
            }
        }

        @Override // com.p7700g.p99005.o40
        public void y1(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.u) {
                String str = MultiInstanceInvalidationService.this.t.get(Integer.valueOf(i));
                if (str == null) {
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.u.beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    int intValue = ((Integer) MultiInstanceInvalidationService.this.u.getBroadcastCookie(i2)).intValue();
                    String str2 = MultiInstanceInvalidationService.this.t.get(Integer.valueOf(intValue));
                    if (i != intValue && str.equals(str2)) {
                        try {
                            MultiInstanceInvalidationService.this.u.getBroadcastItem(i2).Q(strArr);
                        } catch (RemoteException unused) {
                        }
                    }
                }
                MultiInstanceInvalidationService.this.u.finishBroadcast();
            }
        }
    }

    @Override // android.app.Service
    @z1
    public IBinder onBind(Intent intent) {
        return this.v;
    }
}