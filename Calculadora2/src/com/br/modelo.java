/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br;
/**
 *
 * @author aluno
 */
public class modelo {
        private double ans;
        private int calculos;

    public void setCalculos(int calculos) {
        this.calculos = calculos;
    }
        
        
        
        

        public double resolver(double num, String tela){
            double fat = 0;
            switch(calculos){
     
            case 1://adição
            ans = num + Double.parseDouble(tela);
            
             break;
            case 2://subtração
            ans = num - Double.parseDouble(tela);
           
            break;
            case 3://multiplicação
            ans = num * Double.parseDouble(tela);
            
             break;
            case 4://divisão
                if(Double.parseDouble(tela)==0 ||num==0){
                    System.out.print("Operação invalida");
                }else{
                    ans = num / Double.parseDouble(tela);
                }
            
           
         break;
            case 5://Elevado ao quadrado
            ans = Math.pow(num,Double.parseDouble(tela));
          
         break;
            case 6://raiz quadrada
           if(num<0){
               System.out.print("raiz invalida!");
               
           } else{
               ans = Math.sqrt(num);
           }    
            
         break;
            case 7://Fatorial
            fat = num;
            while(fat>1){
                num = num * (fat-1);
                fat--;
            }
            ans = num;
            
            break; 
     }
     return ans;
}

}
