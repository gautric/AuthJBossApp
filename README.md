
Auth JBoss Application
======================

PoC about Authentification into JBoss


EXEC
====

CONFIGURATION
-------------

Copy  auth-*.properties into your "standalone/configuration" directory.
Copy/Paste standalone.xml.frag content into your standalone.xml

Deploy
------

Deploy application to JBoss

Test
----

Connect to 
http://localhost:8080/Authentification/

DONE
====

-  SimpleLoginModule

TODO
====

- Mavenization
- LDAP Module
- Public / private navigation
- Yubico authentification

Bibliography 
============

- from a gcornet's work
- from Arjan Tijms work
- https://developer.jboss.org/message/839012 