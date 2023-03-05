package routes

import components.aboutUsComponent
import components.communityComponent
import components.contactComponent
import components.homeComponent
import react.FC
import react.Props
import react.create
import react.router.Route
import react.router.Routes

val navBarRouting = FC<Props>{
    Routes{
        Route{
            element = homeComponent.create()
            path = "/home"
        }
        Route{
            element = aboutUsComponent.create()
            path = "/about"
        }

        Route{
            element = communityComponent.create()
            path = "/community"
        }

        Route{
            element = contactComponent.create()
            path = "/contact"
        }

    }

}