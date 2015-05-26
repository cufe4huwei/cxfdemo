package learning.demo.cxf;

import javax.jws.WebService;

@WebService(targetNamespace = "http://cxf.demo.learning/", endpointInterface = "learning.demo.cxf.Hello", portName = "HelloImplPort", serviceName = "HelloImplService")
public class HelloImpl implements Hello {

	@Override
	public String sayHi(String name) {
		// TODO Auto-generated method stub
		return "Hello " + name;
	}

}
