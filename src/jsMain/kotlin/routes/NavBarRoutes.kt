package routes

import components.aboutUsComponent
import components.communityComponent
import components.contactComponent
import components.homeComponent
import react.FC
import react.Props
import react.create
import react.router.Route

val navBarRouting = FC<Props>{

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