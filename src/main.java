public class main {
    public static void main(String[] args) {
        Empregado[] empregados = new Empregado[4];
        empregados[0]= new EmpregadoComissionado(123,"rodrigo",10,10);
        empregados[1]= new EmpregadoComissionado(456,"fernando",12,10);
        empregados[2]= new EmpregadoHorista(456,"pedro",6,150);
        empregados[3]= new EmpregadoHorista(456,"kaike",8,100);
        for (Empregado i: empregados){
            System.out.println("MATRÍCULA: "+i.matricula+" NOME: "+i.nome+" SALÁRIO: "+i.calcularSalario());
        }
    }


}
