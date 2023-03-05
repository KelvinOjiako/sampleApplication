package org.example.application.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.html.*
import io.ktor.server.routing.*
import org.example.application.pages.index



fun Route.navBarBackendRoute(){
    homePage()
    aboutPage()
    communityPage()
    shop()
    contactPage()
}
fun Route.homePage(){

    get("/"){
        call.respondHtml(HttpStatusCode.OK){
            index("Blank Index Page", "This is the Serverside Starting point!!!! Marking Index.html")
        }
    }
    get("/home"){
        call.respondHtml( HttpStatusCode.OK) {
            index("Home Page", "Welcome to the home Page!!!!!1")
        }
    }
}

fun Route.aboutPage(){
    get("/about"){
        call.respondHtml( HttpStatusCode.OK) {
            index("About Us", "Read about the exciting journey of the company. A tale for the ages")
        }
    }
}

fun Route.communityPage(){
    get("/community"){
        call.respondHtml( HttpStatusCode.OK) {
            index("Our Community", "Follow us on Instagram and Facebook ;)")
        }
    }
}

fun Route.contactPage(){
    get("/contact"){
        call.respondHtml( HttpStatusCode.OK) {
            index("Contact us", "Fill the form below to contact us")
        }
    }
}

fun Route.shop(){
    get("/shop"){
        call.respondHtml( HttpStatusCode.OK) {
            index("Shopping Page", "DONT SHOP TOO HARD HEHEHEHEH!!!!!!")
        }
    }
}