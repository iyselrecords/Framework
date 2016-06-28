@ECHO OFF

::TEST SUITE CAPBILITIES
SET PROJECT_DIR=%CD%
SET META_FILTER="-admin_004c5 +admin_039"
SET TEST_RESULTS=TestResults

echo Removing previous test results...
IF exist %PROJECT_DIR%\%TEST_RESULTS%  DEL /S /Q /F %PROJECT_DIR%\%TEST_RESULTS% | echo > NUL
echo Removing previous test results Done...........

 
MD %PROJECT_DIR%\%TEST_RESULTS%\site\serenity

::echo cleaning........clean........clean........clean.......
CALL mvn clean

echo done.....


echo initialize........initialize........initialize........initialize

::CALL mvn initialize

echo done.....


echo compile........compile........compile........compile

CALL mvn compile

echo done.....

echo Executing Test.........

::CALL mvn verify
CALL mvn verify -Dmetafilter=%META_FILTER%

XCOPY /E "%PROJECT_DIR%\target\*.*" "%PROJECT_DIR%\%TEST_RESULTS%\*.*"  | echo > NUL
echo Done
START %PROJECT_DIR%\%TEST_RESULTS%\site\serenity\index.html

