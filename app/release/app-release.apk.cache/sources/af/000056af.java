package com.p7700g.p99005;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* compiled from: VASTModel.java */
/* loaded from: classes3.dex */
public class pp5 implements Serializable {
    private static final String A = "//MediaFile";
    private static final String B = "//Duration";
    private static final String C = "//VideoClicks";
    private static final String D = "//Impression";
    private static final String E = "//Error";
    private static final String F = "//Extension[@type='{EXTENSION_TYPE}']/Banner";
    private static final String G = "{EXTENSION_TYPE}";
    public static String s = "PN-Postview-Banner";
    private static String t = pp5.class.getName();
    private static final long u = 4318368258447283733L;
    private static final String v = "/VASTS/VAST/Ad/InLine/Creatives/Creative/Linear/TrackingEvents/Tracking";
    private static final String w = "/VASTS/VAST/Ad/InLine/Creatives/Creative/NonLinearAds/TrackingEvents/Tracking";
    private static final String x = "/VASTS/VAST/Ad/Wrapper/Creatives/Creative/Linear/TrackingEvents/Tracking";
    private static final String y = "/VASTS/VAST/Ad/Wrapper/Creatives/Creative/NonLinearAds/TrackingEvents/Tracking";
    private static final String z = "/VASTS/VAST/Ad/InLine/Creatives/Creative/Linear/TrackingEvents/Tracking|/VASTS/VAST/Ad/InLine/Creatives/Creative/NonLinearAds/TrackingEvents/Tracking|/VASTS/VAST/Ad/Wrapper/Creatives/Creative/Linear/TrackingEvents/Tracking|/VASTS/VAST/Ad/Wrapper/Creatives/Creative/NonLinearAds/TrackingEvents/Tracking";
    private transient Document H;
    private String I = null;

    public pp5(Document vasts) {
        this.H = vasts;
    }

    private void A(ObjectOutputStream oos) throws IOException {
        bq5.a(t, "writeObject: about to write");
        oos.defaultWriteObject();
        oos.writeObject(cq5.e(this.H));
        bq5.a(t, "done writing");
    }

    private List<String> m(String xPath) {
        bq5.a(t, "getListFromXPath");
        ArrayList arrayList = new ArrayList();
        try {
            NodeList nodeList = (NodeList) XPathFactory.newInstance().newXPath().evaluate(xPath, this.H, XPathConstants.NODESET);
            if (nodeList != null) {
                for (int i = 0; i < nodeList.getLength(); i++) {
                    arrayList.add(cq5.a(nodeList.item(i)));
                }
            }
            return arrayList;
        } catch (Exception e) {
            bq5.c(t, e.getMessage(), e);
            return null;
        }
    }

    private void x(ObjectInputStream ois) throws ClassNotFoundException, IOException {
        bq5.a(t, "readObject: about to read");
        ois.defaultReadObject();
        String str = (String) ois.readObject();
        String str2 = t;
        bq5.a(str2, "vastString data is:\n" + str + "\n");
        this.H = cq5.d(str);
        bq5.a(t, "done reading");
    }

    public String f() {
        bq5.a(t, "getDuration");
        try {
            NodeList nodeList = (NodeList) XPathFactory.newInstance().newXPath().evaluate(B, this.H, XPathConstants.NODESET);
            if (nodeList != null) {
                String str = null;
                for (int i = 0; i < nodeList.getLength(); i++) {
                    str = cq5.a(nodeList.item(i));
                }
                return str;
            }
            return null;
        } catch (Exception e) {
            bq5.c(t, e.getMessage(), e);
            return null;
        }
    }

    public List<String> g() {
        bq5.a(t, "getErrorUrl");
        return m(E);
    }

    public String h(String type) {
        List<String> m = m(F.replace(G, type));
        if (m.size() > 0) {
            return m.get(0);
        }
        return null;
    }

    public List<String> i() {
        bq5.a(t, "getImpressions");
        return m(D);
    }

