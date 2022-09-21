This is a repo of the GUI task (Nagwa)

using Maven, Data Driven Test, Page object model , TestNG

**INTRO **

This project is implemented using Page Object Model,under this model, for each web page in the application, there should be a corresponding Page Class This Page class will identify the WebElements of that web page and also contains Page methods which perform operations on those WebElements.There is a clean separation between test code and page specific code. for each web page there is a corresponding test page that can perform assertions on the website page.

This is a maven project you must download maven from marketplace to use it

Steps to use the project:

Download maven from marketplace
clone the project or download it
make sure that you install all jar file using maven dependices
This project is implemented using Data-Driven Testing You can Edit test data of these test cases from config.properties from Configurations/config.properties


First Testcase
1.	Open Nagwa website.
2.	Choose a language to open the home page.

                    Page Class: src/main/java/com/nagwa/pages/HomePage
                    
                    Test Class: src/test/java/com/nagwa/testcases/HomePageTest

Second TestCase

In this test case I repeated the steps in the first test case and added the remaining steps to count number of questions

3.	Use the search icon to start searching on Nagwa lessons.
4.	Write any lesson name for example “addition” then search.
5.	A list with all lessons in Nagwa that match this name will appear.
6.	Click on 2nd lesson in the search results to open its home page.
7.	Go to worksheet section then click preview button.
8.	Worksheet home page will open then count number of questions displayed on it and print the count. (Bonus step but preferred to be done).

also i added assertion to compare actual number of questions with expected number

                     Page Class: src/main/java/com/nagwa/pages/SearchPage
 
                   Test Class: src/test/java/com/nagwa/testcases/SearchPageTest




