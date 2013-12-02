import geb.spock.GebReportingSpec
import geb.spock.GebSpec
import spock.lang.*
import pages.*

@Stepwise
class SignUpSpec extends GebSpec {

    def "signup new customer"() {
        when:
            to SignUpFormPage
        then:
            at SignUpFormPage

        when:
            loginLink.click()
        then:
            at LoginPage
    }

}