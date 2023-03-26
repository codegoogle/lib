package com.p7700g.p99005;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import com.p7700g.p99005.i2;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ComplexColorCompat.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class ji {
    private static final String a = "ComplexColorCompat";
    private final Shader b;
    private final ColorStateList c;
    private int d;

    private ji(Shader shader, ColorStateList colorStateList, @w0 int i) {
        this.b = shader;
        this.c = colorStateList;
        this.d = i;
    }

    @x1
    private static ji a(@x1 Resources resources, @y0 int i, @z1 Resources.Theme theme) throws IOException, XmlPullParserException {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.hashCode();
            if (name.equals("gradient")) {
                return d(mi.c(resources, xml, asAttributeSet, theme));
            }
            if (name.equals("selector")) {
                return c(ii.b(resources, xml, asAttributeSet, theme));
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static ji b(@w0 int i) {
        return new ji(null, null, i);
    }

    public static ji c(@x1 ColorStateList colorStateList) {
        return new ji(null, colorStateList, colorStateList.getDefaultColor());
    }

    public static ji d(@x1 Shader shader) {
        return new ji(shader, null, 0);
    }

    @z1
    public static ji g(@x1 Resources resources, @y0 int i, @z1 Resources.Theme theme) {
        try {
            return a(resources, i, theme);
        } catch (Exception unused) {
            return null;
        }
    }

    @w0
    public int e() {
        return this.d;
    }

    @z1
    public Shader f() {
        return this.b;
    }

    public boolean h() {
        return this.b != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.b == null && (colorStateList = this.c) != null && colorStateList.isStateful();
    }

    public boolean j(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = this.c;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.d) {
                this.d = colorForState;
                return true;
            }
        }
        return false;
    }

    public void k(@w0 int i) {
        this.d = i;
    }

    public boolean l() {
        return h() || this.d != 0;
    }
}