    public List<op5> n() {
        bq5.a(t, "getMediaFiles");
        ArrayList arrayList = new ArrayList();
        try {
            NodeList nodeList = (NodeList) XPathFactory.newInstance().newXPath().evaluate(A, this.H, XPathConstants.NODESET);
            if (nodeList != null) {
                for (int i = 0; i < nodeList.getLength(); i++) {
                    op5 op5Var = new op5();
                    Node item = nodeList.item(i);
                    NamedNodeMap attributes = item.getAttributes();
                    Node namedItem = attributes.getNamedItem("apiFramework");
                    op5Var.k(namedItem == null ? null : namedItem.getNodeValue());
                    Node namedItem2 = attributes.getNamedItem("bitrate");
                    op5Var.l(namedItem2 == null ? null : new BigInteger(namedItem2.getNodeValue()));
                    Node namedItem3 = attributes.getNamedItem("delivery");
                    op5Var.m(namedItem3 == null ? null : namedItem3.getNodeValue());
                    Node namedItem4 = attributes.getNamedItem("height");
                    op5Var.n(namedItem4 == null ? null : new BigInteger(namedItem4.getNodeValue()));
                    Node namedItem5 = attributes.getNamedItem("id");
                    op5Var.o(namedItem5 == null ? null : namedItem5.getNodeValue());
                    Node namedItem6 = attributes.getNamedItem("maintainAspectRatio");
                    op5Var.p(namedItem6 == null ? null : Boolean.valueOf(namedItem6.getNodeValue()));
                    Node namedItem7 = attributes.getNamedItem("scalable");
                    op5Var.q(namedItem7 == null ? null : Boolean.valueOf(namedItem7.getNodeValue()));
                    Node namedItem8 = attributes.getNamedItem("type");
                    op5Var.r(namedItem8 == null ? null : namedItem8.getNodeValue());
                    Node namedItem9 = attributes.getNamedItem("width");
                    op5Var.t(namedItem9 == null ? null : new BigInteger(namedItem9.getNodeValue()));
                    op5Var.s(cq5.a(item));
                    arrayList.add(op5Var);
                }
            }
            return arrayList;
        } catch (Exception e) {
            bq5.c(t, e.getMessage(), e);
            return null;
        }
    }

    public String o() {
        return this.I;
    }

    public HashMap<mp5, List<String>> p() {
        String str;
        bq5.a(t, "getTrackingUrls");
        HashMap<mp5, List<String>> hashMap = new HashMap<>();
        try {
            NodeList nodeList = (NodeList) XPathFactory.newInstance().newXPath().evaluate(z, this.H, XPathConstants.NODESET);
            if (nodeList != null) {
                for (int i = 0; i < nodeList.getLength(); i++) {
                    Node item = nodeList.item(i);
                    try {
                        mp5 valueOf = mp5.valueOf(item.getAttributes().getNamedItem("event").getNodeValue());
                        String a = cq5.a(item);
                        if (hashMap.containsKey(valueOf)) {
                            hashMap.get(valueOf).add(a);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(a);
                            hashMap.put(valueOf, arrayList);
                        }
                    } catch (IllegalArgumentException unused) {
                        String str2 = t;
                        bq5.h(str2, "Event:" + str + " is not valid. Skipping it.");
                    }
                }
            }
            return hashMap;
        } catch (Exception e) {
            bq5.c(t, e.getMessage(), e);
            return null;
        }
    }

    public Document t() {
        return this.H;
    }

    public rp5 u() {
        bq5.a(t, "getVideoClicks");
        rp5 rp5Var = new rp5();
        try {
            NodeList nodeList = (NodeList) XPathFactory.newInstance().newXPath().evaluate(C, this.H, XPathConstants.NODESET);
            if (nodeList != null) {
                for (int i = 0; i < nodeList.getLength(); i++) {
                    NodeList childNodes = nodeList.item(i).getChildNodes();
                    for (int i2 = 0; i2 < childNodes.getLength(); i2++) {
                        Node item = childNodes.item(i2);
                        String nodeName = item.getNodeName();
                        if (nodeName.equalsIgnoreCase("ClickTracking")) {
                            rp5Var.b().add(cq5.a(item));
                        } else if (nodeName.equalsIgnoreCase("ClickThrough")) {
                            rp5Var.e(cq5.a(item));
                        } else if (nodeName.equalsIgnoreCase("CustomClick")) {
                            rp5Var.c().add(cq5.a(item));
                        }
                    }
                }
            }
            return rp5Var;
        } catch (Exception e) {
            bq5.c(t, e.getMessage(), e);
            return null;
        }
    }

    public void y(String pickedMediaFileURL) {
        this.I = pickedMediaFileURL;
    }
}