package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbxv;
import com.google.android.gms.internal.ads.zzcfi;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class AdActivity extends Activity {
    @x1
    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    @z1
    private zzbxv zza;

    private final void zza() {
        zzbxv zzbxvVar = this.zza;
        if (zzbxvVar != null) {
            try {
                zzbxvVar.zzv();
            } catch (RemoteException e) {
                zzcfi.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, @x1 Intent intent) {
        try {
            zzbxv zzbxvVar = this.zza;
            if (zzbxvVar != null) {
                zzbxvVar.zzg(i, i2, intent);
            }
        } catch (Exception e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zzbxv zzbxvVar = this.zza;
            if (zzbxvVar != null) {
                if (!zzbxvVar.zzE()) {
                    return;
                }
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            zzbxv zzbxvVar2 = this.zza;
            if (zzbxvVar2 != null) {
                zzbxvVar2.zzh();
            }
        } catch (RemoteException e2) {
            zzcfi.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@x1 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbxv zzbxvVar = this.zza;
            if (zzbxvVar != null) {
                zzbxvVar.zzj(ObjectWrapper.wrap(configuration));
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(@z1 Bundle bundle) {
        super.onCreate(bundle);
        zzbxv zzn = zzaw.zza().zzn(this);
        this.zza = zzn;
        if (zzn != null) {
            try {
                zzn.zzk(bundle);
                return;
            } catch (RemoteException e) {
                zzcfi.zzl("#007 Could not call remote method.", e);
                finish();
                return;
            }
        }
        zzcfi.zzl("#007 Could not call remote method.", null);
        finish();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        try {
            zzbxv zzbxvVar = this.zza;
            if (zzbxvVar != null) {
                zzbxvVar.zzl();
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        try {
            zzbxv zzbxvVar = this.zza;
            if (zzbxvVar != null) {
                zzbxvVar.zzn();
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        try {
            zzbxv zzbxvVar = this.zza;
            if (zzbxvVar != null) {
                zzbxvVar.zzo();
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            zzbxv zzbxvVar = this.zza;
            if (zzbxvVar != null) {
                zzbxvVar.zzp();
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(@x1 Bundle bundle) {
        try {
            zzbxv zzbxvVar = this.zza;
            if (zzbxvVar != null) {
                zzbxvVar.zzq(bundle);
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        try {
            zzbxv zzbxvVar = this.zza;
            if (zzbxvVar != null) {
                zzbxvVar.zzr();
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        try {
            zzbxv zzbxvVar = this.zza;
            if (zzbxvVar != null) {
                zzbxvVar.zzs();
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbxv zzbxvVar = this.zza;
            if (zzbxvVar != null) {
                zzbxvVar.zzt();
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(@x1 View view) {
        super.setContentView(view);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(@x1 View view, @x1 ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zza();
    }
}