# -SpringBootProject-SmsSendConfigurationUsingTwilioAccount

Project Descriptions :
		       This project is Spring Boot Project. In this Project I have used Twilio Class for Message send Configeration. In this project externally Twilio dependency is used.
		       In this project there is Only One Table used i.e. SmsRequest table. 
		       In this project all the exceptions are called by coustomerValidationCheckingException And UserException classes.
		       In this project I have use MySQL Woekbench for Data Base and Testing purpose uses Postman Applications. 

	APIs used :- 
		1. @RequestMapping(value = "/api/sms/send")
		2. @RequestMapping(method = RequestMethod.POST) : By this API calls Message will be sent to the specified Phone number and also store this specified Phone number into the SmsRequest table.
								  If the given specified Phone number will be wrong then it will given error Message to the Postman and also the console.  
								  If the given specified Phone number will be Null then it will throws an Exception and it also called by the Exception Class.
					
		** Note : If The given HttpRequestMethod will wrong as Input then it will throws HttpRequestMethodNotSupportedException by called Exception Class.
