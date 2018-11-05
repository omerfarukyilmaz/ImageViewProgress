package com.ofylab.imageviewprogress

import com.mikhaellopez.circularfillableloaders.CircularFillableLoaders

var CircularFillableLoaders.progress: Int
    get() = 0
    set(progress) {
        setProgress(100 - progress)
    }
