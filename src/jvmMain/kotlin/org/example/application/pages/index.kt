package org.example.application.pages

import kotlinx.html.*

fun HTML.index( heading: String,  childBody: String){
    head{
        title(heading)
    }

    body {
        div{
            + childBody
            id = "id"
        }
    }
}