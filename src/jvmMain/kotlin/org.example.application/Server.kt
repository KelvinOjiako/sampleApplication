package org.example.application

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.*
import io.ktor.server.engine.embeddedServer
import io.ktor.server.html.*
import io.ktor.server.http.content.*
import io.ktor.server.netty.Netty
import io.ktor.server.routing.*
import org.example.application.pages.index
import org.example.application.routes.navBarBackendRoute


fun main() {
    embeddedServer(Netty, port = 8080, host = "127.0.0.1") {
        routing {
            get("/") {
                call.respondHtml(HttpStatusCode.OK){
                    index("The Void Century!!!", "What do you think happened in the original Void Century??? Tune in!!")
                }
            }
            navBarBackendRoute()
            static("/static") {
                resources()
            }
        }
    }.start(wait = true)
}