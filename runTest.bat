@ECHO OFF

SET PROJECT_DIR=%CD%

:: TEST SUITE CAPBILITIES
SET PARAM="-admin_004b1+ch_01_06"

:: MAVEN EXECUTION PROFILE
SET SINGLETHREAD=singlethread
SET PARALLEL=parallel
SET MULTITHREAD=multithread

::SET STORIESFOLDER=%CD%\src\test\resources\stories


SET REMOTE_OS=WINDOWS
SET REMOTE_URL=http://localhost:4444/wd/hub
SET REMOTE_BROWSER=chrome

REM set profile for building 
::SET PROFILE=%MULTITHREAD%
SET PROFILE=%SINGLETHREAD%

:: TEST RESULTS LOCATION
SET TEST_RESULTS=TestResults

REM ======== DESKTOP ================
:: chrome, iexplorer, firefox, safari 
SET BROWSER=chrome
SET BRAND=Opus2
SET LAN=EN
SET PLATFORM=DESKTOP


SET SOURCE=%PROJECT_DIR%\src\test\resources\data
SET DESTINATION=%PROJECT_DIR%\src\test\resources

 echo --- Creating Test Results folder...
 echo --- Testing DESKTOP_PH_EN

::BaseUrl
SET BASE_URL=https://customer.opus2.com/rc/php/magnumLogin.php

MD %PROJECT_DIR%\%TEST_RESULTS%\%BRAND%_%PLATFORM%_%LAN%_%TEST_RESULTS%\site\serenity
SET META_FILTER=%PARAM%

echo --- calling run.bat file...
CALL %PROJECT_DIR%\run.bat

START %PROJECT_DIR%\%TEST_RESULTS%\%BRAND%_%PLATFORM%_%LAN%_%TEST_RESULTS%\site\serenity\index.html
