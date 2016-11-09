package com.brainacad.module2.lesson6;

/*
Create a jar file “testapp.jar” for the project using jar utility
Open “testapp.jar” with WinRar or WinZip and edit "META-INF\MANIFEST.MF“ , add your application entry point (class with “main” method).
Example:
1.	Manifest-Version: 1.0
2.	Created-By: 1.7.0_06 (Oracle Corporation)
3.	Main-Class: example. Main

Run the “testapp.jar” application in command line:
java -jar testapp.jar

G:\Personal\idea_projects\brainacad\brainacad-core\target\classes>"C:\Program Files\Java\jdk1.8.0_77\bin\jar" cvmf ../../src/main/resources/META-INF/MANIFEST.MF ../../
libs/testapp.jar example/*
added manifest
adding: example/applepack/(in = 0) (out= 0)(stored 0%)
adding: example/applepack/Apple.class(in = 481) (out= 294)(deflated 38%)
adding: example/testpack/(in = 0) (out= 0)(stored 0%)
adding: example/testpack/Main.class(in = 796) (out= 488)(deflated 38%)


"C:\Program Files\Java\jre1.8.0_112\bin\java" -classpath .;G:\Personal\idea_projects\brainacad\brainacad-core\libs\testcar.jar -jar G:\Personal\idea_projects\brainacad\brainacad-core\libs\testapp.jar

"C:\Program Files\Java\jdk1.8.0_77\bin\java" -classpath "C:\Program Files\Java\jdk1.8.0_77\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\rt.jar;G:\Personal\idea_projects\brainacad\brainacad-core\target\classes;C:\Users\Alex\.m2\repository\org\apache\commons\commons-math3\3.6.1\commons-math3-3.6.1.jar;G:\Personal\idea_projects\brainacad\brainacad-core\libs\testcar.jar" -jar G:\Personal\idea_projects\brainacad\brainacad-core\libs\testapp.jar

"C:\Program Files\Java\jdk1.8.0_77\bin\java" -classpath "C:\Program Files\Java\jdk1.8.0_77\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\rt.jar;G:\Personal\idea_projects\brainacad\brainacad-core\target\classes;C:\Users\Alex\.m2\repository\org\apache\commons\commons-math3\3.6.1\commons-math3-3.6.1.jar;G:\Personal\idea_projects\brainacad\brainacad-core\libs\testcar.jar" example.testpack.Main

 */
public class Lab3 {
}
