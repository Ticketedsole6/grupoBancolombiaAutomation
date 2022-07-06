Feature: Generate Report

  @test
  Scenario: Generate Report Successfully
    Given that a web user wants to generate report
    When he generates the report
    Then he should see the correct report