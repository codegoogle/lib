package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.os.IResultReceiver;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.x1;

@i2({i2.a.LIBRARY_GROUP_PREFIX})
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new a();
    public final boolean s;
    public final Handler t;
    public IResultReceiver u;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<ResultReceiver> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    /* loaded from: classes.dex */
    public class b extends IResultReceiver.Stub {
        public b() {
        }

        @Override // android.support.v4.os.IResultReceiver
        public void K1(int i, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.t;
            if (handler != null) {
                handler.post(new c(i, bundle));
            } else {
                resultReceiver.c(i, bundle);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final int s;
        public final Bundle t;

        public c(int i, Bundle bundle) {
            this.s = i;
            this.t = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultReceiver.this.c(this.s, this.t);
        }
    }

    public ResultReceiver(Handler handler) {
        this.s = true;
        this.t = handler;
    }

    public void c(int i, Bundle bundle) {
    }

    public void d(int i, Bundle bundle) {
        if (this.s) {
            Handler handler = this.t;
            if (handler != null) {
                handler.post(new c(i, bundle));
                return;
            } else {
                c(i, bundle);
                return;
            }
        }
        IResultReceiver iResultReceiver = this.u;
        if (iResultReceiver != null) {
            try {
                iResultReceiver.K1(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        synchronized (this) {
            if (this.u == null) {
                this.u = new b();
            }
            parcel.writeStrongBinder(this.u.asBinder());
        }
    }

    public ResultReceiver(Parcel parcel) {
        this.s = false;
        this.t = null;
        this.u = IResultReceiver.Stub.N1(parcel.readStrongBinder());
    }
}