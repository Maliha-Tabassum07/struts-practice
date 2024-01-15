package com.training.java.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class SaveProductAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ProductForm productForm = (ProductForm) form;

	    // Access form data using getters
	    String name = productForm.getName();
	    String quantity = productForm.getQuantity();
	    Double price = productForm.getPrice();

	    // Your business logic here

	    // For simplicity, let's just set the form data as request attributes
	    request.setAttribute("name", name);
	    request.setAttribute("quantity", quantity);
	    request.setAttribute("price", price);
	    
        if (productForm.getName() == null || productForm.getName().trim().isEmpty()) {
            // Add an error message to the action errors
            ActionErrors errors = new ActionErrors();
            errors.add("name", new org.apache.struts.action.ActionMessage("error.name.required"));
            saveErrors(request, errors);
        }
        if (!getErrors(request).isEmpty()) {
            return mapping.getInputForward();
        }
	    return mapping.findForward("success");
	}

}
