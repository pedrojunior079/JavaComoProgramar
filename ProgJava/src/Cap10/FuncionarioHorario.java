package Cap10;

//Figura 10.6: FuncionarioHorario.java -->tradução do ingles HourlyEmployee.java
//classe FuncionarioHorario estende Funcionarios.

public class FuncionarioHorario  extends Funcionarios
{
      private double renumeracao;  //salario por horas
      private double horas; //horas trabalhadas durante a semana

      //construtor de cinco argumentos
      public FuncionarioHorario(String primeiroNome, sobreNome, String nss, double horasRenumeradas, double horasTrabalhadas)
      {
            super(primeiroNome, sobreNome, nss);
            setRenumeracao(horasRenumeradas); //valida a renumeração por hora
            setHoras(horasTrabalhadas); //valida as horas trabalhadas
      } //fim do construtor FuncionarioHorario com cinco argumentos

      //configura a renumeração
      public void setRenumeracao(double horasRenumeradas)
      {
            renumeracao = (horasRenumeradas < 0.0 ) ? 0.0 : horasRenumeradas;
      }//fim do método setRenumeracao

      //retorna a renumeração
     public double getRenumeracao()
     {
            return renumeracao;
      }//fim do método getRenumeração

      //configuração de horas trabalhadas
     public void setHoras(double horasTrabalhadas)
      {
            horas = ((horasTrabalhadas >= 0.0) && (horasTrabalhadas <= 168.0))? horasTrabalhadas : 0.0;
      }//fim do método setHoras

      //retorna as horas trabalhadas
      public double getHoras()
      {
            return horas;
      }//fim do método getHoras

      //calcula os rendimentos; sobrescreve o método lucro em Funcionarios
    @Override
    public double lucros()
    {
          if(getHoras() <= 40) //nenhuma hora extra
              return getRenumeracao() * getHoras();
          else
              return 40 * getRenumeracao() + (getHoras() - 40) * getRenumeracao() * 1.5;
    }//fim do método lucro

    //retorna a representação de String do objeto FuncionarioHorario
    @Override
    public String toString()
    {
        return String.format("Funcionario Horario:  %s\n%s:  $%,.2f;  %s:  %,.2f",
                super.toString(),  "salário por hora", getHoras());
    }//fim do método toString
}//fim da classe FuncionarioHorario

