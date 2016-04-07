
package com.example.gwtpolymerdemo.client;

import java.util.List;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.polymer.paper.widget.PaperDrawerPanel;
import com.vaadin.polymer.paper.widget.PaperHeaderPanel;
import com.vaadin.polymer.paper.widget.PaperItem;
import com.vaadin.polymer.paper.widget.PaperToolbar;

public class ApplicationContainerWidgetApi implements IsWidget {

	  private PaperDrawerPanel applicationPage;
	  private PaperToolbar header;
	  private PaperItem button;
	  public ApplicationContainerWidgetApi(PaperItem button) {
		  this.button=button;
		initialize();
	  	}
public void initialize()
{	    	  applicationPage=new PaperDrawerPanel();
	    	  applicationPage.setAttributes("right-drawer;");
	    	  applicationPage.setForceNarrow(true);
	    	  applicationPage.add(getContentArea());	  	  
}

private PaperToolbar getHeaderPanel() {
	 header=new PaperToolbar();
	  header.add(button);
	return header;
}

private PaperHeaderPanel getContentArea() {
		PaperHeaderPanel contentArea=new PaperHeaderPanel();
		contentArea.setAttributes("main");
		PaperToolbar header = getHeaderPanel();
		contentArea.add(header);
		return contentArea;
}
@Override
public Widget asWidget() {
	return applicationPage;
}

}