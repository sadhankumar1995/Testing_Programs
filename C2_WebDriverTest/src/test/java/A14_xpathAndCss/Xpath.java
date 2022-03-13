package A14_xpathAndCss;

public class Xpath {
	
	// absolute path   /html/body/div[2]/div/div[3]/div[2]/form/input[1]
	// relative path   //*[@id="sb_form_q"]
	
	// Syntax:
	//   //tagname[@attribute="attribute value"]
	// if tagname is changing frequently then we can go for *
	//    //*[@attribute='attribute value']
	
	//********************************************************
	//  //input[@aria-autocomplete='both']
	//  //input[@id="sb_form_q"]
	
	//*****************************************************
	//contains , Starts with,  ends with
	 
	//contains:
	//Syntax: //tagname[contains(@attribute,'attribute value']
	//        //input[contains(@id,'sb_form_q')] = true
	//        //input[contains(@id,'_form_q')]  = true
	//        //input[contains(@id,'_q')] = true
	
	//Starts with
	//syntax: //tagname[starts-with(@attribute,"attribute value"]
	
	//       //input[starts-with(@aria-label,"Enter your search term")] = true
	
	//      //input[starts-with(@aria-label,"Enter your search")]  = true
	//      //input[starts-with(@aria-label,"Enter your")] = true
	//      //input[starts-with(@aria-label,"your search term")] = false
	
	// Ends With
	//syntax: //tagname[ends-with(@attribute,"attribute value"]
	//        //input[ends-with(@aria-label,"Enter your search term")]= true
	//        //input[ends-with(@aria-label,"Enter your search")] = false
	
	//**********************************************
	 //text()
	
	//syntax: //tagname[text()="visible text"]
	
	//        //span[text()="Languages:"]
	
	//         //tagname[contains(text(),'attribute value')]
	//          //span[contains(text(),"Languages:")]
	
	//         //tagname[starts-with(text(),"attribute value"]
	//         //span[starts-with(text(),"Languages:")]
	
	//         //tagname[ends-with(text(),"attribute value"]
	//         //span[ends-with(text(),"Languages:")]
	
	//***********************************************************************
	//And operator,  OR operator 
	
	//AND operator
	//Syntax    //tagname[@attribute1="attribute value1" and @attribute2="attribute value1"]
	//          //input[@id="sb_form_q" and @class="sb_form_q"]
	
	// OR operator
	
	//Syntax    //tagname[@attribute1="attribute value1" or @attribute2="attribute value1"]
		//     //input[@id="sb_form_q" or @class="sb_form_q"]
	
	
	//**********************************************************
	// Following
	
	//syntax:   //tagname[@attribute="attribute value"]/following::tagname
	
	//         //span[text()="Languages:"]/following::a
	
	//         //tagname[@attribute="attribute value"]/following::tagname[index]
	//        //span[text()="Languages:"]/following::a[4]
	
	//Preceding
	//syntax:   //tagname[@attribute="attribute value"]/preceding::tagname
	
	           //span[text()="Languages:"]/preceding::a
	
	
	//******************************************************************
	// ancestor(grandfather)
	
	// syntax :  //taganem[@attribute="attribute value"]/ancestor::tagname
	
	//          //span[text()="Languages:"]/ancestor::div = topmost parent 
	//            //span[text()="Languages:"]/ancestor::div[1] = nearest parent
	
	// child
	// syntax:   // tagname[@attribute="attribute value"]/child::li
				//ul[@class="overflow_menu"]/child::li
	
	
	//         //ul[@class="overflow_menu"]/child::li[2]
	
	}

