package com.microsoft.appcenter.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.wo1;
import java.io.Closeable;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class NetworkStateHelper implements Closeable {
    @SuppressLint({"StaticFieldLeak"})
    private static NetworkStateHelper sSharedInstance;
    private final ConnectivityManager mConnectivityManager;
    private ConnectivityManager.NetworkCallback mNetworkCallback;
    private final Set<Listener> mListeners = new CopyOnWriteArraySet();
    private final AtomicBoolean mConnected = new AtomicBoolean();

    /* loaded from: classes3.dex */
    public interface Listener {
        void onNetworkStateUpdated(boolean z);
    }

    @r2
    public NetworkStateHelper(Context context) {
        this.mConnectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        reopen();
    }

    public static synchronized NetworkStateHelper getSharedInstance(Context context) {
        NetworkStateHelper networkStateHelper;
        synchronized (NetworkStateHelper.class) {
            if (sSharedInstance == null) {
                sSharedInstance = new NetworkStateHelper(context);
            }
            networkStateHelper = sSharedInstance;
        }
        return networkStateHelper;
    }

    private boolean isAnyNetworkConnected() {
        Network[] allNetworks = this.mConnectivityManager.getAllNetworks();
        if (allNetworks == null) {
            return false;
        }
        for (Network network : allNetworks) {
            NetworkInfo networkInfo = this.mConnectivityManager.getNetworkInfo(network);
            if (networkInfo != null && networkInfo.isConnected()) {
                return true;
            }
        }
        return false;
    }

    private void notifyNetworkStateUpdated(boolean z) {
        StringBuilder G = wo1.G("Network has been ");
        G.append(z ? "connected." : "disconnected.");
        AppCenterLog.debug("AppCenter", G.toString());
        for (Listener listener : this.mListeners) {
            listener.onNetworkStateUpdated(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNetworkAvailable(Network network) {
        AppCenterLog.debug("AppCenter", "Network " + network + " is available.");
        if (this.mConnected.compareAndSet(false, true)) {
            notifyNetworkStateUpdated(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNetworkLost(Network network) {
        AppCenterLog.debug("AppCenter", "Network " + network + " is lost.");
        Network[] allNetworks = this.mConnectivityManager.getAllNetworks();
        if ((allNetworks == null || allNetworks.length == 0 || Arrays.equals(allNetworks, new Network[]{network})) && this.mConnected.compareAndSet(true, false)) {
            notifyNetworkStateUpdated(false);
        }
    }

    public static synchronized void unsetInstance() {
        synchronized (NetworkStateHelper.class) {
            sSharedInstance = null;
        }
    }

    public void addListener(Listener listener) {
        this.mListeners.add(listener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.mConnected.set(false);
        this.mConnectivityManager.unregisterNetworkCallback(this.mNetworkCallback);
    }

    public boolean isNetworkConnected() {
        return this.mConnected.get() || isAnyNetworkConnected();
    }

    public void removeListener(Listener listener) {
        this.mListeners.remove(listener);
    }

    public void reopen() {
        try {
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            builder.addCapability(12);
            this.mNetworkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.microsoft.appcenter.utils.NetworkStateHelper.1
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    NetworkStateHelper.this.onNetworkAvailable(network);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    NetworkStateHelper.this.onNetworkLost(network);
                }
            };
            this.mConnectivityManager.registerNetworkCallback(builder.build(), this.mNetworkCallback);
        } catch (RuntimeException e) {
            AppCenterLog.error("AppCenter", "Cannot access network state information.", e);
            this.mConnected.set(true);
        }
    }
}