@ECHO OFF

echo.
 echo --------------------------------------------------------------------------------------
 echo Test Environment: %BRAND% : %PLATFORM% %LAN% %STORIESFOLDER%
 echo --------------------------------------------------------------------------------------
 echo.
 
 echo Removing previous test results...
 IF exist %PROJECT_DIR%\%TEST_RESULTS%\%BRAND%_%PLATFORM%_%LAN%_%TEST_RESULTS%  DEL /S /Q /F %PROJECT_DIR%\%TEST_RESULTS%\%BRAND%_%PLATFORM%_%LAN%_%TEST_RESULTS% | echo > NUL
 echo Done
 echo.
 
 echo cd to project directory(%PROJECT_DIR%)...
 CD "%PROJECT_DIR%"
 echo Done
 echo.
 
 
 
 
SET DEFAULTPROFILE=%SINGLETHREAD%

IF %PROFILE%==%MULTITHREAD% (SET DEFAULTPROFILE=%MULTITHREAD%) ELSE (
  IF %PROFILE%==%SINGLETHREAD% (SET DEFAULTPROFILE=%SINGLETHREAD%) ELSE (
   IF %PROFILE%==%PARALLEL% (SET DEFAULTPROFILE=%PARALLEL%) ELSE (
    echo ****************** Invalid profile configuration... 
    echo ****************** Using default profile: "%DEFAULTPROFILE%"
   )
  )
)
 
 echo --- Running in %DEFAULTPROFILE% mode ---
 
 echo --- Deleting table files from %DESTINATION%... 
 ::IF EXIST %DESTINATION%\*.table DEL /Q /F %DESTINATION%\*.table
 echo Done 
 echo.
 
 echo Preparing test-data files...
 REM copy data to appropriate files
 COPY /Y "%SOURCE%\%LAN%_testData.table" "%DESTINATION%\testData.table"
 COPY /Y "%SOURCE%\%LAN%_transcript.table" "%DESTINATION%\transcript.table"
 COPY /Y "%SOURCE%\%LAN%_capability.table" "%DESTINATION%\capability.table"
 COPY /Y "%SOURCE%\%LAN%_chronology.table" "%DESTINATION%\chronology.table"
 
 echo Done
 echo.
 
 echo Cleaning...
 CALL mvn clean  
 echo Done
 echo.
 
 echo Compiling...
 CALL mvn compile  
 echo Done
 echo.

 echo Executing..
 
IF %PROFILE%==%SINGLETHREAD% ( 
echo SINGLETHREAD
REM CALL mvn verify -Dmetafilter=%META_FILTER%  -Dwebdriver.driver=%BROWSER% -Dwebdriver.base.url="%BASE_URL%" -Dbrand.name="%BRAND%"
IF %PLATFORM%==BROWSERSTACK (
CALL mvn verify -P %DEFAULTPROFILE% -DproxySet=true -DproxyHost=proxy4.wipro.com -DproxyPort=8080 -DproxyUser=PA257736 -DproxyPass=Fossil#in -Dlan=%LAN% -Dbrand=%BRAND% -Dmetafilter=%META_FILTER% -Dplatform=%PLATFORM% -Dbrowserstack.os=%BROWSERSTACK_OS% -Dbrowserstack.os.version=%BROWSERSTACK_OS_VERSION% -Dbrowserstack.browser=%BROWSER% -Dbrowserstack.browser.version=%BROWSER_VERSION% -Dbrowserstack.build=BROWSERSTACK_BUILD -Dbrowserstack.url="%BROWSERSTACK_URL%" -Dwebdriver.base.url="%BASE_URL%"
) ELSE (
CALL mvn verify -P %DEFAULTPROFILE% -Dlan=%LAN% -Dbrand=%BRAND% -Dmetafilter=%META_FILTER%  -Dwebdriver.driver=%BROWSER% -Dwebdriver.base.url="%BASE_URL%" -Dplatform=%PLATFORM%
)
)

  
 echo Execution Done
 echo.
 
  echo --- Copying test result to %TEST_RESULTS% folder...
 IF NOT EXIST %PROJECT_DIR%\%TEST_RESULTS% MD %PROJECT_DIR%\%TEST_RESULTS%
 XCOPY /E "%PROJECT_DIR%\target\*.*" "%PROJECT_DIR%\%TEST_RESULTS%\%BRAND%_%PLATFORM%_%LAN%_%TEST_RESULTS%\*.*"  | echo > NUL
 echo Done
 echo.
