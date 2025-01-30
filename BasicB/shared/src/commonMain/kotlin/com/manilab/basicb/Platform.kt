package com.manilab.basicb

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform