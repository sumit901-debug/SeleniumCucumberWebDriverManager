Feature: LoggedIn user view
#  https://www.youtube.com/watch?v=kPhpJzlnUTs
#  https://allurereport.org/docs/cucumberjvm/
#  npm install -g allure-commandline --save -dev
#  allure generate allure-results --clean -o allure-report

  Scenario: Validate user is able to view after login
  Given User navigates to the Login page
  When User successfully  enters the log in details
  Then User should be able to view the product category page

