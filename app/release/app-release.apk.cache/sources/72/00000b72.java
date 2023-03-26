package com.anythink.nativead.api;

import android.view.View;
import android.widget.FrameLayout;
import java.util.List;

/* loaded from: classes2.dex */
public class ATNativePrepareInfo {
    public View adFromView;
    public View adLogoView;
    public FrameLayout.LayoutParams choiceViewLayoutParams;
    public List<View> clickViewList;
    public View closeView;
    public View ctaView;
    public View descView;
    public View iconView;
    public View mainImageView;
    public View parentView;
    public View titleView;

    public View getAdFromView() {
        return this.adFromView;
    }

    public View getAdLogoView() {
        return this.adLogoView;
    }

    public FrameLayout.LayoutParams getChoiceViewLayoutParams() {
        return this.choiceViewLayoutParams;
    }

    public List<View> getClickViewList() {
        View view;
        List<View> list = this.clickViewList;
        if (list != null && (view = this.closeView) != null) {
            list.remove(view);
        }
        return this.clickViewList;
    }

    public View getCloseView() {
        return this.closeView;
    }

    public View getCtaView() {
        return this.ctaView;
    }

    public View getDescView() {
        return this.descView;
    }

    public View getIconView() {
        return this.iconView;
    }

    public View getMainImageView() {
        return this.mainImageView;
    }

    public View getParentView() {
        return this.parentView;
    }

    public View getTitleView() {
        return this.titleView;
    }

    public void setAdFromView(View view) {
        this.adFromView = view;
    }

    public void setAdLogoView(View view) {
        this.adLogoView = view;
    }

    public void setChoiceViewLayoutParams(FrameLayout.LayoutParams layoutParams) {
        this.choiceViewLayoutParams = layoutParams;
    }

    public void setClickViewList(List<View> list) {
        this.clickViewList = list;
    }

    public void setCloseView(View view) {
        this.closeView = view;
    }

    public void setCtaView(View view) {
        this.ctaView = view;
    }

    public void setDescView(View view) {
        this.descView = view;
    }

    public void setIconView(View view) {
        this.iconView = view;
    }

    public void setMainImageView(View view) {
        this.mainImageView = view;
    }

    public void setParentView(View view) {
        this.parentView = view;
    }

    public void setTitleView(View view) {
        this.titleView = view;
    }
}