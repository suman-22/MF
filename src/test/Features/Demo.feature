Feature: Demo

Scenario: demo test

 Given the user has logged in
 And the user selects GFMP
 And the user selects Practice Maintenance
  And the user selects territory NAM
  When the user clicks Add
  Then the user verifies practice number is present

