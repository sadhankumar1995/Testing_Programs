package A14_xpathAndCss;

public class CssSelector {

	
	// Css Selector
	//id-#
	//classname= .
	//id syntax= #id
	//classname= .classnamevalue
	
	//xpath syntax  == //tagname[@attribute="attribute value"]
	//Css syntax ==      tagname[attribute="attribute value"]
	//**********************************
	//contains , Starts with,  ends with
	
	//constains= *
	// starts-with=^
	// ends-with = $
	
	// contains syntax=  tagname[attribute*,'attribute value']
	
	// starts-with syntax= tagname[attribute^,"attribute value"]
	
	//ends with syntax= tagname[attribute$,"attribute value"]
	
	//****************************************************
	//And or Or operator 
	
	//And syntax= tagname[attribute1="attribute value1"][attribute2="attribute value1"]
	
	// Or operator syntax=tagname[attribute1="attribute value1"],[attribute2="attribute value1"]
	
	//**********************************************
	//xpath = /
	//css =  >
	
	// types = first-of-type, last of type, nth-child
	
	//xpath//tagname[@attribute="attribute value"]/following::tagname
	
	//        tagname[attribute="attribute value"]>tagname:first-of-type
	
	//        tagname[attribute="attribute value"]>tagname:last-of-type
	
	//        tagname[attribute="attribute value"]>tagname:nth-child(1)
	
	}
