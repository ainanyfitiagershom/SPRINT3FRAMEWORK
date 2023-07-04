package affichage;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyStore.Entry.Attribute;
import java.sql.*;
import java.sql.Date;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import javax.sound.midi.SysexMessage;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import etu1776.model.Client;
import model.*;

public class Affiche {
  public static void main(String[] args) throws Exception {
    // DocumentBuilderFactory factory= DocumentBuilderFactory.newInstance();
    // DocumentBuilder builder=factory.newDocumentBuilder();
    // File xmlFile = new File("filexml.xml");
    // Document document = builder.parse(xmlFile);

    // Element rootElement= document.getDocumentElement();
    // NodeList nodeList=rootElement.getElementsByTagName("object-name");
    // Element element=(Element)nodeList.item(0);
    // System.out.println(element.getTextContent());
    // // Element[] elements=new Element[nodeList.getLength()];
    // // // for(int i=0;i<nodeList.getLength();i++){
    // // // elements[i]=(Element)nodeList.item(i);
    // // // }

    // // for(int i=0;i<elements.length;i++){
    // // elements[i].getElementsByTagName("object-name");
    // //
    // System.out.println(elements[i].getElementsByTagName("object-name").item(0).getAttribute("object-name"));
    // // }

    // // <?xml version="1.0" encoding="UTF-8"?>
    // // <class><!-- racine -->
    // // <!--element ...-->
    // // <object>
    // // <object-name>Mirado</object-name>
    // // <object-num>39</object-num>
    // // </object>
    // // <object>
    // // <object-name>Odarim</object-name>
    // // <object-num>93</object-num>
    // // </object>
    // // </class>

    // AccessAllClassByPackage access=new AccessAllClassByPackage();
    // // access.getAllClassByPackage("model");
    // // access.getAllClassByAnnotation(Model.class, "model");
    // // access.getAllFieldsOfObjectByAnnotation(new DeptDao(),Attribu.class);
    // access.getValueAnnotation(new DeptDao(), Model.class,"value");
    // DeptDao deptdao=new DeptDao();
    // Field[] fields=deptdao.getClass().getDeclaredFields();
    // access.getAllValueAnnotation(fields[0], Attribu.class);

    // //--------
    // Class[] classes=access.getAllClassByAnnotation(Model.class, "model");
    // for(int i=0;i<classes.length;i++){
    // System.out.println(" "+classes[i]);
    // Field[]
    // field=access.getAllFieldsOfObjectByAnnotation(classes[i].newInstance(),
    // Attribu.class);
    // if(field!=null){
    // for(int u=0;u<field.length;u++){
    // System.out.println(" "+field[u].getName());
    // Object[] annotVal=access.getAllValueAnnotation(field[u], Attribu.class);
    // if(annotVal!=null){
    // for(int j=0;j<annotVal.length;j++){
    // System.out.println(" "+annotVal[j]);
    // }
    // }
    // }
    // }
    // }
    // //---------

    // File file=new File("model");
    // System.out.println(file.isFile()+" "+file.getName()+" "+""+"
    // "+file.exists());
    // file=new File("Model.java");
    // System.out.println(file.isFile()+" "+file.getName()+" "+""+"
    // "+file.exists());

    // File fichier = new File("Model.java");
    // if(fichier.isDirectory()) {
    // System.out.println("C'est un répertoire !");
    // } else if (fichier.isFile()) {
    // System.out.println("C'est un fichier !");
    // } else {
    // System.out.println("Le fichier n'existe pas !");
    // }
    // File file=new File("annotation");
    // File[] files=file.listFiles();
    // for(int i=0;i<files.length;i++){
    // if(files[i].isDirectory()){
    // System.out.println(files[i].toPath()+" "+files[i].getAbsolutePath()+"
    // "+files[i].getPath());
    // }
    // }

    AccessAllClassByPackage access = new AccessAllClassByPackage();
    access.path();
    // Class[] classes=access.getAllClassinAllpackageBypackageRacine("model");
    // for(int i=0;i<classes.length;i++){
    // System.out.println(classes[i].getSimpleName());
    // }
    // Vector
    // vcm=access.getClassAndtheMethodinPackagebyAnnotationvalue("etu1776","findall",
    // "url_map");
    // Object[] objcm=null;
    // for(int i=0;i<vcm.size();i++){
    // objcm=(Object[])vcm.elementAt(i);
    // System.out.println(objcm[0].toString()+" | "+objcm[1].toString());
    // }

    // File path=new File("D:\\ITUS4\\mrNaina\\sprint--0");
    // String pth="ll";
    // File file=new File(".");
    // file.getAbsolutePath();
    // System.out.println( file.getAbsolutePath()+" --exist: "+file.exists());
    // System.out.println(path.toPath());
    // System.out.println(path.getCanonicalPath());
    // System.out.println(path.getParent());
    // System.out.println(path.getAbsolutePath());
    // try{
    // // File path=new File(".");
    // // String pth=path.getCanonicalPath();
    // //Class.forName(+"\\etu1776\\model\\Client.class");

    // String path = "D:/ITUS4/mrNaina/sprint--0/etu1776/model";
    // String nomFichier="Client.class";
    // byte[] bytes=Files.readAllBytes(Paths.get(path,nomFichier));
    // ClassLoader classLoader=new ClassLoader() {
    // public Class loadClass(String name)throws ClassNotFoundException{
    // if(name.equals(nomFichier.substring( 0, nomFichier.lastIndexOf('.') ))){
    // return defineClass(name, bytes, 0,bytes.length);
    // }
    // return super.loadClass(name);
    // }
    // };
    // Class<?> c=classLoader.loadClass("Client");
    // //System.out.println(c);
    // }catch(ClassNotFoundException exc){
    // exc.printStackTrace();
    // }catch(Exception ex){
    // ex.printStackTrace();
    // }
    File classFile = new File("D:\\ITU\\L2\\S4\\Sprint\\Sprint_Dossier\\etu1776\\model\\Client.class");
    URL classUrl;
    try {
      classUrl = classFile.getParentFile().toURI().toURL();
    } catch (MalformedURLException e) {
      System.err.println("Erreur lors de la création de l'URL pour le répertoire de la classe.");
      return;
    }
    URLClassLoader classLoader = new URLClassLoader(new URL[] { classUrl });
    Class<?> clientClass;
    try {
      clientClass = classLoader.loadClass("etu1776.model.Client");
    } catch (ClassNotFoundException e) {
      System.err.println("La classe Client n'a pas pu être chargée.");
      return;
    }
    // Maintenant, la variable clientClass est de type Class et représente la classe
    // Client.

  }

}