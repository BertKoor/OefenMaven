## OefenMaven

Dit is een klein Java project. maar het mist nog een pom.xml. Die zul je zelf helemaal moeten maken.

Aanwijzingen:

 * Er is een dependency met `commons-lang3.jar` uit groep `org.apache.commons`.
   Kijk op http://repo2.maven.org/maven2/org/apache/commons/commons-lang3/ welke versies hiervan zijn.
 * Er is ook een dependency met JUnit die de unit tests voor ons uitvoert. 
   Je kunt beginnen met het dependency-blok te kopieren uit het MyFirstPony project, 
   echter hier hebben we de annotation-driven implementatie nodig die sinds JUnit versie 4 bestaat.

Variaties:
 * Probeer eerst een zo klein mogelijke pom te maken
 * Probeer ook eens een zo groot mogelijke pom te maken. 
   Google naar `maven pom reference`  voor inspiratie.
 * In de unit test file `/src/test/java/nl.ordina/HelloMavenTest.java` staan een aantal unit tests nog op commentaar.
    Activeer ze, en de build zal falen. Dus probeer je build maar weer te repareren...
 * Probeer de jar self-executing te maken door met de maven-jar-plugin de main class in het manifest te vermelden.
 * Als je de jar probeert uit te voeren, zal je merken dat de dependency naar de `commons-lang.jar` niet in onze jar is ingepakt.
   Probeer de jar **with dependencies** te laten bouwen door de `maven-assembly-plugin`.
 
