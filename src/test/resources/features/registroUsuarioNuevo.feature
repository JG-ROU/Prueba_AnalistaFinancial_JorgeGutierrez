#Autor: Jorge Gutierrez

@stories
Feature: uTest
  As a user, I want to learn how to automate the trend in the screenplay, the log of a new user in the “Utest” page , and see the content in the main site
  @scenario1
  Scenario: Enter the page and locate the registration button "Join Today"
    Given What Jorge wants is to register  on the page,to learn about creation and deployment of tests
    When Access the registration form and follow each step by filling field
      | strNombre | strApellido |           strEmail          | strMesNacimiento | strDiaNacimiento | strAnoNacimiento | strCity   | strZip   |   strPais    | strDispositivo | strModelo   |   strSo     | strPass |
      |    rou    |    Garou    |    r0udev.me@gmail.com      |      June        |       15         |       1993       |  Bogota   | 110811   |   Colombia   |         Apple  |  iphone 4s  |   iOS 11.2  | P33333r |
    Then The form is completed by clicking on the button “Setup complete “
      |    strTextoF   |
      | Complete Setup |