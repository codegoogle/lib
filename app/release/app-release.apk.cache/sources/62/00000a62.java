package com.anythink.expressad.video.module.a.a;

import android.os.Handler;
import com.anythink.expressad.video.module.AnythinkContainerView;
import com.anythink.expressad.video.module.AnythinkVideoView;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public final class m extends o {
    public static final long af = 3000;
    private AnythinkVideoView ah;
    private AnythinkContainerView ai;
    private int aj;
    private Timer ak;
    private Handler al;
    private boolean am;
    private boolean an;
    private int ao;
    private int ap;

    /* renamed from: com.anythink.expressad.video.module.a.a.m$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 extends TimerTask {
        public AnonymousClass1() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            try {
                m.this.al.post(new Runnable() { // from class: com.anythink.expressad.video.module.a.a.m.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.this.ai.showVideoClickView(-1);
                        m.this.ah.soundOperate(0, 2);
                    }
                });
            } catch (Throwable th) {
                if (com.anythink.expressad.a.a) {
                    th.printStackTrace();
                }
            }
        }
    }

    public m(AnythinkVideoView anythinkVideoView, AnythinkContainerView anythinkContainerView, com.anythink.expressad.foundation.d.c cVar, com.anythink.expressad.videocommon.c.c cVar2, com.anythink.expressad.videocommon.b.a aVar, String str, String str2, int i, int i2, com.anythink.expressad.video.module.a.a aVar2, int i3, boolean z, int i4) {
        super(cVar, cVar2, aVar, str, str2, aVar2, i3, z);
        this.al = new Handler();
        this.am = false;
        this.an = false;
        this.ao = 1;
        this.ah = anythinkVideoView;
        this.ai = anythinkContainerView;
        this.ap = i;
        this.aj = i2;
        this.ao = i4;
        if (anythinkVideoView != null) {
            this.am = anythinkVideoView.getVideoSkipTime() == 0;
        }
        if (anythinkVideoView == null || anythinkContainerView == null) {
            this.W = false;
        }
    }

    private void h() {
        try {
            Timer timer = this.ak;
            if (timer != null) {
                timer.cancel();
                this.ak = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void i() {
        try {
            h();
            this.ak = new Timer();
            this.ak.schedule(new AnonymousClass1(), af);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.module.a.a.o, com.anythink.expressad.video.module.a.a.k, com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
    public final void a(int i, Object obj) {
        Integer num;
        int i2;
        if (this.W) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 8) {
                                switch (i) {
                                    case 10:
                                        this.an = true;
                                        this.ah.soundOperate(0, 2);
                                        this.ah.progressOperate(0, 2);
                                        break;
                                    case 11:
                                        this.ah.videoOperate(3);
                                        this.ah.dismissAllAlert();
                                        if (this.X.D() != 3) {
                                            if (this.X.f() != 2) {
                                                this.ah.setVisibility(8);
                                            }
                                        } else {
                                            this.ah.setVisibility(0);
                                        }
                                        if (this.X.f() == 2) {
                                            this.ai.showVideoEndCover();
                                            break;
                                        } else {
                                            this.ai.showEndcard(this.X.D());
                                            break;
                                        }
                                    case 12:
                                        f();
                                        this.ah.videoOperate(3);
                                        this.ah.dismissAllAlert();
                                        if (this.X.D() != 3) {
                                            this.ah.setVisibility(8);
                                        } else {
                                            this.ah.setVisibility(0);
                                        }
                                        boolean z = this.an;
                                        if (z || this.ao != 0) {
                                            if (!z && this.ao == 1) {
                                                e();
                                                d();
                                                c();
                                            }
                                            if (this.X.f() != 2) {
                                                this.ai.showEndcard(this.X.D());
                                                break;
                                            } else {
                                                this.ai.showVideoEndCover();
                                                break;
                                            }
                                        }
                                        break;
                                    case 13:
                                        this.ah.closeVideoOperate(0, 2);
                                        break;
                                    case 14:
                                        if (!this.am) {
                                            this.ah.closeVideoOperate(0, 1);
                                            break;
                                        }
                                        break;
                                    case 15:
                                        if (obj != null && (obj instanceof AnythinkVideoView.a)) {
                                            AnythinkVideoView.a aVar = (AnythinkVideoView.a) obj;
                                            int videoInteractiveType = this.ai.getVideoInteractiveType();
                                            if (this.X.f() == 2) {
                                                this.ai.showVideoClickView(1);
                                            } else if (videoInteractiveType >= 0 && aVar.a >= videoInteractiveType) {
                                                this.ai.showVideoClickView(1);
                                                this.ah.soundOperate(0, 1);
                                            }
                                            this.am = aVar.c;
                                            int i3 = this.aj;
                                            if (((i3 >= 0 && ((i2 = aVar.a) >= i3 || i2 == aVar.b)) || (this.X.i() > 0 && (aVar.a > this.X.i() || aVar.a == aVar.b))) && !this.am) {
                                                this.ah.closeVideoOperate(0, 2);
                                                this.am = true;
                                                break;
                                            }
                                        }
                                        break;
                                }
                            } else {
                                AnythinkContainerView anythinkContainerView = this.ai;
                                if (anythinkContainerView != null) {
                                    if (!anythinkContainerView.showAlertWebView()) {
                                        AnythinkVideoView anythinkVideoView = this.ah;
                                        if (anythinkVideoView != null) {
                                            anythinkVideoView.showAlertView();
                                        }
                                    } else {
                                        AnythinkVideoView anythinkVideoView2 = this.ah;
                                        if (anythinkVideoView2 != null) {
                                            anythinkVideoView2.alertWebViewShowed();
                                        }
                                    }
                                } else {
                                    AnythinkVideoView anythinkVideoView3 = this.ah;
                                    if (anythinkVideoView3 != null) {
                                        anythinkVideoView3.showAlertView();
                                    }
                                }
                            }
                        }
                    } else if (obj != null && (obj instanceof Integer)) {
                        if (((Integer) obj).intValue() == 1) {
                            num = 2;
                        } else {
                            num = 1;
                        }
                        this.ah.soundOperate(num.intValue(), -1);
                    }
                }
                this.ah.dismissAllAlert();
                this.ah.videoOperate(3);
                if (this.ap != 2 || this.ai.endCardShowing() || this.X.f() == 2) {
                    i = 16;
                } else {
                    this.ai.showEndcard(this.X.D());
                }
            } else if (!this.ai.endCardShowing()) {
                int videoInteractiveType2 = this.ai.getVideoInteractiveType();
                if (videoInteractiveType2 != -2) {
                    if (videoInteractiveType2 == -1) {
                        if (this.ai.isLast()) {
                            this.ai.showVideoClickView(1);
                            this.ah.soundOperate(0, 1);
                            try {
                                h();
                                this.ak = new Timer();
                                this.ak.schedule(new AnonymousClass1(), af);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } else {
                            this.ai.showVideoClickView(-1);
                            this.ah.soundOperate(0, 2);
                            h();
                        }
                    }
                } else if (this.ai.miniCardLoaded()) {
                    this.ai.showVideoClickView(2);
                }
            }
        }
        super.a(i, obj);
    }
}