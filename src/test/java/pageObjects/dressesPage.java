package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.driverFactory;

public class dressesPage extends driverFactory{
	
	public String dressesButton = "//*[@id=\"block_top_menu\"]/ul/li[2]/a"; //xPath locator

	public String subCategoryTitle = "//*[@id=\"center_column\"]/h1/span[1]"; //xPath locator
	  
	public String eveningTitile = "//*[@id=\"center_column\"]/h1/span[1]"; //xPath locator
	
	public String summerTitile = "//*[@id=\"center_column\"]/h1/span[1]"; //xPath locator
	
	public String addToCart = "Submit"; //name locator
    
    public String checkout = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"; //xPath locator
    
    public String categoryBlock = "//*[@id=\"categories_block_left\"]"; //xPath locator
    
    public String dress = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"; //xPath locator
    
    public void userPurchaseItem () throws Throwable {
    	WebDriverWait wait = new WebDriverWait(driver, 5);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dressesPage.dressesButton)));
        driver.findElement(By.xpath(dressesPage.dressesButton)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dressesPage.dress)));
		driver.findElement(By.xpath(dressesPage.dress)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(dressesPage.addToCart)));
		driver.findElement(By.name(dressesPage.addToCart)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dressesPage.checkout)));
		driver.findElement(By.xpath(dressesPage.checkout)).click();

}

} 