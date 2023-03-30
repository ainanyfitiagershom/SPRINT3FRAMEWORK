package etu1776.framework.modele;
import annotation.*;
import java.lang.annotation.*;
import java.time.LocalDateTime;
import etu1776.framework.ModeleView;
@model(table="departement")
public class Dept{
    int id;
    String libele;
    
    public Dept() {}
    public Dept(int id, String libele) {
        this.id = id;
        this.libele = libele;
    }
    public int getId() { return id; }
    public String getLibele() { return libele; }
    public void setLibele(String libele) { this.libele = libele; }
    public void setId(int id) { this.id = id;}
   
      @Methods("listDept") 
    public ModeleView  get_Deptlist(){
        System.out.println("Departement 1");
        System.out.println("Departement 2");
        ModeleView mv= new ModeleView();
        mv.setView("listdept.jsp");
        return mv;

    }


}