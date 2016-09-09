@ECHO OFF

::TEST SUITE CAPBILITIES
SET PROJECT_DIR=%CD%
SET META_FILTER="-Find +newChron"
SET TEST_RESULTS=TestResults

echo Removing previous test results...
IF exist %PROJECT_DIR%\%TEST_RESULTS%  DEL /S /Q /F %PROJECT_DIR%\%TEST_RESULTS% | echo > NUL
echo done.....

 
MD %PROJECT_DIR%\%TEST_RESULTS%\site\serenity

echo cleaning..........
CALL mvn clean
echo done...............

echo compiling...............
CALL mvn compile
echo done...............

echo executing test...............
CALL mvn verify -Dmetafilter=%META_FILTER% -Dchrome.switches="--disable-extensions" -Dphantomjs.binary.path=C:/Users/misele/phantomjs/bin/phantomjs.exe
::CALL mvn verify -Dmetafilter=%META_FILTER% -Dchrome.switches="--disable-extensions" -Dphantomjs.binary.path=C:/PhantomJS/bin/phantomjs.exe

XCOPY /E "%PROJECT_DIR%\target\*.*" "%PROJECT_DIR%\%TEST_RESULTS%\*.*"  | echo > NUL
echo done...............

START %PROJECT_DIR%\%TEST_RESULTS%\site\serenity\index.html
