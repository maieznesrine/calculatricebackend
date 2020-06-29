package tn.esprit.Calculatrice.service;

import org.springframework.stereotype.Service;


@Service
public class CalculatriceService {
	public int add(int a,int b) {
		return a+b;
	}
	public int soustraire(int a,int b) {
		return a-b;
	}
	public int multiplier(int a,int b) {
		return a*b;
	}
	public float divide(int a,int b) {
		System.out.println("la valeur de a sur b est "+(float)a/b);
		return (float) a/b;
	}
	public Integer factorielle(int a) {
			int f = 1;
	        for (int i=1; i<=a; i++)
	        f=f*i;
	        return(f);
	}


}
