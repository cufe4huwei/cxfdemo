package learning.demo.cxf;

import javax.jws.WebService;

@WebService(name = "Hello", targetNamespace = "http://cxf.demo.learning/")
public interface Hello {
	public String sayHi(String name);
}