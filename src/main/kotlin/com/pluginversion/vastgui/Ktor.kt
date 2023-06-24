package com.pluginversion.vastgui

object Ktor {
    private const val ktor_version = "2.3.1"

    val cio = "io.ktor:ktor-client-cio:$ktor_version"
    val client_content_negotiation = "io.ktor:ktor-client-content-negotiation:$ktor_version"
    val client_core = "io.ktor:ktor-client-core:$ktor_version"
    val client_gson = "io.ktor:ktor-client-gson:$ktor_version"
    val client_logging = "io.ktor:ktor-client-logging:$ktor_version"
    val client_okhttp = "io.ktor:ktor-client-okhttp:$ktor_version"
    val serialization_kotlinx_json = "io.ktor:ktor-serialization-kotlinx-json:$ktor_version"
}