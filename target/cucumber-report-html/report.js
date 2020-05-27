$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Testing/test.feature");
formatter.feature({
  "line": 2,
  "name": "To Check the Datatable",
  "description": "",
  "id": "to-check-the-datatable",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Check weather the datatable is working as expected",
  "description": "",
  "id": "to-check-the-datatable;check-weather-the-datatable-is-working-as-expected",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "i store my datatable",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "i retrieve my datatable",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "i got access to the datatable",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "i delete the datatable",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "i close the data",
  "keyword": "Then "
});
formatter.match({
  "location": "FeatureCheck.i_store_my_datatable()"
});
formatter.result({
  "duration": 377635800,
  "status": "passed"
});
formatter.match({
  "location": "FeatureCheck.i_retrieve_my_datatable()"
});
formatter.result({
  "duration": 87900,
  "status": "passed"
});
formatter.match({
  "location": "FeatureCheck.i_got_access_to_the_datatable()"
});
formatter.result({
  "duration": 68900,
  "status": "passed"
});
formatter.match({
  "location": "FeatureCheck.i_delete_the_datatable()"
});
formatter.result({
  "duration": 82100,
  "status": "passed"
});
formatter.match({
  "location": "FeatureCheck.i_close_the_data()"
});
formatter.result({
  "duration": 74900,
  "status": "passed"
});
});