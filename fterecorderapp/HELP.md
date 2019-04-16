# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)
* [Accessing JPA Data with REST](https://spring.io/guides/gs/accessing-data-rest/)
* [Accessing Neo4j Data with REST](https://spring.io/guides/gs/accessing-neo4j-data-rest/)
* [Accessing MongoDB Data with REST](https://spring.io/guides/gs/accessing-mongodb-data-rest/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

#About : An FTERecorderApp

Note:
-----
First insert this sequence in DB (run commands below in command prompt -> after going to the 
mongoDB bin directory):
---------------------------------
use testdb
db.fterecsequence.insert({_id: "fterec",seq: 0})

### Sample JSON Input (for POST):
--------------------------------
[
	{
		"track": "BM",
	    "ftesPerRosterCount": 5,
    	"defectCount": 4,
    	"widgetCount": 7,
    	"ftesLoanedCount": 1,
		"ptoCount": 5,
    	"ftesBorrowedCount": 2,
    	"ftesForPerformanceCount": 9,
    	"ftesForExtendedScenarioExecCount": 2,
    	"excessFteCount": 1,
    	"edtDetailsCount": 2,
    	"diQueriesCount": 1,
    	"employee":{
    		"personnelNumber":485702
    	}
	},
	{
		"track": "ARDC",
	    "ftesPerRosterCount": 5,
    	"defectCount": 4,
    	"widgetCount": 7,
    	"ftesLoanedCount": 1,
		"ptoCount": 5,
    	"ftesBorrowedCount": 2,
    	"ftesForPerformanceCount": 9,
    	"ftesForExtendedScenarioExecCount": 2,
    	"excessFteCount": 1,
    	"edtDetailsCount": 2,
    	"diQueriesCount": 1,
    	"employee":{
    		"personnelNumber":485702
    	}
	}
	
]