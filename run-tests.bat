@echo off
setlocal enabledelayedexpansion

echo Running Maven tests...
call mvn clean test

if errorlevel 1 (
    echo Maven test failed.
    pause
    exit /b 1
)

set "LATEST_DIR=target\ExtentReports\latest"
if not exist "%LATEST_DIR%" mkdir "%LATEST_DIR%"

set "LATEST_REPORT=%LATEST_DIR%\ExtentReport.html"
set "NEWEST_REPORT="

REM Find newest ExtentReport.html anywhere inside archive
for /f "delims=" %%F in ('dir /s /b /o-d target\ExtentReports\archive\ExtentReport.html 2^>nul') do (
    set "NEWEST_REPORT=%%F"
    goto :copy
)

:copy
if "%NEWEST_REPORT%"=="" (
    echo ❌ No Extent report found!
    pause
    exit /b 1
)

copy /Y "%NEWEST_REPORT%" "%LATEST_REPORT%" >nul

echo.
echo ✅ Latest report copied:
echo %LATEST_REPORT%
echo.

pause
endlocal