package pageObjects;


import utils.driverFactory;

public class checkoutPage extends driverFactory
{


public String proceedToCheckout1 = "Proceed to checkout"; // Linked Text locator
public String proceedToCheckout2 = "processAddress"; // name locator
public String proceedToCheckout3 = "Proceed to checkout"; // Linked Text locator
public String termsOfServiceTickBox = "//*[@id='cgv']"; // xPath locator
public String proceedToCheckout4 = "processCarrier"; // name locator
public String payByBankWire = "Pay by bank wire"; // Partial Linked Text locator
public String payByCheck = "Pay by check"; // Partial Linked Text locator
public String orderConfirmation = "//*[@id='cart_navigation']/button/span"; // xPath locator
public String orderConformationMessage = "//*[@id=\"columns\"]/div[1]/span[2]"; //xPath locator


}
