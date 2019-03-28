package com.stripes.action;

import net.sourceforge.stripes.action.*;

import java.util.Date;

public class HelloActionBean implements ActionBean {

    private static final String VIEW = "/WEB-INF/jsp/showDate.jsp";
    private ActionBeanContext context;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public void setContext(ActionBeanContext context) {

        this.context = context;
    }

    @Override
    public ActionBeanContext getContext() {

        return context;
    }

    @DefaultHandler
    public Resolution hello() {

        this.date = new Date();
        return new ForwardResolution(VIEW);
    }
}