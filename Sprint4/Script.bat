javac -d framework/src framework/src/*.java

jar cf FrameworkTest/lib/etu1776.jar Framework/bin


cp FrameworkTest/WEB-INF/lib/etu1776.jar FrameworkTest/WEB-INF/classes/lib

war cvf FrameworkTest/WEB-INF/lib/etu1776.war -C FrameworkTest .  

timeout 60                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          

