package com.iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop extends BaseTest_Frames {
	
	WebElement droppable;
	WebElement dragMeToMyTarget;
	Actions action;
	
	
	
	@Test(priority=1)
	public void jQuery_getText_DragMeToMyTarget() throws InterruptedException
	{
	Thread.sleep(3000);

	// <iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>

	By jQueryFrameProperty=By.className("demo-frame");
	WebElement jQueryFrame=driver.findElement(jQueryFrameProperty);

	// we should Switch into the Frame of the WebPage

	driver.switchTo().frame(jQueryFrame);


	// finding the Element in the Frame of the WebPage

	// id="draggable" - property of "Drag Me To My Target"
	// id="draggable"
	
	
	By dragMeToMyTargetProperty=By.id("draggable");
	dragMeToMyTarget=driver.findElement(dragMeToMyTargetProperty);
	String dragMeToMyTarget_Text=dragMeToMyTarget.getText();

	System.out.println(" The Text of the WebElement is :- "+dragMeToMyTarget_Text);
	
	
	// id="droppable" - Drop Here WebElement Property
	By droppableProperty=By.id("droppable");
	droppable=driver.findElement(droppableProperty);
	String droppableText=droppable.getText();

	System.out.println(" The Text of Droppable WebElement is :- "+droppableText);

	}
	
	
	@Test(priority=2)
	public void DragAndDropAction() {
		
	
	// Drag and Drop Operation

	Actions action = new Actions(driver);
	action.dragAndDrop(dragMeToMyTarget, droppable).build().perform();

	

	}
	@Test(priority=3)
	public void backto_defaultcontent() {
	
	driver.switchTo().defaultContent();
	}
	
	@Test(priority=4)
	public void click_on_resize_link()
	{
		// <a href="https://jqueryui.com/resizable/">Resizable</a>
		// <a href="https://jqueryui.com/resizable/">Resizable</a>

		// Thread.sleep(5000);

		By reziableProperty=By.linkText("Resizable");
		WebElement resizable=driver.findElement(reziableProperty);

		resizable.click();

		System.out.println(" The Title of the Resizable WebPage is :- "+driver.getTitle());

	}
	

	
	

}
