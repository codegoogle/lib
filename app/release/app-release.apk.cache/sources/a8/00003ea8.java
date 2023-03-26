package com.p7700g.p99005;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import com.p7700g.p99005.i2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ShortcutXmlParser.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class di {
    private static final String a = "ShortcutXmlParser";
    private static final String b = "android.app.shortcuts";
    private static final String c = "shortcut";
    private static final String d = "shortcutId";
    private static volatile ArrayList<String> e;
    private static final Object f = new Object();

    private di() {
    }

    private static String a(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(ay5.a, str);
        return attributeValue == null ? xmlPullParser.getAttributeValue(null, str) : attributeValue;
    }

    @x1
    @s2
    public static List<String> b(@x1 Context context) {
        if (e == null) {
            synchronized (f) {
                if (e == null) {
                    e = new ArrayList<>();
                    e.addAll(e(context));
                }
            }
        }
        return e;
    }

    @x1
    private static XmlResourceParser c(Context context, ActivityInfo activityInfo) {
        XmlResourceParser loadXmlMetaData = activityInfo.loadXmlMetaData(context.getPackageManager(), b);
        if (loadXmlMetaData != null) {
            return loadXmlMetaData;
        }
        StringBuilder G = wo1.G("Failed to open android.app.shortcuts meta-data resource of ");
        G.append(activityInfo.name);
        throw new IllegalArgumentException(G.toString());
    }

    @x1
    @r2
    public static List<String> d(@x1 XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String a2;
        ArrayList arrayList = new ArrayList(1);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= 0)) {
                break;
            }
            int depth = xmlPullParser.getDepth();
            String name = xmlPullParser.getName();
            if (next == 2 && depth == 2 && c.equals(name) && (a2 = a(xmlPullParser, d)) != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    @x1
    private static Set<String> e(@x1 Context context) {
        HashSet hashSet = new HashSet();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 128);
        if (queryIntentActivities != null && queryIntentActivities.size() != 0) {
            try {
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    Bundle bundle = activityInfo.metaData;
                    if (bundle != null && bundle.containsKey(b)) {
                        XmlResourceParser c2 = c(context, activityInfo);
                        hashSet.addAll(d(c2));
                        if (c2 != null) {
                            c2.close();
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return hashSet;
    }
}