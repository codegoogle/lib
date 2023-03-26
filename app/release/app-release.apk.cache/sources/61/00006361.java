package com.p7700g.p99005;

import android.content.Context;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: KeyFrames.java */
/* loaded from: classes.dex */
public class wd {
    public static final int a = -1;
    private static final String b = "CustomMethod";
    private static final String c = "CustomAttribute";
    public static HashMap<String, Constructor<? extends td>> d = null;
    private static final String e = "KeyFrames";
    private HashMap<Integer, ArrayList<td>> f = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends td>> hashMap = new HashMap<>();
        d = hashMap;
        try {
            hashMap.put("KeyAttribute", ud.class.getConstructor(new Class[0]));
            d.put("KeyPosition", xd.class.getConstructor(new Class[0]));
            d.put("KeyCycle", vd.class.getConstructor(new Class[0]));
            d.put("KeyTimeCycle", zd.class.getConstructor(new Class[0]));
            d.put("KeyTrigger", ae.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException unused) {
        }
    }

    public wd() {
    }

    public static String f(int viewId, Context context) {
        return context.getResources().getResourceEntryName(viewId);
    }

    public void a(ce motionController) {
        ArrayList<td> arrayList = this.f.get(-1);
        if (arrayList != null) {
            motionController.b(arrayList);
        }
    }

    public void b(ce motionController) {
        ArrayList<td> arrayList = this.f.get(Integer.valueOf(motionController.D));
        if (arrayList != null) {
            motionController.b(arrayList);
        }
        ArrayList<td> arrayList2 = this.f.get(-1);
        if (arrayList2 != null) {
            Iterator<td> it = arrayList2.iterator();
            while (it.hasNext()) {
                td next = it.next();
                if (next.g(((ConstraintLayout.b) motionController.C.getLayoutParams()).A0)) {
                    motionController.a(next);
                }
            }
        }
    }

    public void c(td key) {
        if (!this.f.containsKey(Integer.valueOf(key.z))) {
            this.f.put(Integer.valueOf(key.z), new ArrayList<>());
        }
        ArrayList<td> arrayList = this.f.get(Integer.valueOf(key.z));
        if (arrayList != null) {
            arrayList.add(key);
        }
    }

    public ArrayList<td> d(int id) {
        return this.f.get(Integer.valueOf(id));
    }

    public Set<Integer> e() {
        return this.f.keySet();
    }

    public wd(Context context, XmlPullParser parser) {
        HashMap<String, we> hashMap;
        HashMap<String, we> hashMap2;
        td tdVar = null;
        try {
            int eventType = parser.getEventType();
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && oe.c.equals(parser.getName())) {
                        return;
                    }
                } else {
                    String name = parser.getName();
                    if (d.containsKey(name)) {
                        try {
                            Constructor<? extends td> constructor = d.get(name);
                            if (constructor != null) {
                                td newInstance = constructor.newInstance(new Object[0]);
                                try {
                                    newInstance.f(context, Xml.asAttributeSet(parser));
                                    c(newInstance);
                                } catch (Exception unused) {
                                }
                                tdVar = newInstance;
                                continue;
                            } else {
                                throw new NullPointerException("Keymaker for " + name + " not found");
                                break;
                            }
                        } catch (Exception unused2) {
                            continue;
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (tdVar != null && (hashMap2 = tdVar.C) != null) {
                            we.q(context, parser, hashMap2);
                            continue;
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && tdVar != null && (hashMap = tdVar.C) != null) {
                        we.q(context, parser, hashMap);
                        continue;
                    }
                }
                eventType = parser.next();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}