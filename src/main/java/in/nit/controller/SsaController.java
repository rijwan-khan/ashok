package in.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.nit.model.AddresModel;
import in.nit.model.PersonInfoModel;
import in.nit.repo.AddressRepo;
import in.nit.service.PersonService;

@Controller
@RequestMapping("/person")
public class SsaController {
	@Autowired
	private PersonService service;

	@RequestMapping("/register")
	public String showPerForm(@ModelAttribute("personInfoModel") PersonInfoModel personInfoModel) {
		return "personDetails";
	}

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String savePersondata(@ModelAttribute("personInfoModel") PersonInfoModel personInfoModel, Model model) {
		boolean msg = false;

		msg = service.savePersonDetails(personInfoModel);
		model.addAttribute("msg", msg);
		model.addAttribute("addresModel",new AddresModel());

		return "PersonAddrdetail";
	}

	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String savePersonAddrDet(@ModelAttribute("addresModel") AddresModel addresModel, Model model) {
		boolean msg = false;
		msg=service.savePersonAddrdet(addresModel);
	
		model.addAttribute("msg",msg);
		return "allPersonDetails";
	}

}
