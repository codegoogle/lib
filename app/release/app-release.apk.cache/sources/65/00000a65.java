package com.anythink.expressad.video.module.a.a;

import com.anythink.expressad.video.module.AnythinkVideoView;
import com.anythink.expressad.video.signal.factory.IJSFactory;

/* loaded from: classes2.dex */
public final class n extends o {
    private IJSFactory af;
    private int ah;
    private boolean ai;
    private int aj;
    private boolean ak;

    public n(IJSFactory iJSFactory, com.anythink.expressad.foundation.d.c cVar, com.anythink.expressad.videocommon.c.c cVar2, com.anythink.expressad.videocommon.b.a aVar, String str, String str2, int i, int i2, com.anythink.expressad.video.module.a.a aVar2, int i3, boolean z, int i4) {
        super(cVar, cVar2, aVar, str, str2, aVar2, i3, z);
        this.ai = false;
        this.ak = false;
        this.af = iJSFactory;
        this.ah = i;
        this.ai = i2 == 0;
        this.aj = i4;
        if (iJSFactory == null) {
            this.W = false;
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
                                if (i != 114) {
                                    if (i != 116) {
                                        switch (i) {
                                            case 10:
                                                this.ak = true;
                                                this.af.getJSNotifyProxy().a(0);
                                                break;
                                            case 11:
                                            case 12:
                                                this.af.getJSVideoModule().videoOperate(3);
                                                if (this.X.D() != 3) {
                                                    if (this.X.f() != 2) {
                                                        this.af.getJSVideoModule().setVisible(8);
                                                    }
                                                } else {
                                                    this.af.getJSVideoModule().setVisible(0);
                                                }
                                                if (i == 12) {
                                                    f();
                                                    i2 = 2;
                                                } else {
                                                    i2 = 1;
                                                }
                                                this.af.getJSNotifyProxy().a(i2);
                                                if (this.af.getJSCommon().m() == 2) {
                                                    this.af.getJSVideoModule().setVisible(0);
                                                    com.anythink.expressad.video.signal.j jSVideoModule = this.af.getJSVideoModule();
                                                    this.af.getJSContainerModule().showMiniCard(jSVideoModule.getBorderViewTop(), jSVideoModule.getBorderViewLeft(), jSVideoModule.getBorderViewWidth(), jSVideoModule.getBorderViewHeight(), jSVideoModule.getBorderViewRadius());
                                                } else if (i == 12) {
                                                    if (this.aj == 1) {
                                                        if (this.X.f() != 2) {
                                                            this.af.getJSContainerModule().showEndcard(this.X.D());
                                                        } else {
                                                            this.af.getJSContainerModule().showVideoEndCover();
                                                        }
                                                    }
                                                } else if (this.X.f() != 2) {
                                                    this.af.getJSContainerModule().showEndcard(this.X.D());
                                                } else {
                                                    this.af.getJSContainerModule().showVideoEndCover();
                                                }
                                                this.af.getJSVideoModule().dismissAllAlert();
                                                if (i == 12 && !this.ak && this.aj == 1) {
                                                    f();
                                                    e();
                                                    d();
                                                    c();
                                                    break;
                                                }
                                                break;
                                            case 13:
                                                if (!this.af.getJSVideoModule().isH5Canvas()) {
                                                    this.af.getJSVideoModule().closeVideoOperate(0, 2);
                                                }
                                                this.af.getJSNotifyProxy().a(-1);
                                                break;
                                            case 14:
                                                if (!this.ai) {
                                                    this.af.getJSVideoModule().closeVideoOperate(0, 1);
                                                    break;
                                                }
                                                break;
                                            case 15:
                                                if (obj != null && (obj instanceof AnythinkVideoView.a)) {
                                                    this.ai = true;
                                                    this.af.getJSNotifyProxy().a((AnythinkVideoView.a) obj);
                                                    break;
                                                }
                                                break;
                                            default:
                                                switch (i) {
                                                    case 123:
                                                    case 124:
                                                        this.af.getJSNotifyProxy().a(i == 123 ? 7 : 6, "");
                                                        break;
                                                    case 125:
                                                        this.af.getJSContainerModule().hideAlertWebview();
                                                        break;
                                                }
                                        }
                                    } else {
                                        com.anythink.expressad.video.signal.j jSVideoModule2 = this.af.getJSVideoModule();
                                        this.af.getJSContainerModule().configurationChanged(jSVideoModule2.getBorderViewWidth(), jSVideoModule2.getBorderViewHeight(), jSVideoModule2.getBorderViewRadius());
                                    }
                                } else if (this.af.getJSCommon().m() == 2) {
                                    com.anythink.expressad.video.signal.j jSVideoModule3 = this.af.getJSVideoModule();
                                    this.af.getJSContainerModule().showMiniCard(jSVideoModule3.getBorderViewTop(), jSVideoModule3.getBorderViewLeft(), jSVideoModule3.getBorderViewWidth(), jSVideoModule3.getBorderViewHeight(), jSVideoModule3.getBorderViewRadius());
                                }
                            } else if (!this.af.getJSContainerModule().showAlertWebView()) {
                                this.af.getJSVideoModule().showAlertView();
                            } else {
                                this.af.getJSVideoModule().alertWebViewShowed();
                            }
                        }
                    } else if (obj != null && (obj instanceof Integer)) {
                        if (((Integer) obj).intValue() == 1) {
                            num = 2;
                        } else {
                            num = 1;
                        }
                        this.af.getJSVideoModule().soundOperate(num.intValue(), -1);
                        this.af.getJSNotifyProxy().a(5, String.valueOf(num));
                    }
                }
                this.af.getJSVideoModule().dismissAllAlert();
                if (i == 2) {
                    this.af.getJSNotifyProxy().a(2, "");
                }
                this.af.getJSVideoModule().videoOperate(3);
                if (this.af.getJSCommon().m() != 2) {
                    if (this.X.D() != 3) {
                        this.af.getJSVideoModule().setVisible(8);
                    } else {
                        this.af.getJSVideoModule().setVisible(0);
                    }
                    if (this.ah == 2 && !this.af.getJSContainerModule().endCardShowing() && this.X.f() != 2) {
                        this.af.getJSContainerModule().showEndcard(this.X.D());
                        this.af.getJSNotifyProxy().a(1);
                    }
                }
                i = 16;
                this.af.getJSNotifyProxy().a(1);
            } else if (!this.af.getJSContainerModule().endCardShowing()) {
                this.af.getJSNotifyProxy().a(1, "");
            }
        }
        super.a(i, obj);
    }
}