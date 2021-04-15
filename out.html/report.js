$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("mystoreaddress.feature");
formatter.feature({
  "line": 1,
  "name": "My Store Address",
  "description": "",
  "id": "my-store-address",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "user can add an address",
  "description": "",
  "id": "my-store-address;user-can-add-an-address",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "an open browser with MyStore address page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters details",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "success message is printed",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStoreAddressTest.openStoreAddressPage()"
});
formatter.result({
  "duration": 2626869600,
  "status": "passed"
});
formatter.match({
  "location": "MyStoreAddressTest.shouldCreateAValidAddress()"
});
formatter.result({
  "duration": 724114900,
  "status": "passed"
});
formatter.match({
  "location": "MyStoreAddressTest.successMessageIsPrinted()"
});
formatter.result({
  "duration": 37817400,
  "status": "passed"
});
});