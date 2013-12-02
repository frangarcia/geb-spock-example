package pages

class SignUpFormPage extends geb.Page {

    static at = {
        $('title').text() == "Sign Up"
    }

    static url = "signUp"

    static content = {
        loginLink            { $("#loginLink") }
    }

}