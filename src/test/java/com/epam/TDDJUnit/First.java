package com.epam.TDDJUnit;

public class First
{
	public String first(String string)  {
	    int strLen = string.length();
	    char first = string.charAt(0);
	    char second = string.charAt(1);
	    String remchars = string.substring(2, strLen);
	    if(first=='A' && second=='A') {
	      return remchars;
	      }
	    if(first=='A' && second!='A') {
	      return second + remchars;
	      }
	    if(first!='A' && second=='A') {
	      return first + remchars;
	      }
	    if(first!='A' && second!='A') {
	      return string;
	      }
		return string;
	  }
}
