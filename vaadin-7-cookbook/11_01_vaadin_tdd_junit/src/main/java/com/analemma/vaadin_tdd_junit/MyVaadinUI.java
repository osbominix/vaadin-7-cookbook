package com.analemma.vaadin_tdd_junit;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;

@Theme("mytheme")
@SuppressWarnings("serial")
public class MyVaadinUI extends UI {

  @WebServlet(value = "/*", asyncSupported = true)
  @VaadinServletConfiguration(productionMode = false, ui = MyVaadinUI.class,
      widgetset = "com.analemma.vaadin_tdd_junit.AppWidgetSet")
  public static class Servlet extends VaadinServlet {
  }

  @Override
  public void init(final VaadinRequest request) {
    final LoginLayout loginLayout = new LoginLayout();
    setContent(loginLayout);
  }
}
