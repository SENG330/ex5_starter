![Java CI with Gradle](https://github.com/SENG330/fall20ex4_starter/workflows/Java%20CI%20with%20Gradle/badge.svg)

Please read thru the [overall exercises overview](https://github.com/SENG330/course/blob/master/exercises/Exercises.md).

## Exercise 5

### Learning Objectives

- understand how and when to use unit testing, meta programming, stubs
- starting out with CI and Github Actions
- Building a real app - real-world considerations.

### Overview

In Exercise 5, add one external service call to your application. You will need to use API calls to public data sources, parse the returned JSON into a Java object,  and display that in your app (printing to console is fine for now). You must test this service for connectivity, and also mock the returned data so you can run fast unit tests.

Some sample services you might avail yourself of:
* AIS (vessel transponder) data (usually $$)
* [Ocean Networks Canada data](https://wiki.oceannetworks.ca/display/O2A/API+Reference) 
* [Weather and wind feeds](https://openweathermap.org/appid)
* Other sources, that are relevant to the app.

### Deliverables

* Your code should be running Github Actions with tests auto-run. 
* Add one action that tests the remote service (the other CI action should stub that service).
* Two unit tests that show how reflection can change method or field visibility 
* The ADR discussing how you decided to access and parse the external data, and where that class fits in the design. Be sure to think about service availability!
* A mock class that substitutes for service lookup (e.g., load the JSON from disk/memory and parse it locally).
* Bonus 2 marks for using Guice to inject stubs or real code dynamically, as discussed in class 
* IntelliJ code coverage report 

### Tips
* [use Jackson](https://www.baeldung.com/jackson) to parse JSON data and connect to the service. Other frameworks like GSON are acceptable too. 
 
## Due
- We will mark the last commit made before **October 23 at 11:59pm**. If that last commit was a mess, let us know. Make  sure your code compiles!
- By midnight Oct 25, submit your team peer review form via the webapp (link omitted to prevent spam).
