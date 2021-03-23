@Vialet
Feature: Loan page

    @LoanPage @Smoke
    Scenario: Validate loan page fields
        Given I lunch loan page
        Then I validate field labels
        And I validate input fields
        And I validate terms and consents
        When I enter personal code 1234

