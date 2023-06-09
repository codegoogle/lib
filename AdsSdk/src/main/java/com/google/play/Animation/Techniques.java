package com.google.play.Animation;

public enum Techniques {

    Bounce(BounceAnimator.class),
    FadeIn(FadeInAnimator.class),
    Shake(ShakeAnimator.class);

    private Class animatorClazz;

    private Techniques(Class clazz) {
        animatorClazz = clazz;
    }

    public BaseViewAnimator getAnimator() {
        try {
            return (BaseViewAnimator) animatorClazz.newInstance();
        } catch (Exception e) {
            throw new Error("Can not init animatorClazz instance");
        }
    }
}