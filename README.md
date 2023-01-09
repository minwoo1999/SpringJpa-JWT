JWT API Document
 3.0 
[ Base URL: localhost:8080/ ]http://localhost:8080/v2/api-docs
SwaggerConfig
로그인 api
Auth Controller

POST
/api/authenticate
로그인
로그인 api {username},{password}

Parameters
Try it out
Name	Description
loginDto *
(body)	
loginDto
Example Value
Model
{
  "password": "string",
  "username": "string"
}
Parameter content type

application/json
Responses
Response content type

*/*
Code	Description
200	
OK
Example Value
Model
{
  "token": "string"
}
201	
Created
401	
Unauthorized
403	
Forbidden
404	
Not Found
POST
/api/signup
회원가입
로그인 api {username},{password},{nickname}

Parameters
Try it out
Name	Description
userDto *
(body)	
userDto
Example Value
Model
{
  "nickname": "string",
  "password": "string",
  "username": "string"
}
Parameter content type

application/json
Responses
Response content type

*/*
Code	Description
200	
OK
Example Value
Model
{
  "authorities": [
    {
      "authorityName": "string"
    }
  ],
  "nickname": "string",
  "username": "string"
}
201	
Created
401	
Unauthorized
403	
Forbidden
404	
Not Found
GET
/api/user
권한확인(user,admin)
Parameters
Try it out
No parameters

Responses
Response content type

*/*
Code	Description
200	
OK
Example Value
Model
{
  "authorities": [
    {
      "authorityName": "string"
    }
  ],
  "nickname": "string",
  "username": "string"
}
401	
Unauthorized
403	
Forbidden
404	
Not Found
GET
/api/user/{username}
권한확인(admin)
Parameters
Try it out
Name	Description
username *
string
(path)	
username
Responses
Response content type

*/*
Code	Description
200	
OK
Example Value
Model
{
  "authorities": [
    {
      "authorityName": "string"
    }
  ],
  "nickname": "string",
  "username": "string"
}
401	
Unauthorized
403	
Forbidden
404	
Not Found

