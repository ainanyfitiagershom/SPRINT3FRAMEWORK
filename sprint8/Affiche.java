package affichage;


import java.io.File;
import java.io.IOException;
import javax.sound.midi.SysexMessage;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import org.w3c.dom.N 
  lic class Affiche {  public static void main(String[] args) throws Exception {
    DocumentBuilderFactory factory  = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder   = factory.newDocumentBuilder();
    File xmlFile = new File("D:\\ITU\\L2\\S4\\Sprint\\Sprint_Dossier\\web.xml");
    Document document = builder.parse(xmlFile);

    Element rootElement  = document.getDocumentElement();
    NodeList nodeList   = rootElement.getElementsByTagName("path-after-WEB-INF");
    Element element   = (Elemen t) nodeList.item(0);  // de le 1er satria iray ihany ny path-after-WEB-INF
    String path   = element.getTextContent();
    System.out.println(path);
    nodeList   = rootElement.getElementsByTagName("package-root");
    element   = (Elemen t) nodeList.item(
    String pkgroot   = element.getTextContent();
    System.out.println(pkgroot);
  

  

