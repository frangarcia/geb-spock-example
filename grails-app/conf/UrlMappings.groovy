class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

        "/signUp"(view:"/signUp")
        "/login"(view:"/login")
        "/"(view:"/index")
		"500"(view:'/error')
	}
}
