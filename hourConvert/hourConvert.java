public class hourConvert{
    public static void main(String[] args) {
        
     String horario = "11:10";
     int minutosAcrescimo = 20;
     
      String arrayHora[] = new String[2];
      arrayHora = horario.split(":");
      
      int hora = Integer.parseInt(arrayHora[0]);
      int minutos = Integer.parseInt(arrayHora[1]);
      
      int sumMinutos = minutos + minutosAcrescimo;
      
      int contaHoras = sumMinutos/60;
      hora = hora + contaHoras;
        
      int contaMinutos = 0;
      minutos = minutos + minutosAcrescimo;
      
      if(hora > 24){
          hora = hora - 24;
        }
        
      if(minutos > 60){
          minutos = (minutos%60);
        }
        
      Integer.toString(hora);
      Integer.toString(minutos);
      
      String result = hora + ":" + minutos;
      

      System.out.println(hora);
      System.out.println(minutos);
      System.out.println(result);

        
    }
    
}
