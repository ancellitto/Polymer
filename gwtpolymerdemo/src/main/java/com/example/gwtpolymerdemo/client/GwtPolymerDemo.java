package com.example.gwtpolymerdemo.client;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.gwtpolymerdemo.client.dataStructures.ArtifactName;
import com.example.gwtpolymerdemo.client.dataStructures.ModuleDetail;
import com.example.gwtpolymerdemo.client.dataStructures.Task;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style.Cursor;
import com.google.gwt.dom.client.Style.FontWeight;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.InlineHTML;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.elemental.Event;
import com.vaadin.polymer.elemental.EventListener;
import com.vaadin.polymer.paper.PaperItemElement;
import com.vaadin.polymer.paper.widget.PaperButton;
import com.vaadin.polymer.paper.widget.PaperDrawerPanel;
import com.vaadin.polymer.paper.widget.PaperHeaderPanel;
import com.vaadin.polymer.paper.widget.PaperIconButton;
import com.vaadin.polymer.paper.widget.PaperIconItem;
import com.vaadin.polymer.paper.widget.PaperItem;
import com.vaadin.polymer.paper.widget.PaperItemBody;
import com.vaadin.polymer.paper.widget.PaperMenu;
import com.vaadin.polymer.paper.widget.PaperSubmenu;
import com.vaadin.polymer.paper.widget.PaperToolbar;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GwtPolymerDemo implements EntryPoint {
	 ApplicationContainerElementalApi applicationContainer;
  /**
   * This is the entry point method.
   */
  public void onModuleLoad() {
	  final PaperItemElement button=Polymer.createElement(PaperItemElement.TAG);new PaperItem("Click here to reinitialize");
	  button.setInnerHTML("Click here to reinitialize");
	  applicationContainer=new ApplicationContainerElementalApi(button); 
	  button.addEventListener("click" , new EventListener() {
          public void handleEvent(Event event) {
        	  RootPanel.get().getElement().removeAllChildren();
      		applicationContainer=new ApplicationContainerElementalApi(button);
      		 RootPanel.get().getElement().appendChild((Element)applicationContainer.asWidget());
          }
      });

		 RootPanel.get().getElement().appendChild((Element)applicationContainer.asWidget());
  }

}
