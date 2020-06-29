package tn.esprit.Calculatrice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.Calculatrice.service.CalculatriceService;

@CrossOrigin(origins="*")
@RestController
public class CalculatriceController {
	@Autowired
	private CalculatriceService calculatriceservice;

//	//@GetMapping("/add/{a}/{b}")
//	@RequestMapping(value="/add/{a}/{b}",method=RequestMethod.GET)
//	@ResponseBody
//	public Response somme (@PathVariable int a,@PathVariable int b) {
//		return calculatriceservice.add(a, b);
//	}

	@GetMapping("/add/{a}/{b}")
	public Integer ajouter(@PathVariable int a, @PathVariable int b) {
		return calculatriceservice.add(a, b);
	}

	@GetMapping("/soustraire/{a}/{b}")
	public Integer soustraire(@PathVariable int a, @PathVariable int b) {
		return calculatriceservice.soustraire(a, b);
	}

	@GetMapping("/multiplier/{a}/{b}")
	public Integer multiplier(@PathVariable int a, @PathVariable int b) {
		return calculatriceservice.multiplier(a, b);
	}

	@GetMapping("/diviser/{a}/{b}")
	public ResponseEntity diviser(@PathVariable int a, @PathVariable int b) {
		if (b != 0) {
			return new ResponseEntity((float) calculatriceservice.divide(a, b), HttpStatus.OK);
		} else {
			return new ResponseEntity<>("cannot divide by 0", HttpStatus.NOT_ACCEPTABLE);
		}
	}
	@GetMapping("/factoriel/{a}")
	public Integer factorielle(@PathVariable int a) {
		return calculatriceservice.factorielle(a);
	}
}
