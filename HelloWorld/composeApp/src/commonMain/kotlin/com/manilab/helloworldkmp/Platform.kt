package com.manilab.helloworldkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform