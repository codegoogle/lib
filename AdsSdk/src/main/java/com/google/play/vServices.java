package com.google.play;

import static com.microsoft.appcenter.utils.HandlerUtils.runOnUiThread;

import android.app.Activity;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import com.anchorfree.partner.api.auth.AuthMethod;
import com.anchorfree.partner.api.response.User;
import com.anchorfree.reporting.TrackingConstants;
import com.anchorfree.sdk.SessionConfig;
import com.anchorfree.sdk.UnifiedSDK;
import com.anchorfree.sdk.rules.TrafficRule;
import com.anchorfree.vpnsdk.callbacks.Callback;
import com.anchorfree.vpnsdk.callbacks.CompletableCallback;
import com.anchorfree.vpnsdk.exceptions.VpnException;
import com.anchorfree.vpnsdk.vpnservice.VPNState;
import com.google.play.Utils.utils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class vServices extends Service {

    private String TAG = "vServices";
    private static ConnectVpage connectVpage;
    public static Activity activity;
    public static boolean isconnectedVpage = false;
    public static String SERVICES_START = "SERVICES_START";
    public static String SERVICES_END = "SERVICES_END";


    public static void vServicesAct(Activity mactivity, ConnectVpage mconnectVpage) {
        activity = mactivity;
        connectVpage = mconnectVpage;
    }

    public interface ConnectVpage {
        public void vpageConnected(boolean isconnect);
    }


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public Handler handler = null;
    public static Runnable runnable = null;


    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        if (intent != null) {
            if (!intent.getAction().isEmpty()) {
                if (intent.getAction().equals(SERVICES_START)) {

                    activity.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            UnifiedSDK.getVpnState(new Callback<VPNState>() {
                                @Override
                                public void success(@NonNull VPNState vpnState) {
                                    if (vpnState == VPNState.IDLE) {
                                        MyApp.getMyAppInstance().initHydraSdk(new MyApp.VpnInit() {
                                            @Override
                                            public void init() {
                                                loginToVpn();
                                            }
                                        });
                                    }
                                }

                                @Override
                                public void failure(@NonNull VpnException e) {
                                    isconnectedVpage = false;
                                    connectVpage.vpageConnected(false);
                                }
                            });
                        }
                    });
                } else if (intent.getAction().equals(SERVICES_END)) {
                    new Thread() {
                        public void run() {

                            try {
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        UnifiedSDK.getVpnState(new Callback<VPNState>() {
                                            @Override
                                            public void success(@NonNull VPNState vpnState) {
                                                if (vpnState == VPNState.CONNECTED) {
                                                    UnifiedSDK.getInstance().getVPN().stop(TrackingConstants.GprReasons.M_UI, new CompletableCallback() {
                                                        @Override
                                                        public void complete() {
                                                            isconnectedVpage = false;
                                                        }

                                                        @Override
                                                        public void error(@NonNull VpnException e) {
                                                            Log.d(TAG, "SERVICES_END  error:-->  " + e.getMessage());
                                                            e.printStackTrace();
                                                        }
                                                    });

                                                }
                                            }

                                            @Override
                                            public void failure(@NonNull VpnException e) {
                                                Log.d(TAG, "SERVICES_END : " + e);
                                            }
                                        });
                                    }
                                });
                                Thread.sleep(300);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                        }

                    }.start();

                }
            }

        }
        return START_NOT_STICKY;
    }

    protected void isLoggedIn(Callback<Boolean> callback) {
        UnifiedSDK.getInstance().getBackend().isLoggedIn(callback);
    }

    protected void loginToVpn() {
        AuthMethod authMethod = AuthMethod.anonymous();
        UnifiedSDK.getInstance().getBackend().login(authMethod, new Callback<User>() {
            @Override
            public void success(@NonNull User user) {
                Log.d(TAG, "loginToVpn success --> ");
                connectToVpn();
            }

            @Override
            public void failure(@NonNull VpnException e) {
                isconnectedVpage = false;
                connectVpage.vpageConnected(false);
                Log.d(TAG, "loginToVpn failure --> " + e.getMessage());
            }
        });
    }

    public void connectToVpn() {

        Log.d(TAG, "vServices connectToVpn --> ");

        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {

                isLoggedIn(new Callback<Boolean>() {
                    @Override
                    public void success(@NonNull Boolean aBoolean) {
                        Log.d(TAG, "vServices connectToVpn success aBoolean --> " + aBoolean);

                        if (aBoolean) {
                            connect();
                        } else {
                            Log.d(TAG, "vServices connectToVpn false --> ");
                            isconnectedVpage = false;
                            connectVpage.vpageConnected(false);
                        }
                    }

                    @Override
                    public void failure(@NonNull VpnException e) {
                        Log.d(TAG, "vServices connectToVpn failure --> " + e.getMessage());
                        isconnectedVpage = false;
                        connectVpage.vpageConnected(false);

                    }
                });
            }
        });

    }

    public void connect() {

        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                List<String> fallbackOrder = new ArrayList<>();
                fallbackOrder.add("hydra");
                fallbackOrder.add("openvpn_tcp");
                fallbackOrder.add("openvpn_udp");
                List<String> bypassDomains = new LinkedList<>();
                bypassDomains.add("*facebook.com");
                bypassDomains.add("*wtfismyip.com");
                bypassDomains.add("*whatismyipaddress.com");
                bypassDomains.add("*ip-api.com");

                String country = utils.get_vpn_country();

                UnifiedSDK.getInstance().getVPN().start(new SessionConfig.Builder()
                        .withReason(TrackingConstants.GprReasons.M_UI)
                        .withTransportFallback(fallbackOrder)
                        .withVirtualLocation(country)
                        .withTransport("hydra")
                        .addDnsRule(TrafficRule.Builder.bypass().fromDomains(bypassDomains))
                        .build(), new CompletableCallback() {
                    @Override
                    public void complete() {
                        Log.d(TAG, "vServices connectToVpn complete --> ");
                        isconnectedVpage = true;
                        connectVpage.vpageConnected(true);
                    }

                    @Override
                    public void error(@NonNull VpnException e) {
                        Log.d(TAG, "vServices connectToVpn error --> " + e.getMessage());
                        isconnectedVpage = false;
                        connectVpage.vpageConnected(false);
                    }
                });
            }
        });
    }



    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onTaskRemoved(Intent rootIntent) {
        Intent intent = new Intent(getApplicationContext(), vServices.class);
        intent.setAction(vServices.SERVICES_END);
        startForegroundService(intent);
        super.onTaskRemoved(rootIntent);
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
