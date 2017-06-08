package jp.cp.tmd.presentaion;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class SampleBackingBean implements Serializable {
	private String message1 = "Hello World!";

	public String getMessage1() {
		return message1;
	}

	public void setMessage1(String message1) {
		this.message1 = message1;
	}

}
