@ECHO OFF

::TEST SUITE CAPBILITIES
SET PROJECT_DIR=%CD%
SET META_FILTER="+loginToday"
SET TEST_RESULTS=TestResults

echo Removing previous test results...
IF exist %PROJECT_DIR%\%TEST_RESULTS%  DEL /S /Q /F %PROJECT_DIR%\%TEST_RESULTS% | echo > NUL
echo Removing previous test results Done...........

 
MD %PROJECT_DIR%\%TEST_RESULTS%\site\serenity

echo clean........clean........clean........clean.......
CALL mvn clean
echo done.......done........done........done........done........done.........
echo initialize........initialize........initialize........initialize

CALL mvn initialize

echo done.......done........done........done........done........done.........
echo compile........compile........compile........compile

CALL mvn compile

echo done.......done........done........done........done........done.........
echo running Test........running Test........running Test..............
CALL mvn verify -Dmetafilter=%META_FILTER%


XCOPY /E "%PROJECT_DIR%\target\*.*" "%PROJECT_DIR%\%TEST_RESULTS%\*.*"  | echo > NUL
echo Done
START %PROJECT_DIR%\%TEST_RESULTS%\site\serenity\index.html

