package components

//import kotlinx.browser.document
import react.FC
import react.Props
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.nav
import react.dom.html.ReactHTML.ul
import react.router.dom.Link


val navBarComponent = FC<Props>{

    console.log("NavBar Component is triggered!!!!")
   // navBarRouting()
    nav{
        ul{
            li{
                Link{
                    to = "/home"
                    + "Home Page"
                }
            }

            li{
                Link{
                    to ="/about"
                    + "About Us"
                }
            }

            li{
                Link{
                    to = "/contact"
                    + "Contact Us"
                }
            }
        }

    }
}

val homeComponent = FC<Props>{
    //val divObject = document.getElementById("id")
    h1{
        + "Message from the home containers On the client ;)"
    }
}

val aboutUsComponent = FC<Props>{
    h1{
        + "Message from the US containers On the client ;)"
    }
}

val communityComponent = FC<Props>{
    h1{
        + "Message from the community containers On the client ;)"
    }
}

val shopComponent = FC<Props>{
    h1{
        + "Message from the shop containers On the client ;)"
    }
}

val contactComponent = FC<Props>{
    h1{
        + "Message from the contact us container On the client ;)"
    }
}