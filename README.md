awsl-client
===========

A generated web service client for the AWSL feed.

Copy the wsdl and xsd files locally and modify them so that any links are to the local files.

Then generate using:
wsimport -keep -d src/main/java -wsdllocation https://41.138.70.142:9896/wsdl.xml src/main/resources/new-env.wsdl
