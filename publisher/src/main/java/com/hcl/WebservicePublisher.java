package com.hcl;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


@WebService
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT,
use=SOAPBinding.Use.LITERAL,
parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)
public class WebservicePublisher {
	
public WS_Response mcdLogicalMethod(@WebParam VendorEnrollment mVendorEnrollment){
	
	WS_Response lWs_Response = new WS_Response();
	lWs_Response.setStatus("Success");
	lWs_Response.setStatusCode("000");
	lWs_Response.setStatusDescription("Success Description");
	lWs_Response.setDetails("Extra Details");
	
	return lWs_Response;
	
}


}
