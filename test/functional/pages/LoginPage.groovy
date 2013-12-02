package pages

class LoginPage extends geb.Page {

    static at = {
        $('title').text() == "Login"
    }

    static url = "login"

    static content = {

    }

}