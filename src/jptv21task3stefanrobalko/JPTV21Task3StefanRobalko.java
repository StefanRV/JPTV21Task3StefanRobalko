/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21task3stefanrobalko;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JPTV21Task3StefanRobalko {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("введите имя, фамилию, личный код");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        String id = scanner.nextLine();
        String gencen = (id.substring(0,1));
        String year = (id.substring(1, 3));
        String month = (id.substring(3,5));
        String date = (id.substring(5, 7));
        
        if(gencen.contains("3") || gencen.contains("4")){
            System.out.print(name + " " + surname + " родился " + date + "." + month + "." + "19" +year);
        
        }
        else if(gencen.contains("5") || gencen.contains("6")){
            System.out.print(name + " " + surname + " родился " + date + "." + month + "." + "20" +year);
        }
    }
    
}
