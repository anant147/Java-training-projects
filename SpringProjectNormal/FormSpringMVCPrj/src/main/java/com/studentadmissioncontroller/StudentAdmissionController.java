package com.studentadmissioncontroller;
import java.util.Map; import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping; import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam; import org.springframework.web.servlet.ModelAndView;
@Controller
public class StudentAdmissionController {
	@RequestMapping(value="/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;	}
//	@RequestMapping("/submitAdmissionForm.html")
//	public ModelAndView submitAdmissionForm(@RequestParam("candidateName") String name, @RequestParam("candidateHobby") String hobby) {
//		ModelAndView model = new ModelAndView("AdmissionSuccess");
//		model.addObject("msg","Details submitted by you:: Name: "+name+ ", Hobby: " + hobby);
//		return model;	}
	
	
	@RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam Map<String,String> reqPar) {
		String name = reqPar.get("candidateName");
		String hobby = reqPar.get("candidateHobby");
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("msg","Details submitted by you:: Name: " + name + ", Hobby: " + hobby);
		model.addObject("msg2","done");
		return model;}	
	
}