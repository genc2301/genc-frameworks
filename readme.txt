# Selenium Page Object Model Design Pattern Rules

>>>>>Without @PageFactory
>> Actions like calling findelements() methods or Selenium APIs should always be done in Page Classes
>> Validation methods should always be done in Page classes
>> Assertions shouls always be performed in @Test methods
>> Always keep implicit constructors in Page Classes to pass the driver instance being used by TestMethods (Optional But should be followed as per industry standards)





** Problems with the Java PageFactory class
-- PageFactory class is quite useful, but after you have used it a while, you will find that it raises certain questions, and has some limitations.
-- One of the first questions that is usually asked is "How do I get the locator out of the @FindBy annotation so that I can use in WebDriverWait objects?"
-- You could write a method that takes WebElement and converts it into a string, and then try to work out what the various components are.
-- This will not be reliable though, as things will change and the .toString() representation of a WebElement is not set in stone.