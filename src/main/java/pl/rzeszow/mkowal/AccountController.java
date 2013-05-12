package pl.rzeszow.mkowal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.rzeszow.mkowal.model.Balance;

@Controller
@RequestMapping("/account")
public class AccountController {

	/**
	 * Secured method
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET,value="/secure/stats")
	public @ResponseBody Balance getStatus(){
		Balance b = new Balance();
		b.setBalance(121);
		return b;
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/list")
	public @ResponseBody Integer[] getList(){
		Integer [] ai = new Integer[3];
		ai[0] = 45;
		ai[1] = 30;
		ai[2] = 15;
		return ai;
	}
}
