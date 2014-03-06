testngSystemVars
================

Test of passing TestNG System variables.

Run as  ```mvn test```  OR  ```mvn surefire:test```  and pass these JVM args:

```-Dtestng.build-name=INT -Dtestng.testenv=Integration -Dtestng.groups=smoke -Dtestng.config-file=Smoke.xml```
