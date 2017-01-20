package jp.co.braintrust.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.braintrust.form.UserForm;

@Controller
public class InputController {
	@RequestMapping(value = "/input", method = RequestMethod.GET)
	public String init(Model model) {
		model.addAttribute("userForm", new UserForm());
		return "input";
	}

//	@RequestMapping(value = "/input", method = RequestMethod.POST)
//	public String post(@Valid @ModelAttribute UserForm form, BindingResult result, Model model) {
//		model.addAttribute("message", form.toString());
//		return "input";
//	}
}
