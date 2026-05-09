package com.neonlauncher.anim.animations

import com.neonlauncher.anim.animations.bounce.BounceEnlargeAnimator
import com.neonlauncher.anim.animations.bounce.BounceInDownAnimator
import com.neonlauncher.anim.animations.bounce.BounceInLeftAnimator
import com.neonlauncher.anim.animations.bounce.BounceInRightAnimator
import com.neonlauncher.anim.animations.bounce.BounceInUpAnimator
import com.neonlauncher.anim.animations.bounce.BounceShrinkAnimator
import com.neonlauncher.anim.animations.fade.FadeInAnimator
import com.neonlauncher.anim.animations.fade.FadeInDownAnimator
import com.neonlauncher.anim.animations.fade.FadeInLeftAnimator
import com.neonlauncher.anim.animations.fade.FadeInRightAnimator
import com.neonlauncher.anim.animations.fade.FadeInUpAnimator
import com.neonlauncher.anim.animations.fade.FadeOutAnimator
import com.neonlauncher.anim.animations.fade.FadeOutDownAnimator
import com.neonlauncher.anim.animations.fade.FadeOutLeftAnimator
import com.neonlauncher.anim.animations.fade.FadeOutRightAnimator
import com.neonlauncher.anim.animations.fade.FadeOutUpAnimator
import com.neonlauncher.anim.animations.other.PulseAnimator
import com.neonlauncher.anim.animations.other.ShakeAnimator
import com.neonlauncher.anim.animations.other.WobbleAnimator
import com.neonlauncher.anim.animations.slide.SlideInDownAnimator
import com.neonlauncher.anim.animations.slide.SlideInLeftAnimator
import com.neonlauncher.anim.animations.slide.SlideInRightAnimator
import com.neonlauncher.anim.animations.slide.SlideInUpAnimator
import com.neonlauncher.anim.animations.slide.SlideOutDownAnimator
import com.neonlauncher.anim.animations.slide.SlideOutLeftAnimator
import com.neonlauncher.anim.animations.slide.SlideOutRightAnimator
import com.neonlauncher.anim.animations.slide.SlideOutUpAnimator

enum class Animations(val animator: BaseAnimator) {
    //Bounce
    BounceInDown(BounceInDownAnimator()),
    BounceInLeft(BounceInLeftAnimator()),
    BounceInRight(BounceInRightAnimator()),
    BounceInUp(BounceInUpAnimator()),
    BounceEnlarge(BounceEnlargeAnimator()),
    BounceShrink(BounceShrinkAnimator()),

    //Fade in
    FadeIn(FadeInAnimator()),
    FadeInLeft(FadeInLeftAnimator()),
    FadeInRight(FadeInRightAnimator()),
    FadeInUp(FadeInUpAnimator()),
    FadeInDown(FadeInDownAnimator()),

    //Fade out
    FadeOut(FadeOutAnimator()),
    FadeOutLeft(FadeOutLeftAnimator()),
    FadeOutRight(FadeOutRightAnimator()),
    FadeOutUp(FadeOutUpAnimator()),
    FadeOutDown(FadeOutDownAnimator()),

    //Slide in
    SlideInLeft(SlideInLeftAnimator()),
    SlideInRight(SlideInRightAnimator()),
    SlideInUp(SlideInUpAnimator()),
    SlideInDown(SlideInDownAnimator()),

    //Slide out
    SlideOutLeft(SlideOutLeftAnimator()),
    SlideOutRight(SlideOutRightAnimator()),
    SlideOutUp(SlideOutUpAnimator()),
    SlideOutDown(SlideOutDownAnimator()),

    //Other
    Pulse(PulseAnimator()),
    Wobble(WobbleAnimator()),
    Shake(ShakeAnimator())
}