public class aula08 {

    public static void main (String args[]){

        double raizDe2 = Math.sqrt(2.0);
        System.out.println(raizDe2);

        double tresAoQuadrado = Math.pow(2.0,2.0);
        System.out.println(tresAoQuadrado);

        double pi = Math.PI;
        System.out.println(pi);

        pi = matematica.PI;
        System.out.println(pi);
        System.out.println(matematica.pow(3.0, 2.0));

        //--Parte 2
        //-------------------------------

        engenheiro engMecanico =
                new engenheiro(engenheiros.Mecanico);
        engenheiro engEletricista =
                new engenheiro(engenheiros.Eletricista);
        engenheiro engDados =
                new engenheiro(engenheiros.Dados);
        engenheiro engCivil =
                new engenheiro(engenheiros.Civil);

        engMecanico.MostrarEspecialidade();
        engEletricista.MostrarEspecialidade();
        engDados.MostrarEspecialidade();
        engCivil.MostrarEspecialidade();

        programador progBackEnd =
                new backEnd();
        programador progFrontEnd =
                new frontEnd();

        profissional p1 = profissional.CriaProfissional(listaDeProfissionais.ProgramadorFrontEnd);
        profissional p2 = profissional.CriaProfissional(listaDeProfissionais.ProgramadorBackEnd);
        profissional p3 = profissional.CriaProfissional(listaDeProfissionais.EngenheiroMecanico);
        profissional p4 = profissional.CriaProfissional(listaDeProfissionais.EngenheiroCivil);
        profissional p5 = profissional.CriaProfissional(listaDeProfissionais.EngenheiroDeDados);
        profissional p6 = profissional.CriaProfissional(listaDeProfissionais.EngenheiroEletricista);

        p1.fazServico();
        p1.getSalario();
        p1.tipoDeContrato();

        // p2.getEspecialidade();
    }

}
