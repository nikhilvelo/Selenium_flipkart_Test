Framework                 : Data driven framework
Maven project             : Selenium_flipkart_Test

POM i.e. Page object model design pattern is followed.

src/main/java             : 1.Baseclass.java (Browser initialization)
                            2.Utility.java(Parameterization i.e. Test data, & capturing screenshots for failed test)
                            3.Flipkart_home.java (Page class)
                            4.Search_mobiles.java(Page class)
                            
src/test/java               1.Reterive_Listof_iPhones.java(Test class)   ----------> Execute this file only

Properties folder          : config.properties(contains URL & Chrome path )
Driver     folder          : chromedriver.exe
Data       folder          : 1.InputData.xlsx (contains test data eg. maximum price(40000))
                             2.iPhones.csv    (Stores the list of retrieved iPhones)
                             
Screenshots                : Stores captured screenshots for failed test
POM.xml                    : Contains maven dependencies.
Manual_Test.pdf            : manual test assignment


Result of execution        : Fail (NoSuchElementException : Cannot locate option with value:40000)
                             Reason : Select list box for applying maximum price filter don't have any option value as 40000. 
                             