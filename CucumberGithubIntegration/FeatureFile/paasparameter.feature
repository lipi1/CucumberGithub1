Feature: Test Facebook scenario

  Scenario: Test Login Facebook with valid credentials
    Given Open FIrefox and start application
    When I enter valid "lipi.jain6@gmail.com" and valid "P@ssw0rd1"
    Then user must be able to login successfully

    
