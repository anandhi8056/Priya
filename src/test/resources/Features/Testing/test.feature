@All
Feature: To Check the Datatable

Scenario: Check weather the datatable is working as expected

Given i store my datatable
When i retrieve my datatable
And i got access to the datatable
 Then i delete the datatable
 Then i close the data