1.Create Maven Project (by selecting Create Simple Project skip archetype selection )

2.Under src/test/java create following packages
a)PageObject
   i)Create class 'GoogleHomePageObject.java'
b)RunnerClass
   i) Create class 'RunnerTest.java'
c)StepDefinations and create below class
   i)BaseClass.java
   2)StepDefinations.java


3.Inside src/test/resources  create new folder 'Features'
   i) Add Features file


4. Inside Base class create static variable for  WebDriver and PageObjectClasses
	public static  WebDriver driver;
	public static GoogleHomePageObject googleHome_Obj;
	
	
5. Inside StepDefinations class add setup Method

	@Before
	public void setup() {
		
		driver  = new ChromeDriver();
		googleHome_Obj = new GoogleHomePageObject(driver);
		
	}
	
	
	6. Inside PageObject class define constructor for webdriver
	
		public WebDriver ldriver;
	

	public GoogleHomePageObject(WebDriver rDriver)
	{
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	7. Define Webelement using pageFactory
		@FindBy(xpath="(//input[@value = 'Google Search' and @type='submit'] )[2]")
	    WebElement textOnGoogleHomePage;
	
 