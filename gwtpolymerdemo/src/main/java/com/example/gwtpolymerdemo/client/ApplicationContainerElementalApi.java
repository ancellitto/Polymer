package com.example.gwtpolymerdemo.client;

import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.paper.PaperDrawerPanelElement;
import com.vaadin.polymer.paper.PaperHeaderPanelElement;
import com.vaadin.polymer.paper.PaperItemElement;
import com.vaadin.polymer.paper.PaperToolbarElement;

public class ApplicationContainerElementalApi  {

	  private PaperDrawerPanelElement applicationPage;
	  private PaperToolbarElement header;
	  private PaperItemElement button;
	  public ApplicationContainerElementalApi(PaperItemElement button) {
		  this.button=button;
		initialize();
	  	}
public void initialize()
{	
	applicationPage=Polymer.createElement(PaperDrawerPanelElement.TAG);
	

  	  applicationPage.setAttribute("right-drawer", "");
  	  applicationPage.setForceNarrow(true);
		final PaperHeaderPanelElement contentArea=Polymer.createElement(PaperHeaderPanelElement.TAG);
  	  applicationPage.appendChild(getContentArea(contentArea));	  	  

}

private PaperToolbarElement getHeaderPanel() {
	 header=Polymer.createElement(PaperToolbarElement.TAG);
	  header.appendChild(button);
	return header;
}

private PaperHeaderPanelElement getContentArea(PaperHeaderPanelElement contentArea) {

		contentArea.setAttribute("main","");
		PaperToolbarElement header = getHeaderPanel();
		contentArea.appendChild(header);
		return contentArea;
}
public PaperDrawerPanelElement asWidget() {
	return applicationPage;
}

}
