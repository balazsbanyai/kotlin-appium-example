# kotlin-appium-example

This very simple example project demonstrates how to use appium with kotlin.

## Project structure

### App 

- the app under test
- contains a button, which displays a dialog

### Test 

- the appium test
- contains a java and a kotlin test
- both tests click on the button and then close the dialog

# Notes
- The app binary will be automatically copied to the test buildDir by gradle. (See test/build.gradle)


