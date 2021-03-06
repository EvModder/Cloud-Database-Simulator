//NOTICE!!
//This entire class was taken in near line-to-line from the source below!
//This is NOT my own work!
//Source: https://www.mkyong.com/regular-expressions/how-to-validate-ip-address-with-regular-expression/

import java.util.regex.Pattern;

public class IPAddressValidator{
	private Pattern pattern;
	private static final String IPADDRESS_PATTERN =
		"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

	public IPAddressValidator(){
		pattern = Pattern.compile(IPADDRESS_PATTERN);
	}

	/**
	* Validate ip address with regular expression
	* @param ip ip address for validation
	* @return true valid ip address, false invalid ip address
	*/
	public boolean validate(final String ip){
		return pattern.matcher(ip).matches();
	}
}