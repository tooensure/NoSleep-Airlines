package com.tooensure.flights

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform