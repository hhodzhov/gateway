# Fixer IO Integration

Fixer is a simple and leightweight API for current and historical currency rates. You can learn more at: https://fixer.io/

This application is integrated with Fixer. From given period of time it gets the refreshed information from the fixer and stores it and then it provides two external services
to retrieve the information.

The first service works with Content-type application/json and has the following two endpoints:

1 - /json_api/current which accepts POST request with body 

{

"requestId": "b89577fe-8c37-4962-8af3-7cb89a245160",

"timestamp": 1586335186721, // UTC

"client": "1234",

“currency”:”EUR”

}

It returns the last information which is get from fixer.


2 - /json_api/history - which accepts POST request with body 

{

"requestId": "b89577fe-8c37-4962-8af3-7cb89a24q909",

"timestamp": 1586335186721,

"client": "1234",

“currency”:”EUR”,

"period": 24

}

It returns the information from fixer from given period of time in hours.

The second service works with Content-type application/xml and has the following endpoint

/xml_api/command which accepts POST request with body: 

<ApiPayload>  
    
    <requestId>b89577fe-8c37-4962-8af3-7cb89a245187</requestId>
    <timestamp>1604951755</timestamp>
    <client>1234</client>
    <currency>EUR</currency>
    <period>1</period>
    
</ApiPayload>  

which again returns the information from fixer from given period of time in hours, but in xml format.
