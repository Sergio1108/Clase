
package blackfriday;

import java.util.Scanner;

public class BlackFRIDAY {

      
      
       
    public static void main(String[] args) {
        int opcion;
        String[][] productos = new String [10][3];
        Scanner captura = new Scanner(System.in);
      
      //llenamos el string
      
      for(int i = 0;i<3;i++){
          productos [i][0]= String.valueOf(i);
          System.out.println("Introduce el nombre del producto");
          productos[i][1]=captura.nextLine();
          System.out.println("Introduce el precio");
          productos[i][2]=captura.nextLine();
      }
      
      // preguntamos si es normal, pre-blackfriday o blackfriday
      
      do{
      
      System.out.println("Presione 1 para día normal");
      System.out.println("Presione 2 para pre-blackfriday");
      System.out.println("Presione 3 para blackfriday");
      
      opcion = captura.nextInt();
      
      switch(opcion){
          
          case 1:{
              for(int i=0; i<3;i++){
              System.out.println("ID: "+ productos[i][0]);
              System.out.println("Nombre: "+ productos[i][1]);
              System.out.println("Precio: "+ productos[i][2]);
          }
              break;
          }
          
          case 2:{
               for(int i=0; i<3;i++){
              System.out.println("ID: "+ productos[i][0]);
              System.out.println("Nombre: "+ productos[i][1]);
              System.out.println("Precio: "+ Double.parseDouble(productos[i][2])*1.3);
          }
              break;
          }
          case 3:{
               for(int i=0; i<3;i++){
              System.out.println("ID: "+ productos[i][0]);
              System.out.println("Nombre: "+ productos[i][1]);
              System.out.println("Precio: "+ Double.parseDouble(productos[i][2])*0.78);
          }
               break;
          }

      }
      }while(opcion!=3);
      
         
         
         
         
         
         
         
    }
    
}
