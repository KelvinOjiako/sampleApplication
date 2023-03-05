package components

import react.FC
import react.Props
import react.router.dom.BrowserRouter
import routes.navBarRouting

val mainComponent = FC <Props>{
    BrowserRouter{
        navBarComponent()
        navBarRouting()


    }
}