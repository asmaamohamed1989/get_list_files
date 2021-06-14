/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package get_list_files;

/**
 *
 * @author Muslim
 */
import java.io.File;
public class Get_list_files {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("H:\\ITI\\Java & UML programming\\Assignments\\session 3 material(java file handling)\\");
        String [] fileList = file.list();
        System.out.println("list of file");
        for(String name :fileList){
            System.out.println(name);
                }
        System.out.println("list of file");
            
    }
    
}
