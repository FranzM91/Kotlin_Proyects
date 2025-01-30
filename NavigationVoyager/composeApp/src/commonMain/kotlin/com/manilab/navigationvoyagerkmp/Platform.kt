package com.manilab.navigationvoyagerkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform