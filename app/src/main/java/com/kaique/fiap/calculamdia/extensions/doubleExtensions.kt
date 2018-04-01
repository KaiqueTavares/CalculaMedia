package com.kaique.fiap.calculamdia.extensions

fun Double.format(digits: Int) =
        java.lang.String.format("%.${digits}f",this)