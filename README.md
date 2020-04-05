# SpringBootJWT
This repository is mainly built to understand spring with JWT in an effective msnner.


Introduction:

https://jwt.io


# What is JSON Web Token (JWT)

A JSON Web Token (JWT) is an open standard (RFC 7519) that defines a compact and self-contained way for securely transmitting information between parties as a JSON object. 
This information can be verified and trusted because it is digitally signed. 
JWTs can be signed using a secret or a public/private key pair.

A JSON web token(JWT) is JSON Object which is used to securely transfer information over the web(between two parties). 
It can be used for an authentication system and can also be used for information exchange.

# What is JWT Structure

JSON Web Tokens consist of three parts separated by dots (.), which are:

1. Header
2. Payload
3. Signature

Therefore, a JWT typically looks like the following.

xxxxx.yyyyy.zzzzz


# When to use JWT

Authentication:

This is the most common scenario for using JWT. 
Once the user is logged in, each subsequent request will include the JWT, allowing the user to access routes, services, and resources that are permitted with that token. 
Single Sign On is a feature that widely uses JWT nowadays, because of its small overhead and its ability to be easily used across different domains.

Info Exchange:

JSON Web Tokens are a good way of securely transmitting information between parties. Because JWTs can be signed—for example, using public/private key pairs—you can be sure the senders are who they say they are. 
Additionally, as the signature is calculated using the header and the payload, you can also verify that the content hasn't been tampered with.


# JWT Authentication flow is simple

1. User obtains Refresh and Access tokens by providing credentials to the Authorization server
2. User sends Access token with each request to access protected API resource.
3. Access token is signed and contains user identity (e.g. user id) and authorization claims.

It's important to note that authorization claims will be included with the Access token. 
Why is this important? Well, let's say that authorization claims (e.g user privileges in the database) are changed during the life time of Access token. 
Those changes will not become effective until new Access token is issued. 
In most cases this is not big issue, because Access tokens are short-lived.
