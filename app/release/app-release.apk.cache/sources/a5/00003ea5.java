package com.p7700g.p99005;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import com.p7700g.p99005.zg3;

/* compiled from: Res.java */
/* loaded from: classes3.dex */
public class dh3 extends Resources {
    private String a;

    public dh3(Resources original) {
        super(original.getAssets(), original.getDisplayMetrics(), original.getConfiguration());
        this.a = "Res";
    }

    public int a(int id, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 23) {
            return super.getColor(id, theme);
        }
        return super.getColor(id);
    }

    @Override // android.content.res.Resources
    public int getColor(int id) throws Resources.NotFoundException {
        return getColor(id, null);
    }

    @Override // android.content.res.Resources
    public float getDimension(int id) throws Resources.NotFoundException {
        float f;
        int parseInt;
        String resourceEntryName = getResourceEntryName(id);
        resourceEntryName.hashCode();
        char c = 65535;
        switch (resourceEntryName.hashCode()) {
            case -1808538072:
                if (resourceEntryName.equals("ads_btn_border_height")) {
                    c = 0;
                    break;
                }
                break;
            case -1226458876:
                if (resourceEntryName.equals("ads_btn_2_height_bottom")) {
                    c = 1;
                    break;
                }
                break;
            case 319600924:
                if (resourceEntryName.equals("ads_btn_2_height_top")) {
                    c = 2;
                    break;
                }
                break;
            case 611123033:
                if (resourceEntryName.equals("ads_btn_height")) {
                    c = 3;
                    break;
                }
                break;
            case 893573828:
                if (resourceEntryName.equals("ads_btn_radius")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (yg3.e(bh3.a0).equals("")) {
                    return super.getDimension(id);
                }
                f = getDisplayMetrics().density;
                parseInt = Integer.parseInt(yg3.e(bh3.a0));
                break;
            case 1:
                if (!yg3.e(bh3.I0).equals("")) {
                    f = getDisplayMetrics().density;
                    parseInt = Integer.parseInt(yg3.e(bh3.I0));
                    break;
                } else if (yg3.e(bh3.G0).equals("1")) {
                    return super.getDimension(zg3.c.j);
                } else {
                    return super.getDimension(zg3.c.l);
                }
            case 2:
                if (!yg3.e(bh3.H0).equals("")) {
                    f = getDisplayMetrics().density;
                    parseInt = Integer.parseInt(yg3.e(bh3.H0));
                    break;
                } else if (yg3.e(bh3.F0).equals("1")) {
                    return super.getDimension(zg3.c.j);
                } else {
                    return super.getDimension(zg3.c.l);
                }
            case 3:
                if (yg3.e(bh3.Z).equals("")) {
                    return super.getDimension(id);
                }
                f = getDisplayMetrics().density;
                parseInt = Integer.parseInt(yg3.e(bh3.Z));
                break;
            case 4:
                if (yg3.e(bh3.b0).equals("")) {
                    return super.getDimension(id);
                }
                f = getDisplayMetrics().density;
                parseInt = Integer.parseInt(yg3.e(bh3.b0));
                break;
            default:
                return super.getDimension(id);
        }
        return (parseInt * f) + 0.5f;
    }

    @Override // android.content.res.Resources
    public int getColor(int id, Resources.Theme theme) throws Resources.NotFoundException {
        String resourceEntryName = getResourceEntryName(id);
        resourceEntryName.hashCode();
        char c = 65535;
        switch (resourceEntryName.hashCode()) {
            case -1101590243:
                if (resourceEntryName.equals("ads_btn_color_border_start")) {
                    c = 0;
                    break;
                }
                break;
            case -1099232627:
                if (resourceEntryName.equals("ads_btn_color_end")) {
                    c = 1;
                    break;
                }
                break;
            case -698365866:
                if (resourceEntryName.equals("ads_btn_color_border_end")) {
                    c = 2;
                    break;
                }
                break;
            case 212509076:
                if (resourceEntryName.equals("ads_btn_color_start")) {
                    c = 3;
                    break;
                }
                break;
            case 283965883:
                if (resourceEntryName.equals("ads_btn_color_text")) {
                    c = 4;
                    break;
                }
                break;
            case 794487692:
                if (resourceEntryName.equals("ad_text_primary")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (yg3.e(bh3.T).equals("")) {
                    return a(id, theme);
                }
                return Color.parseColor(yg3.e(bh3.T));
            case 1:
                if (yg3.e(bh3.S).equals("")) {
                    return a(id, theme);
                }
                return Color.parseColor(yg3.e(bh3.S));
            case 2:
                if (yg3.e(bh3.U).equals("")) {
                    return a(id, theme);
                }
                return Color.parseColor(yg3.e(bh3.U));
            case 3:
                if (yg3.e(bh3.R).equals("")) {
                    return a(id, theme);
                }
                return Color.parseColor(yg3.e(bh3.R));
            case 4:
                if (yg3.e(bh3.X).equals("")) {
                    return a(id, theme);
                }
                return Color.parseColor(yg3.e(bh3.X));
            case 5:
                if (yg3.e(bh3.c0).equals("")) {
                    return a(id, theme);
                }
                return Color.parseColor(yg3.e(bh3.c0));
            default:
                return a(id, theme);
        }
    }
}