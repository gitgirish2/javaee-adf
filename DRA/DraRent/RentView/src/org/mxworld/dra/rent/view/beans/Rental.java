package org.mxworld.dra.rent.view.beans;

import java.sql.Timestamp;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.input.RichInputText;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.NameValuePairs;
import oracle.jbo.ViewObject;

public class Rental {
    private RichInputText customer;
    private RichInputText inventory;

    public Rental() {
    }

    public String rent() {
        BindingContainer bc = BindingContext.getCurrent().getCurrentBindingsEntry();
        DCBindingContainer dcb = (DCBindingContainer) bc;
        DCIteratorBinding rentalIter = dcb.findIteratorBinding("RentalVOIterator");
        NameValuePairs attrib = new NameValuePairs();
        attrib.setAttribute("CustomerId", customer.getValue());
        attrib.setAttribute("InventoryId", inventory.getValue());
        //TODO: Look up user later when adding security
        attrib.setAttribute("StaffId", 1);
        attrib.setAttribute("RentalDate", new Timestamp(System.currentTimeMillis()));
        attrib.setAttribute("LastUpdate", new Timestamp(System.currentTimeMillis()));
        ViewObject rentalVO = rentalIter.getViewObject();
        rentalVO.createAndInitRow(attrib);
        OperationBinding ob = bc.getOperationBinding("Commit");
        ob.execute();
        
        // Display an informational message
        FacesContext ctx = FacesContext.getCurrentInstance();
        String msg = "Your rental has been successfully registered: Customer No = " + 
                     customer.getValue() + ", Inventory ID = " + inventory.getValue();
        FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, "");
        ctx.addMessage(ctx.getViewRoot().getId(), fm);
        customer.setValue(null);
        inventory.setValue(null);
        
        return null;
    }

    public void setCustomer(RichInputText customer) {
        this.customer = customer;
    }

    public RichInputText getCustomer() {
        return customer;
    }

    public void setInventory(RichInputText inventory) {
        this.inventory = inventory;
    }

    public RichInputText getInventory() {
        return inventory;
    }
}
